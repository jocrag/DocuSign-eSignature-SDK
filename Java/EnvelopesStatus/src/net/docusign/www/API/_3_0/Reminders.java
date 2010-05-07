/**
 * Reminders.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class Reminders  implements java.io.Serializable {
    private boolean reminderEnabled;

    private org.apache.axis.types.NonNegativeInteger reminderDelay;

    private org.apache.axis.types.NonNegativeInteger reminderFrequency;

    public Reminders() {
    }

    public Reminders(
           boolean reminderEnabled,
           org.apache.axis.types.NonNegativeInteger reminderDelay,
           org.apache.axis.types.NonNegativeInteger reminderFrequency) {
           this.reminderEnabled = reminderEnabled;
           this.reminderDelay = reminderDelay;
           this.reminderFrequency = reminderFrequency;
    }


    /**
     * Gets the reminderEnabled value for this Reminders.
     * 
     * @return reminderEnabled
     */
    public boolean isReminderEnabled() {
        return reminderEnabled;
    }


    /**
     * Sets the reminderEnabled value for this Reminders.
     * 
     * @param reminderEnabled
     */
    public void setReminderEnabled(boolean reminderEnabled) {
        this.reminderEnabled = reminderEnabled;
    }


    /**
     * Gets the reminderDelay value for this Reminders.
     * 
     * @return reminderDelay
     */
    public org.apache.axis.types.NonNegativeInteger getReminderDelay() {
        return reminderDelay;
    }


    /**
     * Sets the reminderDelay value for this Reminders.
     * 
     * @param reminderDelay
     */
    public void setReminderDelay(org.apache.axis.types.NonNegativeInteger reminderDelay) {
        this.reminderDelay = reminderDelay;
    }


    /**
     * Gets the reminderFrequency value for this Reminders.
     * 
     * @return reminderFrequency
     */
    public org.apache.axis.types.NonNegativeInteger getReminderFrequency() {
        return reminderFrequency;
    }


    /**
     * Sets the reminderFrequency value for this Reminders.
     * 
     * @param reminderFrequency
     */
    public void setReminderFrequency(org.apache.axis.types.NonNegativeInteger reminderFrequency) {
        this.reminderFrequency = reminderFrequency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reminders)) return false;
        Reminders other = (Reminders) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.reminderEnabled == other.isReminderEnabled() &&
            ((this.reminderDelay==null && other.getReminderDelay()==null) || 
             (this.reminderDelay!=null &&
              this.reminderDelay.equals(other.getReminderDelay()))) &&
            ((this.reminderFrequency==null && other.getReminderFrequency()==null) || 
             (this.reminderFrequency!=null &&
              this.reminderFrequency.equals(other.getReminderFrequency())));
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
        _hashCode += (isReminderEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReminderDelay() != null) {
            _hashCode += getReminderDelay().hashCode();
        }
        if (getReminderFrequency() != null) {
            _hashCode += getReminderFrequency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reminders.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Reminders"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReminderEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReminderDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReminderFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
