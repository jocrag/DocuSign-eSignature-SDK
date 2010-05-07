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
package net.docusign.insco.security;

import java.util.List;

import net.docusign.credential.api.ArrayOfAccount.Account;
import net.docusign.model.User;
import net.docusign.service.DocusignLoginService;

import org.springframework.security.Authentication;
import org.springframework.security.AuthenticationException;
import org.springframework.security.AuthenticationManager;
import org.springframework.security.BadCredentialsException;
import org.springframework.security.GrantedAuthority;
import org.springframework.security.GrantedAuthorityImpl;
import org.springframework.security.providers.UsernamePasswordAuthenticationToken;

/**
 * Spring security {@link AuthenticationManager} that uses the {@link DocusignLoginService} (Credential API) in order to lookup your accounts by email/password.
 */
public class DocusignAuthenticationManager implements AuthenticationManager {
	private DocusignLoginService docusignLoginService;

	public void setDocusignLoginService(DocusignLoginService docusignLoginService) {
		this.docusignLoginService = docusignLoginService;
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.security.AuthenticationManager#authenticate(org.springframework.security.Authentication)
	 */
	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		List<Account> accounts = docusignLoginService.lookupAccountsByEmailAndPassword(auth.getPrincipal().toString(), auth.getCredentials().toString());
		
		if(accounts.isEmpty()) {
			throw new BadCredentialsException("Username/Password does not match an account.");
		}
		
		if(accounts.size() > 1) {
			return createAuthenticationToken((String) auth.getPrincipal(), (String) auth.getCredentials(), "ROLE_MULTIPLE_ACCOUNT", new MultipleAccountInformation(accounts));
		}
		else {
			User validUser = new User().loadFromAccount(accounts.get(0));
			validUser.setPassword((String) auth.getCredentials());
			
			return createAuthenticationToken((String) auth.getPrincipal(), (String) auth.getCredentials(), "ROLE_USER", validUser);
		}
	}
	
	/**
	 * Create the authentication token.
	 * 
	 * @param username the username
	 * @param password the password
	 * @param grantedAuthority the granted role
	 * @param tokenDetails the extra information provided for consumption
	 * @return the authentication token
	 */
	protected Authentication createAuthenticationToken(String username, String password, String grantedAuthority, Object tokenDetails) {
		UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username, password, new GrantedAuthority[] {new GrantedAuthorityImpl(grantedAuthority)});
		authToken.setDetails(tokenDetails);
		
		return authToken;
	}
}
