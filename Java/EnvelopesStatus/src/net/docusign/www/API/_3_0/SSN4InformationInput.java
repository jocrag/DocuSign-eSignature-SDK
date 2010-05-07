/**
 * SSN4InformationInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class SSN4InformationInput  implements java.io.Serializable {
    private net.docusign.www.API._3_0.SSN4Information SSN4Information;

    private net.docusign.www.API._3_0.DisplayLevelCode displayLevel;

    private java.lang.Boolean receiveInResponse;

    public SSN4InformationInput() {
    }

    public SSN4InformationInput(
           net.docusign.www.API._3_0.SSN4Information SSN4Information,
           net.docusign.www.API._3_0.DisplayLevelCode displayLevel,
           java.lang.Boolean receiveInResponse) {
           this.SSN4Information = SSN4Information;
           this.displayLevel = displayLevel;
           this.receiveInResponse = receiveInResponse;
    }


    /**
     * Gets the SSN4Information value for this SSN4InformationInput.
     * 
     * @return SSN4Information
     */
    public net.docusign.www.API._3_0.SSN4Information getSSN4Information() {
        return SSN4Information;
    }


    /**
     * Sets the SSN4Information value for this SSN4InformationInput.
     * 
     * @param SSN4Information
     */
    public void setSSN4Information(net.docusign.www.API._3_0.SSN4Information SSN4Information) {
        this.SSN4Information = SSN4Information;
    }


    /**
     * Gets the displayLevel value for this SSN4InformationInput.
     * 
     * @return displayLevel
     */
    public net.docusign.www.API._3_0.DisplayLevelCode getDisplayLevel() {
        return displayLevel;
    }


    /**
     * Sets the displayLevel value for this SSN4InformationInput.
     * 
     * @param displayLevel
     */
    public void setDisplayLevel(net.docusign.www.API._3_0.DisplayLevelCode displayLevel) {
        this.displayLevel = displayLevel;
    }


    /**
     * Gets the receiveInResponse value for this SSN4InformationInput.
     * 
     * @return receiveInResponse
     */
    public java.lang.Boolean getReceiveInResponse() {
        return receiveInResponse;
    }


    /**
     * Sets the receiveInResponse value for this SSN4InformationInput.
     * 
     * @param receiveInResponse
     */
    public void setReceiveInResponse(java.lang.Boolean receiveInResponse) {
        this.receiveInResponse = receiveInResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SSN4InformationInput)) return false;
        SSN4InformationInput other = (SSN4InformationInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SSN4Information==null && other.getSSN4Information()==null) || 
             (this.SSN4Information!=null &&
              this.SSN4Information.equals(other.getSSN4Information()))) &&
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
        if (getSSN4Information() != null) {
            _hashCode += getSSN4Information().hashCode();
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
        new org.apache.axis.description.TypeDesc(SSN4InformationInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN4InformationInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSN4Information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN4Information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SSN4Information"));
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
