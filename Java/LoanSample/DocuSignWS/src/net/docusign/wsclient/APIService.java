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
package net.docusign.wsclient;

/*
 *  APIService java interface
 */

public interface APIService {

    /**
     * Auto generated method signature
     *
     * @param requestTemplate0
     */
    public net.docusign.www.api._3_0.RequestTemplateResponse requestTemplate(net.docusign.www.api._3_0.RequestTemplate requestTemplate0) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param requestTemplate0
     */
    public void startrequestTemplate(net.docusign.www.api._3_0.RequestTemplate requestTemplate0, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param requestTemplates2
     */
    public net.docusign.www.api._3_0.RequestTemplatesResponse requestTemplates(net.docusign.www.api._3_0.RequestTemplates requestTemplates2) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param requestTemplates2
     */
    public void startrequestTemplates(net.docusign.www.api._3_0.RequestTemplates requestTemplates2, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param requestRecipientToken4
     */
    public net.docusign.www.api._3_0.RequestRecipientTokenResponse requestRecipientToken(net.docusign.www.api._3_0.RequestRecipientToken requestRecipientToken4) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param requestRecipientToken4
     */
    public void startrequestRecipientToken(net.docusign.www.api._3_0.RequestRecipientToken requestRecipientToken4, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param requestDocumentPDFs6
     */
    public net.docusign.www.api._3_0.RequestDocumentPDFsResponse requestDocumentPDFs(net.docusign.www.api._3_0.RequestDocumentPDFs requestDocumentPDFs6) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param requestDocumentPDFs6
     */
    public void startrequestDocumentPDFs(net.docusign.www.api._3_0.RequestDocumentPDFs requestDocumentPDFs6, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param requestPDF8
     */
    public net.docusign.www.api._3_0.RequestPDFResponse requestPDF(net.docusign.www.api._3_0.RequestPDF requestPDF8) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param requestPDF8
     */
    public void startrequestPDF(net.docusign.www.api._3_0.RequestPDF requestPDF8, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAuthenticationToken10
     */
    public net.docusign.www.api._3_0.GetAuthenticationTokenResponse getAuthenticationToken(net.docusign.www.api._3_0.GetAuthenticationToken getAuthenticationToken10) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAuthenticationToken10
     */
    public void startgetAuthenticationToken(net.docusign.www.api._3_0.GetAuthenticationToken getAuthenticationToken10, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createEnvelopeFromTemplates12
     */
    public net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse createEnvelopeFromTemplates(net.docusign.www.api._3_0.CreateEnvelopeFromTemplates createEnvelopeFromTemplates12) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createEnvelopeFromTemplates12
     */
    public void startcreateEnvelopeFromTemplates(net.docusign.www.api._3_0.CreateEnvelopeFromTemplates createEnvelopeFromTemplates12, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createEnvelope14
     */
    public net.docusign.www.api._3_0.CreateEnvelopeResponse createEnvelope(net.docusign.www.api._3_0.CreateEnvelope createEnvelope14) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createEnvelope14
     */
    public void startcreateEnvelope(net.docusign.www.api._3_0.CreateEnvelope createEnvelope14, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param acknowledgeAuthoritativeCopyExport16
     */
    public net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse acknowledgeAuthoritativeCopyExport(net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport acknowledgeAuthoritativeCopyExport16) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param acknowledgeAuthoritativeCopyExport16
     */
    public void startacknowledgeAuthoritativeCopyExport(net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport acknowledgeAuthoritativeCopyExport16, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param uploadTemplate18
     */
    public net.docusign.www.api._3_0.UploadTemplateResponse uploadTemplate(net.docusign.www.api._3_0.UploadTemplate uploadTemplate18) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param uploadTemplate18
     */
    public void startuploadTemplate(net.docusign.www.api._3_0.UploadTemplate uploadTemplate18, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param requestStatusesEx20
     */
    public net.docusign.www.api._3_0.RequestStatusesExResponse requestStatusesEx(net.docusign.www.api._3_0.RequestStatusesEx requestStatusesEx20) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param requestStatusesEx20
     */
    public void startrequestStatusesEx(net.docusign.www.api._3_0.RequestStatusesEx requestStatusesEx20, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param createAndSendEnvelope22
     */
    public net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse createAndSendEnvelope(net.docusign.www.api._3_0.CreateAndSendEnvelope createAndSendEnvelope22) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param createAndSendEnvelope22
     */
    public void startcreateAndSendEnvelope(net.docusign.www.api._3_0.CreateAndSendEnvelope createAndSendEnvelope22, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAddressBookItems24
     */
    public net.docusign.www.api._3_0.GetAddressBookItemsResponse getAddressBookItems(net.docusign.www.api._3_0.GetAddressBookItems getAddressBookItems24) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAddressBookItems24
     */
    public void startgetAddressBookItems(net.docusign.www.api._3_0.GetAddressBookItems getAddressBookItems24, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param requestStatusEx26
     */
    public net.docusign.www.api._3_0.RequestStatusExResponse requestStatusEx(net.docusign.www.api._3_0.RequestStatusEx requestStatusEx26) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param requestStatusEx26
     */
    public void startrequestStatusEx(net.docusign.www.api._3_0.RequestStatusEx requestStatusEx26, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAccountMembershipFeaturesList28
     */
    public net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse getAccountMembershipFeaturesList(net.docusign.www.api._3_0.GetAccountMembershipFeaturesList getAccountMembershipFeaturesList28) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAccountMembershipFeaturesList28
     */
    public void startgetAccountMembershipFeaturesList(net.docusign.www.api._3_0.GetAccountMembershipFeaturesList getAccountMembershipFeaturesList28, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getRecipientList30
     */
    public net.docusign.www.api._3_0.GetRecipientListResponse getRecipientList(net.docusign.www.api._3_0.GetRecipientList getRecipientList30) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getRecipientList30
     */
    public void startgetRecipientList(net.docusign.www.api._3_0.GetRecipientList getRecipientList30, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param synchEnvelope32
     */
    public net.docusign.www.api._3_0.SynchEnvelopeResponse synchEnvelope(net.docusign.www.api._3_0.SynchEnvelope synchEnvelope32) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param synchEnvelope32
     */
    public void startsynchEnvelope(net.docusign.www.api._3_0.SynchEnvelope synchEnvelope32, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateAddressBookItems34
     */
    public net.docusign.www.api._3_0.UpdateAddressBookItemsResponse updateAddressBookItems(net.docusign.www.api._3_0.UpdateAddressBookItems updateAddressBookItems34) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateAddressBookItems34
     */
    public void startupdateAddressBookItems(net.docusign.www.api._3_0.UpdateAddressBookItems updateAddressBookItems34, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getStatusInDocuSignConnectFormat36
     */
    public net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse getStatusInDocuSignConnectFormat(net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat getStatusInDocuSignConnectFormat36) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getStatusInDocuSignConnectFormat36
     */
    public void startgetStatusInDocuSignConnectFormat(net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat getStatusInDocuSignConnectFormat36, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAccountSettingsList38
     */
    public net.docusign.www.api._3_0.GetAccountSettingsListResponse getAccountSettingsList(net.docusign.www.api._3_0.GetAccountSettingsList getAccountSettingsList38) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAccountSettingsList38
     */
    public void startgetAccountSettingsList(net.docusign.www.api._3_0.GetAccountSettingsList getAccountSettingsList38, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param requestDocumentPDFsEx40
     */
    public net.docusign.www.api._3_0.RequestDocumentPDFsExResponse requestDocumentPDFsEx(net.docusign.www.api._3_0.RequestDocumentPDFsEx requestDocumentPDFsEx40) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param requestDocumentPDFsEx40
     */
    public void startrequestDocumentPDFsEx(net.docusign.www.api._3_0.RequestDocumentPDFsEx requestDocumentPDFsEx40, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param removeAddressBookItems42
     */
    public net.docusign.www.api._3_0.RemoveAddressBookItemsResponse removeAddressBookItems(net.docusign.www.api._3_0.RemoveAddressBookItems removeAddressBookItems42) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param removeAddressBookItems42
     */
    public void startremoveAddressBookItems(net.docusign.www.api._3_0.RemoveAddressBookItems removeAddressBookItems42, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param saveTemplate44
     */
    public net.docusign.www.api._3_0.SaveTemplateResponse saveTemplate(net.docusign.www.api._3_0.SaveTemplate saveTemplate44) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param saveTemplate44
     */
    public void startsaveTemplate(net.docusign.www.api._3_0.SaveTemplate saveTemplate44, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param ping46
     */
    public net.docusign.www.api._3_0.PingResponse ping(net.docusign.www.api._3_0.Ping ping46) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param ping46
     */
    public void startping(net.docusign.www.api._3_0.Ping ping46, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getRecipientEsignList48
     */
    public net.docusign.www.api._3_0.GetRecipientEsignListResponse getRecipientEsignList(net.docusign.www.api._3_0.GetRecipientEsignList getRecipientEsignList48) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getRecipientEsignList48
     */
    public void startgetRecipientEsignList(net.docusign.www.api._3_0.GetRecipientEsignList getRecipientEsignList48, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param requestStatuses50
     */
    public net.docusign.www.api._3_0.RequestStatusesResponse requestStatuses(net.docusign.www.api._3_0.RequestStatuses requestStatuses50) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param requestStatuses50
     */
    public void startrequestStatuses(net.docusign.www.api._3_0.RequestStatuses requestStatuses50, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param correctAndResendEnvelope52
     */
    public net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse correctAndResendEnvelope(net.docusign.www.api._3_0.CorrectAndResendEnvelope correctAndResendEnvelope52) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param correctAndResendEnvelope52
     */
    public void startcorrectAndResendEnvelope(net.docusign.www.api._3_0.CorrectAndResendEnvelope correctAndResendEnvelope52, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param requestDocumentPDFsRecipientsView54
     */
    public net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse requestDocumentPDFsRecipientsView(net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView requestDocumentPDFsRecipientsView54) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param requestDocumentPDFsRecipientsView54
     */
    public void startrequestDocumentPDFsRecipientsView(net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView requestDocumentPDFsRecipientsView54, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param transferEnvelope56
     */
    public net.docusign.www.api._3_0.TransferEnvelopeResponse transferEnvelope(net.docusign.www.api._3_0.TransferEnvelope transferEnvelope56) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param transferEnvelope56
     */
    public void starttransferEnvelope(net.docusign.www.api._3_0.TransferEnvelope transferEnvelope56, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param requestSenderToken58
     */
    public net.docusign.www.api._3_0.RequestSenderTokenResponse requestSenderToken(net.docusign.www.api._3_0.RequestSenderToken requestSenderToken58) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param requestSenderToken58
     */
    public void startrequestSenderToken(net.docusign.www.api._3_0.RequestSenderToken requestSenderToken58, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param exportAuthoritativeCopy60
     */
    public net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse exportAuthoritativeCopy(net.docusign.www.api._3_0.ExportAuthoritativeCopy exportAuthoritativeCopy60) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param exportAuthoritativeCopy60
     */
    public void startexportAuthoritativeCopy(net.docusign.www.api._3_0.ExportAuthoritativeCopy exportAuthoritativeCopy60, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param envelopeAuditEvents62
     */
    public net.docusign.www.api._3_0.EnvelopeAuditEventsResponse envelopeAuditEvents(net.docusign.www.api._3_0.EnvelopeAuditEvents envelopeAuditEvents62) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param envelopeAuditEvents62
     */
    public void startenvelopeAuditEvents(net.docusign.www.api._3_0.EnvelopeAuditEvents envelopeAuditEvents62, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param voidEnvelope64
     */
    public net.docusign.www.api._3_0.VoidEnvelopeResponse voidEnvelope(net.docusign.www.api._3_0.VoidEnvelope voidEnvelope64) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param voidEnvelope64
     */
    public void startvoidEnvelope(net.docusign.www.api._3_0.VoidEnvelope voidEnvelope64, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param purgeDocuments66
     */
    public net.docusign.www.api._3_0.PurgeDocumentsResponse purgeDocuments(net.docusign.www.api._3_0.PurgeDocuments purgeDocuments66) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param purgeDocuments66
     */
    public void startpurgeDocuments(net.docusign.www.api._3_0.PurgeDocuments purgeDocuments66, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param requestStatus68
     */
    public net.docusign.www.api._3_0.RequestStatusResponse requestStatus(net.docusign.www.api._3_0.RequestStatus requestStatus68) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param requestStatus68
     */
    public void startrequestStatus(net.docusign.www.api._3_0.RequestStatus requestStatus68, final net.docusign.wsclient.APIServiceCallbackHandler callback) throws java.rmi.RemoteException;
}
