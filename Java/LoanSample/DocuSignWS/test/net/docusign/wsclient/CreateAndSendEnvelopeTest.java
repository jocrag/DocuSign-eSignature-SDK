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
package net.docusign.wsclient;

import javax.activation.FileDataSource;

import net.docusign.www.api._3_0.ArrayOfDocument;
import net.docusign.www.api._3_0.ArrayOfRecipient;
import net.docusign.www.api._3_0.ArrayOfRecipientStatus;
import net.docusign.www.api._3_0.ArrayOfTab;
import net.docusign.www.api._3_0.CreateAndSendEnvelope;
import net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse;
import net.docusign.www.api._3_0.Document;
import net.docusign.www.api._3_0.Envelope;
import net.docusign.www.api._3_0.EnvelopeStatusCode;
import net.docusign.www.api._3_0.FontStyleCode;
import net.docusign.www.api._3_0.Recipient;
import net.docusign.www.api._3_0.RecipientSignatureInfo;
import net.docusign.www.api._3_0.RecipientStatusCode;
import net.docusign.www.api._3_0.RecipientTypeCode;
import net.docusign.www.api._3_0.RequestStatus;
import net.docusign.www.api._3_0.RequestStatusResponse;
import net.docusign.www.api._3_0.Tab;
import net.docusign.www.api._3_0.TabTypeCode;

import org.apache.axiom.attachments.ConfigurableDataHandler;
import org.apache.axis2.databinding.types.NonNegativeInteger;
import org.apache.axis2.databinding.types.PositiveInteger;

/**
 * Tests the creation and sending of a Docusign envelope to the email address configured
 * as part of {@link net.docusign.wsclient.ClientConfiguration}.
 *
 * @see net.docusign.wsclient.ClientConfiguration#getInstance()
 */
public class CreateAndSendEnvelopeTest extends WebserviceTestCase {
	public void testW9Authorization() throws Exception {
	    String accountId = WebserviceCredentials.getInstance().getAccountId();
	    assertNotNull(accountId);

	    //Create and send W9 Envelope.
	    CreateAndSendEnvelope createAndSendEnvelope = new CreateAndSendEnvelope();

		Envelope envelope = new Envelope();
		envelope.setAccountId(accountId);
		envelope.setEmailBlurb("Please sign the following Form W-9 for tax purposes.");
		envelope.setEnvelopeIdStamping(true);
		envelope.setSubject("Sign Form W-9");
		envelope.setDocuments(handleDocuments());
		envelope.setRecipients(handleRecipients());
		envelope.setTabs(handleTabs());

		createAndSendEnvelope.setEnvelope(envelope);

		CreateAndSendEnvelopeResponse createAndSendEnvelopeResponse = wsApi.createAndSendEnvelope(createAndSendEnvelope);

		assertNotNull(createAndSendEnvelopeResponse);

		ArrayOfRecipientStatus recipientStatuses = createAndSendEnvelopeResponse.getCreateAndSendEnvelopeResult().getRecipientStatuses();
		assertEquals(recipientStatuses.getRecipientStatus().length, 1);
		assertEquals(RecipientStatusCode._Sent, recipientStatuses.getRecipientStatus()[0].getStatus().getValue());

		String envelopeId = createAndSendEnvelopeResponse.getCreateAndSendEnvelopeResult().getEnvelopeID();

		//Check status of Envelope.
		RequestStatus statusRequest = new RequestStatus();
		statusRequest.setEnvelopeID(envelopeId);

		RequestStatusResponse statusResponse = wsApi.requestStatus(statusRequest);

		assertNotNull(statusResponse);
		assertEquals(envelopeId, statusResponse.getRequestStatusResult().getEnvelopeID());
		assertEquals(EnvelopeStatusCode._Sent, statusResponse.getRequestStatusResult().getStatus().getValue());
	}

	private ArrayOfDocument handleDocuments() {
		Document document = new Document();
		document.setID(new PositiveInteger("1"));
		document.setName("Form W-9");
		document.setPDFBytes(new ConfigurableDataHandler(new FileDataSource("docs/fw9.pdf")));

		ArrayOfDocument documentArray = new ArrayOfDocument();
		documentArray.addDocument(document);
		return documentArray;
	}

	private ArrayOfRecipient handleRecipients() {
		Recipient recipient = new Recipient();
		recipient.setID(new PositiveInteger("1"));
		recipient.setEmail(WebserviceCredentials.getInstance().getUserEmail());
		recipient.setRequireIDLookup(false);
		recipient.setType(RecipientTypeCode.Signer);
		recipient.setUserName("Test User");

		RecipientSignatureInfo sigInfo = new RecipientSignatureInfo();
		sigInfo.setSignatureName("Test User");
		sigInfo.setSignatureInitials("TU");
		sigInfo.setFontStyle(FontStyleCode.BradleyHandITC);
		recipient.setSignatureInfo(sigInfo);

		ArrayOfRecipient recipientArray = new ArrayOfRecipient();
		recipientArray.addRecipient(recipient);
		return recipientArray;
	}

	private ArrayOfTab handleTabs() {
		ArrayOfTab tabArray = new ArrayOfTab();

		Tab tab = new Tab();
		tab.setDocumentID(new PositiveInteger("1"));
		tab.setName("Name");
		tab.setPageNumber(new NonNegativeInteger("1"));
		tab.setRecipientID(new PositiveInteger("1"));
		tab.setTabLabel("Name");
		tab.setType(TabTypeCode.FullName);
		tab.setXPosition(new NonNegativeInteger("80"));
		tab.setYPosition(new NonNegativeInteger("95"));
		tabArray.addTab(tab);

		tab = new Tab();
		tab.setDocumentID(new PositiveInteger("1"));
		tab.setName("Company");
		tab.setPageNumber(new NonNegativeInteger("1"));
		tab.setRecipientID(new PositiveInteger("1"));
		tab.setTabLabel("Company");
		tab.setType(TabTypeCode.Company);
		tab.setXPosition(new NonNegativeInteger("80"));
		tab.setYPosition(new NonNegativeInteger("120"));
		tabArray.addTab(tab);

		tab = new Tab();
		tab.setDocumentID(new PositiveInteger("1"));
		tab.setName("Signature");
		tab.setPageNumber(new NonNegativeInteger("1"));
		tab.setRecipientID(new PositiveInteger("1"));
		tab.setTabLabel("Signature");
		tab.setType(TabTypeCode.SignHere);
		tab.setXPosition(new NonNegativeInteger("135"));
		tab.setYPosition(new NonNegativeInteger("430"));
		tabArray.addTab(tab);

		tab = new Tab();
		tab.setDocumentID(new PositiveInteger("1"));
		tab.setName("Date");
		tab.setPageNumber(new NonNegativeInteger("1"));
		tab.setRecipientID(new PositiveInteger("1"));
		tab.setTabLabel("Date");
		tab.setType(TabTypeCode.DateSigned);
		tab.setXPosition(new NonNegativeInteger("430"));
		tab.setYPosition(new NonNegativeInteger("470"));
		tabArray.addTab(tab);

		return tabArray;
	}
}
