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
 * RequestTemplates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestTemplates  implements java.io.Serializable {
    private java.lang.String accountID;

    private boolean includeAdvancedTemplates;

    public RequestTemplates() {
    }

    public RequestTemplates(
           java.lang.String accountID,
           boolean includeAdvancedTemplates) {
           this.accountID = accountID;
           this.includeAdvancedTemplates = includeAdvancedTemplates;
    }


    /**
     * Gets the accountID value for this RequestTemplates.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this RequestTemplates.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the includeAdvancedTemplates value for this RequestTemplates.
     * 
     * @return includeAdvancedTemplates
     */
    public boolean isIncludeAdvancedTemplates() {
        return includeAdvancedTemplates;
    }


    /**
     * Sets the includeAdvancedTemplates value for this RequestTemplates.
     * 
     * @param includeAdvancedTemplates
     */
    public void setIncludeAdvancedTemplates(boolean includeAdvancedTemplates) {
        this.includeAdvancedTemplates = includeAdvancedTemplates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestTemplates)) return false;
        RequestTemplates other = (RequestTemplates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            this.includeAdvancedTemplates == other.isIncludeAdvancedTemplates();
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
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        _hashCode += (isIncludeAdvancedTemplates() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestTemplates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeAdvancedTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeAdvancedTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
