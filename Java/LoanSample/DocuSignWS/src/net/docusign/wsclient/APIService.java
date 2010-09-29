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
 * APIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
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

         
                     public net.docusign.www.api._3_0.RequestTemplateResponse RequestTemplate(

                        net.docusign.www.api._3_0.RequestTemplate requestTemplate0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestTemplate0
            
          */
        public void startRequestTemplate(

            net.docusign.www.api._3_0.RequestTemplate requestTemplate0,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestTemplates2
                
         */

         
                     public net.docusign.www.api._3_0.RequestTemplatesResponse RequestTemplates(

                        net.docusign.www.api._3_0.RequestTemplates requestTemplates2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestTemplates2
            
          */
        public void startRequestTemplates(

            net.docusign.www.api._3_0.RequestTemplates requestTemplates2,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestRecipientToken4
                
         */

         
                     public net.docusign.www.api._3_0.RequestRecipientTokenResponse RequestRecipientToken(

                        net.docusign.www.api._3_0.RequestRecipientToken requestRecipientToken4)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestRecipientToken4
            
          */
        public void startRequestRecipientToken(

            net.docusign.www.api._3_0.RequestRecipientToken requestRecipientToken4,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestDocumentPDFs6
                
         */

         
                     public net.docusign.www.api._3_0.RequestDocumentPDFsResponse RequestDocumentPDFs(

                        net.docusign.www.api._3_0.RequestDocumentPDFs requestDocumentPDFs6)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestDocumentPDFs6
            
          */
        public void startRequestDocumentPDFs(

            net.docusign.www.api._3_0.RequestDocumentPDFs requestDocumentPDFs6,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param createEnvelopeFromTemplatesAndForms8
                
         */

         
                     public net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesAndFormsResponse CreateEnvelopeFromTemplatesAndForms(

                        net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesAndForms createEnvelopeFromTemplatesAndForms8)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param createEnvelopeFromTemplatesAndForms8
            
          */
        public void startCreateEnvelopeFromTemplatesAndForms(

            net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesAndForms createEnvelopeFromTemplatesAndForms8,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestPDF10
                
         */

         
                     public net.docusign.www.api._3_0.RequestPDFResponse RequestPDF(

                        net.docusign.www.api._3_0.RequestPDF requestPDF10)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestPDF10
            
          */
        public void startRequestPDF(

            net.docusign.www.api._3_0.RequestPDF requestPDF10,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestEnvelope12
                
         */

         
                     public net.docusign.www.api._3_0.RequestEnvelopeResponse RequestEnvelope(

                        net.docusign.www.api._3_0.RequestEnvelope requestEnvelope12)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestEnvelope12
            
          */
        public void startRequestEnvelope(

            net.docusign.www.api._3_0.RequestEnvelope requestEnvelope12,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAuthenticationToken14
                
         */

         
                     public net.docusign.www.api._3_0.GetAuthenticationTokenResponse GetAuthenticationToken(

                        net.docusign.www.api._3_0.GetAuthenticationToken getAuthenticationToken14)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAuthenticationToken14
            
          */
        public void startGetAuthenticationToken(

            net.docusign.www.api._3_0.GetAuthenticationToken getAuthenticationToken14,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestPDFWithCert16
                
         */

         
                     public net.docusign.www.api._3_0.RequestPDFWithCertResponse RequestPDFWithCert(

                        net.docusign.www.api._3_0.RequestPDFWithCert requestPDFWithCert16)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestPDFWithCert16
            
          */
        public void startRequestPDFWithCert(

            net.docusign.www.api._3_0.RequestPDFWithCert requestPDFWithCert16,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param createEnvelopeFromTemplates18
                
         */

         
                     public net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse CreateEnvelopeFromTemplates(

                        net.docusign.www.api._3_0.CreateEnvelopeFromTemplates createEnvelopeFromTemplates18)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param createEnvelopeFromTemplates18
            
          */
        public void startCreateEnvelopeFromTemplates(

            net.docusign.www.api._3_0.CreateEnvelopeFromTemplates createEnvelopeFromTemplates18,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param createEnvelope20
                
         */

         
                     public net.docusign.www.api._3_0.CreateEnvelopeResponse CreateEnvelope(

                        net.docusign.www.api._3_0.CreateEnvelope createEnvelope20)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param createEnvelope20
            
          */
        public void startCreateEnvelope(

            net.docusign.www.api._3_0.CreateEnvelope createEnvelope20,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getFolders22
                
         */

         
                     public net.docusign.www.api._3_0.GetFoldersResponse GetFolders(

                        net.docusign.www.api._3_0.GetFolders getFolders22)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getFolders22
            
          */
        public void startGetFolders(

            net.docusign.www.api._3_0.GetFolders getFolders22,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getFolder24
                
         */

         
                     public net.docusign.www.api._3_0.GetFolderResponse GetFolder(

                        net.docusign.www.api._3_0.GetFolder getFolder24)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getFolder24
            
          */
        public void startGetFolder(

            net.docusign.www.api._3_0.GetFolder getFolder24,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param acknowledgeAuthoritativeCopyExport26
                
         */

         
                     public net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse AcknowledgeAuthoritativeCopyExport(

                        net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport acknowledgeAuthoritativeCopyExport26)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param acknowledgeAuthoritativeCopyExport26
            
          */
        public void startAcknowledgeAuthoritativeCopyExport(

            net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport acknowledgeAuthoritativeCopyExport26,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param uploadTemplate28
                
         */

         
                     public net.docusign.www.api._3_0.UploadTemplateResponse UploadTemplate(

                        net.docusign.www.api._3_0.UploadTemplate uploadTemplate28)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param uploadTemplate28
            
          */
        public void startUploadTemplate(

            net.docusign.www.api._3_0.UploadTemplate uploadTemplate28,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestStatusesEx30
                
         */

         
                     public net.docusign.www.api._3_0.RequestStatusesExResponse RequestStatusesEx(

                        net.docusign.www.api._3_0.RequestStatusesEx requestStatusesEx30)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestStatusesEx30
            
          */
        public void startRequestStatusesEx(

            net.docusign.www.api._3_0.RequestStatusesEx requestStatusesEx30,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestCorrectToken32
                
         */

         
                     public net.docusign.www.api._3_0.RequestCorrectTokenResponse RequestCorrectToken(

                        net.docusign.www.api._3_0.RequestCorrectToken requestCorrectToken32)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestCorrectToken32
            
          */
        public void startRequestCorrectToken(

            net.docusign.www.api._3_0.RequestCorrectToken requestCorrectToken32,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param createAndSendEnvelope34
                
         */

         
                     public net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse CreateAndSendEnvelope(

                        net.docusign.www.api._3_0.CreateAndSendEnvelope createAndSendEnvelope34)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param createAndSendEnvelope34
            
          */
        public void startCreateAndSendEnvelope(

            net.docusign.www.api._3_0.CreateAndSendEnvelope createAndSendEnvelope34,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAddressBookItems36
                
         */

         
                     public net.docusign.www.api._3_0.GetAddressBookItemsResponse GetAddressBookItems(

                        net.docusign.www.api._3_0.GetAddressBookItems getAddressBookItems36)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAddressBookItems36
            
          */
        public void startGetAddressBookItems(

            net.docusign.www.api._3_0.GetAddressBookItems getAddressBookItems36,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestStatusEx38
                
         */

         
                     public net.docusign.www.api._3_0.RequestStatusExResponse RequestStatusEx(

                        net.docusign.www.api._3_0.RequestStatusEx requestStatusEx38)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestStatusEx38
            
          */
        public void startRequestStatusEx(

            net.docusign.www.api._3_0.RequestStatusEx requestStatusEx38,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAccountMembershipFeaturesList40
                
         */

         
                     public net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse GetAccountMembershipFeaturesList(

                        net.docusign.www.api._3_0.GetAccountMembershipFeaturesList getAccountMembershipFeaturesList40)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAccountMembershipFeaturesList40
            
          */
        public void startGetAccountMembershipFeaturesList(

            net.docusign.www.api._3_0.GetAccountMembershipFeaturesList getAccountMembershipFeaturesList40,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getRecipientList42
                
         */

         
                     public net.docusign.www.api._3_0.GetRecipientListResponse GetRecipientList(

                        net.docusign.www.api._3_0.GetRecipientList getRecipientList42)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getRecipientList42
            
          */
        public void startGetRecipientList(

            net.docusign.www.api._3_0.GetRecipientList getRecipientList42,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param synchEnvelope44
                
         */

         
                     public net.docusign.www.api._3_0.SynchEnvelopeResponse SynchEnvelope(

                        net.docusign.www.api._3_0.SynchEnvelope synchEnvelope44)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param synchEnvelope44
            
          */
        public void startSynchEnvelope(

            net.docusign.www.api._3_0.SynchEnvelope synchEnvelope44,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateAddressBookItems46
                
         */

         
                     public net.docusign.www.api._3_0.UpdateAddressBookItemsResponse UpdateAddressBookItems(

                        net.docusign.www.api._3_0.UpdateAddressBookItems updateAddressBookItems46)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateAddressBookItems46
            
          */
        public void startUpdateAddressBookItems(

            net.docusign.www.api._3_0.UpdateAddressBookItems updateAddressBookItems46,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getStatusInDocuSignConnectFormat48
                
         */

         
                     public net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse GetStatusInDocuSignConnectFormat(

                        net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat getStatusInDocuSignConnectFormat48)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getStatusInDocuSignConnectFormat48
            
          */
        public void startGetStatusInDocuSignConnectFormat(

            net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat getStatusInDocuSignConnectFormat48,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAccountSettingsList50
                
         */

         
                     public net.docusign.www.api._3_0.GetAccountSettingsListResponse GetAccountSettingsList(

                        net.docusign.www.api._3_0.GetAccountSettingsList getAccountSettingsList50)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAccountSettingsList50
            
          */
        public void startGetAccountSettingsList(

            net.docusign.www.api._3_0.GetAccountSettingsList getAccountSettingsList50,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestDocumentPDFsEx52
                
         */

         
                     public net.docusign.www.api._3_0.RequestDocumentPDFsExResponse RequestDocumentPDFsEx(

                        net.docusign.www.api._3_0.RequestDocumentPDFsEx requestDocumentPDFsEx52)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestDocumentPDFsEx52
            
          */
        public void startRequestDocumentPDFsEx(

            net.docusign.www.api._3_0.RequestDocumentPDFsEx requestDocumentPDFsEx52,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param removeAddressBookItems54
                
         */

         
                     public net.docusign.www.api._3_0.RemoveAddressBookItemsResponse RemoveAddressBookItems(

                        net.docusign.www.api._3_0.RemoveAddressBookItems removeAddressBookItems54)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param removeAddressBookItems54
            
          */
        public void startRemoveAddressBookItems(

            net.docusign.www.api._3_0.RemoveAddressBookItems removeAddressBookItems54,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param saveTemplate56
                
         */

         
                     public net.docusign.www.api._3_0.SaveTemplateResponse SaveTemplate(

                        net.docusign.www.api._3_0.SaveTemplate saveTemplate56)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param saveTemplate56
            
          */
        public void startSaveTemplate(

            net.docusign.www.api._3_0.SaveTemplate saveTemplate56,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param ping58
                
         */

         
                     public net.docusign.www.api._3_0.PingResponse Ping(

                        net.docusign.www.api._3_0.Ping ping58)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param ping58
            
          */
        public void startPing(

            net.docusign.www.api._3_0.Ping ping58,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getRecipientEsignList60
                
         */

         
                     public net.docusign.www.api._3_0.GetRecipientEsignListResponse GetRecipientEsignList(

                        net.docusign.www.api._3_0.GetRecipientEsignList getRecipientEsignList60)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getRecipientEsignList60
            
          */
        public void startGetRecipientEsignList(

            net.docusign.www.api._3_0.GetRecipientEsignList getRecipientEsignList60,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestStatuses62
                
         */

         
                     public net.docusign.www.api._3_0.RequestStatusesResponse RequestStatuses(

                        net.docusign.www.api._3_0.RequestStatuses requestStatuses62)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestStatuses62
            
          */
        public void startRequestStatuses(

            net.docusign.www.api._3_0.RequestStatuses requestStatuses62,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param correctAndResendEnvelope64
                
         */

         
                     public net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse CorrectAndResendEnvelope(

                        net.docusign.www.api._3_0.CorrectAndResendEnvelope correctAndResendEnvelope64)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param correctAndResendEnvelope64
            
          */
        public void startCorrectAndResendEnvelope(

            net.docusign.www.api._3_0.CorrectAndResendEnvelope correctAndResendEnvelope64,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestDocumentPDFsRecipientsView66
                
         */

         
                     public net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse RequestDocumentPDFsRecipientsView(

                        net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView requestDocumentPDFsRecipientsView66)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestDocumentPDFsRecipientsView66
            
          */
        public void startRequestDocumentPDFsRecipientsView(

            net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView requestDocumentPDFsRecipientsView66,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param transferEnvelope68
                
         */

         
                     public net.docusign.www.api._3_0.TransferEnvelopeResponse TransferEnvelope(

                        net.docusign.www.api._3_0.TransferEnvelope transferEnvelope68)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param transferEnvelope68
            
          */
        public void startTransferEnvelope(

            net.docusign.www.api._3_0.TransferEnvelope transferEnvelope68,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestSenderToken70
                
         */

         
                     public net.docusign.www.api._3_0.RequestSenderTokenResponse RequestSenderToken(

                        net.docusign.www.api._3_0.RequestSenderToken requestSenderToken70)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestSenderToken70
            
          */
        public void startRequestSenderToken(

            net.docusign.www.api._3_0.RequestSenderToken requestSenderToken70,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param envelopeAuditEvents72
                
         */

         
                     public net.docusign.www.api._3_0.EnvelopeAuditEventsResponse EnvelopeAuditEvents(

                        net.docusign.www.api._3_0.EnvelopeAuditEvents envelopeAuditEvents72)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param envelopeAuditEvents72
            
          */
        public void startEnvelopeAuditEvents(

            net.docusign.www.api._3_0.EnvelopeAuditEvents envelopeAuditEvents72,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param exportAuthoritativeCopy74
                
         */

         
                     public net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse ExportAuthoritativeCopy(

                        net.docusign.www.api._3_0.ExportAuthoritativeCopy exportAuthoritativeCopy74)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param exportAuthoritativeCopy74
            
          */
        public void startExportAuthoritativeCopy(

            net.docusign.www.api._3_0.ExportAuthoritativeCopy exportAuthoritativeCopy74,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param sendEnvelope76
                
         */

         
                     public net.docusign.www.api._3_0.SendEnvelopeResponse SendEnvelope(

                        net.docusign.www.api._3_0.SendEnvelope sendEnvelope76)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param sendEnvelope76
            
          */
        public void startSendEnvelope(

            net.docusign.www.api._3_0.SendEnvelope sendEnvelope76,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param voidEnvelope78
                
         */

         
                     public net.docusign.www.api._3_0.VoidEnvelopeResponse VoidEnvelope(

                        net.docusign.www.api._3_0.VoidEnvelope voidEnvelope78)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param voidEnvelope78
            
          */
        public void startVoidEnvelope(

            net.docusign.www.api._3_0.VoidEnvelope voidEnvelope78,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param purgeDocuments80
                
         */

         
                     public net.docusign.www.api._3_0.PurgeDocumentsResponse PurgeDocuments(

                        net.docusign.www.api._3_0.PurgeDocuments purgeDocuments80)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param purgeDocuments80
            
          */
        public void startPurgeDocuments(

            net.docusign.www.api._3_0.PurgeDocuments purgeDocuments80,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestStatus82
                
         */

         
                     public net.docusign.www.api._3_0.RequestStatusResponse RequestStatus(

                        net.docusign.www.api._3_0.RequestStatus requestStatus82)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestStatus82
            
          */
        public void startRequestStatus(

            net.docusign.www.api._3_0.RequestStatus requestStatus82,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param requestPDFNoWaterMark84
                
         */

         
                     public net.docusign.www.api._3_0.RequestPDFNoWaterMarkResponse RequestPDFNoWaterMark(

                        net.docusign.www.api._3_0.RequestPDFNoWaterMark requestPDFNoWaterMark84)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param requestPDFNoWaterMark84
            
          */
        public void startRequestPDFNoWaterMark(

            net.docusign.www.api._3_0.RequestPDFNoWaterMark requestPDFNoWaterMark84,

            final net.docusign.wsclient.APIServiceCallbackHandler  callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    