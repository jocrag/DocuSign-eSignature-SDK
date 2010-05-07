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
using System.Text.RegularExpressions;

public partial class AnchorBasedForm : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            StartSend(Request["FullName"], Request["EMail"], Request["Phone"],
                Request["Amount"], Request["LoanPdf"]);
        }
    }

    /// <summary>
    /// A function that puts all the parameters into 
    /// </summary>
    private void StartSend(string fullName, string email,
        string phone, string amount, string loanPdf)
    {

        //TextWriter tw = new StreamWriter(Request.ServerVariables["APPL_PHYSICAL_PATH"] + "Loan.log", true);
        //tw.WriteLine("[" + Request.ServerVariables["REMOTE_ADDR"] + "] - " + DateTime.Now.ToString() + " - Get SampleDoc");
        //tw.Close();

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


        int amountNumber = 0;
        Int32.TryParse( amount, out amountNumber);
        //
        // the tabs
        //
        // NOTE: for a complicated solution please pick hidden text that is not likely to 
        // appear anywhere in the text.  We have picked E-mail: and Name: here because
        // the solution is very small.  In a complex form a simple anchor tag might result
        // in unintentional tabs being placed.
        LinkedTab[] tabs = new LinkedTab[]
            {   LinkedTab.CreateTab(signers[0], "E-mail", email, "E-mail:", 200, -2),
                LinkedTab.CreateTab(signers[0], "Phone", phone, "Phone:", 200, -2),
                LinkedTab.CreateTab(Signing.DocuSignWeb.TabTypeCode.FullName, signers[0], "Name:", 200, -2),
                LinkedTab.CreateTab(signers[0], "Amount:", amountNumber.ToString("C", System.Globalization.CultureInfo.CurrentCulture), "Amount:", 200, -2),
                LinkedTab.CreateTab(Signing.DocuSignWeb.TabTypeCode.SignHere, signers[0], "X:", 30, 8)
            };

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
        // the document
        //
        LinkedDocument[] docs = { new LinkedDocument() };
        docs[0].Document.Name = loanPdf;
        using (System.IO.FileStream streamReader = new System.IO.FileStream(
            Server.MapPath(loanPdf + ".pdf"),
            System.IO.FileMode.Open, System.IO.FileAccess.Read))
        {
            byte[] pdfBytes = new byte[streamReader.Length];
            streamReader.Read(pdfBytes, 0, (int)streamReader.Length);
            docs[0].Document.PDFBytes = pdfBytes;
        }
        docs[0].Tabs = tabs;

        Envelope envelope = Envelope.CreateAndSendEnvelope(
            credentials, signers, docs,
            "Testing Signing Integration - " + DateTime.UtcNow.ToShortTimeString(),
            "Hello!  This was submitted from a sample application");

        //
        // now get the in session token
        //
        Signing.DocuSignWeb.RequestRecipientTokenAuthenticationAssertion assert = new Signing.DocuSignWeb.RequestRecipientTokenAuthenticationAssertion();
        assert.AssertionID = System.DateTime.Now.Ticks.ToString();
        assert.AuthenticationInstant = System.DateTime.Now;
        assert.AuthenticationMethod = Signing.DocuSignWeb.RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.Password;
        assert.SecurityDomain = "dsx.test";

        string retUrl = Request.Url.AbsoluteUri.Replace("AnchorBasedForm.aspx", "SigningReturn.aspx");
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
