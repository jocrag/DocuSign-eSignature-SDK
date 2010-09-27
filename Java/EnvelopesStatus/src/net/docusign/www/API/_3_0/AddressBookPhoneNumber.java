/**
 * AddressBookPhoneNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class AddressBookPhoneNumber  implements java.io.Serializable {
    private java.lang.String phoneNumber;

    private net.docusign.www.API._3_0.PhoneNumberDesignation designation;

    public AddressBookPhoneNumber() {
    }

    public AddressBookPhoneNumber(
           java.lang.String phoneNumber,
           net.docusign.www.API._3_0.PhoneNumberDesignation designation) {
           this.phoneNumber = phoneNumber;
           this.designation = designation;
    }


    /**
     * Gets the phoneNumber value for this AddressBookPhoneNumber.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this AddressBookPhoneNumber.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the designation value for this AddressBookPhoneNumber.
     * 
     * @return designation
     */
    public net.docusign.www.API._3_0.PhoneNumberDesignation getDesignation() {
        return designation;
    }


    /**
     * Sets the designation value for this AddressBookPhoneNumber.
     * 
     * @param designation
     */
    public void setDesignation(net.docusign.www.API._3_0.PhoneNumberDesignation designation) {
        this.designation = designation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressBookPhoneNumber)) return false;
        AddressBookPhoneNumber other = (AddressBookPhoneNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.designation==null && other.getDesignation()==null) || 
             (this.designation!=null &&
              this.designation.equals(other.getDesignation())));
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
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getDesignation() != null) {
            _hashCode += getDesignation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressBookPhoneNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookPhoneNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Designation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PhoneNumberDesignation"));
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
