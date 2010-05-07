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
using DocuSignAPI.CredentialService;
using DocuSignAPI.APIService;

namespace Sender
{
    public partial class Status : BasePage  
    {
        Account identity;
        string password;
        
        private string EnvelopeID
        {
            get { return ViewState["envelopeID"].ToString(); }
            set { ViewState["envelopeID"] = value; }
        }
     
        protected void Page_Load(object sender, EventArgs e)
        {
            identity = (Account)Session["Identity"];
            password = (string)Session["Password"];
            
            if (identity == null || password == null)
                Response.Redirect("Default.aspx");

            lblUser.Text = "Logged in as " + identity.Email;

            if (Request.QueryString.Keys.Count > 0)
            {
                lblErrorMsg.Visible = false;
                EnvelopeID = Request.QueryString["envID"];
                BindEnvelopeStatus();
            }
        }

        /// <summary>
        /// Request envelope status for the given envelope ID and display it
        /// </summary>
        protected void BindEnvelopeStatus()
        {
            EnvelopeStatus envStatus = EnvelopeManager.RequestEnvelopeStatus(EnvelopeID, identity, password);

            litTimeGenerated.Text = envStatus.TimeGenerated.ToString();
            litEnvelopeID.Text = envStatus.EnvelopeID;
            litSubject.Text = envStatus.Subject;
            litUserName.Text = envStatus.UserName;
            litEmail.Text = envStatus.Email;
            litStatus.Text = envStatus.Status.ToString();
            litCreated.Text = envStatus.Created.ToString();
            litSent.Text = envStatus.Sent.ToString();

            litACStatus.Text = envStatus.ACStatus;
            litACStatusDate.Text = envStatus.ACStatusDate.ToString();
            litACHolder.Text = envStatus.ACHolder;
            litACHolderEmail.Text = envStatus.ACHolderEmail;
            litACHolderLocation.Text = envStatus.ACHolderLocation;

            litSigningLocation.Text = envStatus.SigningLocation.ToString();
            litSenderIPAddress.Text = envStatus.SenderIPAddress;
            litEnvelopePDFHash.Text = envStatus.EnvelopePDFHash;
            litAutoNavigation.Text = envStatus.AutoNavigation.ToString();
            litEnvelopeIdStamping.Text = envStatus.EnvelopeIdStamping.ToString();
            litAuthoritativeCopy.Text = envStatus.AuthoritativeCopy.ToString();
        }

        /// <summary>
        /// Handlig update status button click event.
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected void btnUpdateStatus_Click(object sender, EventArgs e)
        {
            BindEnvelopeStatus();
        }

        /// <summary>
        /// Request PDF Document in the given Envelope ID.
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected void btnRequestPDF_Click(object sender, EventArgs e)
        {
            EnvelopePDF envelopePDF = EnvelopeManager.RequestEnvelopePDF(EnvelopeID, identity, password);
            byte[] bytes = envelopePDF.PDFBytes;

            Response.AddHeader("Content-Type", "application/pdf");
            Response.AddHeader("Content-Length", bytes.Length.ToString());
            Response.AddHeader("Content-Disposition", "attachment; filename=envelope.pdf");
            Response.BinaryWrite(bytes);
            Response.Flush();
        }

        /// <summary>
        /// Destroy(void) the envelope with the given envelope ID
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected void btnVoidEnvelope_Click(object sender, EventArgs e)
        {
            EnvelopeStatus envStatus = EnvelopeManager.RequestEnvelopeStatus(EnvelopeID, identity, password);
            if (envStatus.Status == EnvelopeStatusCode.Sent || envStatus.Status == EnvelopeStatusCode.Delivered)
            {
                VoidEnvelopeStatus voidEnvStatus = EnvelopeManager.DestroyEnvelope(EnvelopeID, identity, password, "Reason");
                BindEnvelopeStatus();
            }
            else
            {
                lblErrorMsg.Text = "Only envelopes in the 'Sent' or 'Delivered' states may be voided.";
                lblErrorMsg.Visible = true;
            }
        }
        protected void btnLogout_Click(object sender, EventArgs e)
        {
            LogOff();
        }
    }
}
