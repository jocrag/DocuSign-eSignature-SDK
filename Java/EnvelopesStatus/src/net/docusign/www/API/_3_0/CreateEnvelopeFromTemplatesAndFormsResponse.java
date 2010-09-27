/**
 * CreateEnvelopeFromTemplatesAndFormsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class CreateEnvelopeFromTemplatesAndFormsResponse  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeStatus createEnvelopeFromTemplatesAndFormsResult;

    public CreateEnvelopeFromTemplatesAndFormsResponse() {
    }

    public CreateEnvelopeFromTemplatesAndFormsResponse(
           net.docusign.www.API._3_0.EnvelopeStatus createEnvelopeFromTemplatesAndFormsResult) {
           this.createEnvelopeFromTemplatesAndFormsResult = createEnvelopeFromTemplatesAndFormsResult;
    }


    /**
     * Gets the createEnvelopeFromTemplatesAndFormsResult value for this CreateEnvelopeFromTemplatesAndFormsResponse.
     * 
     * @return createEnvelopeFromTemplatesAndFormsResult
     */
    public net.docusign.www.API._3_0.EnvelopeStatus getCreateEnvelopeFromTemplatesAndFormsResult() {
        return createEnvelopeFromTemplatesAndFormsResult;
    }


    /**
     * Sets the createEnvelopeFromTemplatesAndFormsResult value for this CreateEnvelopeFromTemplatesAndFormsResponse.
     * 
     * @param createEnvelopeFromTemplatesAndFormsResult
     */
    public void setCreateEnvelopeFromTemplatesAndFormsResult(net.docusign.www.API._3_0.EnvelopeStatus createEnvelopeFromTemplatesAndFormsResult) {
        this.createEnvelopeFromTemplatesAndFormsResult = createEnvelopeFromTemplatesAndFormsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateEnvelopeFromTemplatesAndFormsResponse)) return false;
        CreateEnvelopeFromTemplatesAndFormsResponse other = (CreateEnvelopeFromTemplatesAndFormsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createEnvelopeFromTemplatesAndFormsResult==null && other.getCreateEnvelopeFromTemplatesAndFormsResult()==null) || 
             (this.createEnvelopeFromTemplatesAndFormsResult!=null &&
              this.createEnvelopeFromTemplatesAndFormsResult.equals(other.getCreateEnvelopeFromTemplatesAndFormsResult())));
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
        if (getCreateEnvelopeFromTemplatesAndFormsResult() != null) {
            _hashCode += getCreateEnvelopeFromTemplatesAndFormsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateEnvelopeFromTemplatesAndFormsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">CreateEnvelopeFromTemplatesAndFormsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createEnvelopeFromTemplatesAndFormsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CreateEnvelopeFromTemplatesAndFormsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
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
