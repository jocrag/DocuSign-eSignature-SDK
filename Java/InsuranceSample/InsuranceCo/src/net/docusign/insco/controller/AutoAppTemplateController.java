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
package net.docusign.insco.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.docusign.model.Template;
import net.docusign.service.DocusignTemplateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller to handle uploading/overwriting of automobile insurance template.
 */
@Controller
@RequestMapping("/autoAppTemplate.html")
@SessionAttributes({AbstractController.TEMPLATE_ATTR})
public class AutoAppTemplateController extends AbstractController {
	private final static String AUTO_INSURANCE_TEMPLATE_NAME = "Auto Insurance Application";
	private DocusignTemplateService docusignTemplateService;
	
	@Autowired
	public void setDocusignTemplateService(DocusignTemplateService docusignTemplateService) {
		this.docusignTemplateService = docusignTemplateService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView onView(HttpServletRequest request, HttpSession session) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put(USER_ATTR, getUser());
		
		Template template = docusignTemplateService.getTemplateByName(AUTO_INSURANCE_TEMPLATE_NAME, getUser());
		
		if(template == null) {
			model.put("needsTemplate", true);
		}
		else {
			session.setAttribute(TEMPLATE_ATTR, template);
			model.put("needsTemplate", false);
			model.put("template", template);
		}
		
		return new ModelAndView("autoAppTemplate", "model", model);
	}

	@RequestMapping(value="/autoAppTemplate.html", method = RequestMethod.POST, params="authorizeUpload")
	public ModelAndView onAuthorizeUploadSubmit(@RequestParam(value="authorizeTemplateUpload", required=false) Boolean authorizeTemplateUpload, HttpSession session) throws IOException {
		
		if(authorizeTemplateUpload == null) {
			return new ModelAndView("redirect:/home.html", "model", new HashMap<String, Object>());
		}
		else {
			InputStream templateInputStream = getClass().getResourceAsStream("/autoInsuranceApplication.dpd");
			Template template = docusignTemplateService.uploadTemplate(templateInputStream, getUser());
			
			session.setAttribute(TEMPLATE_ATTR, template);
			
			Map<String, Object> model = new HashMap<String, Object>();
			model.put(USER_ATTR, getUser());
			model.put(TEMPLATE_ATTR, template);
			
			return new ModelAndView("redirect:/autoAppApply.html", "model", model);
		}
	}
	
	@RequestMapping(value="/autoAppTemplate.html", method = RequestMethod.POST, params="authorizeOverwrite")
	public ModelAndView onAuthorizeOverwriteSubmit(@RequestParam(value="authorizeTemplateOverwrite", required=false) Boolean authorizeTemplateOverwrite, HttpSession session) throws IOException {
		Map<String, Object> model = new HashMap<String, Object>();

		if(authorizeTemplateOverwrite != null && authorizeTemplateOverwrite) {
			Template template = (Template) session.getAttribute(TEMPLATE_ATTR);
			
			template = docusignTemplateService.updateTemplate(template, getUser());
			model.put(TEMPLATE_ATTR, template);
		}
		else {
			model.put(TEMPLATE_ATTR, session.getAttribute(TEMPLATE_ATTR));
		}

		model.put(USER_ATTR, getUser());
		return new ModelAndView("redirect:/autoAppApply.html", "model", model);
	}
}
