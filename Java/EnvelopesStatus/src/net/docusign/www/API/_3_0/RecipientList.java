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
 * RecipientList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientList  implements java.io.Serializable {
    private java.lang.Boolean reservedRecipientEmail;

    private java.lang.Boolean multipleUsers;

    private java.lang.String[] recipientName;

    public RecipientList() {
    }

    public RecipientList(
           java.lang.Boolean reservedRecipientEmail,
           java.lang.Boolean multipleUsers,
           java.lang.String[] recipientName) {
           this.reservedRecipientEmail = reservedRecipientEmail;
           this.multipleUsers = multipleUsers;
           this.recipientName = recipientName;
    }


    /**
     * Gets the reservedRecipientEmail value for this RecipientList.
     * 
     * @return reservedRecipientEmail
     */
    public java.lang.Boolean getReservedRecipientEmail() {
        return reservedRecipientEmail;
    }


    /**
     * Sets the reservedRecipientEmail value for this RecipientList.
     * 
     * @param reservedRecipientEmail
     */
    public void setReservedRecipientEmail(java.lang.Boolean reservedRecipientEmail) {
        this.reservedRecipientEmail = reservedRecipientEmail;
    }


    /**
     * Gets the multipleUsers value for this RecipientList.
     * 
     * @return multipleUsers
     */
    public java.lang.Boolean getMultipleUsers() {
        return multipleUsers;
    }


    /**
     * Sets the multipleUsers value for this RecipientList.
     * 
     * @param multipleUsers
     */
    public void setMultipleUsers(java.lang.Boolean multipleUsers) {
        this.multipleUsers = multipleUsers;
    }


    /**
     * Gets the recipientName value for this RecipientList.
     * 
     * @return recipientName
     */
    public java.lang.String[] getRecipientName() {
        return recipientName;
    }


    /**
     * Sets the recipientName value for this RecipientList.
     * 
     * @param recipientName
     */
    public void setRecipientName(java.lang.String[] recipientName) {
        this.recipientName = recipientName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientList)) return false;
        RecipientList other = (RecipientList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reservedRecipientEmail==null && other.getReservedRecipientEmail()==null) || 
             (this.reservedRecipientEmail!=null &&
              this.reservedRecipientEmail.equals(other.getReservedRecipientEmail()))) &&
            ((this.multipleUsers==null && other.getMultipleUsers()==null) || 
             (this.multipleUsers!=null &&
              this.multipleUsers.equals(other.getMultipleUsers()))) &&
            ((this.recipientName==null && other.getRecipientName()==null) || 
             (this.recipientName!=null &&
              java.util.Arrays.equals(this.recipientName, other.getRecipientName())));
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
        if (getReservedRecipientEmail() != null) {
            _hashCode += getReservedRecipientEmail().hashCode();
        }
        if (getMultipleUsers() != null) {
            _hashCode += getMultipleUsers().hashCode();
        }
        if (getRecipientName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipientName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecipientList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedRecipientEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReservedRecipientEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipleUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MultipleUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientName"));
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
