/*
Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended for production use.
Code and policy for a production application must be developed to meet the specific data and
security requirements of the application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED
OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR
FITNESS FOR A PARTICULAR PURPOSE.
 */
package net.docusign.www.api._3_0;

/**
 * RequestRecipientTokenAuthenticationAssertionAuthenticationMethod bean class
 */

public class RequestRecipientTokenAuthenticationAssertionAuthenticationMethod implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenAuthenticationAssertionAuthenticationMethod", "ns1");

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.docusign.net/API/3.0")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * field for
     * RequestRecipientTokenAuthenticationAssertionAuthenticationMethod
     */

    protected java.lang.String localRequestRecipientTokenAuthenticationAssertionAuthenticationMethod;

    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor

    protected RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(java.lang.String value, boolean isRegisterValue) {
        localRequestRecipientTokenAuthenticationAssertionAuthenticationMethod = value;
        if (isRegisterValue) {

            _table_.put(localRequestRecipientTokenAuthenticationAssertionAuthenticationMethod, this);

        }

    }

    public static final java.lang.String _Password = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Password");

    public static final java.lang.String _Email = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Email");

    public static final java.lang.String _PaperDocuments = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PaperDocuments");

    public static final java.lang.String _HTTPBasicAuth = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("HTTPBasicAuth");

    public static final java.lang.String _SSLMutualAuth = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SSLMutualAuth");

    public static final java.lang.String _X509Certificate = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("X509Certificate");

    public static final java.lang.String _Kerberos = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Kerberos");

    public static final java.lang.String _SingleSignOn_CASiteminder = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SingleSignOn_CASiteminder");

    public static final java.lang.String _SingleSignOn_InfoCard = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SingleSignOn_InfoCard");

    public static final java.lang.String _SingleSignOn_MicrosoftActiveDirectory = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SingleSignOn_MicrosoftActiveDirectory");

    public static final java.lang.String _SingleSignOn_Passport = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SingleSignOn_Passport");

    public static final java.lang.String _SingleSignOn_SAML = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SingleSignOn_SAML");

    public static final java.lang.String _SingleSignOn_Other = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SingleSignOn_Other");

    public static final java.lang.String _Smartcard = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Smartcard");

    public static final java.lang.String _RSASecureID = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("RSASecureID");

    public static final java.lang.String _Biometric = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Biometric");

    public static final java.lang.String _None = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("None");

    public static final java.lang.String _KnowledgeBasedAuth = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("KnowledgeBasedAuth");

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod Password = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_Password, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod Email = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_Email, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod PaperDocuments = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_PaperDocuments, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod HTTPBasicAuth = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_HTTPBasicAuth, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SSLMutualAuth = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SSLMutualAuth, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod X509Certificate = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_X509Certificate, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod Kerberos = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_Kerberos, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SingleSignOn_CASiteminder = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SingleSignOn_CASiteminder, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SingleSignOn_InfoCard = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SingleSignOn_InfoCard, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SingleSignOn_MicrosoftActiveDirectory = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SingleSignOn_MicrosoftActiveDirectory, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SingleSignOn_Passport = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SingleSignOn_Passport, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SingleSignOn_SAML = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SingleSignOn_SAML, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SingleSignOn_Other = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SingleSignOn_Other, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod Smartcard = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_Smartcard, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod RSASecureID = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_RSASecureID, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod Biometric = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_Biometric, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod None = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_None, true);

    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod KnowledgeBasedAuth = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_KnowledgeBasedAuth, true);

    public java.lang.String getValue() {
        return localRequestRecipientTokenAuthenticationAssertionAuthenticationMethod;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public java.lang.String toString() {

        return localRequestRecipientTokenAuthenticationAssertionAuthenticationMethod.toString();

    }

    /**
     * isReaderMTOMAware
     * 
     * @return true if the reader supports MTOM
     */
    public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;

        try {
            isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        } catch (java.lang.IllegalArgumentException e) {
            isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
    }

    /**
     * 
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

        org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME) {

            public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.this.serialize(MY_QNAME, factory, xmlWriter);
            }
        };
        return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(MY_QNAME, factory, dataSource);

    }

    public void serialize(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory, org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        serialize(parentQName, factory, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory, org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

        // We can safely assume an element has only one type associated with it

        java.lang.String namespace = parentQName.getNamespaceURI();
        java.lang.String localName = parentQName.getLocalPart();

        if (!namespace.equals("")) {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, localName, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            } else {
                xmlWriter.writeStartElement(namespace, localName);
            }

        } else {
            xmlWriter.writeStartElement(localName);
        }

        // add the type details if this is used in a simple type
        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.docusign.net/API/3.0");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":RequestRecipientTokenAuthenticationAssertionAuthenticationMethod", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "RequestRecipientTokenAuthenticationAssertionAuthenticationMethod", xmlWriter);
            }
        }

        if (localRequestRecipientTokenAuthenticationAssertionAuthenticationMethod == null) {

            throw new org.apache.axis2.databinding.ADBException("Value cannot be null !!");

        } else {

            xmlWriter.writeCharacters(localRequestRecipientTokenAuthenticationAssertionAuthenticationMethod);

        }

        xmlWriter.writeEndElement();

    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);

        }

        xmlWriter.writeAttribute(namespace, attName, attValue);

    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */

    private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not
            // possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     * databinding method to get an XML representation of this object
     * 
     */
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

        // We can safely assume an element has only one type associated with it
        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME, new java.lang.Object[] { org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT, org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestRecipientTokenAuthenticationAssertionAuthenticationMethod) }, null);

    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {

        public static RequestRecipientTokenAuthenticationAssertionAuthenticationMethod fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
            RequestRecipientTokenAuthenticationAssertionAuthenticationMethod enumeration = (RequestRecipientTokenAuthenticationAssertionAuthenticationMethod)

            _table_.get(value);

            if (enumeration == null)
                throw new java.lang.IllegalArgumentException();
            return enumeration;
        }

        public static RequestRecipientTokenAuthenticationAssertionAuthenticationMethod fromString(java.lang.String value, java.lang.String namespaceURI) throws java.lang.IllegalArgumentException {
            try {

                return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));

            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalArgumentException();
            }
        }

        public static RequestRecipientTokenAuthenticationAssertionAuthenticationMethod fromString(javax.xml.stream.XMLStreamReader xmlStreamReader, java.lang.String content) {
            if (content.indexOf(":") > -1) {
                java.lang.String prefix = content.substring(0, content.indexOf(":"));
                java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                return RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.Factory.fromString(content, namespaceUri);
            } else {
                return RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.Factory.fromString(content, "");
            }
        }

        /**
         * static method to create the object Precondition: If this object is an
         * element, the current or next start element starts this object and any
         * intervening reader events are ignorable If this object is not an
         * element, it is a complex type and the reader is at the event just
         * after the outer start element Postcondition: If this object is an
         * element, the reader is positioned at its end element If this object
         * is a complex type, the reader is positioned at the end element of its
         * outer element
         */
        public static RequestRecipientTokenAuthenticationAssertionAuthenticationMethod parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RequestRecipientTokenAuthenticationAssertionAuthenticationMethod object = null;
            // initialize a hash map to keep values
            java.util.Map attributeMap = new java.util.HashMap();
            java.util.List extraAttributeList = new java.util.ArrayList();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                // Note all attributes that were handled. Used to differ normal
                // attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement() || reader.hasText()) {

                        java.lang.String content = reader.getElementText();

                        if (content.indexOf(":") > 0) {
                            // this seems to be a Qname so find the namespace
                            // and send
                            prefix = content.substring(0, content.indexOf(":"));
                            namespaceuri = reader.getNamespaceURI(prefix);
                            object = RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.Factory.fromString(content, namespaceuri);
                        } else {
                            // this seems to be not a qname send and empty
                            // namespace incase of it is
                            // check is done in fromString method
                            object = RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.Factory.fromString(content, "");
                        }

                    } else {
                        reader.next();
                    }
                } // end of while loop

            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }// end of factory class

}
