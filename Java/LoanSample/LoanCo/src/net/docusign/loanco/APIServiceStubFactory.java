package net.docusign.loanco;

import java.io.File;
import java.io.IOException;

import net.docusign.wsclient.APIServiceStub;
import net.docusign.wsclient.UsernameTokenConfiguration;
import net.docusign.wsclient.WebserviceCredentials;

import org.apache.axis2.AxisFault;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.FactoryBean;

/**
 * Spring {@link FactoryBean} used to setup a single {@link APIServiceStub} for web-service calls.
 * 
 * @author abargnesi
 */
public class APIServiceStubFactory implements FactoryBean {
    private String integratorsKey;
	private String accountId;
	private String password;
	private String userEmail;
	private String webserviceEndpoint;
	private String keystoreFile;
	private String keystoreAlias;
    private String keystorePass;
	
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public void setIntegratorsKey(String integratorsKey) {
		this.integratorsKey = integratorsKey;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setWebserviceEndpoint(String webserviceEndpoint) {
	    this.webserviceEndpoint = webserviceEndpoint;
	}
	
	public void setKeystoreFile(String keystoreFile) {
        this.keystoreFile = keystoreFile;
    }

    public void setKeystoreAlias(String keystoreAlias) {
        this.keystoreAlias = keystoreAlias;
    }
	
	public void setKeystorePass(String keystorePass) {
		this.keystorePass = keystorePass;
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObject()
	 */
	@Override
	public Object getObject() throws Exception {
		WebserviceCredentials credentials = WebserviceCredentials.getInstance();
		credentials.setIntegratorsKey(integratorsKey);
		credentials.setUserEmail(userEmail);
		credentials.setAccountId(accountId);
		credentials.setPassword(password);
		credentials.setWebserviceEndpoint(webserviceEndpoint);
		credentials.setKeystoreFile(keystoreFile);
		credentials.setKeystoreAlias(keystoreAlias);
		credentials.setKeystorePass(keystorePass);
		
		return configureApiService(credentials);
	}

	/**
	 * Configure the API service using the provided {@link WebserviceCredentials}.
	 * 
	 * @param credentials the webservice credentials
	 * @return the configured api service stub
	 * @throws IOException thrown if configuration files cannot be read/written.
	 */
    protected APIServiceStub configureApiService(WebserviceCredentials credentials) throws IOException {
        //Set up axis2
		APIServiceStub apiService = new APIServiceStub();
		
		//Load axis2 environment and modules
		try {
			apiService.init(getConfiguration(credentials), credentials.getWebserviceEndpoint());
		} catch (AxisFault e) {
			throw new FatalBeanException("Exception initializing Axis2 repository.", e);
		}
        return apiService;
    }
    
    protected File getConfiguration(WebserviceCredentials credentials) throws IOException {
        return new UsernameTokenConfiguration(credentials).configureService();
    }

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObjectType()
	 */
	@Override
	public Class<?> getObjectType() {
		return APIServiceStub.class;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
}
