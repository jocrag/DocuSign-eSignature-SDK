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
using System.Runtime.Serialization;
using DocuSignAPI.CredentialService;
using DocuSignAPI;
using System.Data;
using System.Configuration;


namespace Sender
{
    public partial class _Default : BasePage
    {
        LoginResult identity;
        protected void Page_Load(object sender, EventArgs e)
        {
            gvAccounts.SelectedIndexChanging += new GridViewSelectEventHandler(gvAccounts_SelectedIndexChanging);
        }

        void gvAccounts_SelectedIndexChanging(object sender, GridViewSelectEventArgs e)
        {
            identity = (LoginResult)Session["LoginResult"];
            Account account = identity.Accounts[e.NewSelectedIndex];
            Session["Identity"] = account;
            Response.Redirect("~/CreateEnvelope.aspx");
        }

        /// <summary>
        /// On login button click validate the user and if success store the identity and password in the session for later use
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected void btnLogin_Click(object sender, EventArgs e)
        {
            identity = Authenticate.ValidateUser("["+ConfigurationManager.AppSettings["IntegratorsKey"]+"]"+tbUserName.Text, tbPassword.Text);
            if (identity != null)
            {
                if (identity.Success)
                {
                    Session["LoginResult"] = identity;
                    Session["Password"] = tbPassword.Text;
                    if (identity.Accounts.Length > 1)
                    {
                        gvAccounts.DataSource = identity.Accounts;
                        gvAccounts.DataBind();
                        pnlLogin.Visible = false;
                        pnlSelectAccount.Visible = true;
                    }
                    else
                    {
                        Account account = identity.Accounts[0];
                        Session["Identity"] = account;
                        Response.Redirect("~/CreateEnvelope.aspx");
                    }
                }
                else
                {
                    lblStatusMsg.Text = "Login Failed. Please Try again";
                }
            }

        }
    }
}
