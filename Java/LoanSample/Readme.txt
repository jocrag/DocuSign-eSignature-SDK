Readme.txt for Java LoanSample
===========================================================================

System Requirements:
-	Java Development Kit 1.6
-	Apache Ant 1.6
-	Tomcat 6 (or equivalent)

Overview:
---------------------------------------------------------------------------

This project an example of using the DocuSign webservice client in a web application. This
example demonstrates the following:
-	envelope creation / sending
-	signing / sending envelopes via DocuSign web interface
-	confirmation of sign status
-	retrieval of signed PDF

This sample code requires a DocuSign DevCenter account. If you do not
already have a DevCenter account please go to
http://www.docusign.com/devcenter/ and sign up for one. This sample will
not function without a valid DevCenter account.

The LoanCo project generates a war file for tomcat deployment. Refer to the
Readme.txt in the LoanCo/docs directory for build, configuration, and
deployment details.

The Docusign Webservice Client project is the library for using the
Docusign webservice with Java. Refer to the Readme.txt in the
DocusignWS/docs directory for more details.
