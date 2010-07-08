PHP LoanCo Readme
============================================
This sample demonstrates the use of API methods for these tasks:
1. Sending an envelope using fixed tags to enter data and place signatures.
2. Sending an envelope using Anchor tags to enter data and place signatures.
3. Hosting an Embedded Signing session.
4. Checking Envelope status.
5. Retrieving a signed document.

Installation
This sample code requires a DocuSign DevCenter account. If you do not already 
have a DevCenter account please go to http://www.docusign.com/devcenter/ 
and sign up for one. This sample will not function without a valid DevCenter 
account.

PHP Requirements 
-	PHP Version 5.3+
- 	mcrypt/2.5.7 libcurl/7.19.4 OpenSSL/0.9.8k zlib/1.2.3

To install, copy the entire LoanCo directory to somewhere in your webserver's 
documents tree.
Enter your DevCenter credentials in the api/credentials.php file. The 
credentials are:
 - APIUserEmail
 - Password
 - IntegratorsKey
 - APIAccountID
 - APIHost=https://demo.docusign.net

The APIUserEmail and Password are the email address and password you used to 
setup your DevCenter account. The APIAccountID should be supplied in the 
DevCenter welcome email. The Integrators Key is optional - if one is provided 
to you please enter it. If you do not have one you do not need to enter it, 
just leave it blank.   

Assuming you installed the sample in the root folder of the webserver documents folder, 
you should open the url http://your.webserver.here/LoanCo. 





