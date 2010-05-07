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

import java.util.logging.Logger;

@javax.jws.WebService(serviceName = "Credential", portName = "CredentialSoap", targetNamespace = "http://www.docusign.net/API/Credential", wsdlLocation = "https://demo.docusign.net/api/3.0/Credential.asmx?WSDL", endpointInterface = "net.docusign.credential.api.CredentialSoap")
public class CredentialSoapImpl implements CredentialSoap {
    private static final Logger LOG = Logger.getLogger(CredentialSoapImpl.class.getName());

    /*
     * (non-Javadoc)
     *
     * @see net.docusign.credential.api.CredentialSoap#ping()
     */
    public boolean ping() {
        LOG.info("Executing operation ping");
        try {
            boolean _return = false;
            return _return;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see net.docusign.credential.api.CredentialSoap#requestSenderToken(java.lang.String email, java.lang.String password ,java.lang.String accountID ,java.lang.String envelopeID ,java.lang.String returnURL)
     */
    public java.lang.String requestSenderToken(java.lang.String email, java.lang.String password, java.lang.String accountID, java.lang.String envelopeID, java.lang.String returnURL) {
        LOG.info("Executing operation requestSenderToken");
        System.out.println(email);
        System.out.println(password);
        System.out.println(accountID);
        System.out.println(envelopeID);
        System.out.println(returnURL);
        try {
            java.lang.String _return = "";
            return _return;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see net.docusign.credential.api.CredentialSoap#login(java.lang.String email ,java.lang.String password)
     */
    public net.docusign.credential.api.LoginResponse.LoginResult login(java.lang.String email, java.lang.String password) {
        LOG.info("Executing operation login");
        System.out.println(email);
        System.out.println(password);
        try {
            net.docusign.credential.api.LoginResponse.LoginResult _return = null;
            return _return;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see net.docusign.credential.api.CredentialSoap#getAuthenticationToken(java.lang.String email ,java.lang.String password ,java.lang.String accountID ,java.lang.String goToEnvelopeID)
     */
    public java.lang.String getAuthenticationToken(java.lang.String email, java.lang.String password, java.lang.String accountID, java.lang.String goToEnvelopeID) {
        LOG.info("Executing operation getAuthenticationToken");
        System.out.println(email);
        System.out.println(password);
        System.out.println(accountID);
        System.out.println(goToEnvelopeID);
        try {
            java.lang.String _return = "";
            return _return;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}