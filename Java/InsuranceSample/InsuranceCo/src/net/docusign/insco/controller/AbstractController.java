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

import net.docusign.model.User;

import org.springframework.security.context.SecurityContextHolder;

/**
 * Provides common functionality to all webmvc controllers.
 */
public abstract class AbstractController {
	public final static String USER_ATTR = "user";
	public final static String TEMPLATE_ATTR = "template";
    public final static String ENVELOPE_STATUS_ATTR = "envelopeStatus";

	public User getUser() {
		Object userObj = SecurityContextHolder.getContext().getAuthentication().getDetails();
		if(userObj instanceof User) {
			return (User) userObj;
		}

		return null;
	}
}
