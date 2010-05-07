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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.docusign.insco.model.ApplicationDetails;
import net.docusign.insco.model.Car;
import net.docusign.model.EmbeddedSign;
import net.docusign.model.EnvelopeToken;
import net.docusign.model.SendModel;
import net.docusign.model.SignModel;
import net.docusign.model.Template;
import net.docusign.model.User;
import net.docusign.service.DocusignDeferredSigningService;
import net.docusign.service.DocusignEmbeddedSendingService;
import net.docusign.service.DocusignEmbeddedSigningService;
import net.docusign.ws3_0.api.Tab;
import net.docusign.ws3_0.api.TabTypeCode;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller to handle embedded / deferred signing.
 */
@Controller
@RequestMapping("/autoAppApply.html")
@SessionAttributes({AbstractController.TEMPLATE_ATTR})
public class AutoAppApplyController extends AbstractController {
	private DocusignDeferredSigningService docusignDeferredSigningService;
	private DocusignEmbeddedSigningService docusignEmbeddedSigningService;
	private DocusignEmbeddedSendingService docusignEmbeddedSendingService;
	private MessageSource messageSource;

	@Autowired
	public void setDocusignDeferredSigningService(DocusignDeferredSigningService docusignSignService) {
		this.docusignDeferredSigningService = docusignSignService;
	}

	@Autowired
	public void setDocusignEmbeddedSigningService(DocusignEmbeddedSigningService docusignEmbeddedSigningService) {
		this.docusignEmbeddedSigningService = docusignEmbeddedSigningService;
	}

	@Autowired
	public void setDocusignEmbeddedSendingService(DocusignEmbeddedSendingService docusignSendService) {
		this.docusignEmbeddedSendingService = docusignSendService;
	}

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView onView(HttpServletRequest request, HttpSession session) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put(USER_ATTR, getUser());

		Boolean validationError = (Boolean) session.getAttribute("validationError");
		if(validationError != null && validationError.equals(Boolean.TRUE)) {
			model.put("details", (ApplicationDetails) session.getAttribute("applicationDetails"));
			model.put("fieldRequiredError", messageSource.getMessage("autoAppCar.fieldRequiredError", null, Locale.getDefault()));
		}

		return new ModelAndView("autoAppApply", "model", model);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView onAutoApplicationSubmit(@RequestParam(value="firstName", required=true) String firstName, @RequestParam(value="lastName", required=true) String lastName,
			@RequestParam(value="carMake", required=true) String carMake, @RequestParam(value="carModel", required=true) String carModel, @RequestParam(value="carVIN", required=true) String carVIN,
			@RequestParam(value="embeddedSigning", required=false) Boolean embeddedSigning, @RequestParam(value="embeddedSending", required=false) Boolean embeddedSending,
			@RequestParam(value="emailDestination", required=false) String emailDestination, @RequestParam(value="emailDestinationCC", required=false) String emailDestinationCC,
			@RequestParam(value="idCheck", required=false) Boolean idCheck, @RequestParam(value="accessCode", required=false) String accessCode,
			HttpServletRequest request, HttpSession session) {

		session.removeAttribute("validationError");
		session.removeAttribute("applicationDetails");
		if(fieldsMissing(firstName, lastName, carMake, carModel, carVIN) || (embeddedSigning == null && embeddedSending == null && StringUtils.isBlank(emailDestination))) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put(USER_ATTR, getUser());

			session.setAttribute("applicationDetails", buildDetails(firstName, lastName, carMake, carModel, carVIN, emailDestination, idCheck, accessCode));
			session.setAttribute("validationError", Boolean.TRUE);
			return new ModelAndView("redirect:/autoAppApply.html", "model", model);
		}

		Car car = new Car();
		car.setMake(carMake);
		car.setModel(carModel);
		car.setVIN(carVIN);

		User user = getUser();
		user.setFirstName(firstName);
		user.setLastName(lastName);

		Template template = (Template) session.getAttribute(TEMPLATE_ATTR);

		if(embeddedSigning != null) {
			return callEmbeddedSigning(request, car, user, template, idCheck, accessCode);
		}
		else if(embeddedSending != null) {
			return callEmbeddedSending(request, car, user, template, emailDestination, emailDestinationCC, idCheck, accessCode);
		}
		else {
			return callDeferredSigning(request, car, user, template, emailDestination, emailDestinationCC, idCheck, accessCode);
		}
	}

	/**
	 * Builds an {@link ApplicationDetails} object to put in session.
	 *
	 * @param firstName
	 * @param lastName
	 * @param carMake
	 * @param carModel
	 * @param carVIN
	 * @param emailDestination
	 * @return
	 */
	protected ApplicationDetails buildDetails(String firstName, String lastName, String carMake, String carModel, String carVIN, String emailDestination, Boolean idCheck, String accessCode) {
		ApplicationDetails applicationDetails = new ApplicationDetails();
		applicationDetails.setFirstName(firstName);
		applicationDetails.setLastName(lastName);
		applicationDetails.setCarMake(carMake);
		applicationDetails.setCarModel(carModel);
		applicationDetails.setCarVIN(carVIN);
		applicationDetails.setEmailDestination(emailDestination);
		applicationDetails.setIdCheck(idCheck);
		applicationDetails.setAccessCode(accessCode);

		return applicationDetails;
	}

	/**
	 * Determines if any {@link String} passed in is null or empty string.
	 *
	 * @param fieldValues
	 * @return
	 */
	protected boolean fieldsMissing(String ... fieldValues) {
		for(String fieldValue : fieldValues) {
			if(StringUtils.isBlank(fieldValue)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * @param request
	 * @param car
	 * @param user
	 * @param template
	 * @return
	 */
	protected ModelAndView callEmbeddedSigning(HttpServletRequest request, Car car, User user, Template template, Boolean idCheck, String accessCode) {
		EmbeddedSign embeddedSign = new EmbeddedSign();
		embeddedSign.setAccessCode(accessCode);
		embeddedSign.setCallbackURL(request.getScheme().concat("://").concat(request.getServerName()).concat(":").concat(String.valueOf(request.getServerPort())).concat(request.getContextPath()).concat("/autoAppComplete.html"));
		embeddedSign.setEnvelope(template.getEnvelopeTemplate().getEnvelope());
		embeddedSign.setIdCheck(idCheck);
		embeddedSign.setSessionId(request.getRequestedSessionId());
		
		Map<String, String> tabDataMap = new HashMap<String, String>();
		tabDataMap.put("Make", car.getCarMake());
		tabDataMap.put("Model", car.getCarModel());
		tabDataMap.put("VIN", car.getCarVIN());
		embeddedSign.setTabLabelToData(tabDataMap);
		
		embeddedSign.setSignEmailBlurb("Please sign the following document(s).");
		embeddedSign.setSignEmailSubject("Sign document");
		
		embeddedSign.setUser(user);

		EnvelopeToken envelopeToken = docusignEmbeddedSigningService.signEmbedded(embeddedSign, request.getServerName().concat(":").concat(String.valueOf(request.getServerPort())));
		return new ModelAndView("redirect:".concat(envelopeToken.getToken()));
	}

	protected ModelAndView callEmbeddedSending(HttpServletRequest request, Car car, User user, Template template, String emailDestination, String emailDestinationCC, Boolean idCheck, String accessCode) {
		SendModel sendModel = new SendModel();
		sendModel.setAccessCode(accessCode);
		sendModel.setCallbackURL(request.getScheme().concat("://").concat(request.getServerName()).concat(":").concat(String.valueOf(request.getServerPort())).concat(request.getContextPath()).concat("/autoAppComplete.html?statusCode=6"));
		sendModel.setEmailDestination(emailDestination);
		sendModel.setEmailDestinationCC(emailDestinationCC);
		sendModel.setEnvelope(template.getEnvelopeTemplate().getEnvelope());
		sendModel.setIdCheck(idCheck);
		
		sendModel.setSignEmailBlurb("Please sign the following document(s).");
		sendModel.setSignEmailSubject("Sign document");
		
		sendModel.setUser(user);

		EnvelopeToken envelopeToken = docusignEmbeddedSendingService.sendEmbedded(sendModel, createTabs(car.getCarMake(), car.getCarModel(), car.getCarVIN()));
		return new ModelAndView("redirect:".concat(envelopeToken.getToken()));
	}

	/**
	 * @param request
	 * @param car
	 * @param user
	 * @param template
	 * @return
	 */
	protected ModelAndView callDeferredSigning(HttpServletRequest request, Car car, User user, Template template, String emailDestination, String emailDestinationCC, Boolean idCheck, String accessCode) {
		SignModel signModel = new SignModel();
		signModel.setAccessCode(accessCode);
		signModel.setEmailDestination(emailDestination);
		signModel.setEmailDestinationCC(emailDestinationCC);
		signModel.setEnvelope(template.getEnvelopeTemplate().getEnvelope());
		signModel.setIdCheck(idCheck);
		
		signModel.setSignEmailBlurb("Please sign the following document(s).");
		signModel.setSignEmailSubject("Sign document");
		
		Map<String, String> tabDataMap = new HashMap<String, String>();
		tabDataMap.put("Make", car.getCarMake());
		tabDataMap.put("Model", car.getCarModel());
		tabDataMap.put("VIN", car.getCarVIN());
		signModel.setTabLabelToData(tabDataMap);
		
		signModel.setUser(user);
		
		docusignDeferredSigningService.signLater(signModel);
		return new ModelAndView("redirect:/autoAppStatus.html");
	}
	
	/**
	 * Create car tabs required for the envelope's document.
	 * 
	 * @param make the car make
	 * @param model the car model
	 * @param vin the car vin
	 * @return the list of car tabs required for the envelope's document 
	 */
	protected List<Tab> createTabs(String make, String model, String vin) {
		List<Tab> tabs = new ArrayList<Tab>();
		
		Tab makeTab = new Tab();
		makeTab.setCustomTabRequired(true);
		makeTab.setCustomTabWidth(360);
		makeTab.setDocumentID(new BigInteger("1"));
		makeTab.setName("vehicleMake");
		makeTab.setPageNumber(new BigInteger("1"));
		makeTab.setRecipientID(new BigInteger("1"));
		makeTab.setTabLabel("Make");
		makeTab.setType(TabTypeCode.CUSTOM);
		makeTab.setXPosition(new BigInteger("210"));
		makeTab.setYPosition(new BigInteger("115"));
		makeTab.setValue(make);
		tabs.add(makeTab);

		Tab modelTab = new Tab();
		modelTab.setCustomTabRequired(true);
		modelTab.setCustomTabWidth(360);
		modelTab.setDocumentID(new BigInteger("1"));
		modelTab.setName("vehicleModel");
		modelTab.setPageNumber(new BigInteger("1"));
		modelTab.setRecipientID(new BigInteger("1"));
		modelTab.setTabLabel("Model");
		modelTab.setType(TabTypeCode.CUSTOM);
		modelTab.setXPosition(new BigInteger("210"));
		modelTab.setYPosition(new BigInteger("135"));
		modelTab.setValue(model);
		tabs.add(modelTab);

		Tab vinTab = new Tab();
		vinTab.setCustomTabWidth(360);
		vinTab.setDocumentID(new BigInteger("1"));
		vinTab.setName("vehicleVIN");
		vinTab.setPageNumber(new BigInteger("1"));
		vinTab.setRecipientID(new BigInteger("1"));
		vinTab.setTabLabel("VIN");
		vinTab.setType(TabTypeCode.CUSTOM);
		vinTab.setXPosition(new BigInteger("210"));
		vinTab.setYPosition(new BigInteger("155"));
		vinTab.setValue(vin);
		tabs.add(vinTab);

		return tabs;
	}
}
