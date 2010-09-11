using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using Signing;

namespace InsuranceCo
{
    public partial class Login : BasePage
    {

        protected void Page_Load(object sender, EventArgs e)
        {
            if (!Page.IsPostBack)
            {
                if (Session["LoggedIn"] != null && (bool)Session["LoggedIn"] == true)
                {
                    // already logged in
                    pnlEnterLogin.Visible = false;
                    pnlDisplayAccount.Visible = true;
                    pnlChangeAccount.Visible = false;
                    lblAccountName.Text = (string)Session["AccountName"];
                    lblEmail.Text = (string)Session["Email"];
                    CredentialService.Account[] accounts = (CredentialService.Account[]) Session["Accounts"];
                    // more than one account setup for account select
                    if (accounts.Length > 1)
                    {
                        btnChangeAccount.Visible = true;
                        ddlAccountSelect.Items.Clear();
                        foreach (CredentialService.Account account in accounts)
                        {
                            ddlAccountSelect.Items.Add(new ListItem(account.AccountName, account.AccountID));
                        }
                    }


                    if (Session["TemplateID"] != null)
                    {
                        pnlManageTemplate.Visible = true;
                        pnlTemplateExists.Visible = true;
                        pnlTemplateError.Visible = false;
                        pnlTemplateUpload.Visible = false;
                        pnlTemplateCheckPending.Visible = false;
                    }
                    else
                    {
                        if (checkAccountForTemplate() == true)
                        {
                            pnlTemplateExists.Visible = true;
                            pnlTemplateUpload.Visible = false;

                        }
                        else
                        {
                            pnlTemplateExists.Visible = false;
                            pnlTemplateUpload.Visible = true;
                        }
                    }

                }
                else
                {
                    pnlEnterLogin.Visible = true;
                    pnlChangeAccount.Visible = false;
                    pnlDisplayAccount.Visible = false;
                    pnlLoggedIn.Visible = false;
                    pnlManageTemplate.Visible = false;

                    lblLoginErrorMessage.Visible = false;
                    pnlTemplateCheckPending.Visible = false;
                    pnlTemplateError.Visible = false;

                }
                    
            }            
        }
        protected void setLoginErrorMessage(string msg){
            lblLoginErrorMessage.Text = msg;
            lblLoginErrorMessage.Visible = true;
        }
        protected void clearLoginErrorMessage(){
            lblLoginErrorMessage.Text = "";
            lblLoginErrorMessage.Visible = false;
        }
        public CredentialService.Account[] checkAccountsForTemplatePermissions(CredentialService.LoginResult loginResult){
            List<CredentialService.Account> accountsWithTemplatesPermissions = new List<InsuranceCo.CredentialService.Account>();
            Signing.AccountCredentials creds = base.GetAPICredentials();
            Signing.DocuSignWeb.APIServiceSoap api = Signing.Envelope.CreateApiProxy(creds);

            Signing.DocuSignWeb.RequestTemplatesResponse response;
            Signing.DocuSignWeb.RequestTemplatesRequest request = new Signing.DocuSignWeb.RequestTemplatesRequest();
            
            foreach(CredentialService.Account account in loginResult.Accounts){
                request.AccountID = account.AccountID;
                request.IncludeAdvancedTemplates = true;
                try{
                    response = api.RequestTemplates(request);
                    accountsWithTemplatesPermissions.Add(account);
                }
                catch(Exception excp){
                    // nada
                }

            }
            return accountsWithTemplatesPermissions.ToArray();

        }
        public bool checkAccountForTemplate()
        {
            bool retval = false;
            Signing.AccountCredentials creds = base.GetAPICredentials();
            Signing.DocuSignWeb.APIServiceSoap api = Signing.Envelope.CreateApiProxy(creds);
            Signing.DocuSignWeb.RequestTemplatesResponse response;
            Signing.DocuSignWeb.RequestTemplatesRequest request = new Signing.DocuSignWeb.RequestTemplatesRequest();
            request.AccountID = (string) Session["AccountID"];
            request.IncludeAdvancedTemplates = true;
            try
            {
                response = api.RequestTemplates(request);
                foreach (Signing.DocuSignWeb.EnvelopeTemplateDefinition def in response.RequestTemplatesResult)
                {
                    if (def.Name == "InsuranceCo Auto Insurance Application")
                    {
                        Session["TemplateID"] = def.TemplateID;
                        retval = true;
                    }
                }
            }
            catch (Exception excp)
            {
                base.GoToErrorPage(excp.Message);
            }
            return retval;
        }

        public bool uploadTemplateToAccount()
        {
            bool retval = false;
            Signing.AccountCredentials creds = base.GetAPICredentials();
            Signing.DocuSignWeb.APIServiceSoap api = Signing.Envelope.CreateApiProxy(creds);

            string templateXml = System.IO.File.ReadAllText(Server.MapPath("resources/autoInsuranceApplication.dpd"));


        	try{
		        // upload template
		        Signing.DocuSignWeb.SaveTemplateResult uploadTemplateResponse = api.UploadTemplate(templateXml,(string)Session["AccountID"],false);
		        // so, due to a bug we have to upload a template in the dpd format
		        // and then download it from the server, which will cause it to be converted to the new format
		        // and then upload it again so that we can use it. However, when we try to upload it we'll hit another
		        // bug that prevents us from saving a template without an email address so we'll specify bogus email 
		        // and then update to the correct email address when we are ready to send the envelope.
                
                Signing.DocuSignWeb.EnvelopeTemplate retrievedTemplate = api.RequestTemplate(uploadTemplateResponse.TemplateID, true);

                // this is to work around a bug that prevents saving a template when there isn't an email address specified.
                retrievedTemplate.Envelope.Recipients[0].UserName = "Signer Here";
                retrievedTemplate.Envelope.Recipients[0].Email = "test@docusign.com";
                
                Signing.DocuSignWeb.SaveTemplateResult saveResult = api.SaveTemplate(retrievedTemplate);

                Session["TemplateID"] = saveResult.TemplateID;
                retval = true;

	        } catch (Exception excp){
		        if(excp.Message.IndexOf("User lacks sufficient permissions") > 0){
			        // set local error message and stay on page
                    lblTemplateUploadError.Text = "You do not have permissions to upload templates to this account. Please select a different account.";
                } else {
			        base.GoToErrorPage(excp.Message);
		        }
	        }
            return retval;



        }
        protected void btnLogin_Click(object sender, EventArgs e)
        {
            bool retval = false;
            CredentialService.CredentialSoapClient creds = new InsuranceCo.CredentialService.CredentialSoapClient();
            CredentialService.LoginResult lr = null;
            string apiLogin = "";
            if (txtEmail.Text.Length == 0 || txtPassword.Text.Length == 0)
            {
                setLoginErrorMessage("Please enter an email and a password");
            }
            else
            {
                // an integrators key is an optional part of the api login that allows users without explicit api permissions to use
                // api functions. An integrators key is provided to the integrator, not to the end users. Do not let end uses get access
                // to the integrators key.
                if (base.SettingIsSet("IntegratorsKey"))
                {
                    apiLogin = "[" + System.Configuration.ConfigurationManager.AppSettings["IntegratorsKey"] + "]";
                }

                apiLogin += txtEmail.Text;
                
                try
                {
                    lr = creds.Login(apiLogin, txtPassword.Text);
                }
                catch (Exception excp)
                {
                    setLoginErrorMessage("Exception: " + excp.Message);
                }
            }
            switch (lr.ErrorCode)
            {
		        case CredentialService.ErrorCode.User_Does_Not_Exist_In_System:
                    retval = false;
                    setLoginErrorMessage(lr.AuthenticationMessage);
                    break;
		        case CredentialService.ErrorCode.Account_Lacks_Permissions:
			        retval = false;
                    setLoginErrorMessage(lr.AuthenticationMessage);
                    break;
		        case CredentialService.ErrorCode.User_Lacks_Permissions:
			        retval = false;
                    setLoginErrorMessage(lr.AuthenticationMessage);
                    break;
                case CredentialService.ErrorCode.User_Authentication_Failed:
			        retval = false;
			        setLoginErrorMessage(lr.AuthenticationMessage);
		        break;
                case CredentialService.ErrorCode.Unspecified_Error:
			        retval = false;
                    setLoginErrorMessage(lr.AuthenticationMessage);
                    break;
                case CredentialService.ErrorCode.Success:
                    Session["LoggedIn"] = true;
                    Session["Email"] = txtEmail.Text;
                    Session["APILogin"] = apiLogin;
                    Session["Password"] = txtPassword.Text;
                    Session["AccountID"] = lr.Accounts[0].AccountID;
                    Session["AccountName"] = lr.Accounts[0].AccountName;
                    Session["UserName"] = lr.Accounts[0].UserName;
                    Session["UserID"] = lr.Accounts[0].UserID;

                    // check accounts for Template
                    CredentialService.Account[] accounts = checkAccountsForTemplatePermissions(lr);
	                
                    if(accounts.Length > 0){
                        Session["Accounts"] = accounts;
                        // more than one account setup for account select
                        if (accounts.Length > 1)
                        {
                            btnChangeAccount.Visible = true;
                            foreach (CredentialService.Account account in accounts)
                            {
                                ddlAccountSelect.Items.Add(new ListItem(account.AccountName, account.AccountID));
                            }
                        }
                        else
                        {
                            btnChangeAccount.Visible = false;
                        }
                        retval = true;
			        } else {
				        retval = false;
                        clearSessionVars();
                        setLoginErrorMessage("None of your accounts have Manage Template permissions. You can correct this in the Member Console");

			        }
		
        		break;
        	default:
                break;
            }
            if (retval==true){
                pnlEnterLogin.Visible = false;
                pnlLoggedIn.Visible = true;
                pnlDisplayAccount.Visible = true;
                pnlChangeAccount.Visible=false;
                pnlManageTemplate.Visible = true;
                lblEmail.Text = (string) Session["Email"];
                lblAccountName.Text = (string) Session["AccountName"];
                if (checkAccountForTemplate() == true)
                {
                    pnlTemplateExists.Visible = true;
                    pnlTemplateUpload.Visible = false;
                }
                else
                {
                    pnlTemplateUpload.Visible = true;
                    pnlTemplateExists.Visible = false;
                }
            }
        }

        protected void btnChangeLogin_Click(object sender, EventArgs e)
        {
            clearSessionVars();
            pnlEnterLogin.Visible = true;
            lblLoginErrorMessage.Visible = false;
            pnlLoggedIn.Visible = false;
            
            pnlChangeAccount.Visible = false;
            pnlDisplayAccount.Visible = false;
            
            pnlManageTemplate.Visible = false;
        }

        protected void btnChangeAccount_Click(object sender, EventArgs e)
        {
            pnlDisplayAccount.Visible = false;
            pnlChangeAccount.Visible = true;
            pnlTemplateCheckPending.Visible = true;
            pnlTemplateExists.Visible = false;
            pnlTemplateUpload.Visible = false;
            pnlTemplateError.Visible = false;
            Session["TemplateID"] = false;
            Session["AccountID"] = null;
            Session["AccountName"] = null;
        }

        protected void btnSelectAccount_Click(object sender, EventArgs e)
        {
            pnlDisplayAccount.Visible = true;
            pnlChangeAccount.Visible = false;
            pnlTemplateCheckPending.Visible = false;
            pnlTemplateError.Visible = false;
            lblTemplateUploadError.Text = "";
            Session["AccountID"] = ddlAccountSelect.SelectedItem.Value;
            Session["AccountName"] = ddlAccountSelect.SelectedItem.Text;
            lblAccountName.Text = (string)Session["AccountName"];
            // check account for template
            // This will also set the session templateId var
            if (checkAccountForTemplate() == true)
            {
                pnlTemplateExists.Visible = true;
                pnlTemplateUpload.Visible = false;
            }
            else
            {
                pnlTemplateUpload.Visible = true;
                pnlTemplateExists.Visible = false;
            }

        }

        protected void btnUploadTemplate_Click(object sender, EventArgs e)
        {
            if (checkAccountForTemplate() != true)
            {
                if (uploadTemplateToAccount() == true)
                {
                    pnlTemplateExists.Visible = true;
                    pnlTemplateUpload.Visible = false;
                    pnlTemplateError.Visible = false;
                }
                else
                {
                    pnlTemplateUpload.Visible = false;
                    pnlTemplateError.Visible = true;
                }

            }

        }
    }
}
