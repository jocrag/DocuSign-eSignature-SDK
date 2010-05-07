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

import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.docusign.model.EmbeddedSign;
import net.docusign.model.EnvelopeToken;
import net.docusign.service.DocusignEmbeddedSigningService;
import net.docusign.util.LogUtil;
import net.docusign.util.Util;
import net.docusign.ws3_0.api.Envelope;
import net.docusign.ws3_0.api.EnvelopeStatus;
import net.docusign.ws3_0.api.FontStyleCode;
import net.docusign.ws3_0.api.Recipient;
import net.docusign.ws3_0.api.RecipientCaptiveInfo;
import net.docusign.ws3_0.api.RecipientSignatureInfo;
import net.docusign.ws3_0.api.RecipientTypeCode;
import net.docusign.ws3_0.api.RequestRecipientTokenAuthenticationAssertion;
import net.docusign.ws3_0.api.RequestRecipientTokenAuthenticationAssertionAuthenticationMethod;
import net.docusign.ws3_0.api.RequestRecipientTokenClientURLs;
import net.docusign.ws3_0.api.Tab;

/**
 * Implements a service to transition an envelope for embedded signing through the Docusign portal.
 */
public class DocusignEmbeddedSigningServiceImpl extends AuthenticatedDocusignService implements DocusignEmbeddedSigningService {
    private static Log log = LogFactory.getLog(DocusignEmbeddedSigningServiceImpl.class);
    
	/* (non-Javadoc)
	 * @see net.docusign.service.DocusignEmbeddedSigningService#signEmbedded(net.docusign.model.EmbeddedSign)
	 */
	@Override
	public EnvelopeToken signEmbedded(EmbeddedSign model, String securityDomainHost) {
	    log.info(LogUtil.logEmbeddedSigningBegin());
	    
		//Setup envelope details
		Envelope envelope = model.getEnvelope();
		envelope.setEnvelopeIdStamping(true);
		envelope.setSubject("Automobile Insurance Application");
		envelope.setEmailBlurb("Please review and complete this auto-mobile insurance application.");

		log.info(LogUtil.logEnvelopeAccountId(envelope.getAccountId()));
		log.info(LogUtil.logEnvelopeEmailSettings(envelope));
		
		//Setup 'Signer' recipient
		Recipient recipientSigner = envelope.getRecipients().getRecipient().get(0);
		recipientSigner.setID(new BigInteger("1"));

		if(Util.isNotBlank(model.getEmailDestination())) {
			recipientSigner.setEmail(model.getEmailDestination());
		}
		else {
			recipientSigner.setEmail(model.getUser().getEmail());
		}

		recipientSigner.setUserName(model.getUser().getFullName());
		recipientSigner.setType(RecipientTypeCode.SIGNER);

		RecipientSignatureInfo signatureInfo = new RecipientSignatureInfo();
		signatureInfo.setSignatureInitials(model.getUser().getInitials());
		signatureInfo.setFontStyle(FontStyleCode.BRADLEY_HAND_ITC);
		signatureInfo.setSignatureName(model.getUser().getFullName());

		recipientSigner.setSignatureInfo(signatureInfo);
		
		//Set value for tab labels present in the model.
		List<Tab> tabs = envelope.getTabs().getTab();
		for(Tab tab : tabs) {
			String tabData = model.getTabLabelToData().get(tab.getTabLabel());
			if(tabData != null) {
				tab.setValue(tabData);
			}
			
			log.info(LogUtil.logTab(tab));
		}

		recipientSigner.setRequireIDLookup(model.getIdCheck() == null ? Boolean.FALSE : model.getIdCheck());

		if(Util.isNotBlank(model.getAccessCode())) {
		    recipientSigner.setAccessCode(model.getAccessCode());
		}

		//Set embedded signing captive info for recipient signer.  This is required in order to uniquely identify this signing session.
		RecipientCaptiveInfo captiveInfo = new RecipientCaptiveInfo();
		captiveInfo.setClientUserId(model.getSessionId());
		recipientSigner.setCaptiveInfo(captiveInfo);
		
		log.info(LogUtil.logRecipient(recipientSigner));

		log.info(LogUtil.logCreateAndSendRequest());
		
		//Create and send the envelope through the Docusign webservice.
		EnvelopeStatus envelopeStatus = getApi(model.getUser()).createAndSendEnvelope(envelope);

		log.info(LogUtil.logCreateAndSendResponse(envelopeStatus));
		
		//Create authentication assertion token.
		RequestRecipientTokenAuthenticationAssertion recipientAuthAssertion = new RequestRecipientTokenAuthenticationAssertion();
		recipientAuthAssertion.setAssertionID(String.valueOf(System.currentTimeMillis()));

		try {
			recipientAuthAssertion.setAuthenticationInstant(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
		}
		catch (DatatypeConfigurationException e) {}

		recipientAuthAssertion.setAuthenticationMethod(RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.PASSWORD);
		recipientAuthAssertion.setSecurityDomain(securityDomainHost);

		log.info(LogUtil.logSecurityDomain(securityDomainHost));
		
		//Setup client URLs for each state.
		String callbackURL = model.getCallbackURL();
		RequestRecipientTokenClientURLs recipientClientURLs = new RequestRecipientTokenClientURLs();
		recipientClientURLs.setOnAccessCodeFailed(callbackURL.concat("?statusCode=0"));
		recipientClientURLs.setOnCancel(callbackURL.concat("?statusCode=1"));
		recipientClientURLs.setOnDecline(callbackURL.concat("?statusCode=2"));
		recipientClientURLs.setOnException(callbackURL.concat("?statusCode=3"));
		recipientClientURLs.setOnIdCheckFailed(callbackURL.concat("?statusCode=4"));
		recipientClientURLs.setOnSessionTimeout(callbackURL.concat("?statusCode=5"));
		recipientClientURLs.setOnSigningComplete(callbackURL.concat("?statusCode=6"));
		recipientClientURLs.setOnTTLExpired(callbackURL.concat("?statusCode=7"));
		recipientClientURLs.setOnViewingComplete(callbackURL.concat("?statusCode=8"));
		
		log.info(LogUtil.logRequestRecipientTokenRequest());
		
		//Request embedded signing token used to transition the signer to the Docusign webservice.
		String token = getApi(model.getUser()).requestRecipientToken(envelopeStatus.getEnvelopeID(),
			recipientSigner.getCaptiveInfo().getClientUserId(), recipientSigner.getUserName(), recipientSigner.getEmail(),
			recipientAuthAssertion, recipientClientURLs);

		log.info(LogUtil.logRequestRecipientTokenResponse(token));
		log.info(LogUtil.logEmbeddedSigningEnd());
		
		//Assemble and return envelope id / recipient signer token url.
		EnvelopeToken envelopeToken = new EnvelopeToken();
		envelopeToken.setEnvelopeId(envelopeStatus.getEnvelopeID());
		envelopeToken.setToken(token);

		return envelopeToken;
	}
}