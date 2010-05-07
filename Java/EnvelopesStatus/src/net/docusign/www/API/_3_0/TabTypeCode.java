/**
 * TabTypeCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class TabTypeCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TabTypeCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _InitialHere = "InitialHere";
    public static final java.lang.String _SignHere = "SignHere";
    public static final java.lang.String _FullName = "FullName";
    public static final java.lang.String _Company = "Company";
    public static final java.lang.String _Title = "Title";
    public static final java.lang.String _DateSigned = "DateSigned";
    public static final java.lang.String _InitialHereOptional = "InitialHereOptional";
    public static final java.lang.String _EnvelopeID = "EnvelopeID";
    public static final java.lang.String _Custom = "Custom";
    public static final java.lang.String _SignerAttachment = "SignerAttachment";
    public static final java.lang.String _SignHereOptional = "SignHereOptional";
    public static final TabTypeCode InitialHere = new TabTypeCode(_InitialHere);
    public static final TabTypeCode SignHere = new TabTypeCode(_SignHere);
    public static final TabTypeCode FullName = new TabTypeCode(_FullName);
    public static final TabTypeCode Company = new TabTypeCode(_Company);
    public static final TabTypeCode Title = new TabTypeCode(_Title);
    public static final TabTypeCode DateSigned = new TabTypeCode(_DateSigned);
    public static final TabTypeCode InitialHereOptional = new TabTypeCode(_InitialHereOptional);
    public static final TabTypeCode EnvelopeID = new TabTypeCode(_EnvelopeID);
    public static final TabTypeCode Custom = new TabTypeCode(_Custom);
    public static final TabTypeCode SignerAttachment = new TabTypeCode(_SignerAttachment);
    public static final TabTypeCode SignHereOptional = new TabTypeCode(_SignHereOptional);
    public java.lang.String getValue() { return _value_;}
    public static TabTypeCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TabTypeCode enumeration = (TabTypeCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TabTypeCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TabTypeCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabTypeCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
