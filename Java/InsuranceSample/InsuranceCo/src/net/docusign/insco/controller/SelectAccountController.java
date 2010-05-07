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
import java.util.List;
import java.util.Locale;
import java.util.Map;

import net.docusign.credential.api.ArrayOfAccount.Account;
import net.docusign.insco.model.LoginErrorCode;
import net.docusign.insco.security.MultipleAccountInformation;
import net.docusign.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.Authentication;
import org.springframework.security.GrantedAuthority;
import org.springframework.security.GrantedAuthorityImpl;
import org.springframework.security.context.SecurityContextHolder;
import org.springframework.security.providers.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller that sets your working account based on what you selected.
 */
@Controller
@RequestMapping("/selectAccount.html")
public class SelectAccountController extends AbstractController {
	private MessageSource messageSource;
	
	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView onView() {
		List<Account> validAccounts = ((MultipleAccountInformation) SecurityContextHolder.getContext().getAuthentication().getDetails()).getValidAccounts();
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("username", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
		model.put("accounts", validAccounts);
		model.put("authenticationErrorMessage", messageSource.getMessage(LoginErrorCode.LOGIN_ERROR_MULTIPLE_ACCOUNTS.getErrorMessageKey(), null, Locale.getDefault()));
		return new ModelAndView("selectAccount", "model", model);
	}
	
	@RequestMapping(method = RequestMethod.GET, params={"accountName"})
	public ModelAndView onSelect(@RequestParam(value="accountName", required=true) String accountName) throws Exception {
		Authentication multipleAuth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Account> validAccounts = ((MultipleAccountInformation) SecurityContextHolder.getContext().getAuthentication().getDetails()).getValidAccounts();
		
		for(Account validAccount : validAccounts) {
			if(validAccount.getAccountName().equals(accountName)) {
				GrantedAuthority[] grants = new GrantedAuthority[1];
				grants[0] = new GrantedAuthorityImpl("ROLE_USER");
				
				UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(validAccount.getUserName(), null, grants);
				User user = new User().loadFromAccount(validAccount);
				user.setPassword((String) multipleAuth.getCredentials());
				
				authToken.setDetails(user);
				
				SecurityContextHolder.getContext().setAuthentication(authToken);
				return new ModelAndView("redirect:/home.html", "model", new HashMap<String, Object>());
			}
		}
		
		return new ModelAndView("redirect:/login.html", "model", new HashMap<String, Object>()); 
	}
}
