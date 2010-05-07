/**
 * IDCheckInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class IDCheckInformation  implements java.io.Serializable {
    private net.docusign.www.API._3_0.AddressInformation addressInformation;

    private net.docusign.www.API._3_0.DOBInformation DOBInformation;

    private net.docusign.www.API._3_0.SSN4Information SSN4Information;

    public IDCheckInformation() {
    }

    public IDCheckInformation(
           net.docusign.www.API._3_0.AddressInformation addressInformation,
           net.docusign.www.API._3_0.DOBInformation DOBInformation,
           net.docusign.www.API._3_0.SSN4Information SSN4Information) {
           this.addressInformation = addressInformation;
           this.DOBInformation = DOBInformation;
           this.SSN4Information = SSN4Information;
    }


    /**
     * Gets the addressInformation value for this IDCheckInformation.
     * 
     * @return addressInformation
     */
    public net.docusign.www.API._3_0.AddressInformation getAddressInformation() {
        return addressInformation;
    }


    /**
     * Sets the addressInformation value for this IDCheckInformation.
     * 
     * @param addressInformation
     */
    public void setAddressInformation(net.docusign.www.API._3_0.AddressInformation addressInformation) {
        this.addressInformation = addressInformation;
    }


    /**
     * Gets the DOBInformation value for this IDCheckInformation.
     * 
     * @return DOBInformation
     */
    public net.docusign.www.API._3_0.DOBInformation getDOBInformation() {
        return DOBInformation;
    }


    /**
     * Sets the DOBInformation value for this IDCheckInformation.
     * 
     * @param DOBInformation
     */
    public void setDOBInformation(net.docusign.www.API._3_0.DOBInformation DOBInformation) {
        this.DOBInformation = DOBInformation;
    }


    /**
     * Gets the SSN4Information value for this IDCheckInformation.
     * 
     * @return SSN4Information
     */
    public net.docusign.www.API._3_0.SSN4Information getSSN4Information() {
        return SSN4Information;
    }


    /**
     * Sets the SSN4Information value for this IDCheckInformation.
     * 
     * @param SSN4Information
     */
    public void setSSN4Information(net.docusign.www.API._3_0.SSN4Information SSN4Information) {
        this.SSN4Information = SSN4Information;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IDCheckInformation)) return false;
        IDCheckInformation other = (IDCheckInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressInformation==null && other.getAddressInformation()==null) || 
             (this.addressInformation!=null &&
              this.addressInformation.equals(other.getAddressInformation()))) &&
            ((this.DOBInformation==null && other.getDOBInformation()==null) || 
             (this.DOBInformation!=null &&
              this.DOBInformation.equals(other.getDOBInformation()))) &&
            ((this.SSN4Information==null && other.getSSN4Information()==null) || 
             (this.SSN4Information!=null &&
              this.SSN4Information.equals(other.getSSN4Information())));
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
        if (getAddressInformation() != null) {
            _hashCode += getAddressInformation().hashCode();
        }
        if (getDOBInformation() != null) {
            _hashCode += getDOBInformation().hashCode();
        }
        if (getSSN4Information() != null) {
            _hashCode += getSSN4Information().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IDCheckInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOBInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DOBInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DOBInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSN4Information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN4Information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN4Information"));
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
