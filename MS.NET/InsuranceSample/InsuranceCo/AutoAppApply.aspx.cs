using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace InsuranceCo
{
    public partial class AutoAppApply : BasePage
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!Page.IsPostBack)
            {

            }
        }

        protected void submit_Click(object sender, EventArgs e)
        {
            if (validateForm())
            {
                SendEnvelope();
            }
        }


        protected void embeddedSigning_CheckedChanged(object sender, EventArgs e)
        {
            if (embeddedSigning.Checked)
            {
                embeddedSending.Checked = false;
            }
        }
        protected void embeddedSending_CheckedChanged(object sender, EventArgs e)
        {
            if (embeddedSending.Checked)
            {
                embeddedSigning.Checked = false;
            }
        }

        protected void AuthenticationMethod_Phone_CheckedChanged(object sender, EventArgs e)
        {
            if (AuthenticationMethod_Phone.Checked)
            {
                authPhoneNumberContainer.Visible = true;
            }

        }

        protected void AuthenticationMethod_IDLookup_CheckedChanged(object sender, EventArgs e)
        {
            if (AuthenticationMethod_IDLookup.Checked)
            {
                authPhoneNumberContainer.Visible = false;
            }

        }

        protected void AuthenticationMethod_None_CheckedChanged(object sender, EventArgs e)
        {
            if (AuthenticationMethod_None.Checked)
            {
                authPhoneNumberContainer.Visible = false;
            }

        }
        public bool validateForm()
        {
            bool missingField = false;
            if (firstName.Text.Length == 0)
            {
                lblFirstNameError.Visible = true;
                missingField = true;
            }
            if (lastName.Text.Length == 0)
            {
                lblLastNameRequired.Visible = true;
                missingField = true;
            }
            if (carMake.Text.Length == 0)
            {
                lblCarMakeRequired.Visible = true;
                missingField = true;
            }
            if (carModel.Text.Length == 0)
            {
                lblCarModelRequired.Visible = true;
                missingField = true;
            }
            if (carVIN.Text.Length == 0)
            {
                lblCarVINRequired.Visible = true;
                missingField = true;
            }
            if (emailDestination.Text.Length == 0)
            {
                lblEmailDestinationRequired.Visible = true;
                missingField = true;
            }
            if (AuthenticationMethod_Phone.Checked && authPhoneNumber.Text.Length == 0)
            {
                lblAuthPhoneNumberRequired.Visible = true;
                missingField = true;
            }
            return !missingField;
        }

        public void SendEnvelope()
        {
            // ok, long method!
            // we need to build a Template that will be sent to docusign to create an envelope. A template is like a generic form
            // it has Roles (like Signer, Co-Signer, CC Recipient, etc) and form fields and documents predefined. 
            // when we use a template we provide real recipients who will take on the Roles in the template, and we may supply data to 
            // prefill any form fields, and we can even provide replacement documents (which we are not using here). A replacement document 
            // would be useful in a case where you have a standard contract in your template, and you want to use the template, but replace the
            // contract with one that has some custom language specific to the deal. But, like I said, we're not doing that in this demo.
            //
            // if we selected the EmbeddedSending option then we will tell docusign to not send the envelope, but hold it 
            // in a draft state, so that we can open it up here and make some changes to it. 
            //
            // if we selected EmbeddedSigning, then we will tell docusign to send the envelope, and we will launch the signing 
            // session here.

            // first, get our recipients
            List<Signing.DocuSignWeb.Recipient> recipients = makeRecipients();

           // build a dictionary of form field values to pass in to the template
            Dictionary<string, string> formfields = new Dictionary<string, string>();
            formfields.Add("VIN", carVIN.Text);
            formfields.Add("Make", carMake.Text);
            formfields.Add("Model", carModel.Text);

            //  now build our template. 
            Signing.DocuSignWeb.TemplateReference templateRef = makeTemplate(recipients, formfields);

            // we could potentially have multiple templates in an envelope, so the method call takes an array. 
            List<Signing.DocuSignWeb.TemplateReference> templateRefs = new List<Signing.DocuSignWeb.TemplateReference>();

            templateRefs.Add(templateRef);


            // envelope info - This holds additional customization info - some info is similar to a mailing label
            // on a paper envelope, and other info controls how the envelope will be processed. See API docs for more info.
            Signing.DocuSignWeb.EnvelopeInformation	envelopeInfo = new Signing.DocuSignWeb.EnvelopeInformation();
	        envelopeInfo.EmailBlurb = "This envelope was sent from the Auto Insurance Sample of the DocuSign SDK.";
	        envelopeInfo.Subject = "InsuranceCo Auto Rider";
	        envelopeInfo.AccountId = (string) Session["AccountID"];
            
            // ActivateEnvelope flag - this indicates whether we want to send the envelope immediately
            // or leave it in the drafts folder.
            // We are using the value of the embeddedSending checkbox to determine this
            bool activateEnvelope = embeddedSigning.Checked;

            //bundle all into params for call
            Signing.Envelope env = null;
            try
            {
                Session["Envelope"] = env = Signing.Envelope.CreateEnvelopeFromServerTemplates(base.GetAPICredentials(),
                    templateRefs.ToArray(), recipients.ToArray(), envelopeInfo, activateEnvelope);
            }
            catch (Exception excp)
            {
                base.GoToErrorPage(excp.Message);
            }
            // Now if we are using either embedded sending or embedded signing we need to get a token to launch the 
            // embedded host page. If not, then redirect to the status page

            string nextPageURL = "";
            // get the url of the page we want to go to when we're done with embedded session
            Uri retUri = new Uri(Request.Url.AbsoluteUri.Replace("AutoAppApply.aspx", "pop.html"), UriKind.Absolute);

            if (embeddedSigning.Checked)
            {
                // get embeddedsigning token for applicant to sign
                Signing.DocuSignWeb.RequestRecipientTokenAuthenticationAssertion assert = ApiHelper.MakeRecipientTokenAuthAssert(DateTime.Now.Ticks.ToString());
                Signing.DocuSignWeb.RequestRecipientTokenClientURLs clientURLs = Signing.Envelope.StandardUrls(retUri,recipients[0].UserName);
                try
                {
                    Session["EmbeddedToken"] = env.RequestRecipientToken(recipients[0], assert, clientURLs);
                    nextPageURL = "EmbeddedHost.aspx";
                }
                catch (Exception excp)
                {
                    base.GoToErrorPage(excp.Message);
                }
            }
            else if (embeddedSending.Checked)
            {
                // get sending token just to demo the function. You typically would not let someone send their own application
                try
                {
                    Session["EmbeddedToken"] = env.RequestSenderToken(retUri.ToString());
                    nextPageURL = "EmbeddedHost.aspx";
                }
                catch (Exception excp)
                {
                    base.GoToErrorPage(excp.Message);
                }
            }
            else
            {
                nextPageURL = "AutoAppStatus.aspx";

            }
            Response.Redirect(nextPageURL, true);
        }

        public List<Signing.DocuSignWeb.Recipient> makeRecipients()
        {
            // setup recipient(s). 
            List<Signing.DocuSignWeb.Recipient> recipients = new List<Signing.DocuSignWeb.Recipient>();

            // first recipient is the applicant, who will sign the docs. 
            Signing.DocuSignWeb.Recipient signer = ApiHelper.MakeRecipient(emailDestination.Text, firstName.Text, lastName.Text, embeddedSigning.Checked, Session.SessionID);
            signer.ID = "1";
            signer.RoutingOrder = 1;
            signer.RoutingOrderSpecified = true;

            // set any selected security options on the recipient
            if (AuthenticationMethod_IDLookup.Checked)
            {
                signer = ApiHelper.AddIDLookupToRecipient(signer, null,null,null,null,null);
            }
            if (AuthenticationMethod_Phone.Checked)
            {
                signer = ApiHelper.AddPhoneAuthToRecipient(signer, authPhoneNumber.Text);
            }
            if (accessCode.Text.Length > 0)
            {
                signer.AccessCode = accessCode.Text;
            }
            recipients.Add(signer);

            // there is an optional second recipient who will be cc'd if present
            if (emailDestinationCC.Text.Length > 0)
            {
                Signing.DocuSignWeb.Recipient cc = ApiHelper.MakeRecipient(emailDestinationCC.Text, "Any", "Signer", false, "");
                cc.ID = "2";
                cc.Type = Signing.DocuSignWeb.RecipientTypeCode.CarbonCopy;
                recipients.Add(cc);

            }
            return recipients;
        }
        public Signing.DocuSignWeb.TemplateReference makeTemplate(List<Signing.DocuSignWeb.Recipient> recipients, Dictionary<string,string> formfields )
        {
            // get our Template Ref - this indicates that we will use a server side template for the signing
            Signing.DocuSignWeb.TemplateReference templateRef = new Signing.DocuSignWeb.TemplateReference();
            templateRef.Template = (string)Session["TemplateID"];
            templateRef.TemplateLocation = Signing.DocuSignWeb.TemplateLocationCode.Server;
            templateRef.Sequence = "1";

            // setup role assignments - this indicates what Role a recipient will play in a template
            List<Signing.DocuSignWeb.TemplateReferenceRoleAssignment> roleRefs = new List<Signing.DocuSignWeb.TemplateReferenceRoleAssignment>();
            
            // we know the first recipient is the signer
            Signing.DocuSignWeb.TemplateReferenceRoleAssignment signerRoleRef = new Signing.DocuSignWeb.TemplateReferenceRoleAssignment();
            signerRoleRef.RecipientID = recipients[0].ID;
            signerRoleRef.RoleName = "Insured";
            roleRefs.Add(signerRoleRef);
            
            // if there is an optional second recipient then add them as the CC role
            if (recipients.Count > 1)
            {
                Signing.DocuSignWeb.TemplateReferenceRoleAssignment ccRoleRef = new Signing.DocuSignWeb.TemplateReferenceRoleAssignment();
                ccRoleRef.RecipientID = recipients[1].ID;
                ccRoleRef.RoleName = "CC";
                roleRefs.Add(ccRoleRef);

            }
            // add our roleRefs to the template
            templateRef.RoleAssignments = roleRefs.ToArray();

            // Now we are going to take some of the submitted form values and pass them into the formfields on the template
            templateRef.FieldData = ApiHelper.MakeTemplateFormFields(formfields);

            return templateRef;
        }


    }
}
