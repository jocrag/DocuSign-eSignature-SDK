Readme.txt for Java DocuSign Services
===========================================================================

This project provides a highlevel API for performing DocuSign webservice
operations.

System Requirements:
-	Java Development Kit 1.6
-	Apache Ant 1.6
-	Tomcat 6 (or equivalent)

This sample code requires a DocuSign DevCenter account. If you do not
already have a DevCenter account please go to
http://www.docusign.com/devcenter/ and sign up for one. This sample will
not function without a valid DevCenter account.

Dependencies 
---------------------------------------------------------------------------

This project relies on both the DocusignWS3_0 and DocusignCredential
libraries provides with the sample applications. 

Packages 
-------------------------+-------------------------------------------------
Java Package             | Description 
-------------------------+-------------------------------------------------
net.docusign.service     | Defines service interfaces for DocuSign webservice 
                         | operations. 
-------------------------+-------------------------------------------------
net.docusign.service.impl| Provides a readytouse implementation of DocuSign 
                         | services. 
-------------------------+-------------------------------------------------


Service Implementations 
-----------------------------------+---------------------------------------
Service class                      |Description 
-----------------------------------+---------------------------------------
DocusignDeferredSigningServiceImpl |Provides envelope creation / sending for 
                                   |deferred signing via email. 
-----------------------------------+---------------------------------------
DocusignEmbeddedSendingServiceImpl |Provides envelope sending through the DocuSign 
                                   |InSession web interface. 
-----------------------------------+---------------------------------------
DocusignEmbeddedSigningServiceImpl |Provides envelope signing through the DocuSign 
                                   |InSession web interface. 
-----------------------------------+---------------------------------------
DocusignEnvelopeServiceImpl        |Provides operations to retrieve the status of 
                                   |envelope(s). 
-----------------------------------+---------------------------------------
DocusignLoginServiceImpl           |Provides account lookup based on username and 
                                   |password. 
-----------------------------------+---------------------------------------
DocusignPingServiceImpl            |Provides operations to ping the webservices to 
                                   |check whether they are active. 
-----------------------------------+---------------------------------------
DocusignTemplateServiceImpl        |Provides operations to create, update, and 
                                   |retrieve envelope templates for your account. 
-----------------------------------+---------------------------------------

