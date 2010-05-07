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
using System.Data;
using System.Configuration;
using System.Collections;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using System.Diagnostics;
using Signing;
using System.IO;

public partial class TemplateBasedForm : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            StartSend(Request["FullName"], Request["EMail"], Request["Phone"],
                Request["AccountNumber"]);
        }
    }

    /// <summary>
    /// A function that puts all the parameters into 
    /// </summary>
    private void StartSend(string fullName, string email,
        string phone, string account)
    {
        Debug.WriteLine("Session ID:" + Session.SessionID);

        //
        // the signer
        // 
        Signing.DocuSignWeb.Recipient[] signers = { new Signing.DocuSignWeb.Recipient() };
        signers[0].Email = email;
        signers[0].UserName = fullName;
        signers[0].Type = Signing.DocuSignWeb.RecipientTypeCode.Signer;
        signers[0].CaptiveInfo = new Signing.DocuSignWeb.RecipientCaptiveInfo();
        signers[0].CaptiveInfo.ClientUserId = Session.SessionID;
        signers[0].SignatureInfo = new Signing.DocuSignWeb.RecipientSignatureInfo();
        signers[0].SignatureInfo.SignatureInitials = ExtractInitials(fullName);
        signers[0].SignatureInfo.FontStyle = Signing.DocuSignWeb.FontStyleCode.Mistral;
        signers[0].SignatureInfo.SignatureName = fullName;

        //
        // generate role assignments
        LinkedTemplateReferenceRoleAssignment[] roleAssignments = new LinkedTemplateReferenceRoleAssignment[] { new LinkedTemplateReferenceRoleAssignment(signers[0], "Signer1") };

        Signing.DocuSignWeb.CustomField[] fields = new Signing.DocuSignWeb.CustomField[1];
        fields[0] = new Signing.DocuSignWeb.CustomField();
        fields[0].Name = "AccountNumber";
        fields[0].Required = true.ToString();
        fields[0].Show = true.ToString();
        fields[0].Value = account;

        AccountCredentials credentials = new AccountCredentials();

        if (ConfigurationManager.AppSettings["APIAccountId"] != null &&
            ConfigurationManager.AppSettings["APIUrl"] != null)
        {
            // credentials for signing
            credentials.AccountId = ConfigurationManager.AppSettings["APIAccountId"];
            credentials.ApiUrl = ConfigurationManager.AppSettings["APIUrl"];
        }
        else
        {
            Response.Write("Missing Configuration settings for connecting to DocuSign API, Please fix");
            Response.End();
        }
        //
        // the tempalte
        //
        string templateBytes = File.ReadAllText(Server.MapPath("sampleTemplate.dpd"));

        Envelope envelope = Envelope.CreateEnvelopeFromTemplates(
            credentials, signers, roleAssignments,
            templateBytes,
            "Testing Signing Integration - " + DateTime.UtcNow.ToShortTimeString(),
            "Hello!  This was submitted from a sample application",
            fields);

        //
        // now get the in session token
        //
        Signing.DocuSignWeb.RequestRecipientTokenAuthenticationAssertion assert = new Signing.DocuSignWeb.RequestRecipientTokenAuthenticationAssertion();
        assert.AssertionID = System.DateTime.Now.Ticks.ToString();
        assert.AuthenticationInstant = System.DateTime.Now;
        assert.AuthenticationMethod = Signing.DocuSignWeb.RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.Password;
        assert.SecurityDomain = Request.Url.Host;

        string retUrl = Request.Url.AbsoluteUri.Replace("TemplateBasedForm.aspx", "SigningReturn.aspx");
        string token = envelope.RequestRecipientToken(signers[0],
            assert,
            Envelope.StandardUrls(new System.Uri(retUrl, UriKind.Absolute), signers[0].CaptiveInfo.ClientUserId));
        frame1.Attributes["src"] = token;
        Session[Resources.Resource.EnvelopeKey] = envelope;
    }

    /// <summary>
    /// a quick helper function to derive an initial from a full name
    /// </summary>
    /// <param name="fullName"></param>
    /// <returns></returns>
    private static string ExtractInitials(string fullName)
    {
        string[] parts = fullName.Split(new char[]{' '});
        string ret = "";
        foreach (string part in parts)
        {
            if (part.Length > 1)
            {
                ret = ret + part[0];
            }
        }
        return ret; 
    }
}
