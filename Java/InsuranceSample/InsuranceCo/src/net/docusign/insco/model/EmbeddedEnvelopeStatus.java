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
 * Represents the different embedded signing statuses and their associated message keys.
 */
public enum EmbeddedEnvelopeStatus {
	ACCESS_CODE_FAILED(0, "autoAppComplete.status.accessCodeFailed"),
	CANCELLED(1, "autoAppComplete.status.cancelled"),
	DECLINED(2, "autoAppComplete.status.declined"),
	EXCEPTION(3, "autoAppComplete.status.exception"),
	ID_CHECK_FAILED(4, "autoAppComplete.status.idCheckFailed"),
	SESSION_TIMEOUT(5, "autoAppComplete.status.sessionTimeout"),
	SIGNING_COMPLETE(6, "autoAppComplete.status.signingComplete"),
	TTL_EXPIRED(7, "autoAppComplete.status.ttlExpired"),
	VIEWING_COMPLETE(8, "autoAppComplete.status.viewingComplete");
	
	private int errorCode;
	private String errorMessageKey;

	private EmbeddedEnvelopeStatus(int errorCode, String errorMessageKey) {
		this.errorCode = errorCode;
		this.errorMessageKey = errorMessageKey;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	
	public String getErrorMessageKey() {
		return errorMessageKey;
	}
	
	public static EmbeddedEnvelopeStatus getStatusForCode(int errorCode) {
		for(EmbeddedEnvelopeStatus status : values()) {
			if(status.getErrorCode() == errorCode) {
				return status;
			}
		}
		
		return null;
	}
}
