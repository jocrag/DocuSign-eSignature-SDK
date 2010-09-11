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
using Microsoft.SharePoint;
using Microsoft.SharePoint.Administration;
using System.Collections.ObjectModel;
using System.Net;
using System.Configuration;
using System.Web.Configuration;
using System.Xml;

namespace DocuSignSignature.WebConfigModification
{
    public class FeatureReceiver: SPFeatureReceiver
    {
        private const string WebConfigModificationOwner = "WebConfigModification";

        SPSite spSite = null;
        SPWebApplication webApp = null;
        XmlNode nodeServiceModel = null;
        XmlNode nodeSmtpServer = null;
        XmlNode nodeUserName = null;
        XmlNode nodePassword =null;
        XmlDocument doc = null;
        SPWebService spWebService = null;
        SPWeb spWeb = null;

        // Change these constants as needed.
        const string    SMTP_SERVER = "PleaseProvideYourSMTPServerHere",
                        DOCUSIGN_USERNAME = "demo@DocuSign.com",
                        DOCUSIGN_PASSWORD = "demoPassword";

        public override void FeatureInstalled(SPFeatureReceiverProperties properties)
        {
            // Please do not delete this method.
        }

        public override void FeatureUninstalling(SPFeatureReceiverProperties properties)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Make modifications to the web.config when the feature is activated.
        /// </summary>
        /// <param name="properties"></param>
        public override void FeatureActivated(SPFeatureReceiverProperties properties)
        {
            spSite = (SPSite)properties.Feature.Parent;
            spWeb = spSite.OpenWeb();
            spWebService = SPWebService.ContentService;

            Configuration config = WebConfigurationManager.OpenWebConfiguration("/", spSite.WebApplication.Name);
            string smtpServer = string.Empty;
            string configFilePath = config.FilePath;
            doc = new XmlDocument();
            doc.Load(configFilePath);
            AppSettingsSection appSettings = config.AppSettings;

            if (appSettings.ElementInformation.IsPresent)
            {
                nodeSmtpServer = doc.SelectSingleNode("configuration/appSettings/add[@key='smtpServer']");
                nodeUserName = doc.SelectSingleNode("configuration/appSettings/add[@key='docuSignUserName']");
                nodePassword = doc.SelectSingleNode("configuration/appSettings/add[@key='docuSignPassword']");

                // Add smtpServer to web.config file
                if(nodeSmtpServer == null)
                    ModifyWebConfigData("add[@key='SMTPServer']", "configuration/appSettings", "<add key='smtpServer' value='" + SMTP_SERVER + "' />");

                // Add DocuSign Service user Credentials to web.config file
                if (nodeUserName == null)
                    ModifyWebConfigData("add[@key='userName']", "configuration/appSettings", "<add key='docuSignUserName' value='" + DOCUSIGN_USERNAME + "' />");

                // Add Profiles to web.config file
                if(nodePassword == null)
                    ModifyWebConfigData("add[@key='password']", "configuration/appSettings", "<add key='docuSignPassword' value='" + DOCUSIGN_PASSWORD + "' />");
            }
            else
                ModifyWebConfigData("add[@key='SMTPServer']", "configuration", "<appSettings><add key='smtpServer' value='" + SMTP_SERVER + "' /><add key='docuSignUserName' value='" + DOCUSIGN_USERNAME + "' /><add key='docuSignPassword' value='" + DOCUSIGN_PASSWORD + "' /></appSettings>");

            nodeServiceModel = doc.SelectSingleNode("configuration/system.serviceModel");

            // Add ServiceModel to web.config file
            if(nodeServiceModel == null)
                ModifyWebConfigData("ServiceModel", "configuration", GetServiceModelTag());

            XmlNode nodeTrust = null;
            XmlNode nodeEnableSessionState = null;
            nodeTrust = doc.SelectSingleNode("configuration/system.web/trust");
            nodeEnableSessionState = doc.SelectSingleNode("configuration/system.web/pages");

            if (nodeEnableSessionState != null)
            {
                XmlAttribute attributeEnableSessionState = nodeEnableSessionState.Attributes["enableSessionState"];
                if (attributeEnableSessionState != null)
                {
                    attributeEnableSessionState.Value = "true";
                }
            }

            // Set the level attribute to WSS_Minimal
            if (nodeTrust != null)
            {
                XmlAttribute attributeLevel = nodeTrust.Attributes["level"];
                if (attributeLevel != null)
                {
                    attributeLevel.Value = "Full";
                }
            }
            doc.Save(configFilePath);
            ModifyWebConfigData("add[@name='Session']", "configuration/system.web/httpModules", "<add name='Session' type='System.Web.SessionState.SessionStateModule' />");
            
            spWebService.Update();
            spWebService.ApplyWebConfigModifications();
        }

        /// <summary>
        /// Adding the DocuSign webservice information to the web.config
        /// </summary>
        /// <returns></returns>
        protected string GetServiceModelTag()
        {
            StringBuilder serviceModel = new StringBuilder();

            serviceModel.Append("<system.serviceModel><behaviors><endpointBehaviors><behavior name='EndPointBehavior1'><clientCredentials>");
            serviceModel.Append("<clientCertificate findValue='06 d1 91' x509FindType='FindBySerialNumber'/></clientCredentials></behavior>");
            serviceModel.Append("</endpointBehaviors></behaviors><bindings><basicHttpBinding><binding name='CredentialSoap' closeTimeout='00:01:00' openTimeout='00:01:00' receiveTimeout='infinite' sendTimeout='00:01:00' allowCookies='false' bypassProxyOnLocal='false' hostNameComparisonMode='StrongWildcard' maxBufferSize='65536' maxBufferPoolSize='524288' maxReceivedMessageSize='65536' messageEncoding='Text' textEncoding='utf-8' transferMode='Buffered' useDefaultWebProxy='true'>");
            serviceModel.Append("<readerQuotas maxDepth='32' maxStringContentLength='8192' maxArrayLength='16384' maxBytesPerRead='4096' maxNameTableCharCount='16384'/>");
            serviceModel.Append("<security mode='Transport'><transport clientCredentialType='None' proxyCredentialType='None' realm=''/>");
            serviceModel.Append("<message clientCredentialType='UserName' algorithmSuite='Default'/></security></binding>");
            serviceModel.Append("<binding name='CredentialSoap1' closeTimeout='00:01:00' openTimeout='00:01:00' receiveTimeout='infinite' sendTimeout='00:01:00' allowCookies='false' bypassProxyOnLocal='false' hostNameComparisonMode='StrongWildcard' maxBufferSize='65536' maxBufferPoolSize='524288' maxReceivedMessageSize='65536' messageEncoding='Text' textEncoding='utf-8' transferMode='Buffered' useDefaultWebProxy='true'>");
            serviceModel.Append("<readerQuotas maxDepth='32' maxStringContentLength='8192' maxArrayLength='16384' maxBytesPerRead='4096' maxNameTableCharCount='16384'/>");
            serviceModel.Append("<security mode='None'><transport clientCredentialType='None' proxyCredentialType='None' realm=''/><message clientCredentialType='UserName' algorithmSuite='Default'/>");
            serviceModel.Append("</security></binding><binding name='APIServiceSoap' closeTimeout='00:01:00' openTimeout='00:01:00' receiveTimeout='infinite' sendTimeout='00:01:00' allowCookies='true' bypassProxyOnLocal='false' hostNameComparisonMode='StrongWildcard' maxBufferSize='5097151' maxBufferPoolSize='524288' maxReceivedMessageSize='5097151' messageEncoding='Text' textEncoding='utf-8' transferMode='Buffered' useDefaultWebProxy='true'>");
            serviceModel.Append("<readerQuotas maxDepth='32' maxStringContentLength='8192' maxArrayLength='16384' maxBytesPerRead='4096' maxNameTableCharCount='16384'/>");
            serviceModel.Append("<security mode='TransportWithMessageCredential'><transport clientCredentialType='None' proxyCredentialType='None' realm=''/>");
            serviceModel.Append("<message clientCredentialType='UserName' algorithmSuite='Default'/></security></binding></basicHttpBinding><customBinding>");
            serviceModel.Append("<binding name='APIServiceSoap1' closeTimeout='00:01:00' openTimeout='00:01:00' receiveTimeout='infinite' sendTimeout='00:01:00'>");
            serviceModel.Append("<textMessageEncoding messageVersion='Soap12WSAddressingAugust2004'/><security authenticationMode='CertificateOverTransport' securityHeaderLayout='Lax'>");
            serviceModel.Append("<secureConversationBootstrap/></security><httpsTransport/></binding></customBinding></bindings><client>");
            serviceModel.Append("<endpoint address='https://demo.docusign.net/api/3.0/credential.asmx' binding='basicHttpBinding' bindingConfiguration='CredentialSoap' contract='CredentialService.CredentialSoap' name='CredentialSoap'/>");
            serviceModel.Append("<endpoint address='https://demo.docusign.net/api/3.0/api.asmx' binding='basicHttpBinding' bindingConfiguration='APIServiceSoap' contract='APIService.APIServiceSoap' name='APIServiceSoap'/>");
            serviceModel.Append("<endpoint address='https://demo.docusign.net/api/3.0/api.asmx' behaviorConfiguration='EndPointBehavior1' binding='customBinding' bindingConfiguration='APIServiceSoap1' contract='DocuSignWeb.APIServiceSoap' name='APIServiceSoap1'>");
            serviceModel.Append("<identity><certificateReference x509FindType='FindBySerialNumber' findValue=''/></identity></endpoint></client></system.serviceModel>");

            return serviceModel.ToString();
        }
        /// <summary>
        /// Modifies Web.Config file
        /// </summary>
        /// <param name="name">Node Name</param>
        /// <param name="path">Location of the Node in Web.Config file</param>
        /// <param name="isAttribute">Attribute of the Node</param>
        /// <param name="content">Content to add in the Web.Config file</param>
        /// <param name="smtpServer">SMTP Server Name</param>
        private void ModifyWebConfigData (string name, string path, string content)
        {
            SPWebConfigModification myModification = new SPWebConfigModification(name, path);

            myModification.Sequence = 0;
            myModification.Owner = WebConfigModificationOwner;
            myModification.Type = SPWebConfigModification.SPWebConfigModificationType.EnsureChildNode;
            myModification.Value = content;

            spWeb.Site.WebApplication.WebConfigModifications.Add(myModification);
        }

        /// <summary>
        /// Reverting Web.config changes made for the DocuSign Feature on deactivation
        /// </summary>
        /// <param name="properties"></param>
        public override void FeatureDeactivating(SPFeatureReceiverProperties properties)
        {
            spSite = (SPSite)properties.Feature.Parent;
            spWeb = spSite.OpenWeb();
            webApp = spWeb.Site.WebApplication; 
            spWebService = SPWebService.ContentService;

            Configuration config = WebConfigurationManager.OpenWebConfiguration("/", spSite.WebApplication.Name);
            string configFilePath = config.FilePath;
            doc = new XmlDocument();
            XmlNode nodeTrust = null;
            XmlNode nodeEnableSessionState = null;
            doc.Load(configFilePath);
            
            nodeServiceModel = doc.SelectSingleNode("configuration/system.serviceModel");
            nodeSmtpServer = doc.SelectSingleNode("configuration/appSettings/add[@key='smtpServer']");
            nodeUserName = doc.SelectSingleNode("configuration/appSettings/add[@key='docuSignUserName']");
            nodePassword = doc.SelectSingleNode("configuration/appSettings/add[@key='docuSignPassword']");
            nodeTrust = doc.SelectSingleNode("configuration/system.web/trust");
            nodeEnableSessionState = doc.SelectSingleNode("configuration/system.web/pages");
            //int count=0;
                        
            if (webApp != null)
            {
                    // Set the enableSessionState attribute to false 
                    if (nodeEnableSessionState != null)
                    {
                        XmlAttribute attributeEnableSessionState = nodeEnableSessionState.Attributes["enableSessionState"];
                        if (attributeEnableSessionState != null)
                        {
                            attributeEnableSessionState.Value = "false";
                        }
                    }
                    
                    // Set the level attribute to WSS_Minimal
                    if (nodeTrust != null)
                    {
                        XmlAttribute attributeLevel = nodeTrust.Attributes["level"];
                        if (attributeLevel != null)
                        {
                            attributeLevel.Value = "WSS_Minimal";
                        }
                    }

                    // Remove serviceModel node - DocuSign Webservice info
                    if (nodeServiceModel != null)
                    {
                        nodeServiceModel.ParentNode.RemoveChild(nodeServiceModel);
                    }

                    //Remove smtpServer node
                    if (nodeSmtpServer != null)
                    {
                        nodeSmtpServer.ParentNode.RemoveChild(nodeSmtpServer);
                    }

                    //Remove Password node
                    if (nodePassword != null)
                    {
                        nodePassword.ParentNode.RemoveChild(nodePassword);
                    }

                    // Remove UserName node
                    if (nodeUserName != null)
                    {
                        nodeUserName.ParentNode.RemoveChild(nodeUserName);
                    }

                    doc.Save(configFilePath);

                    // Apply the config modifications to the application
                 
                }
            }
        }
 }
