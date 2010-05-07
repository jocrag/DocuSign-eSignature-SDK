/**
 * FilteredEnvelopeStatuses.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class FilteredEnvelopeStatuses  implements java.io.Serializable {
    private int resultSetSize;

    private net.docusign.www.API._3_0.EnvelopeStatusFilter envelopeStatusFilter;

    private net.docusign.www.API._3_0.EnvelopeStatus[] envelopeStatuses;

    public FilteredEnvelopeStatuses() {
    }

    public FilteredEnvelopeStatuses(
           int resultSetSize,
           net.docusign.www.API._3_0.EnvelopeStatusFilter envelopeStatusFilter,
           net.docusign.www.API._3_0.EnvelopeStatus[] envelopeStatuses) {
           this.resultSetSize = resultSetSize;
           this.envelopeStatusFilter = envelopeStatusFilter;
           this.envelopeStatuses = envelopeStatuses;
    }


    /**
     * Gets the resultSetSize value for this FilteredEnvelopeStatuses.
     * 
     * @return resultSetSize
     */
    public int getResultSetSize() {
        return resultSetSize;
    }


    /**
     * Sets the resultSetSize value for this FilteredEnvelopeStatuses.
     * 
     * @param resultSetSize
     */
    public void setResultSetSize(int resultSetSize) {
        this.resultSetSize = resultSetSize;
    }


    /**
     * Gets the envelopeStatusFilter value for this FilteredEnvelopeStatuses.
     * 
     * @return envelopeStatusFilter
     */
    public net.docusign.www.API._3_0.EnvelopeStatusFilter getEnvelopeStatusFilter() {
        return envelopeStatusFilter;
    }


    /**
     * Sets the envelopeStatusFilter value for this FilteredEnvelopeStatuses.
     * 
     * @param envelopeStatusFilter
     */
    public void setEnvelopeStatusFilter(net.docusign.www.API._3_0.EnvelopeStatusFilter envelopeStatusFilter) {
        this.envelopeStatusFilter = envelopeStatusFilter;
    }


    /**
     * Gets the envelopeStatuses value for this FilteredEnvelopeStatuses.
     * 
     * @return envelopeStatuses
     */
    public net.docusign.www.API._3_0.EnvelopeStatus[] getEnvelopeStatuses() {
        return envelopeStatuses;
    }


    /**
     * Sets the envelopeStatuses value for this FilteredEnvelopeStatuses.
     * 
     * @param envelopeStatuses
     */
    public void setEnvelopeStatuses(net.docusign.www.API._3_0.EnvelopeStatus[] envelopeStatuses) {
        this.envelopeStatuses = envelopeStatuses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilteredEnvelopeStatuses)) return false;
        FilteredEnvelopeStatuses other = (FilteredEnvelopeStatuses) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.resultSetSize == other.getResultSetSize() &&
            ((this.envelopeStatusFilter==null && other.getEnvelopeStatusFilter()==null) || 
             (this.envelopeStatusFilter!=null &&
              this.envelopeStatusFilter.equals(other.getEnvelopeStatusFilter()))) &&
            ((this.envelopeStatuses==null && other.getEnvelopeStatuses()==null) || 
             (this.envelopeStatuses!=null &&
              java.util.Arrays.equals(this.envelopeStatuses, other.getEnvelopeStatuses())));
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
        _hashCode += getResultSetSize();
        if (getEnvelopeStatusFilter() != null) {
            _hashCode += getEnvelopeStatusFilter().hashCode();
        }
        if (getEnvelopeStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvelopeStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvelopeStatuses(), i);
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
        new org.apache.axis.description.TypeDesc(FilteredEnvelopeStatuses.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FilteredEnvelopeStatuses"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultSetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ResultSetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeStatusFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
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
