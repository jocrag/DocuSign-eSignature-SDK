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
package net.docusign.credential;

import java.io.IOException;
import java.util.Properties;

import junit.framework.TestCase;
import net.docusign.credential.api.CredentialSoap;

import org.junit.BeforeClass;

/**
 * Provides a test class to setup access to Docusign's Credential API.
 *
 * @see net.docusign.credential.api.old.CredentialSoap
 */
public class WebserviceTestCase extends TestCase {
    private static final String CONFIG_PROPERTIES_CLASSPATH_LOCATION = "/config.properties";
    private static final String DOCUSIGN_CREDENTIAL_WEBSERVICE_ENDPOINT = "docusign.credential.webservice.endpoint";
    private static final String CONFIG_ERROR_MESSAGE = "Could not load client.properties from the root of the test classpath.";
    protected CredentialSoap api;

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    @BeforeClass
    public void setUp() {
        Properties testProperties = new Properties();
        try {
            testProperties.load(getClass().getResourceAsStream(CONFIG_PROPERTIES_CLASSPATH_LOCATION));
        } catch (IOException ioexception) {
            fail(CONFIG_ERROR_MESSAGE);
        }
        
        api = new CredentialFactory().getCredential(testProperties.getProperty(DOCUSIGN_CREDENTIAL_WEBSERVICE_ENDPOINT));
    }
}
