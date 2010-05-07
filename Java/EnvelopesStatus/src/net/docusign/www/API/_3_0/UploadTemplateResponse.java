/**
 * UploadTemplateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class UploadTemplateResponse  implements java.io.Serializable {
    private net.docusign.www.API._3_0.SaveTemplateResult uploadTemplateResult;

    public UploadTemplateResponse() {
    }

    public UploadTemplateResponse(
           net.docusign.www.API._3_0.SaveTemplateResult uploadTemplateResult) {
           this.uploadTemplateResult = uploadTemplateResult;
    }


    /**
     * Gets the uploadTemplateResult value for this UploadTemplateResponse.
     * 
     * @return uploadTemplateResult
     */
    public net.docusign.www.API._3_0.SaveTemplateResult getUploadTemplateResult() {
        return uploadTemplateResult;
    }


    /**
     * Sets the uploadTemplateResult value for this UploadTemplateResponse.
     * 
     * @param uploadTemplateResult
     */
    public void setUploadTemplateResult(net.docusign.www.API._3_0.SaveTemplateResult uploadTemplateResult) {
        this.uploadTemplateResult = uploadTemplateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadTemplateResponse)) return false;
        UploadTemplateResponse other = (UploadTemplateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uploadTemplateResult==null && other.getUploadTemplateResult()==null) || 
             (this.uploadTemplateResult!=null &&
              this.uploadTemplateResult.equals(other.getUploadTemplateResult())));
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
        if (getUploadTemplateResult() != null) {
            _hashCode += getUploadTemplateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadTemplateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">UploadTemplateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadTemplateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UploadTemplateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SaveTemplateResult"));
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
