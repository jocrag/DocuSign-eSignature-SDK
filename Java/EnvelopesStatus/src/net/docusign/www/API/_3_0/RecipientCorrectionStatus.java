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
 * RecipientCorrectionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientCorrectionStatus  implements java.io.Serializable {
    private boolean correctionSucceeded;

    private net.docusign.www.API._3_0.RecipientCorrection recipientCorrection;

    private net.docusign.www.API._3_0.RecipientStatus recipientStatus;

    public RecipientCorrectionStatus() {
    }

    public RecipientCorrectionStatus(
           boolean correctionSucceeded,
           net.docusign.www.API._3_0.RecipientCorrection recipientCorrection,
           net.docusign.www.API._3_0.RecipientStatus recipientStatus) {
           this.correctionSucceeded = correctionSucceeded;
           this.recipientCorrection = recipientCorrection;
           this.recipientStatus = recipientStatus;
    }


    /**
     * Gets the correctionSucceeded value for this RecipientCorrectionStatus.
     * 
     * @return correctionSucceeded
     */
    public boolean isCorrectionSucceeded() {
        return correctionSucceeded;
    }


    /**
     * Sets the correctionSucceeded value for this RecipientCorrectionStatus.
     * 
     * @param correctionSucceeded
     */
    public void setCorrectionSucceeded(boolean correctionSucceeded) {
        this.correctionSucceeded = correctionSucceeded;
    }


    /**
     * Gets the recipientCorrection value for this RecipientCorrectionStatus.
     * 
     * @return recipientCorrection
     */
    public net.docusign.www.API._3_0.RecipientCorrection getRecipientCorrection() {
        return recipientCorrection;
    }


    /**
     * Sets the recipientCorrection value for this RecipientCorrectionStatus.
     * 
     * @param recipientCorrection
     */
    public void setRecipientCorrection(net.docusign.www.API._3_0.RecipientCorrection recipientCorrection) {
        this.recipientCorrection = recipientCorrection;
    }


    /**
     * Gets the recipientStatus value for this RecipientCorrectionStatus.
     * 
     * @return recipientStatus
     */
    public net.docusign.www.API._3_0.RecipientStatus getRecipientStatus() {
        return recipientStatus;
    }


    /**
     * Sets the recipientStatus value for this RecipientCorrectionStatus.
     * 
     * @param recipientStatus
     */
    public void setRecipientStatus(net.docusign.www.API._3_0.RecipientStatus recipientStatus) {
        this.recipientStatus = recipientStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientCorrectionStatus)) return false;
        RecipientCorrectionStatus other = (RecipientCorrectionStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.correctionSucceeded == other.isCorrectionSucceeded() &&
            ((this.recipientCorrection==null && other.getRecipientCorrection()==null) || 
             (this.recipientCorrection!=null &&
              this.recipientCorrection.equals(other.getRecipientCorrection()))) &&
            ((this.recipientStatus==null && other.getRecipientStatus()==null) || 
             (this.recipientStatus!=null &&
              this.recipientStatus.equals(other.getRecipientStatus())));
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
        _hashCode += (isCorrectionSucceeded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRecipientCorrection() != null) {
            _hashCode += getRecipientCorrection().hashCode();
        }
        if (getRecipientStatus() != null) {
            _hashCode += getRecipientStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecipientCorrectionStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrectionStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctionSucceeded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectionSucceeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientCorrection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatus"));
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
