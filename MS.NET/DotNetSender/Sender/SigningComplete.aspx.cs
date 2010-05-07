/*

Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK 
and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended 
for production use. Code and policy for a production application must be 
developed to meet the specific data and security requirements of the 
application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
PARTICULAR PURPOSE.
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DocuSignAPI;
using DocuSignAPI.APIService;
using DocuSignAPI.CredentialService;

namespace Sender
{
    public partial class SigningComplete : BasePage
    {
        string eventStatus;
        string envelopeID;
        string password;
        
        Account identity;

        protected void Page_Load(object sender, EventArgs e)
        {
            eventStatus = string.Empty;
            envelopeID = string.Empty;

            identity = (Account)Session["Identity"];
            password = (string)Session["Password"];

            if (identity == null || password == null)
                Response.Redirect("Default.aspx");

            if (Request.QueryString.Keys.Count > 0)
            {
                eventStatus = Request.QueryString["event"];
                envelopeID = Request.QueryString["envelopeID"];
            }

            switch (eventStatus)
            {
                case "SignComplete":
                    lblMessage.Text = "The user has completed the signing.  The legally binding document with signatures is stored on the DocuSign, Inc. server.";

                    break;
                case "ViewComplete":
                    lblMessage.Text = "The user has viewed the document without signing it.";
                    break;
                case "Cancel":
                    lblMessage.Text = "The user has cancelled out of the signign experience";
                    break;
                case "Decline":
                    lblMessage.Text = "The user has declined to sign the document.";
                    break;
                case "Timeout":
                    lblMessage.Text = "The user did not sign the document in time.  The timeout is set to 20 minutes.";
                    break;
                case "TTLExpired":
                    lblMessage.Text = "Trusted connection has experied.  The server communication might be a problem.";
                    break;
                case "IDCheck":
                    lblMessage.Text = "The ID Check has failed.  The user was denied an opportunity to view or sign the document.";
                    break;
                case "AccessCode":
                    lblMessage.Text = "The access code verification has failed.  The user was denied an opportunity to view or sign the document.";
                    break;
                case "Exception":
                    lblMessage.Text = "An exception has occurred on the server.  Please check the parameters passed to the Web Service Methods.";
                    break;
                default:
                    lblMessage.Text = "Unexpected exception has occured. Please Try again";
                    break;
            }
        }

        protected void btnRequestPDF_Click(object sender, EventArgs e)
        {
            EnvelopePDF envelopePDF = EnvelopeManager.RequestEnvelopePDF(envelopeID, identity, password);
            byte[] bytes = envelopePDF.PDFBytes;

            Response.AddHeader("Content-Type", "application/pdf");
            Response.AddHeader("Content-Length", bytes.Length.ToString());
            Response.AddHeader("Content-Disposition", "attachment; filename=envelope.pdf");
            Response.BinaryWrite(bytes);
            Response.Flush();
        }
    }
}
