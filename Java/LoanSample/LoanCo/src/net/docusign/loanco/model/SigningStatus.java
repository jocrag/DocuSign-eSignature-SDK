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
package net.docusign.loanco.model;

public enum SigningStatus {
	ACCESS_CODE("AccessCode", "The access code verification has failed.  The user was denied an opportunity to view or sign the document."),
	CANCEL("Cancel", "The user has cancelled out of the signing experience."),
	DECLINE("Decline", "The user has declined to sign the document."),
	EXCEPTION("Exception", "An exception has occurred on the server.  Please check the parameters passed to the Web Service Methods."),
	ID_CHECK("IDCheck", "The ID Check has failed.  The user was denied an opportunity to view or sign the document."),
	TIMEOUT("Timeout", "The user did not sign the document in time.  The timeout is set to 20 minutes."),
	SIGN_COMPLETE("SignComplete", "The user has completed the signing.  The legally binding document with signatures is stored on the DocuSign, Inc. server."),
	TTL_EXPIRED("TTLExpired", "Trusted connection has experied.  The server communication might be a problem."),
	VIEW_COMPLETE("ViewComplete", "The user has viewed the document without signing it.");
    
	SigningStatus(String statusName, String statusMessage) {
        this.statusName = statusName;
        this.statusMessage = statusMessage;
    }

    private final String statusName;
    private final String statusMessage;
    
    public String getName() {
        return statusName;
    }
    
    public String getMessage() {
    	return statusMessage;
    }
    
    public static SigningStatus parseSigningStatus(String statusName) {
        for(SigningStatus signingStatus : SigningStatus.values()) {
            if(statusName.equalsIgnoreCase(signingStatus.getName())) {
                return signingStatus;
            }
        }
        return null;
    }
}