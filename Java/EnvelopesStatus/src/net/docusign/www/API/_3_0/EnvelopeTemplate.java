/**
 * EnvelopeTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeTemplate  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeTemplateDefinition envelopeTemplateDefinition;

    private net.docusign.www.API._3_0.Envelope envelope;

    public EnvelopeTemplate() {
    }

    public EnvelopeTemplate(
           net.docusign.www.API._3_0.EnvelopeTemplateDefinition envelopeTemplateDefinition,
           net.docusign.www.API._3_0.Envelope envelope) {
           this.envelopeTemplateDefinition = envelopeTemplateDefinition;
           this.envelope = envelope;
    }


    /**
     * Gets the envelopeTemplateDefinition value for this EnvelopeTemplate.
     * 
     * @return envelopeTemplateDefinition
     */
    public net.docusign.www.API._3_0.EnvelopeTemplateDefinition getEnvelopeTemplateDefinition() {
        return envelopeTemplateDefinition;
    }


    /**
     * Sets the envelopeTemplateDefinition value for this EnvelopeTemplate.
     * 
     * @param envelopeTemplateDefinition
     */
    public void setEnvelopeTemplateDefinition(net.docusign.www.API._3_0.EnvelopeTemplateDefinition envelopeTemplateDefinition) {
        this.envelopeTemplateDefinition = envelopeTemplateDefinition;
    }


    /**
     * Gets the envelope value for this EnvelopeTemplate.
     * 
     * @return envelope
     */
    public net.docusign.www.API._3_0.Envelope getEnvelope() {
        return envelope;
    }


    /**
     * Sets the envelope value for this EnvelopeTemplate.
     * 
     * @param envelope
     */
    public void setEnvelope(net.docusign.www.API._3_0.Envelope envelope) {
        this.envelope = envelope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeTemplate)) return false;
        EnvelopeTemplate other = (EnvelopeTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeTemplateDefinition==null && other.getEnvelopeTemplateDefinition()==null) || 
             (this.envelopeTemplateDefinition!=null &&
              this.envelopeTemplateDefinition.equals(other.getEnvelopeTemplateDefinition()))) &&
            ((this.envelope==null && other.getEnvelope()==null) || 
             (this.envelope!=null &&
              this.envelope.equals(other.getEnvelope())));
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
        if (getEnvelopeTemplateDefinition() != null) {
            _hashCode += getEnvelopeTemplateDefinition().hashCode();
        }
        if (getEnvelope() != null) {
            _hashCode += getEnvelope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeTemplateDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplateDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplateDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelope");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Envelope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Envelope"));
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
