/**
 * CredentialSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API.Credential;

public interface CredentialSoap extends java.rmi.Remote {
    public boolean ping() throws java.rmi.RemoteException;
    public net.docusign.www.API.Credential.LoginResponseLoginResult login(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String getAuthenticationToken(java.lang.String email, java.lang.String password, java.lang.String accountID, java.lang.String goToEnvelopeID) throws java.rmi.RemoteException;
    public java.lang.String requestSenderToken(java.lang.String email, java.lang.String password, java.lang.String accountID, java.lang.String envelopeID, java.lang.String returnURL) throws java.rmi.RemoteException;
    public java.lang.String requestCorrectToken(java.lang.String email, java.lang.String password, java.lang.String envelopeID, boolean suppressNavigation, java.lang.String returnURL) throws java.rmi.RemoteException;
}
