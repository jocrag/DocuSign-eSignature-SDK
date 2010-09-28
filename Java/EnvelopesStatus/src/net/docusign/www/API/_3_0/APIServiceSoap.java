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

/**
 * APIServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public interface APIServiceSoap extends java.rmi.Remote {
    public net.docusign.www.API._3_0.EnvelopeStatus createEnvelope(net.docusign.www.API._3_0.Envelope envelope) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.EnvelopeStatus createAndSendEnvelope(net.docusign.www.API._3_0.Envelope envelope) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.EnvelopeStatus sendEnvelope(java.lang.String envelopeId, java.lang.String accountId) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.CorrectionStatus correctAndResendEnvelope(net.docusign.www.API._3_0.Correction correction) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.EnvelopePDF requestPDFNoWaterMark(java.lang.String envelopeID) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.EnvelopePDF requestPDF(java.lang.String envelopeID) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.EnvelopePDF requestPDFWithCert(java.lang.String envelopeID, boolean addWaterMark) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.DocumentPDFs requestDocumentPDFs(java.lang.String envelopeID) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.DocumentPDFs requestDocumentPDFsEx(java.lang.String envelopeID) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.DocumentPDFs requestDocumentPDFsRecipientsView(java.lang.String envelopeID, java.lang.String recipientName, java.lang.String recipientEmail) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.EnvelopeStatus requestStatusEx(java.lang.String envelopeID) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.EnvelopeStatus requestStatus(java.lang.String envelopeID) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.FilteredEnvelopeStatuses requestStatusesEx(net.docusign.www.API._3_0.EnvelopeStatusFilter envelopeStatusFilter) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.FilteredEnvelopeStatuses requestStatuses(net.docusign.www.API._3_0.EnvelopeStatusFilter envelopeStatusFilter) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.RecipientEsignList getRecipientEsignList(java.lang.String userName, java.lang.String senderEmail, java.lang.String senderAccountId, java.lang.String recipientEmail) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.RecipientList getRecipientList(java.lang.String senderAccountId, java.lang.String recipientEmail) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.VoidEnvelopeStatus voidEnvelope(java.lang.String envelopeID, java.lang.String reason) throws java.rmi.RemoteException;
    public java.lang.String requestRecipientToken(java.lang.String envelopeID, java.lang.String clientUserID, java.lang.String username, java.lang.String email, net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertion authenticationAssertion, net.docusign.www.API._3_0.RequestRecipientTokenClientURLs clientURLs) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.TransferEnvelopeStatus transferEnvelope(java.lang.String envelopeID, java.lang.String accountID, java.lang.String userID) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.AccountMembershipFeaturesList getAccountMembershipFeaturesList(java.lang.String accountId) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.AccountSetting[] getAccountSettingsList(java.lang.String accountId) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.AuthoritativeCopyExportStatus acknowledgeAuthoritativeCopyExport(java.lang.String envelopeId, java.lang.String transactionId, byte[] checkSumHash) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.AuthoritativeCopyExportDocuments exportAuthoritativeCopy(java.lang.String envelopeId) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.EnvelopeAuditEventsResponseEnvelopeAuditEventsResult envelopeAuditEvents(java.lang.String envelopeId) throws java.rmi.RemoteException;
    public boolean ping() throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.EnvelopeStatus createEnvelopeFromTemplates(net.docusign.www.API._3_0.TemplateReference[] templateReferences, net.docusign.www.API._3_0.Recipient[] recipients, net.docusign.www.API._3_0.EnvelopeInformation envelopeInformation, boolean activateEnvelope) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.EnvelopeStatus createEnvelopeFromTemplatesAndForms(net.docusign.www.API._3_0.EnvelopeInformation envelopeInformation, net.docusign.www.API._3_0.CompositeTemplate[] compositeTemplates, boolean activateEnvelope) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.DocuSignEnvelopeInformation getStatusInDocuSignConnectFormat(java.lang.String envelopeID) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.PurgeDocumentStatus purgeDocuments(java.lang.String envelopeID) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.SaveTemplateResult saveTemplate(net.docusign.www.API._3_0.EnvelopeTemplate envelopeTemplate) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.SaveTemplateResult uploadTemplate(java.lang.String templateXML, java.lang.String accountID, boolean shared) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.EnvelopeTemplateDefinition[] requestTemplates(java.lang.String accountID, boolean includeAdvancedTemplates) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.EnvelopeTemplate requestTemplate(java.lang.String templateID, boolean includeDocumentBytes) throws java.rmi.RemoteException;
    public java.lang.String getAuthenticationToken(java.lang.String goToEnvelopeID) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.AddressBookItem[] getAddressBookItems(java.lang.String accountID) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.UpdateAddressBookResult updateAddressBookItems(net.docusign.www.API._3_0.AddressBookItem[] addressBookItems, boolean returnAddressBook) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.UpdateAddressBookResult removeAddressBookItems(net.docusign.www.API._3_0.AddressBookRemoveItem[] addressBookRemoveItems, boolean returnAddressBook) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.SynchEnvelopeStatus synchEnvelope(java.lang.String transactionID, java.lang.String accountID, boolean block) throws java.rmi.RemoteException;
    public java.lang.String requestSenderToken(java.lang.String envelopeID, java.lang.String accountID, java.lang.String returnURL) throws java.rmi.RemoteException;
    public java.lang.String requestCorrectToken(java.lang.String envelopeID, boolean suppressNavigation, java.lang.String returnURL) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.FolderResults getFolder(java.lang.String accountId, net.docusign.www.API._3_0.FolderType folderType, java.lang.String folderName, int startPosition, java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String searchText, net.docusign.www.API._3_0.EnvelopeStatusCode status) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.AvailableFolders getFolders(java.lang.String accountId) throws java.rmi.RemoteException;
    public net.docusign.www.API._3_0.Envelope requestEnvelope(java.lang.String envelopeID, boolean includeDocumentBytes) throws java.rmi.RemoteException;
}
