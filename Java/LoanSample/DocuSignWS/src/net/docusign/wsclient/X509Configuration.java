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
    
    /* (non-Javadoc)
     * @see net.docusign.wsclient.UsernameTokenConfiguration#configureService()
     */
    public File configureService() throws IOException {
        configureCertProps();
        
        String axis2Configuration = readConfiguration("/axis2-x509.xml");
        
        return writeConfiguration("/axis2-x509.xml", axis2Configuration
            .replace("[DOCUSIGN INTEGRATORS KEY]", String.format(INTEGRATORS_KEY_FORMAT, credentials.getIntegratorsKey(), credentials.getUserEmail()))
            .replace("[KEYSTORE ALIAS]", credentials.getKeystoreAlias())
            .replace("[KEYSTORE FILE]", credentials.getKeystoreFile())
            .replace("[KEYSTORE PASSWORD]", credentials.getKeystorePass()));
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
