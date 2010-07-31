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

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Loads up the Docusign account configuration and stores it in
 * {@link net.docusign.wsclient.WebserviceCredentials}.
 * 
 * @see net.docusign.wsclient.WebserviceCredentials#getInstance()
 */
public class ClientConfiguration {
    private final static String ACCOUNT_ID = "docusign.account.id";
    private final static String EMAIL = "email";
    private final static String INTEGRATORS_KEY = "docusign.integrators.key";
    private final static String PASSWORD = "docusign.password";
    private static final String PROP_FILE = "config.properties";
    private static final String USER_ID = "docusign.user.id";
    private final static String WEBSERVICE_ENDPOINT = "docusign.webservice.endpoint";

    private static ClientConfiguration instance;
    private Log log = LogFactory.getLog(ClientConfiguration.class);
    private Properties props;

    public static ClientConfiguration getInstance() {
        if (instance == null) {
            instance = new ClientConfiguration();
        }
        return instance;
    }

    private ClientConfiguration() {
        props = new Properties();
        try {
            props.load(getClass().getResourceAsStream("/".concat(PROP_FILE)));
        } catch (Exception e) {
            log.debug("Could not load client.properties", e);
        }

        WebserviceCredentials credentials = WebserviceCredentials.getInstance();
        credentials.setAccountId(props.getProperty(ACCOUNT_ID));
        credentials.setIntegratorsKey(props.getProperty(INTEGRATORS_KEY));
        credentials.setPassword(props.getProperty(PASSWORD));
        credentials.setUserEmail(props.getProperty(EMAIL));
        credentials.setUserId(props.getProperty(USER_ID));
        credentials.setWebserviceEndpoint(props.getProperty(WEBSERVICE_ENDPOINT));
    }
}
