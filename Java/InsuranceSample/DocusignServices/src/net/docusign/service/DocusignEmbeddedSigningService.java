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

import net.docusign.model.EmbeddedSign;
import net.docusign.model.EnvelopeToken;

/**
 * Defines a service to transition an envelope for embedded signing through the Docusign portal.
 */
public interface DocusignEmbeddedSigningService {
	/**
	 * Transition an envelope for embedded signing through the Docusign portal 
	 * 
	 * @param model the embedded sign model
	 * @param securityDomainHost the host executing this request used as the Docusign security domain
	 * @return an envelope token
	 */
	public EnvelopeToken signEmbedded(EmbeddedSign model, String securityDomainHost);
}
