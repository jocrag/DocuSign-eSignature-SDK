using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using Signing;

namespace LoanCo
{
    public partial class FormHandler : BasePage
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Request.RequestType == "POST")
            {
                // these assignments are just to keep the compiler happy. these vars will be reassigned
                // in the Switch block below depending on which form we are processing.
                Signing.DocuSignWeb.Recipient signer = new Signing.DocuSignWeb.Recipient();
                Signing.LinkedDocument doc = new LinkedDocument() ;
                Signing.LinkedTab[] tabs = new LinkedTab[0];

                AccountCredentials creds = base.GetAPICredentials();
                bool useEmbeddedSigning =  Session["SigningLocation"].ToString()=="Embedded"?true:false;
                switch (Request.Form["formid"])
                {
                    case "form1":
                        // form1 is posted by index.aspx, and demonstrates a basic envelope send 
                        base.RequireOrDie(new string[] { "FirstName", "LastName", "Address1", "City", "State", "Zip", "Phone", "Email" });

                        signer = ApiHelper.MakeRecipient(Request.Form["Email"],  Request.Form["FirstName"], Request.Form["LastName"], useEmbeddedSigning, Session.SessionID);

                        tabs = new LinkedTab[]
                        {   
                            LinkedTab.CreateTab(signer, "E-mail", Request.Form["Email"], 1, 190, 186, true, true),
                            LinkedTab.CreateTab(signer, "Phone", Request.Form["Phone"], 1, 190, 173, true, true),
                            LinkedTab.CreateTab(signer, "AddressLine1", Request.Form["address1"], 1, 190, 134, true, true),
                            LinkedTab.CreateTab(signer, "AddressLine2", String.IsNullOrEmpty(Request.Form["address2"]) ? " " : Request.Form["address2"], 1, 190, 147, false, true),
                            LinkedTab.CreateTab(signer, "City", Request.Form["City"], 1, 190, 160, true, true),
                            LinkedTab.CreateTab(signer, "State", Request.Form["State"], 1, 255, 160, true, true),
                            LinkedTab.CreateTab(signer, "Zip", Request.Form["Zip"], 1, 342, 160, true, true),
                            LinkedTab.CreateTab(Signing.DocuSignWeb.TabTypeCode.FullName, signer, 1, 190, 118),
                            LinkedTab.CreateTab(Signing.DocuSignWeb.TabTypeCode.SignHere, signer, 1, 373, 185),
                            LinkedTab.CreateTab(Signing.DocuSignWeb.TabTypeCode.DateSigned, signer, 2, 190, 532 ),
                            LinkedTab.CreateTab(Signing.DocuSignWeb.TabTypeCode.InitialHereOptional, signer, 2, 190, 465)
                        };
                        
                        doc = ApiHelper.MakeDocument("Sample Doc", Server.MapPath("pdfs/SampleDoc.pdf"));
                        
                        doc.Tabs = tabs;

                        break;
                    case "form2" :
                        // form2 is posted by index-1, and it demonstrates using anchor tabs instead of fixed tabs.
                        base.RequireOrDie(new string[] { "FirstName", "LastName", "Phone", "Email" });

                        signer = ApiHelper.MakeRecipient(Request.Form["Email"], Request.Form["FirstName"], Request.Form["LastName"], useEmbeddedSigning, Session.SessionID);
    
                        // NOTE: for a complicated solution please pick hidden text that is not likely to 
                        // appear anywhere in the text.  We have picked E-mail: and Name: here because
                        // the solution is very small.  In a complex form a simple anchor tag might result
                        // in unintentional tabs being placed.
                        tabs = new LinkedTab[]
                            {   LinkedTab.CreateTab(signer, "E-mail", Request.Form["Email"], "E-mail:", 200, -2),
                                LinkedTab.CreateTab(signer, "Phone", Request.Form["Phone"], "Phone:", 200, -2),
                                LinkedTab.CreateTab(Signing.DocuSignWeb.TabTypeCode.FullName, signer, "Name:", 200, -2),
                                LinkedTab.CreateTab(signer, "Amount:", Request.Form["Amount"], "Amount:", 200, -2),
                                LinkedTab.CreateTab(Signing.DocuSignWeb.TabTypeCode.SignHere, signer, "X:", 30, 8)
                            };

                        doc = ApiHelper.MakeDocument("Sample Doc", Server.MapPath("pdfs/Loan 1.pdf"));
                        
                        doc.Tabs = tabs;

                        break;
                    default:
                        base.GoToErrorPage("Don't know how to handle that form");
                        break;
                }

                // Common to both forms
                // add security checks per the session options
                if (Session["Authentication"].ToString() == "IDLookup")
                {
                    signer = ApiHelper.AddIDLookupToRecipient(signer,
                        Request["Address1"] == null ? "" : Request["Address1"],
                        Request["Address2"] == null ? "" : Request["Address2"],
                        Request["City"] == null ? "" : Request["City"],
                        Request["State"] == null ? "" : Request["State"],
                        Request["Zip"] == null ? "" : Request["Zip"]);
                }
                else if (Session["Authentication"].ToString() == "Phone")
                {
                    signer = ApiHelper.AddPhoneAuthToRecipient(signer, Request["Phone"]);
                }
                if (Session["AccessCode"] != null && Session["AccessCode"].ToString().Length > 0)
                {
                    signer.AccessCode = Session["AccessCode"].ToString();
                }

                // add our signer to an array
                Signing.DocuSignWeb.Recipient[] signers = new Signing.DocuSignWeb.Recipient[]{signer};
                // add our doc to an array
                Signing.LinkedDocument[] docs = new LinkedDocument[]{doc};
                // now send the envelope
                Envelope envelope = null;
                try
                {
                    envelope = Envelope.CreateAndSendEnvelope(creds, signers, docs, "DocuSign LoanCo Sample Docs", "Hello!  This was submitted from a sample application");
                }
                catch (Exception excp)
                {
                    base.GoToErrorPage(excp.Message);
                }
                // Now that the envelope has been sent, we want to open it up so the applicant can sign it. 
                // We will get something called a RecipientToken, which is an URL that will open the envelope up for the specified recipient

                // here we are using the Ticks from the clock as our assertion ID. Of course, you wouldn't do this in real code, you 
                // would use an identifier that made sense, like the applicants ID from their database record. 
                // This value is informational for you - it allows you to use your own id to refer to the recipient.
                Signing.DocuSignWeb.RequestRecipientTokenAuthenticationAssertion assert = ApiHelper.MakeRecipientTokenAuthAssert(System.DateTime.Now.Ticks.ToString());
                // Now we need to setup a page that will be loaded when the signing is concluded. 
                // when the signer is done signing (or cancels) DocuSign will redirect the browser to this URL. 
                // Since we are hosting the signing in an iframe, we will have docusign redirect the frame to a frame-pop html page
                // which will then redirect to the final handler (SigningReturn.aspx)
                // first, get the absolute URL of our frame-pop page
                string retUrl = Request.Url.AbsoluteUri.Replace("FormHandler.aspx", "pop.html");
                // then create a URI from the URL
                Uri retUri = new Uri(retUrl,UriKind.Absolute);
                // the build the set of redirect URLS. There is a set because you could specify a different redirect target for each
                // status event - signing completed, cancelled, error, etc. We just use one page with different Querystring params to 
                // indicate the event.
                Signing.DocuSignWeb.RequestRecipientTokenClientURLs clientURLs = Envelope.StandardUrls(retUri, signers[0].CaptiveInfo.ClientUserId);
                // finally, pass all this into docusign and get the token back in return.
                string token = null;
                try {
                    token = envelope.RequestRecipientToken( signer, assert, clientURLs);
                }
                catch (Exception excp)
                {
                    base.GoToErrorPage(excp.Message);
                }
                // now we store the envelope & token in session and redirect to the signing host page
                Session["EmbeddedToken"] = token;
                Session["Envelope"] = envelope;
                Response.Redirect("EmbeddedHost.aspx", true);

            }
        }
    }
}
