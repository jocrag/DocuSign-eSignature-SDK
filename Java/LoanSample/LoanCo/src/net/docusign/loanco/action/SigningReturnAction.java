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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.docusign.loanco.model.SigningStatus;
import net.docusign.loanco.util.LogUtil;
import net.docusign.wsclient.APIServiceStub;
import net.docusign.www.api._3_0.RequestStatus;
import net.docusign.www.api._3_0.RequestStatusResponse;
import net.docusign.www.api._3_0.TabStatus;
import net.docusign.www.api._3_0.TabTypeCode;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Action that is called when the signer has dealt with the document (most likely Signed it).
 */
public class SigningReturnAction implements Controller {
    private static Logger log = Logger.getLogger(SigningReturnAction.class);
    private APIServiceStub apiService;

    public void setApiService(APIServiceStub apiService) {
        this.apiService = apiService;
    }

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();

		RequestStatus requestStatusParameters = new RequestStatus();
		requestStatusParameters.setEnvelopeID((String) request.getSession().getAttribute("envelopeId"));

		log.info(LogUtil.logRequestStatusRequest(requestStatusParameters.getEnvelopeID()));
		
		RequestStatusResponse requestStatusResponse = apiService.RequestStatus(requestStatusParameters);
		TabStatus[] responseTabStatuses = requestStatusResponse.getRequestStatusResult().getRecipientStatuses().getRecipientStatus()[0].getTabStatuses().getTabStatus();

		SigningStatus signingStatus = SigningStatus.parseSigningStatus(request.getParameter("envStatus"));
        if(signingStatus == null) {
            log.info(LogUtil.logRequestStatusResponse("Unknown Status", ""));
            model.put("statusMessage", "Received an unknown status: " + request.getParameter("envStatus"));
        }
        else {
            log.info(LogUtil.logRequestStatusResponse(signingStatus.getName(), signingStatus.getMessage()));
            model.put("statusMessage", signingStatus.getMessage());
        }
		
		List<TabStatus> tabStatuses = new ArrayList<TabStatus>();
		for(TabStatus responseTabStatus : responseTabStatuses) {
		    if(responseTabStatus.getTabType() == TabTypeCode.Custom && StringUtils.isNotBlank(responseTabStatus.getTabLabel())) {
		        tabStatuses.add(responseTabStatus);
		        
		        log.info(LogUtil.logResponseTab(responseTabStatus.getTabName(), responseTabStatus.getTabLabel(), responseTabStatus.getTabValue()));
		    }
		}
		
		String envelopeId = (String) request.getSession().getAttribute("envelopeId");
		log.info(LogUtil.logSigningProcessComplete(envelopeId));
		
		model.put("envelopeId", envelopeId);
		model.put("tabs", tabStatuses);
		return new ModelAndView("signingReturn", "model", model);
	}
}
