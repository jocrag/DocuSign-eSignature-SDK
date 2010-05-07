/**
 * AddressInformationInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class AddressInformationInput  implements java.io.Serializable {
    private net.docusign.www.API._3_0.AddressInformation addressInformation;

    private net.docusign.www.API._3_0.DisplayLevelCode displayLevel;

    private java.lang.Boolean receiveInResponse;

    public AddressInformationInput() {
    }

    public AddressInformationInput(
           net.docusign.www.API._3_0.AddressInformation addressInformation,
           net.docusign.www.API._3_0.DisplayLevelCode displayLevel,
           java.lang.Boolean receiveInResponse) {
           this.addressInformation = addressInformation;
           this.displayLevel = displayLevel;
           this.receiveInResponse = receiveInResponse;
    }


    /**
     * Gets the addressInformation value for this AddressInformationInput.
     * 
     * @return addressInformation
     */
    public net.docusign.www.API._3_0.AddressInformation getAddressInformation() {
        return addressInformation;
    }


    /**
     * Sets the addressInformation value for this AddressInformationInput.
     * 
     * @param addressInformation
     */
    public void setAddressInformation(net.docusign.www.API._3_0.AddressInformation addressInformation) {
        this.addressInformation = addressInformation;
    }


    /**
     * Gets the displayLevel value for this AddressInformationInput.
     * 
     * @return displayLevel
     */
    public net.docusign.www.API._3_0.DisplayLevelCode getDisplayLevel() {
        return displayLevel;
    }


    /**
     * Sets the displayLevel value for this AddressInformationInput.
     * 
     * @param displayLevel
     */
    public void setDisplayLevel(net.docusign.www.API._3_0.DisplayLevelCode displayLevel) {
        this.displayLevel = displayLevel;
    }


    /**
     * Gets the receiveInResponse value for this AddressInformationInput.
     * 
     * @return receiveInResponse
     */
    public java.lang.Boolean getReceiveInResponse() {
        return receiveInResponse;
    }


    /**
     * Sets the receiveInResponse value for this AddressInformationInput.
     * 
     * @param receiveInResponse
     */
    public void setReceiveInResponse(java.lang.Boolean receiveInResponse) {
        this.receiveInResponse = receiveInResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressInformationInput)) return false;
        AddressInformationInput other = (AddressInformationInput) obj;
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
            ((this.displayLevel==null && other.getDisplayLevel()==null) || 
             (this.displayLevel!=null &&
              this.displayLevel.equals(other.getDisplayLevel()))) &&
            ((this.receiveInResponse==null && other.getReceiveInResponse()==null) || 
             (this.receiveInResponse!=null &&
              this.receiveInResponse.equals(other.getReceiveInResponse())));
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
        if (getDisplayLevel() != null) {
            _hashCode += getDisplayLevel().hashCode();
        }
        if (getReceiveInResponse() != null) {
            _hashCode += getReceiveInResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressInformationInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressInformationInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DisplayLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DisplayLevelCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveInResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReceiveInResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
