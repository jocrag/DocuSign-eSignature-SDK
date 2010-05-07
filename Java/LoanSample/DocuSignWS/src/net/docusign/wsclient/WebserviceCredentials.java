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
 * Holder for the user/pass credentials for both UsernameToken & Signature authentication.  
 */
public class WebserviceCredentials {
    private String integratorsKey;
	private String accountId;
	private String password;
	private String userEmail;
	private String webserviceEndpoint;
	private String keystoreFile;
	private String keystoreAlias;
    private String keystorePass;
    
	private static WebserviceCredentials instance;
	
	private WebserviceCredentials() {
		
	}
	
	public static WebserviceCredentials getInstance() {
		if(instance == null) {
			instance = new WebserviceCredentials();
		}
		return instance;
	}
	
	public String getIntegratorsKey() {
        return integratorsKey;
    }
    
    public void setIntegratorsKey(String integratorsKey) {
        this.integratorsKey = integratorsKey;
    }
	
	public String getAccountId() {
		return accountId;
	}
	
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserEmail() {
	    return userEmail;
	}
	
	public void setUserEmail(String userEmail) {
	    this.userEmail = userEmail;
	}

	public String getWebserviceEndpoint() {
        return webserviceEndpoint;
    }

    public void setWebserviceEndpoint(String webserviceEndpoint) {
        this.webserviceEndpoint = webserviceEndpoint;
    }

    public String getKeystoreFile() {
        return keystoreFile;
    }

    public void setKeystoreFile(String keystoreFile) {
        this.keystoreFile = keystoreFile;
    }

    public String getKeystoreAlias() {
        return keystoreAlias;
    }

    public void setKeystoreAlias(String keystoreAlias) {
        this.keystoreAlias = keystoreAlias;
    }
	
	public String getKeystorePass() {
		return keystorePass;
	}

	public void setKeystorePass(String keystorePass) {
		this.keystorePass = keystorePass;
	}
}
