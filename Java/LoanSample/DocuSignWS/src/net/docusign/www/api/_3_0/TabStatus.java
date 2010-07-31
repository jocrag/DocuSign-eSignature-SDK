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
 * TabStatus bean class
 */

public class TabStatus implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
     * TabStatus Namespace URI = http://www.docusign.net/API/3.0 Namespace
     * Prefix = ns1
     */

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.docusign.net/API/3.0")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * field for TabType
     */

    protected net.docusign.www.api._3_0.TabTypeCode localTabType;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.TabTypeCode
     */
    public net.docusign.www.api._3_0.TabTypeCode getTabType() {
        return localTabType;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TabType
     */
    public void setTabType(net.docusign.www.api._3_0.TabTypeCode param) {

        this.localTabType = param;

    }

    /**
     * field for Status
     */

    protected java.lang.String localStatus;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localStatusTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getStatus() {
        return localStatus;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Status
     */
    public void setStatus(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localStatusTracker = true;
        } else {
            localStatusTracker = false;

        }

        this.localStatus = param;

    }

    /**
     * field for XPosition
     */

    protected double localXPosition;

    /**
     * Auto generated getter method
     * 
     * @return double
     */
    public double getXPosition() {
        return localXPosition;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            XPosition
     */
    public void setXPosition(double param) {

        this.localXPosition = param;

    }

    /**
     * field for YPosition
     */

    protected double localYPosition;

    /**
     * Auto generated getter method
     * 
     * @return double
     */
    public double getYPosition() {
        return localYPosition;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            YPosition
     */
    public void setYPosition(double param) {

        this.localYPosition = param;

    }

    /**
     * field for Signed
     */

    protected java.util.Calendar localSigned;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSignedTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.util.Calendar
     */
    public java.util.Calendar getSigned() {
        return localSigned;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Signed
     */
    public void setSigned(java.util.Calendar param) {

        if (param != null) {
            // update the setting tracker
            localSignedTracker = true;
        } else {
            localSignedTracker = false;

        }

        this.localSigned = param;

    }

    /**
     * field for TabLabel
     */

    protected java.lang.String localTabLabel;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTabLabelTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTabLabel() {
        return localTabLabel;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TabLabel
     */
    public void setTabLabel(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localTabLabelTracker = true;
        } else {
            localTabLabelTracker = false;

        }

        this.localTabLabel = param;

    }

    /**
     * field for TabName
     */

    protected java.lang.String localTabName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTabNameTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTabName() {
        return localTabName;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TabName
     */
    public void setTabName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localTabNameTracker = true;
        } else {
            localTabNameTracker = false;

        }

        this.localTabName = param;

    }

    /**
     * field for TabValue
     */

    protected java.lang.String localTabValue;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTabValueTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTabValue() {
        return localTabValue;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TabValue
     */
    public void setTabValue(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localTabValueTracker = true;
        } else {
            localTabValueTracker = false;

        }

        this.localTabValue = param;

    }

    /**
     * field for DocumentID
     */

    protected org.apache.axis2.databinding.types.PositiveInteger localDocumentID;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDocumentIDTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return org.apache.axis2.databinding.types.PositiveInteger
     */
    public org.apache.axis2.databinding.types.PositiveInteger getDocumentID() {
        return localDocumentID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            DocumentID
     */
    public void setDocumentID(org.apache.axis2.databinding.types.PositiveInteger param) {

        if (param != null) {
            // update the setting tracker
            localDocumentIDTracker = true;
        } else {
            localDocumentIDTracker = false;

        }

        this.localDocumentID = param;

    }

    /**
     * field for PageNumber
     */

    protected org.apache.axis2.databinding.types.NonNegativeInteger localPageNumber;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPageNumberTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getPageNumber() {
        return localPageNumber;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            PageNumber
     */
    public void setPageNumber(org.apache.axis2.databinding.types.NonNegativeInteger param) {

        if (param != null) {
            // update the setting tracker
            localPageNumberTracker = true;
        } else {
            localPageNumberTracker = false;

        }

        this.localPageNumber = param;

    }

    /**
     * field for OriginalValue
     */

    protected java.lang.String localOriginalValue;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localOriginalValueTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getOriginalValue() {
        return localOriginalValue;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            OriginalValue
     */
    public void setOriginalValue(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localOriginalValueTracker = true;
        } else {
            localOriginalValueTracker = false;

        }

        this.localOriginalValue = param;

    }

    /**
     * field for ValidationPattern
     */

    protected java.lang.String localValidationPattern;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localValidationPatternTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getValidationPattern() {
        return localValidationPattern;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ValidationPattern
     */
    public void setValidationPattern(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localValidationPatternTracker = true;
        } else {
            localValidationPatternTracker = false;

        }

        this.localValidationPattern = param;

    }

    /**
     * field for RoleName
     */

    protected java.lang.String localRoleName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRoleNameTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getRoleName() {
        return localRoleName;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            RoleName
     */
    public void setRoleName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localRoleNameTracker = true;
        } else {
            localRoleNameTracker = false;

        }

        this.localRoleName = param;

    }

    /**
     * field for ListValues
     */

    protected java.lang.String localListValues;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localListValuesTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getListValues() {
        return localListValues;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ListValues
     */
    public void setListValues(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localListValuesTracker = true;
        } else {
            localListValuesTracker = false;

        }

        this.localListValues = param;

    }

    /**
     * field for ListSelectedValue
     */

    protected java.lang.String localListSelectedValue;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localListSelectedValueTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getListSelectedValue() {
        return localListSelectedValue;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ListSelectedValue
     */
    public void setListSelectedValue(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localListSelectedValueTracker = true;
        } else {
            localListSelectedValueTracker = false;

        }

        this.localListSelectedValue = param;

    }

    /**
     * field for ScaleValue
     */

    protected java.math.BigDecimal localScaleValue;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localScaleValueTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getScaleValue() {
        return localScaleValue;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ScaleValue
     */
    public void setScaleValue(java.math.BigDecimal param) {

        if (param != null) {
            // update the setting tracker
            localScaleValueTracker = true;
        } else {
            localScaleValueTracker = false;

        }

        this.localScaleValue = param;

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
                TabStatus.this.serialize(parentQName, factory, xmlWriter);
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
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":TabStatus", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "TabStatus", xmlWriter);
            }

        }

        if (localTabType == null) {
            throw new org.apache.axis2.databinding.ADBException("TabType cannot be null!!");
        }
        localTabType.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabType"), factory, xmlWriter);
        if (localStatusTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Status", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "Status");
                }

            } else {
                xmlWriter.writeStartElement("Status");
            }

            if (localStatus == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localStatus);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "XPosition", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            } else {
                xmlWriter.writeStartElement(namespace, "XPosition");
            }

        } else {
            xmlWriter.writeStartElement("XPosition");
        }

        if (java.lang.Double.isNaN(localXPosition)) {

            throw new org.apache.axis2.databinding.ADBException("XPosition cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localXPosition));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "YPosition", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            } else {
                xmlWriter.writeStartElement(namespace, "YPosition");
            }

        } else {
            xmlWriter.writeStartElement("YPosition");
        }

        if (java.lang.Double.isNaN(localYPosition)) {

            throw new org.apache.axis2.databinding.ADBException("YPosition cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYPosition));
        }

        xmlWriter.writeEndElement();
        if (localSignedTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Signed", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "Signed");
                }

            } else {
                xmlWriter.writeStartElement("Signed");
            }

            if (localSigned == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Signed cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSigned));

            }

            xmlWriter.writeEndElement();
        }
        if (localTabLabelTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "TabLabel", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "TabLabel");
                }

            } else {
                xmlWriter.writeStartElement("TabLabel");
            }

            if (localTabLabel == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TabLabel cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTabLabel);

            }

            xmlWriter.writeEndElement();
        }
        if (localTabNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "TabName", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "TabName");
                }

            } else {
                xmlWriter.writeStartElement("TabName");
            }

            if (localTabName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TabName cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTabName);

            }

            xmlWriter.writeEndElement();
        }
        if (localTabValueTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "TabValue", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "TabValue");
                }

            } else {
                xmlWriter.writeStartElement("TabValue");
            }

            if (localTabValue == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TabValue cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTabValue);

            }

            xmlWriter.writeEndElement();
        }
        if (localDocumentIDTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "DocumentID", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "DocumentID");
                }

            } else {
                xmlWriter.writeStartElement("DocumentID");
            }

            if (localDocumentID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("DocumentID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentID));

            }

            xmlWriter.writeEndElement();
        }
        if (localPageNumberTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "PageNumber", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "PageNumber");
                }

            } else {
                xmlWriter.writeStartElement("PageNumber");
            }

            if (localPageNumber == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("PageNumber cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageNumber));

            }

            xmlWriter.writeEndElement();
        }
        if (localOriginalValueTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "OriginalValue", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "OriginalValue");
                }

            } else {
                xmlWriter.writeStartElement("OriginalValue");
            }

            if (localOriginalValue == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("OriginalValue cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localOriginalValue);

            }

            xmlWriter.writeEndElement();
        }
        if (localValidationPatternTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ValidationPattern", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "ValidationPattern");
                }

            } else {
                xmlWriter.writeStartElement("ValidationPattern");
            }

            if (localValidationPattern == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ValidationPattern cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localValidationPattern);

            }

            xmlWriter.writeEndElement();
        }
        if (localRoleNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "RoleName", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "RoleName");
                }

            } else {
                xmlWriter.writeStartElement("RoleName");
            }

            if (localRoleName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("RoleName cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localRoleName);

            }

            xmlWriter.writeEndElement();
        }
        if (localListValuesTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ListValues", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "ListValues");
                }

            } else {
                xmlWriter.writeStartElement("ListValues");
            }

            if (localListValues == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ListValues cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localListValues);

            }

            xmlWriter.writeEndElement();
        }
        if (localListSelectedValueTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ListSelectedValue", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "ListSelectedValue");
                }

            } else {
                xmlWriter.writeStartElement("ListSelectedValue");
            }

            if (localListSelectedValue == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ListSelectedValue cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localListSelectedValue);

            }

            xmlWriter.writeEndElement();
        }
        if (localScaleValueTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ScaleValue", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "ScaleValue");
                }

            } else {
                xmlWriter.writeStartElement("ScaleValue");
            }

            if (localScaleValue == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ScaleValue cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localScaleValue));

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

        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabType"));

        if (localTabType == null) {
            throw new org.apache.axis2.databinding.ADBException("TabType cannot be null!!");
        }
        elementList.add(localTabType);
        if (localStatusTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"));

            if (localStatus != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "XPosition"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localXPosition));

        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "YPosition"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYPosition));
        if (localSignedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Signed"));

            if (localSigned != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSigned));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Signed cannot be null!!");
            }
        }
        if (localTabLabelTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabLabel"));

            if (localTabLabel != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTabLabel));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TabLabel cannot be null!!");
            }
        }
        if (localTabNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabName"));

            if (localTabName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTabName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TabName cannot be null!!");
            }
        }
        if (localTabValueTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabValue"));

            if (localTabValue != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTabValue));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TabValue cannot be null!!");
            }
        }
        if (localDocumentIDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentID"));

            if (localDocumentID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("DocumentID cannot be null!!");
            }
        }
        if (localPageNumberTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PageNumber"));

            if (localPageNumber != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageNumber));
            } else {
                throw new org.apache.axis2.databinding.ADBException("PageNumber cannot be null!!");
            }
        }
        if (localOriginalValueTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OriginalValue"));

            if (localOriginalValue != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginalValue));
            } else {
                throw new org.apache.axis2.databinding.ADBException("OriginalValue cannot be null!!");
            }
        }
        if (localValidationPatternTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ValidationPattern"));

            if (localValidationPattern != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValidationPattern));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ValidationPattern cannot be null!!");
            }
        }
        if (localRoleNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoleName"));

            if (localRoleName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoleName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("RoleName cannot be null!!");
            }
        }
        if (localListValuesTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ListValues"));

            if (localListValues != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localListValues));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ListValues cannot be null!!");
            }
        }
        if (localListSelectedValueTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ListSelectedValue"));

            if (localListSelectedValue != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localListSelectedValue));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ListSelectedValue cannot be null!!");
            }
        }
        if (localScaleValueTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ScaleValue"));

            if (localScaleValue != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localScaleValue));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ScaleValue cannot be null!!");
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
        public static TabStatus parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            TabStatus object = new TabStatus();

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

                        if (!"TabStatus".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (TabStatus) net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(nsUri, type, reader);
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabType").equals(reader.getName())) {

                    object.setTabType(net.docusign.www.api._3_0.TabTypeCode.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "XPosition").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setXPosition(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "YPosition").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setYPosition(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Signed").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSigned(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabLabel").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTabLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTabName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabValue").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTabValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentID").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDocumentID(org.apache.axis2.databinding.utils.ConverterUtil.convertToPositiveInteger(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PageNumber").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setPageNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OriginalValue").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setOriginalValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ValidationPattern").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setValidationPattern(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoleName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setRoleName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ListValues").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setListValues(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ListSelectedValue").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setListSelectedValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ScaleValue").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setScaleValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

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
