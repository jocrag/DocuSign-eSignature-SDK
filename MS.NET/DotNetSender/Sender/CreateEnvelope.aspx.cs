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
using System.IO;
using System.Text;
using System.Xml;
using System.Xml.Linq;
using Google.GData.Client;
using Google.GData.Extensions;
using Google.GData.Calendar;

namespace Sender
{
    public partial class CreateEnvelope : BasePage
    {
        string uploadedFilePath = string.Empty;
        string password;
        bool isFromTemplate = false;

        List<Recipient> recipients = new List<Recipient>();
        Account identity;

        private List<Recipient> Recipients
        {
            get
            {
                if ((List<Recipient>)Session["Recipients"] != null)
                    return (List<Recipient>)Session["Recipients"];
                else
                    return new List<Recipient>();
            }
            set { Session["Recipients"] = value; }
        }

        protected void Page_Load(object sender, EventArgs e)
        {
            identity = (Account)Session["Identity"];
            password = (string)Session["Password"];
            if (Session["isFromTemplate"] != null)
            {
                isFromTemplate = (bool)Session["isFromTemplate"];
            }
            //check if user session is still valid.If not redirect the user to login page for authentication
            if (identity == null || password == null)
                Response.Redirect("Default.aspx");

            lblUser.Text = "Logged in as " + identity.Email;

            //Handling gridview rowdeleting event
            gvRecipients.RowDeleting += new GridViewDeleteEventHandler(gvRecipients_RowDeleting);
        }

        /// <summary>
        /// To delete a row from the Recipent list
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void gvRecipients_RowDeleting(object sender, GridViewDeleteEventArgs e)
        {
            recipients = Recipients;
            recipients.RemoveAt(e.RowIndex);
            Recipients = recipients;
            gvRecipients.DataSource = Recipients;
            gvRecipients.DataBind();
        }

        /// <summary>
        /// To add a recipient to recipient list
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected void btnAddNewRecipient_Click(object sender, EventArgs e)
        {
            if (!string.IsNullOrEmpty(tbUserName.Text.Trim()) && !string.IsNullOrEmpty(tbEmail.Text.Trim()))
            {
                recipients = Recipients;
                Recipient recipient = new Recipient();
                recipient.Email = tbEmail.Text;
                recipient.UserName = tbUserName.Text;
                recipient.ID = (recipients.Count + 1).ToString();

                if (cbIdCheck.Checked)
                {
                    recipient.RequireIDLookup = cbIdCheck.Checked;
                }
                
                if (cbAccessCode.Checked)
                {
                    recipient.AccessCode = tbAccessCode.Text;
                }

                if (isFromTemplate)
                {
                    recipient.RoleName = ddlRole.Text;
                }
                recipients.Add(recipient);
                Recipients = recipients;
                gvRecipients.DataSource = Recipients;
                gvRecipients.DataBind();
                tbEmail.Text = string.Empty;
                tbUserName.Text = string.Empty;
            }
        }

        /// <summary>
        /// Create and send envelope
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected void btnCreateandSend_Click(object sender, EventArgs e)
        {
            /*Check if there is any document ,if not alert user to upload the document */
            if ((string)Session["fileName"] == null)
            {
                lblErrormsg.Text = "<ul><li>A document should be uploaded.</li></ul>";
                lblErrormsg.Visible = true;
            }
            //Check if atleast one recipient is entered
            else if (Recipients.Count == 0)
            {
                lblErrormsg.Text = "<ul><li>Atleat one recipient should be given.</li></ul>";
                lblErrormsg.Visible = true;
            }
            //if all validations succeed Create and send the envelope
            else
            {
                string envelopeID;
                //Check if envelope to be made based on template and chhose method based on that
                if (!isFromTemplate)
                {
                    envelopeID = EnvelopeManager.CreateEnvelope(identity, password, tbSubject.Text, tbEmailBlurb.Text, (byte[])Session["pdfBytes"], (string)Session["fileName"], Recipients);
                }
                else
                {
                    envelopeID = EnvelopeManager.CreateEnvelopeFromTemplates(identity, Recipients.ToArray(), Session["Template"].ToString(), tbSubject.Text, tbEmailBlurb.Text, password, Request.Url.AbsoluteUri, false);
                }
                Response.Redirect("Status.aspx?envID=" + envelopeID);
            }
        }

        protected void btnCreateEmbedded_Click(object sender, EventArgs e)
        {
            /*Check if there is any document ,if not alert user to upload the document */
            if ((string)Session["fileName"] == null)
            {
                lblErrormsg.Text = "A document should be uploaded.";
                lblErrormsg.Visible = true;
            }
            //Check if atleast one recipient is entered
            else if (Recipients.Count == 0)
            {
                lblErrormsg.Text = "Atleat one recipient should be given.";
                lblErrormsg.Visible = true;
            }
            //if all validations succeed Create Embedded Envelope
            else
            {
                pnlForm.Visible = false;
                Session["Subject"] = tbSubject.Text;
                Session["EmailBlurp"] = tbEmailBlurb.Text;
                Response.Redirect("SignNow.aspx");
            }
        }

        protected void btnUpload_Click(object sender, EventArgs e)
        {
            //Upload the Document

            if (file.HasFile)
            {
                if (file.FileName.ToLower().EndsWith(".pdf"))
                {
                    byte[] pdfBytes = file.FileBytes;
                    Session["pdfBytes"] = pdfBytes;
                    Session["fileName"] = file.FileName;
                    file.Visible = false;
                    btnUpload.Visible = false;
                    lblFile.Text = file.FileName;
                    lblFile.Visible = true;
                }
                else if (file.FileName.ToLower().EndsWith(".dpd"))
                {
                    Session["isFromTemplate"] = true;

                    Session["fileName"] = file.FileName;

                    //Generating unique name for the file
                    int position = file.FileName.LastIndexOf('.');
                    string fileNameOnServer = file.FileName.Substring(0, position) + Guid.NewGuid().ToString() + file.FileName.Substring(position);
                    file.SaveAs(Server.MapPath("upload\\" + fileNameOnServer));
                    string templateBytes = File.ReadAllText(Server.MapPath("upload\\" + fileNameOnServer));
                    if (File.Exists(Server.MapPath("upload\\" + fileNameOnServer)))
                    {
                        File.Delete(Server.MapPath("upload\\" + fileNameOnServer));
                    }

                    XDocument xmlDoc = XDocument.Parse(templateBytes);
                    XNamespace ns = "http://www.docusign.net/API/3.0";

                    var recp = from recipientItem in xmlDoc.Descendants(ns + "Recipient")
                               select new Recipient
                               {
                                   UserName = recipientItem.Element(ns + "UserName").Value.Trim().ToString(),
                                   RoleName = recipientItem.Element(ns + "RoleName").Value.Trim().ToString(),
                                   Email = recipientItem.Element(ns + "Email").Value.Trim().ToString()
                               };

                    List<Recipient> recipientList = new List<Recipient>();
                    recipientList = recp.ToList<Recipient>();
                    recipients = Recipients;
                    foreach (Recipient templateRecipient in recipientList)
                    {
                        if (!string.IsNullOrEmpty(templateRecipient.Email) && !string.IsNullOrEmpty(templateRecipient.UserName))
                        {
                            Recipient recipient = new Recipient();
                            recipient.Email = templateRecipient.Email;
                            recipient.UserName = templateRecipient.UserName;
                            recipient.ID = (recipients.Count + 1).ToString();
                            recipient.RoleName = templateRecipient.RoleName;
                            recipients.Add(recipient);
                        }
                    }
                    Recipients = recipients;
                    gvRecipients.DataSource = Recipients;
                    gvRecipients.DataBind();

                    
                    var roleItems = (from roleItem in xmlDoc.Descendants(ns + "RoleName")
                                     select roleItem.Value).Distinct();

                    if (roleItems != null)
                    {
                        lblRole.Visible = true;
                        ddlRole.Visible = true;
                        ddlRole.DataSource = roleItems;
                        ddlRole.DataBind();
                    }

                    Session["Template"] = templateBytes;
                    file.Visible = false;
                    btnUpload.Visible = false;
                    lblFile.Text = file.FileName;
                    lblFile.Visible = true;
                }
            }
        }

        protected void btnLogout_Click(object sender, EventArgs e)
        {
            LogOff();
        }

        protected void cbAccessCode_CheckedChanged(object sender, EventArgs e)
        {
            pnlAccessCode.Visible = cbAccessCode.Checked;
        }
    }
}
