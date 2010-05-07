/**
 * RecipientStatusEsignAgreementInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientStatusEsignAgreementInformation  implements java.io.Serializable {
    private java.lang.String accountEsignId;

    private java.lang.String userEsignId;

    private java.util.Calendar agreementDate;

    public RecipientStatusEsignAgreementInformation() {
    }

    public RecipientStatusEsignAgreementInformation(
           java.lang.String accountEsignId,
           java.lang.String userEsignId,
           java.util.Calendar agreementDate) {
           this.accountEsignId = accountEsignId;
           this.userEsignId = userEsignId;
           this.agreementDate = agreementDate;
    }


    /**
     * Gets the accountEsignId value for this RecipientStatusEsignAgreementInformation.
     * 
     * @return accountEsignId
     */
    public java.lang.String getAccountEsignId() {
        return accountEsignId;
    }


    /**
     * Sets the accountEsignId value for this RecipientStatusEsignAgreementInformation.
     * 
     * @param accountEsignId
     */
    public void setAccountEsignId(java.lang.String accountEsignId) {
        this.accountEsignId = accountEsignId;
    }


    /**
     * Gets the userEsignId value for this RecipientStatusEsignAgreementInformation.
     * 
     * @return userEsignId
     */
    public java.lang.String getUserEsignId() {
        return userEsignId;
    }


    /**
     * Sets the userEsignId value for this RecipientStatusEsignAgreementInformation.
     * 
     * @param userEsignId
     */
    public void setUserEsignId(java.lang.String userEsignId) {
        this.userEsignId = userEsignId;
    }


    /**
     * Gets the agreementDate value for this RecipientStatusEsignAgreementInformation.
     * 
     * @return agreementDate
     */
    public java.util.Calendar getAgreementDate() {
        return agreementDate;
    }


    /**
     * Sets the agreementDate value for this RecipientStatusEsignAgreementInformation.
     * 
     * @param agreementDate
     */
    public void setAgreementDate(java.util.Calendar agreementDate) {
        this.agreementDate = agreementDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientStatusEsignAgreementInformation)) return false;
        RecipientStatusEsignAgreementInformation other = (RecipientStatusEsignAgreementInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountEsignId==null && other.getAccountEsignId()==null) || 
             (this.accountEsignId!=null &&
              this.accountEsignId.equals(other.getAccountEsignId()))) &&
            ((this.userEsignId==null && other.getUserEsignId()==null) || 
             (this.userEsignId!=null &&
              this.userEsignId.equals(other.getUserEsignId()))) &&
            ((this.agreementDate==null && other.getAgreementDate()==null) || 
             (this.agreementDate!=null &&
              this.agreementDate.equals(other.getAgreementDate())));
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
        if (getAccountEsignId() != null) {
            _hashCode += getAccountEsignId().hashCode();
        }
        if (getUserEsignId() != null) {
            _hashCode += getUserEsignId().hashCode();
        }
        if (getAgreementDate() != null) {
            _hashCode += getAgreementDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecipientStatusEsignAgreementInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientStatusEsignAgreementInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountEsignId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountEsignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userEsignId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserEsignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AgreementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
