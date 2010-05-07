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

import net.docusign.ws3_0.api.EnvelopeTemplate;

/**
 * Represents the template uploaded to Docusign.
 * 
 * @see net.docusign.ws3_0.api.SaveTemplateResult
 */
public class Template {
	private String templateId;
	private String name;
	private EnvelopeTemplate envelopeTemplate;
	
	public String getTemplateId() {
		return templateId;
	}
	
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public EnvelopeTemplate getEnvelopeTemplate() {
		return envelopeTemplate;
	}

	public void setEnvelopeTemplate(EnvelopeTemplate envelopeTemplate) {
		this.envelopeTemplate = envelopeTemplate;
	}
}