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
package net.docusign.ws3_0.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://www.docusign.net/API/3.0", name = "APIServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface APIServiceSoap {

    @WebResult(name = "RequestTemplateResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RequestTemplate", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestTemplate")
    @ResponseWrapper(localName = "RequestTemplateResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestTemplateResponse")
    @WebMethod(operationName = "RequestTemplate", action = "http://www.docusign.net/API/3.0/RequestTemplate")
    public net.docusign.ws3_0.api.EnvelopeTemplate requestTemplate(
        @WebParam(name = "TemplateID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String templateID,
        @WebParam(name = "IncludeDocumentBytes", targetNamespace = "http://www.docusign.net/API/3.0")
        boolean includeDocumentBytes
    );

    @WebResult(name = "RequestTemplatesResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RequestTemplates", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestTemplates")
    @ResponseWrapper(localName = "RequestTemplatesResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestTemplatesResponse")
    @WebMethod(operationName = "RequestTemplates", action = "http://www.docusign.net/API/3.0/RequestTemplates")
    public net.docusign.ws3_0.api.EnvelopeTemplates requestTemplates(
        @WebParam(name = "AccountID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String accountID
    );

    @WebResult(name = "RequestRecipientTokenResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RequestRecipientToken", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestRecipientToken")
    @ResponseWrapper(localName = "RequestRecipientTokenResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestRecipientTokenResponse")
    @WebMethod(operationName = "RequestRecipientToken", action = "http://www.docusign.net/API/3.0/RequestRecipientToken")
    public java.lang.String requestRecipientToken(
        @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeID,
        @WebParam(name = "ClientUserID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String clientUserID,
        @WebParam(name = "Username", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String username,
        @WebParam(name = "Email", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String email,
        @WebParam(name = "AuthenticationAssertion", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.RequestRecipientTokenAuthenticationAssertion authenticationAssertion,
        @WebParam(name = "ClientURLs", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.RequestRecipientTokenClientURLs clientURLs
    );

    @WebResult(name = "RequestDocumentPDFsResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RequestDocumentPDFs", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestDocumentPDFs")
    @ResponseWrapper(localName = "RequestDocumentPDFsResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestDocumentPDFsResponse")
    @WebMethod(operationName = "RequestDocumentPDFs", action = "http://www.docusign.net/API/3.0/RequestDocumentPDFs")
    public net.docusign.ws3_0.api.DocumentPDFs requestDocumentPDFs(
        @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeID
    );

    @WebResult(name = "RequestPDFResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RequestPDF", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestPDF")
    @ResponseWrapper(localName = "RequestPDFResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestPDFResponse")
    @WebMethod(operationName = "RequestPDF", action = "http://www.docusign.net/API/3.0/RequestPDF")
    public net.docusign.ws3_0.api.EnvelopePDF requestPDF(
        @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeID
    );

    @WebResult(name = "GetAuthenticationTokenResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "GetAuthenticationToken", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetAuthenticationToken")
    @ResponseWrapper(localName = "GetAuthenticationTokenResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetAuthenticationTokenResponse")
    @WebMethod(operationName = "GetAuthenticationToken", action = "http://www.docusign.net/API/3.0/GetAuthenticationToken")
    public java.lang.String getAuthenticationToken(
        @WebParam(name = "GoToEnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String goToEnvelopeID
    );

    @WebResult(name = "CreateEnvelopeFromTemplatesResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "CreateEnvelopeFromTemplates", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.CreateEnvelopeFromTemplates")
    @ResponseWrapper(localName = "CreateEnvelopeFromTemplatesResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.CreateEnvelopeFromTemplatesResponse")
    @WebMethod(operationName = "CreateEnvelopeFromTemplates", action = "http://www.docusign.net/API/3.0/CreateEnvelopeFromTemplates")
    public net.docusign.ws3_0.api.EnvelopeStatus createEnvelopeFromTemplates(
        @WebParam(name = "TemplateReferences", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.ArrayOfTemplateReference templateReferences,
        @WebParam(name = "Recipients", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.ArrayOfRecipient1 recipients,
        @WebParam(name = "EnvelopeInformation", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.EnvelopeInformation envelopeInformation,
        @WebParam(name = "ActivateEnvelope", targetNamespace = "http://www.docusign.net/API/3.0")
        boolean activateEnvelope
    );

    @WebResult(name = "CreateEnvelopeResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "CreateEnvelope", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.CreateEnvelope")
    @ResponseWrapper(localName = "CreateEnvelopeResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.CreateEnvelopeResponse")
    @WebMethod(operationName = "CreateEnvelope", action = "http://www.docusign.net/API/3.0/CreateEnvelope")
    public net.docusign.ws3_0.api.EnvelopeStatus createEnvelope(
        @WebParam(name = "Envelope", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.Envelope envelope
    );

    @WebResult(name = "AcknowledgeAuthoritativeCopyExportResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "AcknowledgeAuthoritativeCopyExport", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.AcknowledgeAuthoritativeCopyExport")
    @ResponseWrapper(localName = "AcknowledgeAuthoritativeCopyExportResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.AcknowledgeAuthoritativeCopyExportResponse")
    @WebMethod(operationName = "AcknowledgeAuthoritativeCopyExport", action = "http://www.docusign.net/API/3.0/AcknowledgeAuthoritativeCopyExport")
    public net.docusign.ws3_0.api.AuthoritativeCopyExportStatus acknowledgeAuthoritativeCopyExport(
        @WebParam(name = "EnvelopeId", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeId,
        @WebParam(name = "TransactionId", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String transactionId,
        @WebParam(name = "checkSumHash", targetNamespace = "http://www.docusign.net/API/3.0")
        byte[] checkSumHash
    );

    @WebResult(name = "UploadTemplateResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "UploadTemplate", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.UploadTemplate")
    @ResponseWrapper(localName = "UploadTemplateResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.UploadTemplateResponse")
    @WebMethod(operationName = "UploadTemplate", action = "http://www.docusign.net/API/3.0/UploadTemplate")
    public net.docusign.ws3_0.api.SaveTemplateResult uploadTemplate(
        @WebParam(name = "TemplateXML", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String templateXML,
        @WebParam(name = "AccountID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String accountID,
        @WebParam(name = "Shared", targetNamespace = "http://www.docusign.net/API/3.0")
        boolean shared
    );

    @WebResult(name = "RequestStatusesExResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RequestStatusesEx", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestStatusesEx")
    @ResponseWrapper(localName = "RequestStatusesExResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestStatusesExResponse")
    @WebMethod(operationName = "RequestStatusesEx", action = "http://www.docusign.net/API/3.0/RequestStatusesEx")
    public net.docusign.ws3_0.api.FilteredEnvelopeStatuses requestStatusesEx(
        @WebParam(name = "EnvelopeStatusFilter", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.EnvelopeStatusFilter envelopeStatusFilter
    );

    @WebResult(name = "CreateAndSendEnvelopeResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "CreateAndSendEnvelope", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.CreateAndSendEnvelope")
    @ResponseWrapper(localName = "CreateAndSendEnvelopeResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.CreateAndSendEnvelopeResponse")
    @WebMethod(operationName = "CreateAndSendEnvelope", action = "http://www.docusign.net/API/3.0/CreateAndSendEnvelope")
    public net.docusign.ws3_0.api.EnvelopeStatus createAndSendEnvelope(
        @WebParam(name = "Envelope", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.Envelope envelope
    );

    @WebResult(name = "GetAddressBookItemsResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "GetAddressBookItems", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetAddressBookItems")
    @ResponseWrapper(localName = "GetAddressBookItemsResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetAddressBookItemsResponse")
    @WebMethod(operationName = "GetAddressBookItems", action = "http://www.docusign.net/API/3.0/GetAddressBookItems")
    public net.docusign.ws3_0.api.ArrayOfAddressBookItem getAddressBookItems(
        @WebParam(name = "AccountID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String accountID
    );

    @WebResult(name = "RequestStatusExResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RequestStatusEx", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestStatusEx")
    @ResponseWrapper(localName = "RequestStatusExResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestStatusExResponse")
    @WebMethod(operationName = "RequestStatusEx", action = "http://www.docusign.net/API/3.0/RequestStatusEx")
    public net.docusign.ws3_0.api.EnvelopeStatus requestStatusEx(
        @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeID
    );

    @WebResult(name = "GetAccountMembershipFeaturesListResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "GetAccountMembershipFeaturesList", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetAccountMembershipFeaturesList")
    @ResponseWrapper(localName = "GetAccountMembershipFeaturesListResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetAccountMembershipFeaturesListResponse")
    @WebMethod(operationName = "GetAccountMembershipFeaturesList", action = "http://www.docusign.net/API/3.0/GetAccountMembershipFeaturesList")
    public net.docusign.ws3_0.api.AccountMembershipFeaturesList getAccountMembershipFeaturesList(
        @WebParam(name = "AccountId", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String accountId
    );

    @WebResult(name = "GetRecipientListResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "GetRecipientList", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetRecipientList")
    @ResponseWrapper(localName = "GetRecipientListResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetRecipientListResponse")
    @WebMethod(operationName = "GetRecipientList", action = "http://www.docusign.net/API/3.0/GetRecipientList")
    public net.docusign.ws3_0.api.RecipientList getRecipientList(
        @WebParam(name = "SenderAccountId", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String senderAccountId,
        @WebParam(name = "RecipientEmail", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String recipientEmail
    );

    @WebResult(name = "SynchEnvelopeResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "SynchEnvelope", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.SynchEnvelope")
    @ResponseWrapper(localName = "SynchEnvelopeResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.SynchEnvelopeResponse")
    @WebMethod(operationName = "SynchEnvelope", action = "http://www.docusign.net/API/3.0/SynchEnvelope")
    public net.docusign.ws3_0.api.SynchEnvelopeStatus synchEnvelope(
        @WebParam(name = "TransactionID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String transactionID,
        @WebParam(name = "AccountID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String accountID,
        @WebParam(name = "Block", targetNamespace = "http://www.docusign.net/API/3.0")
        boolean block
    );

    @WebResult(name = "UpdateAddressBookItemsResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "UpdateAddressBookItems", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.UpdateAddressBookItems")
    @ResponseWrapper(localName = "UpdateAddressBookItemsResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.UpdateAddressBookItemsResponse")
    @WebMethod(operationName = "UpdateAddressBookItems", action = "http://www.docusign.net/API/3.0/UpdateAddressBookItems")
    public net.docusign.ws3_0.api.UpdateAddressBookResult updateAddressBookItems(
        @WebParam(name = "AddressBookItems", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.ArrayOfAddressBookItem addressBookItems,
        @WebParam(name = "ReturnAddressBook", targetNamespace = "http://www.docusign.net/API/3.0")
        boolean returnAddressBook
    );

    @WebResult(name = "GetStatusInDocuSignConnectFormatResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "GetStatusInDocuSignConnectFormat", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetStatusInDocuSignConnectFormat")
    @ResponseWrapper(localName = "GetStatusInDocuSignConnectFormatResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetStatusInDocuSignConnectFormatResponse")
    @WebMethod(operationName = "GetStatusInDocuSignConnectFormat", action = "http://www.docusign.net/API/3.0/GetStatusInDocuSignConnectFormat")
    public net.docusign.ws3_0.api.DocuSignEnvelopeInformation getStatusInDocuSignConnectFormat(
        @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeID
    );

    @WebResult(name = "GetAccountSettingsListResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "GetAccountSettingsList", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetAccountSettingsList")
    @ResponseWrapper(localName = "GetAccountSettingsListResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetAccountSettingsListResponse")
    @WebMethod(operationName = "GetAccountSettingsList", action = "http://www.docusign.net/API/3.0/GetAccountSettingsList")
    public net.docusign.ws3_0.api.AccountSettingsList getAccountSettingsList(
        @WebParam(name = "AccountId", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String accountId
    );

    @WebResult(name = "RequestDocumentPDFsExResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RequestDocumentPDFsEx", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestDocumentPDFsEx")
    @ResponseWrapper(localName = "RequestDocumentPDFsExResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestDocumentPDFsExResponse")
    @WebMethod(operationName = "RequestDocumentPDFsEx", action = "http://www.docusign.net/API/3.0/RequestDocumentPDFsEx")
    public net.docusign.ws3_0.api.DocumentPDFs requestDocumentPDFsEx(
        @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeID
    );

    @WebResult(name = "RemoveAddressBookItemsResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RemoveAddressBookItems", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RemoveAddressBookItems")
    @ResponseWrapper(localName = "RemoveAddressBookItemsResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RemoveAddressBookItemsResponse")
    @WebMethod(operationName = "RemoveAddressBookItems", action = "http://www.docusign.net/API/3.0/RemoveAddressBookItems")
    public net.docusign.ws3_0.api.UpdateAddressBookResult removeAddressBookItems(
        @WebParam(name = "AddressBookRemoveItems", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.ArrayOfAddressBookRemoveItem addressBookRemoveItems,
        @WebParam(name = "ReturnAddressBook", targetNamespace = "http://www.docusign.net/API/3.0")
        boolean returnAddressBook
    );

    @WebResult(name = "SaveTemplateResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "SaveTemplate", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.SaveTemplate")
    @ResponseWrapper(localName = "SaveTemplateResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.SaveTemplateResponse")
    @WebMethod(operationName = "SaveTemplate", action = "http://www.docusign.net/API/3.0/SaveTemplate")
    public net.docusign.ws3_0.api.SaveTemplateResult saveTemplate(
        @WebParam(name = "EnvelopeTemplate", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.EnvelopeTemplate envelopeTemplate
    );

    @WebResult(name = "PingResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "Ping", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.Ping")
    @ResponseWrapper(localName = "PingResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.PingResponse")
    @WebMethod(operationName = "Ping", action = "http://www.docusign.net/API/3.0/Ping")
    public boolean ping();

    @WebResult(name = "GetRecipientEsignListResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "GetRecipientEsignList", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetRecipientEsignList")
    @ResponseWrapper(localName = "GetRecipientEsignListResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.GetRecipientEsignListResponse")
    @WebMethod(operationName = "GetRecipientEsignList", action = "http://www.docusign.net/API/3.0/GetRecipientEsignList")
    public net.docusign.ws3_0.api.RecipientEsignList getRecipientEsignList(
        @WebParam(name = "UserName", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String userName,
        @WebParam(name = "SenderEmail", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String senderEmail,
        @WebParam(name = "SenderAccountId", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String senderAccountId,
        @WebParam(name = "RecipientEmail", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String recipientEmail
    );

    @WebResult(name = "RequestStatusesResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RequestStatuses", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestStatuses")
    @ResponseWrapper(localName = "RequestStatusesResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestStatusesResponse")
    @WebMethod(operationName = "RequestStatuses", action = "http://www.docusign.net/API/3.0/RequestStatuses")
    public net.docusign.ws3_0.api.FilteredEnvelopeStatuses requestStatuses(
        @WebParam(name = "EnvelopeStatusFilter", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.EnvelopeStatusFilter envelopeStatusFilter
    );

    @WebResult(name = "CorrectAndResendEnvelopeResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "CorrectAndResendEnvelope", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.CorrectAndResendEnvelope")
    @ResponseWrapper(localName = "CorrectAndResendEnvelopeResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.CorrectAndResendEnvelopeResponse")
    @WebMethod(operationName = "CorrectAndResendEnvelope", action = "http://www.docusign.net/API/3.0/CorrectAndResendEnvelope")
    public net.docusign.ws3_0.api.CorrectionStatus correctAndResendEnvelope(
        @WebParam(name = "Correction", targetNamespace = "http://www.docusign.net/API/3.0")
        net.docusign.ws3_0.api.Correction correction
    );

    @WebResult(name = "RequestDocumentPDFsRecipientsViewResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RequestDocumentPDFsRecipientsView", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestDocumentPDFsRecipientsView")
    @ResponseWrapper(localName = "RequestDocumentPDFsRecipientsViewResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestDocumentPDFsRecipientsViewResponse")
    @WebMethod(operationName = "RequestDocumentPDFsRecipientsView", action = "http://www.docusign.net/API/3.0/RequestDocumentPDFsRecipientsView")
    public net.docusign.ws3_0.api.DocumentPDFs requestDocumentPDFsRecipientsView(
        @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeID,
        @WebParam(name = "RecipientName", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String recipientName,
        @WebParam(name = "RecipientEmail", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String recipientEmail
    );

    @WebResult(name = "TransferEnvelopeResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "TransferEnvelope", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.TransferEnvelope")
    @ResponseWrapper(localName = "TransferEnvelopeResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.TransferEnvelopeResponse")
    @WebMethod(operationName = "TransferEnvelope", action = "http://www.docusign.net/API/3.0/TransferEnvelope")
    public net.docusign.ws3_0.api.TransferEnvelopeStatus transferEnvelope(
        @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeID,
        @WebParam(name = "AccountID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String accountID,
        @WebParam(name = "UserID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String userID
    );

    @WebResult(name = "RequestSenderTokenResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RequestSenderToken", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestSenderToken")
    @ResponseWrapper(localName = "RequestSenderTokenResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestSenderTokenResponse")
    @WebMethod(operationName = "RequestSenderToken", action = "http://www.docusign.net/API/3.0/RequestSenderToken")
    public java.lang.String requestSenderToken(
        @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeID,
        @WebParam(name = "AccountID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String accountID,
        @WebParam(name = "ReturnURL", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String returnURL
    );

    @WebResult(name = "ExportAuthoritativeCopyResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "ExportAuthoritativeCopy", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.ExportAuthoritativeCopy")
    @ResponseWrapper(localName = "ExportAuthoritativeCopyResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.ExportAuthoritativeCopyResponse")
    @WebMethod(operationName = "ExportAuthoritativeCopy", action = "http://www.docusign.net/API/3.0/ExportAuthoritativeCopy")
    public net.docusign.ws3_0.api.AuthoritativeCopyExportDocuments exportAuthoritativeCopy(
        @WebParam(name = "EnvelopeId", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeId
    );

    @WebResult(name = "EnvelopeAuditEventsResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "EnvelopeAuditEvents", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.EnvelopeAuditEvents")
    @ResponseWrapper(localName = "EnvelopeAuditEventsResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.EnvelopeAuditEventsResponse")
    @WebMethod(operationName = "EnvelopeAuditEvents", action = "http://www.docusign.net/API/3.0/EnvelopeAuditEvents")
    public net.docusign.ws3_0.api.EnvelopeAuditEventsResponse.EnvelopeAuditEventsResult envelopeAuditEvents(
        @WebParam(name = "EnvelopeId", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeId
    );

    @WebResult(name = "VoidEnvelopeResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "VoidEnvelope", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.VoidEnvelope")
    @ResponseWrapper(localName = "VoidEnvelopeResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.VoidEnvelopeResponse")
    @WebMethod(operationName = "VoidEnvelope", action = "http://www.docusign.net/API/3.0/VoidEnvelope")
    public net.docusign.ws3_0.api.VoidEnvelopeStatus voidEnvelope(
        @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeID,
        @WebParam(name = "Reason", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String reason
    );

    @WebResult(name = "PurgeDocumentsResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "PurgeDocuments", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.PurgeDocuments")
    @ResponseWrapper(localName = "PurgeDocumentsResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.PurgeDocumentsResponse")
    @WebMethod(operationName = "PurgeDocuments", action = "http://www.docusign.net/API/3.0/PurgeDocuments")
    public net.docusign.ws3_0.api.PurgeDocumentStatus purgeDocuments(
        @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeID
    );

    @WebResult(name = "RequestStatusResult", targetNamespace = "http://www.docusign.net/API/3.0")
    @RequestWrapper(localName = "RequestStatus", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestStatus")
    @ResponseWrapper(localName = "RequestStatusResponse", targetNamespace = "http://www.docusign.net/API/3.0", className = "net.docusign.ws3_0.api.RequestStatusResponse")
    @WebMethod(operationName = "RequestStatus", action = "http://www.docusign.net/API/3.0/RequestStatus")
    public net.docusign.ws3_0.api.EnvelopeStatus requestStatus(
        @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/3.0")
        java.lang.String envelopeID
    );
}
