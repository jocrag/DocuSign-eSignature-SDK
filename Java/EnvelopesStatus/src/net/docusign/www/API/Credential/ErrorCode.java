/**
 * ErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API.Credential;

public class ErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _User_Does_Not_Exist_In_System = "User_Does_Not_Exist_In_System";
    public static final java.lang.String _Account_Lacks_Permissions = "Account_Lacks_Permissions";
    public static final java.lang.String _User_Lacks_Permissions = "User_Lacks_Permissions";
    public static final java.lang.String _User_Authentication_Failed = "User_Authentication_Failed";
    public static final java.lang.String _Unspecified_Error = "Unspecified_Error";
    public static final java.lang.String _Success = "Success";
    public static final ErrorCode User_Does_Not_Exist_In_System = new ErrorCode(_User_Does_Not_Exist_In_System);
    public static final ErrorCode Account_Lacks_Permissions = new ErrorCode(_Account_Lacks_Permissions);
    public static final ErrorCode User_Lacks_Permissions = new ErrorCode(_User_Lacks_Permissions);
    public static final ErrorCode User_Authentication_Failed = new ErrorCode(_User_Authentication_Failed);
    public static final ErrorCode Unspecified_Error = new ErrorCode(_Unspecified_Error);
    public static final ErrorCode Success = new ErrorCode(_Success);
    public java.lang.String getValue() { return _value_;}
    public static ErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ErrorCode enumeration = (ErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ErrorCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/Credential", "ErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
