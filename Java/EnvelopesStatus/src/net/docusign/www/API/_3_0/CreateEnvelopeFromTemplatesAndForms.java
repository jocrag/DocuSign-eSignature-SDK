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
 * CreateEnvelopeFromTemplatesAndForms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class CreateEnvelopeFromTemplatesAndForms  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeInformation envelopeInformation;

    private net.docusign.www.API._3_0.CompositeTemplate[] compositeTemplates;

    private boolean activateEnvelope;

    public CreateEnvelopeFromTemplatesAndForms() {
    }

    public CreateEnvelopeFromTemplatesAndForms(
           net.docusign.www.API._3_0.EnvelopeInformation envelopeInformation,
           net.docusign.www.API._3_0.CompositeTemplate[] compositeTemplates,
           boolean activateEnvelope) {
           this.envelopeInformation = envelopeInformation;
           this.compositeTemplates = compositeTemplates;
           this.activateEnvelope = activateEnvelope;
    }


    /**
     * Gets the envelopeInformation value for this CreateEnvelopeFromTemplatesAndForms.
     * 
     * @return envelopeInformation
     */
    public net.docusign.www.API._3_0.EnvelopeInformation getEnvelopeInformation() {
        return envelopeInformation;
    }


    /**
     * Sets the envelopeInformation value for this CreateEnvelopeFromTemplatesAndForms.
     * 
     * @param envelopeInformation
     */
    public void setEnvelopeInformation(net.docusign.www.API._3_0.EnvelopeInformation envelopeInformation) {
        this.envelopeInformation = envelopeInformation;
    }


    /**
     * Gets the compositeTemplates value for this CreateEnvelopeFromTemplatesAndForms.
     * 
     * @return compositeTemplates
     */
    public net.docusign.www.API._3_0.CompositeTemplate[] getCompositeTemplates() {
        return compositeTemplates;
    }


    /**
     * Sets the compositeTemplates value for this CreateEnvelopeFromTemplatesAndForms.
     * 
     * @param compositeTemplates
     */
    public void setCompositeTemplates(net.docusign.www.API._3_0.CompositeTemplate[] compositeTemplates) {
        this.compositeTemplates = compositeTemplates;
    }


    /**
     * Gets the activateEnvelope value for this CreateEnvelopeFromTemplatesAndForms.
     * 
     * @return activateEnvelope
     */
    public boolean isActivateEnvelope() {
        return activateEnvelope;
    }


    /**
     * Sets the activateEnvelope value for this CreateEnvelopeFromTemplatesAndForms.
     * 
     * @param activateEnvelope
     */
    public void setActivateEnvelope(boolean activateEnvelope) {
        this.activateEnvelope = activateEnvelope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateEnvelopeFromTemplatesAndForms)) return false;
        CreateEnvelopeFromTemplatesAndForms other = (CreateEnvelopeFromTemplatesAndForms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeInformation==null && other.getEnvelopeInformation()==null) || 
             (this.envelopeInformation!=null &&
              this.envelopeInformation.equals(other.getEnvelopeInformation()))) &&
            ((this.compositeTemplates==null && other.getCompositeTemplates()==null) || 
             (this.compositeTemplates!=null &&
              java.util.Arrays.equals(this.compositeTemplates, other.getCompositeTemplates()))) &&
            this.activateEnvelope == other.isActivateEnvelope();
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
        if (getEnvelopeInformation() != null) {
            _hashCode += getEnvelopeInformation().hashCode();
        }
        if (getCompositeTemplates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompositeTemplates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompositeTemplates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isActivateEnvelope() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateEnvelopeFromTemplatesAndForms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">CreateEnvelopeFromTemplatesAndForms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compositeTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CompositeTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CompositeTemplate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CompositeTemplate"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activateEnvelope");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ActivateEnvelope"));
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
