/**
 * TemplateReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class TemplateReference  implements java.io.Serializable {
    private net.docusign.www.API._3_0.TemplateLocationCode templateLocation;

    private java.lang.String template;

    private net.docusign.www.API._3_0.Document document;

    private net.docusign.www.API._3_0.TemplateReferenceRoleAssignment[] roleAssignments;

    private net.docusign.www.API._3_0.TemplateReferenceFieldData fieldData;

    private net.docusign.www.API._3_0.Tab[] additionalTabs;

    private org.apache.axis.types.PositiveInteger sequence;

    private net.docusign.www.API._3_0.Attachment[] templateAttachments;

    public TemplateReference() {
    }

    public TemplateReference(
           net.docusign.www.API._3_0.TemplateLocationCode templateLocation,
           java.lang.String template,
           net.docusign.www.API._3_0.Document document,
           net.docusign.www.API._3_0.TemplateReferenceRoleAssignment[] roleAssignments,
           net.docusign.www.API._3_0.TemplateReferenceFieldData fieldData,
           net.docusign.www.API._3_0.Tab[] additionalTabs,
           org.apache.axis.types.PositiveInteger sequence,
           net.docusign.www.API._3_0.Attachment[] templateAttachments) {
           this.templateLocation = templateLocation;
           this.template = template;
           this.document = document;
           this.roleAssignments = roleAssignments;
           this.fieldData = fieldData;
           this.additionalTabs = additionalTabs;
           this.sequence = sequence;
           this.templateAttachments = templateAttachments;
    }


    /**
     * Gets the templateLocation value for this TemplateReference.
     * 
     * @return templateLocation
     */
    public net.docusign.www.API._3_0.TemplateLocationCode getTemplateLocation() {
        return templateLocation;
    }


    /**
     * Sets the templateLocation value for this TemplateReference.
     * 
     * @param templateLocation
     */
    public void setTemplateLocation(net.docusign.www.API._3_0.TemplateLocationCode templateLocation) {
        this.templateLocation = templateLocation;
    }


    /**
     * Gets the template value for this TemplateReference.
     * 
     * @return template
     */
    public java.lang.String getTemplate() {
        return template;
    }


    /**
     * Sets the template value for this TemplateReference.
     * 
     * @param template
     */
    public void setTemplate(java.lang.String template) {
        this.template = template;
    }


    /**
     * Gets the document value for this TemplateReference.
     * 
     * @return document
     */
    public net.docusign.www.API._3_0.Document getDocument() {
        return document;
    }


    /**
     * Sets the document value for this TemplateReference.
     * 
     * @param document
     */
    public void setDocument(net.docusign.www.API._3_0.Document document) {
        this.document = document;
    }


    /**
     * Gets the roleAssignments value for this TemplateReference.
     * 
     * @return roleAssignments
     */
    public net.docusign.www.API._3_0.TemplateReferenceRoleAssignment[] getRoleAssignments() {
        return roleAssignments;
    }


    /**
     * Sets the roleAssignments value for this TemplateReference.
     * 
     * @param roleAssignments
     */
    public void setRoleAssignments(net.docusign.www.API._3_0.TemplateReferenceRoleAssignment[] roleAssignments) {
        this.roleAssignments = roleAssignments;
    }


    /**
     * Gets the fieldData value for this TemplateReference.
     * 
     * @return fieldData
     */
    public net.docusign.www.API._3_0.TemplateReferenceFieldData getFieldData() {
        return fieldData;
    }


    /**
     * Sets the fieldData value for this TemplateReference.
     * 
     * @param fieldData
     */
    public void setFieldData(net.docusign.www.API._3_0.TemplateReferenceFieldData fieldData) {
        this.fieldData = fieldData;
    }


    /**
     * Gets the additionalTabs value for this TemplateReference.
     * 
     * @return additionalTabs
     */
    public net.docusign.www.API._3_0.Tab[] getAdditionalTabs() {
        return additionalTabs;
    }


    /**
     * Sets the additionalTabs value for this TemplateReference.
     * 
     * @param additionalTabs
     */
    public void setAdditionalTabs(net.docusign.www.API._3_0.Tab[] additionalTabs) {
        this.additionalTabs = additionalTabs;
    }


    /**
     * Gets the sequence value for this TemplateReference.
     * 
     * @return sequence
     */
    public org.apache.axis.types.PositiveInteger getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this TemplateReference.
     * 
     * @param sequence
     */
    public void setSequence(org.apache.axis.types.PositiveInteger sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the templateAttachments value for this TemplateReference.
     * 
     * @return templateAttachments
     */
    public net.docusign.www.API._3_0.Attachment[] getTemplateAttachments() {
        return templateAttachments;
    }


    /**
     * Sets the templateAttachments value for this TemplateReference.
     * 
     * @param templateAttachments
     */
    public void setTemplateAttachments(net.docusign.www.API._3_0.Attachment[] templateAttachments) {
        this.templateAttachments = templateAttachments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemplateReference)) return false;
        TemplateReference other = (TemplateReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.templateLocation==null && other.getTemplateLocation()==null) || 
             (this.templateLocation!=null &&
              this.templateLocation.equals(other.getTemplateLocation()))) &&
            ((this.template==null && other.getTemplate()==null) || 
             (this.template!=null &&
              this.template.equals(other.getTemplate()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              this.document.equals(other.getDocument()))) &&
            ((this.roleAssignments==null && other.getRoleAssignments()==null) || 
             (this.roleAssignments!=null &&
              java.util.Arrays.equals(this.roleAssignments, other.getRoleAssignments()))) &&
            ((this.fieldData==null && other.getFieldData()==null) || 
             (this.fieldData!=null &&
              this.fieldData.equals(other.getFieldData()))) &&
            ((this.additionalTabs==null && other.getAdditionalTabs()==null) || 
             (this.additionalTabs!=null &&
              java.util.Arrays.equals(this.additionalTabs, other.getAdditionalTabs()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.templateAttachments==null && other.getTemplateAttachments()==null) || 
             (this.templateAttachments!=null &&
              java.util.Arrays.equals(this.templateAttachments, other.getTemplateAttachments())));
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
        if (getTemplateLocation() != null) {
            _hashCode += getTemplateLocation().hashCode();
        }
        if (getTemplate() != null) {
            _hashCode += getTemplate().hashCode();
        }
        if (getDocument() != null) {
            _hashCode += getDocument().hashCode();
        }
        if (getRoleAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoleAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoleAssignments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldData() != null) {
            _hashCode += getFieldData().hashCode();
        }
        if (getAdditionalTabs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalTabs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalTabs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getTemplateAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemplateAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemplateAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TemplateReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateLocationCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Template"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Document"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoleAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReferenceRoleAssignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoleAssignment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FieldData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReferenceFieldData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalTabs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AdditionalTabs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Tab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Tab"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment"));
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
