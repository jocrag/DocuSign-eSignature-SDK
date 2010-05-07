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
 * RecipientCorrection bean class
 */

public class RecipientCorrection implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
     * RecipientCorrection Namespace URI = http://www.docusign.net/API/3.0
     * Namespace Prefix = ns1
     */

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.docusign.net/API/3.0")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * field for PreviousUserName
     */

    protected java.lang.String localPreviousUserName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPreviousUserNameTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPreviousUserName() {
        return localPreviousUserName;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            PreviousUserName
     */
    public void setPreviousUserName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localPreviousUserNameTracker = true;
        }
        else {
            localPreviousUserNameTracker = false;

        }

        this.localPreviousUserName = param;

    }

    /**
     * field for PreviousEmail
     */

    protected java.lang.String localPreviousEmail;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPreviousEmailTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPreviousEmail() {
        return localPreviousEmail;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            PreviousEmail
     */
    public void setPreviousEmail(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localPreviousEmailTracker = true;
        }
        else {
            localPreviousEmailTracker = false;

        }

        this.localPreviousEmail = param;

    }

    /**
     * field for PreviousRoutingOrder
     */

    protected org.apache.axis2.databinding.types.UnsignedShort localPreviousRoutingOrder;

    /**
     * Auto generated getter method
     *
     * @return org.apache.axis2.databinding.types.UnsignedShort
     */
    public org.apache.axis2.databinding.types.UnsignedShort getPreviousRoutingOrder() {
        return localPreviousRoutingOrder;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            PreviousRoutingOrder
     */
    public void setPreviousRoutingOrder(org.apache.axis2.databinding.types.UnsignedShort param) {

        this.localPreviousRoutingOrder = param;

    }

    /**
     * field for PreviousSignerName
     */

    protected java.lang.String localPreviousSignerName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPreviousSignerNameTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPreviousSignerName() {
        return localPreviousSignerName;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            PreviousSignerName
     */
    public void setPreviousSignerName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localPreviousSignerNameTracker = true;
        }
        else {
            localPreviousSignerNameTracker = false;

        }

        this.localPreviousSignerName = param;

    }

    /**
     * field for CorrectedUserName
     */

    protected java.lang.String localCorrectedUserName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCorrectedUserNameTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCorrectedUserName() {
        return localCorrectedUserName;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CorrectedUserName
     */
    public void setCorrectedUserName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localCorrectedUserNameTracker = true;
        }
        else {
            localCorrectedUserNameTracker = false;

        }

        this.localCorrectedUserName = param;

    }

    /**
     * field for CorrectedSignerName
     */

    protected java.lang.String localCorrectedSignerName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCorrectedSignerNameTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCorrectedSignerName() {
        return localCorrectedSignerName;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CorrectedSignerName
     */
    public void setCorrectedSignerName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localCorrectedSignerNameTracker = true;
        }
        else {
            localCorrectedSignerNameTracker = false;

        }

        this.localCorrectedSignerName = param;

    }

    /**
     * field for CorrectedEmail
     */

    protected java.lang.String localCorrectedEmail;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCorrectedEmailTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCorrectedEmail() {
        return localCorrectedEmail;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CorrectedEmail
     */
    public void setCorrectedEmail(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localCorrectedEmailTracker = true;
        }
        else {
            localCorrectedEmailTracker = false;

        }

        this.localCorrectedEmail = param;

    }

    /**
     * field for CorrectedCaptiveInfo
     */

    protected net.docusign.www.api._3_0.RecipientCorrectionCorrectedCaptiveInfo localCorrectedCaptiveInfo;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCorrectedCaptiveInfoTracker = false;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.RecipientCorrectionCorrectedCaptiveInfo
     */
    public net.docusign.www.api._3_0.RecipientCorrectionCorrectedCaptiveInfo getCorrectedCaptiveInfo() {
        return localCorrectedCaptiveInfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CorrectedCaptiveInfo
     */
    public void setCorrectedCaptiveInfo(net.docusign.www.api._3_0.RecipientCorrectionCorrectedCaptiveInfo param) {

        if (param != null) {
            // update the setting tracker
            localCorrectedCaptiveInfoTracker = true;
        }
        else {
            localCorrectedCaptiveInfoTracker = false;

        }

        this.localCorrectedCaptiveInfo = param;

    }

    /**
     * field for CorrectedAccessCode
     */

    protected java.lang.String localCorrectedAccessCode;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCorrectedAccessCodeTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCorrectedAccessCode() {
        return localCorrectedAccessCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CorrectedAccessCode
     */
    public void setCorrectedAccessCode(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localCorrectedAccessCodeTracker = true;
        }
        else {
            localCorrectedAccessCodeTracker = false;

        }

        this.localCorrectedAccessCode = param;

    }

    /**
     * field for CorrectedAccessCodeRequired
     */

    protected boolean localCorrectedAccessCodeRequired;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCorrectedAccessCodeRequiredTracker = false;

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getCorrectedAccessCodeRequired() {
        return localCorrectedAccessCodeRequired;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CorrectedAccessCodeRequired
     */
    public void setCorrectedAccessCodeRequired(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localCorrectedAccessCodeRequiredTracker = false;

        }
        else {
            localCorrectedAccessCodeRequiredTracker = true;
        }

        this.localCorrectedAccessCodeRequired = param;

    }

    /**
     * field for CorrectedRequireIDLookup
     */

    protected boolean localCorrectedRequireIDLookup;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCorrectedRequireIDLookupTracker = false;

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getCorrectedRequireIDLookup() {
        return localCorrectedRequireIDLookup;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CorrectedRequireIDLookup
     */
    public void setCorrectedRequireIDLookup(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localCorrectedRequireIDLookupTracker = false;

        }
        else {
            localCorrectedRequireIDLookupTracker = true;
        }

        this.localCorrectedRequireIDLookup = param;

    }

    /**
     * field for CorrectedIDCheckConfigurationName
     */

    protected java.lang.String localCorrectedIDCheckConfigurationName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCorrectedIDCheckConfigurationNameTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCorrectedIDCheckConfigurationName() {
        return localCorrectedIDCheckConfigurationName;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CorrectedIDCheckConfigurationName
     */
    public void setCorrectedIDCheckConfigurationName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localCorrectedIDCheckConfigurationNameTracker = true;
        }
        else {
            localCorrectedIDCheckConfigurationNameTracker = false;

        }

        this.localCorrectedIDCheckConfigurationName = param;

    }

    /**
     * field for CorrectedRoutingOrder
     */

    protected org.apache.axis2.databinding.types.UnsignedShort localCorrectedRoutingOrder;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCorrectedRoutingOrderTracker = false;

    /**
     * Auto generated getter method
     *
     * @return org.apache.axis2.databinding.types.UnsignedShort
     */
    public org.apache.axis2.databinding.types.UnsignedShort getCorrectedRoutingOrder() {
        return localCorrectedRoutingOrder;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CorrectedRoutingOrder
     */
    public void setCorrectedRoutingOrder(org.apache.axis2.databinding.types.UnsignedShort param) {

        if (param != null) {
            // update the setting tracker
            localCorrectedRoutingOrderTracker = true;
        }
        else {
            localCorrectedRoutingOrderTracker = false;

        }

        this.localCorrectedRoutingOrder = param;

    }

    /**
     * field for CorrectedAutoNavigation
     */

    protected boolean localCorrectedAutoNavigation;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCorrectedAutoNavigationTracker = false;

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getCorrectedAutoNavigation() {
        return localCorrectedAutoNavigation;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CorrectedAutoNavigation
     */
    public void setCorrectedAutoNavigation(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localCorrectedAutoNavigationTracker = false;

        }
        else {
            localCorrectedAutoNavigationTracker = true;
        }

        this.localCorrectedAutoNavigation = param;

    }

    /**
     * field for CorrectedIDCheckInformationInput
     */

    protected net.docusign.www.api._3_0.IDCheckInformationInput localCorrectedIDCheckInformationInput;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCorrectedIDCheckInformationInputTracker = false;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.IDCheckInformationInput
     */
    public net.docusign.www.api._3_0.IDCheckInformationInput getCorrectedIDCheckInformationInput() {
        return localCorrectedIDCheckInformationInput;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CorrectedIDCheckInformationInput
     */
    public void setCorrectedIDCheckInformationInput(net.docusign.www.api._3_0.IDCheckInformationInput param) {

        if (param != null) {
            // update the setting tracker
            localCorrectedIDCheckInformationInputTracker = true;
        }
        else {
            localCorrectedIDCheckInformationInputTracker = false;

        }

        this.localCorrectedIDCheckInformationInput = param;

    }

    /**
     * field for Resend
     */

    protected boolean localResend;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localResendTracker = false;

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getResend() {
        return localResend;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            Resend
     */
    public void setResend(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localResendTracker = false;

        }
        else {
            localResendTracker = true;
        }

        this.localResend = param;

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
                RecipientCorrection.this.serialize(parentQName, factory, xmlWriter);
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
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":RecipientCorrection", xmlWriter);
            }
            else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "RecipientCorrection", xmlWriter);
            }

        }
        if (localPreviousUserNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "PreviousUserName", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "PreviousUserName");
                }

            }
            else {
                xmlWriter.writeStartElement("PreviousUserName");
            }

            if (localPreviousUserName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("PreviousUserName cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localPreviousUserName);

            }

            xmlWriter.writeEndElement();
        }
        if (localPreviousEmailTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "PreviousEmail", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "PreviousEmail");
                }

            }
            else {
                xmlWriter.writeStartElement("PreviousEmail");
            }

            if (localPreviousEmail == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("PreviousEmail cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localPreviousEmail);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "PreviousRoutingOrder", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            }
            else {
                xmlWriter.writeStartElement(namespace, "PreviousRoutingOrder");
            }

        }
        else {
            xmlWriter.writeStartElement("PreviousRoutingOrder");
        }

        if (localPreviousRoutingOrder == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("PreviousRoutingOrder cannot be null!!");

        }
        else {

            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreviousRoutingOrder));

        }

        xmlWriter.writeEndElement();
        if (localPreviousSignerNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "PreviousSignerName", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "PreviousSignerName");
                }

            }
            else {
                xmlWriter.writeStartElement("PreviousSignerName");
            }

            if (localPreviousSignerName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("PreviousSignerName cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localPreviousSignerName);

            }

            xmlWriter.writeEndElement();
        }
        if (localCorrectedUserNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CorrectedUserName", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "CorrectedUserName");
                }

            }
            else {
                xmlWriter.writeStartElement("CorrectedUserName");
            }

            if (localCorrectedUserName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CorrectedUserName cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localCorrectedUserName);

            }

            xmlWriter.writeEndElement();
        }
        if (localCorrectedSignerNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CorrectedSignerName", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "CorrectedSignerName");
                }

            }
            else {
                xmlWriter.writeStartElement("CorrectedSignerName");
            }

            if (localCorrectedSignerName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CorrectedSignerName cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localCorrectedSignerName);

            }

            xmlWriter.writeEndElement();
        }
        if (localCorrectedEmailTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CorrectedEmail", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "CorrectedEmail");
                }

            }
            else {
                xmlWriter.writeStartElement("CorrectedEmail");
            }

            if (localCorrectedEmail == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CorrectedEmail cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localCorrectedEmail);

            }

            xmlWriter.writeEndElement();
        }
        if (localCorrectedCaptiveInfoTracker) {
            if (localCorrectedCaptiveInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("CorrectedCaptiveInfo cannot be null!!");
            }
            localCorrectedCaptiveInfo.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedCaptiveInfo"), factory, xmlWriter);
        }
        if (localCorrectedAccessCodeTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CorrectedAccessCode", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "CorrectedAccessCode");
                }

            }
            else {
                xmlWriter.writeStartElement("CorrectedAccessCode");
            }

            if (localCorrectedAccessCode == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CorrectedAccessCode cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localCorrectedAccessCode);

            }

            xmlWriter.writeEndElement();
        }
        if (localCorrectedAccessCodeRequiredTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CorrectedAccessCodeRequired", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "CorrectedAccessCodeRequired");
                }

            }
            else {
                xmlWriter.writeStartElement("CorrectedAccessCodeRequired");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("CorrectedAccessCodeRequired cannot be null!!");

            }
            else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedAccessCodeRequired));
            }

            xmlWriter.writeEndElement();
        }
        if (localCorrectedRequireIDLookupTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CorrectedRequireIDLookup", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "CorrectedRequireIDLookup");
                }

            }
            else {
                xmlWriter.writeStartElement("CorrectedRequireIDLookup");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("CorrectedRequireIDLookup cannot be null!!");

            }
            else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedRequireIDLookup));
            }

            xmlWriter.writeEndElement();
        }
        if (localCorrectedIDCheckConfigurationNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CorrectedIDCheckConfigurationName", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "CorrectedIDCheckConfigurationName");
                }

            }
            else {
                xmlWriter.writeStartElement("CorrectedIDCheckConfigurationName");
            }

            if (localCorrectedIDCheckConfigurationName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CorrectedIDCheckConfigurationName cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localCorrectedIDCheckConfigurationName);

            }

            xmlWriter.writeEndElement();
        }
        if (localCorrectedRoutingOrderTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CorrectedRoutingOrder", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "CorrectedRoutingOrder");
                }

            }
            else {
                xmlWriter.writeStartElement("CorrectedRoutingOrder");
            }

            if (localCorrectedRoutingOrder == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CorrectedRoutingOrder cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedRoutingOrder));

            }

            xmlWriter.writeEndElement();
        }
        if (localCorrectedAutoNavigationTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CorrectedAutoNavigation", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "CorrectedAutoNavigation");
                }

            }
            else {
                xmlWriter.writeStartElement("CorrectedAutoNavigation");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("CorrectedAutoNavigation cannot be null!!");

            }
            else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedAutoNavigation));
            }

            xmlWriter.writeEndElement();
        }
        if (localCorrectedIDCheckInformationInputTracker) {
            if (localCorrectedIDCheckInformationInput == null) {
                throw new org.apache.axis2.databinding.ADBException("CorrectedIDCheckInformationInput cannot be null!!");
            }
            localCorrectedIDCheckInformationInput.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedIDCheckInformationInput"), factory, xmlWriter);
        }
        if (localResendTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Resend", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "Resend");
                }

            }
            else {
                xmlWriter.writeStartElement("Resend");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("Resend cannot be null!!");

            }
            else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResend));
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

        if (localPreviousUserNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PreviousUserName"));

            if (localPreviousUserName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreviousUserName));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("PreviousUserName cannot be null!!");
            }
        }
        if (localPreviousEmailTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PreviousEmail"));

            if (localPreviousEmail != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreviousEmail));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("PreviousEmail cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PreviousRoutingOrder"));

        if (localPreviousRoutingOrder != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreviousRoutingOrder));
        }
        else {
            throw new org.apache.axis2.databinding.ADBException("PreviousRoutingOrder cannot be null!!");
        }
        if (localPreviousSignerNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PreviousSignerName"));

            if (localPreviousSignerName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreviousSignerName));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("PreviousSignerName cannot be null!!");
            }
        }
        if (localCorrectedUserNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedUserName"));

            if (localCorrectedUserName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedUserName));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("CorrectedUserName cannot be null!!");
            }
        }
        if (localCorrectedSignerNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedSignerName"));

            if (localCorrectedSignerName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedSignerName));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("CorrectedSignerName cannot be null!!");
            }
        }
        if (localCorrectedEmailTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedEmail"));

            if (localCorrectedEmail != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedEmail));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("CorrectedEmail cannot be null!!");
            }
        }
        if (localCorrectedCaptiveInfoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedCaptiveInfo"));

            if (localCorrectedCaptiveInfo == null) {
                throw new org.apache.axis2.databinding.ADBException("CorrectedCaptiveInfo cannot be null!!");
            }
            elementList.add(localCorrectedCaptiveInfo);
        }
        if (localCorrectedAccessCodeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedAccessCode"));

            if (localCorrectedAccessCode != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedAccessCode));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("CorrectedAccessCode cannot be null!!");
            }
        }
        if (localCorrectedAccessCodeRequiredTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedAccessCodeRequired"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedAccessCodeRequired));
        }
        if (localCorrectedRequireIDLookupTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedRequireIDLookup"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedRequireIDLookup));
        }
        if (localCorrectedIDCheckConfigurationNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedIDCheckConfigurationName"));

            if (localCorrectedIDCheckConfigurationName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedIDCheckConfigurationName));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("CorrectedIDCheckConfigurationName cannot be null!!");
            }
        }
        if (localCorrectedRoutingOrderTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedRoutingOrder"));

            if (localCorrectedRoutingOrder != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedRoutingOrder));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("CorrectedRoutingOrder cannot be null!!");
            }
        }
        if (localCorrectedAutoNavigationTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedAutoNavigation"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrectedAutoNavigation));
        }
        if (localCorrectedIDCheckInformationInputTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedIDCheckInformationInput"));

            if (localCorrectedIDCheckInformationInput == null) {
                throw new org.apache.axis2.databinding.ADBException("CorrectedIDCheckInformationInput cannot be null!!");
            }
            elementList.add(localCorrectedIDCheckInformationInput);
        }
        if (localResendTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Resend"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResend));
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
        public static RecipientCorrection parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RecipientCorrection object = new RecipientCorrection();

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

                        if (!"RecipientCorrection".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RecipientCorrection) net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(nsUri, type, reader);
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PreviousUserName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setPreviousUserName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PreviousEmail").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setPreviousEmail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PreviousRoutingOrder").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setPreviousRoutingOrder(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedShort(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PreviousSignerName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setPreviousSignerName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedUserName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCorrectedUserName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedSignerName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCorrectedSignerName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedEmail").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCorrectedEmail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedCaptiveInfo").equals(reader.getName())) {

                    object.setCorrectedCaptiveInfo(net.docusign.www.api._3_0.RecipientCorrectionCorrectedCaptiveInfo.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedAccessCode").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCorrectedAccessCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedAccessCodeRequired").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCorrectedAccessCodeRequired(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedRequireIDLookup").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCorrectedRequireIDLookup(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedIDCheckConfigurationName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCorrectedIDCheckConfigurationName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedRoutingOrder").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCorrectedRoutingOrder(org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedShort(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedAutoNavigation").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCorrectedAutoNavigation(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedIDCheckInformationInput").equals(reader.getName())) {

                    object.setCorrectedIDCheckInformationInput(net.docusign.www.api._3_0.IDCheckInformationInput.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Resend").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setResend(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

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
