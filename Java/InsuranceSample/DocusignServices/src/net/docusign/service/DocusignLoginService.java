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
package net.docusign.service;

import java.util.List;

import net.docusign.credential.api.ArrayOfAccount.Account;

/**
 * Defines a service to list Docusign accounts by username/password.
 */
public interface DocusignLoginService {
	/**
	 * Retrieves a list of Docusign accounts by username and password.
	 * 
	 * @param username the username
	 * @param password the password
	 * @return the list of accounts
	 */
	public List<Account> lookupAccountsByEmailAndPassword(String username, String password);
	
	/**
     * Check whether the credential webservice is operational by issuing a ping request.
     * 
     * @param user the user
     * @return whether or not the credential webservice is operational
     */
	public boolean pingService();
}