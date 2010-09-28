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
 * EnvelopeInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeInformation  implements java.io.Serializable {
    private java.lang.String transactionID;

    private java.lang.Boolean asynchronous;

    private java.lang.String accountId;

    private java.lang.String emailBlurb;

    private java.lang.String subject;

    private net.docusign.www.API._3_0.SigningLocationCode signingLocation;

    private net.docusign.www.API._3_0.CustomField[] customFields;

    private net.docusign.www.API._3_0.VaultingOptions vaultingOptions;

    private java.lang.Boolean autoNavigation;

    private java.lang.Boolean envelopeIdStamping;

    private java.lang.Boolean authoritativeCopy;

    private net.docusign.www.API._3_0.Notification notification;

    private java.lang.Boolean enforceSignerVisibility;

    private java.lang.Boolean enableWetSign;

    private java.lang.Boolean allowRecipientRecursion;

    private java.lang.Boolean allowMarkup;

    private net.docusign.www.API._3_0.EventNotification eventNotification;

    public EnvelopeInformation() {
    }

    public EnvelopeInformation(
           java.lang.String transactionID,
           java.lang.Boolean asynchronous,
           java.lang.String accountId,
           java.lang.String emailBlurb,
           java.lang.String subject,
           net.docusign.www.API._3_0.SigningLocationCode signingLocation,
           net.docusign.www.API._3_0.CustomField[] customFields,
           net.docusign.www.API._3_0.VaultingOptions vaultingOptions,
           java.lang.Boolean autoNavigation,
           java.lang.Boolean envelopeIdStamping,
           java.lang.Boolean authoritativeCopy,
           net.docusign.www.API._3_0.Notification notification,
           java.lang.Boolean enforceSignerVisibility,
           java.lang.Boolean enableWetSign,
           java.lang.Boolean allowRecipientRecursion,
           java.lang.Boolean allowMarkup,
           net.docusign.www.API._3_0.EventNotification eventNotification) {
           this.transactionID = transactionID;
           this.asynchronous = asynchronous;
           this.accountId = accountId;
           this.emailBlurb = emailBlurb;
           this.subject = subject;
           this.signingLocation = signingLocation;
           this.customFields = customFields;
           this.vaultingOptions = vaultingOptions;
           this.autoNavigation = autoNavigation;
           this.envelopeIdStamping = envelopeIdStamping;
           this.authoritativeCopy = authoritativeCopy;
           this.notification = notification;
           this.enforceSignerVisibility = enforceSignerVisibility;
           this.enableWetSign = enableWetSign;
           this.allowRecipientRecursion = allowRecipientRecursion;
           this.allowMarkup = allowMarkup;
           this.eventNotification = eventNotification;
    }


    /**
     * Gets the transactionID value for this EnvelopeInformation.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this EnvelopeInformation.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the asynchronous value for this EnvelopeInformation.
     * 
     * @return asynchronous
     */
    public java.lang.Boolean getAsynchronous() {
        return asynchronous;
    }


    /**
     * Sets the asynchronous value for this EnvelopeInformation.
     * 
     * @param asynchronous
     */
    public void setAsynchronous(java.lang.Boolean asynchronous) {
        this.asynchronous = asynchronous;
    }


    /**
     * Gets the accountId value for this EnvelopeInformation.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this EnvelopeInformation.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the emailBlurb value for this EnvelopeInformation.
     * 
     * @return emailBlurb
     */
    public java.lang.String getEmailBlurb() {
        return emailBlurb;
    }


    /**
     * Sets the emailBlurb value for this EnvelopeInformation.
     * 
     * @param emailBlurb
     */
    public void setEmailBlurb(java.lang.String emailBlurb) {
        this.emailBlurb = emailBlurb;
    }


    /**
     * Gets the subject value for this EnvelopeInformation.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this EnvelopeInformation.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the signingLocation value for this EnvelopeInformation.
     * 
     * @return signingLocation
     */
    public net.docusign.www.API._3_0.SigningLocationCode getSigningLocation() {
        return signingLocation;
    }


    /**
     * Sets the signingLocation value for this EnvelopeInformation.
     * 
     * @param signingLocation
     */
    public void setSigningLocation(net.docusign.www.API._3_0.SigningLocationCode signingLocation) {
        this.signingLocation = signingLocation;
    }


    /**
     * Gets the customFields value for this EnvelopeInformation.
     * 
     * @return customFields
     */
    public net.docusign.www.API._3_0.CustomField[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this EnvelopeInformation.
     * 
     * @param customFields
     */
    public void setCustomFields(net.docusign.www.API._3_0.CustomField[] customFields) {
        this.customFields = customFields;
    }


    /**
     * Gets the vaultingOptions value for this EnvelopeInformation.
     * 
     * @return vaultingOptions
     */
    public net.docusign.www.API._3_0.VaultingOptions getVaultingOptions() {
        return vaultingOptions;
    }


    /**
     * Sets the vaultingOptions value for this EnvelopeInformation.
     * 
     * @param vaultingOptions
     */
    public void setVaultingOptions(net.docusign.www.API._3_0.VaultingOptions vaultingOptions) {
        this.vaultingOptions = vaultingOptions;
    }


    /**
     * Gets the autoNavigation value for this EnvelopeInformation.
     * 
     * @return autoNavigation
     */
    public java.lang.Boolean getAutoNavigation() {
        return autoNavigation;
    }


    /**
     * Sets the autoNavigation value for this EnvelopeInformation.
     * 
     * @param autoNavigation
     */
    public void setAutoNavigation(java.lang.Boolean autoNavigation) {
        this.autoNavigation = autoNavigation;
    }


    /**
     * Gets the envelopeIdStamping value for this EnvelopeInformation.
     * 
     * @return envelopeIdStamping
     */
    public java.lang.Boolean getEnvelopeIdStamping() {
        return envelopeIdStamping;
    }


    /**
     * Sets the envelopeIdStamping value for this EnvelopeInformation.
     * 
     * @param envelopeIdStamping
     */
    public void setEnvelopeIdStamping(java.lang.Boolean envelopeIdStamping) {
        this.envelopeIdStamping = envelopeIdStamping;
    }


    /**
     * Gets the authoritativeCopy value for this EnvelopeInformation.
     * 
     * @return authoritativeCopy
     */
    public java.lang.Boolean getAuthoritativeCopy() {
        return authoritativeCopy;
    }


    /**
     * Sets the authoritativeCopy value for this EnvelopeInformation.
     * 
     * @param authoritativeCopy
     */
    public void setAuthoritativeCopy(java.lang.Boolean authoritativeCopy) {
        this.authoritativeCopy = authoritativeCopy;
    }


    /**
     * Gets the notification value for this EnvelopeInformation.
     * 
     * @return notification
     */
    public net.docusign.www.API._3_0.Notification getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this EnvelopeInformation.
     * 
     * @param notification
     */
    public void setNotification(net.docusign.www.API._3_0.Notification notification) {
        this.notification = notification;
    }


    /**
     * Gets the enforceSignerVisibility value for this EnvelopeInformation.
     * 
     * @return enforceSignerVisibility
     */
    public java.lang.Boolean getEnforceSignerVisibility() {
        return enforceSignerVisibility;
    }


    /**
     * Sets the enforceSignerVisibility value for this EnvelopeInformation.
     * 
     * @param enforceSignerVisibility
     */
    public void setEnforceSignerVisibility(java.lang.Boolean enforceSignerVisibility) {
        this.enforceSignerVisibility = enforceSignerVisibility;
    }


    /**
     * Gets the enableWetSign value for this EnvelopeInformation.
     * 
     * @return enableWetSign
     */
    public java.lang.Boolean getEnableWetSign() {
        return enableWetSign;
    }


    /**
     * Sets the enableWetSign value for this EnvelopeInformation.
     * 
     * @param enableWetSign
     */
    public void setEnableWetSign(java.lang.Boolean enableWetSign) {
        this.enableWetSign = enableWetSign;
    }


    /**
     * Gets the allowRecipientRecursion value for this EnvelopeInformation.
     * 
     * @return allowRecipientRecursion
     */
    public java.lang.Boolean getAllowRecipientRecursion() {
        return allowRecipientRecursion;
    }


    /**
     * Sets the allowRecipientRecursion value for this EnvelopeInformation.
     * 
     * @param allowRecipientRecursion
     */
    public void setAllowRecipientRecursion(java.lang.Boolean allowRecipientRecursion) {
        this.allowRecipientRecursion = allowRecipientRecursion;
    }


    /**
     * Gets the allowMarkup value for this EnvelopeInformation.
     * 
     * @return allowMarkup
     */
    public java.lang.Boolean getAllowMarkup() {
        return allowMarkup;
    }


    /**
     * Sets the allowMarkup value for this EnvelopeInformation.
     * 
     * @param allowMarkup
     */
    public void setAllowMarkup(java.lang.Boolean allowMarkup) {
        this.allowMarkup = allowMarkup;
    }


    /**
     * Gets the eventNotification value for this EnvelopeInformation.
     * 
     * @return eventNotification
     */
    public net.docusign.www.API._3_0.EventNotification getEventNotification() {
        return eventNotification;
    }


    /**
     * Sets the eventNotification value for this EnvelopeInformation.
     * 
     * @param eventNotification
     */
    public void setEventNotification(net.docusign.www.API._3_0.EventNotification eventNotification) {
        this.eventNotification = eventNotification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeInformation)) return false;
        EnvelopeInformation other = (EnvelopeInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.asynchronous==null && other.getAsynchronous()==null) || 
             (this.asynchronous!=null &&
              this.asynchronous.equals(other.getAsynchronous()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.emailBlurb==null && other.getEmailBlurb()==null) || 
             (this.emailBlurb!=null &&
              this.emailBlurb.equals(other.getEmailBlurb()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.signingLocation==null && other.getSigningLocation()==null) || 
             (this.signingLocation!=null &&
              this.signingLocation.equals(other.getSigningLocation()))) &&
            ((this.customFields==null && other.getCustomFields()==null) || 
             (this.customFields!=null &&
              java.util.Arrays.equals(this.customFields, other.getCustomFields()))) &&
            ((this.vaultingOptions==null && other.getVaultingOptions()==null) || 
             (this.vaultingOptions!=null &&
              this.vaultingOptions.equals(other.getVaultingOptions()))) &&
            ((this.autoNavigation==null && other.getAutoNavigation()==null) || 
             (this.autoNavigation!=null &&
              this.autoNavigation.equals(other.getAutoNavigation()))) &&
            ((this.envelopeIdStamping==null && other.getEnvelopeIdStamping()==null) || 
             (this.envelopeIdStamping!=null &&
              this.envelopeIdStamping.equals(other.getEnvelopeIdStamping()))) &&
            ((this.authoritativeCopy==null && other.getAuthoritativeCopy()==null) || 
             (this.authoritativeCopy!=null &&
              this.authoritativeCopy.equals(other.getAuthoritativeCopy()))) &&
            ((this.notification==null && other.getNotification()==null) || 
             (this.notification!=null &&
              this.notification.equals(other.getNotification()))) &&
            ((this.enforceSignerVisibility==null && other.getEnforceSignerVisibility()==null) || 
             (this.enforceSignerVisibility!=null &&
              this.enforceSignerVisibility.equals(other.getEnforceSignerVisibility()))) &&
            ((this.enableWetSign==null && other.getEnableWetSign()==null) || 
             (this.enableWetSign!=null &&
              this.enableWetSign.equals(other.getEnableWetSign()))) &&
            ((this.allowRecipientRecursion==null && other.getAllowRecipientRecursion()==null) || 
             (this.allowRecipientRecursion!=null &&
              this.allowRecipientRecursion.equals(other.getAllowRecipientRecursion()))) &&
            ((this.allowMarkup==null && other.getAllowMarkup()==null) || 
             (this.allowMarkup!=null &&
              this.allowMarkup.equals(other.getAllowMarkup()))) &&
            ((this.eventNotification==null && other.getEventNotification()==null) || 
             (this.eventNotification!=null &&
              this.eventNotification.equals(other.getEventNotification())));
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
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getAsynchronous() != null) {
            _hashCode += getAsynchronous().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getEmailBlurb() != null) {
            _hashCode += getEmailBlurb().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getSigningLocation() != null) {
            _hashCode += getSigningLocation().hashCode();
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
        if (getVaultingOptions() != null) {
            _hashCode += getVaultingOptions().hashCode();
        }
        if (getAutoNavigation() != null) {
            _hashCode += getAutoNavigation().hashCode();
        }
        if (getEnvelopeIdStamping() != null) {
            _hashCode += getEnvelopeIdStamping().hashCode();
        }
        if (getAuthoritativeCopy() != null) {
            _hashCode += getAuthoritativeCopy().hashCode();
        }
        if (getNotification() != null) {
            _hashCode += getNotification().hashCode();
        }
        if (getEnforceSignerVisibility() != null) {
            _hashCode += getEnforceSignerVisibility().hashCode();
        }
        if (getEnableWetSign() != null) {
            _hashCode += getEnableWetSign().hashCode();
        }
        if (getAllowRecipientRecursion() != null) {
            _hashCode += getAllowRecipientRecursion().hashCode();
        }
        if (getAllowMarkup() != null) {
            _hashCode += getAllowMarkup().hashCode();
        }
        if (getEventNotification() != null) {
            _hashCode += getEventNotification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asynchronous");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Asynchronous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailBlurb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EmailBlurb"));
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
        elemField.setFieldName("signingLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SigningLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SigningLocationCode"));
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
        elemField.setFieldName("vaultingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoNavigation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AutoNavigation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeIdStamping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeIdStamping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("notification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Notification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Notification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enforceSignerVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnforceSignerVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableWetSign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnableWetSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowRecipientRecursion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AllowRecipientRecursion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowMarkup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AllowMarkup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventNotification"));
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
