/**
 * RequestTemplatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestTemplatesResponse  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeTemplateDefinition[] requestTemplatesResult;

    public RequestTemplatesResponse() {
    }

    public RequestTemplatesResponse(
           net.docusign.www.API._3_0.EnvelopeTemplateDefinition[] requestTemplatesResult) {
           this.requestTemplatesResult = requestTemplatesResult;
    }


    /**
     * Gets the requestTemplatesResult value for this RequestTemplatesResponse.
     * 
     * @return requestTemplatesResult
     */
    public net.docusign.www.API._3_0.EnvelopeTemplateDefinition[] getRequestTemplatesResult() {
        return requestTemplatesResult;
    }


    /**
     * Sets the requestTemplatesResult value for this RequestTemplatesResponse.
     * 
     * @param requestTemplatesResult
     */
    public void setRequestTemplatesResult(net.docusign.www.API._3_0.EnvelopeTemplateDefinition[] requestTemplatesResult) {
        this.requestTemplatesResult = requestTemplatesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestTemplatesResponse)) return false;
        RequestTemplatesResponse other = (RequestTemplatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestTemplatesResult==null && other.getRequestTemplatesResult()==null) || 
             (this.requestTemplatesResult!=null &&
              java.util.Arrays.equals(this.requestTemplatesResult, other.getRequestTemplatesResult())));
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
        if (getRequestTemplatesResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestTemplatesResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestTemplatesResult(), i);
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
        new org.apache.axis.description.TypeDesc(RequestTemplatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTemplatesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplatesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplateDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplateDefinition"));
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
