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

import java.util.HashMap;
import java.util.Map;

import net.docusign.insco.model.EmbeddedEnvelopeStatus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller to handle embedding signing callback once the docusign signing is complete.
 */
@Controller
@RequestMapping("/autoAppComplete.html")
public class AutoAppCompleteController extends AbstractController {
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView onView(@RequestParam(value="statusCode", required=true) Integer statusCode) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put(USER_ATTR, getUser());
		
		EmbeddedEnvelopeStatus signingStatus = EmbeddedEnvelopeStatus.getStatusForCode(statusCode);
		
		model.put("statusMessageKey", signingStatus.getErrorMessageKey());
		
		return new ModelAndView("autoAppComplete", "model", model);
	}
}
