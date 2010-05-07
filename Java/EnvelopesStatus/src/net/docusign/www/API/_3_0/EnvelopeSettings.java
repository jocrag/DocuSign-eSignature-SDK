/**
 * EnvelopeSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeSettings  implements java.io.Serializable {
    private java.lang.Boolean autoNavigation;

    private java.lang.Boolean envelopeIdStamping;

    public EnvelopeSettings() {
    }

    public EnvelopeSettings(
           java.lang.Boolean autoNavigation,
           java.lang.Boolean envelopeIdStamping) {
           this.autoNavigation = autoNavigation;
           this.envelopeIdStamping = envelopeIdStamping;
    }


    /**
     * Gets the autoNavigation value for this EnvelopeSettings.
     * 
     * @return autoNavigation
     */
    public java.lang.Boolean getAutoNavigation() {
        return autoNavigation;
    }


    /**
     * Sets the autoNavigation value for this EnvelopeSettings.
     * 
     * @param autoNavigation
     */
    public void setAutoNavigation(java.lang.Boolean autoNavigation) {
        this.autoNavigation = autoNavigation;
    }


    /**
     * Gets the envelopeIdStamping value for this EnvelopeSettings.
     * 
     * @return envelopeIdStamping
     */
    public java.lang.Boolean getEnvelopeIdStamping() {
        return envelopeIdStamping;
    }


    /**
     * Sets the envelopeIdStamping value for this EnvelopeSettings.
     * 
     * @param envelopeIdStamping
     */
    public void setEnvelopeIdStamping(java.lang.Boolean envelopeIdStamping) {
        this.envelopeIdStamping = envelopeIdStamping;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeSettings)) return false;
        EnvelopeSettings other = (EnvelopeSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoNavigation==null && other.getAutoNavigation()==null) || 
             (this.autoNavigation!=null &&
              this.autoNavigation.equals(other.getAutoNavigation()))) &&
            ((this.envelopeIdStamping==null && other.getEnvelopeIdStamping()==null) || 
             (this.envelopeIdStamping!=null &&
              this.envelopeIdStamping.equals(other.getEnvelopeIdStamping())));
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
        if (getAutoNavigation() != null) {
            _hashCode += getAutoNavigation().hashCode();
        }
        if (getEnvelopeIdStamping() != null) {
            _hashCode += getEnvelopeIdStamping().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoNavigation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AutoNavigation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeIdStamping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeIdStamping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
