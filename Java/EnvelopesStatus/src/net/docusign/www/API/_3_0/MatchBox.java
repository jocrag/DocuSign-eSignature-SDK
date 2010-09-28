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
 * MatchBox.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class MatchBox  implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger pageNumber;

    private int XPosition;

    private int YPosition;

    private int width;

    private int height;

    public MatchBox() {
    }

    public MatchBox(
           org.apache.axis.types.PositiveInteger pageNumber,
           int XPosition,
           int YPosition,
           int width,
           int height) {
           this.pageNumber = pageNumber;
           this.XPosition = XPosition;
           this.YPosition = YPosition;
           this.width = width;
           this.height = height;
    }


    /**
     * Gets the pageNumber value for this MatchBox.
     * 
     * @return pageNumber
     */
    public org.apache.axis.types.PositiveInteger getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this MatchBox.
     * 
     * @param pageNumber
     */
    public void setPageNumber(org.apache.axis.types.PositiveInteger pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the XPosition value for this MatchBox.
     * 
     * @return XPosition
     */
    public int getXPosition() {
        return XPosition;
    }


    /**
     * Sets the XPosition value for this MatchBox.
     * 
     * @param XPosition
     */
    public void setXPosition(int XPosition) {
        this.XPosition = XPosition;
    }


    /**
     * Gets the YPosition value for this MatchBox.
     * 
     * @return YPosition
     */
    public int getYPosition() {
        return YPosition;
    }


    /**
     * Sets the YPosition value for this MatchBox.
     * 
     * @param YPosition
     */
    public void setYPosition(int YPosition) {
        this.YPosition = YPosition;
    }


    /**
     * Gets the width value for this MatchBox.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this MatchBox.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }


    /**
     * Gets the height value for this MatchBox.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this MatchBox.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatchBox)) return false;
        MatchBox other = (MatchBox) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
            this.XPosition == other.getXPosition() &&
            this.YPosition == other.getYPosition() &&
            this.width == other.getWidth() &&
            this.height == other.getHeight();
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
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        _hashCode += getXPosition();
        _hashCode += getYPosition();
        _hashCode += getWidth();
        _hashCode += getHeight();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatchBox.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MatchBox"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "XPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "YPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
