package net.docusign.loanco;

import java.io.File;
import java.io.IOException;

import net.docusign.wsclient.APIServiceStub;
import net.docusign.wsclient.WebserviceCredentials;
import net.docusign.wsclient.X509Configuration;

/**
 * Configure the {@link APIServiceStub} for X509 authentication.
 */
public class X509APIServiceStubFactory extends APIServiceStubFactory {
    /* (non-Javadoc)
     * @see net.docusign.loanco.APIServiceStubFactory#getConfiguration(net.docusign.wsclient.WebserviceCredentials)
     */
    @Override
    protected File getConfiguration(WebserviceCredentials credentials) throws IOException {
        return new X509Configuration(credentials).configureService();
    }
}
