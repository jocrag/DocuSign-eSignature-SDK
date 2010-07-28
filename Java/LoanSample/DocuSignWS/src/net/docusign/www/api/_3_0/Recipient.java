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
 * Recipient bean class
 */

public class Recipient implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
     * Recipient Namespace URI = http://www.docusign.net/API/3.0 Namespace
     * Prefix = ns1
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
     * field for SignerName
     */

    protected java.lang.String localSignerName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSignerNameTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getSignerName() {
        return localSignerName;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            SignerName
     */
    public void setSignerName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localSignerNameTracker = true;
        } else {
            localSignerNameTracker = false;

        }

        this.localSignerName = param;

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
     * field for Type
     */

    protected net.docusign.www.api._3_0.RecipientTypeCode localType;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.RecipientTypeCode
     */
    public net.docusign.www.api._3_0.RecipientTypeCode getType() {
        return localType;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Type
     */
    public void setType(net.docusign.www.api._3_0.RecipientTypeCode param) {

        this.localType = param;

    }

    /**
     * field for AccessCode
     */

    protected java.lang.String localAccessCode;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getAccessCode() {
        return localAccessCode;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            AccessCode
     */
    public void setAccessCode(java.lang.String param) {

        this.localAccessCode = param;

    }

    /**
     * field for AddAccessCodeToEmail
     */

    protected boolean localAddAccessCodeToEmail;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAddAccessCodeToEmailTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getAddAccessCodeToEmail() {
        return localAddAccessCodeToEmail;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            AddAccessCodeToEmail
     */
    public void setAddAccessCodeToEmail(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localAddAccessCodeToEmailTracker = false;

        } else {
            localAddAccessCodeToEmailTracker = true;
        }

        this.localAddAccessCodeToEmail = param;

    }

    /**
     * field for RequireIDLookup
     */

    protected boolean localRequireIDLookup;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getRequireIDLookup() {
        return localRequireIDLookup;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            RequireIDLookup
     */
    public void setRequireIDLookup(boolean param) {

        this.localRequireIDLookup = param;

    }

    /**
     * field for IDCheckConfigurationName
     */

    protected java.lang.String localIDCheckConfigurationName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localIDCheckConfigurationNameTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getIDCheckConfigurationName() {
        return localIDCheckConfigurationName;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            IDCheckConfigurationName
     */
    public void setIDCheckConfigurationName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localIDCheckConfigurationNameTracker = true;
        } else {
            localIDCheckConfigurationNameTracker = false;

        }

        this.localIDCheckConfigurationName = param;

    }

    /**
     * field for PhoneAuthentication
     */

    protected net.docusign.www.api._3_0.RecipientPhoneAuthentication localPhoneAuthentication;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPhoneAuthenticationTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.RecipientPhoneAuthentication
     */
    public net.docusign.www.api._3_0.RecipientPhoneAuthentication getPhoneAuthentication() {
        return localPhoneAuthentication;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            PhoneAuthentication
     */
    public void setPhoneAuthentication(net.docusign.www.api._3_0.RecipientPhoneAuthentication param) {

        if (param != null) {
            // update the setting tracker
            localPhoneAuthenticationTracker = true;
        } else {
            localPhoneAuthenticationTracker = false;

        }

        this.localPhoneAuthentication = param;

    }

    /**
     * field for SignatureInfo
     */

    protected net.docusign.www.api._3_0.RecipientSignatureInfo localSignatureInfo;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSignatureInfoTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.RecipientSignatureInfo
     */
    public net.docusign.www.api._3_0.RecipientSignatureInfo getSignatureInfo() {
        return localSignatureInfo;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            SignatureInfo
     */
    public void setSignatureInfo(net.docusign.www.api._3_0.RecipientSignatureInfo param) {

        if (param != null) {
            // update the setting tracker
            localSignatureInfoTracker = true;
        } else {
            localSignatureInfoTracker = false;

        }

        this.localSignatureInfo = param;

    }

    /**
     * field for CaptiveInfo
     */

    protected net.docusign.www.api._3_0.RecipientCaptiveInfo localCaptiveInfo;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCaptiveInfoTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.RecipientCaptiveInfo
     */
    public net.docusign.www.api._3_0.RecipientCaptiveInfo getCaptiveInfo() {
        return localCaptiveInfo;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CaptiveInfo
     */
    public void setCaptiveInfo(net.docusign.www.api._3_0.RecipientCaptiveInfo param) {

        if (param != null) {
            // update the setting tracker
            localCaptiveInfoTracker = true;
        } else {
            localCaptiveInfoTracker = false;

        }

        this.localCaptiveInfo = param;

    }

    /**
     * field for CustomFields
     */

    protected net.docusign.www.api._3_0.ArrayOfString1 localCustomFields;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomFieldsTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.ArrayOfString1
     */
    public net.docusign.www.api._3_0.ArrayOfString1 getCustomFields() {
        return localCustomFields;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomFields
     */
    public void setCustomFields(net.docusign.www.api._3_0.ArrayOfString1 param) {

        if (param != null) {
            // update the setting tracker
            localCustomFieldsTracker = true;
        } else {
            localCustomFieldsTracker = false;

        }

        this.localCustomFields = param;

    }

    /**
     * field for RoutingOrder
     */

    protected org.apache.axis2.databinding.types.UnsignedShort localRoutingOrder;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRoutingOrderTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return org.apache.axis2.databinding.types.UnsignedShort
     */
    public org.apache.axis2.databinding.types.UnsignedShort getRoutingOrder() {
        return localRoutingOrder;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            RoutingOrder
     */
    public void setRoutingOrder(org.apache.axis2.databinding.types.UnsignedShort param) {

        if (param != null) {
            // update the setting tracker
            localRoutingOrderTracker = true;
        } else {
            localRoutingOrderTracker = false;

        }

        this.localRoutingOrder = param;

    }

    /**
     * field for IDCheckInformationInput
     */

    protected net.docusign.www.api._3_0.IDCheckInformationInput localIDCheckInformationInput;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localIDCheckInformationInputTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.IDCheckInformationInput
     */
    public net.docusign.www.api._3_0.IDCheckInformationInput getIDCheckInformationInput() {
        return localIDCheckInformationInput;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            IDCheckInformationInput
     */
    public void setIDCheckInformationInput(net.docusign.www.api._3_0.IDCheckInformationInput param) {

        if (param != null) {
            // update the setting tracker
            localIDCheckInformationInputTracker = true;
        } else {
            localIDCheckInformationInputTracker = false;

        }

        this.localIDCheckInformationInput = param;

    }

    /**
     * field for AutoNavigation
     */

    protected boolean localAutoNavigation;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAutoNavigationTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getAutoNavigation() {
        return localAutoNavigation;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            AutoNavigation
     */
    public void setAutoNavigation(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localAutoNavigationTracker = false;

        } else {
            localAutoNavigationTracker = true;
        }

        this.localAutoNavigation = param;

    }

    /**
     * field for RecipientAttachment
     */

    protected net.docusign.www.api._3_0.ArrayOfAttachment localRecipientAttachment;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRecipientAttachmentTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.ArrayOfAttachment
     */
    public net.docusign.www.api._3_0.ArrayOfAttachment getRecipientAttachment() {
        return localRecipientAttachment;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            RecipientAttachment
     */
    public void setRecipientAttachment(net.docusign.www.api._3_0.ArrayOfAttachment param) {

        if (param != null) {
            // update the setting tracker
            localRecipientAttachmentTracker = true;
        } else {
            localRecipientAttachmentTracker = false;

        }

        this.localRecipientAttachment = param;

    }

    /**
     * field for Note
     */

    protected java.lang.String localNote;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localNoteTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getNote() {
        return localNote;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Note
     */
    public void setNote(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localNoteTracker = true;
        } else {
            localNoteTracker = false;

        }

        this.localNote = param;

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
     * field for TemplateLocked
     */

    protected boolean localTemplateLocked;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTemplateLockedTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getTemplateLocked() {
        return localTemplateLocked;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TemplateLocked
     */
    public void setTemplateLocked(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localTemplateLockedTracker = false;

        } else {
            localTemplateLockedTracker = true;
        }

        this.localTemplateLocked = param;

    }

    /**
     * field for TemplateRequired
     */

    protected boolean localTemplateRequired;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTemplateRequiredTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getTemplateRequired() {
        return localTemplateRequired;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TemplateRequired
     */
    public void setTemplateRequired(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localTemplateRequiredTracker = false;

        } else {
            localTemplateRequiredTracker = true;
        }

        this.localTemplateRequired = param;

    }

    /**
     * field for TemplateAccessCodeRequired
     */

    protected boolean localTemplateAccessCodeRequired;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTemplateAccessCodeRequiredTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getTemplateAccessCodeRequired() {
        return localTemplateAccessCodeRequired;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TemplateAccessCodeRequired
     */
    public void setTemplateAccessCodeRequired(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localTemplateAccessCodeRequiredTracker = false;

        } else {
            localTemplateAccessCodeRequiredTracker = true;
        }

        this.localTemplateAccessCodeRequired = param;

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
                Recipient.this.serialize(parentQName, factory, xmlWriter);
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
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":Recipient", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Recipient", xmlWriter);
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
        if (localSignerNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "SignerName", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "SignerName");
                }

            } else {
                xmlWriter.writeStartElement("SignerName");
            }

            if (localSignerName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("SignerName cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localSignerName);

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
        if (localType == null) {
            throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");
        }
        localType.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Type"), factory, xmlWriter);

        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "AccessCode", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            } else {
                xmlWriter.writeStartElement(namespace, "AccessCode");
            }

        } else {
            xmlWriter.writeStartElement("AccessCode");
        }

        if (localAccessCode == null) {
            // write the nil attribute

            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

            xmlWriter.writeCharacters(localAccessCode);

        }

        xmlWriter.writeEndElement();
        if (localAddAccessCodeToEmailTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "AddAccessCodeToEmail", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "AddAccessCodeToEmail");
                }

            } else {
                xmlWriter.writeStartElement("AddAccessCodeToEmail");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("AddAccessCodeToEmail cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddAccessCodeToEmail));
            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "RequireIDLookup", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            } else {
                xmlWriter.writeStartElement(namespace, "RequireIDLookup");
            }

        } else {
            xmlWriter.writeStartElement("RequireIDLookup");
        }

        if (false) {

            throw new org.apache.axis2.databinding.ADBException("RequireIDLookup cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequireIDLookup));
        }

        xmlWriter.writeEndElement();
        if (localIDCheckConfigurationNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "IDCheckConfigurationName", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "IDCheckConfigurationName");
                }

            } else {
                xmlWriter.writeStartElement("IDCheckConfigurationName");
            }

            if (localIDCheckConfigurationName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("IDCheckConfigurationName cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localIDCheckConfigurationName);

            }

            xmlWriter.writeEndElement();
        }
        if (localPhoneAuthenticationTracker) {
            if (localPhoneAuthentication == null) {
                throw new org.apache.axis2.databinding.ADBException("PhoneAuthentication cannot be null!!");
            }
            localPhoneAuthentication.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PhoneAuthentication"), factory, xmlWriter);
        }
        if (localSignatureInfoTracker) {
            if (localSignatureInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("SignatureInfo cannot be null!!");
            }
            localSignatureInfo.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignatureInfo"), factory, xmlWriter);
        }
        if (localCaptiveInfoTracker) {
            if (localCaptiveInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("CaptiveInfo cannot be null!!");
            }
            localCaptiveInfo.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveInfo"), factory, xmlWriter);
        }
        if (localCustomFieldsTracker) {
            if (localCustomFields == null) {
                throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
            }
            localCustomFields.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields"), factory, xmlWriter);
        }
        if (localRoutingOrderTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "RoutingOrder", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "RoutingOrder");
                }

            } else {
                xmlWriter.writeStartElement("RoutingOrder");
            }

            if (localRoutingOrder == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("RoutingOrder cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoutingOrder));

            }

            xmlWriter.writeEndElement();
        }
        if (localIDCheckInformationInputTracker) {
            if (localIDCheckInformationInput == null) {
                throw new org.apache.axis2.databinding.ADBException("IDCheckInformationInput cannot be null!!");
            }
            localIDCheckInformationInput.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformationInput"), factory, xmlWriter);
        }
        if (localAutoNavigationTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "AutoNavigation", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "AutoNavigation");
                }

            } else {
                xmlWriter.writeStartElement("AutoNavigation");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("AutoNavigation cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoNavigation));
            }

            xmlWriter.writeEndElement();
        }
        if (localRecipientAttachmentTracker) {
            if (localRecipientAttachment == null) {
                throw new org.apache.axis2.databinding.ADBException("RecipientAttachment cannot be null!!");
            }
            localRecipientAttachment.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientAttachment"), factory, xmlWriter);
        }
        if (localNoteTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Note", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "Note");
                }

            } else {
                xmlWriter.writeStartElement("Note");
            }

            if (localNote == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Note cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localNote);

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
        if (localTemplateLockedTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "TemplateLocked", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "TemplateLocked");
                }

            } else {
                xmlWriter.writeStartElement("TemplateLocked");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("TemplateLocked cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplateLocked));
            }

            xmlWriter.writeEndElement();
        }
        if (localTemplateRequiredTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "TemplateRequired", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "TemplateRequired");
                }

            } else {
                xmlWriter.writeStartElement("TemplateRequired");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("TemplateRequired cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplateRequired));
            }

            xmlWriter.writeEndElement();
        }
        if (localTemplateAccessCodeRequiredTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "TemplateAccessCodeRequired", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "TemplateAccessCodeRequired");
                }

            } else {
                xmlWriter.writeStartElement("TemplateAccessCodeRequired");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("TemplateAccessCodeRequired cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplateAccessCodeRequired));
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
        if (localUserNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName"));

            if (localUserName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("UserName cannot be null!!");
            }
        }
        if (localSignerNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignerName"));

            if (localSignerName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSignerName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("SignerName cannot be null!!");
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
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Type"));

        if (localType == null) {
            throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");
        }
        elementList.add(localType);

        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccessCode"));

        elementList.add(localAccessCode == null ? null : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccessCode));
        if (localAddAccessCodeToEmailTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddAccessCodeToEmail"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddAccessCodeToEmail));
        }
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequireIDLookup"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequireIDLookup));
        if (localIDCheckConfigurationNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckConfigurationName"));

            if (localIDCheckConfigurationName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIDCheckConfigurationName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("IDCheckConfigurationName cannot be null!!");
            }
        }
        if (localPhoneAuthenticationTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PhoneAuthentication"));

            if (localPhoneAuthentication == null) {
                throw new org.apache.axis2.databinding.ADBException("PhoneAuthentication cannot be null!!");
            }
            elementList.add(localPhoneAuthentication);
        }
        if (localSignatureInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignatureInfo"));

            if (localSignatureInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("SignatureInfo cannot be null!!");
            }
            elementList.add(localSignatureInfo);
        }
        if (localCaptiveInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveInfo"));

            if (localCaptiveInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("CaptiveInfo cannot be null!!");
            }
            elementList.add(localCaptiveInfo);
        }
        if (localCustomFieldsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields"));

            if (localCustomFields == null) {
                throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
            }
            elementList.add(localCustomFields);
        }
        if (localRoutingOrderTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoutingOrder"));

            if (localRoutingOrder != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoutingOrder));
            } else {
                throw new org.apache.axis2.databinding.ADBException("RoutingOrder cannot be null!!");
            }
        }
        if (localIDCheckInformationInputTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformationInput"));

            if (localIDCheckInformationInput == null) {
                throw new org.apache.axis2.databinding.ADBException("IDCheckInformationInput cannot be null!!");
            }
            elementList.add(localIDCheckInformationInput);
        }
        if (localAutoNavigationTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AutoNavigation"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoNavigation));
        }
        if (localRecipientAttachmentTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientAttachment"));

            if (localRecipientAttachment == null) {
                throw new org.apache.axis2.databinding.ADBException("RecipientAttachment cannot be null!!");
            }
            elementList.add(localRecipientAttachment);
        }
        if (localNoteTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Note"));

            if (localNote != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNote));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Note cannot be null!!");
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
        if (localTemplateLockedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateLocked"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplateLocked));
        }
        if (localTemplateRequiredTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateRequired"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplateRequired));
        }
        if (localTemplateAccessCodeRequiredTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateAccessCodeRequired"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplateAccessCodeRequired));
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
        public static Recipient parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            Recipient object = new Recipient();

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

                        if (!"Recipient".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (Recipient) net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(nsUri, type, reader);
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setUserName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignerName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSignerName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Type").equals(reader.getName())) {

                    object.setType(net.docusign.www.api._3_0.RecipientTypeCode.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccessCode").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setAccessCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    } else {

                        reader.getElementText(); // throw away text nodes if
                                                 // any.
                    }

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddAccessCodeToEmail").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setAddAccessCodeToEmail(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequireIDLookup").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setRequireIDLookup(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckConfigurationName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setIDCheckConfigurationName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PhoneAuthentication").equals(reader.getName())) {

                    object.setPhoneAuthentication(net.docusign.www.api._3_0.RecipientPhoneAuthentication.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignatureInfo").equals(reader.getName())) {

                    object.setSignatureInfo(net.docusign.www.api._3_0.RecipientSignatureInfo.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveInfo").equals(reader.getName())) {

                    object.setCaptiveInfo(net.docusign.www.api._3_0.RecipientCaptiveInfo.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields").equals(reader.getName())) {

                    object.setCustomFields(net.docusign.www.api._3_0.ArrayOfString1.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoutingOrder").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setRoutingOrder(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedShort(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformationInput").equals(reader.getName())) {

                    object.setIDCheckInformationInput(net.docusign.www.api._3_0.IDCheckInformationInput.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AutoNavigation").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setAutoNavigation(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientAttachment").equals(reader.getName())) {

                    object.setRecipientAttachment(net.docusign.www.api._3_0.ArrayOfAttachment.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Note").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNote(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateLocked").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTemplateLocked(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateRequired").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTemplateRequired(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateAccessCodeRequired").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTemplateAccessCodeRequired(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

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
