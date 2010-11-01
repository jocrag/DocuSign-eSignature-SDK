Readme.txt for Docusign SDK MS.NET C# LoanCo sample.
===========================================================================

System Requirements:
-	Visual Studio 2008+ (with applicable system requirements)
-	NUnit 2.5.7+ (from http://www.nunit.org/?p=download)

SampleLoanCo solution instructions
---------------------------------------------------------------------------

SampleLoanCo solution contains two projects. One project which builds
Signing.dll is a small wrapper around DocuSign Web Service Proxy. The
second project is a small LoanCo web application. You can see this
application working on the DocuSign sample server
http://samples.docusign.com/loanco/ 

Getting a development account 
---------------------------------------------------------------------------

You can examine the code and see a version of the application running here:
http://samples.docusign.com/loanco/, however if you would like to modify
and run the application you will need to get a development account. You
will need to contact DocuSign in order to get the development account set
up. 

There are four key pieces of information that you need to provide to the
API Proxy in order to start interfacing with DocuSign on a system to system
level: 

1) Account ID - needed for all the calls which create envelopes in DocuSign
system. 

2) User ID - needed to identify a user that you are going to automate via
API. 

3) Password – this is the same password that was used to set up the system
user.

4) Integrator Key - this is activated in the API section of preferences in
the member console. You must use an integrator's key. 

5) Web Service Endpoint (API URL) – DocuSign maintains several web service
endpoints. One is set up for development and all the URLs start with
demo.docusign.net. Production web service endpoint starts with
www.docusign.net. All the web service endpoint are completely isolated from
each other so user id, account id and even envelope ids are completely
different from one web service endpoint to another. 

Signing.dll 
---------------------------------------------------------------------------

Signing.dll is a thin library wrapped around the DocuSign Web service
Proxy. It also contains some unit tests that you can include in your
solutions or just run to make sure that your credentials and connectivity
work. 

The unit tests are run with NUnit application. More information about NUnit
can be found on www.unit.org 

LoanCo Website 
---------------------------------------------------------------------------

LoanCo website is a small website that shows embedded signing. More
information about embedded signing can be found here:
http://www.docusign.com/resources/datasheets/Datasheet-Embedded.pdf 

A video of a more complicated embedded signing example can be found here: 
http://www.docusign.com/products/product_videos/videos/Embedded/EmbeddedSigning.htm 

The LoanCo website can be run from within Visual Studio 2005 or deployed to
IIS 6 or IIS 7. 

