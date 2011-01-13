InsuranceCo – Example Application 
===========================================================================

This sample code requires a DocuSign DevCenter account. If you do not
already have a DevCenter account please go to
http://www.docusign.com/devcenter/ and sign up for one. This sample will
not function without a valid DevCenter account.

Also requires: 
-	docusign-credential-3.0.jar
-	docusign-wsapi-3.0.jar
-	docusign-services-3.0.jar 

This project an example of using the DocuSign webservice / DocuSign Credential webservice in a 
web application. This example demonstrates the following:

-	account login 
-	template retrieving / saving 
-	envelope creation / sending 
-	signing / sending envelopes via DocuSign web interface 
-	confirmation of sign status 
-	retrieval of signed PDF 

Configuration 
---------------------------------------------------------------------------

For UsernameToken authentication: 

-	Uncomment the Authentication: Username Token section of
	InsuranceCo/WEB-INF/config/spring/masterContext.xml. 
-	Set the following properties in
	InsuranceCo/WEB-INF/config/config.properties: 
	-	[REPLACE WITH DOCUSIGN INTEGRATORS KEY] 
	-	[REPLACE WITH EMAIL ADDRESS] 

For X509 (ssl certificate) authentication: 

-	Uncomment the Authentication: Username Token + X509 section of
	InsuranceCo/WEBINF/ config/spring/masterContext.xml. 
-	Set the following properties in
	InsuranceCo/WEB-INF/config/config.properties: 
	-	[REPLACE WITH DOCUSIGN INTEGRATORS KEY] 
	-	[REPLACE WITH EMAIL ADDRESS] 
	-	[REPLACE WITH KEYSTORE ALIAS] 
	-	[REPLACE WITH KEYSTORE PASSWORD] 
-	Set the following properties in InsuranceCo/src/cert.properties: 
	-	[REPLACE WITH KEYSTORE FILE] 
	-	[REPLACE WITH KEYSTORE ALIAS] 
	-	[REPLACE WITH KEYSTORE PASSWORD] 
-	(optional) Change credential.webservice.endpoint and/or
	docusign.webservice.endpoint property in InsuranceCo/WEBINF/
	config/config.properties in order to change the webservice endpoint URL. If
	not modified the following default URLs are provided:
	https://demo.docusign.net/api/3.0/Credential.asmx
	https://demo.docusign.net/api/3.0/api.asmx 

Building 
---------------------------------------------------------------------------

1.	Run ant war from the project root. 
2.	Locate the created WAR at InsuranceCo/dist/InsuranceCo.war. 
3.	Deploy to Application Server that can handle WAR files (i.e. Apache Tomcat). 

