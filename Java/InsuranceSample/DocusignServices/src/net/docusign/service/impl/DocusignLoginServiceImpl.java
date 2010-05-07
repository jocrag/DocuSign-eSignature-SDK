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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.docusign.credential.api.CredentialSoap;
import net.docusign.credential.api.ArrayOfAccount.Account;
import net.docusign.credential.api.LoginResponse.LoginResult;
import net.docusign.service.DocusignLoginService;
import net.docusign.util.LogUtil;

/**
 * Implements  a service to list Docusign accounts by username/password.
 */
public class DocusignLoginServiceImpl implements DocusignLoginService {
    private static Log log = LogFactory.getLog(DocusignLoginServiceImpl.class);
	private CredentialSoap credentialSoap;
	
	public void setCredentialFactory(CredentialSoap credentialSoap) {
		this.credentialSoap = credentialSoap;
	}
	
	/* (non-Javadoc)
	 * @see net.docusign.service.DocusignLoginService#lookupAccountsByEmailAndPassword(java.lang.String, java.lang.String)
	 */
	public List<Account> lookupAccountsByEmailAndPassword(String username, String password) {
		LoginResult loginResult = credentialSoap.login(username, password);

		if(loginResult.getAccounts() != null) {
		    List<Account> accounts = loginResult.getAccounts().getAccount();

		    for(Account account : accounts) {
		        log.info(LogUtil.logFoundAccount(account, password));
		    }
		    
			return accounts;
		}
		else {
		    log.info(LogUtil.logNoAccounts(username, password));
			return new ArrayList<Account>();
		}
	}

    /* (non-Javadoc)
     * @see net.docusign.service.DocusignLoginService#pingService()
     */
    @Override
    public boolean pingService() {
        Boolean pingResponse = credentialSoap.ping();
        log.info(LogUtil.logCredentialPingResponse(pingResponse));
        
        return pingResponse;
    }
}
