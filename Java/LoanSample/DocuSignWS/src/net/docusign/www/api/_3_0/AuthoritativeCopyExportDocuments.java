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
 * AuthoritativeCopyExportDocuments bean class
 */

public class AuthoritativeCopyExportDocuments implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
     * AuthoritativeCopyExportDocuments Namespace URI =
     * http://www.docusign.net/API/3.0 Namespace Prefix = ns1
     */

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.docusign.net/API/3.0")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * field for EnvelopeId
     */

    protected java.lang.String localEnvelopeId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localEnvelopeIdTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getEnvelopeId() {
        return localEnvelopeId;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            EnvelopeId
     */
    public void setEnvelopeId(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localEnvelopeIdTracker = true;
        } else {
            localEnvelopeIdTracker = false;

        }

        this.localEnvelopeId = param;

    }

    /**
     * field for TransactionId
     */

    protected java.lang.String localTransactionId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTransactionIdTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTransactionId() {
        return localTransactionId;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TransactionId
     */
    public void setTransactionId(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localTransactionIdTracker = true;
        } else {
            localTransactionIdTracker = false;

        }

        this.localTransactionId = param;

    }

    /**
     * field for Count
     */

    protected int localCount;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getCount() {
        return localCount;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Count
     */
    public void setCount(int param) {

        this.localCount = param;

    }

    /**
     * field for DocumentPDF This was an Array!
     */

    protected net.docusign.www.api._3_0.DocumentPDF[] localDocumentPDF;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDocumentPDFTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.DocumentPDF[]
     */
    public net.docusign.www.api._3_0.DocumentPDF[] getDocumentPDF() {
        return localDocumentPDF;
    }

    /**
     * validate the array for DocumentPDF
     */
    protected void validateDocumentPDF(net.docusign.www.api._3_0.DocumentPDF[] param) {

    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            DocumentPDF
     */
    public void setDocumentPDF(net.docusign.www.api._3_0.DocumentPDF[] param) {

        validateDocumentPDF(param);

        if (param != null) {
            // update the setting tracker
            localDocumentPDFTracker = true;
        } else {
            localDocumentPDFTracker = false;

        }

        this.localDocumentPDF = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * 
     * @param param
     *            net.docusign.www.api._3_0.DocumentPDF
     */
    public void addDocumentPDF(net.docusign.www.api._3_0.DocumentPDF param) {
        if (localDocumentPDF == null) {
            localDocumentPDF = new net.docusign.www.api._3_0.DocumentPDF[] {};
        }

        // update the setting tracker
        localDocumentPDFTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localDocumentPDF);
        list.add(param);
        this.localDocumentPDF = (net.docusign.www.api._3_0.DocumentPDF[]) list.toArray(new net.docusign.www.api._3_0.DocumentPDF[list.size()]);

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
                AuthoritativeCopyExportDocuments.this.serialize(parentQName, factory, xmlWriter);
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
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":AuthoritativeCopyExportDocuments", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "AuthoritativeCopyExportDocuments", xmlWriter);
            }

        }
        if (localEnvelopeIdTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "EnvelopeId", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "EnvelopeId");
                }

            } else {
                xmlWriter.writeStartElement("EnvelopeId");
            }

            if (localEnvelopeId == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EnvelopeId cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localEnvelopeId);

            }

            xmlWriter.writeEndElement();
        }
        if (localTransactionIdTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "TransactionId", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "TransactionId");
                }

            } else {
                xmlWriter.writeStartElement("TransactionId");
            }

            if (localTransactionId == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TransactionId cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTransactionId);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "Count", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            } else {
                xmlWriter.writeStartElement(namespace, "Count");
            }

        } else {
            xmlWriter.writeStartElement("Count");
        }

        if (localCount == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Count cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCount));
        }

        xmlWriter.writeEndElement();
        if (localDocumentPDFTracker) {
            if (localDocumentPDF != null) {
                for (int i = 0; i < localDocumentPDF.length; i++) {
                    if (localDocumentPDF[i] != null) {
                        localDocumentPDF[i].serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF"), factory, xmlWriter);
                    } else {

                        // we don't have to do any thing since minOccures is
                        // zero

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("DocumentPDF cannot be null!!");

            }
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

        if (localEnvelopeIdTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"));

            if (localEnvelopeId != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnvelopeId));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EnvelopeId cannot be null!!");
            }
        }
        if (localTransactionIdTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransactionId"));

            if (localTransactionId != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionId));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TransactionId cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Count"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCount));
        if (localDocumentPDFTracker) {
            if (localDocumentPDF != null) {
                for (int i = 0; i < localDocumentPDF.length; i++) {

                    if (localDocumentPDF[i] != null) {
                        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF"));
                        elementList.add(localDocumentPDF[i]);
                    } else {

                        // nothing to do

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("DocumentPDF cannot be null!!");

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
        public static AuthoritativeCopyExportDocuments parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AuthoritativeCopyExportDocuments object = new AuthoritativeCopyExportDocuments();

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

                        if (!"AuthoritativeCopyExportDocuments".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (AuthoritativeCopyExportDocuments) net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal
                // attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list4 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEnvelopeId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransactionId").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTransactionId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Count").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF").equals(reader.getName())) {

                    // Process the array and step past its final element's end.
                    list4.add(net.docusign.www.api._3_0.DocumentPDF.Factory.parse(reader));

                    // loop until we find a start element that is not part of
                    // this array
                    boolean loopDone4 = false;
                    while (!loopDone4) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();
                        // Step out of this element
                        reader.next();
                        // Step to next element event.
                        while (!reader.isStartElement() && !reader.isEndElement())
                            reader.next();
                        if (reader.isEndElement()) {
                            // two continuous end elements means we are exiting
                            // the xml structure
                            loopDone4 = true;
                        } else {
                            if (new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF").equals(reader.getName())) {
                                list4.add(net.docusign.www.api._3_0.DocumentPDF.Factory.parse(reader));

                            } else {
                                loopDone4 = true;
                            }
                        }
                    }
                    // call the converter utility to convert and set the array

                    object.setDocumentPDF((net.docusign.www.api._3_0.DocumentPDF[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(net.docusign.www.api._3_0.DocumentPDF.class, list4));

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
