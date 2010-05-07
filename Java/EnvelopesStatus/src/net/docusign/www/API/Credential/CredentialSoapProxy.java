package net.docusign.www.API.Credential;

public class CredentialSoapProxy implements net.docusign.www.API.Credential.CredentialSoap {
  private String _endpoint = null;
  private net.docusign.www.API.Credential.CredentialSoap credentialSoap = null;
  
  public CredentialSoapProxy() {
    _initCredentialSoapProxy();
  }
  
  public CredentialSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCredentialSoapProxy();
  }
  
  private void _initCredentialSoapProxy() {
    try {
      credentialSoap = (new net.docusign.www.API.Credential.CredentialLocator()).getCredentialSoap();
      if (credentialSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)credentialSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)credentialSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (credentialSoap != null)
      ((javax.xml.rpc.Stub)credentialSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.docusign.www.API.Credential.CredentialSoap getCredentialSoap() {
    if (credentialSoap == null)
      _initCredentialSoapProxy();
    return credentialSoap;
  }
  
  public boolean ping() throws java.rmi.RemoteException{
    if (credentialSoap == null)
      _initCredentialSoapProxy();
    return credentialSoap.ping();
  }
  
  public net.docusign.www.API.Credential.LoginResponseLoginResult login(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (credentialSoap == null)
      _initCredentialSoapProxy();
    return credentialSoap.login(email, password);
  }
  
  
}