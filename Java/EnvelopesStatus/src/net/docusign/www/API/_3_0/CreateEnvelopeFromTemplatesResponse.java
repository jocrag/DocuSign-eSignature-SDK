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
 * CreateEnvelopeFromTemplatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class CreateEnvelopeFromTemplatesResponse  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeStatus createEnvelopeFromTemplatesResult;

    public CreateEnvelopeFromTemplatesResponse() {
    }

    public CreateEnvelopeFromTemplatesResponse(
           net.docusign.www.API._3_0.EnvelopeStatus createEnvelopeFromTemplatesResult) {
           this.createEnvelopeFromTemplatesResult = createEnvelopeFromTemplatesResult;
    }


    /**
     * Gets the createEnvelopeFromTemplatesResult value for this CreateEnvelopeFromTemplatesResponse.
     * 
     * @return createEnvelopeFromTemplatesResult
     */
    public net.docusign.www.API._3_0.EnvelopeStatus getCreateEnvelopeFromTemplatesResult() {
        return createEnvelopeFromTemplatesResult;
    }


    /**
     * Sets the createEnvelopeFromTemplatesResult value for this CreateEnvelopeFromTemplatesResponse.
     * 
     * @param createEnvelopeFromTemplatesResult
     */
    public void setCreateEnvelopeFromTemplatesResult(net.docusign.www.API._3_0.EnvelopeStatus createEnvelopeFromTemplatesResult) {
        this.createEnvelopeFromTemplatesResult = createEnvelopeFromTemplatesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateEnvelopeFromTemplatesResponse)) return false;
        CreateEnvelopeFromTemplatesResponse other = (CreateEnvelopeFromTemplatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createEnvelopeFromTemplatesResult==null && other.getCreateEnvelopeFromTemplatesResult()==null) || 
             (this.createEnvelopeFromTemplatesResult!=null &&
              this.createEnvelopeFromTemplatesResult.equals(other.getCreateEnvelopeFromTemplatesResult())));
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
        if (getCreateEnvelopeFromTemplatesResult() != null) {
            _hashCode += getCreateEnvelopeFromTemplatesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateEnvelopeFromTemplatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">CreateEnvelopeFromTemplatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createEnvelopeFromTemplatesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CreateEnvelopeFromTemplatesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
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
