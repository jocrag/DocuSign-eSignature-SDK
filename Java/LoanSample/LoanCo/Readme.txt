Readme.txt for Docusign SDK Java LoanCo sample.
===========================================================================

This project an example of using the DocuSign webservice client in a web application. This
example demonstrates the following:
-	envelope creation / sending
-	signing / sending envelopes via DocuSign web interface
-	confirmation of sign status
-	retrieval of signed PDF

Installation
---------------------------------------------------------------------------

System Requirements:
-	Java Development Kit 1.6
-	Apache Ant 1.6
-	Tomcat 6 (or equivalent)

This sample code requires a DocuSign DevCenter account. If you do not
already have a DevCenter account please go to
http://www.docusign.com/devcenter/ and sign up for one. This sample will
not function without a valid DevCenter account.

Requires: DocuSignWS.jar (Axis webservice client) 

Configuration 
---------------------------------------------------------------------------

For UsernameToken authentication: 

-	Uncomment the Authentication: Username Token section of
	LoanCo/WEB-INF/docusignservlet.xml. 
-	Set the following properties in LoanCo/src/config.properties: 
	-	[REPLACE WITH DOCUSIGN INTEGRATORS KEY] 
	-	[REPLACE WITH EMAIL ADDRESS] 
	-	[REPLACE WITH DOCUSIGN ACCOUNT ID] 
	-	[REPLACE WITH DOCUSIGN PASSWORD] 

For X509 (ssl certificate) authentication: 

-	Uncomment the Authentication: Username Token + X509 section of
	LoanCo/WEBINF/ docusign-servlet.xml. 
-	Set the following properties in LoanCo/src/config.properties: 
	-	[REPLACE WITH DOCUSIGN INTEGRATORS KEY] 
	-	[REPLACE WITH EMAIL ADDRESS] 
	-	[REPLACE WITH DOCUSIGN ACCOUNT ID] 
	-	[REPLACE WITH DOCUSIGN PASSWORD] 
	-	[REPLACE WITH KEYSTORE FILE] 
	-	[REPLACE WITH KEYSTORE ALIAS] 
	-	[REPLACE WITH KEYSTORE PASS] 

-	(optional) Change webserviceEndpoint property in
	LoanCo/src/config.properties in order to change the webservice
	endpoint URL. If not modified the following default URL is 
	provided:
	https://demo.docusign.net/api/3.0/api.asmx 

Building 
---------------------------------------------------------------------------

1.	Run ant war from the project root. 
2.	Locate the created WAR at LoanCo/dist/LoanCo.war. 
3.	Deploy to Application Server that can handle WAR files (i.e. Apache Tomcat). 

