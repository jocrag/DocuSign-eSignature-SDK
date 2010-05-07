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
package net.docusign.service.impl;

import net.docusign.model.User;
import net.docusign.ws3_0.DocusignAPICredentials;
import net.docusign.ws3_0.DocusignWebserviceFactory;
import net.docusign.ws3_0.api.APIServiceSoap;

/**
 * Builds the Docusign webservice stub using the target user account.
 */
public abstract class AuthenticatedDocusignService {
	private DocusignWebserviceFactory docusignWebserviceFactory;
	
	public void setDocusignWebserviceFactory(DocusignWebserviceFactory docusignWebserviceFactory) {
		this.docusignWebserviceFactory = docusignWebserviceFactory;
	}
	
	public APIServiceSoap getApi(User user) {
		DocusignAPICredentials apiCredentials = new DocusignAPICredentials();
		apiCredentials.setAccountId(user.getAccountId());
		apiCredentials.setUserEmail(user.getEmail());
		apiCredentials.setIntegratorsKey(docusignWebserviceFactory.getIntegratorsKey());
		apiCredentials.setPassword(user.getPassword());
		
		return docusignWebserviceFactory.authorizeAPI(apiCredentials);
	}
}
