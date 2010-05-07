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
package net.docusign.ws3_0;

import java.io.IOException;
import java.util.Properties;

import junit.framework.TestCase;
import net.docusign.ws3_0.api.APIServiceSoap;

import org.junit.BeforeClass;

/**
 * Parent {@link TestCase} to all webservice tests which need to have {@link DocusignAPICredentials} established.  This
 * process occurs before each subclass begins running their tests.
 *
 * @see org.junit.BeforeClass
 */
public abstract class WebserviceTestCase extends TestCase {
    private static final String CONFIG_PROPERTIES_CLASSPATH_LOCATION = "/config.properties";
    private static final String DOCUSIGN_INTEGRATORS_KEY = "docusign.integrators.key";
    private static final String DOCUSIGN_ACCOUNT_ID = "docusign.account.id";
    private static final String DOCUSIGN_PASSWORD = "docusign.password";
    private static final String EMAIL = "email";
    private static final String DOCUSIGN_WEBSERVICE_ENDPOINT = "docusign.webservice.endpoint";
    private static final String CONFIG_ERROR_MESSAGE = "Could not load client.properties from the root of the test classpath.";
    protected APIServiceSoap api;

    @BeforeClass
    public void setUp() {
        Properties testProperties = new Properties();
        try {
            testProperties.load(getClass().getResourceAsStream(CONFIG_PROPERTIES_CLASSPATH_LOCATION));
        } catch (IOException ioexception) {
            fail(CONFIG_ERROR_MESSAGE);
        }

        DocusignAPICredentials apiCredentials = new DocusignAPICredentials();
        apiCredentials.setAccountId(testProperties.getProperty(DOCUSIGN_ACCOUNT_ID));
        apiCredentials.setIntegratorsKey(testProperties.getProperty(DOCUSIGN_INTEGRATORS_KEY));
        apiCredentials.setPassword(testProperties.getProperty(DOCUSIGN_PASSWORD));
        apiCredentials.setUserEmail(testProperties.getProperty(EMAIL));
        apiCredentials.setDocusignWebserviceEndpoint(testProperties.getProperty(DOCUSIGN_WEBSERVICE_ENDPOINT));

        api = new DocusignWebserviceFactory().setupClient(apiCredentials.getDocusignWebserviceEndpoint()).authorizeAPI(apiCredentials);
    }
}
