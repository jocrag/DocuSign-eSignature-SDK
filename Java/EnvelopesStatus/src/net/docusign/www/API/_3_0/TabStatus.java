/*
Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended for production use.
Code and policy for a production application must be developed to meet the specific data and
security requirements of the application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED
OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR
FITNESS FOR A PARTICULAR PURPOSE.
*/

/**
 * TabStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class TabStatus  implements java.io.Serializable {
    private net.docusign.www.API._3_0.TabTypeCode tabType;

    private java.lang.String status;

    private double XPosition;

    private double YPosition;

    private java.util.Calendar signed;

    private java.lang.String tabLabel;

    private java.lang.String tabName;

    private java.lang.String tabValue;

    private org.apache.axis.types.PositiveInteger documentID;

    private org.apache.axis.types.NonNegativeInteger pageNumber;

    private java.lang.String originalValue;

    private java.lang.String validationPattern;

    private java.lang.String roleName;

    private java.lang.String listValues;

    private java.lang.String listSelectedValue;

    private java.math.BigDecimal scaleValue;

    private java.lang.String customTabType;

    public TabStatus() {
    }

    public TabStatus(
           net.docusign.www.API._3_0.TabTypeCode tabType,
           java.lang.String status,
           double XPosition,
           double YPosition,
           java.util.Calendar signed,
           java.lang.String tabLabel,
           java.lang.String tabName,
           java.lang.String tabValue,
           org.apache.axis.types.PositiveInteger documentID,
           org.apache.axis.types.NonNegativeInteger pageNumber,
           java.lang.String originalValue,
           java.lang.String validationPattern,
           java.lang.String roleName,
           java.lang.String listValues,
           java.lang.String listSelectedValue,
           java.math.BigDecimal scaleValue,
           java.lang.String customTabType) {
           this.tabType = tabType;
           this.status = status;
           this.XPosition = XPosition;
           this.YPosition = YPosition;
           this.signed = signed;
           this.tabLabel = tabLabel;
           this.tabName = tabName;
           this.tabValue = tabValue;
           this.documentID = documentID;
           this.pageNumber = pageNumber;
           this.originalValue = originalValue;
           this.validationPattern = validationPattern;
           this.roleName = roleName;
           this.listValues = listValues;
           this.listSelectedValue = listSelectedValue;
           this.scaleValue = scaleValue;
           this.customTabType = customTabType;
    }


    /**
     * Gets the tabType value for this TabStatus.
     * 
     * @return tabType
     */
    public net.docusign.www.API._3_0.TabTypeCode getTabType() {
        return tabType;
    }


    /**
     * Sets the tabType value for this TabStatus.
     * 
     * @param tabType
     */
    public void setTabType(net.docusign.www.API._3_0.TabTypeCode tabType) {
        this.tabType = tabType;
    }


    /**
     * Gets the status value for this TabStatus.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TabStatus.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the XPosition value for this TabStatus.
     * 
     * @return XPosition
     */
    public double getXPosition() {
        return XPosition;
    }


    /**
     * Sets the XPosition value for this TabStatus.
     * 
     * @param XPosition
     */
    public void setXPosition(double XPosition) {
        this.XPosition = XPosition;
    }


    /**
     * Gets the YPosition value for this TabStatus.
     * 
     * @return YPosition
     */
    public double getYPosition() {
        return YPosition;
    }


    /**
     * Sets the YPosition value for this TabStatus.
     * 
     * @param YPosition
     */
    public void setYPosition(double YPosition) {
        this.YPosition = YPosition;
    }


    /**
     * Gets the signed value for this TabStatus.
     * 
     * @return signed
     */
    public java.util.Calendar getSigned() {
        return signed;
    }


    /**
     * Sets the signed value for this TabStatus.
     * 
     * @param signed
     */
    public void setSigned(java.util.Calendar signed) {
        this.signed = signed;
    }


    /**
     * Gets the tabLabel value for this TabStatus.
     * 
     * @return tabLabel
     */
    public java.lang.String getTabLabel() {
        return tabLabel;
    }


    /**
     * Sets the tabLabel value for this TabStatus.
     * 
     * @param tabLabel
     */
    public void setTabLabel(java.lang.String tabLabel) {
        this.tabLabel = tabLabel;
    }


    /**
     * Gets the tabName value for this TabStatus.
     * 
     * @return tabName
     */
    public java.lang.String getTabName() {
        return tabName;
    }


    /**
     * Sets the tabName value for this TabStatus.
     * 
     * @param tabName
     */
    public void setTabName(java.lang.String tabName) {
        this.tabName = tabName;
    }


    /**
     * Gets the tabValue value for this TabStatus.
     * 
     * @return tabValue
     */
    public java.lang.String getTabValue() {
        return tabValue;
    }


    /**
     * Sets the tabValue value for this TabStatus.
     * 
     * @param tabValue
     */
    public void setTabValue(java.lang.String tabValue) {
        this.tabValue = tabValue;
    }


    /**
     * Gets the documentID value for this TabStatus.
     * 
     * @return documentID
     */
    public org.apache.axis.types.PositiveInteger getDocumentID() {
        return documentID;
    }


    /**
     * Sets the documentID value for this TabStatus.
     * 
     * @param documentID
     */
    public void setDocumentID(org.apache.axis.types.PositiveInteger documentID) {
        this.documentID = documentID;
    }


    /**
     * Gets the pageNumber value for this TabStatus.
     * 
     * @return pageNumber
     */
    public org.apache.axis.types.NonNegativeInteger getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this TabStatus.
     * 
     * @param pageNumber
     */
    public void setPageNumber(org.apache.axis.types.NonNegativeInteger pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the originalValue value for this TabStatus.
     * 
     * @return originalValue
     */
    public java.lang.String getOriginalValue() {
        return originalValue;
    }


    /**
     * Sets the originalValue value for this TabStatus.
     * 
     * @param originalValue
     */
    public void setOriginalValue(java.lang.String originalValue) {
        this.originalValue = originalValue;
    }


    /**
     * Gets the validationPattern value for this TabStatus.
     * 
     * @return validationPattern
     */
    public java.lang.String getValidationPattern() {
        return validationPattern;
    }


    /**
     * Sets the validationPattern value for this TabStatus.
     * 
     * @param validationPattern
     */
    public void setValidationPattern(java.lang.String validationPattern) {
        this.validationPattern = validationPattern;
    }


    /**
     * Gets the roleName value for this TabStatus.
     * 
     * @return roleName
     */
    public java.lang.String getRoleName() {
        return roleName;
    }


    /**
     * Sets the roleName value for this TabStatus.
     * 
     * @param roleName
     */
    public void setRoleName(java.lang.String roleName) {
        this.roleName = roleName;
    }


    /**
     * Gets the listValues value for this TabStatus.
     * 
     * @return listValues
     */
    public java.lang.String getListValues() {
        return listValues;
    }


    /**
     * Sets the listValues value for this TabStatus.
     * 
     * @param listValues
     */
    public void setListValues(java.lang.String listValues) {
        this.listValues = listValues;
    }


    /**
     * Gets the listSelectedValue value for this TabStatus.
     * 
     * @return listSelectedValue
     */
    public java.lang.String getListSelectedValue() {
        return listSelectedValue;
    }


    /**
     * Sets the listSelectedValue value for this TabStatus.
     * 
     * @param listSelectedValue
     */
    public void setListSelectedValue(java.lang.String listSelectedValue) {
        this.listSelectedValue = listSelectedValue;
    }


    /**
     * Gets the scaleValue value for this TabStatus.
     * 
     * @return scaleValue
     */
    public java.math.BigDecimal getScaleValue() {
        return scaleValue;
    }


    /**
     * Sets the scaleValue value for this TabStatus.
     * 
     * @param scaleValue
     */
    public void setScaleValue(java.math.BigDecimal scaleValue) {
        this.scaleValue = scaleValue;
    }


    /**
     * Gets the customTabType value for this TabStatus.
     * 
     * @return customTabType
     */
    public java.lang.String getCustomTabType() {
        return customTabType;
    }


    /**
     * Sets the customTabType value for this TabStatus.
     * 
     * @param customTabType
     */
    public void setCustomTabType(java.lang.String customTabType) {
        this.customTabType = customTabType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TabStatus)) return false;
        TabStatus other = (TabStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tabType==null && other.getTabType()==null) || 
             (this.tabType!=null &&
              this.tabType.equals(other.getTabType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.XPosition == other.getXPosition() &&
            this.YPosition == other.getYPosition() &&
            ((this.signed==null && other.getSigned()==null) || 
             (this.signed!=null &&
              this.signed.equals(other.getSigned()))) &&
            ((this.tabLabel==null && other.getTabLabel()==null) || 
             (this.tabLabel!=null &&
              this.tabLabel.equals(other.getTabLabel()))) &&
            ((this.tabName==null && other.getTabName()==null) || 
             (this.tabName!=null &&
              this.tabName.equals(other.getTabName()))) &&
            ((this.tabValue==null && other.getTabValue()==null) || 
             (this.tabValue!=null &&
              this.tabValue.equals(other.getTabValue()))) &&
            ((this.documentID==null && other.getDocumentID()==null) || 
             (this.documentID!=null &&
              this.documentID.equals(other.getDocumentID()))) &&
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
            ((this.originalValue==null && other.getOriginalValue()==null) || 
             (this.originalValue!=null &&
              this.originalValue.equals(other.getOriginalValue()))) &&
            ((this.validationPattern==null && other.getValidationPattern()==null) || 
             (this.validationPattern!=null &&
              this.validationPattern.equals(other.getValidationPattern()))) &&
            ((this.roleName==null && other.getRoleName()==null) || 
             (this.roleName!=null &&
              this.roleName.equals(other.getRoleName()))) &&
            ((this.listValues==null && other.getListValues()==null) || 
             (this.listValues!=null &&
              this.listValues.equals(other.getListValues()))) &&
            ((this.listSelectedValue==null && other.getListSelectedValue()==null) || 
             (this.listSelectedValue!=null &&
              this.listSelectedValue.equals(other.getListSelectedValue()))) &&
            ((this.scaleValue==null && other.getScaleValue()==null) || 
             (this.scaleValue!=null &&
              this.scaleValue.equals(other.getScaleValue()))) &&
            ((this.customTabType==null && other.getCustomTabType()==null) || 
             (this.customTabType!=null &&
              this.customTabType.equals(other.getCustomTabType())));
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
        if (getTabType() != null) {
            _hashCode += getTabType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += new Double(getXPosition()).hashCode();
        _hashCode += new Double(getYPosition()).hashCode();
        if (getSigned() != null) {
            _hashCode += getSigned().hashCode();
        }
        if (getTabLabel() != null) {
            _hashCode += getTabLabel().hashCode();
        }
        if (getTabName() != null) {
            _hashCode += getTabName().hashCode();
        }
        if (getTabValue() != null) {
            _hashCode += getTabValue().hashCode();
        }
        if (getDocumentID() != null) {
            _hashCode += getDocumentID().hashCode();
        }
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        if (getOriginalValue() != null) {
            _hashCode += getOriginalValue().hashCode();
        }
        if (getValidationPattern() != null) {
            _hashCode += getValidationPattern().hashCode();
        }
        if (getRoleName() != null) {
            _hashCode += getRoleName().hashCode();
        }
        if (getListValues() != null) {
            _hashCode += getListValues().hashCode();
        }
        if (getListSelectedValue() != null) {
            _hashCode += getListSelectedValue().hashCode();
        }
        if (getScaleValue() != null) {
            _hashCode += getScaleValue().hashCode();
        }
        if (getCustomTabType() != null) {
            _hashCode += getCustomTabType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TabStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabTypeCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "XPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "YPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Signed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OriginalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationPattern");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ValidationPattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ListValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listSelectedValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ListSelectedValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scaleValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ScaleValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabType"));
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
