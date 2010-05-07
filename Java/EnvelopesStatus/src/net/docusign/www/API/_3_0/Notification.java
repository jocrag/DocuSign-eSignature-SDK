/**
 * Notification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class Notification  implements java.io.Serializable {
    private java.lang.Boolean useAccountDefaults;

    private net.docusign.www.API._3_0.Reminders reminders;

    private net.docusign.www.API._3_0.Expirations expirations;

    public Notification() {
    }

    public Notification(
           java.lang.Boolean useAccountDefaults,
           net.docusign.www.API._3_0.Reminders reminders,
           net.docusign.www.API._3_0.Expirations expirations) {
           this.useAccountDefaults = useAccountDefaults;
           this.reminders = reminders;
           this.expirations = expirations;
    }


    /**
     * Gets the useAccountDefaults value for this Notification.
     * 
     * @return useAccountDefaults
     */
    public java.lang.Boolean getUseAccountDefaults() {
        return useAccountDefaults;
    }


    /**
     * Sets the useAccountDefaults value for this Notification.
     * 
     * @param useAccountDefaults
     */
    public void setUseAccountDefaults(java.lang.Boolean useAccountDefaults) {
        this.useAccountDefaults = useAccountDefaults;
    }


    /**
     * Gets the reminders value for this Notification.
     * 
     * @return reminders
     */
    public net.docusign.www.API._3_0.Reminders getReminders() {
        return reminders;
    }


    /**
     * Sets the reminders value for this Notification.
     * 
     * @param reminders
     */
    public void setReminders(net.docusign.www.API._3_0.Reminders reminders) {
        this.reminders = reminders;
    }


    /**
     * Gets the expirations value for this Notification.
     * 
     * @return expirations
     */
    public net.docusign.www.API._3_0.Expirations getExpirations() {
        return expirations;
    }


    /**
     * Sets the expirations value for this Notification.
     * 
     * @param expirations
     */
    public void setExpirations(net.docusign.www.API._3_0.Expirations expirations) {
        this.expirations = expirations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Notification)) return false;
        Notification other = (Notification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.useAccountDefaults==null && other.getUseAccountDefaults()==null) || 
             (this.useAccountDefaults!=null &&
              this.useAccountDefaults.equals(other.getUseAccountDefaults()))) &&
            ((this.reminders==null && other.getReminders()==null) || 
             (this.reminders!=null &&
              this.reminders.equals(other.getReminders()))) &&
            ((this.expirations==null && other.getExpirations()==null) || 
             (this.expirations!=null &&
              this.expirations.equals(other.getExpirations())));
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
        if (getUseAccountDefaults() != null) {
            _hashCode += getUseAccountDefaults().hashCode();
        }
        if (getReminders() != null) {
            _hashCode += getReminders().hashCode();
        }
        if (getExpirations() != null) {
            _hashCode += getExpirations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Notification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Notification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useAccountDefaults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UseAccountDefaults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Reminders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Reminders"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Expirations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Expirations"));
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
