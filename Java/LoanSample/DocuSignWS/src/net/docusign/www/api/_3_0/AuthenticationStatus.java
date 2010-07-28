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
 * AuthenticationStatus bean class
 */

public class AuthenticationStatus implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
     * AuthenticationStatus Namespace URI = http://www.docusign.net/API/3.0
     * Namespace Prefix = ns1
     */

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.docusign.net/API/3.0")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * field for AccessCodeResult
     */

    protected net.docusign.www.api._3_0.EventResult localAccessCodeResult;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAccessCodeResultTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.EventResult
     */
    public net.docusign.www.api._3_0.EventResult getAccessCodeResult() {
        return localAccessCodeResult;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            AccessCodeResult
     */
    public void setAccessCodeResult(net.docusign.www.api._3_0.EventResult param) {

        if (param != null) {
            // update the setting tracker
            localAccessCodeResultTracker = true;
        } else {
            localAccessCodeResultTracker = false;

        }

        this.localAccessCodeResult = param;

    }

    /**
     * field for IDQuestionsResult
     */

    protected net.docusign.www.api._3_0.EventResult localIDQuestionsResult;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localIDQuestionsResultTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.EventResult
     */
    public net.docusign.www.api._3_0.EventResult getIDQuestionsResult() {
        return localIDQuestionsResult;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            IDQuestionsResult
     */
    public void setIDQuestionsResult(net.docusign.www.api._3_0.EventResult param) {

        if (param != null) {
            // update the setting tracker
            localIDQuestionsResultTracker = true;
        } else {
            localIDQuestionsResultTracker = false;

        }

        this.localIDQuestionsResult = param;

    }

    /**
     * field for IDLookupResult
     */

    protected net.docusign.www.api._3_0.EventResult localIDLookupResult;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localIDLookupResultTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.EventResult
     */
    public net.docusign.www.api._3_0.EventResult getIDLookupResult() {
        return localIDLookupResult;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            IDLookupResult
     */
    public void setIDLookupResult(net.docusign.www.api._3_0.EventResult param) {

        if (param != null) {
            // update the setting tracker
            localIDLookupResultTracker = true;
        } else {
            localIDLookupResultTracker = false;

        }

        this.localIDLookupResult = param;

    }

    /**
     * field for AgeVerifyResult
     */

    protected net.docusign.www.api._3_0.EventResult localAgeVerifyResult;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAgeVerifyResultTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.EventResult
     */
    public net.docusign.www.api._3_0.EventResult getAgeVerifyResult() {
        return localAgeVerifyResult;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            AgeVerifyResult
     */
    public void setAgeVerifyResult(net.docusign.www.api._3_0.EventResult param) {

        if (param != null) {
            // update the setting tracker
            localAgeVerifyResultTracker = true;
        } else {
            localAgeVerifyResultTracker = false;

        }

        this.localAgeVerifyResult = param;

    }

    /**
     * field for STANPinResult
     */

    protected net.docusign.www.api._3_0.EventResult localSTANPinResult;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSTANPinResultTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.EventResult
     */
    public net.docusign.www.api._3_0.EventResult getSTANPinResult() {
        return localSTANPinResult;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            STANPinResult
     */
    public void setSTANPinResult(net.docusign.www.api._3_0.EventResult param) {

        if (param != null) {
            // update the setting tracker
            localSTANPinResultTracker = true;
        } else {
            localSTANPinResultTracker = false;

        }

        this.localSTANPinResult = param;

    }

    /**
     * field for OFACResult
     */

    protected net.docusign.www.api._3_0.EventResult localOFACResult;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localOFACResultTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.EventResult
     */
    public net.docusign.www.api._3_0.EventResult getOFACResult() {
        return localOFACResult;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            OFACResult
     */
    public void setOFACResult(net.docusign.www.api._3_0.EventResult param) {

        if (param != null) {
            // update the setting tracker
            localOFACResultTracker = true;
        } else {
            localOFACResultTracker = false;

        }

        this.localOFACResult = param;

    }

    /**
     * field for PhoneAuthResult
     */

    protected net.docusign.www.api._3_0.EventResult localPhoneAuthResult;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPhoneAuthResultTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.EventResult
     */
    public net.docusign.www.api._3_0.EventResult getPhoneAuthResult() {
        return localPhoneAuthResult;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            PhoneAuthResult
     */
    public void setPhoneAuthResult(net.docusign.www.api._3_0.EventResult param) {

        if (param != null) {
            // update the setting tracker
            localPhoneAuthResultTracker = true;
        } else {
            localPhoneAuthResultTracker = false;

        }

        this.localPhoneAuthResult = param;

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

        org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName) {

            public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                AuthenticationStatus.this.serialize(parentQName, factory, xmlWriter);
            }
        };
        return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(parentQName, factory, dataSource);

    }

    public void serialize(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory, org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        serialize(parentQName, factory, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory, org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();

        if ((namespace != null) && (namespace.trim().length() > 0)) {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
            } else {
                if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        } else {
            xmlWriter.writeStartElement(parentQName.getLocalPart());
        }

        if (serializeType) {

            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.docusign.net/API/3.0");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":AuthenticationStatus", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "AuthenticationStatus", xmlWriter);
            }

        }
        if (localAccessCodeResultTracker) {
            if (localAccessCodeResult == null) {
                throw new org.apache.axis2.databinding.ADBException("AccessCodeResult cannot be null!!");
            }
            localAccessCodeResult.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccessCodeResult"), factory, xmlWriter);
        }
        if (localIDQuestionsResultTracker) {
            if (localIDQuestionsResult == null) {
                throw new org.apache.axis2.databinding.ADBException("IDQuestionsResult cannot be null!!");
            }
            localIDQuestionsResult.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDQuestionsResult"), factory, xmlWriter);
        }
        if (localIDLookupResultTracker) {
            if (localIDLookupResult == null) {
                throw new org.apache.axis2.databinding.ADBException("IDLookupResult cannot be null!!");
            }
            localIDLookupResult.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDLookupResult"), factory, xmlWriter);
        }
        if (localAgeVerifyResultTracker) {
            if (localAgeVerifyResult == null) {
                throw new org.apache.axis2.databinding.ADBException("AgeVerifyResult cannot be null!!");
            }
            localAgeVerifyResult.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AgeVerifyResult"), factory, xmlWriter);
        }
        if (localSTANPinResultTracker) {
            if (localSTANPinResult == null) {
                throw new org.apache.axis2.databinding.ADBException("STANPinResult cannot be null!!");
            }
            localSTANPinResult.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "STANPinResult"), factory, xmlWriter);
        }
        if (localOFACResultTracker) {
            if (localOFACResult == null) {
                throw new org.apache.axis2.databinding.ADBException("OFACResult cannot be null!!");
            }
            localOFACResult.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OFACResult"), factory, xmlWriter);
        }
        if (localPhoneAuthResultTracker) {
            if (localPhoneAuthResult == null) {
                throw new org.apache.axis2.databinding.ADBException("PhoneAuthResult cannot be null!!");
            }
            localPhoneAuthResult.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PhoneAuthResult"), factory, xmlWriter);
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

        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        if (localAccessCodeResultTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccessCodeResult"));

            if (localAccessCodeResult == null) {
                throw new org.apache.axis2.databinding.ADBException("AccessCodeResult cannot be null!!");
            }
            elementList.add(localAccessCodeResult);
        }
        if (localIDQuestionsResultTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDQuestionsResult"));

            if (localIDQuestionsResult == null) {
                throw new org.apache.axis2.databinding.ADBException("IDQuestionsResult cannot be null!!");
            }
            elementList.add(localIDQuestionsResult);
        }
        if (localIDLookupResultTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDLookupResult"));

            if (localIDLookupResult == null) {
                throw new org.apache.axis2.databinding.ADBException("IDLookupResult cannot be null!!");
            }
            elementList.add(localIDLookupResult);
        }
        if (localAgeVerifyResultTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AgeVerifyResult"));

            if (localAgeVerifyResult == null) {
                throw new org.apache.axis2.databinding.ADBException("AgeVerifyResult cannot be null!!");
            }
            elementList.add(localAgeVerifyResult);
        }
        if (localSTANPinResultTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "STANPinResult"));

            if (localSTANPinResult == null) {
                throw new org.apache.axis2.databinding.ADBException("STANPinResult cannot be null!!");
            }
            elementList.add(localSTANPinResult);
        }
        if (localOFACResultTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OFACResult"));

            if (localOFACResult == null) {
                throw new org.apache.axis2.databinding.ADBException("OFACResult cannot be null!!");
            }
            elementList.add(localOFACResult);
        }
        if (localPhoneAuthResultTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PhoneAuthResult"));

            if (localPhoneAuthResult == null) {
                throw new org.apache.axis2.databinding.ADBException("PhoneAuthResult cannot be null!!");
            }
            elementList.add(localPhoneAuthResult);
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());

    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {

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
        public static AuthenticationStatus parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AuthenticationStatus object = new AuthenticationStatus();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                        if (!"AuthenticationStatus".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (AuthenticationStatus) net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal
                // attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccessCodeResult").equals(reader.getName())) {

                    object.setAccessCodeResult(net.docusign.www.api._3_0.EventResult.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDQuestionsResult").equals(reader.getName())) {

                    object.setIDQuestionsResult(net.docusign.www.api._3_0.EventResult.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDLookupResult").equals(reader.getName())) {

                    object.setIDLookupResult(net.docusign.www.api._3_0.EventResult.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AgeVerifyResult").equals(reader.getName())) {

                    object.setAgeVerifyResult(net.docusign.www.api._3_0.EventResult.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "STANPinResult").equals(reader.getName())) {

                    object.setSTANPinResult(net.docusign.www.api._3_0.EventResult.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OFACResult").equals(reader.getName())) {

                    object.setOFACResult(net.docusign.www.api._3_0.EventResult.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PhoneAuthResult").equals(reader.getName())) {

                    object.setPhoneAuthResult(net.docusign.www.api._3_0.EventResult.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement())
                    // A start element we are not expecting indicates a trailing
                    // invalid property
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());

            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }// end of factory class

}
