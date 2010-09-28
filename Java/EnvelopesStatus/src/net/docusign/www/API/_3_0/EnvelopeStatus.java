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

/**
 * EnvelopeStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeStatus  implements java.io.Serializable {
    private net.docusign.www.API._3_0.RecipientStatus[] recipientStatuses;

    private java.util.Calendar timeGenerated;

    private java.lang.String envelopeID;

    private java.lang.String subject;

    private java.lang.String userName;

    private java.lang.String email;

    private net.docusign.www.API._3_0.EnvelopeStatusCode status;

    private java.util.Calendar created;

    private java.util.Calendar deleted;

    private java.util.Calendar sent;

    private java.util.Calendar delivered;

    private java.util.Calendar signed;

    private java.util.Calendar completed;

    private java.util.Calendar declined;

    private java.util.Calendar timedOut;

    private java.lang.String ACStatus;

    private java.util.Calendar ACStatusDate;

    private java.lang.String ACHolder;

    private java.lang.String ACHolderEmail;

    private java.lang.String ACHolderLocation;

    private net.docusign.www.API._3_0.SigningLocationCode signingLocation;

    private java.lang.String senderIPAddress;

    private java.lang.String envelopePDFHash;

    private net.docusign.www.API._3_0.CustomField[] customFields;

    private net.docusign.www.API._3_0.VaultingDetails vaultingDetails;

    private boolean autoNavigation;

    private boolean envelopeIdStamping;

    private java.lang.Boolean authoritativeCopy;

    private net.docusign.www.API._3_0.Attachment[] envelopeAttachment;

    private net.docusign.www.API._3_0.DocumentStatus[] documentStatuses;

    private net.docusign.www.API._3_0.FormData formData;

    public EnvelopeStatus() {
    }

    public EnvelopeStatus(
           net.docusign.www.API._3_0.RecipientStatus[] recipientStatuses,
           java.util.Calendar timeGenerated,
           java.lang.String envelopeID,
           java.lang.String subject,
           java.lang.String userName,
           java.lang.String email,
           net.docusign.www.API._3_0.EnvelopeStatusCode status,
           java.util.Calendar created,
           java.util.Calendar deleted,
           java.util.Calendar sent,
           java.util.Calendar delivered,
           java.util.Calendar signed,
           java.util.Calendar completed,
           java.util.Calendar declined,
           java.util.Calendar timedOut,
           java.lang.String ACStatus,
           java.util.Calendar ACStatusDate,
           java.lang.String ACHolder,
           java.lang.String ACHolderEmail,
           java.lang.String ACHolderLocation,
           net.docusign.www.API._3_0.SigningLocationCode signingLocation,
           java.lang.String senderIPAddress,
           java.lang.String envelopePDFHash,
           net.docusign.www.API._3_0.CustomField[] customFields,
           net.docusign.www.API._3_0.VaultingDetails vaultingDetails,
           boolean autoNavigation,
           boolean envelopeIdStamping,
           java.lang.Boolean authoritativeCopy,
           net.docusign.www.API._3_0.Attachment[] envelopeAttachment,
           net.docusign.www.API._3_0.DocumentStatus[] documentStatuses,
           net.docusign.www.API._3_0.FormData formData) {
           this.recipientStatuses = recipientStatuses;
           this.timeGenerated = timeGenerated;
           this.envelopeID = envelopeID;
           this.subject = subject;
           this.userName = userName;
           this.email = email;
           this.status = status;
           this.created = created;
           this.deleted = deleted;
           this.sent = sent;
           this.delivered = delivered;
           this.signed = signed;
           this.completed = completed;
           this.declined = declined;
           this.timedOut = timedOut;
           this.ACStatus = ACStatus;
           this.ACStatusDate = ACStatusDate;
           this.ACHolder = ACHolder;
           this.ACHolderEmail = ACHolderEmail;
           this.ACHolderLocation = ACHolderLocation;
           this.signingLocation = signingLocation;
           this.senderIPAddress = senderIPAddress;
           this.envelopePDFHash = envelopePDFHash;
           this.customFields = customFields;
           this.vaultingDetails = vaultingDetails;
           this.autoNavigation = autoNavigation;
           this.envelopeIdStamping = envelopeIdStamping;
           this.authoritativeCopy = authoritativeCopy;
           this.envelopeAttachment = envelopeAttachment;
           this.documentStatuses = documentStatuses;
           this.formData = formData;
    }


    /**
     * Gets the recipientStatuses value for this EnvelopeStatus.
     * 
     * @return recipientStatuses
     */
    public net.docusign.www.API._3_0.RecipientStatus[] getRecipientStatuses() {
        return recipientStatuses;
    }


    /**
     * Sets the recipientStatuses value for this EnvelopeStatus.
     * 
     * @param recipientStatuses
     */
    public void setRecipientStatuses(net.docusign.www.API._3_0.RecipientStatus[] recipientStatuses) {
        this.recipientStatuses = recipientStatuses;
    }


    /**
     * Gets the timeGenerated value for this EnvelopeStatus.
     * 
     * @return timeGenerated
     */
    public java.util.Calendar getTimeGenerated() {
        return timeGenerated;
    }


    /**
     * Sets the timeGenerated value for this EnvelopeStatus.
     * 
     * @param timeGenerated
     */
    public void setTimeGenerated(java.util.Calendar timeGenerated) {
        this.timeGenerated = timeGenerated;
    }


    /**
     * Gets the envelopeID value for this EnvelopeStatus.
     * 
     * @return envelopeID
     */
    public java.lang.String getEnvelopeID() {
        return envelopeID;
    }


    /**
     * Sets the envelopeID value for this EnvelopeStatus.
     * 
     * @param envelopeID
     */
    public void setEnvelopeID(java.lang.String envelopeID) {
        this.envelopeID = envelopeID;
    }


    /**
     * Gets the subject value for this EnvelopeStatus.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this EnvelopeStatus.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the userName value for this EnvelopeStatus.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this EnvelopeStatus.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the email value for this EnvelopeStatus.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EnvelopeStatus.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the status value for this EnvelopeStatus.
     * 
     * @return status
     */
    public net.docusign.www.API._3_0.EnvelopeStatusCode getStatus() {
        return status;
    }


    /**
     * Sets the status value for this EnvelopeStatus.
     * 
     * @param status
     */
    public void setStatus(net.docusign.www.API._3_0.EnvelopeStatusCode status) {
        this.status = status;
    }


    /**
     * Gets the created value for this EnvelopeStatus.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this EnvelopeStatus.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the deleted value for this EnvelopeStatus.
     * 
     * @return deleted
     */
    public java.util.Calendar getDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this EnvelopeStatus.
     * 
     * @param deleted
     */
    public void setDeleted(java.util.Calendar deleted) {
        this.deleted = deleted;
    }


    /**
     * Gets the sent value for this EnvelopeStatus.
     * 
     * @return sent
     */
    public java.util.Calendar getSent() {
        return sent;
    }


    /**
     * Sets the sent value for this EnvelopeStatus.
     * 
     * @param sent
     */
    public void setSent(java.util.Calendar sent) {
        this.sent = sent;
    }


    /**
     * Gets the delivered value for this EnvelopeStatus.
     * 
     * @return delivered
     */
    public java.util.Calendar getDelivered() {
        return delivered;
    }


    /**
     * Sets the delivered value for this EnvelopeStatus.
     * 
     * @param delivered
     */
    public void setDelivered(java.util.Calendar delivered) {
        this.delivered = delivered;
    }


    /**
     * Gets the signed value for this EnvelopeStatus.
     * 
     * @return signed
     */
    public java.util.Calendar getSigned() {
        return signed;
    }


    /**
     * Sets the signed value for this EnvelopeStatus.
     * 
     * @param signed
     */
    public void setSigned(java.util.Calendar signed) {
        this.signed = signed;
    }


    /**
     * Gets the completed value for this EnvelopeStatus.
     * 
     * @return completed
     */
    public java.util.Calendar getCompleted() {
        return completed;
    }


    /**
     * Sets the completed value for this EnvelopeStatus.
     * 
     * @param completed
     */
    public void setCompleted(java.util.Calendar completed) {
        this.completed = completed;
    }


    /**
     * Gets the declined value for this EnvelopeStatus.
     * 
     * @return declined
     */
    public java.util.Calendar getDeclined() {
        return declined;
    }


    /**
     * Sets the declined value for this EnvelopeStatus.
     * 
     * @param declined
     */
    public void setDeclined(java.util.Calendar declined) {
        this.declined = declined;
    }


    /**
     * Gets the timedOut value for this EnvelopeStatus.
     * 
     * @return timedOut
     */
    public java.util.Calendar getTimedOut() {
        return timedOut;
    }


    /**
     * Sets the timedOut value for this EnvelopeStatus.
     * 
     * @param timedOut
     */
    public void setTimedOut(java.util.Calendar timedOut) {
        this.timedOut = timedOut;
    }


    /**
     * Gets the ACStatus value for this EnvelopeStatus.
     * 
     * @return ACStatus
     */
    public java.lang.String getACStatus() {
        return ACStatus;
    }


    /**
     * Sets the ACStatus value for this EnvelopeStatus.
     * 
     * @param ACStatus
     */
    public void setACStatus(java.lang.String ACStatus) {
        this.ACStatus = ACStatus;
    }


    /**
     * Gets the ACStatusDate value for this EnvelopeStatus.
     * 
     * @return ACStatusDate
     */
    public java.util.Calendar getACStatusDate() {
        return ACStatusDate;
    }


    /**
     * Sets the ACStatusDate value for this EnvelopeStatus.
     * 
     * @param ACStatusDate
     */
    public void setACStatusDate(java.util.Calendar ACStatusDate) {
        this.ACStatusDate = ACStatusDate;
    }


    /**
     * Gets the ACHolder value for this EnvelopeStatus.
     * 
     * @return ACHolder
     */
    public java.lang.String getACHolder() {
        return ACHolder;
    }


    /**
     * Sets the ACHolder value for this EnvelopeStatus.
     * 
     * @param ACHolder
     */
    public void setACHolder(java.lang.String ACHolder) {
        this.ACHolder = ACHolder;
    }


    /**
     * Gets the ACHolderEmail value for this EnvelopeStatus.
     * 
     * @return ACHolderEmail
     */
    public java.lang.String getACHolderEmail() {
        return ACHolderEmail;
    }


    /**
     * Sets the ACHolderEmail value for this EnvelopeStatus.
     * 
     * @param ACHolderEmail
     */
    public void setACHolderEmail(java.lang.String ACHolderEmail) {
        this.ACHolderEmail = ACHolderEmail;
    }


    /**
     * Gets the ACHolderLocation value for this EnvelopeStatus.
     * 
     * @return ACHolderLocation
     */
    public java.lang.String getACHolderLocation() {
        return ACHolderLocation;
    }


    /**
     * Sets the ACHolderLocation value for this EnvelopeStatus.
     * 
     * @param ACHolderLocation
     */
    public void setACHolderLocation(java.lang.String ACHolderLocation) {
        this.ACHolderLocation = ACHolderLocation;
    }


    /**
     * Gets the signingLocation value for this EnvelopeStatus.
     * 
     * @return signingLocation
     */
    public net.docusign.www.API._3_0.SigningLocationCode getSigningLocation() {
        return signingLocation;
    }


    /**
     * Sets the signingLocation value for this EnvelopeStatus.
     * 
     * @param signingLocation
     */
    public void setSigningLocation(net.docusign.www.API._3_0.SigningLocationCode signingLocation) {
        this.signingLocation = signingLocation;
    }


    /**
     * Gets the senderIPAddress value for this EnvelopeStatus.
     * 
     * @return senderIPAddress
     */
    public java.lang.String getSenderIPAddress() {
        return senderIPAddress;
    }


    /**
     * Sets the senderIPAddress value for this EnvelopeStatus.
     * 
     * @param senderIPAddress
     */
    public void setSenderIPAddress(java.lang.String senderIPAddress) {
        this.senderIPAddress = senderIPAddress;
    }


    /**
     * Gets the envelopePDFHash value for this EnvelopeStatus.
     * 
     * @return envelopePDFHash
     */
    public java.lang.String getEnvelopePDFHash() {
        return envelopePDFHash;
    }


    /**
     * Sets the envelopePDFHash value for this EnvelopeStatus.
     * 
     * @param envelopePDFHash
     */
    public void setEnvelopePDFHash(java.lang.String envelopePDFHash) {
        this.envelopePDFHash = envelopePDFHash;
    }


    /**
     * Gets the customFields value for this EnvelopeStatus.
     * 
     * @return customFields
     */
    public net.docusign.www.API._3_0.CustomField[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this EnvelopeStatus.
     * 
     * @param customFields
     */
    public void setCustomFields(net.docusign.www.API._3_0.CustomField[] customFields) {
        this.customFields = customFields;
    }


    /**
     * Gets the vaultingDetails value for this EnvelopeStatus.
     * 
     * @return vaultingDetails
     */
    public net.docusign.www.API._3_0.VaultingDetails getVaultingDetails() {
        return vaultingDetails;
    }


    /**
     * Sets the vaultingDetails value for this EnvelopeStatus.
     * 
     * @param vaultingDetails
     */
    public void setVaultingDetails(net.docusign.www.API._3_0.VaultingDetails vaultingDetails) {
        this.vaultingDetails = vaultingDetails;
    }


    /**
     * Gets the autoNavigation value for this EnvelopeStatus.
     * 
     * @return autoNavigation
     */
    public boolean isAutoNavigation() {
        return autoNavigation;
    }


    /**
     * Sets the autoNavigation value for this EnvelopeStatus.
     * 
     * @param autoNavigation
     */
    public void setAutoNavigation(boolean autoNavigation) {
        this.autoNavigation = autoNavigation;
    }


    /**
     * Gets the envelopeIdStamping value for this EnvelopeStatus.
     * 
     * @return envelopeIdStamping
     */
    public boolean isEnvelopeIdStamping() {
        return envelopeIdStamping;
    }


    /**
     * Sets the envelopeIdStamping value for this EnvelopeStatus.
     * 
     * @param envelopeIdStamping
     */
    public void setEnvelopeIdStamping(boolean envelopeIdStamping) {
        this.envelopeIdStamping = envelopeIdStamping;
    }


    /**
     * Gets the authoritativeCopy value for this EnvelopeStatus.
     * 
     * @return authoritativeCopy
     */
    public java.lang.Boolean getAuthoritativeCopy() {
        return authoritativeCopy;
    }


    /**
     * Sets the authoritativeCopy value for this EnvelopeStatus.
     * 
     * @param authoritativeCopy
     */
    public void setAuthoritativeCopy(java.lang.Boolean authoritativeCopy) {
        this.authoritativeCopy = authoritativeCopy;
    }


    /**
     * Gets the envelopeAttachment value for this EnvelopeStatus.
     * 
     * @return envelopeAttachment
     */
    public net.docusign.www.API._3_0.Attachment[] getEnvelopeAttachment() {
        return envelopeAttachment;
    }


    /**
     * Sets the envelopeAttachment value for this EnvelopeStatus.
     * 
     * @param envelopeAttachment
     */
    public void setEnvelopeAttachment(net.docusign.www.API._3_0.Attachment[] envelopeAttachment) {
        this.envelopeAttachment = envelopeAttachment;
    }


    /**
     * Gets the documentStatuses value for this EnvelopeStatus.
     * 
     * @return documentStatuses
     */
    public net.docusign.www.API._3_0.DocumentStatus[] getDocumentStatuses() {
        return documentStatuses;
    }


    /**
     * Sets the documentStatuses value for this EnvelopeStatus.
     * 
     * @param documentStatuses
     */
    public void setDocumentStatuses(net.docusign.www.API._3_0.DocumentStatus[] documentStatuses) {
        this.documentStatuses = documentStatuses;
    }


    /**
     * Gets the formData value for this EnvelopeStatus.
     * 
     * @return formData
     */
    public net.docusign.www.API._3_0.FormData getFormData() {
        return formData;
    }


    /**
     * Sets the formData value for this EnvelopeStatus.
     * 
     * @param formData
     */
    public void setFormData(net.docusign.www.API._3_0.FormData formData) {
        this.formData = formData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeStatus)) return false;
        EnvelopeStatus other = (EnvelopeStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recipientStatuses==null && other.getRecipientStatuses()==null) || 
             (this.recipientStatuses!=null &&
              java.util.Arrays.equals(this.recipientStatuses, other.getRecipientStatuses()))) &&
            ((this.timeGenerated==null && other.getTimeGenerated()==null) || 
             (this.timeGenerated!=null &&
              this.timeGenerated.equals(other.getTimeGenerated()))) &&
            ((this.envelopeID==null && other.getEnvelopeID()==null) || 
             (this.envelopeID!=null &&
              this.envelopeID.equals(other.getEnvelopeID()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.deleted==null && other.getDeleted()==null) || 
             (this.deleted!=null &&
              this.deleted.equals(other.getDeleted()))) &&
            ((this.sent==null && other.getSent()==null) || 
             (this.sent!=null &&
              this.sent.equals(other.getSent()))) &&
            ((this.delivered==null && other.getDelivered()==null) || 
             (this.delivered!=null &&
              this.delivered.equals(other.getDelivered()))) &&
            ((this.signed==null && other.getSigned()==null) || 
             (this.signed!=null &&
              this.signed.equals(other.getSigned()))) &&
            ((this.completed==null && other.getCompleted()==null) || 
             (this.completed!=null &&
              this.completed.equals(other.getCompleted()))) &&
            ((this.declined==null && other.getDeclined()==null) || 
             (this.declined!=null &&
              this.declined.equals(other.getDeclined()))) &&
            ((this.timedOut==null && other.getTimedOut()==null) || 
             (this.timedOut!=null &&
              this.timedOut.equals(other.getTimedOut()))) &&
            ((this.ACStatus==null && other.getACStatus()==null) || 
             (this.ACStatus!=null &&
              this.ACStatus.equals(other.getACStatus()))) &&
            ((this.ACStatusDate==null && other.getACStatusDate()==null) || 
             (this.ACStatusDate!=null &&
              this.ACStatusDate.equals(other.getACStatusDate()))) &&
            ((this.ACHolder==null && other.getACHolder()==null) || 
             (this.ACHolder!=null &&
              this.ACHolder.equals(other.getACHolder()))) &&
            ((this.ACHolderEmail==null && other.getACHolderEmail()==null) || 
             (this.ACHolderEmail!=null &&
              this.ACHolderEmail.equals(other.getACHolderEmail()))) &&
            ((this.ACHolderLocation==null && other.getACHolderLocation()==null) || 
             (this.ACHolderLocation!=null &&
              this.ACHolderLocation.equals(other.getACHolderLocation()))) &&
            ((this.signingLocation==null && other.getSigningLocation()==null) || 
             (this.signingLocation!=null &&
              this.signingLocation.equals(other.getSigningLocation()))) &&
            ((this.senderIPAddress==null && other.getSenderIPAddress()==null) || 
             (this.senderIPAddress!=null &&
              this.senderIPAddress.equals(other.getSenderIPAddress()))) &&
            ((this.envelopePDFHash==null && other.getEnvelopePDFHash()==null) || 
             (this.envelopePDFHash!=null &&
              this.envelopePDFHash.equals(other.getEnvelopePDFHash()))) &&
            ((this.customFields==null && other.getCustomFields()==null) || 
             (this.customFields!=null &&
              java.util.Arrays.equals(this.customFields, other.getCustomFields()))) &&
            ((this.vaultingDetails==null && other.getVaultingDetails()==null) || 
             (this.vaultingDetails!=null &&
              this.vaultingDetails.equals(other.getVaultingDetails()))) &&
            this.autoNavigation == other.isAutoNavigation() &&
            this.envelopeIdStamping == other.isEnvelopeIdStamping() &&
            ((this.authoritativeCopy==null && other.getAuthoritativeCopy()==null) || 
             (this.authoritativeCopy!=null &&
              this.authoritativeCopy.equals(other.getAuthoritativeCopy()))) &&
            ((this.envelopeAttachment==null && other.getEnvelopeAttachment()==null) || 
             (this.envelopeAttachment!=null &&
              java.util.Arrays.equals(this.envelopeAttachment, other.getEnvelopeAttachment()))) &&
            ((this.documentStatuses==null && other.getDocumentStatuses()==null) || 
             (this.documentStatuses!=null &&
              java.util.Arrays.equals(this.documentStatuses, other.getDocumentStatuses()))) &&
            ((this.formData==null && other.getFormData()==null) || 
             (this.formData!=null &&
              this.formData.equals(other.getFormData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRecipientStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipientStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeGenerated() != null) {
            _hashCode += getTimeGenerated().hashCode();
        }
        if (getEnvelopeID() != null) {
            _hashCode += getEnvelopeID().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getDeleted() != null) {
            _hashCode += getDeleted().hashCode();
        }
        if (getSent() != null) {
            _hashCode += getSent().hashCode();
        }
        if (getDelivered() != null) {
            _hashCode += getDelivered().hashCode();
        }
        if (getSigned() != null) {
            _hashCode += getSigned().hashCode();
        }
        if (getCompleted() != null) {
            _hashCode += getCompleted().hashCode();
        }
        if (getDeclined() != null) {
            _hashCode += getDeclined().hashCode();
        }
        if (getTimedOut() != null) {
            _hashCode += getTimedOut().hashCode();
        }
        if (getACStatus() != null) {
            _hashCode += getACStatus().hashCode();
        }
        if (getACStatusDate() != null) {
            _hashCode += getACStatusDate().hashCode();
        }
        if (getACHolder() != null) {
            _hashCode += getACHolder().hashCode();
        }
        if (getACHolderEmail() != null) {
            _hashCode += getACHolderEmail().hashCode();
        }
        if (getACHolderLocation() != null) {
            _hashCode += getACHolderLocation().hashCode();
        }
        if (getSigningLocation() != null) {
            _hashCode += getSigningLocation().hashCode();
        }
        if (getSenderIPAddress() != null) {
            _hashCode += getSenderIPAddress().hashCode();
        }
        if (getEnvelopePDFHash() != null) {
            _hashCode += getEnvelopePDFHash().hashCode();
        }
        if (getCustomFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVaultingDetails() != null) {
            _hashCode += getVaultingDetails().hashCode();
        }
        _hashCode += (isAutoNavigation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnvelopeIdStamping() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAuthoritativeCopy() != null) {
            _hashCode += getAuthoritativeCopy().hashCode();
        }
        if (getEnvelopeAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvelopeAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvelopeAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormData() != null) {
            _hashCode += getFormData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatus"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeGenerated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TimeGenerated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Deleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Sent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Delivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Signed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Completed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Declined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timedOut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TimedOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACStatusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACStatusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACHolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACHolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACHolderEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACHolderEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACHolderLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACHolderLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signingLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SigningLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SigningLocationCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopePDFHash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopePDFHash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomField"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vaultingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoNavigation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AutoNavigation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeIdStamping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeIdStamping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authoritativeCopy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FormData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FormData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
