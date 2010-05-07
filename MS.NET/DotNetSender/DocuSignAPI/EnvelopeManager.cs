/*

Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK 
and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended 
for production use. Code and policy for a production application must be 
developed to meet the specific data and security requirements of the 
application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
PARTICULAR PURPOSE.
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using DocuSignAPI.CredentialService;
using DocuSignAPI.APIService;
using System.IO;

namespace DocuSignAPI
{
    public class EnvelopeManager
    {
        public struct AccountCredentials
        {
            public string ApiUrl; // url endpoint of the api
            public string AccountId; // billing account for sending envelopes
        }

        /// <summary>
        /// This method Creates the Envelope and sends the envelope
        /// </summary>
        /// <param name="identity"></param>
        /// <param name="password"></param>
        /// <param name="subject"></param>
        /// <param name="emailBlurb"></param>
        /// <param name="file"></param>
        /// <param name="fileName"></param>
        /// <param name="recipients"></param>
        /// <returns></returns>
        public static string CreateEnvelope(Account identity, string password, string subject,
            string emailBlurb, byte[] file, string fileName, List<Recipient> recipients)
        {

            DocuSignAPI.APIService.Envelope envelope = new DocuSignAPI.APIService.Envelope();
            envelope.AccountId = identity.AccountID;
            envelope.Subject = subject;
            envelope.EmailBlurb = emailBlurb;

            //Populating Recipient Information

            envelope.Recipients = recipients.ToArray();

            //Populating Document information
            List<Document> documents = new List<Document>();
            Document document = new Document();
            document.Name = fileName;
            document.PDFBytes = file;
            document.ID = "1";
            documents.Add(document);
            envelope.Documents = documents.ToArray();

            APIServiceSoap apiService = CreateApiProxy(identity, password);
            EnvelopeStatus envStatus = apiService.CreateAndSendEnvelope(envelope);
            return envStatus.EnvelopeID;
        }

        /// <summary>
        /// This method creates an envelope and returns the url which could be embedded and used for the user signing process
        /// </summary>
        /// <param name="identity"></param>
        /// <param name="password"></param>
        /// <param name="subject"></param>
        /// <param name="emailBlurb"></param>
        /// <param name="file"></param>
        /// <param name="fileName"></param>
        /// <param name="recipients"></param>
        /// <param name="url"></param>
        /// <returns></returns>
        public static string CreateEmbedded(Account identity, string password, string subject,
            string emailBlurb, byte[] file, string fileName, List<Recipient> recipients,string url)
        {

            DocuSignAPI.APIService.Envelope envelope = new DocuSignAPI.APIService.Envelope();
            envelope.AccountId = identity.AccountID;
            envelope.Subject = subject;
            envelope.EmailBlurb = emailBlurb;

            //Populating Recipient Information
            envelope.Recipients = recipients.ToArray();

            //Populating Document information
            List<Document> documents = new List<Document>();
            Document document = new Document();
            document.Name = fileName;
            document.PDFBytes = file;
            document.ID = "1";
            documents.Add(document);
            envelope.Documents = documents.ToArray();

            APIServiceSoap apiService = CreateApiProxy(identity, password);
            EnvelopeStatus envStatus = apiService.CreateAndSendEnvelope(envelope);

            RequestRecipientTokenAuthenticationAssertion assert = new RequestRecipientTokenAuthenticationAssertion();
            assert.AssertionID = System.DateTime.Now.Ticks.ToString();
            assert.AuthenticationInstant = System.DateTime.Now;
            assert.AuthenticationMethod = RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.Password;
            assert.SecurityDomain = "dsx.test";

            string retUrl = url.ToLower().Replace("signnow.aspx", "SigningComplete.aspx");
            RequestRecipientTokenClientURLs clientURLs = new RequestRecipientTokenClientURLs();
            clientURLs.OnSigningComplete = retUrl + "?event=SignComplete&envelopeID=" + envStatus.EnvelopeID;
            clientURLs.OnAccessCodeFailed = retUrl + "?event=AccessCode&envelopeID=" + envStatus.EnvelopeID;
            clientURLs.OnCancel = retUrl + "?event=Cancel&envelopeID=" + envStatus.EnvelopeID;
            clientURLs.OnDecline = retUrl + "?event=Decline&envelopeID=" + envStatus.EnvelopeID;
            clientURLs.OnException = retUrl + "?event=Exception&envelopeID=" + envStatus.EnvelopeID;
            clientURLs.OnIdCheckFailed = retUrl + "?event=IDCheck&envelopeID=" + envStatus.EnvelopeID;
            clientURLs.OnSessionTimeout = retUrl + "?event=Timeout&envelopeID=" + envStatus.EnvelopeID;
            clientURLs.OnTTLExpired = retUrl + "?event=TTLExpired&envelopeID=" + envStatus.EnvelopeID;
            clientURLs.OnViewingComplete = retUrl + "?event=ViewComplete&envelopeID=" + envStatus.EnvelopeID;

            string token = apiService.RequestRecipientToken(envStatus.EnvelopeID, recipients[0].CaptiveInfo.ClientUserId, recipients[0].UserName, recipients[0].Email, assert, clientURLs);
            return token;
        }

        public static APIServiceSoap CreateApiProxy(Account Identity, string password)
        {
#if true
            // the envelope is finally constructed we are ready to send it in
            AccountCredentials accountCredentials = new AccountCredentials();

            //If there are many accounts then the firet one is chosen for sending
            accountCredentials.AccountId = Identity.AccountID;
            accountCredentials.ApiUrl = "https://demo.docusign.net/api/3.0/api.asmx";
            APIServiceSoapClient apiService = new APIServiceSoapClient("APIServiceSoap", accountCredentials.ApiUrl);
            apiService.ClientCredentials.UserName.UserName = Identity.UserID;
            apiService.ClientCredentials.UserName.Password = password;

            return apiService;

#else       // this is a security token configuration
            // this is required for certain calls like RequestRecipientToken
            // you need to get a certificate from Thawte or VeriSign first and install it
            DocuSignWeb.APIServiceSoapClient apiService = new DocuSignWeb.APIServiceSoapClient("APIServiceSoap1", accountCredentials.ApiUrl);
            apiService.ClientCredentials.UserName.UserName = ConfigurationManager.AppSettings["APIUserName"];
            apiService.ClientCredentials.UserName.Password = ConfigurationManager.AppSettings["Password"];

            //
            // need to add the supporting token since DocuSign uses dual authentication for 
            // for critical calls
            CustomBinding binding = (CustomBinding)apiService.Endpoint.Binding;
            BindingElementCollection elements = binding.CreateBindingElements();
            SecurityBindingElement security = elements.Find<SecurityBindingElement>();
            UserNameSecurityTokenParameters tokenParameters = new UserNameSecurityTokenParameters();
            tokenParameters.InclusionMode = SecurityTokenInclusionMode.AlwaysToRecipient;
            tokenParameters.RequireDerivedKeys = false;
            security.EndpointSupportingTokenParameters.SignedEncrypted.Add(
              tokenParameters);
            apiService.Endpoint.Binding = new CustomBinding(elements.ToArray()); ;
            return apiService;
#endif
        }

        /// <summary>
        /// Request the status of the envelope with the given envelope ID
        /// </summary>
        /// <param name="envelopeID"></param>
        /// <param name="identity"></param>
        /// <param name="password"></param>
        /// <returns></returns>
        public static EnvelopeStatus RequestEnvelopeStatus(string envelopeID, Account identity, string password)
        {

            APIServiceSoap apiService = CreateApiProxy(identity, password);
            return apiService.RequestStatus(envelopeID);

        }

        /// <summary>
        /// Request the PDF Document in the given envelope ID.If there are multiple documents then a merged copy is returned
        /// </summary>
        /// <param name="envelopeID"></param>
        /// <param name="identity"></param>
        /// <param name="password"></param>
        /// <returns></returns>
        public static EnvelopePDF RequestEnvelopePDF(string envelopeID, Account identity, string password)
        {
            APIServiceSoap apiService = CreateApiProxy(identity, password);
            return apiService.RequestPDF(envelopeID);
        }

        /// <summary>
        /// This method is used to void an envelope.
        /// </summary>
        /// <param name="envelopeID"></param>
        /// <param name="identity"></param>
        /// <param name="password"></param>
        /// <param name="reason"></param>
        /// <returns></returns>
        public static VoidEnvelopeStatus DestroyEnvelope(string envelopeID, Account identity, string password, string reason)
        {
            APIServiceSoap apiService = CreateApiProxy(identity, password);
            return apiService.VoidEnvelope(envelopeID, reason);
        }

        /// <summary>
        /// This method is used to create envelope besed on the give template
        /// </summary>
        /// <param name="identity"></param>
        /// <param name="signers"></param>
        /// <param name="roleAssignments"></param>
        /// <param name="template"></param>
        /// <param name="subject"></param>
        /// <param name="emailBlurb"></param>
        /// <param name="fields"></param>
        /// <param name="password"></param>
        /// <returns></returns>
        public static string CreateEnvelopeFromTemplates(Account identity,
                                    Recipient[] signers,
                                    string template, string subject, string emailBlurb, string password,string url, bool isEmbedded)
        {

            //
            // update the template references
            // 
            List<TemplateReferenceRoleAssignment> finalRoleAssignments = new List<TemplateReferenceRoleAssignment>();
            
            foreach (Recipient recipient in signers)
            {
                TemplateReferenceRoleAssignment templateReferenceRoleAssignment = new TemplateReferenceRoleAssignment();
                templateReferenceRoleAssignment.RecipientID = recipient.ID;
                templateReferenceRoleAssignment.RoleName = recipient.RoleName;
                finalRoleAssignments.Add(templateReferenceRoleAssignment);
            }
            
            //
            // setting up the template
            //
            TemplateReference templateReference = new TemplateReference();
            templateReference.Template = template;
            templateReference.TemplateLocation = TemplateLocationCode.SOAP;
            templateReference.RoleAssignments = finalRoleAssignments.ToArray();

            //
            // Envelope wide information
            //
            EnvelopeInformation envelopeInfo = new EnvelopeInformation();
            envelopeInfo.AccountId = identity.AccountID;
            envelopeInfo.EmailBlurb = emailBlurb;
            envelopeInfo.Subject = subject;

            APIServiceSoap apiService = CreateApiProxy(identity, password);
            EnvelopeStatus envStatus = apiService.CreateEnvelopeFromTemplates(
                new TemplateReference[] { templateReference }, signers, envelopeInfo, true);
            if (!isEmbedded)
            {
                return envStatus.EnvelopeID;
            }
            else
            {
                RequestRecipientTokenAuthenticationAssertion assert = new RequestRecipientTokenAuthenticationAssertion();
                assert.AssertionID = System.DateTime.Now.Ticks.ToString();
                assert.AuthenticationInstant = System.DateTime.Now;
                assert.AuthenticationMethod = RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.Password;
                assert.SecurityDomain = "dsx.test";

                //These are Urls to which Docusign will redirect
                string retUrl = url.ToLower().Replace("signnow.aspx", "SigningComplete.aspx");
                RequestRecipientTokenClientURLs clientURLs = new RequestRecipientTokenClientURLs();
                clientURLs.OnSigningComplete = retUrl + "?event=SignComplete&envelopeID=" + envStatus.EnvelopeID;
                clientURLs.OnAccessCodeFailed = retUrl + "?event=AccessCode&envelopeID=" + envStatus.EnvelopeID;
                clientURLs.OnCancel = retUrl + "?event=Cancel&envelopeID=" + envStatus.EnvelopeID;
                clientURLs.OnDecline = retUrl + "?event=Decline&envelopeID=" + envStatus.EnvelopeID;
                clientURLs.OnException = retUrl + "?event=Exception&envelopeID=" + envStatus.EnvelopeID;
                clientURLs.OnIdCheckFailed = retUrl + "?event=IDCheck&envelopeID=" + envStatus.EnvelopeID;
                clientURLs.OnSessionTimeout = retUrl + "?event=Timeout&envelopeID=" + envStatus.EnvelopeID;
                clientURLs.OnTTLExpired = retUrl + "?event=TTLExpired&envelopeID=" + envStatus.EnvelopeID;
                clientURLs.OnViewingComplete = retUrl + "?event=ViewComplete&envelopeID=" + envStatus.EnvelopeID;

                string token = apiService.RequestRecipientToken(envStatus.EnvelopeID, signers[0].CaptiveInfo.ClientUserId, signers[0].UserName, signers[0].Email, assert, clientURLs);
                return token;
            }

        }
    }


    public class LinkedTemplateReferenceRoleAssignment
    {
        public TemplateReferenceRoleAssignment referenceRoleAssignment =
            new TemplateReferenceRoleAssignment();
        public readonly Recipient signer;

        public LinkedTemplateReferenceRoleAssignment(Recipient signer, string roleName)
        {
            this.signer = signer;
            referenceRoleAssignment.RoleName = roleName;
        }
    }


}
