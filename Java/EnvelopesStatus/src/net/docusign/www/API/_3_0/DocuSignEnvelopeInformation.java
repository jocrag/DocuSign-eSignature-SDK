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
 * DocuSignEnvelopeInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class DocuSignEnvelopeInformation  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeStatus envelopeStatus;

    private net.docusign.www.API._3_0.DocumentPDF[] documentPDFs;

    public DocuSignEnvelopeInformation() {
    }

    public DocuSignEnvelopeInformation(
           net.docusign.www.API._3_0.EnvelopeStatus envelopeStatus,
           net.docusign.www.API._3_0.DocumentPDF[] documentPDFs) {
           this.envelopeStatus = envelopeStatus;
           this.documentPDFs = documentPDFs;
    }


    /**
     * Gets the envelopeStatus value for this DocuSignEnvelopeInformation.
     * 
     * @return envelopeStatus
     */
    public net.docusign.www.API._3_0.EnvelopeStatus getEnvelopeStatus() {
        return envelopeStatus;
    }


    /**
     * Sets the envelopeStatus value for this DocuSignEnvelopeInformation.
     * 
     * @param envelopeStatus
     */
    public void setEnvelopeStatus(net.docusign.www.API._3_0.EnvelopeStatus envelopeStatus) {
        this.envelopeStatus = envelopeStatus;
    }


    /**
     * Gets the documentPDFs value for this DocuSignEnvelopeInformation.
     * 
     * @return documentPDFs
     */
    public net.docusign.www.API._3_0.DocumentPDF[] getDocumentPDFs() {
        return documentPDFs;
    }


    /**
     * Sets the documentPDFs value for this DocuSignEnvelopeInformation.
     * 
     * @param documentPDFs
     */
    public void setDocumentPDFs(net.docusign.www.API._3_0.DocumentPDF[] documentPDFs) {
        this.documentPDFs = documentPDFs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocuSignEnvelopeInformation)) return false;
        DocuSignEnvelopeInformation other = (DocuSignEnvelopeInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeStatus==null && other.getEnvelopeStatus()==null) || 
             (this.envelopeStatus!=null &&
              this.envelopeStatus.equals(other.getEnvelopeStatus()))) &&
            ((this.documentPDFs==null && other.getDocumentPDFs()==null) || 
             (this.documentPDFs!=null &&
              java.util.Arrays.equals(this.documentPDFs, other.getDocumentPDFs())));
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
        if (getEnvelopeStatus() != null) {
            _hashCode += getEnvelopeStatus().hashCode();
        }
        if (getDocumentPDFs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentPDFs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentPDFs(), i);
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
        new org.apache.axis.description.TypeDesc(DocuSignEnvelopeInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocuSignEnvelopeInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentPDFs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDFs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF"));
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
