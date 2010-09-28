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
 * TemplateReferenceRoleAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class TemplateReferenceRoleAssignment  implements java.io.Serializable {
    private java.lang.String roleName;

    private org.apache.axis.types.PositiveInteger recipientID;

    public TemplateReferenceRoleAssignment() {
    }

    public TemplateReferenceRoleAssignment(
           java.lang.String roleName,
           org.apache.axis.types.PositiveInteger recipientID) {
           this.roleName = roleName;
           this.recipientID = recipientID;
    }


    /**
     * Gets the roleName value for this TemplateReferenceRoleAssignment.
     * 
     * @return roleName
     */
    public java.lang.String getRoleName() {
        return roleName;
    }


    /**
     * Sets the roleName value for this TemplateReferenceRoleAssignment.
     * 
     * @param roleName
     */
    public void setRoleName(java.lang.String roleName) {
        this.roleName = roleName;
    }


    /**
     * Gets the recipientID value for this TemplateReferenceRoleAssignment.
     * 
     * @return recipientID
     */
    public org.apache.axis.types.PositiveInteger getRecipientID() {
        return recipientID;
    }


    /**
     * Sets the recipientID value for this TemplateReferenceRoleAssignment.
     * 
     * @param recipientID
     */
    public void setRecipientID(org.apache.axis.types.PositiveInteger recipientID) {
        this.recipientID = recipientID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemplateReferenceRoleAssignment)) return false;
        TemplateReferenceRoleAssignment other = (TemplateReferenceRoleAssignment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.roleName==null && other.getRoleName()==null) || 
             (this.roleName!=null &&
              this.roleName.equals(other.getRoleName()))) &&
            ((this.recipientID==null && other.getRecipientID()==null) || 
             (this.recipientID!=null &&
              this.recipientID.equals(other.getRecipientID())));
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
        if (getRoleName() != null) {
            _hashCode += getRoleName().hashCode();
        }
        if (getRecipientID() != null) {
            _hashCode += getRecipientID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TemplateReferenceRoleAssignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReferenceRoleAssignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
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
