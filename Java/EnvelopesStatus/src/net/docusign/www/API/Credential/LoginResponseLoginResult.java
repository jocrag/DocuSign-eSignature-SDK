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
 * LoginResponseLoginResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API.Credential;

public class LoginResponseLoginResult  implements java.io.Serializable {
    private boolean success;

    private net.docusign.www.API.Credential.ErrorCode errorCode;

    private java.lang.String authenticationMessage;

    private net.docusign.www.API.Credential.ArrayOfAccountAccount[] accounts;

    public LoginResponseLoginResult() {
    }

    public LoginResponseLoginResult(
           boolean success,
           net.docusign.www.API.Credential.ErrorCode errorCode,
           java.lang.String authenticationMessage,
           net.docusign.www.API.Credential.ArrayOfAccountAccount[] accounts) {
           this.success = success;
           this.errorCode = errorCode;
           this.authenticationMessage = authenticationMessage;
           this.accounts = accounts;
    }


    /**
     * Gets the success value for this LoginResponseLoginResult.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this LoginResponseLoginResult.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the errorCode value for this LoginResponseLoginResult.
     * 
     * @return errorCode
     */
    public net.docusign.www.API.Credential.ErrorCode getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this LoginResponseLoginResult.
     * 
     * @param errorCode
     */
    public void setErrorCode(net.docusign.www.API.Credential.ErrorCode errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the authenticationMessage value for this LoginResponseLoginResult.
     * 
     * @return authenticationMessage
     */
    public java.lang.String getAuthenticationMessage() {
        return authenticationMessage;
    }


    /**
     * Sets the authenticationMessage value for this LoginResponseLoginResult.
     * 
     * @param authenticationMessage
     */
    public void setAuthenticationMessage(java.lang.String authenticationMessage) {
        this.authenticationMessage = authenticationMessage;
    }


    /**
     * Gets the accounts value for this LoginResponseLoginResult.
     * 
     * @return accounts
     */
    public net.docusign.www.API.Credential.ArrayOfAccountAccount[] getAccounts() {
        return accounts;
    }


    /**
     * Sets the accounts value for this LoginResponseLoginResult.
     * 
     * @param accounts
     */
    public void setAccounts(net.docusign.www.API.Credential.ArrayOfAccountAccount[] accounts) {
        this.accounts = accounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginResponseLoginResult)) return false;
        LoginResponseLoginResult other = (LoginResponseLoginResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.success == other.isSuccess() &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.authenticationMessage==null && other.getAuthenticationMessage()==null) || 
             (this.authenticationMessage!=null &&
              this.authenticationMessage.equals(other.getAuthenticationMessage()))) &&
            ((this.accounts==null && other.getAccounts()==null) || 
             (this.accounts!=null &&
              java.util.Arrays.equals(this.accounts, other.getAccounts())));
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
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getAuthenticationMessage() != null) {
            _hashCode += getAuthenticationMessage().hashCode();
        }
        if (getAccounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccounts(), i);
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
        new org.apache.axis.description.TypeDesc(LoginResponseLoginResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/Credential", ">>LoginResponse>LoginResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/Credential", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/Credential", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/Credential", "ErrorCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/Credential", "AuthenticationMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/Credential", "Accounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/Credential", ">ArrayOfAccount>Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/Credential", "Account"));
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
