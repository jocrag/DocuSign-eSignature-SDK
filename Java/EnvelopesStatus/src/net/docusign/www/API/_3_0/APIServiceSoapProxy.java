package net.docusign.www.API._3_0;

public class APIServiceSoapProxy implements net.docusign.www.API._3_0.APIServiceSoap {
  private String _endpoint = null;
  private net.docusign.www.API._3_0.APIServiceSoap aPIServiceSoap = null;
  
  public APIServiceSoapProxy() {
    _initAPIServiceSoapProxy();
  }
  
  public APIServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initAPIServiceSoapProxy();
  }
  
  private void _initAPIServiceSoapProxy() {
    try {
      aPIServiceSoap = (new net.docusign.www.API._3_0.APIServiceLocator()).getAPIServiceSoap();
      if (aPIServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aPIServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aPIServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aPIServiceSoap != null)
      ((javax.xml.rpc.Stub)aPIServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.docusign.www.API._3_0.APIServiceSoap getAPIServiceSoap() {
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap;
  }
  
  public net.docusign.www.API._3_0.EnvelopeStatus createEnvelope(net.docusign.www.API._3_0.Envelope envelope) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.createEnvelope(envelope);
  }
  
  public net.docusign.www.API._3_0.EnvelopeStatus createAndSendEnvelope(net.docusign.www.API._3_0.Envelope envelope) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.createAndSendEnvelope(envelope);
  }
  
  public net.docusign.www.API._3_0.CorrectionStatus correctAndResendEnvelope(net.docusign.www.API._3_0.Correction correction) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.correctAndResendEnvelope(correction);
  }
  
  public net.docusign.www.API._3_0.EnvelopePDF requestPDF(java.lang.String envelopeID) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.requestPDF(envelopeID);
  }
  
  public net.docusign.www.API._3_0.DocumentPDFs requestDocumentPDFs(java.lang.String envelopeID) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.requestDocumentPDFs(envelopeID);
  }
  
  public net.docusign.www.API._3_0.DocumentPDFs requestDocumentPDFsEx(java.lang.String envelopeID) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.requestDocumentPDFsEx(envelopeID);
  }
  
  public net.docusign.www.API._3_0.DocumentPDFs requestDocumentPDFsRecipientsView(java.lang.String envelopeID, java.lang.String recipientName, java.lang.String recipientEmail) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.requestDocumentPDFsRecipientsView(envelopeID, recipientName, recipientEmail);
  }
  
  public net.docusign.www.API._3_0.EnvelopeStatus requestStatusEx(java.lang.String envelopeID) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.requestStatusEx(envelopeID);
  }
  
  public net.docusign.www.API._3_0.EnvelopeStatus requestStatus(java.lang.String envelopeID) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.requestStatus(envelopeID);
  }
  
  public net.docusign.www.API._3_0.FilteredEnvelopeStatuses requestStatusesEx(net.docusign.www.API._3_0.EnvelopeStatusFilter envelopeStatusFilter) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.requestStatusesEx(envelopeStatusFilter);
  }
  
  public net.docusign.www.API._3_0.FilteredEnvelopeStatuses requestStatuses(net.docusign.www.API._3_0.EnvelopeStatusFilter envelopeStatusFilter) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.requestStatuses(envelopeStatusFilter);
  }
  
  public net.docusign.www.API._3_0.RecipientEsignList getRecipientEsignList(java.lang.String userName, java.lang.String senderEmail, java.lang.String senderAccountId, java.lang.String recipientEmail) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.getRecipientEsignList(userName, senderEmail, senderAccountId, recipientEmail);
  }
  
  public net.docusign.www.API._3_0.RecipientList getRecipientList(java.lang.String senderAccountId, java.lang.String recipientEmail) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.getRecipientList(senderAccountId, recipientEmail);
  }
  
  public net.docusign.www.API._3_0.VoidEnvelopeStatus voidEnvelope(java.lang.String envelopeID, java.lang.String reason) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.voidEnvelope(envelopeID, reason);
  }
  
  public java.lang.String requestRecipientToken(java.lang.String envelopeID, java.lang.String clientUserID, java.lang.String username, java.lang.String email, net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertion authenticationAssertion, net.docusign.www.API._3_0.RequestRecipientTokenClientURLs clientURLs) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.requestRecipientToken(envelopeID, clientUserID, username, email, authenticationAssertion, clientURLs);
  }
  
  public net.docusign.www.API._3_0.TransferEnvelopeStatus transferEnvelope(java.lang.String envelopeID, java.lang.String accountID, java.lang.String userID) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.transferEnvelope(envelopeID, accountID, userID);
  }
  
  public net.docusign.www.API._3_0.AccountMembershipFeaturesList getAccountMembershipFeaturesList(java.lang.String accountId) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.getAccountMembershipFeaturesList(accountId);
  }
  
  public net.docusign.www.API._3_0.AccountSetting[] getAccountSettingsList(java.lang.String accountId) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.getAccountSettingsList(accountId);
  }
  
  public net.docusign.www.API._3_0.AuthoritativeCopyExportStatus acknowledgeAuthoritativeCopyExport(java.lang.String envelopeId, java.lang.String transactionId, byte[] checkSumHash) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.acknowledgeAuthoritativeCopyExport(envelopeId, transactionId, checkSumHash);
  }
  
  public net.docusign.www.API._3_0.AuthoritativeCopyExportDocuments exportAuthoritativeCopy(java.lang.String envelopeId) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.exportAuthoritativeCopy(envelopeId);
  }
  
  public net.docusign.www.API._3_0.EnvelopeAuditEventsResponseEnvelopeAuditEventsResult envelopeAuditEvents(java.lang.String envelopeId) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.envelopeAuditEvents(envelopeId);
  }
  
  public boolean ping() throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.ping();
  }
  
  public net.docusign.www.API._3_0.EnvelopeStatus createEnvelopeFromTemplates(net.docusign.www.API._3_0.TemplateReference[] templateReferences, net.docusign.www.API._3_0.Recipient[] recipients, net.docusign.www.API._3_0.EnvelopeInformation envelopeInformation, boolean activateEnvelope) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.createEnvelopeFromTemplates(templateReferences, recipients, envelopeInformation, activateEnvelope);
  }
  
  public net.docusign.www.API._3_0.DocuSignEnvelopeInformation getStatusInDocuSignConnectFormat(java.lang.String envelopeID) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.getStatusInDocuSignConnectFormat(envelopeID);
  }
  
  public net.docusign.www.API._3_0.PurgeDocumentStatus purgeDocuments(java.lang.String envelopeID) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.purgeDocuments(envelopeID);
  }
  
  public net.docusign.www.API._3_0.SaveTemplateResult saveTemplate(net.docusign.www.API._3_0.EnvelopeTemplate envelopeTemplate) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.saveTemplate(envelopeTemplate);
  }
  
  public net.docusign.www.API._3_0.SaveTemplateResult uploadTemplate(java.lang.String templateXML, java.lang.String accountID, boolean shared) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.uploadTemplate(templateXML, accountID, shared);
  }
  
  public net.docusign.www.API._3_0.EnvelopeTemplateDefinition[] requestTemplates(java.lang.String accountID) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.requestTemplates(accountID);
  }
  
  public net.docusign.www.API._3_0.EnvelopeTemplate requestTemplate(java.lang.String templateID, boolean includeDocumentBytes) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.requestTemplate(templateID, includeDocumentBytes);
  }
  
  public java.lang.String getAuthenticationToken(java.lang.String goToEnvelopeID) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.getAuthenticationToken(goToEnvelopeID);
  }
  
  public net.docusign.www.API._3_0.AddressBookItem[] getAddressBookItems(java.lang.String accountID) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.getAddressBookItems(accountID);
  }
  
  public net.docusign.www.API._3_0.UpdateAddressBookResult updateAddressBookItems(net.docusign.www.API._3_0.AddressBookItem[] addressBookItems, boolean returnAddressBook) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.updateAddressBookItems(addressBookItems, returnAddressBook);
  }
  
  public net.docusign.www.API._3_0.UpdateAddressBookResult removeAddressBookItems(net.docusign.www.API._3_0.AddressBookRemoveItem[] addressBookRemoveItems, boolean returnAddressBook) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.removeAddressBookItems(addressBookRemoveItems, returnAddressBook);
  }
  
  public net.docusign.www.API._3_0.SynchEnvelopeStatus synchEnvelope(java.lang.String transactionID, java.lang.String accountID, boolean block) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.synchEnvelope(transactionID, accountID, block);
  }
  
  public java.lang.String requestSenderToken(java.lang.String envelopeID, java.lang.String accountID, java.lang.String returnURL) throws java.rmi.RemoteException{
    if (aPIServiceSoap == null)
      _initAPIServiceSoapProxy();
    return aPIServiceSoap.requestSenderToken(envelopeID, accountID, returnURL);
  }
  
  
}