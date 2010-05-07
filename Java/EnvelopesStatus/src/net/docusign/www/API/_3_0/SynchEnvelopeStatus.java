/**
 * SynchEnvelopeStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class SynchEnvelopeStatus  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeStatusCode envelopeStatus;

    private java.lang.String envelopeID;

    public SynchEnvelopeStatus() {
    }

    public SynchEnvelopeStatus(
           net.docusign.www.API._3_0.EnvelopeStatusCode envelopeStatus,
           java.lang.String envelopeID) {
           this.envelopeStatus = envelopeStatus;
           this.envelopeID = envelopeID;
    }


    /**
     * Gets the envelopeStatus value for this SynchEnvelopeStatus.
     * 
     * @return envelopeStatus
     */
    public net.docusign.www.API._3_0.EnvelopeStatusCode getEnvelopeStatus() {
        return envelopeStatus;
    }


    /**
     * Sets the envelopeStatus value for this SynchEnvelopeStatus.
     * 
     * @param envelopeStatus
     */
    public void setEnvelopeStatus(net.docusign.www.API._3_0.EnvelopeStatusCode envelopeStatus) {
        this.envelopeStatus = envelopeStatus;
    }


    /**
     * Gets the envelopeID value for this SynchEnvelopeStatus.
     * 
     * @return envelopeID
     */
    public java.lang.String getEnvelopeID() {
        return envelopeID;
    }


    /**
     * Sets the envelopeID value for this SynchEnvelopeStatus.
     * 
     * @param envelopeID
     */
    public void setEnvelopeID(java.lang.String envelopeID) {
        this.envelopeID = envelopeID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SynchEnvelopeStatus)) return false;
        SynchEnvelopeStatus other = (SynchEnvelopeStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeStatus==null && other.getEnvelopeStatus()==null) || 
             (this.envelopeStatus!=null &&
              this.envelopeStatus.equals(other.getEnvelopeStatus()))) &&
            ((this.envelopeID==null && other.getEnvelopeID()==null) || 
             (this.envelopeID!=null &&
              this.envelopeID.equals(other.getEnvelopeID())));
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
        if (getEnvelopeStatus() != null) {
            _hashCode += getEnvelopeStatus().hashCode();
        }
        if (getEnvelopeID() != null) {
            _hashCode += getEnvelopeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SynchEnvelopeStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SynchEnvelopeStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
