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
 * AuthenticationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class AuthenticationStatus  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EventResult accessCodeResult;

    private net.docusign.www.API._3_0.EventResult IDQuestionsResult;

    private net.docusign.www.API._3_0.EventResult IDLookupResult;

    private net.docusign.www.API._3_0.EventResult ageVerifyResult;

    private net.docusign.www.API._3_0.EventResult STANPinResult;

    private net.docusign.www.API._3_0.EventResult OFACResult;

    private net.docusign.www.API._3_0.EventResult phoneAuthResult;

    public AuthenticationStatus() {
    }

    public AuthenticationStatus(
           net.docusign.www.API._3_0.EventResult accessCodeResult,
           net.docusign.www.API._3_0.EventResult IDQuestionsResult,
           net.docusign.www.API._3_0.EventResult IDLookupResult,
           net.docusign.www.API._3_0.EventResult ageVerifyResult,
           net.docusign.www.API._3_0.EventResult STANPinResult,
           net.docusign.www.API._3_0.EventResult OFACResult,
           net.docusign.www.API._3_0.EventResult phoneAuthResult) {
           this.accessCodeResult = accessCodeResult;
           this.IDQuestionsResult = IDQuestionsResult;
           this.IDLookupResult = IDLookupResult;
           this.ageVerifyResult = ageVerifyResult;
           this.STANPinResult = STANPinResult;
           this.OFACResult = OFACResult;
           this.phoneAuthResult = phoneAuthResult;
    }


    /**
     * Gets the accessCodeResult value for this AuthenticationStatus.
     * 
     * @return accessCodeResult
     */
    public net.docusign.www.API._3_0.EventResult getAccessCodeResult() {
        return accessCodeResult;
    }


    /**
     * Sets the accessCodeResult value for this AuthenticationStatus.
     * 
     * @param accessCodeResult
     */
    public void setAccessCodeResult(net.docusign.www.API._3_0.EventResult accessCodeResult) {
        this.accessCodeResult = accessCodeResult;
    }


    /**
     * Gets the IDQuestionsResult value for this AuthenticationStatus.
     * 
     * @return IDQuestionsResult
     */
    public net.docusign.www.API._3_0.EventResult getIDQuestionsResult() {
        return IDQuestionsResult;
    }


    /**
     * Sets the IDQuestionsResult value for this AuthenticationStatus.
     * 
     * @param IDQuestionsResult
     */
    public void setIDQuestionsResult(net.docusign.www.API._3_0.EventResult IDQuestionsResult) {
        this.IDQuestionsResult = IDQuestionsResult;
    }


    /**
     * Gets the IDLookupResult value for this AuthenticationStatus.
     * 
     * @return IDLookupResult
     */
    public net.docusign.www.API._3_0.EventResult getIDLookupResult() {
        return IDLookupResult;
    }


    /**
     * Sets the IDLookupResult value for this AuthenticationStatus.
     * 
     * @param IDLookupResult
     */
    public void setIDLookupResult(net.docusign.www.API._3_0.EventResult IDLookupResult) {
        this.IDLookupResult = IDLookupResult;
    }


    /**
     * Gets the ageVerifyResult value for this AuthenticationStatus.
     * 
     * @return ageVerifyResult
     */
    public net.docusign.www.API._3_0.EventResult getAgeVerifyResult() {
        return ageVerifyResult;
    }


    /**
     * Sets the ageVerifyResult value for this AuthenticationStatus.
     * 
     * @param ageVerifyResult
     */
    public void setAgeVerifyResult(net.docusign.www.API._3_0.EventResult ageVerifyResult) {
        this.ageVerifyResult = ageVerifyResult;
    }


    /**
     * Gets the STANPinResult value for this AuthenticationStatus.
     * 
     * @return STANPinResult
     */
    public net.docusign.www.API._3_0.EventResult getSTANPinResult() {
        return STANPinResult;
    }


    /**
     * Sets the STANPinResult value for this AuthenticationStatus.
     * 
     * @param STANPinResult
     */
    public void setSTANPinResult(net.docusign.www.API._3_0.EventResult STANPinResult) {
        this.STANPinResult = STANPinResult;
    }


    /**
     * Gets the OFACResult value for this AuthenticationStatus.
     * 
     * @return OFACResult
     */
    public net.docusign.www.API._3_0.EventResult getOFACResult() {
        return OFACResult;
    }


    /**
     * Sets the OFACResult value for this AuthenticationStatus.
     * 
     * @param OFACResult
     */
    public void setOFACResult(net.docusign.www.API._3_0.EventResult OFACResult) {
        this.OFACResult = OFACResult;
    }


    /**
     * Gets the phoneAuthResult value for this AuthenticationStatus.
     * 
     * @return phoneAuthResult
     */
    public net.docusign.www.API._3_0.EventResult getPhoneAuthResult() {
        return phoneAuthResult;
    }


    /**
     * Sets the phoneAuthResult value for this AuthenticationStatus.
     * 
     * @param phoneAuthResult
     */
    public void setPhoneAuthResult(net.docusign.www.API._3_0.EventResult phoneAuthResult) {
        this.phoneAuthResult = phoneAuthResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticationStatus)) return false;
        AuthenticationStatus other = (AuthenticationStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessCodeResult==null && other.getAccessCodeResult()==null) || 
             (this.accessCodeResult!=null &&
              this.accessCodeResult.equals(other.getAccessCodeResult()))) &&
            ((this.IDQuestionsResult==null && other.getIDQuestionsResult()==null) || 
             (this.IDQuestionsResult!=null &&
              this.IDQuestionsResult.equals(other.getIDQuestionsResult()))) &&
            ((this.IDLookupResult==null && other.getIDLookupResult()==null) || 
             (this.IDLookupResult!=null &&
              this.IDLookupResult.equals(other.getIDLookupResult()))) &&
            ((this.ageVerifyResult==null && other.getAgeVerifyResult()==null) || 
             (this.ageVerifyResult!=null &&
              this.ageVerifyResult.equals(other.getAgeVerifyResult()))) &&
            ((this.STANPinResult==null && other.getSTANPinResult()==null) || 
             (this.STANPinResult!=null &&
              this.STANPinResult.equals(other.getSTANPinResult()))) &&
            ((this.OFACResult==null && other.getOFACResult()==null) || 
             (this.OFACResult!=null &&
              this.OFACResult.equals(other.getOFACResult()))) &&
            ((this.phoneAuthResult==null && other.getPhoneAuthResult()==null) || 
             (this.phoneAuthResult!=null &&
              this.phoneAuthResult.equals(other.getPhoneAuthResult())));
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
        if (getAccessCodeResult() != null) {
            _hashCode += getAccessCodeResult().hashCode();
        }
        if (getIDQuestionsResult() != null) {
            _hashCode += getIDQuestionsResult().hashCode();
        }
        if (getIDLookupResult() != null) {
            _hashCode += getIDLookupResult().hashCode();
        }
        if (getAgeVerifyResult() != null) {
            _hashCode += getAgeVerifyResult().hashCode();
        }
        if (getSTANPinResult() != null) {
            _hashCode += getSTANPinResult().hashCode();
        }
        if (getOFACResult() != null) {
            _hashCode += getOFACResult().hashCode();
        }
        if (getPhoneAuthResult() != null) {
            _hashCode += getPhoneAuthResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticationStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthenticationStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessCodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccessCodeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDQuestionsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDQuestionsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDLookupResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDLookupResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageVerifyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AgeVerifyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STANPinResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "STANPinResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OFACResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OFACResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneAuthResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PhoneAuthResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventResult"));
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
