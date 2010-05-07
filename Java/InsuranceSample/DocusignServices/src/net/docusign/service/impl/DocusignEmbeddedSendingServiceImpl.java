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
package net.docusign.service.impl;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.docusign.model.DocusignConstants;
import net.docusign.model.EnvelopeToken;
import net.docusign.model.SendModel;
import net.docusign.service.DocusignEmbeddedSendingService;
import net.docusign.util.LogUtil;
import net.docusign.util.Util;
import net.docusign.ws3_0.api.ArrayOfDocument;
import net.docusign.ws3_0.api.ArrayOfRecipient;
import net.docusign.ws3_0.api.ArrayOfTab;
import net.docusign.ws3_0.api.Document;
import net.docusign.ws3_0.api.Envelope;
import net.docusign.ws3_0.api.EnvelopeStatus;
import net.docusign.ws3_0.api.FontStyleCode;
import net.docusign.ws3_0.api.Recipient;
import net.docusign.ws3_0.api.RecipientSignatureInfo;
import net.docusign.ws3_0.api.RecipientTypeCode;
import net.docusign.ws3_0.api.Tab;

/**
 * Implements a service to transition an envelope to embedded sending through the Docusign portal.
 */
public class DocusignEmbeddedSendingServiceImpl extends AuthenticatedDocusignService implements DocusignEmbeddedSendingService {
    private static Log log = LogFactory.getLog(DocusignEmbeddedSendingServiceImpl.class);
    
	/* (non-Javadoc)
	 * @see net.docusign.service.DocusignEmbeddedSendingService#sendEmbedded(net.docusign.model.SendModel, java.util.List)
	 */
	@Override
	public EnvelopeToken sendEmbedded(SendModel model, List<Tab> tabs) {
	    log.info(LogUtil.logEmbeddedSendingBegin());
	    
		//Setup envelope details
		Envelope envelope = new Envelope();
		envelope.setAccountId(model.getUser().getAccountId());
		envelope.setEnvelopeIdStamping(true);
		envelope.setSubject(model.getSignEmailSubject());
		envelope.setEmailBlurb(model.getSignEmailBlurb());

		log.info(LogUtil.logEnvelopeAccountId(envelope.getAccountId()));
		log.info(LogUtil.logEnvelopeEmailSettings(envelope));
		
		//Create the envelope document
		Document document = new Document();
		document.setID(new BigInteger("1"));
		document.setFileExtension("pdf");
		document.setName("Custom Insurance Application");

		try {
			document.setPDFBytes(Util.bytesForStream(getClass().getResourceAsStream("/customInsuranceApplication.pdf")));
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		ArrayOfDocument documentArray = new ArrayOfDocument();
		documentArray.getDocument().add(document);
		envelope.setDocuments(documentArray);

		log.info(LogUtil.logDocument(document));
		
		ArrayOfRecipient recipientArray = new ArrayOfRecipient();
		
		//Setup 'Signer' recipient
		Recipient recipientSigner = new Recipient();
        recipientSigner.setID(new BigInteger("1"));
        recipientSigner.setType(RecipientTypeCode.SIGNER);
        recipientSigner.setUserName(model.getUser().getFullName());

        if(Util.isNotBlank(model.getEmailDestination())) {
			recipientSigner.setEmail(model.getUser().getEmail());
		}
		else {
			recipientSigner.setEmail(model.getEmailDestination());
		}

		recipientSigner.setRequireIDLookup(model.getIdCheck() == null ? Boolean.FALSE : model.getIdCheck());

        if(Util.isNotBlank(model.getAccessCode())) {
            recipientSigner.setAccessCode(model.getAccessCode());
        }

		RecipientSignatureInfo signatureInfo = new RecipientSignatureInfo();
		signatureInfo.setSignatureInitials(model.getUser().getInitials());
		signatureInfo.setFontStyle(FontStyleCode.BRADLEY_HAND_ITC);
		signatureInfo.setSignatureName(model.getUser().getFullName());
		recipientSigner.setSignatureInfo(signatureInfo);
		
		recipientArray.getRecipient().add(recipientSigner);

		log.info(LogUtil.logRecipient(recipientSigner));
		
		//Setup 'Carbon Copy' recipient
		Recipient recipientCopy = new Recipient();
	    recipientCopy.setID(new BigInteger("2"));
	    recipientCopy.setType(RecipientTypeCode.CARBON_COPY);
	    recipientCopy.setSignerName(DocusignConstants.ANY_SIGNER);
	    recipientCopy.setUserName(DocusignConstants.ANY_SIGNER);

	    if(Util.isNotBlank(model.getEmailDestinationCC())) {
	    	recipientCopy.setEmail(model.getEmailDestinationCC());
		}
		else {
			recipientCopy.setEmail(model.getUser().getEmail());
		}

	    recipientCopy.setRequireIDLookup(model.getIdCheck() == null ? Boolean.FALSE : model.getIdCheck());

        if(Util.isNotBlank(model.getAccessCode())) {
        	recipientCopy.setAccessCode(model.getAccessCode());
        }

		RecipientSignatureInfo signatureInfoCopy = new RecipientSignatureInfo();
		signatureInfoCopy.setSignatureInitials(model.getUser().getInitials());
		signatureInfoCopy.setFontStyle(FontStyleCode.BRADLEY_HAND_ITC);
		signatureInfoCopy.setSignatureName(DocusignConstants.ANY_SIGNER);
		recipientCopy.setSignatureInfo(signatureInfoCopy);
		
		recipientArray.getRecipient().add(recipientCopy);
		
		log.info(LogUtil.logRecipient(recipientCopy));
		
		envelope.setRecipients(recipientArray);

		//Set the envelope tabs
		ArrayOfTab envelopeTabs = new ArrayOfTab();
		envelopeTabs.getTab().addAll(tabs);
		envelope.setTabs(envelopeTabs);

		for(Tab tab : envelope.getTabs().getTab()) {
		    log.info(LogUtil.logTab(tab));
		}

		log.info(LogUtil.logCreateEnvelopeRequest());
		//Create the envelope, using the Docusign webservice, and capture the envelope id.
		EnvelopeStatus envelopeStatus = getApi(model.getUser()).createEnvelope(envelope);
		log.info(LogUtil.logCreateEnvelopeResponse(envelopeStatus));
		
		log.info(LogUtil.logRequestSenderTokenRequest(model.getUser().getAccountId(), envelopeStatus.getEnvelopeID(), model.getCallbackURL()));
		//Request a sender token url, used to complete envelope sending, using the Docusign webservice. 
		String senderTokenResult = getApi(model.getUser()).requestSenderToken(envelopeStatus.getEnvelopeID(), model.getUser().getAccountId(), model.getCallbackURL());
		log.info(LogUtil.logRequestSenderTokenResponse(senderTokenResult));

		log.info(LogUtil.logEmbeddedSendingEnd());
		
		//Assemble and return envelope id / sender token url.
		EnvelopeToken embeddedSend = new EnvelopeToken();
		embeddedSend.setEnvelopeId(envelopeStatus.getEnvelopeID());
		embeddedSend.setToken(senderTokenResult);
		return embeddedSend;
	}
}
