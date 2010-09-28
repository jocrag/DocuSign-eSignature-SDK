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
 * FolderItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class FolderItem  implements java.io.Serializable {
    private java.lang.String envelopeId;

    private net.docusign.www.API._3_0.EnvelopeStatusCode status;

    private java.lang.String owner;

    private java.lang.String senderName;

    private java.lang.String senderEmail;

    private java.lang.String senderCompany;

    private net.docusign.www.API._3_0.RecipientStatus[] recipientStatuses;

    private net.docusign.www.API._3_0.CustomField[] customFields;

    private java.util.Calendar created;

    private java.util.Calendar sent;

    private java.util.Calendar completed;

    private java.lang.String subject;

    public FolderItem() {
    }

    public FolderItem(
           java.lang.String envelopeId,
           net.docusign.www.API._3_0.EnvelopeStatusCode status,
           java.lang.String owner,
           java.lang.String senderName,
           java.lang.String senderEmail,
           java.lang.String senderCompany,
           net.docusign.www.API._3_0.RecipientStatus[] recipientStatuses,
           net.docusign.www.API._3_0.CustomField[] customFields,
           java.util.Calendar created,
           java.util.Calendar sent,
           java.util.Calendar completed,
           java.lang.String subject) {
           this.envelopeId = envelopeId;
           this.status = status;
           this.owner = owner;
           this.senderName = senderName;
           this.senderEmail = senderEmail;
           this.senderCompany = senderCompany;
           this.recipientStatuses = recipientStatuses;
           this.customFields = customFields;
           this.created = created;
           this.sent = sent;
           this.completed = completed;
           this.subject = subject;
    }


    /**
     * Gets the envelopeId value for this FolderItem.
     * 
     * @return envelopeId
     */
    public java.lang.String getEnvelopeId() {
        return envelopeId;
    }


    /**
     * Sets the envelopeId value for this FolderItem.
     * 
     * @param envelopeId
     */
    public void setEnvelopeId(java.lang.String envelopeId) {
        this.envelopeId = envelopeId;
    }


    /**
     * Gets the status value for this FolderItem.
     * 
     * @return status
     */
    public net.docusign.www.API._3_0.EnvelopeStatusCode getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FolderItem.
     * 
     * @param status
     */
    public void setStatus(net.docusign.www.API._3_0.EnvelopeStatusCode status) {
        this.status = status;
    }


    /**
     * Gets the owner value for this FolderItem.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this FolderItem.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the senderName value for this FolderItem.
     * 
     * @return senderName
     */
    public java.lang.String getSenderName() {
        return senderName;
    }


    /**
     * Sets the senderName value for this FolderItem.
     * 
     * @param senderName
     */
    public void setSenderName(java.lang.String senderName) {
        this.senderName = senderName;
    }


    /**
     * Gets the senderEmail value for this FolderItem.
     * 
     * @return senderEmail
     */
    public java.lang.String getSenderEmail() {
        return senderEmail;
    }


    /**
     * Sets the senderEmail value for this FolderItem.
     * 
     * @param senderEmail
     */
    public void setSenderEmail(java.lang.String senderEmail) {
        this.senderEmail = senderEmail;
    }


    /**
     * Gets the senderCompany value for this FolderItem.
     * 
     * @return senderCompany
     */
    public java.lang.String getSenderCompany() {
        return senderCompany;
    }


    /**
     * Sets the senderCompany value for this FolderItem.
     * 
     * @param senderCompany
     */
    public void setSenderCompany(java.lang.String senderCompany) {
        this.senderCompany = senderCompany;
    }


    /**
     * Gets the recipientStatuses value for this FolderItem.
     * 
     * @return recipientStatuses
     */
    public net.docusign.www.API._3_0.RecipientStatus[] getRecipientStatuses() {
        return recipientStatuses;
    }


    /**
     * Sets the recipientStatuses value for this FolderItem.
     * 
     * @param recipientStatuses
     */
    public void setRecipientStatuses(net.docusign.www.API._3_0.RecipientStatus[] recipientStatuses) {
        this.recipientStatuses = recipientStatuses;
    }


    /**
     * Gets the customFields value for this FolderItem.
     * 
     * @return customFields
     */
    public net.docusign.www.API._3_0.CustomField[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this FolderItem.
     * 
     * @param customFields
     */
    public void setCustomFields(net.docusign.www.API._3_0.CustomField[] customFields) {
        this.customFields = customFields;
    }


    /**
     * Gets the created value for this FolderItem.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this FolderItem.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the sent value for this FolderItem.
     * 
     * @return sent
     */
    public java.util.Calendar getSent() {
        return sent;
    }


    /**
     * Sets the sent value for this FolderItem.
     * 
     * @param sent
     */
    public void setSent(java.util.Calendar sent) {
        this.sent = sent;
    }


    /**
     * Gets the completed value for this FolderItem.
     * 
     * @return completed
     */
    public java.util.Calendar getCompleted() {
        return completed;
    }


    /**
     * Sets the completed value for this FolderItem.
     * 
     * @param completed
     */
    public void setCompleted(java.util.Calendar completed) {
        this.completed = completed;
    }


    /**
     * Gets the subject value for this FolderItem.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this FolderItem.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FolderItem)) return false;
        FolderItem other = (FolderItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeId==null && other.getEnvelopeId()==null) || 
             (this.envelopeId!=null &&
              this.envelopeId.equals(other.getEnvelopeId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.senderName==null && other.getSenderName()==null) || 
             (this.senderName!=null &&
              this.senderName.equals(other.getSenderName()))) &&
            ((this.senderEmail==null && other.getSenderEmail()==null) || 
             (this.senderEmail!=null &&
              this.senderEmail.equals(other.getSenderEmail()))) &&
            ((this.senderCompany==null && other.getSenderCompany()==null) || 
             (this.senderCompany!=null &&
              this.senderCompany.equals(other.getSenderCompany()))) &&
            ((this.recipientStatuses==null && other.getRecipientStatuses()==null) || 
             (this.recipientStatuses!=null &&
              java.util.Arrays.equals(this.recipientStatuses, other.getRecipientStatuses()))) &&
            ((this.customFields==null && other.getCustomFields()==null) || 
             (this.customFields!=null &&
              java.util.Arrays.equals(this.customFields, other.getCustomFields()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.sent==null && other.getSent()==null) || 
             (this.sent!=null &&
              this.sent.equals(other.getSent()))) &&
            ((this.completed==null && other.getCompleted()==null) || 
             (this.completed!=null &&
              this.completed.equals(other.getCompleted()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject())));
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
        if (getEnvelopeId() != null) {
            _hashCode += getEnvelopeId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getSenderName() != null) {
            _hashCode += getSenderName().hashCode();
        }
        if (getSenderEmail() != null) {
            _hashCode += getSenderEmail().hashCode();
        }
        if (getSenderCompany() != null) {
            _hashCode += getSenderCompany().hashCode();
        }
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
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getSent() != null) {
            _hashCode += getSent().hashCode();
        }
        if (getCompleted() != null) {
            _hashCode += getCompleted().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FolderItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"));
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
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatus"));
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
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Created"));
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
        elemField.setFieldName("completed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Completed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
