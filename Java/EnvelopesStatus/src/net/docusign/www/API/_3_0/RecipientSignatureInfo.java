/**
 * RecipientSignatureInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientSignatureInfo  implements java.io.Serializable {
    private java.lang.String signatureName;

    private java.lang.String signatureInitials;

    private net.docusign.www.API._3_0.FontStyleCode fontStyle;

    public RecipientSignatureInfo() {
    }

    public RecipientSignatureInfo(
           java.lang.String signatureName,
           java.lang.String signatureInitials,
           net.docusign.www.API._3_0.FontStyleCode fontStyle) {
           this.signatureName = signatureName;
           this.signatureInitials = signatureInitials;
           this.fontStyle = fontStyle;
    }


    /**
     * Gets the signatureName value for this RecipientSignatureInfo.
     * 
     * @return signatureName
     */
    public java.lang.String getSignatureName() {
        return signatureName;
    }


    /**
     * Sets the signatureName value for this RecipientSignatureInfo.
     * 
     * @param signatureName
     */
    public void setSignatureName(java.lang.String signatureName) {
        this.signatureName = signatureName;
    }


    /**
     * Gets the signatureInitials value for this RecipientSignatureInfo.
     * 
     * @return signatureInitials
     */
    public java.lang.String getSignatureInitials() {
        return signatureInitials;
    }


    /**
     * Sets the signatureInitials value for this RecipientSignatureInfo.
     * 
     * @param signatureInitials
     */
    public void setSignatureInitials(java.lang.String signatureInitials) {
        this.signatureInitials = signatureInitials;
    }


    /**
     * Gets the fontStyle value for this RecipientSignatureInfo.
     * 
     * @return fontStyle
     */
    public net.docusign.www.API._3_0.FontStyleCode getFontStyle() {
        return fontStyle;
    }


    /**
     * Sets the fontStyle value for this RecipientSignatureInfo.
     * 
     * @param fontStyle
     */
    public void setFontStyle(net.docusign.www.API._3_0.FontStyleCode fontStyle) {
        this.fontStyle = fontStyle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientSignatureInfo)) return false;
        RecipientSignatureInfo other = (RecipientSignatureInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.signatureName==null && other.getSignatureName()==null) || 
             (this.signatureName!=null &&
              this.signatureName.equals(other.getSignatureName()))) &&
            ((this.signatureInitials==null && other.getSignatureInitials()==null) || 
             (this.signatureInitials!=null &&
              this.signatureInitials.equals(other.getSignatureInitials()))) &&
            ((this.fontStyle==null && other.getFontStyle()==null) || 
             (this.fontStyle!=null &&
              this.fontStyle.equals(other.getFontStyle())));
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
        if (getSignatureName() != null) {
            _hashCode += getSignatureName().hashCode();
        }
        if (getSignatureInitials() != null) {
            _hashCode += getSignatureInitials().hashCode();
        }
        if (getFontStyle() != null) {
            _hashCode += getFontStyle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecipientSignatureInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSignatureInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignatureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureInitials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignatureInitials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fontStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FontStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FontStyleCode"));
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
