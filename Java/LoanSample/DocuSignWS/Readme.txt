DocuSignWS – Webservice Client (Apache Axis) 
===========================================================================

This project is the library for using the Docusign webservice with Java.
All webservice operations can be executed using this JAR. 

This sample code requires a DocuSign DevCenter account. If you do not
already have a DevCenter account please go to
http://www.docusign.com/devcenter/ and sign up for one. This sample will
not function without a valid DevCenter account.

Building 
---------------------------------------------------------------------------

1.	Run ant jar from the project root. 

2.	Locate the created JAR at DocuSignWS/build/DocusignWS.jar.  

Running Unit Tests 
---------------------------------------------------------------------------

1.	Set the following properties in DocuSignWS/test/config.properties: 
	-	[REPLACE WITH DOCUSIGN INTEGRATORS KEY] 
	-	[REPLACE WITH DOCUSIGN ACCOUNT ID] 
	-	[REPLACE WITH DOCUSIGN PASSWORD] 
	-	[REPLACE WITH EMAIL ADDRESS] 

2.	(optional) Change webservice.endpoint in
	DocuSignWS/test/config.properties in order to change the webservice
	endpoint URL. If not modified the following default URL is provided:
	https://demo.docusign.net/api/3.0/api.asmx 

3.	Run your unit tests using JUnit 3. 

