/**
 * VaultingOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class VaultingOptions  implements java.io.Serializable {
    private net.docusign.www.API._3_0.VaultingModeCode vaultingMode;

    private java.lang.String EODTransactionName;

    private java.lang.String EODDocumentName;

    private java.lang.String EODDocumentDescription;

    public VaultingOptions() {
    }

    public VaultingOptions(
           net.docusign.www.API._3_0.VaultingModeCode vaultingMode,
           java.lang.String EODTransactionName,
           java.lang.String EODDocumentName,
           java.lang.String EODDocumentDescription) {
           this.vaultingMode = vaultingMode;
           this.EODTransactionName = EODTransactionName;
           this.EODDocumentName = EODDocumentName;
           this.EODDocumentDescription = EODDocumentDescription;
    }


    /**
     * Gets the vaultingMode value for this VaultingOptions.
     * 
     * @return vaultingMode
     */
    public net.docusign.www.API._3_0.VaultingModeCode getVaultingMode() {
        return vaultingMode;
    }


    /**
     * Sets the vaultingMode value for this VaultingOptions.
     * 
     * @param vaultingMode
     */
    public void setVaultingMode(net.docusign.www.API._3_0.VaultingModeCode vaultingMode) {
        this.vaultingMode = vaultingMode;
    }


    /**
     * Gets the EODTransactionName value for this VaultingOptions.
     * 
     * @return EODTransactionName
     */
    public java.lang.String getEODTransactionName() {
        return EODTransactionName;
    }


    /**
     * Sets the EODTransactionName value for this VaultingOptions.
     * 
     * @param EODTransactionName
     */
    public void setEODTransactionName(java.lang.String EODTransactionName) {
        this.EODTransactionName = EODTransactionName;
    }


    /**
     * Gets the EODDocumentName value for this VaultingOptions.
     * 
     * @return EODDocumentName
     */
    public java.lang.String getEODDocumentName() {
        return EODDocumentName;
    }


    /**
     * Sets the EODDocumentName value for this VaultingOptions.
     * 
     * @param EODDocumentName
     */
    public void setEODDocumentName(java.lang.String EODDocumentName) {
        this.EODDocumentName = EODDocumentName;
    }


    /**
     * Gets the EODDocumentDescription value for this VaultingOptions.
     * 
     * @return EODDocumentDescription
     */
    public java.lang.String getEODDocumentDescription() {
        return EODDocumentDescription;
    }


    /**
     * Sets the EODDocumentDescription value for this VaultingOptions.
     * 
     * @param EODDocumentDescription
     */
    public void setEODDocumentDescription(java.lang.String EODDocumentDescription) {
        this.EODDocumentDescription = EODDocumentDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VaultingOptions)) return false;
        VaultingOptions other = (VaultingOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vaultingMode==null && other.getVaultingMode()==null) || 
             (this.vaultingMode!=null &&
              this.vaultingMode.equals(other.getVaultingMode()))) &&
            ((this.EODTransactionName==null && other.getEODTransactionName()==null) || 
             (this.EODTransactionName!=null &&
              this.EODTransactionName.equals(other.getEODTransactionName()))) &&
            ((this.EODDocumentName==null && other.getEODDocumentName()==null) || 
             (this.EODDocumentName!=null &&
              this.EODDocumentName.equals(other.getEODDocumentName()))) &&
            ((this.EODDocumentDescription==null && other.getEODDocumentDescription()==null) || 
             (this.EODDocumentDescription!=null &&
              this.EODDocumentDescription.equals(other.getEODDocumentDescription())));
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
        if (getVaultingMode() != null) {
            _hashCode += getVaultingMode().hashCode();
        }
        if (getEODTransactionName() != null) {
            _hashCode += getEODTransactionName().hashCode();
        }
        if (getEODDocumentName() != null) {
            _hashCode += getEODDocumentName().hashCode();
        }
        if (getEODDocumentDescription() != null) {
            _hashCode += getEODDocumentDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VaultingOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vaultingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingModeCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EODTransactionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EODTransactionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EODDocumentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EODDocumentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EODDocumentDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EODDocumentDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
