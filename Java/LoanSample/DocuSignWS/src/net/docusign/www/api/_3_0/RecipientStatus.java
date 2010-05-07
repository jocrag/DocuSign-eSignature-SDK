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
 * RecipientStatus bean class
 */

public class RecipientStatus implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
     * RecipientStatus Namespace URI = http://www.docusign.net/API/3.0 Namespace
     * Prefix = ns1
     */

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.docusign.net/API/3.0")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
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
        }
        else {
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
        }
        else {
            localUserNameTracker = false;

        }

        this.localUserName = param;

    }

    /**
     * field for RoutingOrder
     */

    protected org.apache.axis2.databinding.types.UnsignedShort localRoutingOrder;

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

        this.localRoutingOrder = param;

    }

    /**
     * field for Sent
     */

    protected java.util.Calendar localSent;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSentTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getSent() {
        return localSent;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            Sent
     */
    public void setSent(java.util.Calendar param) {

        if (param != null) {
            // update the setting tracker
            localSentTracker = true;
        }
        else {
            localSentTracker = false;

        }

        this.localSent = param;

    }

    /**
     * field for Delivered
     */

    protected java.util.Calendar localDelivered;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDeliveredTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getDelivered() {
        return localDelivered;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            Delivered
     */
    public void setDelivered(java.util.Calendar param) {

        if (param != null) {
            // update the setting tracker
            localDeliveredTracker = true;
        }
        else {
            localDeliveredTracker = false;

        }

        this.localDelivered = param;

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
        }
        else {
            localSignedTracker = false;

        }

        this.localSigned = param;

    }

    /**
     * field for Declined
     */

    protected java.util.Calendar localDeclined;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDeclinedTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getDeclined() {
        return localDeclined;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            Declined
     */
    public void setDeclined(java.util.Calendar param) {

        if (param != null) {
            // update the setting tracker
            localDeclinedTracker = true;
        }
        else {
            localDeclinedTracker = false;

        }

        this.localDeclined = param;

    }

    /**
     * field for DeclineReason
     */

    protected java.lang.String localDeclineReason;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDeclineReason() {
        return localDeclineReason;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            DeclineReason
     */
    public void setDeclineReason(java.lang.String param) {

        this.localDeclineReason = param;

    }

    /**
     * field for Status
     */

    protected net.docusign.www.api._3_0.RecipientStatusCode localStatus;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.RecipientStatusCode
     */
    public net.docusign.www.api._3_0.RecipientStatusCode getStatus() {
        return localStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            Status
     */
    public void setStatus(net.docusign.www.api._3_0.RecipientStatusCode param) {

        this.localStatus = param;

    }

    /**
     * field for RecipientIPAddress
     */

    protected java.lang.String localRecipientIPAddress;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRecipientIPAddressTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRecipientIPAddress() {
        return localRecipientIPAddress;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            RecipientIPAddress
     */
    public void setRecipientIPAddress(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localRecipientIPAddressTracker = true;
        }
        else {
            localRecipientIPAddressTracker = false;

        }

        this.localRecipientIPAddress = param;

    }

    /**
     * field for ClientUserId
     */

    protected java.lang.String localClientUserId;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localClientUserIdTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getClientUserId() {
        return localClientUserId;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            ClientUserId
     */
    public void setClientUserId(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localClientUserIdTracker = true;
        }
        else {
            localClientUserIdTracker = false;

        }

        this.localClientUserId = param;

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

        }
        else {
            localAutoNavigationTracker = true;
        }

        this.localAutoNavigation = param;

    }

    /**
     * field for IDCheckInformation
     */

    protected net.docusign.www.api._3_0.IDCheckInformation localIDCheckInformation;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localIDCheckInformationTracker = false;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.IDCheckInformation
     */
    public net.docusign.www.api._3_0.IDCheckInformation getIDCheckInformation() {
        return localIDCheckInformation;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            IDCheckInformation
     */
    public void setIDCheckInformation(net.docusign.www.api._3_0.IDCheckInformation param) {

        if (param != null) {
            // update the setting tracker
            localIDCheckInformationTracker = true;
        }
        else {
            localIDCheckInformationTracker = false;

        }

        this.localIDCheckInformation = param;

    }

    /**
     * field for RecipientAuthenticationStatus
     */

    protected net.docusign.www.api._3_0.AuthenticationStatus localRecipientAuthenticationStatus;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRecipientAuthenticationStatusTracker = false;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.AuthenticationStatus
     */
    public net.docusign.www.api._3_0.AuthenticationStatus getRecipientAuthenticationStatus() {
        return localRecipientAuthenticationStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            RecipientAuthenticationStatus
     */
    public void setRecipientAuthenticationStatus(net.docusign.www.api._3_0.AuthenticationStatus param) {

        if (param != null) {
            // update the setting tracker
            localRecipientAuthenticationStatusTracker = true;
        }
        else {
            localRecipientAuthenticationStatusTracker = false;

        }

        this.localRecipientAuthenticationStatus = param;

    }

    /**
     * field for CustomFields
     */

    protected net.docusign.www.api._3_0.ArrayOfString localCustomFields;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomFieldsTracker = false;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.ArrayOfString
     */
    public net.docusign.www.api._3_0.ArrayOfString getCustomFields() {
        return localCustomFields;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CustomFields
     */
    public void setCustomFields(net.docusign.www.api._3_0.ArrayOfString param) {

        if (param != null) {
            // update the setting tracker
            localCustomFieldsTracker = true;
        }
        else {
            localCustomFieldsTracker = false;

        }

        this.localCustomFields = param;

    }

    /**
     * field for TabStatuses
     */

    protected net.docusign.www.api._3_0.ArrayOfTabStatus localTabStatuses;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTabStatusesTracker = false;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.ArrayOfTabStatus
     */
    public net.docusign.www.api._3_0.ArrayOfTabStatus getTabStatuses() {
        return localTabStatuses;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            TabStatuses
     */
    public void setTabStatuses(net.docusign.www.api._3_0.ArrayOfTabStatus param) {

        if (param != null) {
            // update the setting tracker
            localTabStatusesTracker = true;
        }
        else {
            localTabStatusesTracker = false;

        }

        this.localTabStatuses = param;

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
        }
        else {
            localRecipientAttachmentTracker = false;

        }

        this.localRecipientAttachment = param;

    }

    /**
     * field for AccountStatus
     */

    protected java.lang.String localAccountStatus;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAccountStatusTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAccountStatus() {
        return localAccountStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            AccountStatus
     */
    public void setAccountStatus(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localAccountStatusTracker = true;
        }
        else {
            localAccountStatusTracker = false;

        }

        this.localAccountStatus = param;

    }

    /**
     * field for EsignAgreementInformation
     */

    protected net.docusign.www.api._3_0.RecipientStatusEsignAgreementInformation localEsignAgreementInformation;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localEsignAgreementInformationTracker = false;

    /**
     * Auto generated getter method
     *
     * @return
     *         net.docusign.www.api._3_0.RecipientStatusEsignAgreementInformation
     */
    public net.docusign.www.api._3_0.RecipientStatusEsignAgreementInformation getEsignAgreementInformation() {
        return localEsignAgreementInformation;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            EsignAgreementInformation
     */
    public void setEsignAgreementInformation(net.docusign.www.api._3_0.RecipientStatusEsignAgreementInformation param) {

        if (param != null) {
            // update the setting tracker
            localEsignAgreementInformationTracker = true;
        }
        else {
            localEsignAgreementInformationTracker = false;

        }

        this.localEsignAgreementInformation = param;

    }

    /**
     * field for FormData
     */

    protected net.docusign.www.api._3_0.FormData localFormData;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localFormDataTracker = false;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.FormData
     */
    public net.docusign.www.api._3_0.FormData getFormData() {
        return localFormData;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            FormData
     */
    public void setFormData(net.docusign.www.api._3_0.FormData param) {

        if (param != null) {
            // update the setting tracker
            localFormDataTracker = true;
        }
        else {
            localFormDataTracker = false;

        }

        this.localFormData = param;

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
        }
        catch (java.lang.IllegalArgumentException e) {
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
                RecipientStatus.this.serialize(parentQName, factory, xmlWriter);
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
            }
            else {
                if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        else {
            xmlWriter.writeStartElement(parentQName.getLocalPart());
        }

        if (serializeType) {

            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.docusign.net/API/3.0");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":RecipientStatus", xmlWriter);
            }
            else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "RecipientStatus", xmlWriter);
            }

        }

        if (localType == null) {
            throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");
        }
        localType.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Type"), factory, xmlWriter);
        if (localEmailTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Email", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "Email");
                }

            }
            else {
                xmlWriter.writeStartElement("Email");
            }

            if (localEmail == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Email cannot be null!!");

            }
            else {

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

                }
                else {
                    xmlWriter.writeStartElement(namespace, "UserName");
                }

            }
            else {
                xmlWriter.writeStartElement("UserName");
            }

            if (localUserName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("UserName cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localUserName);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "RoutingOrder", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            }
            else {
                xmlWriter.writeStartElement(namespace, "RoutingOrder");
            }

        }
        else {
            xmlWriter.writeStartElement("RoutingOrder");
        }

        if (localRoutingOrder == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("RoutingOrder cannot be null!!");

        }
        else {

            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoutingOrder));

        }

        xmlWriter.writeEndElement();
        if (localSentTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Sent", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "Sent");
                }

            }
            else {
                xmlWriter.writeStartElement("Sent");
            }

            if (localSent == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Sent cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSent));

            }

            xmlWriter.writeEndElement();
        }
        if (localDeliveredTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Delivered", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "Delivered");
                }

            }
            else {
                xmlWriter.writeStartElement("Delivered");
            }

            if (localDelivered == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Delivered cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDelivered));

            }

            xmlWriter.writeEndElement();
        }
        if (localSignedTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Signed", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "Signed");
                }

            }
            else {
                xmlWriter.writeStartElement("Signed");
            }

            if (localSigned == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Signed cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSigned));

            }

            xmlWriter.writeEndElement();
        }
        if (localDeclinedTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Declined", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "Declined");
                }

            }
            else {
                xmlWriter.writeStartElement("Declined");
            }

            if (localDeclined == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Declined cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeclined));

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "DeclineReason", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            }
            else {
                xmlWriter.writeStartElement(namespace, "DeclineReason");
            }

        }
        else {
            xmlWriter.writeStartElement("DeclineReason");
        }

        if (localDeclineReason == null) {
            // write the nil attribute

            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        }
        else {

            xmlWriter.writeCharacters(localDeclineReason);

        }

        xmlWriter.writeEndElement();

        if (localStatus == null) {
            throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
        }
        localStatus.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"), factory, xmlWriter);
        if (localRecipientIPAddressTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "RecipientIPAddress", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "RecipientIPAddress");
                }

            }
            else {
                xmlWriter.writeStartElement("RecipientIPAddress");
            }

            if (localRecipientIPAddress == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("RecipientIPAddress cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localRecipientIPAddress);

            }

            xmlWriter.writeEndElement();
        }
        if (localClientUserIdTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ClientUserId", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "ClientUserId");
                }

            }
            else {
                xmlWriter.writeStartElement("ClientUserId");
            }

            if (localClientUserId == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ClientUserId cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localClientUserId);

            }

            xmlWriter.writeEndElement();
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

                }
                else {
                    xmlWriter.writeStartElement(namespace, "AutoNavigation");
                }

            }
            else {
                xmlWriter.writeStartElement("AutoNavigation");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("AutoNavigation cannot be null!!");

            }
            else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoNavigation));
            }

            xmlWriter.writeEndElement();
        }
        if (localIDCheckInformationTracker) {
            if (localIDCheckInformation == null) {
                throw new org.apache.axis2.databinding.ADBException("IDCheckInformation cannot be null!!");
            }
            localIDCheckInformation.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformation"), factory, xmlWriter);
        }
        if (localRecipientAuthenticationStatusTracker) {
            if (localRecipientAuthenticationStatus == null) {
                throw new org.apache.axis2.databinding.ADBException("RecipientAuthenticationStatus cannot be null!!");
            }
            localRecipientAuthenticationStatus.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientAuthenticationStatus"), factory, xmlWriter);
        }
        if (localCustomFieldsTracker) {
            if (localCustomFields == null) {
                throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
            }
            localCustomFields.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields"), factory, xmlWriter);
        }
        if (localTabStatusesTracker) {
            if (localTabStatuses == null) {
                throw new org.apache.axis2.databinding.ADBException("TabStatuses cannot be null!!");
            }
            localTabStatuses.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabStatuses"), factory, xmlWriter);
        }
        if (localRecipientAttachmentTracker) {
            if (localRecipientAttachment == null) {
                throw new org.apache.axis2.databinding.ADBException("RecipientAttachment cannot be null!!");
            }
            localRecipientAttachment.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientAttachment"), factory, xmlWriter);
        }
        if (localAccountStatusTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "AccountStatus", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "AccountStatus");
                }

            }
            else {
                xmlWriter.writeStartElement("AccountStatus");
            }

            if (localAccountStatus == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("AccountStatus cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localAccountStatus);

            }

            xmlWriter.writeEndElement();
        }
        if (localEsignAgreementInformationTracker) {
            if (localEsignAgreementInformation == null) {
                throw new org.apache.axis2.databinding.ADBException("EsignAgreementInformation cannot be null!!");
            }
            localEsignAgreementInformation.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EsignAgreementInformation"), factory, xmlWriter);
        }
        if (localFormDataTracker) {
            if (localFormData == null) {
                throw new org.apache.axis2.databinding.ADBException("FormData cannot be null!!");
            }
            localFormData.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FormData"), factory, xmlWriter);
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
        }
        else {
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
        }
        else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        }
        else {
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
            }
            else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }

        }
        else {
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
                    }
                    else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                else {
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

        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Type"));

        if (localType == null) {
            throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");
        }
        elementList.add(localType);
        if (localEmailTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Email"));

            if (localEmail != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmail));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("Email cannot be null!!");
            }
        }
        if (localUserNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName"));

            if (localUserName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("UserName cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoutingOrder"));

        if (localRoutingOrder != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoutingOrder));
        }
        else {
            throw new org.apache.axis2.databinding.ADBException("RoutingOrder cannot be null!!");
        }
        if (localSentTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Sent"));

            if (localSent != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSent));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("Sent cannot be null!!");
            }
        }
        if (localDeliveredTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Delivered"));

            if (localDelivered != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDelivered));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("Delivered cannot be null!!");
            }
        }
        if (localSignedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Signed"));

            if (localSigned != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSigned));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("Signed cannot be null!!");
            }
        }
        if (localDeclinedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Declined"));

            if (localDeclined != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeclined));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("Declined cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeclineReason"));

        elementList.add(localDeclineReason == null ? null : org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeclineReason));

        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"));

        if (localStatus == null) {
            throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
        }
        elementList.add(localStatus);
        if (localRecipientIPAddressTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientIPAddress"));

            if (localRecipientIPAddress != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecipientIPAddress));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("RecipientIPAddress cannot be null!!");
            }
        }
        if (localClientUserIdTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientUserId"));

            if (localClientUserId != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientUserId));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("ClientUserId cannot be null!!");
            }
        }
        if (localAutoNavigationTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AutoNavigation"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoNavigation));
        }
        if (localIDCheckInformationTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformation"));

            if (localIDCheckInformation == null) {
                throw new org.apache.axis2.databinding.ADBException("IDCheckInformation cannot be null!!");
            }
            elementList.add(localIDCheckInformation);
        }
        if (localRecipientAuthenticationStatusTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientAuthenticationStatus"));

            if (localRecipientAuthenticationStatus == null) {
                throw new org.apache.axis2.databinding.ADBException("RecipientAuthenticationStatus cannot be null!!");
            }
            elementList.add(localRecipientAuthenticationStatus);
        }
        if (localCustomFieldsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields"));

            if (localCustomFields == null) {
                throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
            }
            elementList.add(localCustomFields);
        }
        if (localTabStatusesTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabStatuses"));

            if (localTabStatuses == null) {
                throw new org.apache.axis2.databinding.ADBException("TabStatuses cannot be null!!");
            }
            elementList.add(localTabStatuses);
        }
        if (localRecipientAttachmentTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientAttachment"));

            if (localRecipientAttachment == null) {
                throw new org.apache.axis2.databinding.ADBException("RecipientAttachment cannot be null!!");
            }
            elementList.add(localRecipientAttachment);
        }
        if (localAccountStatusTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountStatus"));

            if (localAccountStatus != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccountStatus));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("AccountStatus cannot be null!!");
            }
        }
        if (localEsignAgreementInformationTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EsignAgreementInformation"));

            if (localEsignAgreementInformation == null) {
                throw new org.apache.axis2.databinding.ADBException("EsignAgreementInformation cannot be null!!");
            }
            elementList.add(localEsignAgreementInformation);
        }
        if (localFormDataTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FormData"));

            if (localFormData == null) {
                throw new org.apache.axis2.databinding.ADBException("FormData cannot be null!!");
            }
            elementList.add(localFormData);
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
        public static RecipientStatus parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RecipientStatus object = new RecipientStatus();

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

                        if (!"RecipientStatus".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RecipientStatus) net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(nsUri, type, reader);
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoutingOrder").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setRoutingOrder(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedShort(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Sent").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSent(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Delivered").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDelivered(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Declined").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDeclined(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeclineReason").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

                        java.lang.String content = reader.getElementText();

                        object.setDeclineReason(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    }
                    else {

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status").equals(reader.getName())) {

                    object.setStatus(net.docusign.www.api._3_0.RecipientStatusCode.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientIPAddress").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setRecipientIPAddress(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientUserId").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setClientUserId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformation").equals(reader.getName())) {

                    object.setIDCheckInformation(net.docusign.www.api._3_0.IDCheckInformation.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientAuthenticationStatus").equals(reader.getName())) {

                    object.setRecipientAuthenticationStatus(net.docusign.www.api._3_0.AuthenticationStatus.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields").equals(reader.getName())) {

                    object.setCustomFields(net.docusign.www.api._3_0.ArrayOfString.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabStatuses").equals(reader.getName())) {

                    object.setTabStatuses(net.docusign.www.api._3_0.ArrayOfTabStatus.Factory.parse(reader));

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountStatus").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setAccountStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EsignAgreementInformation").equals(reader.getName())) {

                    object.setEsignAgreementInformation(net.docusign.www.api._3_0.RecipientStatusEsignAgreementInformation.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FormData").equals(reader.getName())) {

                    object.setFormData(net.docusign.www.api._3_0.FormData.Factory.parse(reader));

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

            }
            catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }// end of factory class

}
