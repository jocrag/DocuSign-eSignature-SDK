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

import java.util.Map;

import net.docusign.ws3_0.api.Envelope;

/**
 * Represents the parameters needed to send an envelope for signature through email. 
 * 
 * TODO comment fields when you know what they're used for
 */
public class SignModel {
	private Envelope envelope;
	private User user;
	private String emailDestination;
	private String emailDestinationCC;
	private Boolean idCheck;
	private String accessCode;
	private String signEmailSubject;
	private String signEmailBlurb;
	private Map<String, String> tabLabelToData;
	
	public Envelope getEnvelope() {
		return envelope;
	}
	
	public void setEnvelope(Envelope envelope) {
		this.envelope = envelope;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getEmailDestination() {
		return emailDestination;
	}
	
	public void setEmailDestination(String emailDestination) {
		this.emailDestination = emailDestination;
	}
	
	public String getEmailDestinationCC() {
		return emailDestinationCC;
	}
	
	public void setEmailDestinationCC(String emailDestinationCC) {
		this.emailDestinationCC = emailDestinationCC;
	}
	
	public Boolean getIdCheck() {
		return idCheck;
	}
	
	public void setIdCheck(Boolean idCheck) {
		this.idCheck = idCheck;
	}
	
	public String getAccessCode() {
		return accessCode;
	}
	
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	
	public String getSignEmailSubject() {
		return signEmailSubject;
	}

	public void setSignEmailSubject(String signEmailSubject) {
		this.signEmailSubject = signEmailSubject;
	}

	public String getSignEmailBlurb() {
		return signEmailBlurb;
	}

	public void setSignEmailBlurb(String signEmailBlurb) {
		this.signEmailBlurb = signEmailBlurb;
	}

	public Map<String, String> getTabLabelToData() {
		return tabLabelToData;
	}
	
	public void setTabLabelToData(Map<String, String> tabDataMap) {
		this.tabLabelToData = tabDataMap;
	}
}