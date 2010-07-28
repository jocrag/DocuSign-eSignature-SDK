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
 * RequestRecipientToken bean class
 */

public class RequestRecipientToken implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientToken", "ns1");

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.docusign.net/API/3.0")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * field for EnvelopeID
     */

    protected java.lang.String localEnvelopeID;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localEnvelopeIDTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getEnvelopeID() {
        return localEnvelopeID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            EnvelopeID
     */
    public void setEnvelopeID(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localEnvelopeIDTracker = true;
        } else {
            localEnvelopeIDTracker = false;

        }

        this.localEnvelopeID = param;

    }

    /**
     * field for ClientUserID
     */

    protected java.lang.String localClientUserID;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localClientUserIDTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getClientUserID() {
        return localClientUserID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ClientUserID
     */
    public void setClientUserID(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localClientUserIDTracker = true;
        } else {
            localClientUserIDTracker = false;

        }

        this.localClientUserID = param;

    }

    /**
     * field for Username
     */

    protected java.lang.String localUsername;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localUsernameTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getUsername() {
        return localUsername;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Username
     */
    public void setUsername(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localUsernameTracker = true;
        } else {
            localUsernameTracker = false;

        }

        this.localUsername = param;

    }

    /**
     * field for Email
     */

    protected java.lang.String localEmail;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localEmailTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getEmail() {
        return localEmail;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Email
     */
    public void setEmail(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localEmailTracker = true;
        } else {
            localEmailTracker = false;

        }

        this.localEmail = param;

    }

    /**
     * field for AuthenticationAssertion
     */

    protected net.docusign.www.api._3_0.RequestRecipientTokenAuthenticationAssertion localAuthenticationAssertion;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAuthenticationAssertionTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return 
     *         net.docusign.www.api._3_0.RequestRecipientTokenAuthenticationAssertion
     */
    public net.docusign.www.api._3_0.RequestRecipientTokenAuthenticationAssertion getAuthenticationAssertion() {
        return localAuthenticationAssertion;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            AuthenticationAssertion
     */
    public void setAuthenticationAssertion(net.docusign.www.api._3_0.RequestRecipientTokenAuthenticationAssertion param) {

        if (param != null) {
            // update the setting tracker
            localAuthenticationAssertionTracker = true;
        } else {
            localAuthenticationAssertionTracker = false;

        }

        this.localAuthenticationAssertion = param;

    }

    /**
     * field for ClientURLs
     */

    protected net.docusign.www.api._3_0.RequestRecipientTokenClientURLs localClientURLs;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localClientURLsTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.RequestRecipientTokenClientURLs
     */
    public net.docusign.www.api._3_0.RequestRecipientTokenClientURLs getClientURLs() {
        return localClientURLs;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ClientURLs
     */
    public void setClientURLs(net.docusign.www.api._3_0.RequestRecipientTokenClientURLs param) {

        if (param != null) {
            // update the setting tracker
            localClientURLsTracker = true;
        } else {
            localClientURLsTracker = false;

        }

        this.localClientURLs = param;

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
                RequestRecipientToken.this.serialize(MY_QNAME, factory, xmlWriter);
            }
        };
        return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(MY_QNAME, factory, dataSource);

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
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":RequestRecipientToken", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "RequestRecipientToken", xmlWriter);
            }

        }
        if (localEnvelopeIDTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "EnvelopeID", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "EnvelopeID");
                }

            } else {
                xmlWriter.writeStartElement("EnvelopeID");
            }

            if (localEnvelopeID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EnvelopeID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localEnvelopeID);

            }

            xmlWriter.writeEndElement();
        }
        if (localClientUserIDTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ClientUserID", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "ClientUserID");
                }

            } else {
                xmlWriter.writeStartElement("ClientUserID");
            }

            if (localClientUserID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ClientUserID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localClientUserID);

            }

            xmlWriter.writeEndElement();
        }
        if (localUsernameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Username", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "Username");
                }

            } else {
                xmlWriter.writeStartElement("Username");
            }

            if (localUsername == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Username cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localUsername);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Email", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "Email");
                }

            } else {
                xmlWriter.writeStartElement("Email");
            }

            if (localEmail == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Email cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localEmail);

            }

            xmlWriter.writeEndElement();
        }
        if (localAuthenticationAssertionTracker) {
            if (localAuthenticationAssertion == null) {
                throw new org.apache.axis2.databinding.ADBException("AuthenticationAssertion cannot be null!!");
            }
            localAuthenticationAssertion.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthenticationAssertion"), factory, xmlWriter);
        }
        if (localClientURLsTracker) {
            if (localClientURLs == null) {
                throw new org.apache.axis2.databinding.ADBException("ClientURLs cannot be null!!");
            }
            localClientURLs.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientURLs"), factory, xmlWriter);
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

        if (localEnvelopeIDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"));

            if (localEnvelopeID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnvelopeID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EnvelopeID cannot be null!!");
            }
        }
        if (localClientUserIDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientUserID"));

            if (localClientUserID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientUserID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ClientUserID cannot be null!!");
            }
        }
        if (localUsernameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Username"));

            if (localUsername != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsername));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Username cannot be null!!");
            }
        }
        if (localEmailTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Email"));

            if (localEmail != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmail));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Email cannot be null!!");
            }
        }
        if (localAuthenticationAssertionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthenticationAssertion"));

            if (localAuthenticationAssertion == null) {
                throw new org.apache.axis2.databinding.ADBException("AuthenticationAssertion cannot be null!!");
            }
            elementList.add(localAuthenticationAssertion);
        }
        if (localClientURLsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientURLs"));

            if (localClientURLs == null) {
                throw new org.apache.axis2.databinding.ADBException("ClientURLs cannot be null!!");
            }
            elementList.add(localClientURLs);
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
        public static RequestRecipientToken parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RequestRecipientToken object = new RequestRecipientToken();

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

                        if (!"RequestRecipientToken".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RequestRecipientToken) net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(nsUri, type, reader);
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEnvelopeID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientUserID").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setClientUserID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Username").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setUsername(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Email").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthenticationAssertion").equals(reader.getName())) {

                    object.setAuthenticationAssertion(net.docusign.www.api._3_0.RequestRecipientTokenAuthenticationAssertion.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientURLs").equals(reader.getName())) {

                    object.setClientURLs(net.docusign.www.api._3_0.RequestRecipientTokenClientURLs.Factory.parse(reader));

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
