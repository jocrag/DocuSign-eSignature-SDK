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
package net.docusign.insco.model;

/**
 * Enum that represents possible login error codes and their associated message key.
 */
public enum LoginErrorCode {
	LOGIN_ERROR_USER_PASS(0, "login.bad-user-pass"),
	LOGIN_ERROR_MULTIPLE_ACCOUNTS(1, "login.multiple-accounts"),
	LOGIN_ERROR_UNKNOWN("login.unknown-login-failure");
	
	private int errorCode;
	private String errorMessageKey;
	
	private LoginErrorCode(String errorMessageKey) {
		this.errorMessageKey = errorMessageKey;
	}
	
	private LoginErrorCode(int errorCode, String errorMessageKey) {
		this.errorCode = errorCode;
		this.errorMessageKey = errorMessageKey;
	}
	
	public String getErrorMessageKey() {
		return errorMessageKey;
	}
	
	public static LoginErrorCode getLoginErrorByCode(int errorCode) {
		for(LoginErrorCode loginError : values()) {
			if(loginError.errorCode == errorCode) {
				return loginError;
			}
		}
		
		return null;
	}
}
