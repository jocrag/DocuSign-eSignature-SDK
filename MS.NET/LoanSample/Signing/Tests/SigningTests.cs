//
// DocuSign in session code sample.
//
// Copyright (c) DocuSign, Inc.
//
using System;
using System.IO;
using System.Collections.Generic;
using System.Globalization;
using NUnit.Framework;
using System.Diagnostics.CodeAnalysis;
using System.Configuration;

namespace Signing.Tests
{
    [TestFixture]
    [SuppressMessage("Microsoft.Performance", "CA1822:MarkMembersAsStatic")]
    public class SendingTests
    {
        /// <summary>
        /// A simple construct of one test signer
        /// </summary>
        internal static DocuSignWeb.Recipient[] CreateOneSigner()
        {
            DocuSignWeb.Recipient[] signers = { new DocuSignWeb.Recipient()};
            signers[0].Email = "mike.borozdin@docusign.com";
            signers[0].UserName = "Mike Borozdin";
            signers[0].Type = DocuSignWeb.RecipientTypeCode.Signer; 
            return signers;
        }

        internal static AccountCredentials DefaultCredentials
        {
            get
            {
                AccountCredentials credentials = new AccountCredentials();
                credentials.ApiUrl = Properties.Settings.Default.APIUrl;
                credentials.AccountId = Properties.Settings.Default.APIAccountId;
                return credentials;
            }
        }

        internal static LinkedTab[] OneTabArray(DocuSignWeb.Recipient signer)
        {
            LinkedTab[] ret = { OneTab(signer) };
            return ret;
        }

        internal static LinkedTab OneTab(DocuSignWeb.Recipient signer)
        {
            LinkedTab ret = new LinkedTab();
            ret.Recipient = signer;
            ret.Tab.Type = DocuSignWeb.TabTypeCode.SignHere;
            ret.Tab.PageNumber = Convert.ToString("1", CultureInfo.InvariantCulture);
            ret.Tab.XPosition = Convert.ToString("100", CultureInfo.InvariantCulture);
            ret.Tab.YPosition = Convert.ToString("300", CultureInfo.InvariantCulture);
            return ret;
        }


        internal static LinkedTab OneDateTab(DocuSignWeb.Recipient signer)
        {
            LinkedTab ret = new LinkedTab();
            ret.Recipient = signer;
            ret.Tab.Type = DocuSignWeb.TabTypeCode.DateSigned;
            ret.Tab.PageNumber = Convert.ToString("1", CultureInfo.InvariantCulture);
            ret.Tab.XPosition = Convert.ToString("200", CultureInfo.InvariantCulture);
            ret.Tab.YPosition = Convert.ToString("400", CultureInfo.InvariantCulture);
            return ret;
        }

        internal static LinkedTab OneFullNameTab(DocuSignWeb.Recipient signer)
        {
            LinkedTab ret = new LinkedTab();
            ret.Recipient = signer;
            ret.Tab.Type = DocuSignWeb.TabTypeCode.FullName;
            ret.Tab.PageNumber = Convert.ToString("1", CultureInfo.InvariantCulture);
            ret.Tab.XPosition = Convert.ToString("250", CultureInfo.InvariantCulture);
            ret.Tab.YPosition = Convert.ToString("450", CultureInfo.InvariantCulture);
            return ret;
        }

        internal static LinkedTab OneCheckBox(DocuSignWeb.Recipient signer)
        {
            LinkedTab ret = new LinkedTab();
            ret.Recipient = signer;
            ret.Tab.Type = DocuSignWeb.TabTypeCode.Custom;
            ret.Tab.Name = "The Name";
            ret.Tab.TabLabel = "This goes into the tooltip";
            ret.Tab.Value = "X";
            ret.Tab.CustomTabType = Signing.DocuSignWeb.CustomTabType.Checkbox;
            ret.Tab.CustomTabTypeSpecified = true;
            ret.Tab.CustomTabLocked = false;
            ret.Tab.CustomTabLockedSpecified = true;
            ret.Tab.PageNumber = Convert.ToString("1", CultureInfo.InvariantCulture);
            ret.Tab.XPosition = Convert.ToString("300", CultureInfo.InvariantCulture);
            ret.Tab.YPosition = Convert.ToString("500", CultureInfo.InvariantCulture);
            return ret;
        }

        internal static LinkedTab OneRadioTab0(DocuSignWeb.Recipient signer)
        {
            LinkedTab ret = new LinkedTab();
            ret.Recipient = signer;
            ret.Tab.Type = DocuSignWeb.TabTypeCode.Custom;
            ret.Tab.Name = "Radio1";
            ret.Tab.TabLabel = "This goes into the tooltip";
            ret.Tab.Value = "";
            ret.Tab.CustomTabType = Signing.DocuSignWeb.CustomTabType.Radio;
            ret.Tab.CustomTabTypeSpecified = true;
            ret.Tab.CustomTabLocked = false;
            ret.Tab.CustomTabLockedSpecified = true;
            ret.Tab.CustomTabRadioGroupName = "Radio Group #1";
            ret.Tab.PageNumber = Convert.ToString("1", CultureInfo.InvariantCulture);
            ret.Tab.XPosition = Convert.ToString("350", CultureInfo.InvariantCulture);
            ret.Tab.YPosition = Convert.ToString("550", CultureInfo.InvariantCulture);
            return ret;
        }

        internal static LinkedTab OneRadioTab1(DocuSignWeb.Recipient signer)
        {
            LinkedTab ret = new LinkedTab();
            ret.Recipient = signer;
            ret.Tab.Type = DocuSignWeb.TabTypeCode.Custom;
            ret.Tab.Name = "Radio2";
            ret.Tab.TabLabel = "This goes into the tooltip";
            ret.Tab.Value = "";
            ret.Tab.CustomTabType = Signing.DocuSignWeb.CustomTabType.Radio;
            ret.Tab.CustomTabTypeSpecified = true;
            ret.Tab.CustomTabLocked = false;
            ret.Tab.CustomTabLockedSpecified = true;
            ret.Tab.CustomTabRadioGroupName = "Radio Group #1";
            ret.Tab.PageNumber = Convert.ToString("1", CultureInfo.InvariantCulture);
            ret.Tab.XPosition = Convert.ToString("380", CultureInfo.InvariantCulture);
            ret.Tab.YPosition = Convert.ToString("550", CultureInfo.InvariantCulture);
            return ret;
        }

        internal static LinkedDocument[] LoadPicturePdf(DocuSignWeb.Recipient signer)
        {
            LinkedDocument[] docs = { new LinkedDocument() };
            docs[0].Document.Name = "Picture PDF";
            docs[0].Document.PDFBytes = resources.picturePdf;
            docs[0].Tabs = new LinkedTab[] { 
                OneTab(signer), OneDateTab(signer), OneFullNameTab(signer), 
                OneRadioTab0(signer), OneRadioTab1(signer),
                OneCheckBox(signer) };
            return docs; 
        }

        [Test]
        public void SendForSignature()
        {
            DocuSignWeb.Recipient[] recipients = CreateOneSigner();
            Envelope envelope = Envelope.CreateAndSendEnvelope(DefaultCredentials, recipients, LoadPicturePdf(recipients[0]),
                "SendForSignature unit test", "testing docusign signing services");
            Assert.IsNotNull(envelope);
        }

        [Test]
        public void SendWithIDCheck()
        {
            DocuSignWeb.Recipient[] recipients = CreateOneSigner();
            recipients[0].RequireIDLookup = true;
            recipients[0].IDCheckInformationInput = new DocuSignWeb.IDCheckInformationInput();
            recipients[0].IDCheckInformationInput.AddressInformationInput = new Signing.DocuSignWeb.AddressInformationInput();
            recipients[0].IDCheckInformationInput.AddressInformationInput.AddressInformation = new Signing.DocuSignWeb.AddressInformation();
            recipients[0].IDCheckInformationInput.AddressInformationInput.AddressInformation.Street1 = "1333 Wexford";
            recipients[0].IDCheckInformationInput.AddressInformationInput.AddressInformation.Street2 = "2A";
            recipients[0].IDCheckInformationInput.AddressInformationInput.AddressInformation.City = "Fantasy Island";
            recipients[0].IDCheckInformationInput.AddressInformationInput.AddressInformation.Zip = "60750";
            recipients[0].IDCheckInformationInput.AddressInformationInput.AddressInformation.State = "IL";


            recipients[0].IDCheckInformationInput.DOBInformationInput = new Signing.DocuSignWeb.DOBInformationInput();
            recipients[0].IDCheckInformationInput.DOBInformationInput.DOBInformation = new Signing.DocuSignWeb.DOBInformation();
            recipients[0].IDCheckInformationInput.DOBInformationInput.DOBInformation.DOB = new DateTime(1980, 01, 01);

            recipients[0].IDCheckInformationInput.SSN4InformationInput= new Signing.DocuSignWeb.SSN4InformationInput();
            recipients[0].IDCheckInformationInput.SSN4InformationInput.SSN4Information = new Signing.DocuSignWeb.SSN4Information();
            recipients[0].IDCheckInformationInput.SSN4InformationInput.SSN4Information.SSN4 = "9512";

            Envelope envelope = Envelope.CreateAndSendEnvelope(DefaultCredentials, recipients, LoadPicturePdf(recipients[0]),
                "SendForSignature with id check unit test", "testing docusign signing services");
            Assert.IsNotNull(envelope);
        }
    }

    [TestFixture]
    public class SentEnvelopeTests
    {
        Envelope _envelope;

        [TestFixtureSetUp]
        public void FixtureSetup()
        {
            DocuSignWeb.Recipient[] recipients = SendingTests.CreateOneSigner();
            _envelope = Envelope.CreateAndSendEnvelope(SendingTests.DefaultCredentials, recipients, SendingTests.LoadPicturePdf(recipients[0]),
                "SendForSignature unit test", "testing docusign signing services");
            Assert.IsNotNull(_envelope);
        }

        [Test]
        public void RetrievePdfBytes()
        {
            byte[] retrievedPdfBytes = _envelope.RetrievePdfBytes();
            Assert.IsNotNull(retrievedPdfBytes);
            Assert.IsFalse(retrievedPdfBytes.Length <= 0);
        }

        [Test]
        public void RetrieveStatus()
        {
            DocuSignWeb.EnvelopeStatusCode status = _envelope.RetrieveStatus();
            Assert.AreEqual(status, DocuSignWeb.EnvelopeStatusCode.Sent);
        }
    }

    [TestFixture]
    public class InSession
    {
        Envelope _envelope;
        readonly string _captiveInfoClientId = "testing1234";
        DocuSignWeb.Recipient[] _recipients;

        [TestFixtureSetUp]
        public void FixtureSetup()
        {
            _recipients = SendingTests.CreateOneSigner();
            _recipients[0].CaptiveInfo = new DocuSignWeb.RecipientCaptiveInfo();
            _recipients[0].CaptiveInfo.ClientUserId = _captiveInfoClientId;

            _envelope = Envelope.CreateAndSendEnvelope(SendingTests.DefaultCredentials, _recipients, SendingTests.LoadPicturePdf(_recipients[0]),
                "SendForSignature unit test", "testing docusign signing services");
            Assert.IsNotNull(_envelope);
        }

        public static DocuSignWeb.RequestRecipientTokenAuthenticationAssertion CreateAssertion()
        {
            DocuSignWeb.RequestRecipientTokenAuthenticationAssertion assert = new DocuSignWeb.RequestRecipientTokenAuthenticationAssertion();
            //Normally, the AssertionID would reflect back to some identifiable authentication instance.  
            //In this demo, however, we just use the timestamp

            //ToDo: try catch.  check for auth instant null, set to now.
            assert.AssertionID = System.DateTime.Now.Ticks.ToString(CultureInfo.InvariantCulture);
            assert.AuthenticationInstant = System.DateTime.Now;
            assert.AuthenticationMethod = DocuSignWeb.RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.Password;
            assert.SecurityDomain = "dsx.test";
            return assert;
        }

        [Test]
        public void RequestTokenRequestRecipientToken()
        {
            string token = _envelope.RequestRecipientToken(
                _recipients[0],
                CreateAssertion(), 
                Envelope.StandardUrls(new System.Uri("https://somebase.dsx.test/callback.aspx", UriKind.Absolute),
                "Mike B"));
            Assert.IsNotEmpty(token);
            Console.Out.WriteLine("The token is: " + token);
        }
    }

    [TestFixture]
    public class VoidingTests
    {
        Envelope _envelope;

        [SetUp]
        public void FixtureSetup()
        {
            DocuSignWeb.Recipient[] recipients = SendingTests.CreateOneSigner();
            _envelope = Envelope.CreateAndSendEnvelope(SendingTests.DefaultCredentials, recipients, SendingTests.LoadPicturePdf(recipients[0]),
                "SendForSignature unit test", "testing docusign signing services");
            Assert.IsNotNull(_envelope);
        }

        [Test]
        public void VoidAndTestStatus()
        {
            DocuSignWeb.EnvelopeStatusCode status = _envelope.RetrieveStatus();
            Assert.AreEqual(status, DocuSignWeb.EnvelopeStatusCode.Sent);
            _envelope.Void("voiding");
            status = _envelope.RetrieveStatus();
            Assert.AreEqual(status, DocuSignWeb.EnvelopeStatusCode.Voided);
        }


        [Test]
        public void Void()
        {
            _envelope.Void("testing");
        }
    }

    [TestFixture]
    public class CustomFieldsTests
    {
        Envelope _envelope;

        [SetUp]
        public void FixtureSetup()
        {
        }

        [Test]
        public void Field()
        {
            DocuSignWeb.Recipient[] recipients = SendingTests.CreateOneSigner();
            DocuSignWeb.CustomField[] fields = new DocuSignWeb.CustomField[1];
            fields[0] = new DocuSignWeb.CustomField();
            fields[0].Name = "Form ID";
            fields[0].Required = "False";
            fields[0].Show = "False";
            fields[0].Value = "1234";

            _envelope = Envelope.CreateAndSendEnvelope(SendingTests.DefaultCredentials, recipients, SendingTests.LoadPicturePdf(recipients[0]),
                "SendForSignature unit test", "testing docusign signing services", fields);
            Assert.IsNotNull(_envelope);

            DocuSignWeb.EnvelopeStatus status = _envelope.RetrieveFullStatus();
            Assert.IsNotNull(status);
            Assert.AreEqual("1234", status.CustomFields[0].Value);
        }

        [Test]
        public void Attachment()
        {
            System.Text.ASCIIEncoding enc = new System.Text.ASCIIEncoding();
            DocuSignWeb.Recipient[] recipients = SendingTests.CreateOneSigner();
            DocuSignWeb.Attachment attachment = new DocuSignWeb.Attachment();
            attachment.Label = "Label1";
            attachment.Data = enc.GetBytes("Data");
            attachment.Type = "String";

            _envelope = Envelope.CreateAndSendEnvelope(SendingTests.DefaultCredentials, recipients, SendingTests.LoadPicturePdf(recipients[0]),
                "SendForSignature unit test", "testing docusign signing services", null, new DocuSignWeb.Attachment[] { attachment } );
            Assert.IsNotNull(_envelope);

            DocuSignWeb.EnvelopeStatus status = _envelope.RetrieveFullStatus();

            Assert.IsNotNull(status);
            Assert.IsNotNull(status.EnvelopeAttachment);
            Assert.IsTrue(status.EnvelopeAttachment.Length > 0);
            Assert.IsNotNull(status.EnvelopeAttachment[0].Data);
            Assert.AreEqual(enc.GetString(status.EnvelopeAttachment[0].Data), "Data");
        }

    }
}
