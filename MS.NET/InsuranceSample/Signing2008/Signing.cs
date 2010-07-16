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
using System.Diagnostics;
using System.Globalization;
using Signing.DocuSignWeb;
using System.ServiceModel.Channels;
using System.ServiceModel.Security.Tokens;
using System.ServiceModel;
using System.Configuration;

namespace Signing
{

    /// <summary>
    /// A class that contains a DocuSign Tab and a link
    /// to the recipient object.
    /// 
    /// It also provides some shortcut functions to make sure
    /// that the tabs you create have all the expected fields filled out.
    /// </summary>
    public class LinkedTab
    {
        DocuSignWeb.Recipient _recipient;
        DocuSignWeb.Tab _tab = new DocuSignWeb.Tab();

        public DocuSignWeb.Tab Tab
        {
            get { return _tab; }
        }

        public DocuSignWeb.Recipient Recipient
        {
            get { return _recipient; }
            set { _recipient = value; }
        }

        /// <summary>
        /// A function that creates a custom tab. The reason this was created is to make sure
        /// that all the necessary fields are filled in when you create a custom tab.
        /// </summary>
        /// <param name="recipient"></param>
        /// <param name="name"></param>
        /// <param name="value"></param>
        /// <param name="pageNumber"></param>
        /// <param name="XPosition"></param>
        /// <param name="YPosition"></param>
        /// <returns>A LinkedTab which has all the fields filled in</returns>
        public static LinkedTab CreateTab(DocuSignWeb.Recipient recipient,
            string name, string value,
            int pageNumber, int XPosition, int YPosition)
        {
            LinkedTab tab = new LinkedTab();
            tab.Recipient = recipient;
            tab.Tab.Type = Signing.DocuSignWeb.TabTypeCode.Custom;
            tab.Tab.Name = name;
            tab.Tab.TabLabel = name;
            tab.Tab.Value = value;
            tab.Tab.PageNumber = Convert.ToString(pageNumber);
            tab.Tab.XPosition = Convert.ToString(XPosition);
            tab.Tab.YPosition = Convert.ToString(YPosition);
            return tab;
        }

        public static LinkedTab CreateTab(DocuSignWeb.Recipient recipient,
            string name, string value,
            int pageNumber, int XPosition, int YPosition, bool required, bool locked)
        {
            LinkedTab tab = new LinkedTab();
            tab.Recipient = recipient;
            tab.Tab.Type = Signing.DocuSignWeb.TabTypeCode.Custom;
            tab.Tab.Name = name;
            tab.Tab.TabLabel = name;
            tab.Tab.Value = value;
            tab.Tab.PageNumber = Convert.ToString(pageNumber);
            tab.Tab.XPosition = Convert.ToString(XPosition);
            tab.Tab.YPosition = Convert.ToString(YPosition);
            tab.Tab.CustomTabRequired = required;
            tab.Tab.CustomTabRequiredSpecified = true;
            tab.Tab.CustomTabLocked = locked;
            tab.Tab.CustomTabLockedSpecified = true;
            return tab;
        }

        /// <summary>
        /// A function that creates a standard tab. The reason this was created is to make sure
        /// that all the necessary fields are filled in when you create a standard tab.
        /// </summary>
        /// <param name="tabType"></param>
        /// <param name="recipient"></param>
        /// <param name="pageNumber"></param>
        /// <param name="XPosition"></param>
        /// <param name="YPosition"></param>
        /// <returns>A LinkedTab which has all the fields filled in</returns>
        public static LinkedTab CreateTab(DocuSignWeb.TabTypeCode tabType,
            DocuSignWeb.Recipient recipient,
            int pageNumber, int XPosition, int YPosition)
        {
            Debug.Assert(tabType != DocuSignWeb.TabTypeCode.Custom, "A wrong helper function is used" +
                " custom tabs should not be created with CreateStandardTab");
            LinkedTab tab = new LinkedTab();
            tab.Recipient = recipient;
            tab.Tab.Type = tabType;
            tab.Tab.PageNumber = Convert.ToString(pageNumber);
            tab.Tab.XPosition = Convert.ToString(XPosition);
            tab.Tab.YPosition = Convert.ToString(YPosition);
            return tab;
        }

        /// <summary>
        /// A shortcut function to create a fully functional anchor tab
        /// </summary>
        /// <returns>A linked tab which has a fully qualified anchor tab item</returns>
        public static LinkedTab CreateTab(
            Signing.DocuSignWeb.TabTypeCode tabType,
            Signing.DocuSignWeb.Recipient recipient,
            string anchorString, int XOffset, int YOffset)
        {
            Debug.Assert(tabType != DocuSignWeb.TabTypeCode.Custom, "A wrong helper function is used" +
                    " custom tabs should not be created with CreateStandardTab");
            LinkedTab tab = new LinkedTab();
            tab.Recipient = recipient;
            tab.Tab.Type = tabType;
            tab.Tab.AnchorTabItem = new DocuSignWeb.AnchorTab();
            tab.Tab.AnchorTabItem.XOffset = XOffset;
            tab.Tab.AnchorTabItem.YOffset = YOffset;
            tab.Tab.AnchorTabItem.AnchorTabString = anchorString;
            return tab;
        }


        public static LinkedTab CreateTab(Signing.DocuSignWeb.Recipient recipient,
            string name, string value,
            string anchorString, int XOffset, int YOffset)
        {
            LinkedTab tab = new LinkedTab();
            tab.Recipient = recipient;
            tab.Tab.Type = Signing.DocuSignWeb.TabTypeCode.Custom;
            tab.Tab.Name = name;
            tab.Tab.TabLabel = name;
            tab.Tab.Value = value;
            tab.Tab.AnchorTabItem = new DocuSignWeb.AnchorTab();
            tab.Tab.AnchorTabItem.XOffset = XOffset;
            tab.Tab.AnchorTabItem.YOffset = YOffset;
            tab.Tab.AnchorTabItem.AnchorTabString = anchorString;
            return tab;
        }
    }

    /// <summary>
    /// A linked document is composed of a document
    /// and a collection of tabs.  At the creation the document
    /// might not have any tabs, but by the time the document is submitted
    /// for signing it should have tabs associated with it.
    /// </summary>
    public class LinkedDocument
    {
        public ICollection<LinkedTab> Tabs;
        DocuSignWeb.Document _document = new DocuSignWeb.Document();

        public DocuSignWeb.Document Document
        {
            get { return _document; }
        }
    }

    public class LinkedTemplateReferenceRoleAssignment
    {
        public DocuSignWeb.TemplateReferenceRoleAssignment referenceRoleAssignment = 
            new DocuSignWeb.TemplateReferenceRoleAssignment();
        public readonly DocuSignWeb.Recipient signer;

        public LinkedTemplateReferenceRoleAssignment(DocuSignWeb.Recipient signer, string roleName)
        {
            this.signer = signer;
            referenceRoleAssignment.RoleName = roleName;
        }
    }


    public struct AccountCredentials
    {
        public string ApiUrl; // url endpoint of the api
        public string AccountId; // billing account for sending envelopes
        public string UserName; // the email address used for docusign login. Optionally prefixed with an integrators key
        public string Password; // password for docusign login.

    }

    /// <summary>
    /// A class that holds the information which is relevant to 
    /// a set of documents sent for signatures.  The only way you should be
    /// able to get an envelope class is if you get a successfull
    /// signature
    /// </summary>
    public class Envelope
    {
        string _envelopeId;
        AccountCredentials _accountCredentials;

        /// <summary>
        /// A way to create an envelope that has already been instantiated in DocuSign via
        /// "CreateAndSend" API.
        /// </summary>
        /// <param name="envelopeId">existing Envelope ID</param>
        /// <param name="accountCredentials">Account Credentials so subsequent calls are valid</param>
        public Envelope(string envelopeId, AccountCredentials accountCredentials)
        {
            _envelopeId = envelopeId;
            _accountCredentials = accountCredentials;
        }


        /// <summary>
        /// Initial method / factory instanciation.
        /// In case the call is successfully completed you will get back an 
        /// envelope object that can be used to work with this envelope.
        /// In case the envelope is misconstructed an exception will be thrown
        /// The IDs on both the recipients and documents are going to be altered
        /// after the call and the Tabs will be linked to the appropriate document and 
        /// recipient ids.
        /// </summary>
        /// <param name="signers">A collection of signer objects that describes who is going to 
        /// recieve the documents.  You should have at least one signer.  Every signer
        /// must have at least one signature.</param>
        /// <param name="documents">A set of documents with tabs attached
        /// to them.  There should be at least one document in the envelope and there should be
        /// at least one tab on the envelope.</param>
        /// <param name="subject">Subject of the e-mail that the signers
        /// are going to receive</param>
        /// <param name="emailBlurb">e-mail blurb that will be inserted
        /// into the messages delivered to signers</param>
        /// <returns>An envelope object that can be used to work with this envelope.</returns>
        public static Envelope CreateAndSendEnvelope(AccountCredentials accountCredentials, DocuSignWeb.Recipient[] signers,
            LinkedDocument[] documents, string subject, string emailBlurb)
        {
            return CreateAndSendEnvelope(accountCredentials, signers, documents, subject, emailBlurb, null);
        }

        /// <summary>
        /// Initial method / factory instanciation.
        /// In case the call is successfully completed you will get back an 
        /// envelope object that can be used to work with this envelope.
        /// In case the envelope is misconstructed an exception will be thrown
        /// The IDs on both the recipients and documents are going to be altered
        /// after the call and the Tabs will be linked to the appropriate document and 
        /// recipient ids.
        /// </summary>
        /// <param name="signers">A collection of signer objects that describes who is going to 
        /// recieve the documents.  You should have at least one signer.  Every signer
        /// must have at least one signature.</param>
        /// <param name="documents">A set of documents with tabs attached
        /// to them.  There should be at least one document in the envelope and there should be
        /// at least one tab on the envelope.</param>
        /// <param name="subject">Subject of the e-mail that the signers
        /// are going to receive</param>
        /// <param name="emailBlurb">e-mail blurb that will be inserted
        /// into the messages delivered to signers</param>
        /// <returns>An envelope object that can be used to work with this envelope.</returns>
        public static Envelope CreateAndSendEnvelope(AccountCredentials accountCredentials, DocuSignWeb.Recipient[] signers, LinkedDocument[] documents, string subject, string emailBlurb, DocuSignWeb.CustomField[] fields)
        {
            return CreateAndSendEnvelope(accountCredentials, signers, documents, subject, emailBlurb, fields, null);
        }


        /// <summary>
        /// Initial method / factory instanciation.
        /// In case the call is successfully completed you will get back an 
        /// envelope object that can be used to work with this envelope.
        /// In case the envelope is misconstructed an exception will be thrown
        /// The IDs on both the recipients and documents are going to be altered
        /// after the call and the Tabs will be linked to the appropriate document and 
        /// recipient ids.
        /// </summary>
        /// <param name="signers">A collection of signer objects that describes who is going to 
        /// recieve the documents.  You should have at least one signer.  Every signer
        /// must have at least one signature.</param>
        /// <param name="documents">A set of documents with tabs attached
        /// to them.  There should be at least one document in the envelope and there should be
        /// at least one tab on the envelope.</param>
        /// <param name="subject">Subject of the e-mail that the signers
        /// are going to receive</param>
        /// <param name="emailBlurb">e-mail blurb that will be inserted
        /// into the messages delivered to signers</param>
        /// <returns>An envelope object that can be used to work with this envelope.</returns>
        public static Envelope CreateAndSendEnvelope(AccountCredentials accountCredentials, DocuSignWeb.Recipient[] signers, LinkedDocument[] documents, string subject, string emailBlurb, DocuSignWeb.CustomField[] fields, DocuSignWeb.Attachment[] attachments)
        {
            //
            // Assign sequential IDs to all the recipients
            //
            int nextRecipientId = 1;
            foreach (DocuSignWeb.Recipient recipient in signers)
            {
                recipient.ID = nextRecipientId.ToString(System.Globalization.CultureInfo.InvariantCulture);
                nextRecipientId++;
            }

            //
            // go through the documents
            // assign them appropriate IDs
            // and then pull out the tabs and properly assign
            // recipients to for them.
            //
            List<DocuSignWeb.Tab> tabs = new List<DocuSignWeb.Tab>();
            int nextDocId = 1;
            foreach (LinkedDocument linkedDoc in documents)
            {
                linkedDoc.Document.ID = nextDocId.ToString(CultureInfo.InvariantCulture);

                foreach (LinkedTab linkedTab in linkedDoc.Tabs)
                {
                    linkedTab.Tab.DocumentID = linkedDoc.Document.ID;
                    linkedTab.Tab.RecipientID = linkedTab.Recipient.ID;
                    tabs.Add(linkedTab.Tab);
                }
                nextDocId++;
            }

            //
            // Envelope wide initialization
            //
            DocuSignWeb.Envelope envelope = new DocuSignWeb.Envelope();
            envelope.Subject = subject;
            envelope.EmailBlurb = emailBlurb;
            envelope.Recipients = signers;
            envelope.AccountId = accountCredentials.AccountId;

            // assign the document array
            envelope.Documents = new DocuSignWeb.Document[documents.Length];
            for (int i = 0; i < documents.Length; ++i)
            {
                envelope.Documents[i] = documents[i].Document;
            }

            // assign the tabs to the envelope
            envelope.Tabs = tabs.ToArray();

            envelope.CustomFields = fields;
            envelope.EnvelopeAttachment = attachments;

            DocuSignWeb.APIServiceSoap apiService = CreateApiProxy(accountCredentials);
            DocuSignWeb.EnvelopeStatus envStatus = apiService.CreateAndSendEnvelope(envelope);
            return new Envelope(envStatus.EnvelopeID, accountCredentials);
        }

        /// <summary>
        /// Initial method / factory instanciation.
        /// In case the call is successfully completed you will get back an 
        /// envelope object that can be used to work with this envelope.
        /// In case the envelope is misconstructed an exception will be thrown
        /// The IDs on both the recipients and documents are going to be altered
        /// after the call and the Tabs will be linked to the appropriate document and 
        /// recipient ids.
        /// </summary>
        /// <param name="signers">A collection of signer objects that describes who is going to 
        /// recieve the documents.  You should have at least one signer.  Every signer
        /// must have at least one signature.</param>
        /// <param name="documents">A set of documents with tabs attached
        /// to them.  There should be at least one document in the envelope and there should be
        /// at least one tab on the envelope.</param>
        /// <param name="subject">Subject of the e-mail that the signers
        /// are going to receive</param>
        /// <param name="emailBlurb">e-mail blurb that will be inserted
        /// into the messages delivered to signers</param>
        /// <returns>An envelope object that can be used to work with this envelope.</returns>
        public static Envelope CreateEnvelopeFromTemplates(AccountCredentials accountCredentials,
            DocuSignWeb.Recipient[] signers,
            LinkedTemplateReferenceRoleAssignment[] roleAssignments,
            string template,
            string subject, string emailBlurb,
            DocuSignWeb.CustomField[] fields)
        {
            //
            // Assign sequential IDs to all the recipients
            //
            int nextRecipientId = 1;
            foreach (DocuSignWeb.Recipient recipient in signers)
            {
                recipient.ID = nextRecipientId.ToString(System.Globalization.CultureInfo.InvariantCulture);
                nextRecipientId++;
            }

            //
            // update the template references
            // 
            TemplateReferenceRoleAssignment[] finalRoleAssignments = new TemplateReferenceRoleAssignment[roleAssignments.Length];
            for( int i = 0; i < roleAssignments.Length; ++i)
            {
                roleAssignments[i].referenceRoleAssignment.RecipientID = roleAssignments[i].signer.ID;
                finalRoleAssignments[i] = roleAssignments[i].referenceRoleAssignment;
            }

            //
            // setting up the template
            //
            TemplateReference templateReference = new TemplateReference();
            templateReference.Template = template;
            templateReference.TemplateLocation = TemplateLocationCode.SOAP;
            templateReference.RoleAssignments = finalRoleAssignments;

            //
            // Envelope wide information
            //
            DocuSignWeb.EnvelopeInformation envelopeInfo = new EnvelopeInformation();
            envelopeInfo.AccountId = accountCredentials.AccountId;
            envelopeInfo.CustomFields = fields;
            envelopeInfo.EmailBlurb = emailBlurb;
            envelopeInfo.Subject = subject;

            DocuSignWeb.APIServiceSoap apiService = CreateApiProxy(accountCredentials);
            DocuSignWeb.EnvelopeStatus envStatus = apiService.CreateEnvelopeFromTemplates(
                new TemplateReference[] { templateReference },
                signers, envelopeInfo, true);
            return new Envelope(envStatus.EnvelopeID, accountCredentials);
        }


        public static Envelope CreateEnvelopeFromServerTemplates(
            AccountCredentials accountCredentials,
            TemplateReference[] templateRefs,
            Recipient[] signers,
            EnvelopeInformation envelopeInfo,
            bool ActivateEnvelope)
        {



            DocuSignWeb.APIServiceSoap apiService = CreateApiProxy(accountCredentials);
            DocuSignWeb.EnvelopeStatus envStatus = apiService.CreateEnvelopeFromTemplates(
                templateRefs, signers, envelopeInfo, ActivateEnvelope);
            return new Envelope(envStatus.EnvelopeID, accountCredentials);
        }



        public string EnvelopeId
        {
            get { return _envelopeId; }
        }

        /// <summary>
        /// This method will get you the PDF bytes
        /// that can be written out to a PDF file.
        /// </summary>
        /// <returns></returns>
        public byte[] RetrievePdfBytes()
        {
            Debug.Assert(String.IsNullOrEmpty(_envelopeId) == false);
            DocuSignWeb.APIServiceSoap apiService = CreateApiProxy(_accountCredentials);
            DocuSignWeb.EnvelopePDF pdf = apiService.RequestPDF(_envelopeId);
            return pdf.PDFBytes;
        }

        /// <summary>
        /// Retrieving status goes out to the server and gets the 
        /// latest status of the entire envelope.  You can use this
        /// to figure out if the envelope has been signed or delivered.
        /// </summary>
        /// <returns></returns>
        public DocuSignWeb.EnvelopeStatusCode RetrieveStatus()
        {
            Debug.Assert(String.IsNullOrEmpty(_envelopeId) == false);
            DocuSignWeb.APIServiceSoap apiService = CreateApiProxy(_accountCredentials);
            DocuSignWeb.EnvelopeStatus status = apiService.RequestStatus(_envelopeId);
            Debug.Assert(!(status == null));
            return status.Status;
        }

        /// <summary>
        /// Retrieving status goes out to the server and gets the 
        /// latest status structure of the entire envelope.  You can use this
        /// to figure out if the envelope has been signed or delivered as well
        /// as other things.
        /// </summary>
        /// <returns></returns>
        public DocuSignWeb.EnvelopeStatus RetrieveFullStatus()
        {
            Debug.Assert(String.IsNullOrEmpty(_envelopeId) == false);
            DocuSignWeb.APIServiceSoap apiService = CreateApiProxy(_accountCredentials);
            return apiService.RequestStatus(_envelopeId);
        }


        /// <summary>
        /// This method will allow you to void an envelope.  Voiding 
        /// does not work if the envelope has not been complete yet.
        /// </summary>
        public void Void(string reason)
        {
            Debug.Assert(String.IsNullOrEmpty(_envelopeId) == false);
            DocuSignWeb.APIServiceSoap apiService = CreateApiProxy(_accountCredentials);
            apiService.VoidEnvelope(_envelopeId, reason);
        }

        public string RequestRecipientToken(
            DocuSignWeb.Recipient recipient,
            DocuSignWeb.RequestRecipientTokenAuthenticationAssertion authenticationAssertion,
            DocuSignWeb.RequestRecipientTokenClientURLs clientURLs)
        {
            Debug.Assert(String.IsNullOrEmpty(_envelopeId) == false);
            DocuSignWeb.APIServiceSoap apiService = CreateApiProxy(_accountCredentials);
            return apiService.RequestRecipientToken(_envelopeId, recipient.CaptiveInfo.ClientUserId,
                recipient.UserName, recipient.Email, authenticationAssertion, clientURLs);
        }

        public string RequestSenderToken(
            string ReturnURL)
        {
            Debug.Assert(String.IsNullOrEmpty(_envelopeId) == false);
            DocuSignWeb.APIServiceSoap apiService = CreateApiProxy(_accountCredentials);
            return apiService.RequestSenderToken(_envelopeId, _accountCredentials.AccountId, ReturnURL);
        }
        /// <summary>
        /// 
        /// </summary>
        /// <param name="accountCredentials"></param>
        /// <returns>A disposable object you should wrap in using() statement</returns>
        public static DocuSignWeb.APIServiceSoap CreateApiProxy(AccountCredentials accountCredentials)
        {
#if true
            // the envelope is finally constructed we are ready to send it in
            DocuSignWeb.APIServiceSoapClient apiService = new DocuSignWeb.APIServiceSoapClient("APIServiceSoap", accountCredentials.ApiUrl);

            apiService.ClientCredentials.UserName.UserName = accountCredentials.UserName;
            apiService.ClientCredentials.UserName.Password = accountCredentials.Password;

            return apiService;

#else       // this is a security token configuration
            // this is required for certain calls like RequestRecipientToken
            // you need to get a certificate from Thawte or VeriSign first and install it
            DocuSignWeb.APIServiceSoapClient apiService = new DocuSignWeb.APIServiceSoapClient("APIServiceSoap1", accountCredentials.ApiUrl);
            apiService.ClientCredentials.UserName.UserName = "["+ConfigurationManager.AppSettings["IntegratorsKey"]+"]"+ConfigurationManager.AppSettings["APIUserEmail"];
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
        /// This is a method that you can use to get a set of of standard
        /// URLs for captive recipient.
        /// </summary>
        /// <param name="urlBase">A base URL of where the post is going to be returned to</param>
        /// <param name="userName">user name will correspond to the user name that was provided to the token request</param>
        /// <returns></returns>
        public static DocuSignWeb.RequestRecipientTokenClientURLs StandardUrls(System.Uri urlBase, string userName)
        {
            DocuSignWeb.RequestRecipientTokenClientURLs urls = new DocuSignWeb.RequestRecipientTokenClientURLs();
            urls.OnSigningComplete = urlBase + "?event=SignComplete&uname=" + userName;
            urls.OnViewingComplete = urlBase + "?event=ViewComplete&uname=" + userName;
            urls.OnCancel = urlBase + "?event=Cancel&uname=" + userName;
            urls.OnDecline = urlBase + "?event=Decline&uname=" + userName;
            urls.OnSessionTimeout = urlBase + "?event=Timeout&uname=" + userName;
            urls.OnTTLExpired = urlBase + "?event=TTLExpired&uname=" + userName;
            urls.OnIdCheckFailed = urlBase + "?event=IDCheck&uname=" + userName;
            urls.OnAccessCodeFailed = urlBase + "?event=AccessCode&uname=" + userName;
            urls.OnException = urlBase + "?event=Exception&uname=" + userName;
            return urls;
        }

    }
}
