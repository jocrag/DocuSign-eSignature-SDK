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
using System.IO;

public partial class SigningReturn : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            ProcessEvent();
        }
    }

    void ProcessEvent()
    {
        downloadPdf.Enabled = false;
        string uname = Request["uname"];
        string signingEvent = Request["event"];
        switch (signingEvent)
        {
            case "SignComplete":
                downloadPdf.Enabled = true;
                Debug.Assert(Session[Resources.Resource.EnvelopeKey] != null);
                statusLabel.Text = Resources.Resource.SigningEvent_SignComplete;
                break;
            case "ViewComplete":
                statusLabel.Text = Resources.Resource.SigningEvent_ViewComplete;
                break;
            case "Cancel":
                statusLabel.Text = Resources.Resource.SigningEvent_Cancel;
                break;
            case "Decline":
                statusLabel.Text = Resources.Resource.SigningEvent_Decline;
                break;
            case "Timeout":
                statusLabel.Text = Resources.Resource.SigningEvent_Timeout;
                break;
            case "TTLExpired":
                statusLabel.Text = Resources.Resource.SigningEvent_TTLExpired;
                break;
            case "IDCheck":
                statusLabel.Text = Resources.Resource.SigningEvent_IDCheck;
                break;
            case "AccessCode":
                statusLabel.Text = Resources.Resource.SigningEvent_AccessCode;
                break;
            case "Exception":
                statusLabel.Text = Resources.Resource.SigningEvent_Exception;
                break;
            default:
                Debug.Assert(false,
                    "Got an unexpected code back: " + signingEvent);
                // by default assign the return even to the label 
                // to debug the unexpected signing event strings 
                statusLabel.Text = signingEvent;
                break;
        }
    }

    protected void downloadPdf_Click(object sender, EventArgs e)
    {
        Debug.WriteLine("Session ID:" + Session.SessionID);
        Debug.Assert(Session[Resources.Resource.EnvelopeKey] != null);
        Signing.Envelope envelope = (Signing.Envelope)Session[Resources.Resource.EnvelopeKey];
        byte[] bytes = envelope.RetrievePdfBytes();

        Response.Clear();
        Response.AddHeader("Content-Type", "application/pdf") ;
        Response.AddHeader("Content-Length", bytes.Length.ToString()) ;
        Response.AddHeader("Content-Disposition", "attachment; filename=envelope.pdf");
        Response.BinaryWrite(bytes);
        Response.End();
    }
}
