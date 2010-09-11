using System;
using System.Collections.Generic;
using System.Text;
using System.Security.Cryptography.X509Certificates;
using System.Xml;
using Microsoft.Web.Services3;
using Microsoft.Web.Services3.Design;
using Microsoft.Web.Services3.Security;
using Microsoft.Web.Services3.Security.Tokens;
namespace Signing
{
    public class DocuSignCertificateLevelSecurityAssertion:SecurityPolicyAssertion
    {
        public string username;
        public string password;
        public StoreLocation storeLocation;
        public StoreName storeName;
        public X509FindType findByType;
        public string findByValue;


        public DocuSignCertificateLevelSecurityAssertion(string username, string password, string storeLocation, string storeName, string findByType, string findByValue)
        {
            this.username = username;
            this.password = password;
            this.storeLocation = (StoreLocation) Enum.Parse(typeof(StoreLocation), storeLocation);
            this.storeName = (StoreName)Enum.Parse(typeof(StoreName), storeName);
            this.findByType = (X509FindType) Enum.Parse(typeof(X509FindType), findByType);
            this.findByValue = findByValue;
        }
        public DocuSignCertificateLevelSecurityAssertion()
        {
        }

        public override SoapFilter CreateClientOutputFilter(FilterCreationContext context)
        {
            return new DocuSignCertificateLevelSecurityOutputFilter(this, context);
        }
        public override SoapFilter CreateClientInputFilter(FilterCreationContext context)
        {
            return null;
        }
        public override SoapFilter CreateServiceInputFilter(FilterCreationContext context)
        {
            throw new NotImplementedException();
        }
        public override SoapFilter CreateServiceOutputFilter(FilterCreationContext context)
        {
            throw new NotImplementedException();
        }
        public override void ReadXml(XmlReader reader, IDictionary<string, Type> extensions)
        {
            // set properties on the assertion by reading them from the xml config file
            //  
            if (reader == null)
                throw new ArgumentNullException("reader");
            if (extensions == null)
                throw new ArgumentNullException("extensions");
            this.username = reader.GetAttribute("username");
            this.password = reader.GetAttribute("password");
            this.storeLocation = (StoreLocation)Enum.Parse(typeof(StoreLocation), reader.GetAttribute("storeLocation"));
            this.storeName = (StoreName)Enum.Parse(typeof(StoreName), reader.GetAttribute("storeName"));
            this.findByType = (X509FindType)Enum.Parse(typeof(X509FindType), reader.GetAttribute("findByType"));
            this.findByValue = reader.GetAttribute("findByValue");

            bool isEmpty = reader.IsEmptyElement;

            reader.ReadStartElement("DocuSignCertificateLevelSecurityAssertion");
            if (!isEmpty)
            {
                reader.Skip();
            }
        }
        public override IEnumerable<KeyValuePair<string, Type>> GetExtensions()
        {
            return new KeyValuePair<string, Type>[] { new KeyValuePair<string, Type>("DocuSignCertificateLevelSecurityAssertion", this.GetType()) };
        }

    }
    public class DocuSignCertificateLevelSecurityOutputFilter : SendSecurityFilter
    {
        DocuSignCertificateLevelSecurityAssertion parentAssertion;
        FilterCreationContext filterContext;

        public DocuSignCertificateLevelSecurityOutputFilter(DocuSignCertificateLevelSecurityAssertion parentAssertion, FilterCreationContext filterContext)
            : base(parentAssertion.ServiceActor, true, parentAssertion.ClientActor)
        {
            this.parentAssertion = parentAssertion;
            this.filterContext = filterContext;
        }
        public override void SecureMessage(SoapEnvelope envelope, Security security)
        {
            // create username token from properties on parentAssertion
            UsernameToken tok = new UsernameToken(
                this.parentAssertion.username, 
                this.parentAssertion.password, 
                PasswordOption.SendPlainText);
            security.Tokens.Add(tok);

            X509Certificate2 cert = null;
            // find a certificate using properties on parentAssertion
            X509SecurityToken securityToken = null;
            X509Store store = new X509Store(parentAssertion.storeName, parentAssertion.storeLocation);
            store.Open(OpenFlags.ReadOnly);
            X509Certificate2Collection certs = store.Certificates.Find(parentAssertion.findByType, parentAssertion.findByValue, false);

            if (certs.Count == 1)
            {
                cert = certs[0];
            }
            else if (certs.Count > 1)
            {
                // Depending on how you search for the cert, you may get back more than one.
                // we'll use the first one, but in real life you would need to 
                // figure out which cert to use via some amazing feats of deduction
                cert = certs[0];
            }
            
            if (null != cert)
            {
                securityToken = new X509SecurityToken(cert);
            }
            else
            {
                throw new Exception("Can't find the certificate needed for this sample code!");
            }

            security.Tokens.Add(securityToken);
            security.Elements.Add(new MessageSignature(securityToken));
 
        }
    }

}
