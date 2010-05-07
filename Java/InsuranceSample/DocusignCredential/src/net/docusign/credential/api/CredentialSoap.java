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
package net.docusign.credential.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://www.docusign.net/API/Credential", name = "CredentialSoap")
@XmlSeeAlso( { ObjectFactory.class })
public interface CredentialSoap {

    @WebResult(name = "PingResult", targetNamespace = "http://www.docusign.net/API/Credential")
    @RequestWrapper(localName = "Ping", targetNamespace = "http://www.docusign.net/API/Credential", className = "net.docusign.credential.api.Ping")
    @ResponseWrapper(localName = "PingResponse", targetNamespace = "http://www.docusign.net/API/Credential", className = "net.docusign.credential.api.PingResponse")
    @WebMethod(operationName = "Ping", action = "http://www.docusign.net/API/Credential/Ping")
    public boolean ping();

    @WebResult(name = "RequestSenderTokenResult", targetNamespace = "http://www.docusign.net/API/Credential")
    @RequestWrapper(localName = "RequestSenderToken", targetNamespace = "http://www.docusign.net/API/Credential", className = "net.docusign.credential.api.RequestSenderToken")
    @ResponseWrapper(localName = "RequestSenderTokenResponse", targetNamespace = "http://www.docusign.net/API/Credential", className = "net.docusign.credential.api.RequestSenderTokenResponse")
    @WebMethod(operationName = "RequestSenderToken", action = "http://www.docusign.net/API/Credential/RequestSenderToken")
    public java.lang.String requestSenderToken(@WebParam(name = "Email", targetNamespace = "http://www.docusign.net/API/Credential") java.lang.String email, @WebParam(name = "Password", targetNamespace = "http://www.docusign.net/API/Credential") java.lang.String password, @WebParam(name = "AccountID", targetNamespace = "http://www.docusign.net/API/Credential") java.lang.String accountID, @WebParam(name = "EnvelopeID", targetNamespace = "http://www.docusign.net/API/Credential") java.lang.String envelopeID, @WebParam(name = "ReturnURL", targetNamespace = "http://www.docusign.net/API/Credential") java.lang.String returnURL);

    @WebResult(name = "LoginResult", targetNamespace = "http://www.docusign.net/API/Credential")
    @RequestWrapper(localName = "Login", targetNamespace = "http://www.docusign.net/API/Credential", className = "net.docusign.credential.api.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://www.docusign.net/API/Credential", className = "net.docusign.credential.api.LoginResponse")
    @WebMethod(operationName = "Login", action = "http://www.docusign.net/API/Credential/Login")
    public net.docusign.credential.api.LoginResponse.LoginResult login(@WebParam(name = "Email", targetNamespace = "http://www.docusign.net/API/Credential") java.lang.String email, @WebParam(name = "Password", targetNamespace = "http://www.docusign.net/API/Credential") java.lang.String password);

    @WebResult(name = "GetAuthenticationTokenResult", targetNamespace = "http://www.docusign.net/API/Credential")
    @RequestWrapper(localName = "GetAuthenticationToken", targetNamespace = "http://www.docusign.net/API/Credential", className = "net.docusign.credential.api.GetAuthenticationToken")
    @ResponseWrapper(localName = "GetAuthenticationTokenResponse", targetNamespace = "http://www.docusign.net/API/Credential", className = "net.docusign.credential.api.GetAuthenticationTokenResponse")
    @WebMethod(operationName = "GetAuthenticationToken", action = "http://www.docusign.net/API/Credential/GetAuthenticationToken")
    public java.lang.String getAuthenticationToken(@WebParam(name = "Email", targetNamespace = "http://www.docusign.net/API/Credential") java.lang.String email, @WebParam(name = "Password", targetNamespace = "http://www.docusign.net/API/Credential") java.lang.String password, @WebParam(name = "AccountID", targetNamespace = "http://www.docusign.net/API/Credential") java.lang.String accountID, @WebParam(name = "GoToEnvelopeID", targetNamespace = "http://www.docusign.net/API/Credential") java.lang.String goToEnvelopeID);
}