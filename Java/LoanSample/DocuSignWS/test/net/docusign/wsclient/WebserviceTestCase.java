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
package net.docusign.wsclient;

import junit.framework.TestCase;

import org.apache.axis2.AxisFault;

public class WebserviceTestCase extends TestCase {
    protected APIServiceStub wsApi;

    @Override
    protected void setUp() throws Exception {
        // Reads accountId, username, and password for Docusign webservice.
        ClientConfiguration.getInstance();

        try {
            wsApi = new APIServiceStub();
            wsApi.init(new UsernameTokenConfiguration(WebserviceCredentials.getInstance()).configureService(), WebserviceCredentials.getInstance().getWebserviceEndpoint());
        } catch (AxisFault e) {
            fail(e.getMessage());
        }

        assertNotNull(wsApi);
    }
}
