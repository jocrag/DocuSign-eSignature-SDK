DocusignCredential – Credential Webservice Client (Apache Axis)
===========================================================================

This project is the library for using the Credential webservice with Java.
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

1.  Run ant jar from the project root. 

2.  Locate the created JAR at
DocusignCredential/build/docusign-credential-3.0.jar. 

Running Unit Tests
---------------------------------------------------------------------------
1.  (optional) Change docusign.credential.webservice.endpoint in
DocusignCredential/test/config.properties in order to change the webservice
endpoint URL.  If not modified the following default URL is provided:
https://demo.docusign.net/api/3.0/Credential.asmx 

2.  Run your unit tests using JUnit 3. 

