DocusignWS3_0 – Webservice Client (Apache CXF)
===========================================================================

This project is the library for using the Docusign webservice with Java.
All webservice operations can be executed using this JAR. 

System Requirements:
-	Java Development Kit 1.6
-	Apache Ant 1.6
-	Tomcat 6 (or equivalent)

This sample code requires a DocuSign DevCenter account. If you do not
already have a DevCenter account please go to
http://www.docusign.com/devcenter/ and sign up for one. This sample will
not function without a valid DevCenter account.

Building
---------------------------------------------------------------------------

1.  Run ant jar from the project root.  2.  Locate the created JAR at
DocusignWS3_0/build/docusign-wsapi-3.0.jar. 

Running Unit Tests
---------------------------------------------------------------------------

1.	Set the following properties in DocusignWS3_0/test/config.properties: 
-	[REPLACE WITH DOCUSIGN INTEGRATORS KEY] 
-	[REPLACE WITH DOCUSIGN ACCOUNT ID] 
-	[REPLACE WITH DOCUSIGN PASSWORD] 
-	[REPLACE WITH EMAIL ADDRESS] 

2.	(optional) Change docusign.webservice.endpoint in
DocusignWS3_0/test/config.properties in order to change the webservice
endpoint URL. If not modified the following default URL is provided:
https://demo.docusign.net/api/3.0/api.asmx 

3.	Run your unit tests using JUnit 3. 


