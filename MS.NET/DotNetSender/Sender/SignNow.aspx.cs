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
using DocuSignAPI.CredentialService;
using Google.GData.Calendar;
using Google.GData.Client;
using DocuSignAPI.APIService;
using DocuSignAPI;

namespace Sender
{
    public partial class SignNow : BasePage
    {
        string password;
        bool isFromTemplate = false;
        string subject;
        string blurp;
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
            subject = (string)Session["Subject"];
            blurp = (string)Session["EmailBlurp"];

            if (Session["isFromTemplate"] != null)
            {
                isFromTemplate = (bool)Session["isFromTemplate"];
            }

            if (identity == null || password == null)
                Response.Redirect("Default.aspx");

            lblUser.Text = "Logged in as " + identity.Email;
        }
        protected void btnExternalLogin_Click(object sender, EventArgs e)
        {
            CalendarService client = new CalendarService("DocuSignSender");

            try
            {
                client.setUserCredentials(tbExternalUserName.Text, tbExternalPassword.Text);
                if (ViewState["isCaptcha"] != null)
                {
                    if ((bool)ViewState["isCaptcha"])
                    {
                        GDataGAuthRequestFactory requestFactory = (GDataGAuthRequestFactory)client.RequestFactory;
                        requestFactory.CaptchaAnswer = tbCaptcha.Text;
                        requestFactory.CaptchaToken = ViewState["captchaToken"].ToString();
                    }
                }
                string token = client.QueryAuthenticationToken();
                imgCaptcha.Visible = false;
                tbCaptcha.Visible = false;

                ViewState["isCaptcha"] = false;

                if (token != null)
                {
                    foreach (Recipient recipient in Recipients)
                    {
                        recipient.CaptiveInfo = new RecipientCaptiveInfo();
                        recipient.CaptiveInfo.ClientUserId = Guid.NewGuid().ToString();
                    }
                    string url;
                    //Check if envelope to be made based on template and chhose method based on that
                    if (!isFromTemplate)
                    {
                        url = EnvelopeManager.CreateEmbedded(identity, password, subject,blurp, (byte[])Session["pdfBytes"], (string)Session["fileName"], Recipients, Request.Url.AbsoluteUri);
                    }
                    else
                    {
                        url = EnvelopeManager.CreateEnvelopeFromTemplates(identity, Recipients.ToArray(), Session["Template"].ToString(), subject, blurp, password, Request.Url.AbsoluteUri, true);
                    }
                    pnlExternalAuth.Visible = false;
                    pnlEmbeddedSigning.Visible = true;
                    frameEmbeddedSigning.Attributes["src"] = url;
                }
            }
            catch (CaptchaRequiredException exception)
            {
                tbCaptcha.Visible = true;
                imgCaptcha.Visible = true;
                imgCaptcha.ImageUrl = exception.Url;
                ViewState["isCaptcha"] = true;
                ViewState["captchaToken"] = exception.Token;
                // authenticate the user again
            }
            catch (InvalidCredentialsException exception)
            {
                lblExternalAuthStatusMsg.Text = exception.Message;
            }
            catch (AuthenticationException exception)
            {
                lblExternalAuthStatusMsg.Text = exception.Message;
            }
        }
        protected void btnLogout_Click(object sender, EventArgs e)
        {
            LogOff();
        }
    }
}
