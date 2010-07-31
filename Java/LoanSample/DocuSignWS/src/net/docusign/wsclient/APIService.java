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

    public net.docusign.www.api._3_0.RequestTemplateResponse requestTemplate(

    net.docusign.www.api._3_0.RequestTemplate requestTemplate0) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestTemplate0
     */
    public void startrequestTemplate(

    net.docusign.www.api._3_0.RequestTemplate requestTemplate0,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestTemplates2
     */

    public net.docusign.www.api._3_0.RequestTemplatesResponse requestTemplates(

    net.docusign.www.api._3_0.RequestTemplates requestTemplates2) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestTemplates2
     */
    public void startrequestTemplates(

    net.docusign.www.api._3_0.RequestTemplates requestTemplates2,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestRecipientToken4
     */

    public net.docusign.www.api._3_0.RequestRecipientTokenResponse requestRecipientToken(

    net.docusign.www.api._3_0.RequestRecipientToken requestRecipientToken4) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestRecipientToken4
     */
    public void startrequestRecipientToken(

    net.docusign.www.api._3_0.RequestRecipientToken requestRecipientToken4,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestDocumentPDFs6
     */

    public net.docusign.www.api._3_0.RequestDocumentPDFsResponse requestDocumentPDFs(

    net.docusign.www.api._3_0.RequestDocumentPDFs requestDocumentPDFs6) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestDocumentPDFs6
     */
    public void startrequestDocumentPDFs(

    net.docusign.www.api._3_0.RequestDocumentPDFs requestDocumentPDFs6,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestPDFWithCert8
     */

    public net.docusign.www.api._3_0.RequestPDFWithCertResponse requestPDFWithCert(

    net.docusign.www.api._3_0.RequestPDFWithCert requestPDFWithCert8) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestPDFWithCert8
     */
    public void startrequestPDFWithCert(

    net.docusign.www.api._3_0.RequestPDFWithCert requestPDFWithCert8,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestPDF10
     */

    public net.docusign.www.api._3_0.RequestPDFResponse requestPDF(

    net.docusign.www.api._3_0.RequestPDF requestPDF10) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestPDF10
     */
    public void startrequestPDF(

    net.docusign.www.api._3_0.RequestPDF requestPDF10,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param getAuthenticationToken12
     */

    public net.docusign.www.api._3_0.GetAuthenticationTokenResponse getAuthenticationToken(

    net.docusign.www.api._3_0.GetAuthenticationToken getAuthenticationToken12) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param getAuthenticationToken12
     */
    public void startgetAuthenticationToken(

    net.docusign.www.api._3_0.GetAuthenticationToken getAuthenticationToken12,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param createEnvelopeFromTemplates14
     */

    public net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse createEnvelopeFromTemplates(

    net.docusign.www.api._3_0.CreateEnvelopeFromTemplates createEnvelopeFromTemplates14) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param createEnvelopeFromTemplates14
     */
    public void startcreateEnvelopeFromTemplates(

    net.docusign.www.api._3_0.CreateEnvelopeFromTemplates createEnvelopeFromTemplates14,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param createEnvelope16
     */

    public net.docusign.www.api._3_0.CreateEnvelopeResponse createEnvelope(

    net.docusign.www.api._3_0.CreateEnvelope createEnvelope16) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param createEnvelope16
     */
    public void startcreateEnvelope(

    net.docusign.www.api._3_0.CreateEnvelope createEnvelope16,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param acknowledgeAuthoritativeCopyExport18
     */

    public net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse acknowledgeAuthoritativeCopyExport(

    net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport acknowledgeAuthoritativeCopyExport18) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param acknowledgeAuthoritativeCopyExport18
     */
    public void startacknowledgeAuthoritativeCopyExport(

    net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport acknowledgeAuthoritativeCopyExport18,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param uploadTemplate20
     */

    public net.docusign.www.api._3_0.UploadTemplateResponse uploadTemplate(

    net.docusign.www.api._3_0.UploadTemplate uploadTemplate20) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param uploadTemplate20
     */
    public void startuploadTemplate(

    net.docusign.www.api._3_0.UploadTemplate uploadTemplate20,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestStatusesEx22
     */

    public net.docusign.www.api._3_0.RequestStatusesExResponse requestStatusesEx(

    net.docusign.www.api._3_0.RequestStatusesEx requestStatusesEx22) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestStatusesEx22
     */
    public void startrequestStatusesEx(

    net.docusign.www.api._3_0.RequestStatusesEx requestStatusesEx22,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestCorrectToken24
     */

    public net.docusign.www.api._3_0.RequestCorrectTokenResponse requestCorrectToken(

    net.docusign.www.api._3_0.RequestCorrectToken requestCorrectToken24) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestCorrectToken24
     */
    public void startrequestCorrectToken(

    net.docusign.www.api._3_0.RequestCorrectToken requestCorrectToken24,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param createAndSendEnvelope26
     */

    public net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse createAndSendEnvelope(

    net.docusign.www.api._3_0.CreateAndSendEnvelope createAndSendEnvelope26) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param createAndSendEnvelope26
     */
    public void startcreateAndSendEnvelope(

    net.docusign.www.api._3_0.CreateAndSendEnvelope createAndSendEnvelope26,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param getAddressBookItems28
     */

    public net.docusign.www.api._3_0.GetAddressBookItemsResponse getAddressBookItems(

    net.docusign.www.api._3_0.GetAddressBookItems getAddressBookItems28) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param getAddressBookItems28
     */
    public void startgetAddressBookItems(

    net.docusign.www.api._3_0.GetAddressBookItems getAddressBookItems28,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestStatusEx30
     */

    public net.docusign.www.api._3_0.RequestStatusExResponse requestStatusEx(

    net.docusign.www.api._3_0.RequestStatusEx requestStatusEx30) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestStatusEx30
     */
    public void startrequestStatusEx(

    net.docusign.www.api._3_0.RequestStatusEx requestStatusEx30,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param getAccountMembershipFeaturesList32
     */

    public net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse getAccountMembershipFeaturesList(

    net.docusign.www.api._3_0.GetAccountMembershipFeaturesList getAccountMembershipFeaturesList32) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param getAccountMembershipFeaturesList32
     */
    public void startgetAccountMembershipFeaturesList(

    net.docusign.www.api._3_0.GetAccountMembershipFeaturesList getAccountMembershipFeaturesList32,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param getRecipientList34
     */

    public net.docusign.www.api._3_0.GetRecipientListResponse getRecipientList(

    net.docusign.www.api._3_0.GetRecipientList getRecipientList34) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param getRecipientList34
     */
    public void startgetRecipientList(

    net.docusign.www.api._3_0.GetRecipientList getRecipientList34,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param synchEnvelope36
     */

    public net.docusign.www.api._3_0.SynchEnvelopeResponse synchEnvelope(

    net.docusign.www.api._3_0.SynchEnvelope synchEnvelope36) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param synchEnvelope36
     */
    public void startsynchEnvelope(

    net.docusign.www.api._3_0.SynchEnvelope synchEnvelope36,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param updateAddressBookItems38
     */

    public net.docusign.www.api._3_0.UpdateAddressBookItemsResponse updateAddressBookItems(

    net.docusign.www.api._3_0.UpdateAddressBookItems updateAddressBookItems38) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param updateAddressBookItems38
     */
    public void startupdateAddressBookItems(

    net.docusign.www.api._3_0.UpdateAddressBookItems updateAddressBookItems38,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param getStatusInDocuSignConnectFormat40
     */

    public net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse getStatusInDocuSignConnectFormat(

    net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat getStatusInDocuSignConnectFormat40) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param getStatusInDocuSignConnectFormat40
     */
    public void startgetStatusInDocuSignConnectFormat(

    net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat getStatusInDocuSignConnectFormat40,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param getAccountSettingsList42
     */

    public net.docusign.www.api._3_0.GetAccountSettingsListResponse getAccountSettingsList(

    net.docusign.www.api._3_0.GetAccountSettingsList getAccountSettingsList42) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param getAccountSettingsList42
     */
    public void startgetAccountSettingsList(

    net.docusign.www.api._3_0.GetAccountSettingsList getAccountSettingsList42,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestDocumentPDFsEx44
     */

    public net.docusign.www.api._3_0.RequestDocumentPDFsExResponse requestDocumentPDFsEx(

    net.docusign.www.api._3_0.RequestDocumentPDFsEx requestDocumentPDFsEx44) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestDocumentPDFsEx44
     */
    public void startrequestDocumentPDFsEx(

    net.docusign.www.api._3_0.RequestDocumentPDFsEx requestDocumentPDFsEx44,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param removeAddressBookItems46
     */

    public net.docusign.www.api._3_0.RemoveAddressBookItemsResponse removeAddressBookItems(

    net.docusign.www.api._3_0.RemoveAddressBookItems removeAddressBookItems46) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param removeAddressBookItems46
     */
    public void startremoveAddressBookItems(

    net.docusign.www.api._3_0.RemoveAddressBookItems removeAddressBookItems46,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param saveTemplate48
     */

    public net.docusign.www.api._3_0.SaveTemplateResponse saveTemplate(

    net.docusign.www.api._3_0.SaveTemplate saveTemplate48) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param saveTemplate48
     */
    public void startsaveTemplate(

    net.docusign.www.api._3_0.SaveTemplate saveTemplate48,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param ping50
     */

    public net.docusign.www.api._3_0.PingResponse ping(

    net.docusign.www.api._3_0.Ping ping50) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param ping50
     */
    public void startping(

    net.docusign.www.api._3_0.Ping ping50,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param getRecipientEsignList52
     */

    public net.docusign.www.api._3_0.GetRecipientEsignListResponse getRecipientEsignList(

    net.docusign.www.api._3_0.GetRecipientEsignList getRecipientEsignList52) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param getRecipientEsignList52
     */
    public void startgetRecipientEsignList(

    net.docusign.www.api._3_0.GetRecipientEsignList getRecipientEsignList52,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestStatuses54
     */

    public net.docusign.www.api._3_0.RequestStatusesResponse requestStatuses(

    net.docusign.www.api._3_0.RequestStatuses requestStatuses54) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestStatuses54
     */
    public void startrequestStatuses(

    net.docusign.www.api._3_0.RequestStatuses requestStatuses54,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param correctAndResendEnvelope56
     */

    public net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse correctAndResendEnvelope(

    net.docusign.www.api._3_0.CorrectAndResendEnvelope correctAndResendEnvelope56) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param correctAndResendEnvelope56
     */
    public void startcorrectAndResendEnvelope(

    net.docusign.www.api._3_0.CorrectAndResendEnvelope correctAndResendEnvelope56,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestDocumentPDFsRecipientsView58
     */

    public net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse requestDocumentPDFsRecipientsView(

    net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView requestDocumentPDFsRecipientsView58) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestDocumentPDFsRecipientsView58
     */
    public void startrequestDocumentPDFsRecipientsView(

    net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView requestDocumentPDFsRecipientsView58,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param transferEnvelope60
     */

    public net.docusign.www.api._3_0.TransferEnvelopeResponse transferEnvelope(

    net.docusign.www.api._3_0.TransferEnvelope transferEnvelope60) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param transferEnvelope60
     */
    public void starttransferEnvelope(

    net.docusign.www.api._3_0.TransferEnvelope transferEnvelope60,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestSenderToken62
     */

    public net.docusign.www.api._3_0.RequestSenderTokenResponse requestSenderToken(

    net.docusign.www.api._3_0.RequestSenderToken requestSenderToken62) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestSenderToken62
     */
    public void startrequestSenderToken(

    net.docusign.www.api._3_0.RequestSenderToken requestSenderToken62,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param envelopeAuditEvents64
     */

    public net.docusign.www.api._3_0.EnvelopeAuditEventsResponse envelopeAuditEvents(

    net.docusign.www.api._3_0.EnvelopeAuditEvents envelopeAuditEvents64) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param envelopeAuditEvents64
     */
    public void startenvelopeAuditEvents(

    net.docusign.www.api._3_0.EnvelopeAuditEvents envelopeAuditEvents64,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param exportAuthoritativeCopy66
     */

    public net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse exportAuthoritativeCopy(

    net.docusign.www.api._3_0.ExportAuthoritativeCopy exportAuthoritativeCopy66) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param exportAuthoritativeCopy66
     */
    public void startexportAuthoritativeCopy(

    net.docusign.www.api._3_0.ExportAuthoritativeCopy exportAuthoritativeCopy66,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param sendEnvelope68
     */

    public net.docusign.www.api._3_0.SendEnvelopeResponse sendEnvelope(

    net.docusign.www.api._3_0.SendEnvelope sendEnvelope68) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param sendEnvelope68
     */
    public void startsendEnvelope(

    net.docusign.www.api._3_0.SendEnvelope sendEnvelope68,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param voidEnvelope70
     */

    public net.docusign.www.api._3_0.VoidEnvelopeResponse voidEnvelope(

    net.docusign.www.api._3_0.VoidEnvelope voidEnvelope70) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param voidEnvelope70
     */
    public void startvoidEnvelope(

    net.docusign.www.api._3_0.VoidEnvelope voidEnvelope70,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param purgeDocuments72
     */

    public net.docusign.www.api._3_0.PurgeDocumentsResponse purgeDocuments(

    net.docusign.www.api._3_0.PurgeDocuments purgeDocuments72) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param purgeDocuments72
     */
    public void startpurgeDocuments(

    net.docusign.www.api._3_0.PurgeDocuments purgeDocuments72,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestStatus74
     */

    public net.docusign.www.api._3_0.RequestStatusResponse requestStatus(

    net.docusign.www.api._3_0.RequestStatus requestStatus74) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestStatus74
     */
    public void startrequestStatus(

    net.docusign.www.api._3_0.RequestStatus requestStatus74,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     * 
     * @param requestPDFNoWaterMark76
     */

    public net.docusign.www.api._3_0.RequestPDFNoWaterMarkResponse requestPDFNoWaterMark(

    net.docusign.www.api._3_0.RequestPDFNoWaterMark requestPDFNoWaterMark76) throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @param requestPDFNoWaterMark76
     */
    public void startrequestPDFNoWaterMark(

    net.docusign.www.api._3_0.RequestPDFNoWaterMark requestPDFNoWaterMark76,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException;

    //
}
