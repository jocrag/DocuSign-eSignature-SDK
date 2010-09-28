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
 * RecipientStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientStatus  implements java.io.Serializable {
    private net.docusign.www.API._3_0.RecipientTypeCode type;

    private java.lang.String email;

    private java.lang.String userName;

    private org.apache.axis.types.UnsignedShort routingOrder;

    private java.util.Calendar sent;

    private java.util.Calendar delivered;

    private java.util.Calendar signed;

    private java.util.Calendar declined;

    private java.lang.String declineReason;

    private net.docusign.www.API._3_0.RecipientStatusCode status;

    private java.lang.String recipientIPAddress;

    private java.lang.String clientUserId;

    private java.lang.Boolean autoNavigation;

    private net.docusign.www.API._3_0.IDCheckInformation IDCheckInformation;

    private net.docusign.www.API._3_0.AuthenticationStatus recipientAuthenticationStatus;

    private java.lang.String[] customFields;

    private net.docusign.www.API._3_0.TabStatus[] tabStatuses;

    private net.docusign.www.API._3_0.Attachment[] recipientAttachment;

    private java.lang.String accountStatus;

    private net.docusign.www.API._3_0.RecipientStatusEsignAgreementInformation esignAgreementInformation;

    private net.docusign.www.API._3_0.FormData formData;

    private java.lang.String recipientId;

    public RecipientStatus() {
    }

    public RecipientStatus(
           net.docusign.www.API._3_0.RecipientTypeCode type,
           java.lang.String email,
           java.lang.String userName,
           org.apache.axis.types.UnsignedShort routingOrder,
           java.util.Calendar sent,
           java.util.Calendar delivered,
           java.util.Calendar signed,
           java.util.Calendar declined,
           java.lang.String declineReason,
           net.docusign.www.API._3_0.RecipientStatusCode status,
           java.lang.String recipientIPAddress,
           java.lang.String clientUserId,
           java.lang.Boolean autoNavigation,
           net.docusign.www.API._3_0.IDCheckInformation IDCheckInformation,
           net.docusign.www.API._3_0.AuthenticationStatus recipientAuthenticationStatus,
           java.lang.String[] customFields,
           net.docusign.www.API._3_0.TabStatus[] tabStatuses,
           net.docusign.www.API._3_0.Attachment[] recipientAttachment,
           java.lang.String accountStatus,
           net.docusign.www.API._3_0.RecipientStatusEsignAgreementInformation esignAgreementInformation,
           net.docusign.www.API._3_0.FormData formData,
           java.lang.String recipientId) {
           this.type = type;
           this.email = email;
           this.userName = userName;
           this.routingOrder = routingOrder;
           this.sent = sent;
           this.delivered = delivered;
           this.signed = signed;
           this.declined = declined;
           this.declineReason = declineReason;
           this.status = status;
           this.recipientIPAddress = recipientIPAddress;
           this.clientUserId = clientUserId;
           this.autoNavigation = autoNavigation;
           this.IDCheckInformation = IDCheckInformation;
           this.recipientAuthenticationStatus = recipientAuthenticationStatus;
           this.customFields = customFields;
           this.tabStatuses = tabStatuses;
           this.recipientAttachment = recipientAttachment;
           this.accountStatus = accountStatus;
           this.esignAgreementInformation = esignAgreementInformation;
           this.formData = formData;
           this.recipientId = recipientId;
    }


    /**
     * Gets the type value for this RecipientStatus.
     * 
     * @return type
     */
    public net.docusign.www.API._3_0.RecipientTypeCode getType() {
        return type;
    }


    /**
     * Sets the type value for this RecipientStatus.
     * 
     * @param type
     */
    public void setType(net.docusign.www.API._3_0.RecipientTypeCode type) {
        this.type = type;
    }


    /**
     * Gets the email value for this RecipientStatus.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this RecipientStatus.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the userName value for this RecipientStatus.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this RecipientStatus.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the routingOrder value for this RecipientStatus.
     * 
     * @return routingOrder
     */
    public org.apache.axis.types.UnsignedShort getRoutingOrder() {
        return routingOrder;
    }


    /**
     * Sets the routingOrder value for this RecipientStatus.
     * 
     * @param routingOrder
     */
    public void setRoutingOrder(org.apache.axis.types.UnsignedShort routingOrder) {
        this.routingOrder = routingOrder;
    }


    /**
     * Gets the sent value for this RecipientStatus.
     * 
     * @return sent
     */
    public java.util.Calendar getSent() {
        return sent;
    }


    /**
     * Sets the sent value for this RecipientStatus.
     * 
     * @param sent
     */
    public void setSent(java.util.Calendar sent) {
        this.sent = sent;
    }


    /**
     * Gets the delivered value for this RecipientStatus.
     * 
     * @return delivered
     */
    public java.util.Calendar getDelivered() {
        return delivered;
    }


    /**
     * Sets the delivered value for this RecipientStatus.
     * 
     * @param delivered
     */
    public void setDelivered(java.util.Calendar delivered) {
        this.delivered = delivered;
    }


    /**
     * Gets the signed value for this RecipientStatus.
     * 
     * @return signed
     */
    public java.util.Calendar getSigned() {
        return signed;
    }


    /**
     * Sets the signed value for this RecipientStatus.
     * 
     * @param signed
     */
    public void setSigned(java.util.Calendar signed) {
        this.signed = signed;
    }


    /**
     * Gets the declined value for this RecipientStatus.
     * 
     * @return declined
     */
    public java.util.Calendar getDeclined() {
        return declined;
    }


    /**
     * Sets the declined value for this RecipientStatus.
     * 
     * @param declined
     */
    public void setDeclined(java.util.Calendar declined) {
        this.declined = declined;
    }


    /**
     * Gets the declineReason value for this RecipientStatus.
     * 
     * @return declineReason
     */
    public java.lang.String getDeclineReason() {
        return declineReason;
    }


    /**
     * Sets the declineReason value for this RecipientStatus.
     * 
     * @param declineReason
     */
    public void setDeclineReason(java.lang.String declineReason) {
        this.declineReason = declineReason;
    }


    /**
     * Gets the status value for this RecipientStatus.
     * 
     * @return status
     */
    public net.docusign.www.API._3_0.RecipientStatusCode getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RecipientStatus.
     * 
     * @param status
     */
    public void setStatus(net.docusign.www.API._3_0.RecipientStatusCode status) {
        this.status = status;
    }


    /**
     * Gets the recipientIPAddress value for this RecipientStatus.
     * 
     * @return recipientIPAddress
     */
    public java.lang.String getRecipientIPAddress() {
        return recipientIPAddress;
    }


    /**
     * Sets the recipientIPAddress value for this RecipientStatus.
     * 
     * @param recipientIPAddress
     */
    public void setRecipientIPAddress(java.lang.String recipientIPAddress) {
        this.recipientIPAddress = recipientIPAddress;
    }


    /**
     * Gets the clientUserId value for this RecipientStatus.
     * 
     * @return clientUserId
     */
    public java.lang.String getClientUserId() {
        return clientUserId;
    }


    /**
     * Sets the clientUserId value for this RecipientStatus.
     * 
     * @param clientUserId
     */
    public void setClientUserId(java.lang.String clientUserId) {
        this.clientUserId = clientUserId;
    }


    /**
     * Gets the autoNavigation value for this RecipientStatus.
     * 
     * @return autoNavigation
     */
    public java.lang.Boolean getAutoNavigation() {
        return autoNavigation;
    }


    /**
     * Sets the autoNavigation value for this RecipientStatus.
     * 
     * @param autoNavigation
     */
    public void setAutoNavigation(java.lang.Boolean autoNavigation) {
        this.autoNavigation = autoNavigation;
    }


    /**
     * Gets the IDCheckInformation value for this RecipientStatus.
     * 
     * @return IDCheckInformation
     */
    public net.docusign.www.API._3_0.IDCheckInformation getIDCheckInformation() {
        return IDCheckInformation;
    }


    /**
     * Sets the IDCheckInformation value for this RecipientStatus.
     * 
     * @param IDCheckInformation
     */
    public void setIDCheckInformation(net.docusign.www.API._3_0.IDCheckInformation IDCheckInformation) {
        this.IDCheckInformation = IDCheckInformation;
    }


    /**
     * Gets the recipientAuthenticationStatus value for this RecipientStatus.
     * 
     * @return recipientAuthenticationStatus
     */
    public net.docusign.www.API._3_0.AuthenticationStatus getRecipientAuthenticationStatus() {
        return recipientAuthenticationStatus;
    }


    /**
     * Sets the recipientAuthenticationStatus value for this RecipientStatus.
     * 
     * @param recipientAuthenticationStatus
     */
    public void setRecipientAuthenticationStatus(net.docusign.www.API._3_0.AuthenticationStatus recipientAuthenticationStatus) {
        this.recipientAuthenticationStatus = recipientAuthenticationStatus;
    }


    /**
     * Gets the customFields value for this RecipientStatus.
     * 
     * @return customFields
     */
    public java.lang.String[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this RecipientStatus.
     * 
     * @param customFields
     */
    public void setCustomFields(java.lang.String[] customFields) {
        this.customFields = customFields;
    }


    /**
     * Gets the tabStatuses value for this RecipientStatus.
     * 
     * @return tabStatuses
     */
    public net.docusign.www.API._3_0.TabStatus[] getTabStatuses() {
        return tabStatuses;
    }


    /**
     * Sets the tabStatuses value for this RecipientStatus.
     * 
     * @param tabStatuses
     */
    public void setTabStatuses(net.docusign.www.API._3_0.TabStatus[] tabStatuses) {
        this.tabStatuses = tabStatuses;
    }


    /**
     * Gets the recipientAttachment value for this RecipientStatus.
     * 
     * @return recipientAttachment
     */
    public net.docusign.www.API._3_0.Attachment[] getRecipientAttachment() {
        return recipientAttachment;
    }


    /**
     * Sets the recipientAttachment value for this RecipientStatus.
     * 
     * @param recipientAttachment
     */
    public void setRecipientAttachment(net.docusign.www.API._3_0.Attachment[] recipientAttachment) {
        this.recipientAttachment = recipientAttachment;
    }


    /**
     * Gets the accountStatus value for this RecipientStatus.
     * 
     * @return accountStatus
     */
    public java.lang.String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this RecipientStatus.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the esignAgreementInformation value for this RecipientStatus.
     * 
     * @return esignAgreementInformation
     */
    public net.docusign.www.API._3_0.RecipientStatusEsignAgreementInformation getEsignAgreementInformation() {
        return esignAgreementInformation;
    }


    /**
     * Sets the esignAgreementInformation value for this RecipientStatus.
     * 
     * @param esignAgreementInformation
     */
    public void setEsignAgreementInformation(net.docusign.www.API._3_0.RecipientStatusEsignAgreementInformation esignAgreementInformation) {
        this.esignAgreementInformation = esignAgreementInformation;
    }


    /**
     * Gets the formData value for this RecipientStatus.
     * 
     * @return formData
     */
    public net.docusign.www.API._3_0.FormData getFormData() {
        return formData;
    }


    /**
     * Sets the formData value for this RecipientStatus.
     * 
     * @param formData
     */
    public void setFormData(net.docusign.www.API._3_0.FormData formData) {
        this.formData = formData;
    }


    /**
     * Gets the recipientId value for this RecipientStatus.
     * 
     * @return recipientId
     */
    public java.lang.String getRecipientId() {
        return recipientId;
    }


    /**
     * Sets the recipientId value for this RecipientStatus.
     * 
     * @param recipientId
     */
    public void setRecipientId(java.lang.String recipientId) {
        this.recipientId = recipientId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientStatus)) return false;
        RecipientStatus other = (RecipientStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.routingOrder==null && other.getRoutingOrder()==null) || 
             (this.routingOrder!=null &&
              this.routingOrder.equals(other.getRoutingOrder()))) &&
            ((this.sent==null && other.getSent()==null) || 
             (this.sent!=null &&
              this.sent.equals(other.getSent()))) &&
            ((this.delivered==null && other.getDelivered()==null) || 
             (this.delivered!=null &&
              this.delivered.equals(other.getDelivered()))) &&
            ((this.signed==null && other.getSigned()==null) || 
             (this.signed!=null &&
              this.signed.equals(other.getSigned()))) &&
            ((this.declined==null && other.getDeclined()==null) || 
             (this.declined!=null &&
              this.declined.equals(other.getDeclined()))) &&
            ((this.declineReason==null && other.getDeclineReason()==null) || 
             (this.declineReason!=null &&
              this.declineReason.equals(other.getDeclineReason()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.recipientIPAddress==null && other.getRecipientIPAddress()==null) || 
             (this.recipientIPAddress!=null &&
              this.recipientIPAddress.equals(other.getRecipientIPAddress()))) &&
            ((this.clientUserId==null && other.getClientUserId()==null) || 
             (this.clientUserId!=null &&
              this.clientUserId.equals(other.getClientUserId()))) &&
            ((this.autoNavigation==null && other.getAutoNavigation()==null) || 
             (this.autoNavigation!=null &&
              this.autoNavigation.equals(other.getAutoNavigation()))) &&
            ((this.IDCheckInformation==null && other.getIDCheckInformation()==null) || 
             (this.IDCheckInformation!=null &&
              this.IDCheckInformation.equals(other.getIDCheckInformation()))) &&
            ((this.recipientAuthenticationStatus==null && other.getRecipientAuthenticationStatus()==null) || 
             (this.recipientAuthenticationStatus!=null &&
              this.recipientAuthenticationStatus.equals(other.getRecipientAuthenticationStatus()))) &&
            ((this.customFields==null && other.getCustomFields()==null) || 
             (this.customFields!=null &&
              java.util.Arrays.equals(this.customFields, other.getCustomFields()))) &&
            ((this.tabStatuses==null && other.getTabStatuses()==null) || 
             (this.tabStatuses!=null &&
              java.util.Arrays.equals(this.tabStatuses, other.getTabStatuses()))) &&
            ((this.recipientAttachment==null && other.getRecipientAttachment()==null) || 
             (this.recipientAttachment!=null &&
              java.util.Arrays.equals(this.recipientAttachment, other.getRecipientAttachment()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.esignAgreementInformation==null && other.getEsignAgreementInformation()==null) || 
             (this.esignAgreementInformation!=null &&
              this.esignAgreementInformation.equals(other.getEsignAgreementInformation()))) &&
            ((this.formData==null && other.getFormData()==null) || 
             (this.formData!=null &&
              this.formData.equals(other.getFormData()))) &&
            ((this.recipientId==null && other.getRecipientId()==null) || 
             (this.recipientId!=null &&
              this.recipientId.equals(other.getRecipientId())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getRoutingOrder() != null) {
            _hashCode += getRoutingOrder().hashCode();
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
        if (getDeclined() != null) {
            _hashCode += getDeclined().hashCode();
        }
        if (getDeclineReason() != null) {
            _hashCode += getDeclineReason().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRecipientIPAddress() != null) {
            _hashCode += getRecipientIPAddress().hashCode();
        }
        if (getClientUserId() != null) {
            _hashCode += getClientUserId().hashCode();
        }
        if (getAutoNavigation() != null) {
            _hashCode += getAutoNavigation().hashCode();
        }
        if (getIDCheckInformation() != null) {
            _hashCode += getIDCheckInformation().hashCode();
        }
        if (getRecipientAuthenticationStatus() != null) {
            _hashCode += getRecipientAuthenticationStatus().hashCode();
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
        if (getTabStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTabStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTabStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipientAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipientAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getEsignAgreementInformation() != null) {
            _hashCode += getEsignAgreementInformation().hashCode();
        }
        if (getFormData() != null) {
            _hashCode += getFormData().hashCode();
        }
        if (getRecipientId() != null) {
            _hashCode += getRecipientId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecipientStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientTypeCode"));
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
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoutingOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
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
        elemField.setFieldName("declined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Declined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declineReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeclineReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("IDCheckInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientAuthenticationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientAuthenticationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthenticationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomField"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esignAgreementInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EsignAgreementInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatusEsignAgreementInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FormData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FormData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
