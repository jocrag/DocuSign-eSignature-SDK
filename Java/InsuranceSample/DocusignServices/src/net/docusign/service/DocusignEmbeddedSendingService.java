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

import java.util.List;

import net.docusign.model.EnvelopeToken;
import net.docusign.model.SendModel;
import net.docusign.ws3_0.api.Tab;

/**
 * Defines a service to transition an envelope for embedded sending through the Docusign portal.
 */
public interface DocusignEmbeddedSendingService {
	/**
	 * Transitions an envelope for embedded sending through the Docusign portal. 
	 * 
	 * @param model holds the information used to send the envelope
	 * @param tabs the list of tabs for the envelope document
	 * @return
	 */
	public EnvelopeToken sendEmbedded(SendModel model, List<Tab> tabs);
}