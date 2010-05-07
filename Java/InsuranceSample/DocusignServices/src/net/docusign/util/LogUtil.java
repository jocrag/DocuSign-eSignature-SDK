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
package net.docusign.util;

import net.docusign.credential.api.ArrayOfAccount.Account;
import net.docusign.ws3_0.api.Document;
import net.docusign.ws3_0.api.DocumentPDFs;
import net.docusign.ws3_0.api.Envelope;
import net.docusign.ws3_0.api.EnvelopeStatus;
import net.docusign.ws3_0.api.EnvelopeStatusFilter;
import net.docusign.ws3_0.api.EnvelopeTemplate;
import net.docusign.ws3_0.api.EnvelopeTemplates;
import net.docusign.ws3_0.api.FilteredEnvelopeStatuses;
import net.docusign.ws3_0.api.Recipient;
import net.docusign.ws3_0.api.SaveTemplateResult;
import net.docusign.ws3_0.api.Tab;

/**
 * Utility to centralize logging statements.
 */
public class LogUtil {
    /* Log the beginning/ending of high-level operations. */
    private static final String DEFERRED_SIGNING_BEGIN = "========== Begin Deferred Signing ==========";
    private static final String DEFERRED_SIGNING_END = "========== End Deferred Signing ==========";
    private static final String EMBEDDED_SENDING_BEGIN = "========== Begin Embedded Sending ==========";
    private static final String EMBEDDED_SENDING_END = "========== End Embedded Sending ==========";
    private static final String EMBEDDED_SIGNING_BEGIN = "========== Begin Embedded Signing ==========";
    private static final String EMBEDDED_SIGNING_END = "========== End Embedded Signing ==========";
    private static final String ENVELOPE_STATUSES_IN_LAST_DAY_BEGIN = "========== Begin Envelope Statuses in last day ==========";
    private static final String ENVELOPE_STATUSES_IN_LAST_DAY_END = "========== End Envelope Statuses in last day ==========";
    private static final String REQUEST_DOCUMENTS_BEGIN = "========== Begin Request Documents ==========";
    private static final String REQUEST_DOCUMENTS_END = "========== End Request Documents ==========";
    
    /* Log the individual webservice calls. */
    private static final String CREDENTIAL_PING_RESPONSE = "[WS RESPONSE] Ping for the credential webservice returned: %s";
    private static final String WS3_0_PING_RESPONSE = "[WS RESPONSE] Ping for the ws3_0 webservice returned: %s";
    private static final String UPLOAD_TEMPLATE_REQUEST = "[WS REQUEST] Executing UploadTemplate for template xml:\n%s";
    private static final String UPLOAD_TEMPLATE_RESPONSE = "[WS RESPONSE] UploadTemplate returned the following information:\n  Template Id: %s\n  Template Name: %s";
    private static final String SAVE_TEMPLATE_REQUEST = "[WS REQUEST] Executing SaveTemplate for template id: %s";
    private static final String SAVE_TEMPLATE_RESPONSE = "[WS RESPONSE] SaveTemplate saved information for template id: %s";
    private static final String CREATE_ENVELOPE_REQUEST = "[WS REQUEST] Executing CreateEnvelope on the deferred sending envelope.";
    private static final String CREATE_ENVELOPE_RESPONSE = "[WS RESPONSE] CreateEnvelope returned the following envelope information:\n  Envelope Id: %s\n  Envelope Status: %s";
    private static final String CREATE_AND_SEND_REQUEST = "[WS REQUEST] Executing CreateAndSend on the Mortgage Envelope.";
    private static final String CREATE_AND_SEND_RESPONSE = "[WS RESPONSE] CreateAndSend returned the following envelope information:\n  Envelope Id: %s\n  Envelope Status: %s";
    private static final String REQUEST_SENDER_TOKEN_REQUEST = "[WS REQUEST] Executing RequestSenderToken on the embedded sending envelope with information:\n  Account Id: %s\n  Envelope Id: %s\n  Callback url: %s";
    private static final String REQUEST_SENDER_TOKEN_RESPONSE = "[WS RESPONSE] RequestSenderToken returned the following embedded sending token: %s";
    private static final String REQUEST_RECIPIENT_TOKEN_REQUEST = "[WS REQUEST] Executing RequestRecipientToken to retrieve in-session URL.";
    private static final String REQUEST_RECIPIENT_TOKEN_RESPONSE = "[WS RESPONSE] RequestRecipientToken returned a token value of: %s";
    private static final String REQUEST_STATUS_REQUEST = "[WS REQUEST] Executing RequestStatus for envelope id: %s";
    private static final String REQUEST_STATUS_RESPONSE = "[WS RESPONSE] RequestStatus returned a status of %s with message '%s'.";
    private static final String REQUEST_STATUSES_REQUEST = "[WS REQUEST] Executing RequestStatuses for filter:\n  Status Qualifier: %s\n  Begin Time: %s\n  End Time: %s";
    private static final String REQUEST_STATUSES_RESPONSE = "[WS RESPONSE] RequestStatuses returned a %s envelope statuses.";
    private static final String REQUEST_DOCUMENT_PDFS_REQUEST = "[WS REQUEST] Executing RequestDocumentPDFs for envelope id: %s";
    private static final String REQUEST_DOCUMENT_PDFS_RESPONSE = "[WS RESPONSE] RequestDocumentPDFs returned with %s documents.";
    private static final String REQUEST_TEMPLATE_REQUEST = "[WS REQUEST] Executing RequestTemplate for template id: %s";
    private static final String REQUEST_TEMPLATE_RESPONSE = "[WS RESPONSE] RequestTemplate returned the '%s' envelope template definition.";
    private static final String REQUEST_TEMPLATES_REQUEST = "[WS REQUEST] Executing RequestTemplates for the account id: %s";
    private static final String REQUEST_TEMPLATES_RESPONSE = "[WS RESPONSE] RequestTemplates returned %s envelope template definitions.";
    
    /* Log the information found in envelope objects (Envelopes, Recipients, Tabs, Documents, etc). */
    private static final String FOUND_ACCOUNT = "Found account with the following details:\n  Account Id: %s\n  Account Name: %s\n  User Id: %s\n  User Name: %s\n  Password: %s";
    private static final String NO_ACCOUNTS = "Could not find any accounts with the following details:\n  User Name: %s\n  Password: %s";
    private static final String ENVELOPE_ACCOUNT_ID = "Envelope account id set to: %s";
    private static final String ENVELOPE_EMAIL = "Envelope email communication details are as follows:\n  Subject: %s\n  Email Blurb: %s";
    private static final String DOCUMENT = "The '%s' document was added to the envelope with an ID of: %s";
    private static final String RECIPIENT = "A recipient signer of type '%s' was added to the envelope, details are:\n  ID: %s\n  User Name: %s\n  Email: %s";
    private static final String TAB = "Tab added to envelope:\n  Tab Name: %s\n  Tab Label: %s\n  Tab Value: %s";
    private static final String SECURITY_DOMAIN = "Security domain that is accessing webservice: %s";
    private static final String ENVELOPE_STATUS = "The envelope status details are:\n  Envelope Id: %s\n  Envelope Status: %s";
    
    public static String logCredentialPingResponse(Boolean pingResponse) {
        return String.format(CREDENTIAL_PING_RESPONSE, pingResponse.toString());
    }
    
    public static String logWS30PingResponse(Boolean pingResponse) {
        return String.format(WS3_0_PING_RESPONSE, pingResponse.toString());
    }
    
    public static String logFoundAccount(Account account, String password) {
        return String.format(FOUND_ACCOUNT, account.getAccountID(), account.getAccountName(), account.getUserID(), account.getUserName(), password);
    }
    
    public static String logNoAccounts(String userName, String password) {
        return String.format(NO_ACCOUNTS, userName, password);
    }
    
    public static String logDeferredSigningBegin() {
        return DEFERRED_SIGNING_BEGIN;
    }
    
    public static String logDeferredSigningEnd() {
        return DEFERRED_SIGNING_END;
    }
    
    public static String logCreateEnvelopeRequest() {
        return CREATE_ENVELOPE_REQUEST;
    }
    
    public static String logEmbeddedSendingBegin() {
        return EMBEDDED_SENDING_BEGIN;
    }
    
    public static String logEmbeddedSendingEnd() {
        return EMBEDDED_SENDING_END;
    }
    
    public static String logRequestSenderTokenRequest(String accountId, String envelopeId, String callbackUrl) {
        return String.format(REQUEST_SENDER_TOKEN_REQUEST, accountId, envelopeId, callbackUrl);
    }
    
    public static String logRequestSenderTokenResponse(String token) {
        return String.format(REQUEST_SENDER_TOKEN_RESPONSE, token);
    }
    
    public static String logEmbeddedSigningBegin() {
        return EMBEDDED_SIGNING_BEGIN;
    }
    
    public static String logEmbeddedSigningEnd() {
        return EMBEDDED_SIGNING_END;
    }
    
    public static String logCreateEnvelopeResponse(EnvelopeStatus envelopeStatus) {
        return String.format(CREATE_ENVELOPE_RESPONSE, envelopeStatus.getEnvelopeID(), envelopeStatus.getStatus().value());
    }
    
    public static String logEnvelopeAccountId(String accountId) {
        return String.format(ENVELOPE_ACCOUNT_ID, accountId);
    }
    
    public static String logDocument(Document document) {
        return String.format(DOCUMENT, document.getName(), document.getID());
    }
    
    public static String logRecipient(Recipient recipient) {
        return String.format(RECIPIENT, recipient.getType(), recipient.getID(), recipient.getUserName(), recipient.getEmail());
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
        return String.format(CREATE_AND_SEND_RESPONSE, envelopeStatus.getEnvelopeID(), envelopeStatus.getStatus().value());
    }
    
    public static String logSecurityDomain(String serverHost) {
        return String.format(SECURITY_DOMAIN, serverHost);
    }
    
    public static String logRequestRecipientTokenRequest() {
        return REQUEST_RECIPIENT_TOKEN_REQUEST;
    }
    
    public static String logRequestRecipientTokenResponse(String token) {
        return String.format(REQUEST_RECIPIENT_TOKEN_RESPONSE, token);
    }
    
    public static String logEnvelopeStatusesInLastDayBegin() {
        return ENVELOPE_STATUSES_IN_LAST_DAY_BEGIN;
    }
    
    public static String logEnvelopeStatusesInLastDayEnd() {
        return ENVELOPE_STATUSES_IN_LAST_DAY_END;
    }
    
    public static String logRequestStatusRequest(String envelopeId) {
        return String.format(REQUEST_STATUS_REQUEST, envelopeId);
    }
    
    public static String logRequestStatusResponse(String envelopeStatus, String statusMessage) {
        return String.format(REQUEST_STATUS_RESPONSE, envelopeStatus, statusMessage);
    }
    
    public static String logRequestStatusesRequest(EnvelopeStatusFilter envelopeStatusFilter) {
        return String.format(REQUEST_STATUSES_REQUEST, envelopeStatusFilter.getBeginDateTime().getStatusQualifier(), envelopeStatusFilter.getBeginDateTime().getValue().toString(), envelopeStatusFilter.getEndDateTime().toString());
    }
    
    public static String logRequestStatusesResponse(FilteredEnvelopeStatuses filteredEnvelopeStatuses) {
        return String.format(REQUEST_STATUSES_RESPONSE, filteredEnvelopeStatuses.getResultSetSize());
    }
    
    public static String logEnvelopeStatus(EnvelopeStatus envelopeStatus) {
        return String.format(ENVELOPE_STATUS, envelopeStatus.getEnvelopeID(), envelopeStatus.getStatus().value());
    }
    
    public static String logRequestDocumentsBegin() {
        return REQUEST_DOCUMENTS_BEGIN;
    }
    
    public static String logRequestDocumentsEnd() {
        return REQUEST_DOCUMENTS_END;
    }
    
    public static String logRequestDocumentPDFsRequest(String envelopeId) {
        return String.format(REQUEST_DOCUMENT_PDFS_REQUEST, envelopeId);
    }
    
    public static String logRequestDocumentPDFsResponse(DocumentPDFs documentPDFs) {
        return String.format(REQUEST_DOCUMENT_PDFS_RESPONSE, documentPDFs.getDocumentPDF().size());
    }
    
    public static String logRequestTemplateRequest(String templateId) {
        return String.format(REQUEST_TEMPLATE_REQUEST, templateId);
    }
    
    public static String logRequestTemplateResponse(EnvelopeTemplate envelopeTemplate) {
        return String.format(REQUEST_TEMPLATE_RESPONSE, envelopeTemplate.getEnvelopeTemplateDefinition().getName());
    }
    
    public static String logRequestTemplatesRequest(String accountId) {
        return String.format(REQUEST_TEMPLATES_REQUEST, accountId);
    }
    
    public static String logRequestTemplatesResponse(EnvelopeTemplates envelopeTemplates) {
        return String.format(REQUEST_TEMPLATES_RESPONSE, envelopeTemplates.getEnvelopeTemplateDefinition().size());
    }
    
    public static String logUploadTemplateRequest(String templateXml) {
        return String.format(UPLOAD_TEMPLATE_REQUEST, templateXml);
    }
    
    public static String logUploadTemplateResponse(SaveTemplateResult saveTemplateResult) {
        return String.format(UPLOAD_TEMPLATE_RESPONSE, saveTemplateResult.getTemplateID(), saveTemplateResult.getName());
    }
    
    public static String logSaveTemplateRequest(String templateId) {
        return String.format(SAVE_TEMPLATE_REQUEST, templateId);
    }
    
    public static String logSaveTemplateResponse(String templateId) {
        return String.format(SAVE_TEMPLATE_RESPONSE, templateId);
    }
}
