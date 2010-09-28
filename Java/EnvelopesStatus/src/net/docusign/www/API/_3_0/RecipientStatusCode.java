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
 * RecipientStatusCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientStatusCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RecipientStatusCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Created = "Created";
    public static final java.lang.String _Sent = "Sent";
    public static final java.lang.String _Delivered = "Delivered";
    public static final java.lang.String _Signed = "Signed";
    public static final java.lang.String _Declined = "Declined";
    public static final java.lang.String _Completed = "Completed";
    public static final java.lang.String _FaxPending = "FaxPending";
    public static final RecipientStatusCode Created = new RecipientStatusCode(_Created);
    public static final RecipientStatusCode Sent = new RecipientStatusCode(_Sent);
    public static final RecipientStatusCode Delivered = new RecipientStatusCode(_Delivered);
    public static final RecipientStatusCode Signed = new RecipientStatusCode(_Signed);
    public static final RecipientStatusCode Declined = new RecipientStatusCode(_Declined);
    public static final RecipientStatusCode Completed = new RecipientStatusCode(_Completed);
    public static final RecipientStatusCode FaxPending = new RecipientStatusCode(_FaxPending);
    public java.lang.String getValue() { return _value_;}
    public static RecipientStatusCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RecipientStatusCode enumeration = (RecipientStatusCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RecipientStatusCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecipientStatusCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatusCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
