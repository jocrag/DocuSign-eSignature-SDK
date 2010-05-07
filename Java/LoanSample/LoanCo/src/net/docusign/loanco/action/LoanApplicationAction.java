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
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.activation.FileDataSource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.docusign.loanco.model.LoanApplicationModel;
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

public class LoanApplicationAction implements Controller {
    private static Logger log = Logger.getLogger(LoanApplicationAction.class);
	private HttpServletRequest request;
	private APIServiceStub apiService;

	public void setApiService(APIServiceStub apiService) {
		this.apiService = apiService;
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.request = request;
		LoanApplicationModel loanApplicationModel = readRequest();
		
		log.info(LogUtil.logLoanApplicationBegin());
		log.info(LogUtil.logLoanApplicationRequest(loanApplicationModel));
		
		CreateAndSendEnvelope csEnvelope = new CreateAndSendEnvelope();
		Envelope envelope = new Envelope();

		//Set AccountId
		envelope.setAccountId(WebserviceCredentials.getInstance().getAccountId());
		
		log.info(LogUtil.logEnvelopeAccountId(envelope.getAccountId()));

		//Create and set document in envelope
		Document document = createDocument(loanApplicationModel, new PositiveInteger("1"));

		ArrayOfDocument documents = new ArrayOfDocument();
		documents.addDocument(document);
		envelope.setDocuments(documents);

		log.info(LogUtil.logDocument(document));
		
		//Create Signer recipient and set in envelope
		ArrayOfRecipient recipients = new ArrayOfRecipient();
		Recipient signer = createSigner(loanApplicationModel);
		recipients.addRecipient(signer);
		envelope.setRecipients(recipients);

		log.info(LogUtil.logRecipientSigner(signer));
		
		//Create and set tabs in envelope
		ArrayOfTab tabs = createTabs(loanApplicationModel, signer.getID(), document.getID());
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
		
		CreateAndSendEnvelopeResponse csEnvelopeResponse = apiService.createAndSendEnvelope(csEnvelope);
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

		RequestRecipientTokenResponse recTokenResponse = apiService.requestRecipientToken(requestToken);
		String token = recTokenResponse.getRequestRecipientTokenResult();

		log.info(LogUtil.logRequestRecipientTokenResponse(token));
		log.info(LogUtil.logLaunchingInSigningSession());
        log.info(LogUtil.logLoanApplicationEnd());
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("token", token);

		return new ModelAndView("simpleSignComplete", "model", model);
	}

	private Document createDocument(LoanApplicationModel loanApplicationModel, PositiveInteger documentId) {
		Document document = new Document();
		document.setID(documentId);
		document.setName(loanApplicationModel.getLoanPdf());

		String pdfPath = "static/docs/".concat(loanApplicationModel.getLoanPdf()).concat(".pdf");
		document.setPDFBytes(new ConfigurableDataHandler(new FileDataSource(request.getSession().getServletContext().getRealPath(pdfPath))));

		return document;
	}

	private ArrayOfTab createTabs(LoanApplicationModel loanApplicationModel, PositiveInteger recipientId, PositiveInteger documentId) {
		ArrayOfTab tabArray = new ArrayOfTab();
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, "E-mail", loanApplicationModel.getEmail(), "E-mail:", 200, -2));
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, "Phone", loanApplicationModel.getPhone(), "Phone:", 200, -2));

		tabArray.addTab(SignUtil.createTab(recipientId, documentId, TabTypeCode.FullName, "Name:", 200, -2));

		String amountWithCurrency = Currency.getInstance(Locale.getDefault()).getSymbol().concat(loanApplicationModel.getAmount());
		tabArray.addTab(SignUtil.createTab(recipientId, documentId, "Amount:",  amountWithCurrency, "Amount:", 200, -2));

		tabArray.addTab(SignUtil.createTab(recipientId, documentId, TabTypeCode.SignHere, "X:", 30, 8));

		return tabArray;
	}

	private Recipient createSigner(LoanApplicationModel loanApplicationModel) {
		Recipient signer = new Recipient();
		signer.setID(new PositiveInteger("1"));
		signer.setEmail(loanApplicationModel.getEmail());
		signer.setUserName(loanApplicationModel.getFullName());
		signer.setAccessCode(loanApplicationModel.getAccessCode());
		signer.setRequireIDLookup(loanApplicationModel.isIdCheckRequired());
		signer.setType(RecipientTypeCode.Signer);

		RecipientCaptiveInfo captiveInfo = new RecipientCaptiveInfo();
		captiveInfo.setClientUserId(String.valueOf(System.currentTimeMillis()));

		signer.setCaptiveInfo(captiveInfo);

		RecipientSignatureInfo signatureInfo = new RecipientSignatureInfo();
		signatureInfo.setSignatureInitials(extractInitials(loanApplicationModel.getFullName()));
		signatureInfo.setFontStyle(FontStyleCode.Mistral);
		signatureInfo.setSignatureName(loanApplicationModel.getFullName());

		signer.setSignatureInfo(signatureInfo);
		return signer;
	}

	private String extractInitials(String fullName) {
		String[] nameTokens = fullName.split(" ");
		StringBuffer initialsBuffer = new StringBuffer();
		for(String nameToken : nameTokens) {
			if(nameToken.length() > 1) {
				initialsBuffer.append(Character.toUpperCase(nameToken.charAt(0)));
			}
		}
		return initialsBuffer.toString();
	}

	private LoanApplicationModel readRequest() {
		LoanApplicationModel loadApplicationModel = new LoanApplicationModel();
		loadApplicationModel.setFullName(request.getParameter("FullName"));
		loadApplicationModel.setEmail(request.getParameter("EMail"));
		loadApplicationModel.setPhone(request.getParameter("Phone"));
		loadApplicationModel.setAmount(request.getParameter("Amount"));
		loadApplicationModel.setLoanPdf(request.getParameter("LoanPdf"));
		
		loadApplicationModel.setIdCheckRequired(request.getParameter("idCheckRequired") != null ? Boolean.TRUE : Boolean.FALSE);
		loadApplicationModel.setAccessCode(StringUtils.isNotBlank(request.getParameter("accessCode")) ? request.getParameter("accessCode") : null);

		return loadApplicationModel;
	}
}
