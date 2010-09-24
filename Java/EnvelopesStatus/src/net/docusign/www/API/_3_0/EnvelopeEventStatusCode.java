/**
 * EnvelopeEventStatusCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeEventStatusCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnvelopeEventStatusCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Sent = "Sent";
    public static final java.lang.String _Delivered = "Delivered";
    public static final java.lang.String _Completed = "Completed";
    public static final java.lang.String _Declined = "Declined";
    public static final java.lang.String _Voided = "Voided";
    public static final EnvelopeEventStatusCode Sent = new EnvelopeEventStatusCode(_Sent);
    public static final EnvelopeEventStatusCode Delivered = new EnvelopeEventStatusCode(_Delivered);
    public static final EnvelopeEventStatusCode Completed = new EnvelopeEventStatusCode(_Completed);
    public static final EnvelopeEventStatusCode Declined = new EnvelopeEventStatusCode(_Declined);
    public static final EnvelopeEventStatusCode Voided = new EnvelopeEventStatusCode(_Voided);
    public java.lang.String getValue() { return _value_;}
    public static EnvelopeEventStatusCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnvelopeEventStatusCode enumeration = (EnvelopeEventStatusCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnvelopeEventStatusCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeEventStatusCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEventStatusCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
