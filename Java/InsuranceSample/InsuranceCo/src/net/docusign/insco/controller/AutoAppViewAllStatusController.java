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

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.docusign.service.DocusignEnvelopeService;
import net.docusign.ws3_0.api.EnvelopeStatusCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller to show the status page for all processed envelopes.
 */
@Controller
@RequestMapping("/autoAppStatus.html")
public class AutoAppViewAllStatusController extends AbstractController {
    private DocusignEnvelopeService docusignEnvelopeService;

    @Autowired
    public void setDocusignEnvelopeService(DocusignEnvelopeService docusignEnvelopeService) {
        this.docusignEnvelopeService = docusignEnvelopeService;
    }

    /**
     * @param request
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView onView(HttpServletRequest request, HttpSession session) throws Exception {
        Map<String, EnvelopeStatusCode> envelopeStatusCodes = docusignEnvelopeService.getEnvelopeStatusesInLastDay(getUser());

        Map<String, Object> model = new HashMap<String, Object>();
        model.put(USER_ATTR, getUser());
        model.put(ENVELOPE_STATUS_ATTR, envelopeStatusCodes);
        return new ModelAndView("autoAppStatus", "model", model);
    }
}
