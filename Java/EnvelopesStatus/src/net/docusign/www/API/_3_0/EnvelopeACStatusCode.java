/**
 * EnvelopeACStatusCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeACStatusCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnvelopeACStatusCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Original = "Original";
    public static final java.lang.String _Transferred = "Transferred";
    public static final java.lang.String _AuthoritativeCopy = "AuthoritativeCopy";
    public static final java.lang.String _AuthoritativeCopyExportPending = "AuthoritativeCopyExportPending";
    public static final java.lang.String _AuthoritativeCopyExported = "AuthoritativeCopyExported";
    public static final java.lang.String _DepositPending = "DepositPending";
    public static final java.lang.String _Deposited = "Deposited";
    public static final java.lang.String _DepositedEO = "DepositedEO";
    public static final java.lang.String _DepositFailed = "DepositFailed";
    public static final EnvelopeACStatusCode Unknown = new EnvelopeACStatusCode(_Unknown);
    public static final EnvelopeACStatusCode Original = new EnvelopeACStatusCode(_Original);
    public static final EnvelopeACStatusCode Transferred = new EnvelopeACStatusCode(_Transferred);
    public static final EnvelopeACStatusCode AuthoritativeCopy = new EnvelopeACStatusCode(_AuthoritativeCopy);
    public static final EnvelopeACStatusCode AuthoritativeCopyExportPending = new EnvelopeACStatusCode(_AuthoritativeCopyExportPending);
    public static final EnvelopeACStatusCode AuthoritativeCopyExported = new EnvelopeACStatusCode(_AuthoritativeCopyExported);
    public static final EnvelopeACStatusCode DepositPending = new EnvelopeACStatusCode(_DepositPending);
    public static final EnvelopeACStatusCode Deposited = new EnvelopeACStatusCode(_Deposited);
    public static final EnvelopeACStatusCode DepositedEO = new EnvelopeACStatusCode(_DepositedEO);
    public static final EnvelopeACStatusCode DepositFailed = new EnvelopeACStatusCode(_DepositFailed);
    public java.lang.String getValue() { return _value_;}
    public static EnvelopeACStatusCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnvelopeACStatusCode enumeration = (EnvelopeACStatusCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnvelopeACStatusCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnvelopeACStatusCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeACStatusCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
