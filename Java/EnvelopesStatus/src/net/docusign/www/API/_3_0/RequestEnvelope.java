/**
 * RequestEnvelope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestEnvelope  implements java.io.Serializable {
    private java.lang.String envelopeID;

    private boolean includeDocumentBytes;

    public RequestEnvelope() {
    }

    public RequestEnvelope(
           java.lang.String envelopeID,
           boolean includeDocumentBytes) {
           this.envelopeID = envelopeID;
           this.includeDocumentBytes = includeDocumentBytes;
    }


    /**
     * Gets the envelopeID value for this RequestEnvelope.
     * 
     * @return envelopeID
     */
    public java.lang.String getEnvelopeID() {
        return envelopeID;
    }


    /**
     * Sets the envelopeID value for this RequestEnvelope.
     * 
     * @param envelopeID
     */
    public void setEnvelopeID(java.lang.String envelopeID) {
        this.envelopeID = envelopeID;
    }


    /**
     * Gets the includeDocumentBytes value for this RequestEnvelope.
     * 
     * @return includeDocumentBytes
     */
    public boolean isIncludeDocumentBytes() {
        return includeDocumentBytes;
    }


    /**
     * Sets the includeDocumentBytes value for this RequestEnvelope.
     * 
     * @param includeDocumentBytes
     */
    public void setIncludeDocumentBytes(boolean includeDocumentBytes) {
        this.includeDocumentBytes = includeDocumentBytes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEnvelope)) return false;
        RequestEnvelope other = (RequestEnvelope) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeID==null && other.getEnvelopeID()==null) || 
             (this.envelopeID!=null &&
              this.envelopeID.equals(other.getEnvelopeID()))) &&
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
        if (getEnvelopeID() != null) {
            _hashCode += getEnvelopeID().hashCode();
        }
        _hashCode += (isIncludeDocumentBytes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEnvelope.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestEnvelope"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"));
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
