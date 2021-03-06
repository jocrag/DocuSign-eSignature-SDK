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
package net.docusign.context;

import net.docusign.credential.CredentialFactory;
import net.docusign.credential.api.CredentialSoap;
import net.docusign.credential.api.CredentialSoapImpl;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Spring {@link FactoryBean} that creates a {@link CredentialSoapImpl} for dependency
 * injection.
 */
public class CredentialFactoryBean implements FactoryBean, InitializingBean {
	private CredentialSoap credentialSoap;
	private String webserviceEndpoint;
	
	public void setWebserviceEndpoint(String webserviceEndpoint) {
        this.webserviceEndpoint = webserviceEndpoint;
    }

    public void afterPropertiesSet() throws Exception {
		credentialSoap = new CredentialFactory().getCredential(webserviceEndpoint);
	}
	
	public Object getObject() throws Exception {
		return credentialSoap;
	}

	public Class<?> getObjectType() {
		return CredentialSoapImpl.class;
	}

	public boolean isSingleton() {
		return true;
	}
}
