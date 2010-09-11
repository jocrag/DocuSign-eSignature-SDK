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
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.docusign.model.DocusignConstants;
import net.docusign.model.SignModel;
import net.docusign.service.DocusignDeferredSigningService;
import net.docusign.util.LogUtil;
import net.docusign.util.Util;
import net.docusign.ws3_0.api.Envelope;
import net.docusign.ws3_0.api.EnvelopeStatus;
import net.docusign.ws3_0.api.FontStyleCode;
import net.docusign.ws3_0.api.Recipient;
import net.docusign.ws3_0.api.RecipientSignatureInfo;
import net.docusign.ws3_0.api.RecipientTypeCode;
import net.docusign.ws3_0.api.Tab;

/**
 * Implements a service to create and send an envelope for deferred signing (sends email notification of signature).
 */
public class DocusignDeferredSigningServiceImpl extends AuthenticatedDocusignService implements DocusignDeferredSigningService {
    private static Log log = LogFactory.getLog(DocusignDeferredSigningServiceImpl.class);
    
	/* (non-Javadoc)
	 * @see net.docusign.service.DocusignDeferredSigningService#signLater(net.docusign.model.DeferredSigningModel)
	 */
	@Override
	public String signLater(SignModel model) {
	    log.info(LogUtil.logDeferredSigningBegin());

	    //Setup envelope details
		Envelope envelope = model.getEnvelope();
		envelope.setEnvelopeIdStamping(true);
        envelope.setSubject(model.getSignEmailSubject());
        envelope.setEmailBlurb(model.getSignEmailBlurb());
    
		log.info(LogUtil.logEnvelopeAccountId(envelope.getAccountId()));
		
		//Make sure envelope recipients are not present by clearing.
		List<Recipient> recipientList = envelope.getRecipients().getRecipient();
        recipientList.clear();

        //Setup 'Signer' recipient
        Recipient recipient = new Recipient();
        recipient.setID(new BigInteger("1"));
        recipient.setType(RecipientTypeCode.SIGNER);
        recipient.setUserName(model.getUser().getFullName());

        if(Util.isNotBlank(model.getEmailDestination())) {
            recipient.setEmail(model.getEmailDestination());
        }
        else {
            recipient.setEmail(model.getUser().getEmail());
        }

        recipient.setRequireIDLookup(model.getIdCheck() == null ? Boolean.FALSE : model.getIdCheck());

        if(Util.isNotBlank(model.getAccessCode())) {
            recipient.setAccessCode(model.getAccessCode());
        }

        RecipientSignatureInfo signatureInfo = new RecipientSignatureInfo();
        signatureInfo.setSignatureInitials(model.getUser().getInitials());
        signatureInfo.setFontStyle(FontStyleCode.BRADLEY_HAND_ITC);
        signatureInfo.setSignatureName(model.getUser().getFullName());
        recipient.setSignatureInfo(signatureInfo);
        
        //Add 'Signer' recipient
        recipientList.add(recipient);
        
        log.info(LogUtil.logRecipient(recipient));
        
        //Setup 'Carbon Copy' recipient
        recipient = new Recipient();
	    recipient.setID(new BigInteger("2"));
	    recipient.setType(RecipientTypeCode.CARBON_COPY);
	    recipient.setSignerName(DocusignConstants.ANY_SIGNER);
	    recipient.setUserName(DocusignConstants.ANY_SIGNER);

	    if(Util.isNotBlank(model.getEmailDestinationCC())) {
            recipient.setEmail(model.getEmailDestinationCC());
        }
        else {
            recipient.setEmail(model.getUser().getEmail());
        }

        recipient.setRequireIDLookup(model.getIdCheck() == null ? Boolean.FALSE : model.getIdCheck());

        if(Util.isNotBlank(model.getAccessCode())) {
            recipient.setAccessCode(model.getAccessCode());
        }

        signatureInfo = new RecipientSignatureInfo();
        signatureInfo.setSignatureInitials(model.getUser().getInitials());
        signatureInfo.setFontStyle(FontStyleCode.BRADLEY_HAND_ITC);
        signatureInfo.setSignatureName(DocusignConstants.ANY_SIGNER);
        recipient.setSignatureInfo(signatureInfo);
        
        //Add 'Carbon Copy' recipient
        recipientList.add(recipient);
		
        log.info(LogUtil.logRecipient(recipient));
        
        //Set value for tab labels present in the model.
        List<Tab> tabs = envelope.getTabs().getTab();
		for(Tab tab : tabs) {
			String tabData = model.getTabLabelToData().get(tab.getTabLabel());
			if(tabData != null) {
				tab.setValue(tabData);
			}
			
			log.info(LogUtil.logTab(tab));
		}
		
		log.info(LogUtil.logCreateAndSendRequest());
		
		//Create and Send the envelope, using the webservice, and return the envelope id response.
		EnvelopeStatus envelopeStatus = getApi(model.getUser()).createAndSendEnvelope(envelope);
		
		log.info(LogUtil.logCreateAndSendResponse(envelopeStatus));
		
		return envelopeStatus.getEnvelopeID();
	}
}