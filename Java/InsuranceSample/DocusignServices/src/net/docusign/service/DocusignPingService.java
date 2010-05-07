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
package net.docusign.service;

import net.docusign.model.User;

/**
 * Defines a service to ping the Docusign WS3_0 webservice to check if it is operational.
 */
public interface DocusignPingService {
    /**
     * Check whether the Docusign WS3_0 webservice is operational by issuing a ping request.
     * 
     * @param user the user
     * @return whether or not the webservice is operational
     */
    public boolean pingService(User user);
}
