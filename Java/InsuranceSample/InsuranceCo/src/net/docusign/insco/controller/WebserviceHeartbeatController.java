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

import javax.servlet.http.HttpServletResponse;

import net.docusign.insco.model.WebserviceType;
import net.docusign.service.DocusignLoginService;
import net.docusign.service.DocusignPingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller to report the status of the Docusign WS3_0 and the Docusign credentials webservice.
 */
@Controller
@RequestMapping("/webserviceHeartbeat.html")
public class WebserviceHeartbeatController extends AbstractController {
    private DocusignLoginService docusignLoginService;
    private DocusignPingService docusignPingService;

    @Autowired
    public void setDocusignLoginService(DocusignLoginService docusignLoginService) {
        this.docusignLoginService = docusignLoginService;
    }
    
    @Autowired
    public void setDocusignPingService(DocusignPingService docusignPingService) {
        this.docusignPingService = docusignPingService;
    }
    
    /**
     * Request handler to check the status of the requested Docusign webservice.
     * 
     * @param webservice the web service
     * @return 
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.GET)
    public void checkWebserviceHeartbeat(@RequestParam(value="webservice", required=true) String webservice, HttpServletResponse response) throws Exception {
        Boolean webserviceStatus;
        if(WebserviceType.CREDENTIAL.getTypeName().equals(webservice)) {
            webserviceStatus = docusignLoginService.pingService();
        }
        else if(WebserviceType.DOCUSIGN_WS3_0.getTypeName().equals(webservice)) {
            webserviceStatus = docusignPingService.pingService(getUser());
        }
        else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "The webservice type of " + webservice + " is not valid.");
            return;
        }
        
        response.setContentType("text/plain");
        response.getWriter().print(webserviceStatus.toString());
    }
}
