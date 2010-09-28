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
 * CorrectionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class CorrectionStatus  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeSettings envelopeSettingsCorrectionStatus;

    private net.docusign.www.API._3_0.RecipientCorrectionStatus[] recipientCorrectionStatuses;

    public CorrectionStatus() {
    }

    public CorrectionStatus(
           net.docusign.www.API._3_0.EnvelopeSettings envelopeSettingsCorrectionStatus,
           net.docusign.www.API._3_0.RecipientCorrectionStatus[] recipientCorrectionStatuses) {
           this.envelopeSettingsCorrectionStatus = envelopeSettingsCorrectionStatus;
           this.recipientCorrectionStatuses = recipientCorrectionStatuses;
    }


    /**
     * Gets the envelopeSettingsCorrectionStatus value for this CorrectionStatus.
     * 
     * @return envelopeSettingsCorrectionStatus
     */
    public net.docusign.www.API._3_0.EnvelopeSettings getEnvelopeSettingsCorrectionStatus() {
        return envelopeSettingsCorrectionStatus;
    }


    /**
     * Sets the envelopeSettingsCorrectionStatus value for this CorrectionStatus.
     * 
     * @param envelopeSettingsCorrectionStatus
     */
    public void setEnvelopeSettingsCorrectionStatus(net.docusign.www.API._3_0.EnvelopeSettings envelopeSettingsCorrectionStatus) {
        this.envelopeSettingsCorrectionStatus = envelopeSettingsCorrectionStatus;
    }


    /**
     * Gets the recipientCorrectionStatuses value for this CorrectionStatus.
     * 
     * @return recipientCorrectionStatuses
     */
    public net.docusign.www.API._3_0.RecipientCorrectionStatus[] getRecipientCorrectionStatuses() {
        return recipientCorrectionStatuses;
    }


    /**
     * Sets the recipientCorrectionStatuses value for this CorrectionStatus.
     * 
     * @param recipientCorrectionStatuses
     */
    public void setRecipientCorrectionStatuses(net.docusign.www.API._3_0.RecipientCorrectionStatus[] recipientCorrectionStatuses) {
        this.recipientCorrectionStatuses = recipientCorrectionStatuses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorrectionStatus)) return false;
        CorrectionStatus other = (CorrectionStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeSettingsCorrectionStatus==null && other.getEnvelopeSettingsCorrectionStatus()==null) || 
             (this.envelopeSettingsCorrectionStatus!=null &&
              this.envelopeSettingsCorrectionStatus.equals(other.getEnvelopeSettingsCorrectionStatus()))) &&
            ((this.recipientCorrectionStatuses==null && other.getRecipientCorrectionStatuses()==null) || 
             (this.recipientCorrectionStatuses!=null &&
              java.util.Arrays.equals(this.recipientCorrectionStatuses, other.getRecipientCorrectionStatuses())));
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
        if (getEnvelopeSettingsCorrectionStatus() != null) {
            _hashCode += getEnvelopeSettingsCorrectionStatus().hashCode();
        }
        if (getRecipientCorrectionStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientCorrectionStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipientCorrectionStatuses(), i);
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
        new org.apache.axis.description.TypeDesc(CorrectionStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectionStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeSettingsCorrectionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeSettingsCorrectionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientCorrectionStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrectionStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrectionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrectionStatus"));
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
