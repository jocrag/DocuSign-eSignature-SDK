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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Sets up Axis2 file-based configuration using X509 authentication.
 */
public class X509Configuration extends UsernameTokenConfiguration {

    public X509Configuration(WebserviceCredentials credentials) {
        super(credentials);
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.docusign.wsclient.UsernameTokenConfiguration#configureService()
     */
    public File configureService() throws IOException {
        configureCertProps();

        String axis2Configuration = readConfiguration("/axis2-x509.xml");
        replaceUserIdentifier(axis2Configuration);
        return writeConfiguration("/axis2-x509.xml", axis2Configuration.replace("[KEYSTORE ALIAS]", credentials.getKeystoreAlias()).replace("[KEYSTORE FILE]", credentials.getKeystoreFile()).replace("[KEYSTORE PASSWORD]", credentials.getKeystorePass()));
    }

    /**
     * Dynamically configure the cert.properties.
     * 
     * @throws IOException
     */
    protected void configureCertProps() throws IOException {
        Properties certProperties = new Properties();
        certProperties.load(getClass().getResourceAsStream("/cert.properties"));

        certProperties.setProperty("org.apache.ws.security.crypto.merlin.file", credentials.getKeystoreFile());
        certProperties.setProperty("org.apache.ws.security.crypto.merlin.keystore.alias", credentials.getKeystoreAlias());
        certProperties.setProperty("org.apache.ws.security.crypto.merlin.keystore.password", credentials.getKeystorePass());
        certProperties.store(new FileWriter(getClass().getResource("/cert.properties").getPath()), null);
    }
}
