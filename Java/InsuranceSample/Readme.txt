Readme.txt for Docusign SDK Java InsuranceCo sample.
===========================================================================

System Requirements:
-	Java Development Kit 1.6
-	Apache Ant 1.6
-	Tomcat 6 (or equivalent)

Overview:
---------------------------------------------------------------------------

This sample code requires a DocuSign DevCenter account. If you do not
already have a DevCenter account please go to
http://www.docusign.com/devcenter/ and sign up for one. This sample will
not function without a valid DevCenter account.

This project an example of using the DocuSign webservice / DocuSign
Credential webservice in a web application. This example demonstrates the
following:
-	account login
-	template retrieving / saving
-	envelope creation / sending
-	signing / sending envelopes via DocuSign web interface
-	confirmation of sign status
-	retrieval of signed Readme.txt

The InsuranceCo project generates a war file for tomcat deployment. Refer
to the Readme.txt in the InsuranceCo/docs directory for build,
configuration, and deployment details.

The Docusign Credential project is the library for using the Credential
webservice with Java. Refer to the Readme.txt in the
DocusignCredential/docs directory for more details.

The Docusign Services project provides a high-level API for performing
DocuSign webservice operations. Refer to the Readme.txt in the
DocusignServices/docs directory for more details.

The Docusign Webservice Client project is the library for using the
Docusign webservice with Java. Refer to the Readme.txt in the
DocusignWS3_0/docs directory for more details.
