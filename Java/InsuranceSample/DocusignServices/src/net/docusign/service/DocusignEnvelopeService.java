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
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;

import net.docusign.model.User;
import net.docusign.ws3_0.api.DocumentPDF;
import net.docusign.ws3_0.api.EnvelopeStatus;
import net.docusign.ws3_0.api.EnvelopeStatusCode;

/**
 * Defines a service to retrieve items & information about envelopes.
 */
public interface DocusignEnvelopeService {
	/**
	 * Retrieves the envelope status by envelope id.
	 *
	 * @param envelopeId the envelope id
	 * @param user the user executing the request
	 * @return the envelope status
	 */
	public EnvelopeStatus getEnvelopeStatus(String envelopeId, User user);

	/**
	 * Retrieves envelope statuses for envelope within the current day.
	 * 
	 * @param user the user to lookup envelope statuses in
	 * @return a map of envelope ids to status codes
	 * @throws DatatypeConfigurationException thrown if xml datatype cannot be created for request
	 */
	public Map<String, EnvelopeStatusCode> getEnvelopeStatusesInLastDay(User user) throws DatatypeConfigurationException;
	
	/**
	 * Retrieves a list of document pdfs linked to an envelope.
	 *
	 * @param envelopeId the envelope id
	 * @param user the user executing the request
	 * @return a list of document pdfs linked to and envelope
	 */
	public List<DocumentPDF> getDocumentsForEnvelopeId(String envelopeId, User user);
}
