//
// DocuSign in session code sample.
//
// Copyright (c) DocuSign, Inc.
//
using System;
using System.Collections.Generic;
using System.Text;
using NUnit.Framework;
using System.Globalization;
using System.Diagnostics.CodeAnalysis;

namespace Signing.Tests
{
    [TestFixture]
    [SuppressMessage("Microsoft.Performance", "CA1822:MarkMembersAsStatic")]
    public class HelperFunctionTest
    {
        /// <summary>
        /// test out the helper function that creates a custom tab.
        /// </summary>
        [Test]
        public void TestCustomTab()
        {
            string name = "AddressLine1";
            string value = "1234 Victoria Lane";
            int pageNumber = 1;
            int XPosition = 200;
            int YPosition = 300;

            LinkedTab tab = LinkedTab.CreateTab(SendingTests.CreateOneSigner()[0],
                name, value, pageNumber, XPosition, YPosition);
            Assert.IsNotNull(tab);
            Assert.AreEqual(name, tab.Tab.Name);
            Assert.AreEqual(value, tab.Tab.Value);
            Assert.AreEqual(pageNumber.ToString(CultureInfo.InvariantCulture), tab.Tab.PageNumber);
            Assert.AreEqual(XPosition.ToString(CultureInfo.InvariantCulture), tab.Tab.XPosition);
            Assert.AreEqual(YPosition.ToString(CultureInfo.InvariantCulture), tab.Tab.YPosition);
            Assert.AreEqual(DocuSignWeb.TabTypeCode.Custom, tab.Tab.Type);
        }


        /// <summary>
        /// test out the helper function that creates a standard tab.
        /// </summary>
        [Test]
        public void TestSignerTab()
        {
            int pageNumber = 1;
            int XPosition = 200;
            int YPosition = 300;

            LinkedTab tab = LinkedTab.CreateTab(DocuSignWeb.TabTypeCode.SignHere,
                SendingTests.CreateOneSigner()[0],
                pageNumber, XPosition, YPosition);
            Assert.IsNotNull(tab);
            Assert.AreEqual(pageNumber.ToString(CultureInfo.InvariantCulture), tab.Tab.PageNumber);
            Assert.AreEqual(XPosition.ToString(CultureInfo.InvariantCulture), tab.Tab.XPosition);
            Assert.AreEqual(YPosition.ToString(CultureInfo.InvariantCulture), tab.Tab.YPosition);
            Assert.AreEqual(DocuSignWeb.TabTypeCode.SignHere, tab.Tab.Type);
        }

        /// <summary>
        /// test out the helper function that creates a standard tab.
        /// </summary>
        [Test]
        public void TestInitialTab()
        {
            int pageNumber = 1;
            int XPosition = 200;
            int YPosition = 300;

            LinkedTab tab = LinkedTab.CreateTab(DocuSignWeb.TabTypeCode.InitialHere,
                SendingTests.CreateOneSigner()[0],
                pageNumber, XPosition, YPosition);
            Assert.IsNotNull(tab);
            Assert.AreEqual(pageNumber.ToString(CultureInfo.InvariantCulture), tab.Tab.PageNumber);
            Assert.AreEqual(XPosition.ToString(CultureInfo.InvariantCulture), tab.Tab.XPosition);
            Assert.AreEqual(YPosition.ToString(CultureInfo.InvariantCulture), tab.Tab.YPosition);
            Assert.AreEqual(DocuSignWeb.TabTypeCode.InitialHere, tab.Tab.Type);
        }

        [Test]
        public void TestAnchorTab()
        {
            int XOffset = 200;
            int YOffset = 300;
            string anchor = "Sign here:";

            LinkedTab tab = LinkedTab.CreateTab(DocuSignWeb.TabTypeCode.InitialHere,
                    SendingTests.CreateOneSigner()[0], anchor, XOffset, YOffset);
            Assert.IsNotNull(tab);
            Assert.AreEqual((double)XOffset, tab.Tab.AnchorTabItem.XOffset);
            Assert.AreEqual((double)YOffset, tab.Tab.AnchorTabItem.YOffset);
            Assert.AreEqual(DocuSignWeb.TabTypeCode.InitialHere, tab.Tab.Type);
        }

        [Test]
        public void TestCustomAnchorTab()
        { 
            int XOffset = 200;
            int YOffset = 300;
            string anchor = "Address:";
            string name = "AddressLine1";
            string value = "1234 Victoria Lane";

            LinkedTab tab = LinkedTab.CreateTab(
                    SendingTests.CreateOneSigner()[0],
                    name, value, anchor, XOffset, YOffset);
            Assert.IsNotNull(tab);
            Assert.AreEqual(name, tab.Tab.Name);
            Assert.AreEqual(value, tab.Tab.Value);
            Assert.AreEqual((double)XOffset, tab.Tab.AnchorTabItem.XOffset);
            Assert.AreEqual((double)YOffset, tab.Tab.AnchorTabItem.YOffset);
            Assert.AreEqual(DocuSignWeb.TabTypeCode.Custom, tab.Tab.Type);
        }
    }
}
