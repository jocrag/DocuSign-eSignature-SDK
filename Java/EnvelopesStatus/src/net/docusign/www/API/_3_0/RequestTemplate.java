/**
 * RequestTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestTemplate  implements java.io.Serializable {
    private java.lang.String templateID;

    private boolean includeDocumentBytes;

    public RequestTemplate() {
    }

    public RequestTemplate(
           java.lang.String templateID,
           boolean includeDocumentBytes) {
           this.templateID = templateID;
           this.includeDocumentBytes = includeDocumentBytes;
    }


    /**
     * Gets the templateID value for this RequestTemplate.
     * 
     * @return templateID
     */
    public java.lang.String getTemplateID() {
        return templateID;
    }


    /**
     * Sets the templateID value for this RequestTemplate.
     * 
     * @param templateID
     */
    public void setTemplateID(java.lang.String templateID) {
        this.templateID = templateID;
    }


    /**
     * Gets the includeDocumentBytes value for this RequestTemplate.
     * 
     * @return includeDocumentBytes
     */
    public boolean isIncludeDocumentBytes() {
        return includeDocumentBytes;
    }


    /**
     * Sets the includeDocumentBytes value for this RequestTemplate.
     * 
     * @param includeDocumentBytes
     */
    public void setIncludeDocumentBytes(boolean includeDocumentBytes) {
        this.includeDocumentBytes = includeDocumentBytes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestTemplate)) return false;
        RequestTemplate other = (RequestTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.templateID==null && other.getTemplateID()==null) || 
             (this.templateID!=null &&
              this.templateID.equals(other.getTemplateID()))) &&
            this.includeDocumentBytes == other.isIncludeDocumentBytes();
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
        if (getTemplateID() != null) {
            _hashCode += getTemplateID().hashCode();
        }
        _hashCode += (isIncludeDocumentBytes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDocumentBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocumentBytes"));
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
