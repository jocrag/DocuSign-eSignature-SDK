/*
Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended for production use. 
Code and policy for a production application must be developed to meet the specific data and 
security requirements of the application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED 
OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR 
FITNESS FOR A PARTICULAR PURPOSE.
*/
package net.docusign.loanco.util;

import javax.servlet.http.HttpServletRequest;

import net.docusign.loanco.model.LoanApplicationModel;
import net.docusign.loanco.model.SimpleSignModel;
import net.docusign.www.api._3_0.Document;
import net.docusign.www.api._3_0.Envelope;
import net.docusign.www.api._3_0.EnvelopeStatus;
import net.docusign.www.api._3_0.Recipient;
import net.docusign.www.api._3_0.Tab;

/**
 * Utility to centralize LoanCo logging statements.
 */
public class LogUtil {
    private static final String MORTGAGE_BEGIN = "========== Begin Mortgate application ==========";
    private static final String MORTGAGE_REQUEST = "Apply request for Mortgage on \"Home\" page.  Details were:\n  %s";
    private static final String ENVELOPE_ACCOUNT_ID = "Envelope account id set to: %s";
    private static final String DOCUMENT = "The '%s' document was added to the envelope with an ID of: %s";
    private static final String RECIPIENT_SIGNER = "A recipient signer was added to the envelope, details are:\n  ID: %s\n  User Name: %s\n  Email: %s";
    private static final String TAB = "Tab added to envelope:\n  Tab Name: %s\n  Tab Label: %s\n  Tab Value: %s";
    private static final String ENVELOPE_EMAIL = "Envelope email communication details are as follows:\n  Subject: %s\n  Email Blurb: %s";
    private static final String CREATE_AND_SEND_REQUEST = "[WS REQUEST] Executing CreateAndSend on the Mortgage Envelope.";
    private static final String CREATE_AND_SEND_RESPONSE = "[WS RESPONSE] CreateAndSend returned the following envelope information:\n  Envelope Id: %s\n  Envelope Status: %s";
    private static final String SECURITY_DOMAIN = "Security domain that is accessing webservice: %s (port %s)";
    private static final String IN_SESSION_CALLBACK_URL = "Set In-Session signing callback url to: %s";
    private static final String REQUEST_RECIPIENT_TOKEN_REQUEST = "[WS REQUEST] Executing RequestRecipientToken to retrieve in-session URL.";
    private static final String REQUEST_RECIPIENT_TOKEN_RESPONSE = "[WS RESPONSE] RequestRecipientToken returned a token value of: %s";
    private static final String MORTGAGE_END = "========== End Mortgate application ==========";
    private static final String LOAN_APPLICATION_BEGIN = "========== Begin Loan application ==========";
    private static final String LOAN_APPLICATION_REQUEST = "Apply request for Loan on \"Get a Loan!\" page.  Details were:\n  %s";
    private static final String IN_SIGNING_SESSION_LAUNCH = "Launching Docusign's In-Signing session to complete the signing process.";
    private static final String LOAN_APPLICATION_END = "========== End Loan application ==========";
    private static final String REQUEST_STATUS_REQUEST = "[WS REQUEST] Executing RequestStatus for envelope id: %s";
    private static final String REQUEST_STATUS_RESPONSE = "[WS RESPONSE] RequestStatus returned a status of %s with message '%s'.";
    private static final String RESPONSE_TABS = "Tab completed with the following details:\n  Tab Name: %s\n  Tab Label: %s\n  Tab Value: %s";
    private static final String SIGNING_PROCESS_COMPLETE = "The signing process is complete for envelope id: %s";
    private static final String WS3_0_PING_RESPONSE = "[WS RESPONSE] Ping for the ws3_0 webservice returned: %s";
    
    public static String logWS30PingResponse(Boolean pingResponse) {
        return String.format(WS3_0_PING_RESPONSE, pingResponse.toString());
    }
    
    public static String logMortgageBegin() {
        return MORTGAGE_BEGIN;
    }
    
    public static String logMortgageRequest(SimpleSignModel simpleSignModel) {
        return String.format(MORTGAGE_REQUEST, simpleSignModel.toString());
    }
    
    public static String logEnvelopeAccountId(String accountId) {
        return String.format(ENVELOPE_ACCOUNT_ID, accountId);
    }
    
    public static String logDocument(Document document) {
        return String.format(DOCUMENT, document.getName(), document.getID());
    }
    
    public static String logRecipientSigner(Recipient recipient) {
        return String.format(RECIPIENT_SIGNER, recipient.getID(), recipient.getUserName(), recipient.getEmail());
    }
    
    public static String logTab(Tab tab) {
        return String.format(TAB, tab.getName(), tab.getTabLabel(), tab.getValue());
    }
    
    public static String logEnvelopeEmailSettings(Envelope envelope) {
        return String.format(ENVELOPE_EMAIL, envelope.getSubject(), envelope.getEmailBlurb());
    }
    
    public static String logCreateAndSendRequest() {
        return CREATE_AND_SEND_REQUEST;
    }
    
    public static String logCreateAndSendResponse(EnvelopeStatus envelopeStatus) {
        return String.format(CREATE_AND_SEND_RESPONSE, envelopeStatus.getEnvelopeID(), envelopeStatus.getStatus());
    }
    
    public static String logSecurityDomain(HttpServletRequest request) {
        return String.format(SECURITY_DOMAIN, request.getServerName(), request.getServerPort());
    }
    
    public static String logInSessionCallbackURL(String callbackUrl) {
        return String.format(IN_SESSION_CALLBACK_URL, callbackUrl);
    }
    
    public static String logRequestRecipientTokenRequest() {
        return REQUEST_RECIPIENT_TOKEN_REQUEST;
    }
    
    public static String logRequestRecipientTokenResponse(String token) {
        return String.format(REQUEST_RECIPIENT_TOKEN_RESPONSE, token);
    }
    
    public static String logMortgageEnd() {
        return MORTGAGE_END;
    }
    
    public static String logLoanApplicationBegin() {
        return LOAN_APPLICATION_BEGIN;
    }
    
    public static String logLoanApplicationRequest(LoanApplicationModel loanApplicationModel) {
        return String.format(LOAN_APPLICATION_REQUEST, loanApplicationModel.toString());
    }
    
    public static String logLoanApplicationEnd() {
        return LOAN_APPLICATION_END;
    }

    public static String logLaunchingInSigningSession() {
        return IN_SIGNING_SESSION_LAUNCH;
    }
    
    public static String logRequestStatusRequest(String envelopeId) {
        return String.format(REQUEST_STATUS_REQUEST, envelopeId);
    }
    
    public static String logRequestStatusResponse(String envelopeStatus, String statusMessage) {
        return String.format(REQUEST_STATUS_RESPONSE, envelopeStatus, statusMessage);
    }
    
    public static String logResponseTab(String tabName, String tabLabel, String tabValue) {
        return String.format(RESPONSE_TABS, tabName, tabLabel, tabValue);
    }
    
    public static String logSigningProcessComplete(String envelopeId) {
        return String.format(SIGNING_PROCESS_COMPLETE, envelopeId);
    }
}
