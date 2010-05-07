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
using System.IO;
using System.Text;
using Signing;
using System.Diagnostics;

public partial class SimpleFormSigning : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            StartSend(Request["FirstName"], Request["LastName"], Request["AddressLine1"],
                Request["AddressLine2"], Request["City"], Request["State"], Request["Zip"],
                Request["HomePhone"], Request["eMail"]);
        }
    }

    /// <summary>
    /// A function that forms the request to start signing
    /// </summary>
    private void StartSend(string firstName, string lastName,
        string addressLine1, string addressLine2, string city, string state,
        string zip, string phone, string email)
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
        signers[0].UserName = firstName + " " + lastName;
        signers[0].Type = Signing.DocuSignWeb.RecipientTypeCode.Signer;
        signers[0].CaptiveInfo = new Signing.DocuSignWeb.RecipientCaptiveInfo();
        signers[0].CaptiveInfo.ClientUserId = Session.SessionID;
        signers[0].SignatureInfo = new Signing.DocuSignWeb.RecipientSignatureInfo();
        signers[0].SignatureInfo.SignatureInitials = 
            (firstName.Length > 0 ? firstName.Substring(0,1) : "")
            + (lastName.Length > 0 ? lastName.Substring(0,1) : "");
        signers[0].SignatureInfo.FontStyle = Signing.DocuSignWeb.FontStyleCode.BradleyHandITC;
        signers[0].SignatureInfo.SignatureName = firstName + " " + lastName;
        signers[0].RequireIDLookup = false;
        
        //
        // the tabs
        //
        LinkedTab[] tabs = new LinkedTab[]
            {   LinkedTab.CreateTab(signers[0], "E-mail", email, 1, 190, 186, true, true),
                LinkedTab.CreateTab(signers[0], "Phone", phone, 1, 190, 173, true, true),
                LinkedTab.CreateTab(signers[0], "Zip", zip, 1, 342, 160, true, true),
                LinkedTab.CreateTab(signers[0], "State", state, 1, 255, 160, true, true),
                LinkedTab.CreateTab(signers[0], "City", city, 1, 190, 160, true, true),
                LinkedTab.CreateTab(signers[0], "AddressLine2", String.IsNullOrEmpty(addressLine2) ? " " : addressLine2, 1, 190, 147, false, true),
                LinkedTab.CreateTab(signers[0], "AddressLine1", addressLine1, 1, 190, 134, true, true),
                LinkedTab.CreateTab(Signing.DocuSignWeb.TabTypeCode.FullName, signers[0], 1, 190, 118),
                LinkedTab.CreateTab(Signing.DocuSignWeb.TabTypeCode.SignHere, signers[0], 1, 373, 185),
                LinkedTab.CreateTab(Signing.DocuSignWeb.TabTypeCode.DateSigned, signers[0], 2, 190, 532 ),
                LinkedTab.CreateTab(Signing.DocuSignWeb.TabTypeCode.InitialHereOptional, signers[0], 2, 190, 465)
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
        docs[0].Document.Name = "Sample PDF";
        using (System.IO.FileStream streamReader = new System.IO.FileStream(
            Server.MapPath("SampleDoc.pdf"),
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

        string retUrl = Request.Url.AbsoluteUri.Replace("SimpleFormSigning.aspx", "SigningReturn.aspx");

        string token = envelope.RequestRecipientToken( signers[0],
            assert,
            Envelope.StandardUrls(new System.Uri(retUrl, UriKind.Absolute), signers[0].CaptiveInfo.ClientUserId));
        frame1.Attributes["src"] = token;
        Session[Resources.Resource.EnvelopeKey] = envelope;
    }
}
