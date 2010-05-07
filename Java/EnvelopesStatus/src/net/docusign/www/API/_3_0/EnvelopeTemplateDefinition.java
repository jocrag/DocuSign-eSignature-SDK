/**
 * EnvelopeTemplateDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeTemplateDefinition  implements java.io.Serializable {
    private java.lang.String templateID;

    private java.lang.String name;

    private boolean shared;

    private java.lang.String templatePassword;

    private java.lang.String templateDescription;

    private java.util.Calendar lastModified;

    private java.lang.Integer pageCount;

    public EnvelopeTemplateDefinition() {
    }

    public EnvelopeTemplateDefinition(
           java.lang.String templateID,
           java.lang.String name,
           boolean shared,
           java.lang.String templatePassword,
           java.lang.String templateDescription,
           java.util.Calendar lastModified,
           java.lang.Integer pageCount) {
           this.templateID = templateID;
           this.name = name;
           this.shared = shared;
           this.templatePassword = templatePassword;
           this.templateDescription = templateDescription;
           this.lastModified = lastModified;
           this.pageCount = pageCount;
    }


    /**
     * Gets the templateID value for this EnvelopeTemplateDefinition.
     * 
     * @return templateID
     */
    public java.lang.String getTemplateID() {
        return templateID;
    }


    /**
     * Sets the templateID value for this EnvelopeTemplateDefinition.
     * 
     * @param templateID
     */
    public void setTemplateID(java.lang.String templateID) {
        this.templateID = templateID;
    }


    /**
     * Gets the name value for this EnvelopeTemplateDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this EnvelopeTemplateDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the shared value for this EnvelopeTemplateDefinition.
     * 
     * @return shared
     */
    public boolean isShared() {
        return shared;
    }


    /**
     * Sets the shared value for this EnvelopeTemplateDefinition.
     * 
     * @param shared
     */
    public void setShared(boolean shared) {
        this.shared = shared;
    }


    /**
     * Gets the templatePassword value for this EnvelopeTemplateDefinition.
     * 
     * @return templatePassword
     */
    public java.lang.String getTemplatePassword() {
        return templatePassword;
    }


    /**
     * Sets the templatePassword value for this EnvelopeTemplateDefinition.
     * 
     * @param templatePassword
     */
    public void setTemplatePassword(java.lang.String templatePassword) {
        this.templatePassword = templatePassword;
    }


    /**
     * Gets the templateDescription value for this EnvelopeTemplateDefinition.
     * 
     * @return templateDescription
     */
    public java.lang.String getTemplateDescription() {
        return templateDescription;
    }


    /**
     * Sets the templateDescription value for this EnvelopeTemplateDefinition.
     * 
     * @param templateDescription
     */
    public void setTemplateDescription(java.lang.String templateDescription) {
        this.templateDescription = templateDescription;
    }


    /**
     * Gets the lastModified value for this EnvelopeTemplateDefinition.
     * 
     * @return lastModified
     */
    public java.util.Calendar getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this EnvelopeTemplateDefinition.
     * 
     * @param lastModified
     */
    public void setLastModified(java.util.Calendar lastModified) {
        this.lastModified = lastModified;
    }


    /**
     * Gets the pageCount value for this EnvelopeTemplateDefinition.
     * 
     * @return pageCount
     */
    public java.lang.Integer getPageCount() {
        return pageCount;
    }


    /**
     * Sets the pageCount value for this EnvelopeTemplateDefinition.
     * 
     * @param pageCount
     */
    public void setPageCount(java.lang.Integer pageCount) {
        this.pageCount = pageCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeTemplateDefinition)) return false;
        EnvelopeTemplateDefinition other = (EnvelopeTemplateDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.templateID==null && other.getTemplateID()==null) || 
             (this.templateID!=null &&
              this.templateID.equals(other.getTemplateID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.shared == other.isShared() &&
            ((this.templatePassword==null && other.getTemplatePassword()==null) || 
             (this.templatePassword!=null &&
              this.templatePassword.equals(other.getTemplatePassword()))) &&
            ((this.templateDescription==null && other.getTemplateDescription()==null) || 
             (this.templateDescription!=null &&
              this.templateDescription.equals(other.getTemplateDescription()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              this.lastModified.equals(other.getLastModified()))) &&
            ((this.pageCount==null && other.getPageCount()==null) || 
             (this.pageCount!=null &&
              this.pageCount.equals(other.getPageCount())));
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
        if (getTemplateID() != null) {
            _hashCode += getTemplateID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isShared() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTemplatePassword() != null) {
            _hashCode += getTemplatePassword().hashCode();
        }
        if (getTemplateDescription() != null) {
            _hashCode += getTemplateDescription().hashCode();
        }
        if (getLastModified() != null) {
            _hashCode += getLastModified().hashCode();
        }
        if (getPageCount() != null) {
            _hashCode += getPageCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeTemplateDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplateDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shared");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Shared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templatePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplatePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "LastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
