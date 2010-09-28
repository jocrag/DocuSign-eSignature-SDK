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
 * SSN9InformationInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class SSN9InformationInput  implements java.io.Serializable {
    private net.docusign.www.API._3_0.SSN9Information SSN9Information;

    private net.docusign.www.API._3_0.DisplayLevelCode displayLevel;

    public SSN9InformationInput() {
    }

    public SSN9InformationInput(
           net.docusign.www.API._3_0.SSN9Information SSN9Information,
           net.docusign.www.API._3_0.DisplayLevelCode displayLevel) {
           this.SSN9Information = SSN9Information;
           this.displayLevel = displayLevel;
    }


    /**
     * Gets the SSN9Information value for this SSN9InformationInput.
     * 
     * @return SSN9Information
     */
    public net.docusign.www.API._3_0.SSN9Information getSSN9Information() {
        return SSN9Information;
    }


    /**
     * Sets the SSN9Information value for this SSN9InformationInput.
     * 
     * @param SSN9Information
     */
    public void setSSN9Information(net.docusign.www.API._3_0.SSN9Information SSN9Information) {
        this.SSN9Information = SSN9Information;
    }


    /**
     * Gets the displayLevel value for this SSN9InformationInput.
     * 
     * @return displayLevel
     */
    public net.docusign.www.API._3_0.DisplayLevelCode getDisplayLevel() {
        return displayLevel;
    }


    /**
     * Sets the displayLevel value for this SSN9InformationInput.
     * 
     * @param displayLevel
     */
    public void setDisplayLevel(net.docusign.www.API._3_0.DisplayLevelCode displayLevel) {
        this.displayLevel = displayLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SSN9InformationInput)) return false;
        SSN9InformationInput other = (SSN9InformationInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SSN9Information==null && other.getSSN9Information()==null) || 
             (this.SSN9Information!=null &&
              this.SSN9Information.equals(other.getSSN9Information()))) &&
            ((this.displayLevel==null && other.getDisplayLevel()==null) || 
             (this.displayLevel!=null &&
              this.displayLevel.equals(other.getDisplayLevel())));
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
        if (getSSN9Information() != null) {
            _hashCode += getSSN9Information().hashCode();
        }
        if (getDisplayLevel() != null) {
            _hashCode += getDisplayLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SSN9InformationInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN9InformationInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSN9Information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN9Information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN9Information"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DisplayLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DisplayLevelCode"));
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
