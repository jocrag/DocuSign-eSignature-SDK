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
 * DOBInformationInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class DOBInformationInput  implements java.io.Serializable {
    private net.docusign.www.API._3_0.DOBInformation DOBInformation;

    private net.docusign.www.API._3_0.DisplayLevelCode displayLevel;

    private java.lang.Boolean receiveInResponse;

    public DOBInformationInput() {
    }

    public DOBInformationInput(
           net.docusign.www.API._3_0.DOBInformation DOBInformation,
           net.docusign.www.API._3_0.DisplayLevelCode displayLevel,
           java.lang.Boolean receiveInResponse) {
           this.DOBInformation = DOBInformation;
           this.displayLevel = displayLevel;
           this.receiveInResponse = receiveInResponse;
    }


    /**
     * Gets the DOBInformation value for this DOBInformationInput.
     * 
     * @return DOBInformation
     */
    public net.docusign.www.API._3_0.DOBInformation getDOBInformation() {
        return DOBInformation;
    }


    /**
     * Sets the DOBInformation value for this DOBInformationInput.
     * 
     * @param DOBInformation
     */
    public void setDOBInformation(net.docusign.www.API._3_0.DOBInformation DOBInformation) {
        this.DOBInformation = DOBInformation;
    }


    /**
     * Gets the displayLevel value for this DOBInformationInput.
     * 
     * @return displayLevel
     */
    public net.docusign.www.API._3_0.DisplayLevelCode getDisplayLevel() {
        return displayLevel;
    }


    /**
     * Sets the displayLevel value for this DOBInformationInput.
     * 
     * @param displayLevel
     */
    public void setDisplayLevel(net.docusign.www.API._3_0.DisplayLevelCode displayLevel) {
        this.displayLevel = displayLevel;
    }


    /**
     * Gets the receiveInResponse value for this DOBInformationInput.
     * 
     * @return receiveInResponse
     */
    public java.lang.Boolean getReceiveInResponse() {
        return receiveInResponse;
    }


    /**
     * Sets the receiveInResponse value for this DOBInformationInput.
     * 
     * @param receiveInResponse
     */
    public void setReceiveInResponse(java.lang.Boolean receiveInResponse) {
        this.receiveInResponse = receiveInResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DOBInformationInput)) return false;
        DOBInformationInput other = (DOBInformationInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DOBInformation==null && other.getDOBInformation()==null) || 
             (this.DOBInformation!=null &&
              this.DOBInformation.equals(other.getDOBInformation()))) &&
            ((this.displayLevel==null && other.getDisplayLevel()==null) || 
             (this.displayLevel!=null &&
              this.displayLevel.equals(other.getDisplayLevel()))) &&
            ((this.receiveInResponse==null && other.getReceiveInResponse()==null) || 
             (this.receiveInResponse!=null &&
              this.receiveInResponse.equals(other.getReceiveInResponse())));
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
        if (getDOBInformation() != null) {
            _hashCode += getDOBInformation().hashCode();
        }
        if (getDisplayLevel() != null) {
            _hashCode += getDisplayLevel().hashCode();
        }
        if (getReceiveInResponse() != null) {
            _hashCode += getReceiveInResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DOBInformationInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DOBInformationInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOBInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DOBInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DOBInformation"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveInResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReceiveInResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
