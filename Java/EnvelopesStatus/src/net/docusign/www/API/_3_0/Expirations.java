/**
 * Expirations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class Expirations  implements java.io.Serializable {
    private boolean expireEnabled;

    private org.apache.axis.types.NonNegativeInteger expireAfter;

    private org.apache.axis.types.NonNegativeInteger expireWarn;

    public Expirations() {
    }

    public Expirations(
           boolean expireEnabled,
           org.apache.axis.types.NonNegativeInteger expireAfter,
           org.apache.axis.types.NonNegativeInteger expireWarn) {
           this.expireEnabled = expireEnabled;
           this.expireAfter = expireAfter;
           this.expireWarn = expireWarn;
    }


    /**
     * Gets the expireEnabled value for this Expirations.
     * 
     * @return expireEnabled
     */
    public boolean isExpireEnabled() {
        return expireEnabled;
    }


    /**
     * Sets the expireEnabled value for this Expirations.
     * 
     * @param expireEnabled
     */
    public void setExpireEnabled(boolean expireEnabled) {
        this.expireEnabled = expireEnabled;
    }


    /**
     * Gets the expireAfter value for this Expirations.
     * 
     * @return expireAfter
     */
    public org.apache.axis.types.NonNegativeInteger getExpireAfter() {
        return expireAfter;
    }


    /**
     * Sets the expireAfter value for this Expirations.
     * 
     * @param expireAfter
     */
    public void setExpireAfter(org.apache.axis.types.NonNegativeInteger expireAfter) {
        this.expireAfter = expireAfter;
    }


    /**
     * Gets the expireWarn value for this Expirations.
     * 
     * @return expireWarn
     */
    public org.apache.axis.types.NonNegativeInteger getExpireWarn() {
        return expireWarn;
    }


    /**
     * Sets the expireWarn value for this Expirations.
     * 
     * @param expireWarn
     */
    public void setExpireWarn(org.apache.axis.types.NonNegativeInteger expireWarn) {
        this.expireWarn = expireWarn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Expirations)) return false;
        Expirations other = (Expirations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.expireEnabled == other.isExpireEnabled() &&
            ((this.expireAfter==null && other.getExpireAfter()==null) || 
             (this.expireAfter!=null &&
              this.expireAfter.equals(other.getExpireAfter()))) &&
            ((this.expireWarn==null && other.getExpireWarn()==null) || 
             (this.expireWarn!=null &&
              this.expireWarn.equals(other.getExpireWarn())));
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
        _hashCode += (isExpireEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExpireAfter() != null) {
            _hashCode += getExpireAfter().hashCode();
        }
        if (getExpireWarn() != null) {
            _hashCode += getExpireWarn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Expirations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Expirations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ExpireEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ExpireAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireWarn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ExpireWarn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
