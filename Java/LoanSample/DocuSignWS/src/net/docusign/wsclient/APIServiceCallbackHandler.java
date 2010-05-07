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

/**
 * APIServiceCallbackHandler Callback class, Users can extend this class and
 * implement their own receiveResult and receiveError methods.
 */
public abstract class APIServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the
     * NonBlocking Web service call is finished and appropriate method of this
     * CallBack is called.
     *
     * @param clientData
     *            Object mechanism by which the user can pass in user data that
     *            will be avilable at the time this callback is called.
     */
    public APIServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public APIServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */

    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for requestTemplate method override
     * this method for handling normal response from requestTemplate operation
     */
    public void receiveResultrequestTemplate(net.docusign.www.api._3_0.RequestTemplateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from requestTemplate operation
     */
    public void receiveErrorrequestTemplate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for requestTemplates method
     * override this method for handling normal response from requestTemplates
     * operation
     */
    public void receiveResultrequestTemplates(net.docusign.www.api._3_0.RequestTemplatesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from requestTemplates operation
     */
    public void receiveErrorrequestTemplates(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for requestRecipientToken method
     * override this method for handling normal response from
     * requestRecipientToken operation
     */
    public void receiveResultrequestRecipientToken(net.docusign.www.api._3_0.RequestRecipientTokenResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from requestRecipientToken operation
     */
    public void receiveErrorrequestRecipientToken(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for requestDocumentPDFs method
     * override this method for handling normal response from
     * requestDocumentPDFs operation
     */
    public void receiveResultrequestDocumentPDFs(net.docusign.www.api._3_0.RequestDocumentPDFsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from requestDocumentPDFs operation
     */
    public void receiveErrorrequestDocumentPDFs(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for requestPDF method override this
     * method for handling normal response from requestPDF operation
     */
    public void receiveResultrequestPDF(net.docusign.www.api._3_0.RequestPDFResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from requestPDF operation
     */
    public void receiveErrorrequestPDF(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAuthenticationToken method
     * override this method for handling normal response from
     * getAuthenticationToken operation
     */
    public void receiveResultgetAuthenticationToken(net.docusign.www.api._3_0.GetAuthenticationTokenResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from getAuthenticationToken operation
     */
    public void receiveErrorgetAuthenticationToken(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createEnvelopeFromTemplates
     * method override this method for handling normal response from
     * createEnvelopeFromTemplates operation
     */
    public void receiveResultcreateEnvelopeFromTemplates(net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from createEnvelopeFromTemplates operation
     */
    public void receiveErrorcreateEnvelopeFromTemplates(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createEnvelope method override
     * this method for handling normal response from createEnvelope operation
     */
    public void receiveResultcreateEnvelope(net.docusign.www.api._3_0.CreateEnvelopeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from createEnvelope operation
     */
    public void receiveErrorcreateEnvelope(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for
     * acknowledgeAuthoritativeCopyExport method override this method for
     * handling normal response from acknowledgeAuthoritativeCopyExport
     * operation
     */
    public void receiveResultacknowledgeAuthoritativeCopyExport(net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from acknowledgeAuthoritativeCopyExport operation
     */
    public void receiveErroracknowledgeAuthoritativeCopyExport(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for uploadTemplate method override
     * this method for handling normal response from uploadTemplate operation
     */
    public void receiveResultuploadTemplate(net.docusign.www.api._3_0.UploadTemplateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from uploadTemplate operation
     */
    public void receiveErroruploadTemplate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for requestStatusesEx method
     * override this method for handling normal response from requestStatusesEx
     * operation
     */
    public void receiveResultrequestStatusesEx(net.docusign.www.api._3_0.RequestStatusesExResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from requestStatusesEx operation
     */
    public void receiveErrorrequestStatusesEx(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createAndSendEnvelope method
     * override this method for handling normal response from
     * createAndSendEnvelope operation
     */
    public void receiveResultcreateAndSendEnvelope(net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from createAndSendEnvelope operation
     */
    public void receiveErrorcreateAndSendEnvelope(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAddressBookItems method
     * override this method for handling normal response from
     * getAddressBookItems operation
     */
    public void receiveResultgetAddressBookItems(net.docusign.www.api._3_0.GetAddressBookItemsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from getAddressBookItems operation
     */
    public void receiveErrorgetAddressBookItems(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for requestStatusEx method override
     * this method for handling normal response from requestStatusEx operation
     */
    public void receiveResultrequestStatusEx(net.docusign.www.api._3_0.RequestStatusExResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from requestStatusEx operation
     */
    public void receiveErrorrequestStatusEx(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for
     * getAccountMembershipFeaturesList method override this method for handling
     * normal response from getAccountMembershipFeaturesList operation
     */
    public void receiveResultgetAccountMembershipFeaturesList(net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from getAccountMembershipFeaturesList operation
     */
    public void receiveErrorgetAccountMembershipFeaturesList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getRecipientList method
     * override this method for handling normal response from getRecipientList
     * operation
     */
    public void receiveResultgetRecipientList(net.docusign.www.api._3_0.GetRecipientListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from getRecipientList operation
     */
    public void receiveErrorgetRecipientList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for synchEnvelope method override
     * this method for handling normal response from synchEnvelope operation
     */
    public void receiveResultsynchEnvelope(net.docusign.www.api._3_0.SynchEnvelopeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from synchEnvelope operation
     */
    public void receiveErrorsynchEnvelope(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateAddressBookItems method
     * override this method for handling normal response from
     * updateAddressBookItems operation
     */
    public void receiveResultupdateAddressBookItems(net.docusign.www.api._3_0.UpdateAddressBookItemsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from updateAddressBookItems operation
     */
    public void receiveErrorupdateAddressBookItems(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for
     * getStatusInDocuSignConnectFormat method override this method for handling
     * normal response from getStatusInDocuSignConnectFormat operation
     */
    public void receiveResultgetStatusInDocuSignConnectFormat(net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from getStatusInDocuSignConnectFormat operation
     */
    public void receiveErrorgetStatusInDocuSignConnectFormat(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAccountSettingsList method
     * override this method for handling normal response from
     * getAccountSettingsList operation
     */
    public void receiveResultgetAccountSettingsList(net.docusign.www.api._3_0.GetAccountSettingsListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from getAccountSettingsList operation
     */
    public void receiveErrorgetAccountSettingsList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for requestDocumentPDFsEx method
     * override this method for handling normal response from
     * requestDocumentPDFsEx operation
     */
    public void receiveResultrequestDocumentPDFsEx(net.docusign.www.api._3_0.RequestDocumentPDFsExResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from requestDocumentPDFsEx operation
     */
    public void receiveErrorrequestDocumentPDFsEx(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeAddressBookItems method
     * override this method for handling normal response from
     * removeAddressBookItems operation
     */
    public void receiveResultremoveAddressBookItems(net.docusign.www.api._3_0.RemoveAddressBookItemsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from removeAddressBookItems operation
     */
    public void receiveErrorremoveAddressBookItems(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for saveTemplate method override
     * this method for handling normal response from saveTemplate operation
     */
    public void receiveResultsaveTemplate(net.docusign.www.api._3_0.SaveTemplateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from saveTemplate operation
     */
    public void receiveErrorsaveTemplate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for ping method override this
     * method for handling normal response from ping operation
     */
    public void receiveResultping(net.docusign.www.api._3_0.PingResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from ping operation
     */
    public void receiveErrorping(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getRecipientEsignList method
     * override this method for handling normal response from
     * getRecipientEsignList operation
     */
    public void receiveResultgetRecipientEsignList(net.docusign.www.api._3_0.GetRecipientEsignListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from getRecipientEsignList operation
     */
    public void receiveErrorgetRecipientEsignList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for requestStatuses method override
     * this method for handling normal response from requestStatuses operation
     */
    public void receiveResultrequestStatuses(net.docusign.www.api._3_0.RequestStatusesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from requestStatuses operation
     */
    public void receiveErrorrequestStatuses(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for correctAndResendEnvelope method
     * override this method for handling normal response from
     * correctAndResendEnvelope operation
     */
    public void receiveResultcorrectAndResendEnvelope(net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from correctAndResendEnvelope operation
     */
    public void receiveErrorcorrectAndResendEnvelope(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for
     * requestDocumentPDFsRecipientsView method override this method for
     * handling normal response from requestDocumentPDFsRecipientsView operation
     */
    public void receiveResultrequestDocumentPDFsRecipientsView(net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from requestDocumentPDFsRecipientsView operation
     */
    public void receiveErrorrequestDocumentPDFsRecipientsView(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for transferEnvelope method
     * override this method for handling normal response from transferEnvelope
     * operation
     */
    public void receiveResulttransferEnvelope(net.docusign.www.api._3_0.TransferEnvelopeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from transferEnvelope operation
     */
    public void receiveErrortransferEnvelope(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for requestSenderToken method
     * override this method for handling normal response from requestSenderToken
     * operation
     */
    public void receiveResultrequestSenderToken(net.docusign.www.api._3_0.RequestSenderTokenResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from requestSenderToken operation
     */
    public void receiveErrorrequestSenderToken(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for exportAuthoritativeCopy method
     * override this method for handling normal response from
     * exportAuthoritativeCopy operation
     */
    public void receiveResultexportAuthoritativeCopy(net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from exportAuthoritativeCopy operation
     */
    public void receiveErrorexportAuthoritativeCopy(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for envelopeAuditEvents method
     * override this method for handling normal response from
     * envelopeAuditEvents operation
     */
    public void receiveResultenvelopeAuditEvents(net.docusign.www.api._3_0.EnvelopeAuditEventsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from envelopeAuditEvents operation
     */
    public void receiveErrorenvelopeAuditEvents(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for voidEnvelope method override
     * this method for handling normal response from voidEnvelope operation
     */
    public void receiveResultvoidEnvelope(net.docusign.www.api._3_0.VoidEnvelopeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from voidEnvelope operation
     */
    public void receiveErrorvoidEnvelope(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for purgeDocuments method override
     * this method for handling normal response from purgeDocuments operation
     */
    public void receiveResultpurgeDocuments(net.docusign.www.api._3_0.PurgeDocumentsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from purgeDocuments operation
     */
    public void receiveErrorpurgeDocuments(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for requestStatus method override
     * this method for handling normal response from requestStatus operation
     */
    public void receiveResultrequestStatus(net.docusign.www.api._3_0.RequestStatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler override this method for handling
     * error response from requestStatus operation
     */
    public void receiveErrorrequestStatus(java.lang.Exception e) {
    }
}
