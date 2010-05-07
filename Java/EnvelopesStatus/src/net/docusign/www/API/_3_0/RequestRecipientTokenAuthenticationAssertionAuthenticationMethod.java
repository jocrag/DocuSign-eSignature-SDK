/**
 * RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestRecipientTokenAuthenticationAssertionAuthenticationMethod implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Password = "Password";
    public static final java.lang.String _Email = "Email";
    public static final java.lang.String _PaperDocuments = "PaperDocuments";
    public static final java.lang.String _HTTPBasicAuth = "HTTPBasicAuth";
    public static final java.lang.String _SSLMutualAuth = "SSLMutualAuth";
    public static final java.lang.String _X509Certificate = "X509Certificate";
    public static final java.lang.String _Kerberos = "Kerberos";
    public static final java.lang.String _SingleSignOn_CASiteminder = "SingleSignOn_CASiteminder";
    public static final java.lang.String _SingleSignOn_InfoCard = "SingleSignOn_InfoCard";
    public static final java.lang.String _SingleSignOn_MicrosoftActiveDirectory = "SingleSignOn_MicrosoftActiveDirectory";
    public static final java.lang.String _SingleSignOn_Passport = "SingleSignOn_Passport";
    public static final java.lang.String _SingleSignOn_SAML = "SingleSignOn_SAML";
    public static final java.lang.String _SingleSignOn_Other = "SingleSignOn_Other";
    public static final java.lang.String _Smartcard = "Smartcard";
    public static final java.lang.String _RSASecureID = "RSASecureID";
    public static final java.lang.String _Biometric = "Biometric";
    public static final java.lang.String _None = "None";
    public static final java.lang.String _KnowledgeBasedAuth = "KnowledgeBasedAuth";
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod Password = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_Password);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod Email = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_Email);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod PaperDocuments = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_PaperDocuments);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod HTTPBasicAuth = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_HTTPBasicAuth);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SSLMutualAuth = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SSLMutualAuth);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod X509Certificate = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_X509Certificate);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod Kerberos = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_Kerberos);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SingleSignOn_CASiteminder = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SingleSignOn_CASiteminder);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SingleSignOn_InfoCard = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SingleSignOn_InfoCard);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SingleSignOn_MicrosoftActiveDirectory = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SingleSignOn_MicrosoftActiveDirectory);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SingleSignOn_Passport = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SingleSignOn_Passport);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SingleSignOn_SAML = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SingleSignOn_SAML);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod SingleSignOn_Other = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_SingleSignOn_Other);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod Smartcard = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_Smartcard);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod RSASecureID = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_RSASecureID);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod Biometric = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_Biometric);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod None = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_None);
    public static final RequestRecipientTokenAuthenticationAssertionAuthenticationMethod KnowledgeBasedAuth = new RequestRecipientTokenAuthenticationAssertionAuthenticationMethod(_KnowledgeBasedAuth);
    public java.lang.String getValue() { return _value_;}
    public static RequestRecipientTokenAuthenticationAssertionAuthenticationMethod fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RequestRecipientTokenAuthenticationAssertionAuthenticationMethod enumeration = (RequestRecipientTokenAuthenticationAssertionAuthenticationMethod)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RequestRecipientTokenAuthenticationAssertionAuthenticationMethod fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenAuthenticationAssertionAuthenticationMethod"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
