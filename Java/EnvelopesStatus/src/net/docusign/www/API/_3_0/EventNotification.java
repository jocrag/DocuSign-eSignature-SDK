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
 * EventNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EventNotification  implements java.io.Serializable {
    private java.lang.String URL;

    private java.lang.Boolean loggingEnabled;

    private net.docusign.www.API._3_0.EnvelopeEvent[] envelopeEvents;

    public EventNotification() {
    }

    public EventNotification(
           java.lang.String URL,
           java.lang.Boolean loggingEnabled,
           net.docusign.www.API._3_0.EnvelopeEvent[] envelopeEvents) {
           this.URL = URL;
           this.loggingEnabled = loggingEnabled;
           this.envelopeEvents = envelopeEvents;
    }


    /**
     * Gets the URL value for this EventNotification.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this EventNotification.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the loggingEnabled value for this EventNotification.
     * 
     * @return loggingEnabled
     */
    public java.lang.Boolean getLoggingEnabled() {
        return loggingEnabled;
    }


    /**
     * Sets the loggingEnabled value for this EventNotification.
     * 
     * @param loggingEnabled
     */
    public void setLoggingEnabled(java.lang.Boolean loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
    }


    /**
     * Gets the envelopeEvents value for this EventNotification.
     * 
     * @return envelopeEvents
     */
    public net.docusign.www.API._3_0.EnvelopeEvent[] getEnvelopeEvents() {
        return envelopeEvents;
    }


    /**
     * Sets the envelopeEvents value for this EventNotification.
     * 
     * @param envelopeEvents
     */
    public void setEnvelopeEvents(net.docusign.www.API._3_0.EnvelopeEvent[] envelopeEvents) {
        this.envelopeEvents = envelopeEvents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventNotification)) return false;
        EventNotification other = (EventNotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.loggingEnabled==null && other.getLoggingEnabled()==null) || 
             (this.loggingEnabled!=null &&
              this.loggingEnabled.equals(other.getLoggingEnabled()))) &&
            ((this.envelopeEvents==null && other.getEnvelopeEvents()==null) || 
             (this.envelopeEvents!=null &&
              java.util.Arrays.equals(this.envelopeEvents, other.getEnvelopeEvents())));
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
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getLoggingEnabled() != null) {
            _hashCode += getLoggingEnabled().hashCode();
        }
        if (getEnvelopeEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvelopeEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvelopeEvents(), i);
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
        new org.apache.axis.description.TypeDesc(EventNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loggingEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "LoggingEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEvent"));
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
