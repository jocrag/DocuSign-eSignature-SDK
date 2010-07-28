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
 * AddressBookItem bean class
 */

public class AddressBookItem implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
     * AddressBookItem Namespace URI = http://www.docusign.net/API/3.0 Namespace
     * Prefix = ns1
     */

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.docusign.net/API/3.0")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * field for AddressBookID
     */

    protected java.lang.String localAddressBookID;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAddressBookIDTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getAddressBookID() {
        return localAddressBookID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            AddressBookID
     */
    public void setAddressBookID(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localAddressBookIDTracker = true;
        } else {
            localAddressBookIDTracker = false;

        }

        this.localAddressBookID = param;

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
     * field for UserName
     */

    protected java.lang.String localUserName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localUserNameTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getUserName() {
        return localUserName;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            UserName
     */
    public void setUserName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localUserNameTracker = true;
        } else {
            localUserNameTracker = false;

        }

        this.localUserName = param;

    }

    /**
     * field for AccountName
     */

    protected java.lang.String localAccountName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAccountNameTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getAccountName() {
        return localAccountName;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            AccountName
     */
    public void setAccountName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localAccountNameTracker = true;
        } else {
            localAccountNameTracker = false;

        }

        this.localAccountName = param;

    }

    /**
     * field for Shared
     */

    protected boolean localShared;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getShared() {
        return localShared;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Shared
     */
    public void setShared(boolean param) {

        this.localShared = param;

    }

    /**
     * field for Created
     */

    protected java.util.Calendar localCreated;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCreatedTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.util.Calendar
     */
    public java.util.Calendar getCreated() {
        return localCreated;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Created
     */
    public void setCreated(java.util.Calendar param) {

        if (param != null) {
            // update the setting tracker
            localCreatedTracker = true;
        } else {
            localCreatedTracker = false;

        }

        this.localCreated = param;

    }

    /**
     * field for Owner
     */

    protected boolean localOwner;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localOwnerTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getOwner() {
        return localOwner;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Owner
     */
    public void setOwner(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localOwnerTracker = false;

        } else {
            localOwnerTracker = true;
        }

        this.localOwner = param;

    }

    /**
     * field for Phone1
     */

    protected net.docusign.www.api._3_0.AddressBookPhoneNumber localPhone1;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPhone1Tracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.AddressBookPhoneNumber
     */
    public net.docusign.www.api._3_0.AddressBookPhoneNumber getPhone1() {
        return localPhone1;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Phone1
     */
    public void setPhone1(net.docusign.www.api._3_0.AddressBookPhoneNumber param) {

        if (param != null) {
            // update the setting tracker
            localPhone1Tracker = true;
        } else {
            localPhone1Tracker = false;

        }

        this.localPhone1 = param;

    }

    /**
     * field for Phone2
     */

    protected net.docusign.www.api._3_0.AddressBookPhoneNumber localPhone2;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPhone2Tracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.AddressBookPhoneNumber
     */
    public net.docusign.www.api._3_0.AddressBookPhoneNumber getPhone2() {
        return localPhone2;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Phone2
     */
    public void setPhone2(net.docusign.www.api._3_0.AddressBookPhoneNumber param) {

        if (param != null) {
            // update the setting tracker
            localPhone2Tracker = true;
        } else {
            localPhone2Tracker = false;

        }

        this.localPhone2 = param;

    }

    /**
     * field for Phone3
     */

    protected net.docusign.www.api._3_0.AddressBookPhoneNumber localPhone3;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPhone3Tracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.AddressBookPhoneNumber
     */
    public net.docusign.www.api._3_0.AddressBookPhoneNumber getPhone3() {
        return localPhone3;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Phone3
     */
    public void setPhone3(net.docusign.www.api._3_0.AddressBookPhoneNumber param) {

        if (param != null) {
            // update the setting tracker
            localPhone3Tracker = true;
        } else {
            localPhone3Tracker = false;

        }

        this.localPhone3 = param;

    }

    /**
     * field for Phone4
     */

    protected net.docusign.www.api._3_0.AddressBookPhoneNumber localPhone4;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPhone4Tracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.AddressBookPhoneNumber
     */
    public net.docusign.www.api._3_0.AddressBookPhoneNumber getPhone4() {
        return localPhone4;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Phone4
     */
    public void setPhone4(net.docusign.www.api._3_0.AddressBookPhoneNumber param) {

        if (param != null) {
            // update the setting tracker
            localPhone4Tracker = true;
        } else {
            localPhone4Tracker = false;

        }

        this.localPhone4 = param;

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
                AddressBookItem.this.serialize(parentQName, factory, xmlWriter);
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
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":AddressBookItem", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "AddressBookItem", xmlWriter);
            }

        }
        if (localAddressBookIDTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "AddressBookID", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "AddressBookID");
                }

            } else {
                xmlWriter.writeStartElement("AddressBookID");
            }

            if (localAddressBookID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("AddressBookID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAddressBookID);

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
        if (localUserNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "UserName", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "UserName");
                }

            } else {
                xmlWriter.writeStartElement("UserName");
            }

            if (localUserName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("UserName cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localUserName);

            }

            xmlWriter.writeEndElement();
        }
        if (localAccountNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "AccountName", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "AccountName");
                }

            } else {
                xmlWriter.writeStartElement("AccountName");
            }

            if (localAccountName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("AccountName cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAccountName);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "Shared", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            } else {
                xmlWriter.writeStartElement(namespace, "Shared");
            }

        } else {
            xmlWriter.writeStartElement("Shared");
        }

        if (false) {

            throw new org.apache.axis2.databinding.ADBException("Shared cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShared));
        }

        xmlWriter.writeEndElement();
        if (localCreatedTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Created", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "Created");
                }

            } else {
                xmlWriter.writeStartElement("Created");
            }

            if (localCreated == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Created cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreated));

            }

            xmlWriter.writeEndElement();
        }
        if (localOwnerTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Owner", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "Owner");
                }

            } else {
                xmlWriter.writeStartElement("Owner");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOwner));
            }

            xmlWriter.writeEndElement();
        }
        if (localPhone1Tracker) {
            if (localPhone1 == null) {
                throw new org.apache.axis2.databinding.ADBException("Phone1 cannot be null!!");
            }
            localPhone1.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone1"), factory, xmlWriter);
        }
        if (localPhone2Tracker) {
            if (localPhone2 == null) {
                throw new org.apache.axis2.databinding.ADBException("Phone2 cannot be null!!");
            }
            localPhone2.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone2"), factory, xmlWriter);
        }
        if (localPhone3Tracker) {
            if (localPhone3 == null) {
                throw new org.apache.axis2.databinding.ADBException("Phone3 cannot be null!!");
            }
            localPhone3.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone3"), factory, xmlWriter);
        }
        if (localPhone4Tracker) {
            if (localPhone4 == null) {
                throw new org.apache.axis2.databinding.ADBException("Phone4 cannot be null!!");
            }
            localPhone4.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone4"), factory, xmlWriter);
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

        if (localAddressBookIDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookID"));

            if (localAddressBookID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddressBookID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("AddressBookID cannot be null!!");
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
        if (localUserNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName"));

            if (localUserName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("UserName cannot be null!!");
            }
        }
        if (localAccountNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountName"));

            if (localAccountName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccountName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("AccountName cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Shared"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShared));
        if (localCreatedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Created"));

            if (localCreated != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreated));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Created cannot be null!!");
            }
        }
        if (localOwnerTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Owner"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOwner));
        }
        if (localPhone1Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone1"));

            if (localPhone1 == null) {
                throw new org.apache.axis2.databinding.ADBException("Phone1 cannot be null!!");
            }
            elementList.add(localPhone1);
        }
        if (localPhone2Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone2"));

            if (localPhone2 == null) {
                throw new org.apache.axis2.databinding.ADBException("Phone2 cannot be null!!");
            }
            elementList.add(localPhone2);
        }
        if (localPhone3Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone3"));

            if (localPhone3 == null) {
                throw new org.apache.axis2.databinding.ADBException("Phone3 cannot be null!!");
            }
            elementList.add(localPhone3);
        }
        if (localPhone4Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone4"));

            if (localPhone4 == null) {
                throw new org.apache.axis2.databinding.ADBException("Phone4 cannot be null!!");
            }
            elementList.add(localPhone4);
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
        public static AddressBookItem parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AddressBookItem object = new AddressBookItem();

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

                        if (!"AddressBookItem".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (AddressBookItem) net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(nsUri, type, reader);
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookID").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setAddressBookID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setUserName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setAccountName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Shared").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setShared(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Created").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCreated(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Owner").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setOwner(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone1").equals(reader.getName())) {

                    object.setPhone1(net.docusign.www.api._3_0.AddressBookPhoneNumber.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone2").equals(reader.getName())) {

                    object.setPhone2(net.docusign.www.api._3_0.AddressBookPhoneNumber.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone3").equals(reader.getName())) {

                    object.setPhone3(net.docusign.www.api._3_0.AddressBookPhoneNumber.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone4").equals(reader.getName())) {

                    object.setPhone4(net.docusign.www.api._3_0.AddressBookPhoneNumber.Factory.parse(reader));

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
