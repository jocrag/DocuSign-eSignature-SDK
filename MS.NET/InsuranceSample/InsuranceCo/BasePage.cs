using System;
using System.Data;
using System.Configuration;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using System.Collections.Generic;
using System.Collections;
using Signing;



/// <summary>
/// Summary description for basepage
/// </summary>
public class BasePage : System.Web.UI.Page
{
    public BasePage()
    {
        //
        // TODO: Add constructor logic here
        //
    }

    protected override void OnLoad(EventArgs e)
    {
        base.OnLoad(e);
    }
    
    public bool SettingIsSet(string settingName)
    {
        // check if a value is specified in config file
        return (ConfigurationManager.AppSettings[settingName] != null && ConfigurationManager.AppSettings[settingName].Length > 0);
    }

    public void RequireOrDie(string[] args)
    {
        // check form post for required values 
        // if not found redirect to errorpage
        ArrayList missingFields = new ArrayList();
        foreach (string s in args)
        {
            if (Request.Form[s] == null)
            {
                missingFields.Add(s);
            }
            break;
        }
        if (missingFields.Count > 0)
        {
            GoToErrorPage("Required fields missing: " + String.Join(", ", (string[])missingFields.ToArray(typeof(string))));
        }
    }

    public void GoToErrorPage(string errorMessage)
    {
        Session["errorMessage"] = errorMessage;
        Response.Redirect("error.aspx", true);
    }

    public AccountCredentials GetAPICredentials(){
        AccountCredentials credentials = new AccountCredentials();
        if (SettingIsSet("TransactionAPIUrl") && Session["AccountID"] != null && Session["APILogin"] != null && Session["Password"] != null)
        {
            credentials.AccountId = (string)Session["AccountID"];
            credentials.UserName = (string)Session["APILogin"];
            credentials.Password = (string)Session["Password"];
            credentials.ApiUrl = ConfigurationManager.AppSettings["TransactionAPIUrl"];

        }
        else
        {
            this.GoToErrorPage("Please make sure your credentials are entered in web.config");
        }
        return credentials;
    }
    public void clearSessionVars()
    {
        Session["LoggedIn"] = false;
        Session["Email"] = null;
        Session["Password"] = null;
        Session["AccountID"] = null;
        Session["AccountName"] = null;
        Session["UserName"] = null;
        Session["UserID"] = null;
        Session["TemplateID"] = null;
        Session["Accounts"] = null;
    }
}
