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
package net.docusign.model;

import java.io.Serializable;

import net.docusign.credential.api.ArrayOfAccount.Account;

/**
 * Represents a Docusign account.
 */
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	private String accountId;
	private String userName;
	private String accountName;
	private String firstName;
	private String lastName;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return getFirstName().concat(" ").concat(getLastName());
	}
	
	public String getInitials() {
		return (getFirstName().length() > 0 ? getFirstName().substring(0, 1) : "")
			.concat(getLastName().length() > 0 ? getLastName().substring(0, 1) : "");
	}
	
	public User loadFromAccount(Account account) {
		setEmail(account.getEmail());
		setAccountId(account.getAccountID());
		setUserName(account.getUserName());
		setAccountName(account.getAccountName());
		
		return this;
	}
}