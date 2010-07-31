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

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.docusign.model.Template;
import net.docusign.model.User;
import net.docusign.service.DocusignTemplateService;
import net.docusign.util.LogUtil;
import net.docusign.util.Util;
import net.docusign.ws3_0.api.EnvelopeTemplate;
import net.docusign.ws3_0.api.EnvelopeTemplateDefinition;
import net.docusign.ws3_0.api.EnvelopeTemplates;
import net.docusign.ws3_0.api.Recipient;
import net.docusign.ws3_0.api.SaveTemplateResult;

/**
 * Implements a service to retrieve and store templates to a user's Docusign account.
 */
public class DocusignTemplateServiceImpl extends AuthenticatedDocusignService implements DocusignTemplateService {
    private static Log log = LogFactory.getLog(DocusignTemplateServiceImpl.class);
    
	/* (non-Javadoc)
	 * @see net.docusign.service.DocusignTemplateService#getTemplateById(java.lang.String, net.docusign.insco.model.User)
	 */
	public EnvelopeTemplate getTemplateById(String templateId, User user) {
	    log.info(LogUtil.logRequestTemplateRequest(templateId));
		EnvelopeTemplate requestTemplate = getApi(user).requestTemplate(templateId, true);
		log.info(LogUtil.logRequestTemplateResponse(requestTemplate));
		
		return requestTemplate;
	}
	
	/* (non-Javadoc)
	 * @see net.docusign.service.DocusignTemplateService#getTemplates(net.docusign.insco.model.User)
	 */
	public EnvelopeTemplates getTemplates(User user) {
	    String accountId = user.getAccountId();
	    log.info(LogUtil.logRequestTemplatesRequest(accountId));

	    EnvelopeTemplates requestTemplates = getApi(user).requestTemplates(accountId, true);
		
	    log.info(LogUtil.logRequestTemplatesResponse(requestTemplates));
		return requestTemplates;
	}

	/* (non-Javadoc)
	 * @see net.docusign.service.DocusignTemplateService#getTemplateByName(java.lang.String, net.docusign.insco.model.User)
	 */
	public Template getTemplateByName(final String templateName, User user) {
		EnvelopeTemplates templates = getTemplates(user);
		
		EnvelopeTemplateDefinition matchedTemplate = null;
		for(EnvelopeTemplateDefinition templateDef : templates.getEnvelopeTemplateDefinition()) {
			if(templateName.equals(templateDef.getName())) {
				matchedTemplate = templateDef;
				break;
			}
		}
		
		if(matchedTemplate == null) {
			return null;
		}
		else {
			Template template = new Template();
			template.setName(matchedTemplate.getName());
			template.setTemplateId(matchedTemplate.getTemplateID());
			template.setEnvelopeTemplate(getTemplateById(template.getTemplateId(), user));
			return template;
		}
	}
	
	/* (non-Javadoc)
	 * @see net.docusign.service.DocusignTemplateService#uploadTemplate(java.io.InputStream, net.docusign.insco.model.User)
	 */
	public Template uploadTemplate(InputStream templateXmlInputStream, User user) throws IOException {
		String templateXml = Util.stringForStream(templateXmlInputStream, "UTF-8");
		templateXml = templateXml.replaceAll("[\\n\\f\\r]", "");
		
		log.info(LogUtil.logUploadTemplateRequest(templateXml));
		
		SaveTemplateResult result = getApi(user).uploadTemplate(templateXml, user.getAccountId(), true);
		
		log.info(LogUtil.logUploadTemplateResponse(result));
		
		Template template = new Template();
		template.setName(result.getName());
		template.setTemplateId(result.getTemplateID());
		
		return template;
	}

	/* (non-Javadoc)
	 * @see net.docusign.service.DocusignTemplateService#updateTemplate(net.docusign.insco.model.Template, net.docusign.insco.model.User)
	 */
	public Template updateTemplate(Template template, User user) {
		EnvelopeTemplate envTemplate = getTemplateById(template.getTemplateId(), user);
		
		Recipient recipientSigner = envTemplate.getEnvelope().getRecipients().getRecipient().get(0);
		recipientSigner.setEmail(user.getEmail());
		recipientSigner.setUserName(user.getUserName());
		
		log.info(LogUtil.logSaveTemplateRequest(template.getTemplateId()));
		
		SaveTemplateResult result = getApi(user).saveTemplate(envTemplate);
		
		log.info(LogUtil.logSaveTemplateResponse(template.getTemplateId()));
		
		template.setName(result.getName());
		template.setTemplateId(result.getTemplateID());
		template.setEnvelopeTemplate(envTemplate);
		return template;
	}
}