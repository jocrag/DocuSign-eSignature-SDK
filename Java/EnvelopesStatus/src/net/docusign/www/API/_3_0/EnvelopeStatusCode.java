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
 * EnvelopeStatusCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeStatusCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnvelopeStatusCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Any = "Any";
    public static final java.lang.String _Voided = "Voided";
    public static final java.lang.String _Created = "Created";
    public static final java.lang.String _Deleted = "Deleted";
    public static final java.lang.String _Sent = "Sent";
    public static final java.lang.String _Delivered = "Delivered";
    public static final java.lang.String _Signed = "Signed";
    public static final java.lang.String _Completed = "Completed";
    public static final java.lang.String _Declined = "Declined";
    public static final java.lang.String _TimedOut = "TimedOut";
    public static final java.lang.String _Template = "Template";
    public static final java.lang.String _Processing = "Processing";
    public static final EnvelopeStatusCode Any = new EnvelopeStatusCode(_Any);
    public static final EnvelopeStatusCode Voided = new EnvelopeStatusCode(_Voided);
    public static final EnvelopeStatusCode Created = new EnvelopeStatusCode(_Created);
    public static final EnvelopeStatusCode Deleted = new EnvelopeStatusCode(_Deleted);
    public static final EnvelopeStatusCode Sent = new EnvelopeStatusCode(_Sent);
    public static final EnvelopeStatusCode Delivered = new EnvelopeStatusCode(_Delivered);
    public static final EnvelopeStatusCode Signed = new EnvelopeStatusCode(_Signed);
    public static final EnvelopeStatusCode Completed = new EnvelopeStatusCode(_Completed);
    public static final EnvelopeStatusCode Declined = new EnvelopeStatusCode(_Declined);
    public static final EnvelopeStatusCode TimedOut = new EnvelopeStatusCode(_TimedOut);
    public static final EnvelopeStatusCode Template = new EnvelopeStatusCode(_Template);
    public static final EnvelopeStatusCode Processing = new EnvelopeStatusCode(_Processing);
    public java.lang.String getValue() { return _value_;}
    public static EnvelopeStatusCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnvelopeStatusCode enumeration = (EnvelopeStatusCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnvelopeStatusCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnvelopeStatusCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
