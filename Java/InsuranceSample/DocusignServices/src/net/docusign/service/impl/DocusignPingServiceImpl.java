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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.docusign.model.User;
import net.docusign.service.DocusignPingService;
import net.docusign.util.LogUtil;

/**
 * Implements a service to ping the Docusign WS3_0 webservice to check if it is operational.
 */
public class DocusignPingServiceImpl extends AuthenticatedDocusignService implements DocusignPingService {
    private static Log log = LogFactory.getLog(DocusignPingServiceImpl.class);
    
    /* (non-Javadoc)
     * @see net.docusign.service.DocusignPingService#pingService(net.docusign.model.User)
     */
    public boolean pingService(User user) {
        Boolean pingResponse = getApi(user).ping();
        log.info(LogUtil.logWS30PingResponse(pingResponse));
        
        return pingResponse;
    }
}
