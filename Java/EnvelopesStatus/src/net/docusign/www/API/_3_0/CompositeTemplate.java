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
 * CompositeTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class CompositeTemplate  implements java.io.Serializable {
    private net.docusign.www.API._3_0.ServerTemplate[] serverTemplates;

    private net.docusign.www.API._3_0.InlineTemplate[] inlineTemplates;

    private net.docusign.www.API._3_0.PDFMetaDataTemplate PDFMetaDataTemplate;

    private net.docusign.www.API._3_0.Document document;

    public CompositeTemplate() {
    }

    public CompositeTemplate(
           net.docusign.www.API._3_0.ServerTemplate[] serverTemplates,
           net.docusign.www.API._3_0.InlineTemplate[] inlineTemplates,
           net.docusign.www.API._3_0.PDFMetaDataTemplate PDFMetaDataTemplate,
           net.docusign.www.API._3_0.Document document) {
           this.serverTemplates = serverTemplates;
           this.inlineTemplates = inlineTemplates;
           this.PDFMetaDataTemplate = PDFMetaDataTemplate;
           this.document = document;
    }


    /**
     * Gets the serverTemplates value for this CompositeTemplate.
     * 
     * @return serverTemplates
     */
    public net.docusign.www.API._3_0.ServerTemplate[] getServerTemplates() {
        return serverTemplates;
    }


    /**
     * Sets the serverTemplates value for this CompositeTemplate.
     * 
     * @param serverTemplates
     */
    public void setServerTemplates(net.docusign.www.API._3_0.ServerTemplate[] serverTemplates) {
        this.serverTemplates = serverTemplates;
    }


    /**
     * Gets the inlineTemplates value for this CompositeTemplate.
     * 
     * @return inlineTemplates
     */
    public net.docusign.www.API._3_0.InlineTemplate[] getInlineTemplates() {
        return inlineTemplates;
    }


    /**
     * Sets the inlineTemplates value for this CompositeTemplate.
     * 
     * @param inlineTemplates
     */
    public void setInlineTemplates(net.docusign.www.API._3_0.InlineTemplate[] inlineTemplates) {
        this.inlineTemplates = inlineTemplates;
    }


    /**
     * Gets the PDFMetaDataTemplate value for this CompositeTemplate.
     * 
     * @return PDFMetaDataTemplate
     */
    public net.docusign.www.API._3_0.PDFMetaDataTemplate getPDFMetaDataTemplate() {
        return PDFMetaDataTemplate;
    }


    /**
     * Sets the PDFMetaDataTemplate value for this CompositeTemplate.
     * 
     * @param PDFMetaDataTemplate
     */
    public void setPDFMetaDataTemplate(net.docusign.www.API._3_0.PDFMetaDataTemplate PDFMetaDataTemplate) {
        this.PDFMetaDataTemplate = PDFMetaDataTemplate;
    }


    /**
     * Gets the document value for this CompositeTemplate.
     * 
     * @return document
     */
    public net.docusign.www.API._3_0.Document getDocument() {
        return document;
    }


    /**
     * Sets the document value for this CompositeTemplate.
     * 
     * @param document
     */
    public void setDocument(net.docusign.www.API._3_0.Document document) {
        this.document = document;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompositeTemplate)) return false;
        CompositeTemplate other = (CompositeTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serverTemplates==null && other.getServerTemplates()==null) || 
             (this.serverTemplates!=null &&
              java.util.Arrays.equals(this.serverTemplates, other.getServerTemplates()))) &&
            ((this.inlineTemplates==null && other.getInlineTemplates()==null) || 
             (this.inlineTemplates!=null &&
              java.util.Arrays.equals(this.inlineTemplates, other.getInlineTemplates()))) &&
            ((this.PDFMetaDataTemplate==null && other.getPDFMetaDataTemplate()==null) || 
             (this.PDFMetaDataTemplate!=null &&
              this.PDFMetaDataTemplate.equals(other.getPDFMetaDataTemplate()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              this.document.equals(other.getDocument())));
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
        if (getServerTemplates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServerTemplates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServerTemplates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInlineTemplates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInlineTemplates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInlineTemplates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPDFMetaDataTemplate() != null) {
            _hashCode += getPDFMetaDataTemplate().hashCode();
        }
        if (getDocument() != null) {
            _hashCode += getDocument().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompositeTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CompositeTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ServerTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ServerTemplate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ServerTemplate"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inlineTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "InlineTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "InlineTemplate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "InlineTemplate"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDFMetaDataTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFMetaDataTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFMetaDataTemplate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Document"));
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
