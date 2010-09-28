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
 * PurgeDocumentStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class PurgeDocumentStatus  implements java.io.Serializable {
    private boolean purgeDocumentSuccess;

    private java.lang.String purgeDocumentError;

    public PurgeDocumentStatus() {
    }

    public PurgeDocumentStatus(
           boolean purgeDocumentSuccess,
           java.lang.String purgeDocumentError) {
           this.purgeDocumentSuccess = purgeDocumentSuccess;
           this.purgeDocumentError = purgeDocumentError;
    }


    /**
     * Gets the purgeDocumentSuccess value for this PurgeDocumentStatus.
     * 
     * @return purgeDocumentSuccess
     */
    public boolean isPurgeDocumentSuccess() {
        return purgeDocumentSuccess;
    }


    /**
     * Sets the purgeDocumentSuccess value for this PurgeDocumentStatus.
     * 
     * @param purgeDocumentSuccess
     */
    public void setPurgeDocumentSuccess(boolean purgeDocumentSuccess) {
        this.purgeDocumentSuccess = purgeDocumentSuccess;
    }


    /**
     * Gets the purgeDocumentError value for this PurgeDocumentStatus.
     * 
     * @return purgeDocumentError
     */
    public java.lang.String getPurgeDocumentError() {
        return purgeDocumentError;
    }


    /**
     * Sets the purgeDocumentError value for this PurgeDocumentStatus.
     * 
     * @param purgeDocumentError
     */
    public void setPurgeDocumentError(java.lang.String purgeDocumentError) {
        this.purgeDocumentError = purgeDocumentError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurgeDocumentStatus)) return false;
        PurgeDocumentStatus other = (PurgeDocumentStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.purgeDocumentSuccess == other.isPurgeDocumentSuccess() &&
            ((this.purgeDocumentError==null && other.getPurgeDocumentError()==null) || 
             (this.purgeDocumentError!=null &&
              this.purgeDocumentError.equals(other.getPurgeDocumentError())));
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
        _hashCode += (isPurgeDocumentSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPurgeDocumentError() != null) {
            _hashCode += getPurgeDocumentError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurgeDocumentStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PurgeDocumentStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purgeDocumentSuccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PurgeDocumentSuccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purgeDocumentError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PurgeDocumentError"));
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
