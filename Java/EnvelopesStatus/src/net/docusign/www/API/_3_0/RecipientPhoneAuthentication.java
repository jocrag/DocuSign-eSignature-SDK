/**
 * RecipientPhoneAuthentication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientPhoneAuthentication  implements java.io.Serializable {
    private java.lang.Boolean recipMayProvideNumber;

    private java.lang.Boolean validateRecipProvidedNumber;

    private java.lang.Boolean recordVoicePrint;

    private java.lang.String[] senderProvidedNumbers;

    public RecipientPhoneAuthentication() {
    }

    public RecipientPhoneAuthentication(
           java.lang.Boolean recipMayProvideNumber,
           java.lang.Boolean validateRecipProvidedNumber,
           java.lang.Boolean recordVoicePrint,
           java.lang.String[] senderProvidedNumbers) {
           this.recipMayProvideNumber = recipMayProvideNumber;
           this.validateRecipProvidedNumber = validateRecipProvidedNumber;
           this.recordVoicePrint = recordVoicePrint;
           this.senderProvidedNumbers = senderProvidedNumbers;
    }


    /**
     * Gets the recipMayProvideNumber value for this RecipientPhoneAuthentication.
     * 
     * @return recipMayProvideNumber
     */
    public java.lang.Boolean getRecipMayProvideNumber() {
        return recipMayProvideNumber;
    }


    /**
     * Sets the recipMayProvideNumber value for this RecipientPhoneAuthentication.
     * 
     * @param recipMayProvideNumber
     */
    public void setRecipMayProvideNumber(java.lang.Boolean recipMayProvideNumber) {
        this.recipMayProvideNumber = recipMayProvideNumber;
    }


    /**
     * Gets the validateRecipProvidedNumber value for this RecipientPhoneAuthentication.
     * 
     * @return validateRecipProvidedNumber
     */
    public java.lang.Boolean getValidateRecipProvidedNumber() {
        return validateRecipProvidedNumber;
    }


    /**
     * Sets the validateRecipProvidedNumber value for this RecipientPhoneAuthentication.
     * 
     * @param validateRecipProvidedNumber
     */
    public void setValidateRecipProvidedNumber(java.lang.Boolean validateRecipProvidedNumber) {
        this.validateRecipProvidedNumber = validateRecipProvidedNumber;
    }


    /**
     * Gets the recordVoicePrint value for this RecipientPhoneAuthentication.
     * 
     * @return recordVoicePrint
     */
    public java.lang.Boolean getRecordVoicePrint() {
        return recordVoicePrint;
    }


    /**
     * Sets the recordVoicePrint value for this RecipientPhoneAuthentication.
     * 
     * @param recordVoicePrint
     */
    public void setRecordVoicePrint(java.lang.Boolean recordVoicePrint) {
        this.recordVoicePrint = recordVoicePrint;
    }


    /**
     * Gets the senderProvidedNumbers value for this RecipientPhoneAuthentication.
     * 
     * @return senderProvidedNumbers
     */
    public java.lang.String[] getSenderProvidedNumbers() {
        return senderProvidedNumbers;
    }


    /**
     * Sets the senderProvidedNumbers value for this RecipientPhoneAuthentication.
     * 
     * @param senderProvidedNumbers
     */
    public void setSenderProvidedNumbers(java.lang.String[] senderProvidedNumbers) {
        this.senderProvidedNumbers = senderProvidedNumbers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientPhoneAuthentication)) return false;
        RecipientPhoneAuthentication other = (RecipientPhoneAuthentication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recipMayProvideNumber==null && other.getRecipMayProvideNumber()==null) || 
             (this.recipMayProvideNumber!=null &&
              this.recipMayProvideNumber.equals(other.getRecipMayProvideNumber()))) &&
            ((this.validateRecipProvidedNumber==null && other.getValidateRecipProvidedNumber()==null) || 
             (this.validateRecipProvidedNumber!=null &&
              this.validateRecipProvidedNumber.equals(other.getValidateRecipProvidedNumber()))) &&
            ((this.recordVoicePrint==null && other.getRecordVoicePrint()==null) || 
             (this.recordVoicePrint!=null &&
              this.recordVoicePrint.equals(other.getRecordVoicePrint()))) &&
            ((this.senderProvidedNumbers==null && other.getSenderProvidedNumbers()==null) || 
             (this.senderProvidedNumbers!=null &&
              java.util.Arrays.equals(this.senderProvidedNumbers, other.getSenderProvidedNumbers())));
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
        if (getRecipMayProvideNumber() != null) {
            _hashCode += getRecipMayProvideNumber().hashCode();
        }
        if (getValidateRecipProvidedNumber() != null) {
            _hashCode += getValidateRecipProvidedNumber().hashCode();
        }
        if (getRecordVoicePrint() != null) {
            _hashCode += getRecordVoicePrint().hashCode();
        }
        if (getSenderProvidedNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSenderProvidedNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSenderProvidedNumbers(), i);
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
        new org.apache.axis.description.TypeDesc(RecipientPhoneAuthentication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientPhoneAuthentication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipMayProvideNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipMayProvideNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validateRecipProvidedNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ValidateRecipProvidedNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordVoicePrint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecordVoicePrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderProvidedNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderProvidedNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderProvidedNumber"));
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
