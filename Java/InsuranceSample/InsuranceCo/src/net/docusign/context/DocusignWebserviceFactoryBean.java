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

import net.docusign.ws3_0.DocusignWebserviceFactory;
import net.docusign.ws3_0.api.APIServiceSoapImpl;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Spring {@link FactoryBean} that creates a {@link APIServiceSoapImpl} for dependency injection.
 */
public class DocusignWebserviceFactoryBean implements FactoryBean, InitializingBean {
	private DocusignWebserviceFactory docusignWebserviceFactory;
    private String webserviceEndpoint;

    public void setDocusignWebserviceFactory(DocusignWebserviceFactory docusignWebserviceFactory) {
        this.docusignWebserviceFactory = docusignWebserviceFactory;
    }
    
	public void setWebserviceEndpoint(String webserviceEndpoint) {
        this.webserviceEndpoint = webserviceEndpoint;
    }

	public void afterPropertiesSet() throws Exception {
		docusignWebserviceFactory.setupClient(webserviceEndpoint);
	}

	public Object getObject() throws Exception {
		return docusignWebserviceFactory;
	}

	public Class<?> getObjectType() {
		return DocusignWebserviceFactory.class;
	}

	public boolean isSingleton() {
		return true;
	}	
}
