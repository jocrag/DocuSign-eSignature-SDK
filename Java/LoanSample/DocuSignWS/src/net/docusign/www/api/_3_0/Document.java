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
 * Document bean class
 */

public class Document implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = Document
     * Namespace URI = http://www.docusign.net/API/3.0 Namespace Prefix = ns1
     */

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.docusign.net/API/3.0")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * field for ID
     */

    protected org.apache.axis2.databinding.types.PositiveInteger localID;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localIDTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return org.apache.axis2.databinding.types.PositiveInteger
     */
    public org.apache.axis2.databinding.types.PositiveInteger getID() {
        return localID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ID
     */
    public void setID(org.apache.axis2.databinding.types.PositiveInteger param) {

        if (param != null) {
            // update the setting tracker
            localIDTracker = true;
        } else {
            localIDTracker = false;

        }

        this.localID = param;

    }

    /**
     * field for Name
     */

    protected java.lang.String localName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localNameTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Name
     */
    public void setName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localNameTracker = true;
        } else {
            localNameTracker = false;

        }

        this.localName = param;

    }

    /**
     * field for PDFBytes
     */

    protected javax.activation.DataHandler localPDFBytes;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPDFBytesTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return javax.activation.DataHandler
     */
    public javax.activation.DataHandler getPDFBytes() {
        return localPDFBytes;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            PDFBytes
     */
    public void setPDFBytes(javax.activation.DataHandler param) {

        if (param != null) {
            // update the setting tracker
            localPDFBytesTracker = true;
        } else {
            localPDFBytesTracker = false;

        }

        this.localPDFBytes = param;

    }

    /**
     * field for Password
     */

    protected java.lang.String localPassword;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPasswordTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getPassword() {
        return localPassword;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Password
     */
    public void setPassword(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localPasswordTracker = true;
        } else {
            localPasswordTracker = false;

        }

        this.localPassword = param;

    }

    /**
     * field for TransformPdfFields
     */

    protected boolean localTransformPdfFields = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTransformPdfFieldsTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getTransformPdfFields() {
        return localTransformPdfFields;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TransformPdfFields
     */
    public void setTransformPdfFields(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localTransformPdfFieldsTracker = false;

        } else {
            localTransformPdfFieldsTracker = true;
        }

        this.localTransformPdfFields = param;

    }

    /**
     * field for FileExtension
     */

    protected java.lang.String localFileExtension;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localFileExtensionTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getFileExtension() {
        return localFileExtension;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            FileExtension
     */
    public void setFileExtension(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localFileExtensionTracker = true;
        } else {
            localFileExtensionTracker = false;

        }

        this.localFileExtension = param;

    }

    /**
     * field for MatchBoxes
     */

    protected net.docusign.www.api._3_0.ArrayOfMatchBox localMatchBoxes;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localMatchBoxesTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.ArrayOfMatchBox
     */
    public net.docusign.www.api._3_0.ArrayOfMatchBox getMatchBoxes() {
        return localMatchBoxes;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            MatchBoxes
     */
    public void setMatchBoxes(net.docusign.www.api._3_0.ArrayOfMatchBox param) {

        if (param != null) {
            // update the setting tracker
            localMatchBoxesTracker = true;
        } else {
            localMatchBoxesTracker = false;

        }

        this.localMatchBoxes = param;

    }

    /**
     * field for AttachmentDescription
     */

    protected java.lang.String localAttachmentDescription;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAttachmentDescriptionTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getAttachmentDescription() {
        return localAttachmentDescription;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            AttachmentDescription
     */
    public void setAttachmentDescription(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localAttachmentDescriptionTracker = true;
        } else {
            localAttachmentDescriptionTracker = false;

        }

        this.localAttachmentDescription = param;

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
                Document.this.serialize(parentQName, factory, xmlWriter);
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
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":Document", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Document", xmlWriter);
            }

        }
        if (localIDTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ID", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "ID");
                }

            } else {
                xmlWriter.writeStartElement("ID");
            }

            if (localID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localID));

            }

            xmlWriter.writeEndElement();
        }
        if (localNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Name", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "Name");
                }

            } else {
                xmlWriter.writeStartElement("Name");
            }

            if (localName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localName);

            }

            xmlWriter.writeEndElement();
        }
        if (localPDFBytesTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "PDFBytes", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "PDFBytes");
                }

            } else {
                xmlWriter.writeStartElement("PDFBytes");
            }

            if (localPDFBytes != null) {
                xmlWriter.writeDataHandler(localPDFBytes);
            }

            xmlWriter.writeEndElement();
        }
        if (localPasswordTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Password", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "Password");
                }

            } else {
                xmlWriter.writeStartElement("Password");
            }

            if (localPassword == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Password cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPassword);

            }

            xmlWriter.writeEndElement();
        }
        if (localTransformPdfFieldsTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "TransformPdfFields", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "TransformPdfFields");
                }

            } else {
                xmlWriter.writeStartElement("TransformPdfFields");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("TransformPdfFields cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransformPdfFields));
            }

            xmlWriter.writeEndElement();
        }
        if (localFileExtensionTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "FileExtension", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "FileExtension");
                }

            } else {
                xmlWriter.writeStartElement("FileExtension");
            }

            if (localFileExtension == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("FileExtension cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localFileExtension);

            }

            xmlWriter.writeEndElement();
        }
        if (localMatchBoxesTracker) {
            if (localMatchBoxes == null) {
                throw new org.apache.axis2.databinding.ADBException("MatchBoxes cannot be null!!");
            }
            localMatchBoxes.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MatchBoxes"), factory, xmlWriter);
        }
        if (localAttachmentDescriptionTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "AttachmentDescription", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "AttachmentDescription");
                }

            } else {
                xmlWriter.writeStartElement("AttachmentDescription");
            }

            if (localAttachmentDescription == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("AttachmentDescription cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAttachmentDescription);

            }

            xmlWriter.writeEndElement();
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

        if (localIDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ID"));

            if (localID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
            }
        }
        if (localNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Name"));

            if (localName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
            }
        }
        if (localPDFBytesTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFBytes"));

            elementList.add(localPDFBytes);
        }
        if (localPasswordTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Password"));

            if (localPassword != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Password cannot be null!!");
            }
        }
        if (localTransformPdfFieldsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransformPdfFields"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransformPdfFields));
        }
        if (localFileExtensionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FileExtension"));

            if (localFileExtension != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFileExtension));
            } else {
                throw new org.apache.axis2.databinding.ADBException("FileExtension cannot be null!!");
            }
        }
        if (localMatchBoxesTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MatchBoxes"));

            if (localMatchBoxes == null) {
                throw new org.apache.axis2.databinding.ADBException("MatchBoxes cannot be null!!");
            }
            elementList.add(localMatchBoxes);
        }
        if (localAttachmentDescriptionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AttachmentDescription"));

            if (localAttachmentDescription != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttachmentDescription));
            } else {
                throw new org.apache.axis2.databinding.ADBException("AttachmentDescription cannot be null!!");
            }
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
        public static Document parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            Document object = new Document();

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

                        if (!"Document".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (Document) net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(nsUri, type, reader);
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ID").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setID(org.apache.axis2.databinding.utils.ConverterUtil.convertToPositiveInteger(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Name").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFBytes").equals(reader.getName())) {
                    reader.next();
                    if (isReaderMTOMAware(reader) && java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_BINARY))) {
                        // MTOM aware reader - get the datahandler directly and
                        // put it in the object
                        object.setPDFBytes((javax.activation.DataHandler) reader.getProperty(org.apache.axiom.om.OMConstants.DATA_HANDLER));
                    } else {
                        if (reader.getEventType() == javax.xml.stream.XMLStreamConstants.START_ELEMENT && reader.getName().equals(new javax.xml.namespace.QName(org.apache.axiom.om.impl.MTOMConstants.XOP_NAMESPACE_URI, org.apache.axiom.om.impl.MTOMConstants.XOP_INCLUDE))) {
                            java.lang.String id = org.apache.axiom.om.util.ElementHelper.getContentID(reader, "UTF-8");
                            object.setPDFBytes(((org.apache.axiom.soap.impl.builder.MTOMStAXSOAPModelBuilder) ((org.apache.axiom.om.impl.llom.OMStAXWrapper) reader).getBuilder()).getDataHandler(id));
                            reader.next();

                            reader.next();

                        } else if (reader.hasText()) {
                            // Do the usual conversion
                            java.lang.String content = reader.getText();
                            object.setPDFBytes(org.apache.axis2.databinding.utils.ConverterUtil.convertToBase64Binary(content));

                            reader.next();

                        }
                    }

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Password").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setPassword(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransformPdfFields").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTransformPdfFields(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FileExtension").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setFileExtension(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MatchBoxes").equals(reader.getName())) {

                    object.setMatchBoxes(net.docusign.www.api._3_0.ArrayOfMatchBox.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AttachmentDescription").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setAttachmentDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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
