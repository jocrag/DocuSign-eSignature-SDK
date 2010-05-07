/**
 * DocumentPDF.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class DocumentPDF  implements java.io.Serializable {
    private java.lang.String name;

    private byte[] PDFBytes;

    private org.apache.axis.types.PositiveInteger documentID;

    private net.docusign.www.API._3_0.DocumentType documentType;

    public DocumentPDF() {
    }

    public DocumentPDF(
           java.lang.String name,
           byte[] PDFBytes,
           org.apache.axis.types.PositiveInteger documentID,
           net.docusign.www.API._3_0.DocumentType documentType) {
           this.name = name;
           this.PDFBytes = PDFBytes;
           this.documentID = documentID;
           this.documentType = documentType;
    }


    /**
     * Gets the name value for this DocumentPDF.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DocumentPDF.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the PDFBytes value for this DocumentPDF.
     * 
     * @return PDFBytes
     */
    public byte[] getPDFBytes() {
        return PDFBytes;
    }


    /**
     * Sets the PDFBytes value for this DocumentPDF.
     * 
     * @param PDFBytes
     */
    public void setPDFBytes(byte[] PDFBytes) {
        this.PDFBytes = PDFBytes;
    }


    /**
     * Gets the documentID value for this DocumentPDF.
     * 
     * @return documentID
     */
    public org.apache.axis.types.PositiveInteger getDocumentID() {
        return documentID;
    }


    /**
     * Sets the documentID value for this DocumentPDF.
     * 
     * @param documentID
     */
    public void setDocumentID(org.apache.axis.types.PositiveInteger documentID) {
        this.documentID = documentID;
    }


    /**
     * Gets the documentType value for this DocumentPDF.
     * 
     * @return documentType
     */
    public net.docusign.www.API._3_0.DocumentType getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this DocumentPDF.
     * 
     * @param documentType
     */
    public void setDocumentType(net.docusign.www.API._3_0.DocumentType documentType) {
        this.documentType = documentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentPDF)) return false;
        DocumentPDF other = (DocumentPDF) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.PDFBytes==null && other.getPDFBytes()==null) || 
             (this.PDFBytes!=null &&
              java.util.Arrays.equals(this.PDFBytes, other.getPDFBytes()))) &&
            ((this.documentID==null && other.getDocumentID()==null) || 
             (this.documentID!=null &&
              this.documentID.equals(other.getDocumentID()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPDFBytes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPDFBytes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPDFBytes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentID() != null) {
            _hashCode += getDocumentID().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentPDF.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDFBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentType"));
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
