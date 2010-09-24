/**
 * FolderResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class FolderResults  implements java.io.Serializable {
    private int resultSetSize;

    private int startPosition;

    private int endPosition;

    private net.docusign.www.API._3_0.FolderType folderType;

    private net.docusign.www.API._3_0.FolderItem[] folderItems;

    public FolderResults() {
    }

    public FolderResults(
           int resultSetSize,
           int startPosition,
           int endPosition,
           net.docusign.www.API._3_0.FolderType folderType,
           net.docusign.www.API._3_0.FolderItem[] folderItems) {
           this.resultSetSize = resultSetSize;
           this.startPosition = startPosition;
           this.endPosition = endPosition;
           this.folderType = folderType;
           this.folderItems = folderItems;
    }


    /**
     * Gets the resultSetSize value for this FolderResults.
     * 
     * @return resultSetSize
     */
    public int getResultSetSize() {
        return resultSetSize;
    }


    /**
     * Sets the resultSetSize value for this FolderResults.
     * 
     * @param resultSetSize
     */
    public void setResultSetSize(int resultSetSize) {
        this.resultSetSize = resultSetSize;
    }


    /**
     * Gets the startPosition value for this FolderResults.
     * 
     * @return startPosition
     */
    public int getStartPosition() {
        return startPosition;
    }


    /**
     * Sets the startPosition value for this FolderResults.
     * 
     * @param startPosition
     */
    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }


    /**
     * Gets the endPosition value for this FolderResults.
     * 
     * @return endPosition
     */
    public int getEndPosition() {
        return endPosition;
    }


    /**
     * Sets the endPosition value for this FolderResults.
     * 
     * @param endPosition
     */
    public void setEndPosition(int endPosition) {
        this.endPosition = endPosition;
    }


    /**
     * Gets the folderType value for this FolderResults.
     * 
     * @return folderType
     */
    public net.docusign.www.API._3_0.FolderType getFolderType() {
        return folderType;
    }


    /**
     * Sets the folderType value for this FolderResults.
     * 
     * @param folderType
     */
    public void setFolderType(net.docusign.www.API._3_0.FolderType folderType) {
        this.folderType = folderType;
    }


    /**
     * Gets the folderItems value for this FolderResults.
     * 
     * @return folderItems
     */
    public net.docusign.www.API._3_0.FolderItem[] getFolderItems() {
        return folderItems;
    }


    /**
     * Sets the folderItems value for this FolderResults.
     * 
     * @param folderItems
     */
    public void setFolderItems(net.docusign.www.API._3_0.FolderItem[] folderItems) {
        this.folderItems = folderItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FolderResults)) return false;
        FolderResults other = (FolderResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.resultSetSize == other.getResultSetSize() &&
            this.startPosition == other.getStartPosition() &&
            this.endPosition == other.getEndPosition() &&
            ((this.folderType==null && other.getFolderType()==null) || 
             (this.folderType!=null &&
              this.folderType.equals(other.getFolderType()))) &&
            ((this.folderItems==null && other.getFolderItems()==null) || 
             (this.folderItems!=null &&
              java.util.Arrays.equals(this.folderItems, other.getFolderItems())));
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
        _hashCode += getStartPosition();
        _hashCode += getEndPosition();
        if (getFolderType() != null) {
            _hashCode += getFolderType().hashCode();
        }
        if (getFolderItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFolderItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFolderItems(), i);
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
        new org.apache.axis.description.TypeDesc(FolderResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultSetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ResultSetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "StartPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EndPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderItem"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderItem"));
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
