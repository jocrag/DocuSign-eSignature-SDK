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

import java.io.IOException;
import java.io.InputStream;

import net.docusign.model.Template;
import net.docusign.model.User;
import net.docusign.ws3_0.api.EnvelopeTemplate;
import net.docusign.ws3_0.api.EnvelopeTemplates;

/**
 * Defines a service to retrieve and store templates to a user's Docusign account.
 */
public interface DocusignTemplateService {
	/**
	 * Retrieves a template by its id.
	 * 
	 * @param templateId the template id
	 * @return the envelope template
	 */
	public EnvelopeTemplate getTemplateById(String templateId, User user);
	
	/**
	 * Retrieve all templates. 
	 * 
	 * @param user the user
	 * @return the envelope templates for this user
	 */
	public EnvelopeTemplates getTemplates(User user);
	
	/**
	 * Retrieve a template by name.
	 * 
	 * @param templateName the template name
	 * @param user the user
	 * @return the template
	 */
	public Template getTemplateByName(final String templateName, User user);
	
	/**
	 * Uploads the content stream for the template. 
	 * 
	 * @param user the user
	 * @return the template that was uploaded
	 * @throws IOException if there was an i/o error reading the template stream
	 */
	public Template uploadTemplate(InputStream templateXmlInputStream, User user) throws IOException;
	
	/**
	 * Updates the information for the template.
	 * 
	 * @param template the template
	 * @param user the user
	 */
	public Template updateTemplate(Template template, User user);
}