/**
 * RecipientEsign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientEsign  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String email;

    private boolean esign;

    private java.lang.Boolean reservedRecipientEmail;

    private java.lang.String reservedRecipientNames;

    public RecipientEsign() {
    }

    public RecipientEsign(
           java.lang.String userName,
           java.lang.String email,
           boolean esign,
           java.lang.Boolean reservedRecipientEmail,
           java.lang.String reservedRecipientNames) {
           this.userName = userName;
           this.email = email;
           this.esign = esign;
           this.reservedRecipientEmail = reservedRecipientEmail;
           this.reservedRecipientNames = reservedRecipientNames;
    }


    /**
     * Gets the userName value for this RecipientEsign.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this RecipientEsign.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the email value for this RecipientEsign.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this RecipientEsign.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the esign value for this RecipientEsign.
     * 
     * @return esign
     */
    public boolean isEsign() {
        return esign;
    }


    /**
     * Sets the esign value for this RecipientEsign.
     * 
     * @param esign
     */
    public void setEsign(boolean esign) {
        this.esign = esign;
    }


    /**
     * Gets the reservedRecipientEmail value for this RecipientEsign.
     * 
     * @return reservedRecipientEmail
     */
    public java.lang.Boolean getReservedRecipientEmail() {
        return reservedRecipientEmail;
    }


    /**
     * Sets the reservedRecipientEmail value for this RecipientEsign.
     * 
     * @param reservedRecipientEmail
     */
    public void setReservedRecipientEmail(java.lang.Boolean reservedRecipientEmail) {
        this.reservedRecipientEmail = reservedRecipientEmail;
    }


    /**
     * Gets the reservedRecipientNames value for this RecipientEsign.
     * 
     * @return reservedRecipientNames
     */
    public java.lang.String getReservedRecipientNames() {
        return reservedRecipientNames;
    }


    /**
     * Sets the reservedRecipientNames value for this RecipientEsign.
     * 
     * @param reservedRecipientNames
     */
    public void setReservedRecipientNames(java.lang.String reservedRecipientNames) {
        this.reservedRecipientNames = reservedRecipientNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientEsign)) return false;
        RecipientEsign other = (RecipientEsign) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.esign == other.isEsign() &&
            ((this.reservedRecipientEmail==null && other.getReservedRecipientEmail()==null) || 
             (this.reservedRecipientEmail!=null &&
              this.reservedRecipientEmail.equals(other.getReservedRecipientEmail()))) &&
            ((this.reservedRecipientNames==null && other.getReservedRecipientNames()==null) || 
             (this.reservedRecipientNames!=null &&
              this.reservedRecipientNames.equals(other.getReservedRecipientNames())));
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += (isEsign() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReservedRecipientEmail() != null) {
            _hashCode += getReservedRecipientEmail().hashCode();
        }
        if (getReservedRecipientNames() != null) {
            _hashCode += getReservedRecipientNames().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecipientEsign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEsign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Esign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedRecipientEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReservedRecipientEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedRecipientNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReservedRecipientNames"));
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
