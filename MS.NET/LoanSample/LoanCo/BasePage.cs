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
    public bool CredsAreSet;
    public BasePage()
    {
        //
        // TODO: Add constructor logic here
        //
    }

    protected override void OnLoad(EventArgs e)
    {
        loadOptions();
        checkCreds();
        base.OnLoad(e);
    }
    
    public void loadOptions()
    {
        if (Session["OptionsSet"] == null)
        {
            // init vals from web config
            if (SettingIsSet("SigningLocation"))
            {
                Session["SigningLocation"] = System.Configuration.ConfigurationManager.AppSettings["SigningLocation"];
            }
            else
            {
                Session["SigningLocation"] = "Embedded";
            }
            if (SettingIsSet("Authentication"))
            {
                Session["Authentication"] = System.Configuration.ConfigurationManager.AppSettings["Authentication"];
            }
            else
            {
                Session["Authentication"] = "None";
            }
            if (SettingIsSet("AccessCode"))
            {
                Session["AccessCode"] = System.Configuration.ConfigurationManager.AppSettings["AccessCode"];
            }
            else
            {
                Session["AccessCode"] = "";
            }
            Session["OptionsSet"] = true;
        }

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

        if (SettingIsSet("APIAccountId") && SettingIsSet("APIUrl") && SettingIsSet("APIUserEmail") && SettingIsSet("Password"))
        {
            if (SettingIsSet("IntegratorsKey"))
            {
                credentials.UserName = "[" + ConfigurationManager.AppSettings["IntegratorsKey"] + "]";
            }
            credentials.UserName += ConfigurationManager.AppSettings["APIUserEmail"];
            credentials.Password = ConfigurationManager.AppSettings["Password"];
            credentials.AccountId = ConfigurationManager.AppSettings["APIAccountId"];
            credentials.ApiUrl = ConfigurationManager.AppSettings["APIUrl"];
        }
        else
        {
            GoToErrorPage("ENTERCREDS");
        }

        return credentials;
    }
    public void checkCreds()
    {
        if (SettingIsSet("APIAccountId") && SettingIsSet("APIUrl") && SettingIsSet("APIUserEmail") && SettingIsSet("Password"))
        {
            CredsAreSet = true;
        }
        else
        {
            CredsAreSet = false;
        }
    }
}
