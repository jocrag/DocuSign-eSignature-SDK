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
 * RequestRecipientTokenAuthenticationAssertion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestRecipientTokenAuthenticationAssertion  implements java.io.Serializable {
    private java.lang.String assertionID;

    private java.util.Calendar authenticationInstant;

    private net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertionAuthenticationMethod authenticationMethod;

    private java.lang.String securityDomain;

    public RequestRecipientTokenAuthenticationAssertion() {
    }

    public RequestRecipientTokenAuthenticationAssertion(
           java.lang.String assertionID,
           java.util.Calendar authenticationInstant,
           net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertionAuthenticationMethod authenticationMethod,
           java.lang.String securityDomain) {
           this.assertionID = assertionID;
           this.authenticationInstant = authenticationInstant;
           this.authenticationMethod = authenticationMethod;
           this.securityDomain = securityDomain;
    }


    /**
     * Gets the assertionID value for this RequestRecipientTokenAuthenticationAssertion.
     * 
     * @return assertionID
     */
    public java.lang.String getAssertionID() {
        return assertionID;
    }


    /**
     * Sets the assertionID value for this RequestRecipientTokenAuthenticationAssertion.
     * 
     * @param assertionID
     */
    public void setAssertionID(java.lang.String assertionID) {
        this.assertionID = assertionID;
    }


    /**
     * Gets the authenticationInstant value for this RequestRecipientTokenAuthenticationAssertion.
     * 
     * @return authenticationInstant
     */
    public java.util.Calendar getAuthenticationInstant() {
        return authenticationInstant;
    }


    /**
     * Sets the authenticationInstant value for this RequestRecipientTokenAuthenticationAssertion.
     * 
     * @param authenticationInstant
     */
    public void setAuthenticationInstant(java.util.Calendar authenticationInstant) {
        this.authenticationInstant = authenticationInstant;
    }


    /**
     * Gets the authenticationMethod value for this RequestRecipientTokenAuthenticationAssertion.
     * 
     * @return authenticationMethod
     */
    public net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertionAuthenticationMethod getAuthenticationMethod() {
        return authenticationMethod;
    }


    /**
     * Sets the authenticationMethod value for this RequestRecipientTokenAuthenticationAssertion.
     * 
     * @param authenticationMethod
     */
    public void setAuthenticationMethod(net.docusign.www.API._3_0.RequestRecipientTokenAuthenticationAssertionAuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }


    /**
     * Gets the securityDomain value for this RequestRecipientTokenAuthenticationAssertion.
     * 
     * @return securityDomain
     */
    public java.lang.String getSecurityDomain() {
        return securityDomain;
    }


    /**
     * Sets the securityDomain value for this RequestRecipientTokenAuthenticationAssertion.
     * 
     * @param securityDomain
     */
    public void setSecurityDomain(java.lang.String securityDomain) {
        this.securityDomain = securityDomain;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestRecipientTokenAuthenticationAssertion)) return false;
        RequestRecipientTokenAuthenticationAssertion other = (RequestRecipientTokenAuthenticationAssertion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assertionID==null && other.getAssertionID()==null) || 
             (this.assertionID!=null &&
              this.assertionID.equals(other.getAssertionID()))) &&
            ((this.authenticationInstant==null && other.getAuthenticationInstant()==null) || 
             (this.authenticationInstant!=null &&
              this.authenticationInstant.equals(other.getAuthenticationInstant()))) &&
            ((this.authenticationMethod==null && other.getAuthenticationMethod()==null) || 
             (this.authenticationMethod!=null &&
              this.authenticationMethod.equals(other.getAuthenticationMethod()))) &&
            ((this.securityDomain==null && other.getSecurityDomain()==null) || 
             (this.securityDomain!=null &&
              this.securityDomain.equals(other.getSecurityDomain())));
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
        if (getAssertionID() != null) {
            _hashCode += getAssertionID().hashCode();
        }
        if (getAuthenticationInstant() != null) {
            _hashCode += getAuthenticationInstant().hashCode();
        }
        if (getAuthenticationMethod() != null) {
            _hashCode += getAuthenticationMethod().hashCode();
        }
        if (getSecurityDomain() != null) {
            _hashCode += getSecurityDomain().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestRecipientTokenAuthenticationAssertion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenAuthenticationAssertion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assertionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AssertionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationInstant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthenticationInstant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthenticationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenAuthenticationAssertionAuthenticationMethod"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SecurityDomain"));
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
