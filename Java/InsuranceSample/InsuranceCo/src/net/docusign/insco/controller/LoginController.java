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
import java.util.Locale;
import java.util.Map;

import net.docusign.insco.model.LoginErrorCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller to handle the login page.  This page is also responsible for showing the multiple
 * accounts error.
 */
@Controller
@RequestMapping("/login.html")
public class LoginController extends AbstractController {	
	private MessageSource messageSource;
	
	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView onView() throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView("login", "model", model);
	}
	
	@RequestMapping(method = RequestMethod.GET, params={"errorCode"})
	public ModelAndView onError(@RequestParam(value="errorCode", required=true) Integer errorCode) {
		Map<String, Object> model = new HashMap<String, Object>();
		
		LoginErrorCode loginError = LoginErrorCode.getLoginErrorByCode(errorCode);
		if(LoginErrorCode.LOGIN_ERROR_USER_PASS.equals(loginError)) {
			model.put("authenticationErrorMessage", messageSource.getMessage(loginError.getErrorMessageKey(), null, Locale.getDefault()));
			return new ModelAndView("login", "model", model);
		}
		else {
			model.put("authenticationErrorMessage", messageSource.getMessage(LoginErrorCode.LOGIN_ERROR_UNKNOWN.getErrorMessageKey(), null, Locale.getDefault()));
			return new ModelAndView("login", "model", model);
		}
	}
}
