/**
 * GetFoldersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class GetFoldersResponse  implements java.io.Serializable {
    private net.docusign.www.API._3_0.AvailableFolders getFoldersResult;

    public GetFoldersResponse() {
    }

    public GetFoldersResponse(
           net.docusign.www.API._3_0.AvailableFolders getFoldersResult) {
           this.getFoldersResult = getFoldersResult;
    }


    /**
     * Gets the getFoldersResult value for this GetFoldersResponse.
     * 
     * @return getFoldersResult
     */
    public net.docusign.www.API._3_0.AvailableFolders getGetFoldersResult() {
        return getFoldersResult;
    }


    /**
     * Sets the getFoldersResult value for this GetFoldersResponse.
     * 
     * @param getFoldersResult
     */
    public void setGetFoldersResult(net.docusign.www.API._3_0.AvailableFolders getFoldersResult) {
        this.getFoldersResult = getFoldersResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFoldersResponse)) return false;
        GetFoldersResponse other = (GetFoldersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFoldersResult==null && other.getGetFoldersResult()==null) || 
             (this.getFoldersResult!=null &&
              this.getFoldersResult.equals(other.getGetFoldersResult())));
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
        if (getGetFoldersResult() != null) {
            _hashCode += getGetFoldersResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFoldersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetFoldersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFoldersResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetFoldersResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AvailableFolders"));
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
