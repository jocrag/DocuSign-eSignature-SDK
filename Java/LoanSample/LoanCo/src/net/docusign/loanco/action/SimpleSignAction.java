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
package net.docusign.loanco.action;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.activation.FileDataSource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.docusign.loanco.model.SimpleSignModel;
import net.docusign.loanco.util.LogUtil;
import net.docusign.loanco.util.SignUtil;
import net.docusign.wsclient.APIServiceStub;
import net.docusign.wsclient.WebserviceCredentials;
import net.docusign.www.api._3_0.ArrayOfDocument;
import net.docusign.www.api._3_0.ArrayOfRecipient;
import net.docusign.www.api._3_0.ArrayOfTab;
import net.docusign.www.api._3_0.CreateAndSendEnvelope;
import net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse;
import net.docusign.www.api._3_0.Document;
import net.docusign.www.api._3_0.Envelope;
import net.docusign.www.api._3_0.EnvelopeStatus;
import net.docusign.www.api._3_0.FontStyleCode;
import net.docusign.www.api._3_0.Recipient;
import net.docusign.www.api._3_0.RecipientCaptiveInfo;
import net.docusign.www.api._3_0.RecipientSignatureInfo;
import net.docusign.www.api._3_0.RecipientTypeCode;
import net.docusign.www.api._3_0.RequestRecipientToken;
import net.docusign.www.api._3_0.RequestRecipientTokenAuthenticationAssertion;
import net.docusign.www.api._3_0.RequestRecipientTokenAuthenticationAssertionAuthenticationMethod;
import net.docusign.www.api._3_0.RequestRecipientTokenClientURLs;
import net.docusign.www.api._3_0.RequestRecipientTokenResponse;
import net.docusign.www.api._3_0.Tab;
import net.docusign.www.api._3_0.TabTypeCode;

import org.apache.axiom.attachments.ConfigurableDataHandler;
import org.apache.axis2.databinding.types.PositiveInteger;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Handle the mortgage application on the "Home" page of LoanCo.
 */
public class SimpleSignAction implements Controller {
    private static Logger log = Logger.getLogger(SimpleSignAction.class);
	private HttpServletRequest request;
	private APIServiceStub apiService;

	public void setApiService(APIServiceStub apiService) {
		this.apiService = apiService;
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.request = request;
		SimpleSignModel simpleSignModel = readRequest();

		log.info(LogUtil.logMortgageBegin());
		log.info(LogUtil.logMortgageRequest(simpleSignModel));
		
		CreateAndSendEnvelope csEnvelope = new CreateAndSendEnvelope();
		Envelope envelope = new Envelope();

		//Set AccountId
		envelope.setAccountId(WebserviceCredentials.getInstance().getAccountId());

		log.info(LogUtil.logEnvelopeAccountId(envelope.getAccountId()));
		
		//Create and set document in envelope
		Document document = createDocument();
		ArrayOfDocument documents = new ArrayOfDocument();
		documents.addDocument(document);
		envelope.setDocuments(documents);
		
		log.info(LogUtil.logDocument(document));

		//Create Signer recipient and set in envelope
		ArrayOfRecipient recipients = new ArrayOfRecipient();
		Recipient signer = createSigner(simpleSignModel);
		recipients.addRecipient(signer);
		envelope.setRecipients(recipients);

		log.info(LogUtil.logRecipientSigner(signer));
		
		//Create and set tabs in envelope
		ArrayOfTab tabs = createTabs(simpleSignModel, signer.getID(), document.getID());
		envelope.setTabs(tabs);

		for(Tab tab : tabs.getTab()) {
		    if(tab.getName() != null) {
		        log.info(LogUtil.logTab(tab));
		    }
		}
		
		envelope.setEnvelopeIdStamping(true);
		envelope.setSubject("Loan Application");
		envelope.setEmailBlurb("Sign the Loan application to submit.");
		csEnvelope.setEnvelope(envelope);

		log.info(LogUtil.logEnvelopeEmailSettings(envelope));
		
		log.info(LogUtil.logCreateAndSendRequest());

		CreateAndSendEnvelopeResponse csEnvelopeResponse = apiService.CreateAndSendEnvelope(csEnvelope);
		EnvelopeStatus envStatus = csEnvelopeResponse.getCreateAndSendEnvelopeResult();

		log.info(LogUtil.logCreateAndSendResponse(envStatus));
		
		request.getSession().setAttribute("envelopeId", envStatus.getEnvelopeID());

		RequestRecipientToken requestToken = new RequestRecipientToken();
		RequestRecipientTokenAuthenticationAssertion assertion = new RequestRecipientTokenAuthenticationAssertion();
		assertion.setAssertionID(String.valueOf(System.currentTimeMillis()));
		assertion.setAuthenticationInstant(Calendar.getInstance());
		assertion.setAuthenticationMethod(RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.Password);
		assertion.setSecurityDomain(request.getServerName().concat(":").concat(String.valueOf(request.getServerPort())));
		requestToken.setAuthenticationAssertion(assertion);
		
		log.info(LogUtil.logSecurityDomain(request));

		String callbackURL = request.getScheme().concat("://").concat(request.getServerName()).concat(":").concat(
				String.valueOf(request.getServerPort())).concat(request.getContextPath()).concat("/signingReturn.do");

		log.info(LogUtil.logInSessionCallbackURL(callbackURL));
		
		RequestRecipientTokenClientURLs clientUrls = new RequestRecipientTokenClientURLs();
		clientUrls.setOnAccessCodeFailed(callbackURL.concat("?envStatus=AccessCode"));
		clientUrls.setOnCancel(callbackURL.concat("?envStatus=Cancel"));
		clientUrls.setOnDecline(callbackURL.concat("?envStatus=Decline"));
		clientUrls.setOnException(callbackURL.concat("?envStatus=Exception"));
		clientUrls.setOnIdCheckFailed(callbackURL.concat("?envStatus=IDCheck"));
		clientUrls.setOnSessionTimeout(callbackURL.concat("?envStatus=Timeout"));
		clientUrls.setOnSigningComplete(callbackURL.concat("?envStatus=SignComplete"));
		clientUrls.setOnTTLExpired(callbackURL.concat("?envStatus=TTLExpired"));
		clientUrls.setOnViewingComplete(callbackURL.concat("?envStatus=ViewComplete"));
		requestToken.setClientURLs(clientUrls);

		requestToken.setClientUserID(signer.getCaptiveInfo().getClientUserId());
		requestToken.setEmail(signer.getEmail());
		requestToken.setEnvelopeID(envStatus.getEnvelopeID());
		requestToken.setUsername(signer.getUserName());

		log.info(LogUtil.logRequestRecipientTokenRequest());
		
		RequestRecipientTokenResponse recTokenResponse = apiService.RequestRecipientToken(requestToken);
		String token = recTokenResponse.getRequestRecipientTokenResult();

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("token", token);

		log.info(LogUtil.logRequestRecipientTokenResponse(token));
		log.info(LogUtil.logLaunchingInSigningSession());
		log.info(LogUtil.logMortgageEnd());
		
		return new ModelAndView("simpleSignComplete", "model", model);
	}

	private Document createDocument() {
		Document document = new Document();
		document.setID(new PositiveInteger("1"));
		document.setName("Sample PDF");
		document.setPDFBytes(new ConfigurableDataHandler(new FileDataSource(request.getSession().getServletContext().getRealPath("static/docs/SampleDoc.pdf"))));

		return document;
	}

	private ArrayOfTab createTabs(SimpleSignModel simpleSignModel, PositiveInteger recipientId, PositiveInteger documentId) {
		ArrayOfTab tabArray = new ArrayOfTab();
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, "E-mail", simpleSignModel.getEmail(), "1", "190", "186"));
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, "Phone", simpleSignModel.getPhone(), "1", "190", "173"));
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, "Zip", simpleSignModel.getZipcode(), "1", "342", "160"));
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, "State", simpleSignModel.getState(), "1", "255", "160"));
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, "City", simpleSignModel.getCity(), "1", "190", "160"));
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, "AddressLine2", StringUtils.isBlank(simpleSignModel.getAddress2()) ? " "
				: simpleSignModel.getAddress2(), "1", "190", "147"));
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, "AddressLine1", simpleSignModel.getAddress(), "1", "190", "134"));

		tabArray.addTab(SignUtil.createTab(recipientId, documentId, TabTypeCode.FullName, "1", "190", "118"));
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, TabTypeCode.SignHere, "1", "373", "185"));
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, TabTypeCode.DateSigned, "2", "190", "532"));
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, TabTypeCode.InitialHereOptional, "2", "190", "465"));

		return tabArray;
	}

	private Recipient createSigner(SimpleSignModel simpleSignModel) {
		Recipient signer = new Recipient();
		signer.setID(new PositiveInteger("1"));
		signer.setEmail(simpleSignModel.getEmail());
		signer.setUserName(simpleSignModel.getFirstName().concat(" ").concat(simpleSignModel.getLastName()));
		signer.setAccessCode(simpleSignModel.getAccessCode());
		signer.setRequireIDLookup(simpleSignModel.isIdCheckRequired());
		signer.setType(RecipientTypeCode.Signer);

		RecipientCaptiveInfo captiveInfo = new RecipientCaptiveInfo();
		captiveInfo.setClientUserId(String.valueOf(System.currentTimeMillis()));
		signer.setCaptiveInfo(captiveInfo);

		RecipientSignatureInfo signatureInfo = new RecipientSignatureInfo();
		signatureInfo.setSignatureInitials(
			(simpleSignModel.getFirstName().length() > 0 ? simpleSignModel.getFirstName().substring(0, 1) : "") +
			(simpleSignModel.getLastName().length() > 0 ? simpleSignModel.getLastName().substring(0, 1) : ""));
		signatureInfo.setFontStyle(FontStyleCode.BradleyHandITC);
		signatureInfo.setSignatureName(simpleSignModel.getFirstName().concat(" ").concat(simpleSignModel.getLastName()));

		signer.setSignatureInfo(signatureInfo);
		return signer;
	}

	private SimpleSignModel readRequest() {
		SimpleSignModel simpleSignModel = new SimpleSignModel();

		simpleSignModel.setFirstName(request.getParameter("FirstName"));
		simpleSignModel.setLastName(request.getParameter("LastName"));
		simpleSignModel.setAddress(request.getParameter("AddressLine1"));
		simpleSignModel.setAddress2(request.getParameter("AddressLine2"));
		simpleSignModel.setCity(request.getParameter("City"));
		simpleSignModel.setState(request.getParameter("State"));
		simpleSignModel.setZipcode(request.getParameter("Zip"));
		simpleSignModel.setPhone(request.getParameter("HomePhone"));
		simpleSignModel.setEmail(request.getParameter("eMail"));
		
		simpleSignModel.setIdCheckRequired(request.getParameter("idCheckRequired") != null ? Boolean.TRUE : Boolean.FALSE);
		simpleSignModel.setAccessCode(StringUtils.isNotBlank(request.getParameter("accessCode")) ? request.getParameter("accessCode") : null);
		return simpleSignModel;
	}
}