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
        axis2Configuration = axis2Configuration.replace("[DOCUSIGN INTEGRATORS KEY]", String.format(INTEGRATORS_KEY_FORMAT, credentials.getIntegratorsKey(), credentials.getUserEmail()));
        return writeConfiguration("/axis2-ut.xml", axis2Configuration);
    }

    protected String readConfiguration(String classpathLocation) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(classpathLocation)));
        
        StringBuilder buffer = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null) {
            buffer.append(line);
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
