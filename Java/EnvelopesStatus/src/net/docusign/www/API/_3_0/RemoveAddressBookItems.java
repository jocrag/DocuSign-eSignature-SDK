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
 * RemoveAddressBookItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RemoveAddressBookItems  implements java.io.Serializable {
    private net.docusign.www.API._3_0.AddressBookRemoveItem[] addressBookRemoveItems;

    private boolean returnAddressBook;

    public RemoveAddressBookItems() {
    }

    public RemoveAddressBookItems(
           net.docusign.www.API._3_0.AddressBookRemoveItem[] addressBookRemoveItems,
           boolean returnAddressBook) {
           this.addressBookRemoveItems = addressBookRemoveItems;
           this.returnAddressBook = returnAddressBook;
    }


    /**
     * Gets the addressBookRemoveItems value for this RemoveAddressBookItems.
     * 
     * @return addressBookRemoveItems
     */
    public net.docusign.www.API._3_0.AddressBookRemoveItem[] getAddressBookRemoveItems() {
        return addressBookRemoveItems;
    }


    /**
     * Sets the addressBookRemoveItems value for this RemoveAddressBookItems.
     * 
     * @param addressBookRemoveItems
     */
    public void setAddressBookRemoveItems(net.docusign.www.API._3_0.AddressBookRemoveItem[] addressBookRemoveItems) {
        this.addressBookRemoveItems = addressBookRemoveItems;
    }


    /**
     * Gets the returnAddressBook value for this RemoveAddressBookItems.
     * 
     * @return returnAddressBook
     */
    public boolean isReturnAddressBook() {
        return returnAddressBook;
    }


    /**
     * Sets the returnAddressBook value for this RemoveAddressBookItems.
     * 
     * @param returnAddressBook
     */
    public void setReturnAddressBook(boolean returnAddressBook) {
        this.returnAddressBook = returnAddressBook;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveAddressBookItems)) return false;
        RemoveAddressBookItems other = (RemoveAddressBookItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressBookRemoveItems==null && other.getAddressBookRemoveItems()==null) || 
             (this.addressBookRemoveItems!=null &&
              java.util.Arrays.equals(this.addressBookRemoveItems, other.getAddressBookRemoveItems()))) &&
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
        if (getAddressBookRemoveItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressBookRemoveItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressBookRemoveItems(), i);
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
        new org.apache.axis.description.TypeDesc(RemoveAddressBookItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RemoveAddressBookItems"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressBookRemoveItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookRemoveItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookRemoveItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookRemoveItem"));
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
