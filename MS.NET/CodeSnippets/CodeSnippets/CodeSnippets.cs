using System;
using System.IO;
using System.Collections.Generic;
using System.Globalization;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using NUnit.Framework;
using System.Diagnostics.CodeAnalysis;
using System.Configuration;
using System.Collections.Specialized;
using System.Xml;

namespace CodeSnippets
{
    [TestFixture]
    public class HeartbeatTests
    {
        DocuSignWeb.APIServiceSoapClient _apiClient;
        String _userName;
        String _apiUrl;
        String _accountId;
        String _password;
        String _email;
        List<String> envelopeIDs;

        [TestFixtureSetUp]
        public void FixtureSetup()
        {

            // Keep a list of envelope IDs so we can cleanup later
            envelopeIDs = new List<string>();

            // Grab all of the account information
            _apiUrl = ConfigurationManager.AppSettings["APIUrl"];
            _accountId = ConfigurationManager.AppSettings["APIAccountId"];
            _email = ConfigurationManager.AppSettings["APIUserEmail"];
            _userName = "";
            if (ConfigurationManager.AppSettings["IntegratorsKey"] != null && ConfigurationManager.AppSettings["IntegratorsKey"].Length > 0)
            {
                _userName += "[" + ConfigurationManager.AppSettings["IntegratorsKey"] + "]";
            }
            _userName += _email;
            _password = ConfigurationManager.AppSettings["Password"];
            _apiClient = new DocuSignWeb.APIServiceSoapClient("APIServiceSoap", _apiUrl);
            _apiClient.ClientCredentials.UserName.UserName = _userName;
            _apiClient.ClientCredentials.UserName.Password = _password;

            // Sanity checking
            Console.WriteLine("Created SOAP client with ApiUrl {0}, UserName {1} and Password {2}", _apiClient.Endpoint.Address,
                               _apiClient.ClientCredentials.UserName.UserName, _apiClient.ClientCredentials.UserName.Password);
        }

        [Test]
        public void CorrectAndResendEnvelopeTest()
        {

            // Create a basic envelope to correct and resend later
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "correct and resend envelope test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            Console.WriteLine("Envelope Id is {0} and status is {1}", status.EnvelopeID, status.Status);
            envelopeIDs.Add(status.EnvelopeID);

            // Create a new correction, and make it a recipient correction
            DocuSignWeb.Correction correction = new DocuSignWeb.Correction();
            correction.EnvelopeID = status.EnvelopeID;
            correction.RecipientCorrections = new DocuSignWeb.RecipientCorrection[1];

            // We're just copying recipient data into the corrected data
            // We could also change it entirely
            for (int i = 0; i < correction.RecipientCorrections.Length; i++)
            {
                DocuSignWeb.RecipientCorrection recipient = correction.RecipientCorrections[i];
                correction.RecipientCorrections[i] = new DocuSignWeb.RecipientCorrection();
                correction.RecipientCorrections[i].PreviousEmail = correction.RecipientCorrections[i].CorrectedEmail
                                                                    = envelope.Recipients[i].Email;
                correction.RecipientCorrections[i].PreviousUserName = correction.RecipientCorrections[i].CorrectedUserName
                                                                    = envelope.Recipients[i].UserName;
                correction.RecipientCorrections[i].PreviousRoutingOrder = correction.RecipientCorrections[i].CorrectedRoutingOrder
                                                                        = envelope.Recipients[i].RoutingOrder;
            }

            // Go ahead and make the correction
            DocuSignWeb.CorrectionStatus correctionStatus = _apiClient.CorrectAndResendEnvelope(correction);
            
            // Confirm that the call succeeded
            Assert.IsNotNull(correctionStatus);
            Console.WriteLine("Correction status succeeded? {0}", correctionStatus.RecipientCorrectionStatuses[0].CorrectionSucceeded);
        }

        [Test]
        public void CreateAndSendEnvelopeTest()
        {
            // Create and send the envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "create and send envelope test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Did we get a sent status back?
            Assert.IsNotNull(status.SentSpecified);
            Console.WriteLine("Envelope status is {0}", status.Status);
        }

        [Test]
        public void CreateEnvelopeFromTemplatesAndFormsTest()
        {
            // Set up the test by uploading a server template
            String templateXML = System.IO.File.ReadAllText("resources\\sampleTemplateForForms.dpd");

            // Upload the specified template to the account
            DocuSignWeb.SaveTemplateResult result = _apiClient.UploadTemplate(templateXML, _accountId, false);

            // Configure the envelope information
            DocuSignWeb.EnvelopeInformation envelopeInfo = new DocuSignWeb.EnvelopeInformation();
            envelopeInfo.AccountId = _accountId;
            envelopeInfo.EmailBlurb = "testing docusign creation services";
            envelopeInfo.Subject = "create envelope from templates and forms test";
            envelopeInfo.SigningLocation = DocuSignWeb.SigningLocationCode.Online;
            envelopeInfo.SigningLocationSpecified = true;

            // Create the composite template
            DocuSignWeb.CompositeTemplate template = new DocuSignWeb.CompositeTemplate();

            // Use the server template we just uploaded
            DocuSignWeb.ServerTemplate serverTemplate = new DocuSignWeb.ServerTemplate();
            serverTemplate.TemplateID = result.TemplateID;
            serverTemplate.Sequence = "1";
            template.ServerTemplates = new DocuSignWeb.ServerTemplate[] { serverTemplate };

            // First inline template, applied second
            DocuSignWeb.InlineTemplate inlineTemplateOne = new DocuSignWeb.InlineTemplate();
            inlineTemplateOne.Sequence = "2";
            inlineTemplateOne.Envelope = new DocuSignWeb.Envelope();
            inlineTemplateOne.Envelope.AccountId = _accountId;
            inlineTemplateOne.Envelope.Subject = "Sample Form";
            inlineTemplateOne.Envelope.EmailBlurb = "";
            inlineTemplateOne.Envelope.SigningLocation = DocuSignWeb.SigningLocationCode.Online;
            inlineTemplateOne.Envelope.Recipients = HeartbeatTests.CreateFormSigners();

            // This tab will give recipient 1 a "Sign Here" tab
            DocuSignWeb.Tab tab1 = new DocuSignWeb.Tab();
            tab1.DocumentID = "1";
            tab1.RecipientID = "1";
            tab1.XPosition = "12";
            tab1.YPosition = "10";
            tab1.ScaleValue = 1;
            tab1.PageNumber = "1";
            tab1.Type = DocuSignWeb.TabTypeCode.SignHere;
            tab1.Name = "SignHere";
            tab1.TabLabel = "Sign Here 1";
            tab1.CustomTabHeight = 0;

            // This tab will take any fields with the a fld1 label
            // and assign them to recipient 2
            DocuSignWeb.Tab tab2 = new DocuSignWeb.Tab();
            tab2.RecipientID = "2";
            tab2.TabLabel = "fld1";
            tab2.Value = "From Inline Template";
            tab2.Type = DocuSignWeb.TabTypeCode.Custom;

            // This tab will take tabs that match the pattern and
            // assign them to recipient 2
            DocuSignWeb.Tab tab3 = new DocuSignWeb.Tab();
            tab3.RecipientID = "2";
            tab3.TabLabel = "fld2\\*";
            Console.WriteLine("{0}", tab3.TabLabel);
            tab3.Value = "Wild card from Inline Template";
            tab3.Type = DocuSignWeb.TabTypeCode.Custom;

            inlineTemplateOne.Envelope.Tabs = new DocuSignWeb.Tab[] { tab1, tab2, tab3 };

            // First inline template, applied third
            DocuSignWeb.InlineTemplate inlineTemplateTwo = new DocuSignWeb.InlineTemplate();
            inlineTemplateTwo.Sequence = "3";
            inlineTemplateTwo.Envelope = new DocuSignWeb.Envelope();
            inlineTemplateTwo.Envelope.AccountId = _accountId;
            inlineTemplateTwo.Envelope.Recipients = new DocuSignWeb.Recipient[] { HeartbeatTests.CreateFormSigners()[0] };

            // Create one more Sign Here tab on page two, and give it to
            // recipient 1
            DocuSignWeb.Tab tab4 = tab1;
            tab4.PageNumber = "2";
            inlineTemplateTwo.Envelope.Tabs = new DocuSignWeb.Tab[] { tab1, tab4 };

            template.InlineTemplates = new DocuSignWeb.InlineTemplate[] { inlineTemplateOne, inlineTemplateTwo };

            // Extract metadata from the PDF itself last
            DocuSignWeb.PDFMetaDataTemplate pdfMetaDatatemplate = new DocuSignWeb.PDFMetaDataTemplate();
            pdfMetaDatatemplate.Sequence = "4";

            template.PDFMetaDataTemplate = pdfMetaDatatemplate;

            // Use the sample document, and extract information from it
            DocuSignWeb.Document document = new DocuSignWeb.Document();
            document.ID = "1";
            document.Name = "Form Document";
            document.PDFBytes = Resource.sample;
            document.TransformPdfFields = true;
            document.FileExtension = "pdf";

            template.Document = document;

            // Create draft with all the composite template information
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateEnvelopeFromTemplatesAndForms(envelopeInfo, new DocuSignWeb.CompositeTemplate[] { template }, false);

            // Confirm that the envelope has been assigned an ID
            Assert.IsNotNullOrEmpty(status.EnvelopeID);
            Console.WriteLine("Envelope Id is {0}", status.EnvelopeID);
        }

        [Test]
        public void CreateEnvelopeFromTemplatesTest()
        {
            // Construct all the recipient information
            DocuSignWeb.Recipient[] recipients = HeartbeatTests.CreateOneSigner();
            DocuSignWeb.TemplateReferenceRoleAssignment[] finalRoleAssignments = new DocuSignWeb.TemplateReferenceRoleAssignment[1];
            finalRoleAssignments[0] = new DocuSignWeb.TemplateReferenceRoleAssignment();
            finalRoleAssignments[0].RoleName = "Signer";
            finalRoleAssignments[0].RecipientID = recipients[0].ID;

            // User a server-side template
            DocuSignWeb.TemplateReference templateReference = new DocuSignWeb.TemplateReference();
            templateReference.TemplateLocation = DocuSignWeb.TemplateLocationCode.Server;
            templateReference.Template = "server template ID";

            // Construct the envelope information
            DocuSignWeb.EnvelopeInformation envelopeInfo = new DocuSignWeb.EnvelopeInformation();
            envelopeInfo.AccountId = _accountId;
            envelopeInfo.Subject = "create envelope from templates test";
            envelopeInfo.EmailBlurb = "testing docusign creation services";

            // Create draft with all the template information
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateEnvelopeFromTemplates(new DocuSignWeb.TemplateReference[] { templateReference },
                recipients, envelopeInfo, false);

            // Confirm that the envelope has been assigned an ID
            Assert.IsNotNullOrEmpty(status.EnvelopeID);
            Console.WriteLine("Status for envelope {0} is {1}", status.EnvelopeID, status.Status);

        }

        [Test]
        public void CreateEnvelopeTest()
        {
            // Construct a basic envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "create envelope test");
            
            // Go ahead and create it on your account -- it will be a draft
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateEnvelope(envelope);

            // An envelope ID indicates that it succeeded!
            Assert.IsNotNull(status.EnvelopeID);
            Console.WriteLine("Envelope Id is {0}", status.EnvelopeID);
        }

        [Test]
        public void EnvelopeAuditEventsTest()
        {
            // Construct, create and send an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "envelope audit events test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Request the audit history
            XmlNode result = _apiClient.EnvelopeAuditEvents(status.EnvelopeID);

            // Confirm that we got history back
            Assert.IsNotNullOrEmpty(result.OuterXml);
            StringWriter stringWriter = new StringWriter();
            XmlTextWriter xmlTextWriter = new XmlTextWriter(stringWriter);
            xmlTextWriter.Formatting = Formatting.Indented;
            result.WriteTo(xmlTextWriter);
            xmlTextWriter.Flush();
            Console.Write(stringWriter.ToString());
        }

        [Test]
        public void GetAccountMemebershipFeaturesList()
        {
            // This is simple -- just input your account ID
            DocuSignWeb.AccountMembershipFeaturesList list = _apiClient.GetAccountMembershipFeaturesList(_accountId);
            
            // Confirm that we got anything in the list
            Assert.NotNull(list);
            Console.WriteLine("Features list retrieved for account: {0}", list.UserName);
        }

        [Test]
        public void GetAccountSettingsListTest()
        {
            // This is simple -- just input your account ID
            DocuSignWeb.AccountSetting[] settings = _apiClient.GetAccountSettingsList(_accountId);
            
            // Confirm that we got any settings
            Assert.Greater(settings.Length, 0);
            Console.WriteLine("We have {0} account settings", settings.Length);
        }

        [Test]
        public void GetAddressBookItemsTest()
        {
            // This is simple -- just input your account ID
            DocuSignWeb.AddressBookItem[] items = _apiClient.GetAddressBookItems(_accountId);

            // Confirm that we received results
            if (items.Length == 0)
            {
                Assert.Inconclusive("We did not get any address book items, but the user may not have contacts.");
            }
            else
            {
                Assert.Greater(items.Length, 0);
                Console.WriteLine("There there are {0} items in the address book", items.Length);

                foreach (DocuSignWeb.AddressBookItem item in items)
                {
                    Console.WriteLine("\t{0}: {1}", item.UserName, item.Email);
                }
            }
        }

        [Test]
        public void GetAuthenticationTokenTest()
        {
            // To take advantage of the optional navigation to an envelope, create the envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "get authentication token test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Now, call the function with the envelope ID of the envelope
            // to which you wish to navigate
            String token = _apiClient.GetAuthenticationToken(status.EnvelopeID);

            // Confirm that we got a return token
            Assert.IsNotNullOrEmpty(token);
            Console.WriteLine("Token retrieved is {0}", token);
        }

        [Test]
        public void GetFoldersTest()
        {
            // This is simple -- just input your account ID
            DocuSignWeb.Folder[] items = _apiClient.GetFolders(_accountId).Folders;

            // Everyone should have Draft, Sent Items, Inbox and Deleted Items
            Assert.GreaterOrEqual(items.Length, 4);
            Console.WriteLine("There should be at least 4 folders, and there are: {0}", items.Length);

            // The folder names are:
            foreach (DocuSignWeb.Folder folder in items)
            {
                Console.WriteLine("\t{0}", folder.FolderName);
            }
        }

        [Test]
        public void GetFolderTest()
        {
            // Ensure that there's at least one voided envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "get folder test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            VoidEnvelope(status.EnvelopeID, _apiClient);

            // Retrieve voided envelopes that are from today from sent items
            DocuSignWeb.FolderResults results = _apiClient.GetFolder(_accountId, DocuSignWeb.FolderType.SentItems,
                                                                        "", 0, DateTime.Today, DateTime.Now, "",
                                                                        DocuSignWeb.EnvelopeStatusCode.Voided);
            
            // Confirm that there is at least one item in the results;
            // it should be the one we just sent and voided!
            Assert.Greater(results.FolderItems.Length, 0);
            Console.WriteLine("{0} folder item(s) returned", results.FolderItems.Length);

            // Purge the envelope from the system
            HeartbeatTests.PurgeEnvelope(status.EnvelopeID, _apiClient);
        }

        [Test]
        public void GetRecipientEsignListTest()
        {
            // Enter account holder's username, email and accountID,
            // and the email of the user that you wish to determine if
            // an esign agreement exists
            DocuSignWeb.RecipientEsignList recipients = _apiClient.GetRecipientEsignList(_userName, _email, _accountId, "test email");
            
            // Confirm that the call succeeded
            Assert.IsNotNull(recipients);
            Console.WriteLine("There are {0} recipients", recipients.RecipientEsign.Length);

            // Examine each record -- does the esign agreement exist?
            foreach (DocuSignWeb.RecipientEsign esign in recipients.RecipientEsign)
            {
                Console.WriteLine("\t{0}: {1}", esign.Email, esign.Esign);

            }
        }

        [Test]
        public void GetRecipientListTest()
        {
            // Enter the account holder's ID and the target email
            // to find all recipients at the target email address
            DocuSignWeb.RecipientList recipients = _apiClient.GetRecipientList(_accountId, "test email");
            
            // Confirm that the call succeeded
            Assert.IsNotNull(recipients);
            Console.WriteLine("There are {0} recipients", recipients.RecipientName.Length);

            // Examine each record -- does the esign agreement exist?
            foreach (String recipient in recipients.RecipientName)
            {
                Console.WriteLine("\t{0}", recipient);
            }
        }

        [Test]
        public void PingTest()
        {
            // Use this function to validate that the Credential API is alive
            bool retval = _apiClient.Ping();
            
            // Confirm that we got an appropriate reply
            Assert.IsTrue(retval);

            if (retval)
            {
                Console.WriteLine("Ping succeeded.");
            }
        }

        [Test]
        public void PurgeDocumentsTest()
        {
            // Create, send and void an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "purge documents test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            VoidEnvelope(status.EnvelopeID, _apiClient);

            // Purge the documents from the specified envelope
            if (!String.IsNullOrEmpty(status.EnvelopeID))
            {
                DocuSignWeb.PurgeDocumentStatus pStatus = HeartbeatTests.PurgeEnvelope(status.EnvelopeID, _apiClient);
                Assert.True(pStatus.PurgeDocumentSuccess);
                Console.WriteLine("Purging the envelope worked? {0}", pStatus.PurgeDocumentSuccess);
            }
            else
            {
                Assert.Fail("Creation of envelope failed.");
            }
        }

        [Test]
        public void RemoveAddressBookItemsTest()
        {
            // Grab all the address book items from the specified account
            DocuSignWeb.AddressBookItem[] items = _apiClient.GetAddressBookItems(_accountId);
            
            if(items.Length >= 1)
            {

                // Use the address book ID of an item to remove it
                DocuSignWeb.AddressBookRemoveItem toRemove = new DocuSignWeb.AddressBookRemoveItem();
                toRemove.AddressBookID = items[0].AddressBookID;

                // Construct an array with all the items you want to remove
                DocuSignWeb.AddressBookRemoveItem[] remove = { toRemove };
                DocuSignWeb.UpdateAddressBookResult result = _apiClient.RemoveAddressBookItems(remove, false);
                
                // Confirm that the update succeeded
                Assert.IsTrue(result.Success);
                Console.WriteLine("Removed item {0} succeeded? {1}", toRemove.AddressBookID, result.Success);
            }
            else
            {
                Assert.Inconclusive("No address book items to remove."); 
            }
        }

        [Test]
        public void RequestCorrectTokenTest()
        {
            try
            {
                // Create and send an envelope
                DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "request correct token test");
                envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
                DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
                envelopeIDs.Add(status.EnvelopeID);

                // Request the token with the envelope ID and a return URL
                String token = _apiClient.RequestCorrectToken(status.EnvelopeID, true, "http://127.0.0.1/");

                // Confirm that we got a return token
                Assert.IsNotNullOrEmpty(token);
                Console.WriteLine("The token returned is {0}", token);
            }
            catch (Exception e)
            {
                Assert.Fail(e.StackTrace);
            }
        }

        [Test]
        public void RequestDocumentPDFsExTest()
        {
            // Create and send an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "request document pdfs ex test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Call to request the PDFs with the envelope's ID
            DocuSignWeb.DocumentPDFs pdf = _apiClient.RequestDocumentPDFsEx(status.EnvelopeID);

            // Confirm that we got at least one PDF returned
            Assert.Greater(pdf.DocumentPDF.Length, 0);
            Console.WriteLine("Envelope has {0} pdfs", pdf.DocumentPDF.Length);
        }

        [Test]
        public void RequestDocumentPDFsRecipientViewTest()
        {
            // Create and send an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "request document pdfs recipient view test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Call to request the PDFs with the envelope's ID, the recipient's name and email
            DocuSignWeb.DocumentPDFs pdf = _apiClient.RequestDocumentPDFsRecipientsView(status.EnvelopeID, envelope.Recipients[0].UserName, envelope.Recipients[0].Email);

            // Confirm that we got at least one PDF returned
            Assert.Greater(pdf.DocumentPDF.Length, 0);
            Console.WriteLine("Envelope has {0} pdfs", pdf.DocumentPDF.Length);
        }

        [Test]
        public void RequestDocumentPDFsTest()
        {
            // Create and send an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "request document pdfs test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Call to request the PDFs with the envelope's ID
            DocuSignWeb.DocumentPDFs pdf = _apiClient.RequestDocumentPDFs(status.EnvelopeID);

            // Confirm that we got at least one PDF returned
            Assert.Greater(pdf.DocumentPDF.Length, 0);
            Console.WriteLine("Envelope has {0} pdfs", pdf.DocumentPDF.Length);
        }

        [Test]
        public void RequestEnvelopeTest()
        {
            // Create and send an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "request envelope test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Call to request the envelope with the envelope's ID
            DocuSignWeb.Envelope returnEnvelope = _apiClient.RequestEnvelope(status.EnvelopeID, false);

            // Confirm that we got an envelope returned
            Assert.NotNull(returnEnvelope);
            Console.WriteLine("Return envelope has a subject of \"{0}\"", returnEnvelope.Subject);
        }

        [Test]
        public void RequestPDFNoWaterMarkTest()
        {
            // Create and send an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "request pdf no watermark test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Call to request the PDF with the envelope ID
            DocuSignWeb.EnvelopePDF pdf = _apiClient.RequestPDFNoWaterMark(status.EnvelopeID);

            // Confirm that the bytes returned are greater than 0
            Assert.Greater(pdf.PDFBytes.Length, 0);
            Console.WriteLine("Pdf has {0} bytes", pdf.PDFBytes.Length);
            
        }

        [Test]
        public void RequestPDFTest()
        {
            // Create and send an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "request pdf test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Call to request the PDF with the envelope ID
            DocuSignWeb.EnvelopePDF pdf = _apiClient.RequestPDF(status.EnvelopeID);

            // Confirm that the bytes returned are greater than 0
            Assert.Greater(pdf.PDFBytes.Length, 0);
            Console.WriteLine("Pdf has {0} bytes", pdf.PDFBytes.Length);
        }

        [Test]
        public void RequestPDFWithCertTest()
        {
            // Create and send an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "request pdf with cert test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Call to request the PDF with the envelope ID
            // Here, we chose to suppress the watermark
            DocuSignWeb.EnvelopePDF pdf = _apiClient.RequestPDFWithCert(status.EnvelopeID, false);

            // Confirm that the bytes returned are greater than 0
            Assert.Greater(pdf.PDFBytes.Length, 0);
            Console.WriteLine("Pdf has {0} bytes", pdf.PDFBytes.Length);
        }

        [Test]
        public void RequestRecipientTokenTest()
        {
            // Create and send an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "request recipient token test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);

            // Need to specify captive info for these recipients
            envelope.Recipients[0].CaptiveInfo = new DocuSignWeb.RecipientCaptiveInfo();
            envelope.Recipients[0].CaptiveInfo.ClientUserId = "User1";

            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Construct the recipient token authentication assertion
            // Specify ID, start time, method and domain
            DocuSignWeb.RequestRecipientTokenAuthenticationAssertion assertion = new DocuSignWeb.RequestRecipientTokenAuthenticationAssertion();
            assertion.AssertionID = new Guid().ToString();
            assertion.AuthenticationInstant = DateTime.Now;
            assertion.AuthenticationMethod = DocuSignWeb.RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.Password;
            assertion.SecurityDomain = "Request Recipient Token Test";

            // Construct the URLs based on username
            DocuSignWeb.Recipient recipient = envelope.Recipients[0];
            DocuSignWeb.RequestRecipientTokenClientURLs urls = new DocuSignWeb.RequestRecipientTokenClientURLs();
            String urlBase = "http://127.0.0.1/";
            urls.OnSigningComplete = urlBase + "?event=SignComplete&uname=" + recipient.UserName;
            urls.OnViewingComplete = urlBase + "?event=ViewComplete&uname=" + recipient.UserName;
            urls.OnCancel = urlBase + "?event=Cancel&uname=" + recipient.UserName;
            urls.OnDecline = urlBase + "?event=Decline&uname=" + recipient.UserName;
            urls.OnSessionTimeout = urlBase + "?event=Timeout&uname=" + recipient.UserName;
            urls.OnTTLExpired = urlBase + "?event=TTLExpired&uname=" + recipient.UserName;
            urls.OnIdCheckFailed = urlBase + "?event=IDCheck&uname=" + recipient.UserName;
            urls.OnAccessCodeFailed = urlBase + "?event=AccessCode&uname=" + recipient.UserName;
            urls.OnException = urlBase + "?event=Exception&uname=" + recipient.UserName;
            
            // Request the token for a specific recipient
            String token = _apiClient.RequestRecipientToken(status.EnvelopeID, recipient.CaptiveInfo.ClientUserId,
                                                            recipient.UserName, recipient.Email, assertion, urls);

            // Confirm that we got a return token
            Assert.IsNotNullOrEmpty(token);
            Console.WriteLine("Recipient token is {0}", token);
        }

        [Test]
        public void RequestSenderTokenTest()
        {
            // Create and send an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "request sender token test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Request the token for the sender
            String result = _apiClient.RequestSenderToken(status.EnvelopeID, _accountId, "http://127.0.0.1/");

            // Confirm that we got a return token
            Assert.IsNotNullOrEmpty(result);
            Console.WriteLine("Sender token is {0}", result);
        }

        [Test]
        public void RequestStatusesExTest()
        {
            // Create and send an envelope
            DocuSignWeb.Envelope envelope1 = HeartbeatTests.CreateBasicEnvelope(_accountId, "request statuses ex test");
            envelope1 = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope1);
            DocuSignWeb.EnvelopeStatus status1 = _apiClient.CreateAndSendEnvelope(envelope1);
            envelopeIDs.Add(status1.EnvelopeID);

            // Create, send and void another envelope
            DocuSignWeb.Envelope envelope2 = HeartbeatTests.CreateBasicEnvelope(_accountId, "request statuses ex test");
            envelope2 = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope2);
            DocuSignWeb.EnvelopeStatus status2 = _apiClient.CreateAndSendEnvelope(envelope2);
            DocuSignWeb.VoidEnvelopeStatus voidStatus = _apiClient.VoidEnvelope(status2.EnvelopeID, "statuses ex testing");
            
            // Create a filter using account ID and today as a start time
            DocuSignWeb.EnvelopeStatusFilter filter = new DocuSignWeb.EnvelopeStatusFilter();
            filter.AccountId = _accountId;
            DocuSignWeb.EnvelopeStatusFilterBeginDateTime begin = new DocuSignWeb.EnvelopeStatusFilterBeginDateTime();
            begin.Value = DateTime.Today;
            filter.BeginDateTime = begin;

            // Request all envelopes that match the filter
            DocuSignWeb.FilteredEnvelopeStatuses statuses = _apiClient.RequestStatusesEx(filter);
            HeartbeatTests.PurgeEnvelope(status2.EnvelopeID, _apiClient);

            // Confirm that we got at least two envelope statuses back
            Assert.GreaterOrEqual(statuses.EnvelopeStatuses.Length, 2);
            Console.WriteLine("We have {0} statuses that match account ID {1}", statuses.EnvelopeStatuses.Length, statuses.EnvelopeStatusFilter.AccountId);
            foreach (DocuSignWeb.EnvelopeStatus eStatus in statuses.EnvelopeStatuses)
            {
                Console.WriteLine("\tEnvelope with ID {0}", eStatus.EnvelopeID);
                foreach (DocuSignWeb.DocumentStatus dStatus in eStatus.DocumentStatuses)
                {
                    Console.WriteLine("\t\tDocument with ID {0} has name {1}", dStatus.ID,
                        dStatus.Name);
                }
            }
        }

        [Test]
        public void RequestStatusesTest()
        {
            // Create and send one envelope
            DocuSignWeb.Envelope envelope1 = HeartbeatTests.CreateBasicEnvelope(_accountId, "request statuses test");
            envelope1 = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope1);
            DocuSignWeb.EnvelopeStatus status1 = _apiClient.CreateAndSendEnvelope(envelope1);
            envelopeIDs.Add(status1.EnvelopeID);

            // Create, send and void another envelope
            DocuSignWeb.Envelope envelope2 = HeartbeatTests.CreateBasicEnvelope(_accountId, "request statuses test");
            envelope2 = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope2);
            DocuSignWeb.EnvelopeStatus status2 = _apiClient.CreateAndSendEnvelope(envelope2);
            DocuSignWeb.VoidEnvelopeStatus voidStatus = _apiClient.VoidEnvelope(status2.EnvelopeID, "statuses testing");

            // Create a filter using account ID and today as a start time
            DocuSignWeb.EnvelopeStatusFilter filter = new DocuSignWeb.EnvelopeStatusFilter();
            filter.AccountId = _accountId;
            filter.BeginDateTime = new DocuSignWeb.EnvelopeStatusFilterBeginDateTime();
            filter.BeginDateTime.Value = DateTime.Today;

            // Request all envelopes that match the filter
            DocuSignWeb.FilteredEnvelopeStatuses statuses = _apiClient.RequestStatuses(filter);
            HeartbeatTests.PurgeEnvelope(status2.EnvelopeID, _apiClient);

            // Confirm that we got at least two envelope statuses back
            Assert.GreaterOrEqual(statuses.EnvelopeStatuses.Length, 2);
            Console.WriteLine("We have {0} statuses that match account ID {1}", statuses.EnvelopeStatuses.Length, _accountId);
            foreach (DocuSignWeb.EnvelopeStatus eStatus in statuses.EnvelopeStatuses)
            {
                Console.WriteLine("\tEnvelope with ID {0} has status {1}", eStatus.EnvelopeID, eStatus.Status.ToString());
            }
        }

        [Test]
        public void RequestStatusExTest()
        {
            // Create and send an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "request status ex test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus eStatus = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(eStatus.EnvelopeID);

            // Request the status of that envelope
            DocuSignWeb.EnvelopeStatus status = _apiClient.RequestStatusEx(eStatus.EnvelopeID);

            // Confirm that the status of the envelope is sent
            Assert.True(status.SentSpecified);
            Console.WriteLine("Status for envelope ID {0} is {1}", eStatus.EnvelopeID, status.Status);
            Console.WriteLine("Account status is {0}", status.RecipientStatuses[0].AccountStatus);
        }

        [Test]
        public void RequestStatusTest()
        {
            // Create, send and void an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "request status test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus eStatus = _apiClient.CreateAndSendEnvelope(envelope);
            DocuSignWeb.VoidEnvelopeStatus voidStatus = _apiClient.VoidEnvelope(eStatus.EnvelopeID, "status testing");
            
            // Request the status of that envelope
            DocuSignWeb.EnvelopeStatus status = _apiClient.RequestStatus(eStatus.EnvelopeID);
            HeartbeatTests.PurgeEnvelope(eStatus.EnvelopeID, _apiClient);

            // Confirm that the status we get back is "Voided"
            Assert.AreEqual("Voided", status.Status.ToString());
            Console.WriteLine("Status for envelope ID {0} is {1}", eStatus.EnvelopeID, status.Status);
        }

        [Test]
        public void RequestTemplatesTest()
        {
            // Request all the templates that this account has on file
            DocuSignWeb.EnvelopeTemplateDefinition[] response = _apiClient.RequestTemplates(_accountId, false);
            
            // Make sure the response exists
            Assert.NotNull(response);

            // Print out information about the templates
            if (response.Length > 0)
            {
                foreach (DocuSignWeb.EnvelopeTemplateDefinition def in response)
                {
                    Console.WriteLine("Retrieved template definition with ID {0} with name \"{1}\"", def.TemplateID, def.Name);
                }
            }
            else
            {
                Assert.Inconclusive("We don't have any templates to retrieve!");
            }

        }

        [Test]
        public void RequestTemplateTest()
        {
            // Request all the templates that this account has on file
            DocuSignWeb.EnvelopeTemplateDefinition[] response = _apiClient.RequestTemplates(_accountId, false);

            // Make sure the response exists
            Assert.NotNull(response);

            foreach (DocuSignWeb.EnvelopeTemplateDefinition def in response)
            {
                Console.WriteLine("Retrieved template definition with ID {0}", def.TemplateID);
                
                // Request the template specified by the template ID
                DocuSignWeb.EnvelopeTemplate template = _apiClient.RequestTemplate(def.TemplateID, false);
                
                // Confirm that we got a template returned
                Assert.NotNull(template);
                Console.WriteLine("\tRetrieved template with name \"{0}\" and with {1} pages", template.EnvelopeTemplateDefinition.Name, template.EnvelopeTemplateDefinition.PageCount);
            }
        }

        [Test]
        public void SaveTemplateTest()
        {
            // Request all the templates that this account has on file
            DocuSignWeb.EnvelopeTemplateDefinition[] response = _apiClient.RequestTemplates(_accountId, false);


            // Make sure the response exists
            Assert.NotNull(response);
            foreach (DocuSignWeb.EnvelopeTemplateDefinition def in response)
            {
                Console.WriteLine("Retrieved template definition with ID {0}", def.TemplateID);

                // Request the template specified by the template ID
                DocuSignWeb.EnvelopeTemplate template = _apiClient.RequestTemplate(def.TemplateID, true);

                // Confirm that we got a template returned
                Assert.NotNull(template);
                Console.WriteLine("\tRetrieved template with name \"{0}\"", template.EnvelopeTemplateDefinition.Name);
                
                // Modify the name of the template
                template.EnvelopeTemplateDefinition.Name = "Modified name";
                
                // Save the template back to the account
                DocuSignWeb.SaveTemplateResult result = _apiClient.SaveTemplate(template);
                
                // Confirm that the save operation succeeded
                Assert.True(result.Success);
                Console.WriteLine("\tSaved template? {0}", result.Success);
            }
        }

        [Test]
        public void SendEnvelopeTest()
        {
            // Create an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "send envelope test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);

            // Create the envelope on the server
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateEnvelope(envelope);

            // Send the envelope
            DocuSignWeb.EnvelopeStatus sendStatus = _apiClient.SendEnvelope(status.EnvelopeID, _accountId);
            envelopeIDs.Add(sendStatus.EnvelopeID);

            // Confirm that the sent time is at least today
            Assert.GreaterOrEqual(sendStatus.Sent, DateTime.Today);
            Console.WriteLine("Envelope status is {0}", sendStatus.Status);
            
        }

        [Test]
        public void SynchEnvelopeTest()
        {
            // Create an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "synch envelope test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);

            // Assign it a transaction ID and make it asynchronous send
            envelope.TransactionID = System.Guid.NewGuid().ToString();
            envelope.Asynchronous = true;

            // Go ahead and send the envelope
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            envelopeIDs.Add(status.EnvelopeID);

            // Request a synch using the transaction ID and account ID
            // but don't block it from processing
            DocuSignWeb.SynchEnvelopeStatus synchStatus = _apiClient.SynchEnvelope(envelope.TransactionID, _accountId, false);

            // Confirm we got a status back
            Assert.NotNull(synchStatus);
            Console.WriteLine("Synch envelope status is {0}", synchStatus.EnvelopeStatus);
        }

        //[Test]
        /// <summary>
        /// This needs to be a manual test. You can run this test by:
        /// 1. Send an envelope and capture the envelope ID
        /// 2. Paste the envelope ID into the first parameter
        /// 3. Paste the account ID and user ID of the destination account (in GUID format)
        ///    into the second and third parameters
        /// 4. Call TransferEnvelope
        /// </summary>
        public void TransferEnvelopeTest()
        {
            // Request the envelope specified to be transferred to the account specified
            DocuSignWeb.TransferEnvelopeStatus status = _apiClient.TransferEnvelope("envelope ID", "account ID as GUID", "user ID as GUID");

            // Confirm that the transfer succeeded
            Assert.True(status.TransferEnvelopeSuccess);
            Console.WriteLine("Transfer succeeded? {0}", status.TransferEnvelopeSuccess);
        }

        [Test]
        public void UpdateAddressBookItemsTest()
        {
            // Create an address book item with email, user name, account name
            // and account ID
            DocuSignWeb.AddressBookItem contact = new DocuSignWeb.AddressBookItem();
            contact.Email = "fakeemail@mailinator.com";
            contact.UserName = "DocuSign Test";
            contact.AccountName = "Some account";
            contact.Shared = true;
            contact.AddressBookID = System.Guid.NewGuid().ToString();

            // Create an array with all items to update / add
            DocuSignWeb.AddressBookItem[] items = { contact };

            // Update the address book with the new items
            DocuSignWeb.UpdateAddressBookResult result = _apiClient.UpdateAddressBookItems(items, false);

            // Confirm that the address book updated
            Assert.True(result.Success);
            Console.WriteLine("Updated address book? {0}", result.Success);
        }

        [Test]
        public void UploadTemplateTest()
        {
            // Read the template that you want to upload
            String templateXML = System.IO.File.ReadAllText("resources\\sampleTemplate.dpd");

            // Upload the specified template to the account
            DocuSignWeb.SaveTemplateResult result = _apiClient.UploadTemplate(templateXML, _accountId, false);

            // Confirm that the template saved successfully
            Assert.True(result.Success);
            Console.WriteLine("The template was successfully uploaded? {0}", result.Success);            
        }

        [Test]
        public void VoidEnvelopeTest()
        {
            // Create and send an envelope
            DocuSignWeb.Envelope envelope = HeartbeatTests.CreateBasicEnvelope(_accountId, "void envelope test");
            envelope = HeartbeatTests.CreateEnvelopeWithDocumentAndTabs(envelope);
            DocuSignWeb.EnvelopeStatus status = _apiClient.CreateAndSendEnvelope(envelope);
            
            if (!String.IsNullOrEmpty(status.EnvelopeID))
            {
                // Void the envelope
                DocuSignWeb.VoidEnvelopeStatus voidStatus = HeartbeatTests.VoidEnvelope(status.EnvelopeID, _apiClient);

                // Confirm that the envelope was voided
                Assert.IsTrue(voidStatus.VoidSuccess);
                Console.WriteLine("Voiding the envelope worked? {0}", voidStatus.VoidSuccess);
                
                HeartbeatTests.PurgeEnvelope(status.EnvelopeID, _apiClient);
            }
            else
                Assert.Fail("Creation of envelope failed.");
        }

        [TestFixtureTearDown]
        public void FixtureTeardown()
        {
            foreach (String id in envelopeIDs)
            {
                VoidEnvelope(id, _apiClient);
                PurgeEnvelope(id, _apiClient);
            }
        }

        /// <summary>
        /// A simple construct of one test signer
        /// </summary>
        internal static DocuSignWeb.Recipient[] CreateOneSigner()
        {
            DocuSignWeb.Recipient[] signers = { new DocuSignWeb.Recipient() };
            signers[0].Email = "test signer email";
            signers[0].UserName = "Testing Account";
            signers[0].Type = DocuSignWeb.RecipientTypeCode.Signer;
            signers[0].ID = "1";
            signers[0].RoutingOrder = 1;
            return signers;
        }

        /// <summary>
        /// Create three different signers, two with the same routing
        /// order
        /// </summary>
        /// <returns></returns>
        internal static DocuSignWeb.Recipient[] CreateFormSigners()
        {
            DocuSignWeb.Recipient recipient1 = new DocuSignWeb.Recipient();
            recipient1.UserName = "Test User 1";
            recipient1.Email = "docusigntest1@mailinator.com";
            recipient1.Type = DocuSignWeb.RecipientTypeCode.Signer;
            recipient1.RequireIDLookup = false;
            recipient1.RoutingOrder = 1;
            recipient1.RoutingOrderSpecified = true;
            recipient1.RoleName = "SignerOne";
            recipient1.DefaultRecipient = true;
            recipient1.DefaultRecipientSpecified = true;
            recipient1.RequireIDLookupSpecified = true;
            recipient1.ID = "1";

            DocuSignWeb.Recipient recipient2 = new DocuSignWeb.Recipient();
            recipient2.UserName = "Test User 2";
            recipient2.Email = "docusigntest2@mailinator.com";
            recipient2.Type = DocuSignWeb.RecipientTypeCode.Signer;
            recipient2.RequireIDLookup = false;
            recipient2.RoutingOrder = 2;
            recipient2.RoutingOrderSpecified = true;
            recipient2.RoleName = "SignerTwo";
            recipient2.ID = "2";

            DocuSignWeb.Recipient recipient3 = new DocuSignWeb.Recipient();
            recipient3.UserName = "Test User 3";
            recipient3.Email = "docusigntest3@mailinator.com";
            recipient3.Type = DocuSignWeb.RecipientTypeCode.Signer;
            recipient3.RequireIDLookup = false;
            recipient3.RoutingOrder = 1;
            recipient3.RoutingOrderSpecified = true;
            recipient3.RoleName = "SignerThree";
            recipient3.ID = "3";

            return new DocuSignWeb.Recipient[] { recipient1, recipient2, recipient3};
        }


        /// <summary>
        /// Create a basic envelope without sending
        /// </summary>
        /// <param name="accountId">user's account ID</param>
        /// <param name="subject">email subject line</param>
        /// <returns></returns>
        internal static DocuSignWeb.Envelope CreateBasicEnvelope(String accountId, String subject)
        {
            DocuSignWeb.Recipient[] recipients = HeartbeatTests.CreateOneSigner();

            int nextRecipientId = 1;
            foreach (DocuSignWeb.Recipient recipient in recipients)
            {
                recipient.ID = nextRecipientId.ToString(System.Globalization.CultureInfo.InvariantCulture);
                nextRecipientId++;
            }
            DocuSignWeb.Envelope envelope = new DocuSignWeb.Envelope();
            envelope.Subject = subject;
            envelope.EmailBlurb = "testing docusign creation services";
            envelope.Recipients = recipients;
            envelope.AccountId = accountId;
            return envelope;
        }

        /// <summary>
        /// Create a basic envelope with documents and tabs in preparation for sending
        /// </summary>
        /// <param name="envelope">already created envelope</param>
        /// <returns>updated envelope</returns>
        internal static DocuSignWeb.Envelope CreateEnvelopeWithDocumentAndTabs(DocuSignWeb.Envelope envelope)
        {
            envelope.Documents = new DocuSignWeb.Document[1];
            DocuSignWeb.Document doc = new DocuSignWeb.Document();
            doc.ID = "1";
            doc.Name = "Picture PDF";
            doc.PDFBytes = Resource.picturePdf;
            Assert.IsNotNull(doc.PDFBytes);
            envelope.Documents[0] = doc;
            DocuSignWeb.Tab tab = new DocuSignWeb.Tab();
            tab.DocumentID = "1";
            tab.RecipientID = "1";
            tab.Type = DocuSignWeb.TabTypeCode.SignHere;
            tab.PageNumber = "1";
            tab.XPosition = "100";
            tab.YPosition = "100";
            envelope.Tabs = new DocuSignWeb.Tab[1];
            envelope.Tabs[0] = tab;
            return envelope;
        }

        /// <summary>
        /// Void a specific envelope
        /// </summary>
        /// <param name="envelopeID">envelope ID</param>
        /// <param name="apiClient">API proxy</param>
        /// <returns></returns>
        internal static DocuSignWeb.VoidEnvelopeStatus VoidEnvelope(String envelopeID, DocuSignWeb.APIServiceSoapClient apiClient)
        {
            return apiClient.VoidEnvelope(envelopeID, "void envelope test");
        }

        /// <summary>
        /// Purge the documents from a specific envelope
        /// </summary>
        /// <param name="envelopeID">envelope ID</param>
        /// <param name="apiClient">API proxy</param>
        /// <returns></returns>
        internal static DocuSignWeb.PurgeDocumentStatus PurgeEnvelope(String envelopeID, DocuSignWeb.APIServiceSoapClient apiClient)
        {
            return apiClient.PurgeDocuments(envelopeID);
        }
    }
}