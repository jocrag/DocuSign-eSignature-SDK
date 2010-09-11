/**
 * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
 *
 * This source code is intended only as a supplement to DocuSign SDK
 * and/or on-line documentation.
 * This sample is designed to demonstrate DocuSign features and is not intended
 * for production use. Code and policy for a production application must be
 * developed to meet the specific data and security requirements of the
 * application.
 *
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */



package net.docusign.ws;


import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

import org.apache.axis.AxisFault;
import org.apache.axis.message.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

import net.docusign.www.API._3_0.*;

public class DSApiService {
	
	public DSApiService(String url, String accountId, String userId, String password) throws AxisFault, SOAPException, RemoteException, MalformedURLException, NoSuchAlgorithmException{

			APIServiceLocator locator = new  APIServiceLocator();
			locator.setAPIServiceSoap12EndpointAddress(url);
			APIServiceSoapStub service = new APIServiceSoapStub(new URL(url), locator);
			
			SOAPHeaderElement security = new SOAPHeaderElement(new PrefixedQName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
					"Security", "wsse"));			
			
			SOAPElement usernameToken = security.addChildElement("UsernameToken", "wsse");
			usernameToken.setAttribute("xmlns:wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

			SOAPElement usernameElement = usernameToken.addChildElement("Username");
			usernameElement.setValue(userId);
			
			SOAPElement passwordElement = usernameToken.addChildElement("Password");
			passwordElement.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
			passwordElement.setValue(password);
			
			SOAPElement nonceElement = usernameToken.addChildElement("Nonce");
			SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
			nonceElement.setValue(org.apache.axis.encoding.Base64.encode(new Integer(random.nextInt()).toString().getBytes()));
			
			SOAPElement createdElement = usernameToken.addChildElement("Created");
			Calendar cal = Calendar.getInstance(new SimpleTimeZone(0, "GMT"));
			SimpleDateFormat fmtDate = new SimpleDateFormat("yyyy-MM-dd");
			fmtDate.setCalendar(cal);
			SimpleDateFormat fmtTime = new SimpleDateFormat("HH:mm:ss");
			fmtTime.setCalendar(cal);
			Date gmtDate = new Date();			
			String timestamp = fmtDate.format(gmtDate) + "T" + fmtTime.format(gmtDate) + "Z"; 
			createdElement.setValue(timestamp);
			
			SOAPElement accountElement = usernameToken.addChildElement("AccountId");
			accountElement.setValue(accountId);

			

			service.setHeader(security);
			m_apiService = service;
	}
	
	private APIServiceSoap m_apiService;
	
	public APIServiceSoap getApiService(){
		return m_apiService;
	}
	
	
}

