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
 * CustomTabType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class CustomTabType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomTabType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Text = "Text";
    public static final java.lang.String _Checkbox = "Checkbox";
    public static final java.lang.String _Radio = "Radio";
    public static final java.lang.String _List = "List";
    public static final java.lang.String _Date = "Date";
    public static final java.lang.String _Number = "Number";
    public static final java.lang.String _SSN = "SSN";
    public static final java.lang.String _ZIP5 = "ZIP5";
    public static final java.lang.String _ZIP5DASH4 = "ZIP5DASH4";
    public static final java.lang.String _Email = "Email";
    public static final CustomTabType Text = new CustomTabType(_Text);
    public static final CustomTabType Checkbox = new CustomTabType(_Checkbox);
    public static final CustomTabType Radio = new CustomTabType(_Radio);
    public static final CustomTabType List = new CustomTabType(_List);
    public static final CustomTabType Date = new CustomTabType(_Date);
    public static final CustomTabType Number = new CustomTabType(_Number);
    public static final CustomTabType SSN = new CustomTabType(_SSN);
    public static final CustomTabType ZIP5 = new CustomTabType(_ZIP5);
    public static final CustomTabType ZIP5DASH4 = new CustomTabType(_ZIP5DASH4);
    public static final CustomTabType Email = new CustomTabType(_Email);
    public java.lang.String getValue() { return _value_;}
    public static CustomTabType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomTabType enumeration = (CustomTabType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomTabType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomTabType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
