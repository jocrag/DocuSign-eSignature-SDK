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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Sets up Axis2 file-based configuration using UsernameToken authentication.
 */
public class UsernameTokenConfiguration {
    protected final String INTEGRATORS_KEY_FORMAT = "[%s]%s";
    protected WebserviceCredentials credentials;

    public UsernameTokenConfiguration(WebserviceCredentials credentials) {
        this.credentials = credentials;
    }

    public File configureService() throws IOException {
        String axis2Configuration = readConfiguration("/axis2-ut.xml");
        return writeConfiguration("/axis2-ut.xml", replaceUserIdentifier(axis2Configuration));
    }
    
    protected String replaceUserIdentifier(String axis2Configuration) {
        if(credentials.getIntegratorsKey() != null && credentials.getUserEmail() != null) {
            axis2Configuration = axis2Configuration.replace("[USER ID]", String.format(INTEGRATORS_KEY_FORMAT, credentials.getIntegratorsKey(), credentials.getUserEmail()));
        } else {
            axis2Configuration = axis2Configuration.replace("[USER ID]", credentials.getUserId());
        }
        
        return axis2Configuration;
    }

    protected String readConfiguration(String classpathLocation) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(classpathLocation)));

        StringBuilder buffer = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line+"\n");
        }
        reader.close();

        return buffer.toString();
    }

    protected File writeConfiguration(String classpathLocation, String axis2Configuration) throws IOException {
        File usernameTokenConfiguration = new File(getClass().getResource(classpathLocation).getPath());

        BufferedWriter writer = new BufferedWriter(new FileWriter(usernameTokenConfiguration));
        writer.write(axis2Configuration);
        writer.close();

        return usernameTokenConfiguration;
    }
}
