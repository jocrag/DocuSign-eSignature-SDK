/**
 * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
 *
 * This source code is intended only as a supplement to DocuSign SDK
 * and/or on-line documentation.
 * This sample is designed to demonstrate DocuSign features and is not intended
 * for production use. Code and policy for a production application must be
 * developed to meet the specific data and security requirements of the
 * application.
 *
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */

/**
 * APIServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */

    package net.docusign.wsclient;

    /**
     *  APIServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class APIServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public APIServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public APIServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for RequestTemplate method
            * override this method for handling normal response from RequestTemplate operation
            */
           public void receiveResultRequestTemplate(
                    net.docusign.www.api._3_0.RequestTemplateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestTemplate operation
           */
            public void receiveErrorRequestTemplate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestTemplates method
            * override this method for handling normal response from RequestTemplates operation
            */
           public void receiveResultRequestTemplates(
                    net.docusign.www.api._3_0.RequestTemplatesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestTemplates operation
           */
            public void receiveErrorRequestTemplates(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestRecipientToken method
            * override this method for handling normal response from RequestRecipientToken operation
            */
           public void receiveResultRequestRecipientToken(
                    net.docusign.www.api._3_0.RequestRecipientTokenResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestRecipientToken operation
           */
            public void receiveErrorRequestRecipientToken(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestDocumentPDFs method
            * override this method for handling normal response from RequestDocumentPDFs operation
            */
           public void receiveResultRequestDocumentPDFs(
                    net.docusign.www.api._3_0.RequestDocumentPDFsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestDocumentPDFs operation
           */
            public void receiveErrorRequestDocumentPDFs(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for CreateEnvelopeFromTemplatesAndForms method
            * override this method for handling normal response from CreateEnvelopeFromTemplatesAndForms operation
            */
           public void receiveResultCreateEnvelopeFromTemplatesAndForms(
                    net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesAndFormsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from CreateEnvelopeFromTemplatesAndForms operation
           */
            public void receiveErrorCreateEnvelopeFromTemplatesAndForms(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestPDF method
            * override this method for handling normal response from RequestPDF operation
            */
           public void receiveResultRequestPDF(
                    net.docusign.www.api._3_0.RequestPDFResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestPDF operation
           */
            public void receiveErrorRequestPDF(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestEnvelope method
            * override this method for handling normal response from RequestEnvelope operation
            */
           public void receiveResultRequestEnvelope(
                    net.docusign.www.api._3_0.RequestEnvelopeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestEnvelope operation
           */
            public void receiveErrorRequestEnvelope(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetAuthenticationToken method
            * override this method for handling normal response from GetAuthenticationToken operation
            */
           public void receiveResultGetAuthenticationToken(
                    net.docusign.www.api._3_0.GetAuthenticationTokenResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetAuthenticationToken operation
           */
            public void receiveErrorGetAuthenticationToken(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestPDFWithCert method
            * override this method for handling normal response from RequestPDFWithCert operation
            */
           public void receiveResultRequestPDFWithCert(
                    net.docusign.www.api._3_0.RequestPDFWithCertResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestPDFWithCert operation
           */
            public void receiveErrorRequestPDFWithCert(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for CreateEnvelopeFromTemplates method
            * override this method for handling normal response from CreateEnvelopeFromTemplates operation
            */
           public void receiveResultCreateEnvelopeFromTemplates(
                    net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from CreateEnvelopeFromTemplates operation
           */
            public void receiveErrorCreateEnvelopeFromTemplates(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for CreateEnvelope method
            * override this method for handling normal response from CreateEnvelope operation
            */
           public void receiveResultCreateEnvelope(
                    net.docusign.www.api._3_0.CreateEnvelopeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from CreateEnvelope operation
           */
            public void receiveErrorCreateEnvelope(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetFolders method
            * override this method for handling normal response from GetFolders operation
            */
           public void receiveResultGetFolders(
                    net.docusign.www.api._3_0.GetFoldersResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetFolders operation
           */
            public void receiveErrorGetFolders(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetFolder method
            * override this method for handling normal response from GetFolder operation
            */
           public void receiveResultGetFolder(
                    net.docusign.www.api._3_0.GetFolderResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetFolder operation
           */
            public void receiveErrorGetFolder(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for AcknowledgeAuthoritativeCopyExport method
            * override this method for handling normal response from AcknowledgeAuthoritativeCopyExport operation
            */
           public void receiveResultAcknowledgeAuthoritativeCopyExport(
                    net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from AcknowledgeAuthoritativeCopyExport operation
           */
            public void receiveErrorAcknowledgeAuthoritativeCopyExport(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for UploadTemplate method
            * override this method for handling normal response from UploadTemplate operation
            */
           public void receiveResultUploadTemplate(
                    net.docusign.www.api._3_0.UploadTemplateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from UploadTemplate operation
           */
            public void receiveErrorUploadTemplate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestStatusesEx method
            * override this method for handling normal response from RequestStatusesEx operation
            */
           public void receiveResultRequestStatusesEx(
                    net.docusign.www.api._3_0.RequestStatusesExResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestStatusesEx operation
           */
            public void receiveErrorRequestStatusesEx(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestCorrectToken method
            * override this method for handling normal response from RequestCorrectToken operation
            */
           public void receiveResultRequestCorrectToken(
                    net.docusign.www.api._3_0.RequestCorrectTokenResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestCorrectToken operation
           */
            public void receiveErrorRequestCorrectToken(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for CreateAndSendEnvelope method
            * override this method for handling normal response from CreateAndSendEnvelope operation
            */
           public void receiveResultCreateAndSendEnvelope(
                    net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from CreateAndSendEnvelope operation
           */
            public void receiveErrorCreateAndSendEnvelope(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetAddressBookItems method
            * override this method for handling normal response from GetAddressBookItems operation
            */
           public void receiveResultGetAddressBookItems(
                    net.docusign.www.api._3_0.GetAddressBookItemsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetAddressBookItems operation
           */
            public void receiveErrorGetAddressBookItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestStatusEx method
            * override this method for handling normal response from RequestStatusEx operation
            */
           public void receiveResultRequestStatusEx(
                    net.docusign.www.api._3_0.RequestStatusExResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestStatusEx operation
           */
            public void receiveErrorRequestStatusEx(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetAccountMembershipFeaturesList method
            * override this method for handling normal response from GetAccountMembershipFeaturesList operation
            */
           public void receiveResultGetAccountMembershipFeaturesList(
                    net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetAccountMembershipFeaturesList operation
           */
            public void receiveErrorGetAccountMembershipFeaturesList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetRecipientList method
            * override this method for handling normal response from GetRecipientList operation
            */
           public void receiveResultGetRecipientList(
                    net.docusign.www.api._3_0.GetRecipientListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetRecipientList operation
           */
            public void receiveErrorGetRecipientList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for SynchEnvelope method
            * override this method for handling normal response from SynchEnvelope operation
            */
           public void receiveResultSynchEnvelope(
                    net.docusign.www.api._3_0.SynchEnvelopeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from SynchEnvelope operation
           */
            public void receiveErrorSynchEnvelope(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for UpdateAddressBookItems method
            * override this method for handling normal response from UpdateAddressBookItems operation
            */
           public void receiveResultUpdateAddressBookItems(
                    net.docusign.www.api._3_0.UpdateAddressBookItemsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from UpdateAddressBookItems operation
           */
            public void receiveErrorUpdateAddressBookItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetStatusInDocuSignConnectFormat method
            * override this method for handling normal response from GetStatusInDocuSignConnectFormat operation
            */
           public void receiveResultGetStatusInDocuSignConnectFormat(
                    net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetStatusInDocuSignConnectFormat operation
           */
            public void receiveErrorGetStatusInDocuSignConnectFormat(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetAccountSettingsList method
            * override this method for handling normal response from GetAccountSettingsList operation
            */
           public void receiveResultGetAccountSettingsList(
                    net.docusign.www.api._3_0.GetAccountSettingsListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetAccountSettingsList operation
           */
            public void receiveErrorGetAccountSettingsList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestDocumentPDFsEx method
            * override this method for handling normal response from RequestDocumentPDFsEx operation
            */
           public void receiveResultRequestDocumentPDFsEx(
                    net.docusign.www.api._3_0.RequestDocumentPDFsExResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestDocumentPDFsEx operation
           */
            public void receiveErrorRequestDocumentPDFsEx(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RemoveAddressBookItems method
            * override this method for handling normal response from RemoveAddressBookItems operation
            */
           public void receiveResultRemoveAddressBookItems(
                    net.docusign.www.api._3_0.RemoveAddressBookItemsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RemoveAddressBookItems operation
           */
            public void receiveErrorRemoveAddressBookItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for SaveTemplate method
            * override this method for handling normal response from SaveTemplate operation
            */
           public void receiveResultSaveTemplate(
                    net.docusign.www.api._3_0.SaveTemplateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from SaveTemplate operation
           */
            public void receiveErrorSaveTemplate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for Ping method
            * override this method for handling normal response from Ping operation
            */
           public void receiveResultPing(
                    net.docusign.www.api._3_0.PingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from Ping operation
           */
            public void receiveErrorPing(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetRecipientEsignList method
            * override this method for handling normal response from GetRecipientEsignList operation
            */
           public void receiveResultGetRecipientEsignList(
                    net.docusign.www.api._3_0.GetRecipientEsignListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetRecipientEsignList operation
           */
            public void receiveErrorGetRecipientEsignList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestStatuses method
            * override this method for handling normal response from RequestStatuses operation
            */
           public void receiveResultRequestStatuses(
                    net.docusign.www.api._3_0.RequestStatusesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestStatuses operation
           */
            public void receiveErrorRequestStatuses(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for CorrectAndResendEnvelope method
            * override this method for handling normal response from CorrectAndResendEnvelope operation
            */
           public void receiveResultCorrectAndResendEnvelope(
                    net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from CorrectAndResendEnvelope operation
           */
            public void receiveErrorCorrectAndResendEnvelope(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestDocumentPDFsRecipientsView method
            * override this method for handling normal response from RequestDocumentPDFsRecipientsView operation
            */
           public void receiveResultRequestDocumentPDFsRecipientsView(
                    net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestDocumentPDFsRecipientsView operation
           */
            public void receiveErrorRequestDocumentPDFsRecipientsView(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for TransferEnvelope method
            * override this method for handling normal response from TransferEnvelope operation
            */
           public void receiveResultTransferEnvelope(
                    net.docusign.www.api._3_0.TransferEnvelopeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from TransferEnvelope operation
           */
            public void receiveErrorTransferEnvelope(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestSenderToken method
            * override this method for handling normal response from RequestSenderToken operation
            */
           public void receiveResultRequestSenderToken(
                    net.docusign.www.api._3_0.RequestSenderTokenResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestSenderToken operation
           */
            public void receiveErrorRequestSenderToken(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for EnvelopeAuditEvents method
            * override this method for handling normal response from EnvelopeAuditEvents operation
            */
           public void receiveResultEnvelopeAuditEvents(
                    net.docusign.www.api._3_0.EnvelopeAuditEventsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from EnvelopeAuditEvents operation
           */
            public void receiveErrorEnvelopeAuditEvents(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ExportAuthoritativeCopy method
            * override this method for handling normal response from ExportAuthoritativeCopy operation
            */
           public void receiveResultExportAuthoritativeCopy(
                    net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ExportAuthoritativeCopy operation
           */
            public void receiveErrorExportAuthoritativeCopy(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for SendEnvelope method
            * override this method for handling normal response from SendEnvelope operation
            */
           public void receiveResultSendEnvelope(
                    net.docusign.www.api._3_0.SendEnvelopeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from SendEnvelope operation
           */
            public void receiveErrorSendEnvelope(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for VoidEnvelope method
            * override this method for handling normal response from VoidEnvelope operation
            */
           public void receiveResultVoidEnvelope(
                    net.docusign.www.api._3_0.VoidEnvelopeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from VoidEnvelope operation
           */
            public void receiveErrorVoidEnvelope(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for PurgeDocuments method
            * override this method for handling normal response from PurgeDocuments operation
            */
           public void receiveResultPurgeDocuments(
                    net.docusign.www.api._3_0.PurgeDocumentsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from PurgeDocuments operation
           */
            public void receiveErrorPurgeDocuments(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestStatus method
            * override this method for handling normal response from RequestStatus operation
            */
           public void receiveResultRequestStatus(
                    net.docusign.www.api._3_0.RequestStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestStatus operation
           */
            public void receiveErrorRequestStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for RequestPDFNoWaterMark method
            * override this method for handling normal response from RequestPDFNoWaterMark operation
            */
           public void receiveResultRequestPDFNoWaterMark(
                    net.docusign.www.api._3_0.RequestPDFNoWaterMarkResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from RequestPDFNoWaterMark operation
           */
            public void receiveErrorRequestPDFNoWaterMark(java.lang.Exception e) {
            }
                


    }
    