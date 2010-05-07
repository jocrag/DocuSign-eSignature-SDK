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
package net.docusign.ws3_0;

import java.util.HashMap;
import java.util.Map;


import org.apache.ws.security.WSConstants;
import org.apache.ws.security.WSPasswordCallback;
import org.apache.ws.security.handler.WSHandlerConstants;

/**
 * Sets up WSS4J(>= 1.5.8) with certificate (X.509) signing enabled. 
 */
public class X509DocusignWebserviceFactory extends DocusignWebserviceFactory {

	/**
	 * Location of certificate property file relative to classpath.
	 */
	protected static final String CERT_PROPERTY_FILE = "cert.properties";
	
	/**
	 * Defines each security action needed by each web-service request to the Docusign API.
	 */
	protected static final String UT_SIGNATURE_ACTION = WSHandlerConstants.SIGNATURE + " " + WSHandlerConstants.USERNAME_TOKEN + " " + WSHandlerConstants.TIMESTAMP;
	
	/**
	 * This security option sends the user's configured certificate (pulled from the keystore) with each request.
	 */
	protected static final String DIRECT_REFERENCE = "DirectReference";

	private String keystoreAlias;
	private String keystorePassword;
	
	public void setKeystoreAlias(String keystoreAlias) {
		this.keystoreAlias = keystoreAlias;
	}
	
	public void setKeystorePassword(String keystorePassword) {
		this.keystorePassword = keystorePassword;
	}
	
	/* @see net.docusign.ws3_0.DocusignWebserviceFactory#buildWSS4JProperties(net.docusign.ws3_0.DocusignAPICredentials) */
	@Override
	protected Map<String, Object> buildWSS4JProperties(DocusignAPICredentials docusignAPICredentials) {
	    this.email = docusignAPICredentials.getUserEmail();
	    
		Map<String, Object> securityProperties = new HashMap<String, Object>();
		configureSecurityActions(securityProperties);
		configurePasswords(docusignAPICredentials, securityProperties);
		configureUsernameToken(docusignAPICredentials, securityProperties);
		configureSignature(securityProperties); 
		
		return securityProperties;
	}

	protected void configureSecurityActions(Map<String, Object> securityProperties) {
		securityProperties.put(WSHandlerConstants.ACTION, UT_SIGNATURE_ACTION);
	}

	protected void configureSignature(Map<String, Object> securityProperties) {
		securityProperties.put(WSHandlerConstants.SIGNATURE_USER, keystoreAlias);
		securityProperties.put(WSHandlerConstants.SIG_KEY_ID, DIRECT_REFERENCE);
		securityProperties.put(WSHandlerConstants.SIG_PROP_FILE, CERT_PROPERTY_FILE);
	}

	protected void configureUsernameToken(DocusignAPICredentials docusignAPICredentials, Map<String, Object> securityProperties) {
		securityProperties.put(WSHandlerConstants.USER, getIntegratorsKey());
		securityProperties.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
	}

	protected void configurePasswords(DocusignAPICredentials docusignAPICredentials, Map<String, Object> securityProperties) {
		Map<Integer, String> passwordUsageMap = new HashMap<Integer, String>();
		passwordUsageMap.put(WSPasswordCallback.USERNAME_TOKEN, docusignAPICredentials.getPassword());
		passwordUsageMap.put(WSPasswordCallback.SIGNATURE, keystorePassword);
		
		securityProperties.put(WSHandlerConstants.PW_CALLBACK_REF, new PasswordCallbackHandler(passwordUsageMap));
	}
}
