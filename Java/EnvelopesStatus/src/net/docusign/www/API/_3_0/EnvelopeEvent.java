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
 * EnvelopeEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeEvent  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeEventStatusCode envelopeEventStatusCode;

    private boolean includeDocuments;

    public EnvelopeEvent() {
    }

    public EnvelopeEvent(
           net.docusign.www.API._3_0.EnvelopeEventStatusCode envelopeEventStatusCode,
           boolean includeDocuments) {
           this.envelopeEventStatusCode = envelopeEventStatusCode;
           this.includeDocuments = includeDocuments;
    }


    /**
     * Gets the envelopeEventStatusCode value for this EnvelopeEvent.
     * 
     * @return envelopeEventStatusCode
     */
    public net.docusign.www.API._3_0.EnvelopeEventStatusCode getEnvelopeEventStatusCode() {
        return envelopeEventStatusCode;
    }


    /**
     * Sets the envelopeEventStatusCode value for this EnvelopeEvent.
     * 
     * @param envelopeEventStatusCode
     */
    public void setEnvelopeEventStatusCode(net.docusign.www.API._3_0.EnvelopeEventStatusCode envelopeEventStatusCode) {
        this.envelopeEventStatusCode = envelopeEventStatusCode;
    }


    /**
     * Gets the includeDocuments value for this EnvelopeEvent.
     * 
     * @return includeDocuments
     */
    public boolean isIncludeDocuments() {
        return includeDocuments;
    }


    /**
     * Sets the includeDocuments value for this EnvelopeEvent.
     * 
     * @param includeDocuments
     */
    public void setIncludeDocuments(boolean includeDocuments) {
        this.includeDocuments = includeDocuments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeEvent)) return false;
        EnvelopeEvent other = (EnvelopeEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeEventStatusCode==null && other.getEnvelopeEventStatusCode()==null) || 
             (this.envelopeEventStatusCode!=null &&
              this.envelopeEventStatusCode.equals(other.getEnvelopeEventStatusCode()))) &&
            this.includeDocuments == other.isIncludeDocuments();
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
        if (getEnvelopeEventStatusCode() != null) {
            _hashCode += getEnvelopeEventStatusCode().hashCode();
        }
        _hashCode += (isIncludeDocuments() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeEventStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEventStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEventStatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocuments"));
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
