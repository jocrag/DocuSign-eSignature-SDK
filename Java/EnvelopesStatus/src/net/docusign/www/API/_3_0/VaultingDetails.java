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
 * VaultingDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class VaultingDetails  implements java.io.Serializable {
    private java.lang.String EODTransactionName;

    private java.lang.String EODTransactionID;

    private java.lang.String EODDocumentProfileID;

    public VaultingDetails() {
    }

    public VaultingDetails(
           java.lang.String EODTransactionName,
           java.lang.String EODTransactionID,
           java.lang.String EODDocumentProfileID) {
           this.EODTransactionName = EODTransactionName;
           this.EODTransactionID = EODTransactionID;
           this.EODDocumentProfileID = EODDocumentProfileID;
    }


    /**
     * Gets the EODTransactionName value for this VaultingDetails.
     * 
     * @return EODTransactionName
     */
    public java.lang.String getEODTransactionName() {
        return EODTransactionName;
    }


    /**
     * Sets the EODTransactionName value for this VaultingDetails.
     * 
     * @param EODTransactionName
     */
    public void setEODTransactionName(java.lang.String EODTransactionName) {
        this.EODTransactionName = EODTransactionName;
    }


    /**
     * Gets the EODTransactionID value for this VaultingDetails.
     * 
     * @return EODTransactionID
     */
    public java.lang.String getEODTransactionID() {
        return EODTransactionID;
    }


    /**
     * Sets the EODTransactionID value for this VaultingDetails.
     * 
     * @param EODTransactionID
     */
    public void setEODTransactionID(java.lang.String EODTransactionID) {
        this.EODTransactionID = EODTransactionID;
    }


    /**
     * Gets the EODDocumentProfileID value for this VaultingDetails.
     * 
     * @return EODDocumentProfileID
     */
    public java.lang.String getEODDocumentProfileID() {
        return EODDocumentProfileID;
    }


    /**
     * Sets the EODDocumentProfileID value for this VaultingDetails.
     * 
     * @param EODDocumentProfileID
     */
    public void setEODDocumentProfileID(java.lang.String EODDocumentProfileID) {
        this.EODDocumentProfileID = EODDocumentProfileID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VaultingDetails)) return false;
        VaultingDetails other = (VaultingDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EODTransactionName==null && other.getEODTransactionName()==null) || 
             (this.EODTransactionName!=null &&
              this.EODTransactionName.equals(other.getEODTransactionName()))) &&
            ((this.EODTransactionID==null && other.getEODTransactionID()==null) || 
             (this.EODTransactionID!=null &&
              this.EODTransactionID.equals(other.getEODTransactionID()))) &&
            ((this.EODDocumentProfileID==null && other.getEODDocumentProfileID()==null) || 
             (this.EODDocumentProfileID!=null &&
              this.EODDocumentProfileID.equals(other.getEODDocumentProfileID())));
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
        if (getEODTransactionName() != null) {
            _hashCode += getEODTransactionName().hashCode();
        }
        if (getEODTransactionID() != null) {
            _hashCode += getEODTransactionID().hashCode();
        }
        if (getEODDocumentProfileID() != null) {
            _hashCode += getEODDocumentProfileID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VaultingDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EODTransactionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EODTransactionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EODTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EODTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EODDocumentProfileID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EODDocumentProfileID"));
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
