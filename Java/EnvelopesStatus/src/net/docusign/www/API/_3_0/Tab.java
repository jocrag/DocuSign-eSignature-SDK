/**
 * Tab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class Tab  implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger documentID;

    private org.apache.axis.types.PositiveInteger recipientID;

    private org.apache.axis.types.NonNegativeInteger pageNumber;

    private org.apache.axis.types.NonNegativeInteger XPosition;

    private org.apache.axis.types.NonNegativeInteger YPosition;

    private java.math.BigDecimal scaleValue;

    private net.docusign.www.API._3_0.AnchorTab anchorTabItem;

    private net.docusign.www.API._3_0.TabTypeCode type;

    private java.lang.String name;

    private java.lang.String tabLabel;

    private java.lang.String value;

    private net.docusign.www.API._3_0.CustomTabType customTabType;

    private java.lang.Integer customTabWidth;

    private java.lang.Integer customTabHeight;

    private java.lang.Boolean customTabRequired;

    private java.lang.Boolean customTabLocked;

    private java.lang.Boolean customTabDisableAutoSize;

    private java.lang.String customTabListItems;

    private java.lang.String customTabListValues;

    private java.lang.String customTabListSelectedValue;

    private java.lang.String customTabRadioGroupName;

    private java.lang.String customTabValidationPattern;

    private java.lang.String customTabValidationMessage;

    private java.lang.Boolean templateLocked;

    private java.lang.Boolean templateRequired;

    public Tab() {
    }

    public Tab(
           org.apache.axis.types.PositiveInteger documentID,
           org.apache.axis.types.PositiveInteger recipientID,
           org.apache.axis.types.NonNegativeInteger pageNumber,
           org.apache.axis.types.NonNegativeInteger XPosition,
           org.apache.axis.types.NonNegativeInteger YPosition,
           java.math.BigDecimal scaleValue,
           net.docusign.www.API._3_0.AnchorTab anchorTabItem,
           net.docusign.www.API._3_0.TabTypeCode type,
           java.lang.String name,
           java.lang.String tabLabel,
           java.lang.String value,
           net.docusign.www.API._3_0.CustomTabType customTabType,
           java.lang.Integer customTabWidth,
           java.lang.Integer customTabHeight,
           java.lang.Boolean customTabRequired,
           java.lang.Boolean customTabLocked,
           java.lang.Boolean customTabDisableAutoSize,
           java.lang.String customTabListItems,
           java.lang.String customTabListValues,
           java.lang.String customTabListSelectedValue,
           java.lang.String customTabRadioGroupName,
           java.lang.String customTabValidationPattern,
           java.lang.String customTabValidationMessage,
           java.lang.Boolean templateLocked,
           java.lang.Boolean templateRequired) {
           this.documentID = documentID;
           this.recipientID = recipientID;
           this.pageNumber = pageNumber;
           this.XPosition = XPosition;
           this.YPosition = YPosition;
           this.scaleValue = scaleValue;
           this.anchorTabItem = anchorTabItem;
           this.type = type;
           this.name = name;
           this.tabLabel = tabLabel;
           this.value = value;
           this.customTabType = customTabType;
           this.customTabWidth = customTabWidth;
           this.customTabHeight = customTabHeight;
           this.customTabRequired = customTabRequired;
           this.customTabLocked = customTabLocked;
           this.customTabDisableAutoSize = customTabDisableAutoSize;
           this.customTabListItems = customTabListItems;
           this.customTabListValues = customTabListValues;
           this.customTabListSelectedValue = customTabListSelectedValue;
           this.customTabRadioGroupName = customTabRadioGroupName;
           this.customTabValidationPattern = customTabValidationPattern;
           this.customTabValidationMessage = customTabValidationMessage;
           this.templateLocked = templateLocked;
           this.templateRequired = templateRequired;
    }


    /**
     * Gets the documentID value for this Tab.
     * 
     * @return documentID
     */
    public org.apache.axis.types.PositiveInteger getDocumentID() {
        return documentID;
    }


    /**
     * Sets the documentID value for this Tab.
     * 
     * @param documentID
     */
    public void setDocumentID(org.apache.axis.types.PositiveInteger documentID) {
        this.documentID = documentID;
    }


    /**
     * Gets the recipientID value for this Tab.
     * 
     * @return recipientID
     */
    public org.apache.axis.types.PositiveInteger getRecipientID() {
        return recipientID;
    }


    /**
     * Sets the recipientID value for this Tab.
     * 
     * @param recipientID
     */
    public void setRecipientID(org.apache.axis.types.PositiveInteger recipientID) {
        this.recipientID = recipientID;
    }


    /**
     * Gets the pageNumber value for this Tab.
     * 
     * @return pageNumber
     */
    public org.apache.axis.types.NonNegativeInteger getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this Tab.
     * 
     * @param pageNumber
     */
    public void setPageNumber(org.apache.axis.types.NonNegativeInteger pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the XPosition value for this Tab.
     * 
     * @return XPosition
     */
    public org.apache.axis.types.NonNegativeInteger getXPosition() {
        return XPosition;
    }


    /**
     * Sets the XPosition value for this Tab.
     * 
     * @param XPosition
     */
    public void setXPosition(org.apache.axis.types.NonNegativeInteger XPosition) {
        this.XPosition = XPosition;
    }


    /**
     * Gets the YPosition value for this Tab.
     * 
     * @return YPosition
     */
    public org.apache.axis.types.NonNegativeInteger getYPosition() {
        return YPosition;
    }


    /**
     * Sets the YPosition value for this Tab.
     * 
     * @param YPosition
     */
    public void setYPosition(org.apache.axis.types.NonNegativeInteger YPosition) {
        this.YPosition = YPosition;
    }


    /**
     * Gets the scaleValue value for this Tab.
     * 
     * @return scaleValue
     */
    public java.math.BigDecimal getScaleValue() {
        return scaleValue;
    }


    /**
     * Sets the scaleValue value for this Tab.
     * 
     * @param scaleValue
     */
    public void setScaleValue(java.math.BigDecimal scaleValue) {
        this.scaleValue = scaleValue;
    }


    /**
     * Gets the anchorTabItem value for this Tab.
     * 
     * @return anchorTabItem
     */
    public net.docusign.www.API._3_0.AnchorTab getAnchorTabItem() {
        return anchorTabItem;
    }


    /**
     * Sets the anchorTabItem value for this Tab.
     * 
     * @param anchorTabItem
     */
    public void setAnchorTabItem(net.docusign.www.API._3_0.AnchorTab anchorTabItem) {
        this.anchorTabItem = anchorTabItem;
    }


    /**
     * Gets the type value for this Tab.
     * 
     * @return type
     */
    public net.docusign.www.API._3_0.TabTypeCode getType() {
        return type;
    }


    /**
     * Sets the type value for this Tab.
     * 
     * @param type
     */
    public void setType(net.docusign.www.API._3_0.TabTypeCode type) {
        this.type = type;
    }


    /**
     * Gets the name value for this Tab.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Tab.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the tabLabel value for this Tab.
     * 
     * @return tabLabel
     */
    public java.lang.String getTabLabel() {
        return tabLabel;
    }


    /**
     * Sets the tabLabel value for this Tab.
     * 
     * @param tabLabel
     */
    public void setTabLabel(java.lang.String tabLabel) {
        this.tabLabel = tabLabel;
    }


    /**
     * Gets the value value for this Tab.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Tab.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the customTabType value for this Tab.
     * 
     * @return customTabType
     */
    public net.docusign.www.API._3_0.CustomTabType getCustomTabType() {
        return customTabType;
    }


    /**
     * Sets the customTabType value for this Tab.
     * 
     * @param customTabType
     */
    public void setCustomTabType(net.docusign.www.API._3_0.CustomTabType customTabType) {
        this.customTabType = customTabType;
    }


    /**
     * Gets the customTabWidth value for this Tab.
     * 
     * @return customTabWidth
     */
    public java.lang.Integer getCustomTabWidth() {
        return customTabWidth;
    }


    /**
     * Sets the customTabWidth value for this Tab.
     * 
     * @param customTabWidth
     */
    public void setCustomTabWidth(java.lang.Integer customTabWidth) {
        this.customTabWidth = customTabWidth;
    }


    /**
     * Gets the customTabHeight value for this Tab.
     * 
     * @return customTabHeight
     */
    public java.lang.Integer getCustomTabHeight() {
        return customTabHeight;
    }


    /**
     * Sets the customTabHeight value for this Tab.
     * 
     * @param customTabHeight
     */
    public void setCustomTabHeight(java.lang.Integer customTabHeight) {
        this.customTabHeight = customTabHeight;
    }


    /**
     * Gets the customTabRequired value for this Tab.
     * 
     * @return customTabRequired
     */
    public java.lang.Boolean getCustomTabRequired() {
        return customTabRequired;
    }


    /**
     * Sets the customTabRequired value for this Tab.
     * 
     * @param customTabRequired
     */
    public void setCustomTabRequired(java.lang.Boolean customTabRequired) {
        this.customTabRequired = customTabRequired;
    }


    /**
     * Gets the customTabLocked value for this Tab.
     * 
     * @return customTabLocked
     */
    public java.lang.Boolean getCustomTabLocked() {
        return customTabLocked;
    }


    /**
     * Sets the customTabLocked value for this Tab.
     * 
     * @param customTabLocked
     */
    public void setCustomTabLocked(java.lang.Boolean customTabLocked) {
        this.customTabLocked = customTabLocked;
    }


    /**
     * Gets the customTabDisableAutoSize value for this Tab.
     * 
     * @return customTabDisableAutoSize
     */
    public java.lang.Boolean getCustomTabDisableAutoSize() {
        return customTabDisableAutoSize;
    }


    /**
     * Sets the customTabDisableAutoSize value for this Tab.
     * 
     * @param customTabDisableAutoSize
     */
    public void setCustomTabDisableAutoSize(java.lang.Boolean customTabDisableAutoSize) {
        this.customTabDisableAutoSize = customTabDisableAutoSize;
    }


    /**
     * Gets the customTabListItems value for this Tab.
     * 
     * @return customTabListItems
     */
    public java.lang.String getCustomTabListItems() {
        return customTabListItems;
    }


    /**
     * Sets the customTabListItems value for this Tab.
     * 
     * @param customTabListItems
     */
    public void setCustomTabListItems(java.lang.String customTabListItems) {
        this.customTabListItems = customTabListItems;
    }


    /**
     * Gets the customTabListValues value for this Tab.
     * 
     * @return customTabListValues
     */
    public java.lang.String getCustomTabListValues() {
        return customTabListValues;
    }


    /**
     * Sets the customTabListValues value for this Tab.
     * 
     * @param customTabListValues
     */
    public void setCustomTabListValues(java.lang.String customTabListValues) {
        this.customTabListValues = customTabListValues;
    }


    /**
     * Gets the customTabListSelectedValue value for this Tab.
     * 
     * @return customTabListSelectedValue
     */
    public java.lang.String getCustomTabListSelectedValue() {
        return customTabListSelectedValue;
    }


    /**
     * Sets the customTabListSelectedValue value for this Tab.
     * 
     * @param customTabListSelectedValue
     */
    public void setCustomTabListSelectedValue(java.lang.String customTabListSelectedValue) {
        this.customTabListSelectedValue = customTabListSelectedValue;
    }


    /**
     * Gets the customTabRadioGroupName value for this Tab.
     * 
     * @return customTabRadioGroupName
     */
    public java.lang.String getCustomTabRadioGroupName() {
        return customTabRadioGroupName;
    }


    /**
     * Sets the customTabRadioGroupName value for this Tab.
     * 
     * @param customTabRadioGroupName
     */
    public void setCustomTabRadioGroupName(java.lang.String customTabRadioGroupName) {
        this.customTabRadioGroupName = customTabRadioGroupName;
    }


    /**
     * Gets the customTabValidationPattern value for this Tab.
     * 
     * @return customTabValidationPattern
     */
    public java.lang.String getCustomTabValidationPattern() {
        return customTabValidationPattern;
    }


    /**
     * Sets the customTabValidationPattern value for this Tab.
     * 
     * @param customTabValidationPattern
     */
    public void setCustomTabValidationPattern(java.lang.String customTabValidationPattern) {
        this.customTabValidationPattern = customTabValidationPattern;
    }


    /**
     * Gets the customTabValidationMessage value for this Tab.
     * 
     * @return customTabValidationMessage
     */
    public java.lang.String getCustomTabValidationMessage() {
        return customTabValidationMessage;
    }


    /**
     * Sets the customTabValidationMessage value for this Tab.
     * 
     * @param customTabValidationMessage
     */
    public void setCustomTabValidationMessage(java.lang.String customTabValidationMessage) {
        this.customTabValidationMessage = customTabValidationMessage;
    }


    /**
     * Gets the templateLocked value for this Tab.
     * 
     * @return templateLocked
     */
    public java.lang.Boolean getTemplateLocked() {
        return templateLocked;
    }


    /**
     * Sets the templateLocked value for this Tab.
     * 
     * @param templateLocked
     */
    public void setTemplateLocked(java.lang.Boolean templateLocked) {
        this.templateLocked = templateLocked;
    }


    /**
     * Gets the templateRequired value for this Tab.
     * 
     * @return templateRequired
     */
    public java.lang.Boolean getTemplateRequired() {
        return templateRequired;
    }


    /**
     * Sets the templateRequired value for this Tab.
     * 
     * @param templateRequired
     */
    public void setTemplateRequired(java.lang.Boolean templateRequired) {
        this.templateRequired = templateRequired;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tab)) return false;
        Tab other = (Tab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentID==null && other.getDocumentID()==null) || 
             (this.documentID!=null &&
              this.documentID.equals(other.getDocumentID()))) &&
            ((this.recipientID==null && other.getRecipientID()==null) || 
             (this.recipientID!=null &&
              this.recipientID.equals(other.getRecipientID()))) &&
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
            ((this.XPosition==null && other.getXPosition()==null) || 
             (this.XPosition!=null &&
              this.XPosition.equals(other.getXPosition()))) &&
            ((this.YPosition==null && other.getYPosition()==null) || 
             (this.YPosition!=null &&
              this.YPosition.equals(other.getYPosition()))) &&
            ((this.scaleValue==null && other.getScaleValue()==null) || 
             (this.scaleValue!=null &&
              this.scaleValue.equals(other.getScaleValue()))) &&
            ((this.anchorTabItem==null && other.getAnchorTabItem()==null) || 
             (this.anchorTabItem!=null &&
              this.anchorTabItem.equals(other.getAnchorTabItem()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.tabLabel==null && other.getTabLabel()==null) || 
             (this.tabLabel!=null &&
              this.tabLabel.equals(other.getTabLabel()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.customTabType==null && other.getCustomTabType()==null) || 
             (this.customTabType!=null &&
              this.customTabType.equals(other.getCustomTabType()))) &&
            ((this.customTabWidth==null && other.getCustomTabWidth()==null) || 
             (this.customTabWidth!=null &&
              this.customTabWidth.equals(other.getCustomTabWidth()))) &&
            ((this.customTabHeight==null && other.getCustomTabHeight()==null) || 
             (this.customTabHeight!=null &&
              this.customTabHeight.equals(other.getCustomTabHeight()))) &&
            ((this.customTabRequired==null && other.getCustomTabRequired()==null) || 
             (this.customTabRequired!=null &&
              this.customTabRequired.equals(other.getCustomTabRequired()))) &&
            ((this.customTabLocked==null && other.getCustomTabLocked()==null) || 
             (this.customTabLocked!=null &&
              this.customTabLocked.equals(other.getCustomTabLocked()))) &&
            ((this.customTabDisableAutoSize==null && other.getCustomTabDisableAutoSize()==null) || 
             (this.customTabDisableAutoSize!=null &&
              this.customTabDisableAutoSize.equals(other.getCustomTabDisableAutoSize()))) &&
            ((this.customTabListItems==null && other.getCustomTabListItems()==null) || 
             (this.customTabListItems!=null &&
              this.customTabListItems.equals(other.getCustomTabListItems()))) &&
            ((this.customTabListValues==null && other.getCustomTabListValues()==null) || 
             (this.customTabListValues!=null &&
              this.customTabListValues.equals(other.getCustomTabListValues()))) &&
            ((this.customTabListSelectedValue==null && other.getCustomTabListSelectedValue()==null) || 
             (this.customTabListSelectedValue!=null &&
              this.customTabListSelectedValue.equals(other.getCustomTabListSelectedValue()))) &&
            ((this.customTabRadioGroupName==null && other.getCustomTabRadioGroupName()==null) || 
             (this.customTabRadioGroupName!=null &&
              this.customTabRadioGroupName.equals(other.getCustomTabRadioGroupName()))) &&
            ((this.customTabValidationPattern==null && other.getCustomTabValidationPattern()==null) || 
             (this.customTabValidationPattern!=null &&
              this.customTabValidationPattern.equals(other.getCustomTabValidationPattern()))) &&
            ((this.customTabValidationMessage==null && other.getCustomTabValidationMessage()==null) || 
             (this.customTabValidationMessage!=null &&
              this.customTabValidationMessage.equals(other.getCustomTabValidationMessage()))) &&
            ((this.templateLocked==null && other.getTemplateLocked()==null) || 
             (this.templateLocked!=null &&
              this.templateLocked.equals(other.getTemplateLocked()))) &&
            ((this.templateRequired==null && other.getTemplateRequired()==null) || 
             (this.templateRequired!=null &&
              this.templateRequired.equals(other.getTemplateRequired())));
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
        if (getDocumentID() != null) {
            _hashCode += getDocumentID().hashCode();
        }
        if (getRecipientID() != null) {
            _hashCode += getRecipientID().hashCode();
        }
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        if (getXPosition() != null) {
            _hashCode += getXPosition().hashCode();
        }
        if (getYPosition() != null) {
            _hashCode += getYPosition().hashCode();
        }
        if (getScaleValue() != null) {
            _hashCode += getScaleValue().hashCode();
        }
        if (getAnchorTabItem() != null) {
            _hashCode += getAnchorTabItem().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTabLabel() != null) {
            _hashCode += getTabLabel().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getCustomTabType() != null) {
            _hashCode += getCustomTabType().hashCode();
        }
        if (getCustomTabWidth() != null) {
            _hashCode += getCustomTabWidth().hashCode();
        }
        if (getCustomTabHeight() != null) {
            _hashCode += getCustomTabHeight().hashCode();
        }
        if (getCustomTabRequired() != null) {
            _hashCode += getCustomTabRequired().hashCode();
        }
        if (getCustomTabLocked() != null) {
            _hashCode += getCustomTabLocked().hashCode();
        }
        if (getCustomTabDisableAutoSize() != null) {
            _hashCode += getCustomTabDisableAutoSize().hashCode();
        }
        if (getCustomTabListItems() != null) {
            _hashCode += getCustomTabListItems().hashCode();
        }
        if (getCustomTabListValues() != null) {
            _hashCode += getCustomTabListValues().hashCode();
        }
        if (getCustomTabListSelectedValue() != null) {
            _hashCode += getCustomTabListSelectedValue().hashCode();
        }
        if (getCustomTabRadioGroupName() != null) {
            _hashCode += getCustomTabRadioGroupName().hashCode();
        }
        if (getCustomTabValidationPattern() != null) {
            _hashCode += getCustomTabValidationPattern().hashCode();
        }
        if (getCustomTabValidationMessage() != null) {
            _hashCode += getCustomTabValidationMessage().hashCode();
        }
        if (getTemplateLocked() != null) {
            _hashCode += getTemplateLocked().hashCode();
        }
        if (getTemplateRequired() != null) {
            _hashCode += getTemplateRequired().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Tab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientID"));
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
        elemField.setFieldName("XPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "XPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "YPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
        elemField.setFieldName("anchorTabItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AnchorTabItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AnchorTab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabTypeCode"));
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
        elemField.setFieldName("tabLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabDisableAutoSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabDisableAutoSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabListItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabListItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabListValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabListValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabListSelectedValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabListSelectedValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabRadioGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabRadioGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabValidationPattern");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabValidationPattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTabValidationMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabValidationMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
