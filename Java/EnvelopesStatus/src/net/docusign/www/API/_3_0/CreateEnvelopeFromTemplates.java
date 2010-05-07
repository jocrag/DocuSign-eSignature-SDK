/**
 * CreateEnvelopeFromTemplates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class CreateEnvelopeFromTemplates  implements java.io.Serializable {
    private net.docusign.www.API._3_0.TemplateReference[] templateReferences;

    private net.docusign.www.API._3_0.Recipient[] recipients;

    private net.docusign.www.API._3_0.EnvelopeInformation envelopeInformation;

    private boolean activateEnvelope;

    public CreateEnvelopeFromTemplates() {
    }

    public CreateEnvelopeFromTemplates(
           net.docusign.www.API._3_0.TemplateReference[] templateReferences,
           net.docusign.www.API._3_0.Recipient[] recipients,
           net.docusign.www.API._3_0.EnvelopeInformation envelopeInformation,
           boolean activateEnvelope) {
           this.templateReferences = templateReferences;
           this.recipients = recipients;
           this.envelopeInformation = envelopeInformation;
           this.activateEnvelope = activateEnvelope;
    }


    /**
     * Gets the templateReferences value for this CreateEnvelopeFromTemplates.
     * 
     * @return templateReferences
     */
    public net.docusign.www.API._3_0.TemplateReference[] getTemplateReferences() {
        return templateReferences;
    }


    /**
     * Sets the templateReferences value for this CreateEnvelopeFromTemplates.
     * 
     * @param templateReferences
     */
    public void setTemplateReferences(net.docusign.www.API._3_0.TemplateReference[] templateReferences) {
        this.templateReferences = templateReferences;
    }


    /**
     * Gets the recipients value for this CreateEnvelopeFromTemplates.
     * 
     * @return recipients
     */
    public net.docusign.www.API._3_0.Recipient[] getRecipients() {
        return recipients;
    }


    /**
     * Sets the recipients value for this CreateEnvelopeFromTemplates.
     * 
     * @param recipients
     */
    public void setRecipients(net.docusign.www.API._3_0.Recipient[] recipients) {
        this.recipients = recipients;
    }


    /**
     * Gets the envelopeInformation value for this CreateEnvelopeFromTemplates.
     * 
     * @return envelopeInformation
     */
    public net.docusign.www.API._3_0.EnvelopeInformation getEnvelopeInformation() {
        return envelopeInformation;
    }


    /**
     * Sets the envelopeInformation value for this CreateEnvelopeFromTemplates.
     * 
     * @param envelopeInformation
     */
    public void setEnvelopeInformation(net.docusign.www.API._3_0.EnvelopeInformation envelopeInformation) {
        this.envelopeInformation = envelopeInformation;
    }


    /**
     * Gets the activateEnvelope value for this CreateEnvelopeFromTemplates.
     * 
     * @return activateEnvelope
     */
    public boolean isActivateEnvelope() {
        return activateEnvelope;
    }


    /**
     * Sets the activateEnvelope value for this CreateEnvelopeFromTemplates.
     * 
     * @param activateEnvelope
     */
    public void setActivateEnvelope(boolean activateEnvelope) {
        this.activateEnvelope = activateEnvelope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateEnvelopeFromTemplates)) return false;
        CreateEnvelopeFromTemplates other = (CreateEnvelopeFromTemplates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.templateReferences==null && other.getTemplateReferences()==null) || 
             (this.templateReferences!=null &&
              java.util.Arrays.equals(this.templateReferences, other.getTemplateReferences()))) &&
            ((this.recipients==null && other.getRecipients()==null) || 
             (this.recipients!=null &&
              java.util.Arrays.equals(this.recipients, other.getRecipients()))) &&
            ((this.envelopeInformation==null && other.getEnvelopeInformation()==null) || 
             (this.envelopeInformation!=null &&
              this.envelopeInformation.equals(other.getEnvelopeInformation()))) &&
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
        if (getTemplateReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemplateReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemplateReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnvelopeInformation() != null) {
            _hashCode += getEnvelopeInformation().hashCode();
        }
        _hashCode += (isActivateEnvelope() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateEnvelopeFromTemplates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">CreateEnvelopeFromTemplates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReference"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipients");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipient"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipient"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
