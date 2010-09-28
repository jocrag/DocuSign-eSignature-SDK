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
 * AuthoritativeCopyExportStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class AuthoritativeCopyExportStatus  implements java.io.Serializable {
    private java.lang.Boolean authoritativeCopyExportSuccess;

    private java.lang.String envelopeId;

    private java.lang.String exportKey;

    public AuthoritativeCopyExportStatus() {
    }

    public AuthoritativeCopyExportStatus(
           java.lang.Boolean authoritativeCopyExportSuccess,
           java.lang.String envelopeId,
           java.lang.String exportKey) {
           this.authoritativeCopyExportSuccess = authoritativeCopyExportSuccess;
           this.envelopeId = envelopeId;
           this.exportKey = exportKey;
    }


    /**
     * Gets the authoritativeCopyExportSuccess value for this AuthoritativeCopyExportStatus.
     * 
     * @return authoritativeCopyExportSuccess
     */
    public java.lang.Boolean getAuthoritativeCopyExportSuccess() {
        return authoritativeCopyExportSuccess;
    }


    /**
     * Sets the authoritativeCopyExportSuccess value for this AuthoritativeCopyExportStatus.
     * 
     * @param authoritativeCopyExportSuccess
     */
    public void setAuthoritativeCopyExportSuccess(java.lang.Boolean authoritativeCopyExportSuccess) {
        this.authoritativeCopyExportSuccess = authoritativeCopyExportSuccess;
    }


    /**
     * Gets the envelopeId value for this AuthoritativeCopyExportStatus.
     * 
     * @return envelopeId
     */
    public java.lang.String getEnvelopeId() {
        return envelopeId;
    }


    /**
     * Sets the envelopeId value for this AuthoritativeCopyExportStatus.
     * 
     * @param envelopeId
     */
    public void setEnvelopeId(java.lang.String envelopeId) {
        this.envelopeId = envelopeId;
    }


    /**
     * Gets the exportKey value for this AuthoritativeCopyExportStatus.
     * 
     * @return exportKey
     */
    public java.lang.String getExportKey() {
        return exportKey;
    }


    /**
     * Sets the exportKey value for this AuthoritativeCopyExportStatus.
     * 
     * @param exportKey
     */
    public void setExportKey(java.lang.String exportKey) {
        this.exportKey = exportKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthoritativeCopyExportStatus)) return false;
        AuthoritativeCopyExportStatus other = (AuthoritativeCopyExportStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authoritativeCopyExportSuccess==null && other.getAuthoritativeCopyExportSuccess()==null) || 
             (this.authoritativeCopyExportSuccess!=null &&
              this.authoritativeCopyExportSuccess.equals(other.getAuthoritativeCopyExportSuccess()))) &&
            ((this.envelopeId==null && other.getEnvelopeId()==null) || 
             (this.envelopeId!=null &&
              this.envelopeId.equals(other.getEnvelopeId()))) &&
            ((this.exportKey==null && other.getExportKey()==null) || 
             (this.exportKey!=null &&
              this.exportKey.equals(other.getExportKey())));
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
        if (getAuthoritativeCopyExportSuccess() != null) {
            _hashCode += getAuthoritativeCopyExportSuccess().hashCode();
        }
        if (getEnvelopeId() != null) {
            _hashCode += getEnvelopeId().hashCode();
        }
        if (getExportKey() != null) {
            _hashCode += getExportKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthoritativeCopyExportStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopyExportStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authoritativeCopyExportSuccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopyExportSuccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ExportKey"));
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
