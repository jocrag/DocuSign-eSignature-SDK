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
 * UpdateAddressBookItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class UpdateAddressBookItems  implements java.io.Serializable {
    private net.docusign.www.API._3_0.AddressBookItem[] addressBookItems;

    private boolean returnAddressBook;

    public UpdateAddressBookItems() {
    }

    public UpdateAddressBookItems(
           net.docusign.www.API._3_0.AddressBookItem[] addressBookItems,
           boolean returnAddressBook) {
           this.addressBookItems = addressBookItems;
           this.returnAddressBook = returnAddressBook;
    }


    /**
     * Gets the addressBookItems value for this UpdateAddressBookItems.
     * 
     * @return addressBookItems
     */
    public net.docusign.www.API._3_0.AddressBookItem[] getAddressBookItems() {
        return addressBookItems;
    }


    /**
     * Sets the addressBookItems value for this UpdateAddressBookItems.
     * 
     * @param addressBookItems
     */
    public void setAddressBookItems(net.docusign.www.API._3_0.AddressBookItem[] addressBookItems) {
        this.addressBookItems = addressBookItems;
    }


    /**
     * Gets the returnAddressBook value for this UpdateAddressBookItems.
     * 
     * @return returnAddressBook
     */
    public boolean isReturnAddressBook() {
        return returnAddressBook;
    }


    /**
     * Sets the returnAddressBook value for this UpdateAddressBookItems.
     * 
     * @param returnAddressBook
     */
    public void setReturnAddressBook(boolean returnAddressBook) {
        this.returnAddressBook = returnAddressBook;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAddressBookItems)) return false;
        UpdateAddressBookItems other = (UpdateAddressBookItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressBookItems==null && other.getAddressBookItems()==null) || 
             (this.addressBookItems!=null &&
              java.util.Arrays.equals(this.addressBookItems, other.getAddressBookItems()))) &&
            this.returnAddressBook == other.isReturnAddressBook();
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
        if (getAddressBookItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressBookItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressBookItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReturnAddressBook() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateAddressBookItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">UpdateAddressBookItems"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressBookItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAddressBook");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReturnAddressBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
