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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.docusign.loanco.util.LogUtil;
import net.docusign.wsclient.APIServiceStub;
import net.docusign.www.api._3_0.Ping;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Controller to report the status of the Docusign WS3_0 webservice using the "ping" operation.
 * 
 * @see net.docusign.wsclient.APIServiceStub#ping(Ping)
 */
public class WebserviceHeartbeatAction implements Controller {
    private static Logger log = Logger.getLogger(WebserviceHeartbeatAction.class);
    private APIServiceStub apiService;

    public void setApiService(APIServiceStub apiService) {
        this.apiService = apiService;
    }
    
    /* (non-Javadoc)
     * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Boolean webserviceStatus = apiService.ping(new Ping()).getPingResult();
        
        log.info(LogUtil.logWS30PingResponse(webserviceStatus));
        
        response.setContentType("text/plain");
        response.getWriter().print(webserviceStatus.toString());
        
        return null;
    }
}
