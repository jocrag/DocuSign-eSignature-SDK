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
 * EnvelopeStatus bean class
 */

public class EnvelopeStatus implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name =
     * EnvelopeStatus Namespace URI = http://www.docusign.net/API/3.0 Namespace
     * Prefix = ns1
     */

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.docusign.net/API/3.0")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * field for RecipientStatuses
     */

    protected net.docusign.www.api._3_0.ArrayOfRecipientStatus localRecipientStatuses;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.ArrayOfRecipientStatus
     */
    public net.docusign.www.api._3_0.ArrayOfRecipientStatus getRecipientStatuses() {
        return localRecipientStatuses;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            RecipientStatuses
     */
    public void setRecipientStatuses(net.docusign.www.api._3_0.ArrayOfRecipientStatus param) {

        this.localRecipientStatuses = param;

    }

    /**
     * field for TimeGenerated
     */

    protected java.util.Calendar localTimeGenerated;

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getTimeGenerated() {
        return localTimeGenerated;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            TimeGenerated
     */
    public void setTimeGenerated(java.util.Calendar param) {

        this.localTimeGenerated = param;

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
        }
        else {
            localEnvelopeIDTracker = false;

        }

        this.localEnvelopeID = param;

    }

    /**
     * field for Subject
     */

    protected java.lang.String localSubject;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSubjectTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSubject() {
        return localSubject;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            Subject
     */
    public void setSubject(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localSubjectTracker = true;
        }
        else {
            localSubjectTracker = false;

        }

        this.localSubject = param;

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
     * field for Status
     */

    protected net.docusign.www.api._3_0.EnvelopeStatusCode localStatus;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.EnvelopeStatusCode
     */
    public net.docusign.www.api._3_0.EnvelopeStatusCode getStatus() {
        return localStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            Status
     */
    public void setStatus(net.docusign.www.api._3_0.EnvelopeStatusCode param) {

        this.localStatus = param;

    }

    /**
     * field for Created
     */

    protected java.util.Calendar localCreated;

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

        this.localCreated = param;

    }

    /**
     * field for Deleted
     */

    protected java.util.Calendar localDeleted;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDeletedTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getDeleted() {
        return localDeleted;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            Deleted
     */
    public void setDeleted(java.util.Calendar param) {

        if (param != null) {
            // update the setting tracker
            localDeletedTracker = true;
        }
        else {
            localDeletedTracker = false;

        }

        this.localDeleted = param;

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
     * field for Completed
     */

    protected java.util.Calendar localCompleted;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCompletedTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getCompleted() {
        return localCompleted;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            Completed
     */
    public void setCompleted(java.util.Calendar param) {

        if (param != null) {
            // update the setting tracker
            localCompletedTracker = true;
        }
        else {
            localCompletedTracker = false;

        }

        this.localCompleted = param;

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
     * field for TimedOut
     */

    protected java.util.Calendar localTimedOut;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTimedOutTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getTimedOut() {
        return localTimedOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            TimedOut
     */
    public void setTimedOut(java.util.Calendar param) {

        if (param != null) {
            // update the setting tracker
            localTimedOutTracker = true;
        }
        else {
            localTimedOutTracker = false;

        }

        this.localTimedOut = param;

    }

    /**
     * field for ACStatus
     */

    protected java.lang.String localACStatus;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localACStatusTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getACStatus() {
        return localACStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            ACStatus
     */
    public void setACStatus(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localACStatusTracker = true;
        }
        else {
            localACStatusTracker = false;

        }

        this.localACStatus = param;

    }

    /**
     * field for ACStatusDate
     */

    protected java.util.Calendar localACStatusDate;

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getACStatusDate() {
        return localACStatusDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            ACStatusDate
     */
    public void setACStatusDate(java.util.Calendar param) {

        this.localACStatusDate = param;

    }

    /**
     * field for ACHolder
     */

    protected java.lang.String localACHolder;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localACHolderTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getACHolder() {
        return localACHolder;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            ACHolder
     */
    public void setACHolder(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localACHolderTracker = true;
        }
        else {
            localACHolderTracker = false;

        }

        this.localACHolder = param;

    }

    /**
     * field for ACHolderEmail
     */

    protected java.lang.String localACHolderEmail;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localACHolderEmailTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getACHolderEmail() {
        return localACHolderEmail;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            ACHolderEmail
     */
    public void setACHolderEmail(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localACHolderEmailTracker = true;
        }
        else {
            localACHolderEmailTracker = false;

        }

        this.localACHolderEmail = param;

    }

    /**
     * field for ACHolderLocation
     */

    protected java.lang.String localACHolderLocation;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localACHolderLocationTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getACHolderLocation() {
        return localACHolderLocation;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            ACHolderLocation
     */
    public void setACHolderLocation(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localACHolderLocationTracker = true;
        }
        else {
            localACHolderLocationTracker = false;

        }

        this.localACHolderLocation = param;

    }

    /**
     * field for SigningLocation
     */

    protected net.docusign.www.api._3_0.SigningLocationCode localSigningLocation;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.SigningLocationCode
     */
    public net.docusign.www.api._3_0.SigningLocationCode getSigningLocation() {
        return localSigningLocation;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            SigningLocation
     */
    public void setSigningLocation(net.docusign.www.api._3_0.SigningLocationCode param) {

        this.localSigningLocation = param;

    }

    /**
     * field for SenderIPAddress
     */

    protected java.lang.String localSenderIPAddress;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSenderIPAddressTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSenderIPAddress() {
        return localSenderIPAddress;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            SenderIPAddress
     */
    public void setSenderIPAddress(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localSenderIPAddressTracker = true;
        }
        else {
            localSenderIPAddressTracker = false;

        }

        this.localSenderIPAddress = param;

    }

    /**
     * field for EnvelopePDFHash
     */

    protected java.lang.String localEnvelopePDFHash;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localEnvelopePDFHashTracker = false;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEnvelopePDFHash() {
        return localEnvelopePDFHash;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            EnvelopePDFHash
     */
    public void setEnvelopePDFHash(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localEnvelopePDFHashTracker = true;
        }
        else {
            localEnvelopePDFHashTracker = false;

        }

        this.localEnvelopePDFHash = param;

    }

    /**
     * field for CustomFields
     */

    protected net.docusign.www.api._3_0.ArrayOfCustomField localCustomFields;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomFieldsTracker = false;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.ArrayOfCustomField
     */
    public net.docusign.www.api._3_0.ArrayOfCustomField getCustomFields() {
        return localCustomFields;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            CustomFields
     */
    public void setCustomFields(net.docusign.www.api._3_0.ArrayOfCustomField param) {

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
     * field for VaultingDetails
     */

    protected net.docusign.www.api._3_0.VaultingDetails localVaultingDetails;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localVaultingDetailsTracker = false;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.VaultingDetails
     */
    public net.docusign.www.api._3_0.VaultingDetails getVaultingDetails() {
        return localVaultingDetails;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            VaultingDetails
     */
    public void setVaultingDetails(net.docusign.www.api._3_0.VaultingDetails param) {

        if (param != null) {
            // update the setting tracker
            localVaultingDetailsTracker = true;
        }
        else {
            localVaultingDetailsTracker = false;

        }

        this.localVaultingDetails = param;

    }

    /**
     * field for AutoNavigation
     */

    protected boolean localAutoNavigation;

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

        this.localAutoNavigation = param;

    }

    /**
     * field for EnvelopeIdStamping
     */

    protected boolean localEnvelopeIdStamping;

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getEnvelopeIdStamping() {
        return localEnvelopeIdStamping;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            EnvelopeIdStamping
     */
    public void setEnvelopeIdStamping(boolean param) {

        this.localEnvelopeIdStamping = param;

    }

    /**
     * field for AuthoritativeCopy
     */

    protected boolean localAuthoritativeCopy;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAuthoritativeCopyTracker = false;

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getAuthoritativeCopy() {
        return localAuthoritativeCopy;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            AuthoritativeCopy
     */
    public void setAuthoritativeCopy(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localAuthoritativeCopyTracker = false;

        }
        else {
            localAuthoritativeCopyTracker = true;
        }

        this.localAuthoritativeCopy = param;

    }

    /**
     * field for EnvelopeAttachment
     */

    protected net.docusign.www.api._3_0.ArrayOfAttachment localEnvelopeAttachment;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localEnvelopeAttachmentTracker = false;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.ArrayOfAttachment
     */
    public net.docusign.www.api._3_0.ArrayOfAttachment getEnvelopeAttachment() {
        return localEnvelopeAttachment;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            EnvelopeAttachment
     */
    public void setEnvelopeAttachment(net.docusign.www.api._3_0.ArrayOfAttachment param) {

        if (param != null) {
            // update the setting tracker
            localEnvelopeAttachmentTracker = true;
        }
        else {
            localEnvelopeAttachmentTracker = false;

        }

        this.localEnvelopeAttachment = param;

    }

    /**
     * field for DocumentStatuses
     */

    protected net.docusign.www.api._3_0.ArrayOfDocumentStatus localDocumentStatuses;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDocumentStatusesTracker = false;

    /**
     * Auto generated getter method
     *
     * @return net.docusign.www.api._3_0.ArrayOfDocumentStatus
     */
    public net.docusign.www.api._3_0.ArrayOfDocumentStatus getDocumentStatuses() {
        return localDocumentStatuses;
    }

    /**
     * Auto generated setter method
     *
     * @param param
     *            DocumentStatuses
     */
    public void setDocumentStatuses(net.docusign.www.api._3_0.ArrayOfDocumentStatus param) {

        if (param != null) {
            // update the setting tracker
            localDocumentStatusesTracker = true;
        }
        else {
            localDocumentStatusesTracker = false;

        }

        this.localDocumentStatuses = param;

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
                EnvelopeStatus.this.serialize(parentQName, factory, xmlWriter);
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
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":EnvelopeStatus", xmlWriter);
            }
            else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "EnvelopeStatus", xmlWriter);
            }

        }

        if (localRecipientStatuses == null) {

            java.lang.String namespace2 = "http://www.docusign.net/API/3.0";

            if (!namespace2.equals("")) {
                java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                if (prefix2 == null) {
                    prefix2 = generatePrefix(namespace2);

                    xmlWriter.writeStartElement(prefix2, "RecipientStatuses", namespace2);
                    xmlWriter.writeNamespace(prefix2, namespace2);
                    xmlWriter.setPrefix(prefix2, namespace2);

                }
                else {
                    xmlWriter.writeStartElement(namespace2, "RecipientStatuses");
                }

            }
            else {
                xmlWriter.writeStartElement("RecipientStatuses");
            }

            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
            xmlWriter.writeEndElement();
        }
        else {
            localRecipientStatuses.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatuses"), factory, xmlWriter);
        }

        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "TimeGenerated", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            }
            else {
                xmlWriter.writeStartElement(namespace, "TimeGenerated");
            }

        }
        else {
            xmlWriter.writeStartElement("TimeGenerated");
        }

        if (localTimeGenerated == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("TimeGenerated cannot be null!!");

        }
        else {

            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeGenerated));

        }

        xmlWriter.writeEndElement();
        if (localEnvelopeIDTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "EnvelopeID", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "EnvelopeID");
                }

            }
            else {
                xmlWriter.writeStartElement("EnvelopeID");
            }

            if (localEnvelopeID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EnvelopeID cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localEnvelopeID);

            }

            xmlWriter.writeEndElement();
        }
        if (localSubjectTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Subject", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "Subject");
                }

            }
            else {
                xmlWriter.writeStartElement("Subject");
            }

            if (localSubject == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Subject cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localSubject);

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
        if (localStatus == null) {
            throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
        }
        localStatus.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"), factory, xmlWriter);

        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "Created", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            }
            else {
                xmlWriter.writeStartElement(namespace, "Created");
            }

        }
        else {
            xmlWriter.writeStartElement("Created");
        }

        if (localCreated == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("Created cannot be null!!");

        }
        else {

            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreated));

        }

        xmlWriter.writeEndElement();
        if (localDeletedTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Deleted", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "Deleted");
                }

            }
            else {
                xmlWriter.writeStartElement("Deleted");
            }

            if (localDeleted == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Deleted cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeleted));

            }

            xmlWriter.writeEndElement();
        }
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
        if (localCompletedTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Completed", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "Completed");
                }

            }
            else {
                xmlWriter.writeStartElement("Completed");
            }

            if (localCompleted == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Completed cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompleted));

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
        if (localTimedOutTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "TimedOut", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "TimedOut");
                }

            }
            else {
                xmlWriter.writeStartElement("TimedOut");
            }

            if (localTimedOut == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TimedOut cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimedOut));

            }

            xmlWriter.writeEndElement();
        }
        if (localACStatusTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ACStatus", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "ACStatus");
                }

            }
            else {
                xmlWriter.writeStartElement("ACStatus");
            }

            if (localACStatus == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ACStatus cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localACStatus);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "ACStatusDate", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            }
            else {
                xmlWriter.writeStartElement(namespace, "ACStatusDate");
            }

        }
        else {
            xmlWriter.writeStartElement("ACStatusDate");
        }

        if (localACStatusDate == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("ACStatusDate cannot be null!!");

        }
        else {

            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localACStatusDate));

        }

        xmlWriter.writeEndElement();
        if (localACHolderTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ACHolder", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "ACHolder");
                }

            }
            else {
                xmlWriter.writeStartElement("ACHolder");
            }

            if (localACHolder == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ACHolder cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localACHolder);

            }

            xmlWriter.writeEndElement();
        }
        if (localACHolderEmailTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ACHolderEmail", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "ACHolderEmail");
                }

            }
            else {
                xmlWriter.writeStartElement("ACHolderEmail");
            }

            if (localACHolderEmail == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ACHolderEmail cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localACHolderEmail);

            }

            xmlWriter.writeEndElement();
        }
        if (localACHolderLocationTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ACHolderLocation", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "ACHolderLocation");
                }

            }
            else {
                xmlWriter.writeStartElement("ACHolderLocation");
            }

            if (localACHolderLocation == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ACHolderLocation cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localACHolderLocation);

            }

            xmlWriter.writeEndElement();
        }
        if (localSigningLocation == null) {
            throw new org.apache.axis2.databinding.ADBException("SigningLocation cannot be null!!");
        }
        localSigningLocation.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SigningLocation"), factory, xmlWriter);
        if (localSenderIPAddressTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "SenderIPAddress", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "SenderIPAddress");
                }

            }
            else {
                xmlWriter.writeStartElement("SenderIPAddress");
            }

            if (localSenderIPAddress == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("SenderIPAddress cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localSenderIPAddress);

            }

            xmlWriter.writeEndElement();
        }
        if (localEnvelopePDFHashTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "EnvelopePDFHash", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "EnvelopePDFHash");
                }

            }
            else {
                xmlWriter.writeStartElement("EnvelopePDFHash");
            }

            if (localEnvelopePDFHash == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EnvelopePDFHash cannot be null!!");

            }
            else {

                xmlWriter.writeCharacters(localEnvelopePDFHash);

            }

            xmlWriter.writeEndElement();
        }
        if (localCustomFieldsTracker) {
            if (localCustomFields == null) {
                throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
            }
            localCustomFields.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields"), factory, xmlWriter);
        }
        if (localVaultingDetailsTracker) {
            if (localVaultingDetails == null) {
                throw new org.apache.axis2.databinding.ADBException("VaultingDetails cannot be null!!");
            }
            localVaultingDetails.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingDetails"), factory, xmlWriter);
        }
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

        namespace = "http://www.docusign.net/API/3.0";
        if (!namespace.equals("")) {
            prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                xmlWriter.writeStartElement(prefix, "EnvelopeIdStamping", namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);

            }
            else {
                xmlWriter.writeStartElement(namespace, "EnvelopeIdStamping");
            }

        }
        else {
            xmlWriter.writeStartElement("EnvelopeIdStamping");
        }

        if (false) {

            throw new org.apache.axis2.databinding.ADBException("EnvelopeIdStamping cannot be null!!");

        }
        else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnvelopeIdStamping));
        }

        xmlWriter.writeEndElement();
        if (localAuthoritativeCopyTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "AuthoritativeCopy", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                }
                else {
                    xmlWriter.writeStartElement(namespace, "AuthoritativeCopy");
                }

            }
            else {
                xmlWriter.writeStartElement("AuthoritativeCopy");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("AuthoritativeCopy cannot be null!!");

            }
            else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthoritativeCopy));
            }

            xmlWriter.writeEndElement();
        }
        if (localEnvelopeAttachmentTracker) {
            if (localEnvelopeAttachment == null) {
                throw new org.apache.axis2.databinding.ADBException("EnvelopeAttachment cannot be null!!");
            }
            localEnvelopeAttachment.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAttachment"), factory, xmlWriter);
        }
        if (localDocumentStatusesTracker) {
            if (localDocumentStatuses == null) {
                throw new org.apache.axis2.databinding.ADBException("DocumentStatuses cannot be null!!");
            }
            localDocumentStatuses.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentStatuses"), factory, xmlWriter);
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

        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatuses"));

        elementList.add(localRecipientStatuses == null ? null : localRecipientStatuses);

        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TimeGenerated"));

        if (localTimeGenerated != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeGenerated));
        }
        else {
            throw new org.apache.axis2.databinding.ADBException("TimeGenerated cannot be null!!");
        }
        if (localEnvelopeIDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"));

            if (localEnvelopeID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnvelopeID));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("EnvelopeID cannot be null!!");
            }
        }
        if (localSubjectTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Subject"));

            if (localSubject != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubject));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("Subject cannot be null!!");
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
        if (localEmailTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Email"));

            if (localEmail != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmail));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("Email cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"));

        if (localStatus == null) {
            throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
        }
        elementList.add(localStatus);

        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Created"));

        if (localCreated != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreated));
        }
        else {
            throw new org.apache.axis2.databinding.ADBException("Created cannot be null!!");
        }
        if (localDeletedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Deleted"));

            if (localDeleted != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeleted));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("Deleted cannot be null!!");
            }
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
        if (localCompletedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Completed"));

            if (localCompleted != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompleted));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("Completed cannot be null!!");
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
        if (localTimedOutTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TimedOut"));

            if (localTimedOut != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimedOut));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("TimedOut cannot be null!!");
            }
        }
        if (localACStatusTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACStatus"));

            if (localACStatus != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localACStatus));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("ACStatus cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACStatusDate"));

        if (localACStatusDate != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localACStatusDate));
        }
        else {
            throw new org.apache.axis2.databinding.ADBException("ACStatusDate cannot be null!!");
        }
        if (localACHolderTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACHolder"));

            if (localACHolder != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localACHolder));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("ACHolder cannot be null!!");
            }
        }
        if (localACHolderEmailTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACHolderEmail"));

            if (localACHolderEmail != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localACHolderEmail));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("ACHolderEmail cannot be null!!");
            }
        }
        if (localACHolderLocationTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACHolderLocation"));

            if (localACHolderLocation != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localACHolderLocation));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("ACHolderLocation cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SigningLocation"));

        if (localSigningLocation == null) {
            throw new org.apache.axis2.databinding.ADBException("SigningLocation cannot be null!!");
        }
        elementList.add(localSigningLocation);
        if (localSenderIPAddressTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderIPAddress"));

            if (localSenderIPAddress != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderIPAddress));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("SenderIPAddress cannot be null!!");
            }
        }
        if (localEnvelopePDFHashTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopePDFHash"));

            if (localEnvelopePDFHash != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnvelopePDFHash));
            }
            else {
                throw new org.apache.axis2.databinding.ADBException("EnvelopePDFHash cannot be null!!");
            }
        }
        if (localCustomFieldsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields"));

            if (localCustomFields == null) {
                throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
            }
            elementList.add(localCustomFields);
        }
        if (localVaultingDetailsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingDetails"));

            if (localVaultingDetails == null) {
                throw new org.apache.axis2.databinding.ADBException("VaultingDetails cannot be null!!");
            }
            elementList.add(localVaultingDetails);
        }
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AutoNavigation"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoNavigation));

        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeIdStamping"));

        elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnvelopeIdStamping));
        if (localAuthoritativeCopyTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopy"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthoritativeCopy));
        }
        if (localEnvelopeAttachmentTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAttachment"));

            if (localEnvelopeAttachment == null) {
                throw new org.apache.axis2.databinding.ADBException("EnvelopeAttachment cannot be null!!");
            }
            elementList.add(localEnvelopeAttachment);
        }
        if (localDocumentStatusesTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentStatuses"));

            if (localDocumentStatuses == null) {
                throw new org.apache.axis2.databinding.ADBException("DocumentStatuses cannot be null!!");
            }
            elementList.add(localDocumentStatuses);
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
        public static EnvelopeStatus parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            EnvelopeStatus object = new EnvelopeStatus();

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

                        if (!"EnvelopeStatus".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (EnvelopeStatus) net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(nsUri, type, reader);
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatuses").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        object.setRecipientStatuses(null);
                        reader.next();

                        reader.next();

                    }
                    else {

                        object.setRecipientStatuses(net.docusign.www.api._3_0.ArrayOfRecipientStatus.Factory.parse(reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TimeGenerated").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTimeGenerated(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Subject").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSubject(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Email").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status").equals(reader.getName())) {

                    object.setStatus(net.docusign.www.api._3_0.EnvelopeStatusCode.Factory.parse(reader));

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
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Deleted").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDeleted(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Completed").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCompleted(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TimedOut").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTimedOut(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACStatus").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setACStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACStatusDate").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setACStatusDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACHolder").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setACHolder(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACHolderEmail").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setACHolderEmail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACHolderLocation").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setACHolderLocation(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SigningLocation").equals(reader.getName())) {

                    object.setSigningLocation(net.docusign.www.api._3_0.SigningLocationCode.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderIPAddress").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSenderIPAddress(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopePDFHash").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEnvelopePDFHash(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields").equals(reader.getName())) {

                    object.setCustomFields(net.docusign.www.api._3_0.ArrayOfCustomField.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingDetails").equals(reader.getName())) {

                    object.setVaultingDetails(net.docusign.www.api._3_0.VaultingDetails.Factory.parse(reader));

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
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeIdStamping").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEnvelopeIdStamping(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopy").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setAuthoritativeCopy(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAttachment").equals(reader.getName())) {

                    object.setEnvelopeAttachment(net.docusign.www.api._3_0.ArrayOfAttachment.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentStatuses").equals(reader.getName())) {

                    object.setDocumentStatuses(net.docusign.www.api._3_0.ArrayOfDocumentStatus.Factory.parse(reader));

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
