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
 * IDCheckInformationInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class IDCheckInformationInput  implements java.io.Serializable {
    private net.docusign.www.API._3_0.AddressInformationInput addressInformationInput;

    private net.docusign.www.API._3_0.DOBInformationInput DOBInformationInput;

    private net.docusign.www.API._3_0.SSN4InformationInput SSN4InformationInput;

    private net.docusign.www.API._3_0.SSN9InformationInput SSN9InformationInput;

    public IDCheckInformationInput() {
    }

    public IDCheckInformationInput(
           net.docusign.www.API._3_0.AddressInformationInput addressInformationInput,
           net.docusign.www.API._3_0.DOBInformationInput DOBInformationInput,
           net.docusign.www.API._3_0.SSN4InformationInput SSN4InformationInput,
           net.docusign.www.API._3_0.SSN9InformationInput SSN9InformationInput) {
           this.addressInformationInput = addressInformationInput;
           this.DOBInformationInput = DOBInformationInput;
           this.SSN4InformationInput = SSN4InformationInput;
           this.SSN9InformationInput = SSN9InformationInput;
    }


    /**
     * Gets the addressInformationInput value for this IDCheckInformationInput.
     * 
     * @return addressInformationInput
     */
    public net.docusign.www.API._3_0.AddressInformationInput getAddressInformationInput() {
        return addressInformationInput;
    }


    /**
     * Sets the addressInformationInput value for this IDCheckInformationInput.
     * 
     * @param addressInformationInput
     */
    public void setAddressInformationInput(net.docusign.www.API._3_0.AddressInformationInput addressInformationInput) {
        this.addressInformationInput = addressInformationInput;
    }


    /**
     * Gets the DOBInformationInput value for this IDCheckInformationInput.
     * 
     * @return DOBInformationInput
     */
    public net.docusign.www.API._3_0.DOBInformationInput getDOBInformationInput() {
        return DOBInformationInput;
    }


    /**
     * Sets the DOBInformationInput value for this IDCheckInformationInput.
     * 
     * @param DOBInformationInput
     */
    public void setDOBInformationInput(net.docusign.www.API._3_0.DOBInformationInput DOBInformationInput) {
        this.DOBInformationInput = DOBInformationInput;
    }


    /**
     * Gets the SSN4InformationInput value for this IDCheckInformationInput.
     * 
     * @return SSN4InformationInput
     */
    public net.docusign.www.API._3_0.SSN4InformationInput getSSN4InformationInput() {
        return SSN4InformationInput;
    }


    /**
     * Sets the SSN4InformationInput value for this IDCheckInformationInput.
     * 
     * @param SSN4InformationInput
     */
    public void setSSN4InformationInput(net.docusign.www.API._3_0.SSN4InformationInput SSN4InformationInput) {
        this.SSN4InformationInput = SSN4InformationInput;
    }


    /**
     * Gets the SSN9InformationInput value for this IDCheckInformationInput.
     * 
     * @return SSN9InformationInput
     */
    public net.docusign.www.API._3_0.SSN9InformationInput getSSN9InformationInput() {
        return SSN9InformationInput;
    }


    /**
     * Sets the SSN9InformationInput value for this IDCheckInformationInput.
     * 
     * @param SSN9InformationInput
     */
    public void setSSN9InformationInput(net.docusign.www.API._3_0.SSN9InformationInput SSN9InformationInput) {
        this.SSN9InformationInput = SSN9InformationInput;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IDCheckInformationInput)) return false;
        IDCheckInformationInput other = (IDCheckInformationInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressInformationInput==null && other.getAddressInformationInput()==null) || 
             (this.addressInformationInput!=null &&
              this.addressInformationInput.equals(other.getAddressInformationInput()))) &&
            ((this.DOBInformationInput==null && other.getDOBInformationInput()==null) || 
             (this.DOBInformationInput!=null &&
              this.DOBInformationInput.equals(other.getDOBInformationInput()))) &&
            ((this.SSN4InformationInput==null && other.getSSN4InformationInput()==null) || 
             (this.SSN4InformationInput!=null &&
              this.SSN4InformationInput.equals(other.getSSN4InformationInput()))) &&
            ((this.SSN9InformationInput==null && other.getSSN9InformationInput()==null) || 
             (this.SSN9InformationInput!=null &&
              this.SSN9InformationInput.equals(other.getSSN9InformationInput())));
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
        if (getAddressInformationInput() != null) {
            _hashCode += getAddressInformationInput().hashCode();
        }
        if (getDOBInformationInput() != null) {
            _hashCode += getDOBInformationInput().hashCode();
        }
        if (getSSN4InformationInput() != null) {
            _hashCode += getSSN4InformationInput().hashCode();
        }
        if (getSSN9InformationInput() != null) {
            _hashCode += getSSN9InformationInput().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IDCheckInformationInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformationInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInformationInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressInformationInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressInformationInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOBInformationInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DOBInformationInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DOBInformationInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSN4InformationInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN4InformationInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN4InformationInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSN9InformationInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN9InformationInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN9InformationInput"));
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
