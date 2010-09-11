using System;
using System.Data;
using System.Configuration;
using System.Collections;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.Security;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using System.Diagnostics;
using System.IO;

namespace LoanCo
{
    public partial class SigningReturn : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            ProcessEvent();

        }
        void ProcessEvent()
        {
            downloadPdf.Enabled = false;
            string uname = Request["uname"];
            string signingEvent = Request["event"];
            switch (signingEvent)
            {
                    
                case "SignComplete":
                    downloadPdf.Enabled = true;
                    statusLabel.Text = "The user has completed the signing.  The legally binding document with signatures is stored on the DocuSign, Inc. server.";
                    break;
                case "ViewComplete":
                    statusLabel.Text = "The user has viewed the document without signing it.";
                    break;
                case "Cancel":
                    statusLabel.Text = "The user has cancelled out of the signign experience";
                    break;
                case "Decline":
                    statusLabel.Text = "The user has declined to sign the document.";
                    break;
                case "Timeout":
                    statusLabel.Text = "The user did not sign the document in time.  The timeout is set to 20 minutes.";
                    break;
                case "TTLExpired":
                    statusLabel.Text = "Trusted connection has expired.  The server communication might be a problem.";
                    break;
                case "IDCheck":
                    statusLabel.Text = "The ID Check has failed.  The user was denied an opportunity to view or sign the document.";
                    break;
                case "AccessCode":
                    statusLabel.Text = "The access code verification has failed.  The user was denied an opportunity to view or sign the document.";
                    break;
                case "Exception":
                    statusLabel.Text = "An exception has occurred on the server.  Please check the parameters passed to the Web Service Methods.";
                    break;
                default:
                    Debug.Assert(false,
                        "Got an unexpected code back: " + signingEvent);
                    // by default assign the return even to the label 
                    // to debug the unexpected signing event strings 
                    statusLabel.Text = signingEvent;
                    break;
            }
        }

        protected void downloadPdf_Click(object sender, EventArgs e)
        {
            Debug.WriteLine("Session ID:" + Session.SessionID);
            Signing.Envelope envelope = (Signing.Envelope)Session["Envelope"];
            byte[] bytes = envelope.RetrievePdfBytes();

            Response.Clear();
            Response.AddHeader("Content-Type", "application/pdf");
            Response.AddHeader("Content-Length", bytes.Length.ToString());
            Response.AddHeader("Content-Disposition", "attachment; filename=envelope.pdf");
            Response.BinaryWrite(bytes);
            Response.End();
        }

    }
}
