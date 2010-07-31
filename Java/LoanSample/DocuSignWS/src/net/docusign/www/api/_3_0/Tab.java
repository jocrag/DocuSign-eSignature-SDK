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
package net.docusign.www.api._3_0;

/**
 * Tab bean class
 */

public class Tab implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had name = Tab
     * Namespace URI = http://www.docusign.net/API/3.0 Namespace Prefix = ns1
     */

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.docusign.net/API/3.0")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * field for DocumentID
     */

    protected org.apache.axis2.databinding.types.PositiveInteger localDocumentID;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localDocumentIDTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return org.apache.axis2.databinding.types.PositiveInteger
     */
    public org.apache.axis2.databinding.types.PositiveInteger getDocumentID() {
        return localDocumentID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            DocumentID
     */
    public void setDocumentID(org.apache.axis2.databinding.types.PositiveInteger param) {

        if (param != null) {
            // update the setting tracker
            localDocumentIDTracker = true;
        } else {
            localDocumentIDTracker = false;

        }

        this.localDocumentID = param;

    }

    /**
     * field for RecipientID
     */

    protected org.apache.axis2.databinding.types.PositiveInteger localRecipientID;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRecipientIDTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return org.apache.axis2.databinding.types.PositiveInteger
     */
    public org.apache.axis2.databinding.types.PositiveInteger getRecipientID() {
        return localRecipientID;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            RecipientID
     */
    public void setRecipientID(org.apache.axis2.databinding.types.PositiveInteger param) {

        if (param != null) {
            // update the setting tracker
            localRecipientIDTracker = true;
        } else {
            localRecipientIDTracker = false;

        }

        this.localRecipientID = param;

    }

    /**
     * field for PageNumber
     */

    protected org.apache.axis2.databinding.types.NonNegativeInteger localPageNumber;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localPageNumberTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getPageNumber() {
        return localPageNumber;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            PageNumber
     */
    public void setPageNumber(org.apache.axis2.databinding.types.NonNegativeInteger param) {

        if (param != null) {
            // update the setting tracker
            localPageNumberTracker = true;
        } else {
            localPageNumberTracker = false;

        }

        this.localPageNumber = param;

    }

    /**
     * field for XPosition
     */

    protected org.apache.axis2.databinding.types.NonNegativeInteger localXPosition;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localXPositionTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getXPosition() {
        return localXPosition;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            XPosition
     */
    public void setXPosition(org.apache.axis2.databinding.types.NonNegativeInteger param) {

        if (param != null) {
            // update the setting tracker
            localXPositionTracker = true;
        } else {
            localXPositionTracker = false;

        }

        this.localXPosition = param;

    }

    /**
     * field for YPosition
     */

    protected org.apache.axis2.databinding.types.NonNegativeInteger localYPosition;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localYPositionTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return org.apache.axis2.databinding.types.NonNegativeInteger
     */
    public org.apache.axis2.databinding.types.NonNegativeInteger getYPosition() {
        return localYPosition;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            YPosition
     */
    public void setYPosition(org.apache.axis2.databinding.types.NonNegativeInteger param) {

        if (param != null) {
            // update the setting tracker
            localYPositionTracker = true;
        } else {
            localYPositionTracker = false;

        }

        this.localYPosition = param;

    }

    /**
     * field for ScaleValue
     */

    protected java.math.BigDecimal localScaleValue;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localScaleValueTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getScaleValue() {
        return localScaleValue;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ScaleValue
     */
    public void setScaleValue(java.math.BigDecimal param) {

        if (param != null) {
            // update the setting tracker
            localScaleValueTracker = true;
        } else {
            localScaleValueTracker = false;

        }

        this.localScaleValue = param;

    }

    /**
     * field for AnchorTabItem
     */

    protected net.docusign.www.api._3_0.AnchorTab localAnchorTabItem;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localAnchorTabItemTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.AnchorTab
     */
    public net.docusign.www.api._3_0.AnchorTab getAnchorTabItem() {
        return localAnchorTabItem;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            AnchorTabItem
     */
    public void setAnchorTabItem(net.docusign.www.api._3_0.AnchorTab param) {

        if (param != null) {
            // update the setting tracker
            localAnchorTabItemTracker = true;
        } else {
            localAnchorTabItemTracker = false;

        }

        this.localAnchorTabItem = param;

    }

    /**
     * field for Type
     */

    protected net.docusign.www.api._3_0.TabTypeCode localType;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.TabTypeCode
     */
    public net.docusign.www.api._3_0.TabTypeCode getType() {
        return localType;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Type
     */
    public void setType(net.docusign.www.api._3_0.TabTypeCode param) {

        this.localType = param;

    }

    /**
     * field for Name
     */

    protected java.lang.String localName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localNameTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Name
     */
    public void setName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localNameTracker = true;
        } else {
            localNameTracker = false;

        }

        this.localName = param;

    }

    /**
     * field for TabLabel
     */

    protected java.lang.String localTabLabel;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTabLabelTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getTabLabel() {
        return localTabLabel;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TabLabel
     */
    public void setTabLabel(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localTabLabelTracker = true;
        } else {
            localTabLabelTracker = false;

        }

        this.localTabLabel = param;

    }

    /**
     * field for Value
     */

    protected java.lang.String localValue;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localValueTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getValue() {
        return localValue;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            Value
     */
    public void setValue(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localValueTracker = true;
        } else {
            localValueTracker = false;

        }

        this.localValue = param;

    }

    /**
     * field for CustomTabType
     */

    protected net.docusign.www.api._3_0.CustomTabType localCustomTabType;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomTabTypeTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return net.docusign.www.api._3_0.CustomTabType
     */
    public net.docusign.www.api._3_0.CustomTabType getCustomTabType() {
        return localCustomTabType;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomTabType
     */
    public void setCustomTabType(net.docusign.www.api._3_0.CustomTabType param) {

        if (param != null) {
            // update the setting tracker
            localCustomTabTypeTracker = true;
        } else {
            localCustomTabTypeTracker = false;

        }

        this.localCustomTabType = param;

    }

    /**
     * field for CustomTabWidth
     */

    protected int localCustomTabWidth;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomTabWidthTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getCustomTabWidth() {
        return localCustomTabWidth;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomTabWidth
     */
    public void setCustomTabWidth(int param) {

        // setting primitive attribute tracker to true

        if (param == java.lang.Integer.MIN_VALUE) {
            localCustomTabWidthTracker = false;

        } else {
            localCustomTabWidthTracker = true;
        }

        this.localCustomTabWidth = param;

    }

    /**
     * field for CustomTabHeight
     */

    protected int localCustomTabHeight;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomTabHeightTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return int
     */
    public int getCustomTabHeight() {
        return localCustomTabHeight;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomTabHeight
     */
    public void setCustomTabHeight(int param) {

        // setting primitive attribute tracker to true

        if (param == java.lang.Integer.MIN_VALUE) {
            localCustomTabHeightTracker = false;

        } else {
            localCustomTabHeightTracker = true;
        }

        this.localCustomTabHeight = param;

    }

    /**
     * field for CustomTabRequired
     */

    protected boolean localCustomTabRequired;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomTabRequiredTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getCustomTabRequired() {
        return localCustomTabRequired;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomTabRequired
     */
    public void setCustomTabRequired(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localCustomTabRequiredTracker = false;

        } else {
            localCustomTabRequiredTracker = true;
        }

        this.localCustomTabRequired = param;

    }

    /**
     * field for CustomTabLocked
     */

    protected boolean localCustomTabLocked;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomTabLockedTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getCustomTabLocked() {
        return localCustomTabLocked;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomTabLocked
     */
    public void setCustomTabLocked(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localCustomTabLockedTracker = false;

        } else {
            localCustomTabLockedTracker = true;
        }

        this.localCustomTabLocked = param;

    }

    /**
     * field for CustomTabDisableAutoSize
     */

    protected boolean localCustomTabDisableAutoSize;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomTabDisableAutoSizeTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getCustomTabDisableAutoSize() {
        return localCustomTabDisableAutoSize;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomTabDisableAutoSize
     */
    public void setCustomTabDisableAutoSize(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localCustomTabDisableAutoSizeTracker = false;

        } else {
            localCustomTabDisableAutoSizeTracker = true;
        }

        this.localCustomTabDisableAutoSize = param;

    }

    /**
     * field for CustomTabListItems
     */

    protected java.lang.String localCustomTabListItems;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomTabListItemsTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getCustomTabListItems() {
        return localCustomTabListItems;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomTabListItems
     */
    public void setCustomTabListItems(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localCustomTabListItemsTracker = true;
        } else {
            localCustomTabListItemsTracker = false;

        }

        this.localCustomTabListItems = param;

    }

    /**
     * field for CustomTabListValues
     */

    protected java.lang.String localCustomTabListValues;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomTabListValuesTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getCustomTabListValues() {
        return localCustomTabListValues;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomTabListValues
     */
    public void setCustomTabListValues(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localCustomTabListValuesTracker = true;
        } else {
            localCustomTabListValuesTracker = false;

        }

        this.localCustomTabListValues = param;

    }

    /**
     * field for CustomTabListSelectedValue
     */

    protected java.lang.String localCustomTabListSelectedValue;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomTabListSelectedValueTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getCustomTabListSelectedValue() {
        return localCustomTabListSelectedValue;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomTabListSelectedValue
     */
    public void setCustomTabListSelectedValue(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localCustomTabListSelectedValueTracker = true;
        } else {
            localCustomTabListSelectedValueTracker = false;

        }

        this.localCustomTabListSelectedValue = param;

    }

    /**
     * field for CustomTabRadioGroupName
     */

    protected java.lang.String localCustomTabRadioGroupName;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomTabRadioGroupNameTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getCustomTabRadioGroupName() {
        return localCustomTabRadioGroupName;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomTabRadioGroupName
     */
    public void setCustomTabRadioGroupName(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localCustomTabRadioGroupNameTracker = true;
        } else {
            localCustomTabRadioGroupNameTracker = false;

        }

        this.localCustomTabRadioGroupName = param;

    }

    /**
     * field for CustomTabValidationPattern
     */

    protected java.lang.String localCustomTabValidationPattern;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomTabValidationPatternTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getCustomTabValidationPattern() {
        return localCustomTabValidationPattern;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomTabValidationPattern
     */
    public void setCustomTabValidationPattern(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localCustomTabValidationPatternTracker = true;
        } else {
            localCustomTabValidationPatternTracker = false;

        }

        this.localCustomTabValidationPattern = param;

    }

    /**
     * field for CustomTabValidationMessage
     */

    protected java.lang.String localCustomTabValidationMessage;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localCustomTabValidationMessageTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getCustomTabValidationMessage() {
        return localCustomTabValidationMessage;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            CustomTabValidationMessage
     */
    public void setCustomTabValidationMessage(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localCustomTabValidationMessageTracker = true;
        } else {
            localCustomTabValidationMessageTracker = false;

        }

        this.localCustomTabValidationMessage = param;

    }

    /**
     * field for TemplateLocked
     */

    protected boolean localTemplateLocked;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTemplateLockedTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getTemplateLocked() {
        return localTemplateLocked;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TemplateLocked
     */
    public void setTemplateLocked(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localTemplateLockedTracker = false;

        } else {
            localTemplateLockedTracker = true;
        }

        this.localTemplateLocked = param;

    }

    /**
     * field for TemplateRequired
     */

    protected boolean localTemplateRequired;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localTemplateRequiredTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getTemplateRequired() {
        return localTemplateRequired;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            TemplateRequired
     */
    public void setTemplateRequired(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localTemplateRequiredTracker = false;

        } else {
            localTemplateRequiredTracker = true;
        }

        this.localTemplateRequired = param;

    }

    /**
     * field for ConditionalParentLabel
     */

    protected java.lang.String localConditionalParentLabel;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localConditionalParentLabelTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getConditionalParentLabel() {
        return localConditionalParentLabel;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ConditionalParentLabel
     */
    public void setConditionalParentLabel(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localConditionalParentLabelTracker = true;
        } else {
            localConditionalParentLabelTracker = false;

        }

        this.localConditionalParentLabel = param;

    }

    /**
     * field for ConditionalParentValue
     */

    protected java.lang.String localConditionalParentValue;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localConditionalParentValueTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return java.lang.String
     */
    public java.lang.String getConditionalParentValue() {
        return localConditionalParentValue;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            ConditionalParentValue
     */
    public void setConditionalParentValue(java.lang.String param) {

        if (param != null) {
            // update the setting tracker
            localConditionalParentValueTracker = true;
        } else {
            localConditionalParentValueTracker = false;

        }

        this.localConditionalParentValue = param;

    }

    /**
     * field for SharedTab
     */

    protected boolean localSharedTab;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localSharedTabTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getSharedTab() {
        return localSharedTab;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            SharedTab
     */
    public void setSharedTab(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localSharedTabTracker = false;

        } else {
            localSharedTabTracker = true;
        }

        this.localSharedTab = param;

    }

    /**
     * field for RequireInitialOnSharedTabChange
     */

    protected boolean localRequireInitialOnSharedTabChange;

    /*
     * This tracker boolean wil be used to detect whether the user called the
     * set method for this attribute. It will be used to determine whether to
     * include this field in the serialized XML
     */
    protected boolean localRequireInitialOnSharedTabChangeTracker = false;

    /**
     * Auto generated getter method
     * 
     * @return boolean
     */
    public boolean getRequireInitialOnSharedTabChange() {
        return localRequireInitialOnSharedTabChange;
    }

    /**
     * Auto generated setter method
     * 
     * @param param
     *            RequireInitialOnSharedTabChange
     */
    public void setRequireInitialOnSharedTabChange(boolean param) {

        // setting primitive attribute tracker to true

        if (false) {
            localRequireInitialOnSharedTabChangeTracker = false;

        } else {
            localRequireInitialOnSharedTabChangeTracker = true;
        }

        this.localRequireInitialOnSharedTabChange = param;

    }

    /**
     * isReaderMTOMAware
     * 
     * @return true if the reader supports MTOM
     */
    public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;

        try {
            isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        } catch (java.lang.IllegalArgumentException e) {
            isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
    }

    /**
     * 
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

        org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName) {

            public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                Tab.this.serialize(parentQName, factory, xmlWriter);
            }
        };
        return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(parentQName, factory, dataSource);

    }

    public void serialize(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory, org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        serialize(parentQName, factory, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory, org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();

        if ((namespace != null) && (namespace.trim().length() > 0)) {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
            } else {
                if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        } else {
            xmlWriter.writeStartElement(parentQName.getLocalPart());
        }

        if (serializeType) {

            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.docusign.net/API/3.0");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":Tab", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Tab", xmlWriter);
            }

        }
        if (localDocumentIDTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "DocumentID", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "DocumentID");
                }

            } else {
                xmlWriter.writeStartElement("DocumentID");
            }

            if (localDocumentID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("DocumentID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentID));

            }

            xmlWriter.writeEndElement();
        }
        if (localRecipientIDTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "RecipientID", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "RecipientID");
                }

            } else {
                xmlWriter.writeStartElement("RecipientID");
            }

            if (localRecipientID == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("RecipientID cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecipientID));

            }

            xmlWriter.writeEndElement();
        }
        if (localPageNumberTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "PageNumber", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "PageNumber");
                }

            } else {
                xmlWriter.writeStartElement("PageNumber");
            }

            if (localPageNumber == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("PageNumber cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageNumber));

            }

            xmlWriter.writeEndElement();
        }
        if (localXPositionTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "XPosition", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "XPosition");
                }

            } else {
                xmlWriter.writeStartElement("XPosition");
            }

            if (localXPosition == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("XPosition cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localXPosition));

            }

            xmlWriter.writeEndElement();
        }
        if (localYPositionTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "YPosition", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "YPosition");
                }

            } else {
                xmlWriter.writeStartElement("YPosition");
            }

            if (localYPosition == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("YPosition cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYPosition));

            }

            xmlWriter.writeEndElement();
        }
        if (localScaleValueTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ScaleValue", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "ScaleValue");
                }

            } else {
                xmlWriter.writeStartElement("ScaleValue");
            }

            if (localScaleValue == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ScaleValue cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localScaleValue));

            }

            xmlWriter.writeEndElement();
        }
        if (localAnchorTabItemTracker) {
            if (localAnchorTabItem == null) {
                throw new org.apache.axis2.databinding.ADBException("AnchorTabItem cannot be null!!");
            }
            localAnchorTabItem.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AnchorTabItem"), factory, xmlWriter);
        }
        if (localType == null) {
            throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");
        }
        localType.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Type"), factory, xmlWriter);
        if (localNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Name", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "Name");
                }

            } else {
                xmlWriter.writeStartElement("Name");
            }

            if (localName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localName);

            }

            xmlWriter.writeEndElement();
        }
        if (localTabLabelTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "TabLabel", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "TabLabel");
                }

            } else {
                xmlWriter.writeStartElement("TabLabel");
            }

            if (localTabLabel == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TabLabel cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localTabLabel);

            }

            xmlWriter.writeEndElement();
        }
        if (localValueTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "Value", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "Value");
                }

            } else {
                xmlWriter.writeStartElement("Value");
            }

            if (localValue == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Value cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localValue);

            }

            xmlWriter.writeEndElement();
        }
        if (localCustomTabTypeTracker) {
            if (localCustomTabType == null) {
                throw new org.apache.axis2.databinding.ADBException("CustomTabType cannot be null!!");
            }
            localCustomTabType.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabType"), factory, xmlWriter);
        }
        if (localCustomTabWidthTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CustomTabWidth", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "CustomTabWidth");
                }

            } else {
                xmlWriter.writeStartElement("CustomTabWidth");
            }

            if (localCustomTabWidth == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("CustomTabWidth cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabWidth));
            }

            xmlWriter.writeEndElement();
        }
        if (localCustomTabHeightTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CustomTabHeight", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "CustomTabHeight");
                }

            } else {
                xmlWriter.writeStartElement("CustomTabHeight");
            }

            if (localCustomTabHeight == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("CustomTabHeight cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabHeight));
            }

            xmlWriter.writeEndElement();
        }
        if (localCustomTabRequiredTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CustomTabRequired", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "CustomTabRequired");
                }

            } else {
                xmlWriter.writeStartElement("CustomTabRequired");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("CustomTabRequired cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabRequired));
            }

            xmlWriter.writeEndElement();
        }
        if (localCustomTabLockedTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CustomTabLocked", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "CustomTabLocked");
                }

            } else {
                xmlWriter.writeStartElement("CustomTabLocked");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("CustomTabLocked cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabLocked));
            }

            xmlWriter.writeEndElement();
        }
        if (localCustomTabDisableAutoSizeTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CustomTabDisableAutoSize", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "CustomTabDisableAutoSize");
                }

            } else {
                xmlWriter.writeStartElement("CustomTabDisableAutoSize");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("CustomTabDisableAutoSize cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabDisableAutoSize));
            }

            xmlWriter.writeEndElement();
        }
        if (localCustomTabListItemsTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CustomTabListItems", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "CustomTabListItems");
                }

            } else {
                xmlWriter.writeStartElement("CustomTabListItems");
            }

            if (localCustomTabListItems == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CustomTabListItems cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCustomTabListItems);

            }

            xmlWriter.writeEndElement();
        }
        if (localCustomTabListValuesTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CustomTabListValues", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "CustomTabListValues");
                }

            } else {
                xmlWriter.writeStartElement("CustomTabListValues");
            }

            if (localCustomTabListValues == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CustomTabListValues cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCustomTabListValues);

            }

            xmlWriter.writeEndElement();
        }
        if (localCustomTabListSelectedValueTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CustomTabListSelectedValue", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "CustomTabListSelectedValue");
                }

            } else {
                xmlWriter.writeStartElement("CustomTabListSelectedValue");
            }

            if (localCustomTabListSelectedValue == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CustomTabListSelectedValue cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCustomTabListSelectedValue);

            }

            xmlWriter.writeEndElement();
        }
        if (localCustomTabRadioGroupNameTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CustomTabRadioGroupName", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "CustomTabRadioGroupName");
                }

            } else {
                xmlWriter.writeStartElement("CustomTabRadioGroupName");
            }

            if (localCustomTabRadioGroupName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CustomTabRadioGroupName cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCustomTabRadioGroupName);

            }

            xmlWriter.writeEndElement();
        }
        if (localCustomTabValidationPatternTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CustomTabValidationPattern", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "CustomTabValidationPattern");
                }

            } else {
                xmlWriter.writeStartElement("CustomTabValidationPattern");
            }

            if (localCustomTabValidationPattern == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CustomTabValidationPattern cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCustomTabValidationPattern);

            }

            xmlWriter.writeEndElement();
        }
        if (localCustomTabValidationMessageTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "CustomTabValidationMessage", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "CustomTabValidationMessage");
                }

            } else {
                xmlWriter.writeStartElement("CustomTabValidationMessage");
            }

            if (localCustomTabValidationMessage == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CustomTabValidationMessage cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localCustomTabValidationMessage);

            }

            xmlWriter.writeEndElement();
        }
        if (localTemplateLockedTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "TemplateLocked", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "TemplateLocked");
                }

            } else {
                xmlWriter.writeStartElement("TemplateLocked");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("TemplateLocked cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplateLocked));
            }

            xmlWriter.writeEndElement();
        }
        if (localTemplateRequiredTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "TemplateRequired", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "TemplateRequired");
                }

            } else {
                xmlWriter.writeStartElement("TemplateRequired");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("TemplateRequired cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplateRequired));
            }

            xmlWriter.writeEndElement();
        }
        if (localConditionalParentLabelTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ConditionalParentLabel", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "ConditionalParentLabel");
                }

            } else {
                xmlWriter.writeStartElement("ConditionalParentLabel");
            }

            if (localConditionalParentLabel == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ConditionalParentLabel cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localConditionalParentLabel);

            }

            xmlWriter.writeEndElement();
        }
        if (localConditionalParentValueTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "ConditionalParentValue", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "ConditionalParentValue");
                }

            } else {
                xmlWriter.writeStartElement("ConditionalParentValue");
            }

            if (localConditionalParentValue == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ConditionalParentValue cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localConditionalParentValue);

            }

            xmlWriter.writeEndElement();
        }
        if (localSharedTabTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "SharedTab", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "SharedTab");
                }

            } else {
                xmlWriter.writeStartElement("SharedTab");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("SharedTab cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSharedTab));
            }

            xmlWriter.writeEndElement();
        }
        if (localRequireInitialOnSharedTabChangeTracker) {
            namespace = "http://www.docusign.net/API/3.0";
            if (!namespace.equals("")) {
                prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    xmlWriter.writeStartElement(prefix, "RequireInitialOnSharedTabChange", namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);

                } else {
                    xmlWriter.writeStartElement(namespace, "RequireInitialOnSharedTabChange");
                }

            } else {
                xmlWriter.writeStartElement("RequireInitialOnSharedTabChange");
            }

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("RequireInitialOnSharedTabChange cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequireInitialOnSharedTabChange));
            }

            xmlWriter.writeEndElement();
        }
        xmlWriter.writeEndElement();

    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);

        }

        xmlWriter.writeAttribute(namespace, attName, attValue);

    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */

    private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not
            // possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     * databinding method to get an XML representation of this object
     * 
     */
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {

        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        if (localDocumentIDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentID"));

            if (localDocumentID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("DocumentID cannot be null!!");
            }
        }
        if (localRecipientIDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientID"));

            if (localRecipientID != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecipientID));
            } else {
                throw new org.apache.axis2.databinding.ADBException("RecipientID cannot be null!!");
            }
        }
        if (localPageNumberTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PageNumber"));

            if (localPageNumber != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageNumber));
            } else {
                throw new org.apache.axis2.databinding.ADBException("PageNumber cannot be null!!");
            }
        }
        if (localXPositionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "XPosition"));

            if (localXPosition != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localXPosition));
            } else {
                throw new org.apache.axis2.databinding.ADBException("XPosition cannot be null!!");
            }
        }
        if (localYPositionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "YPosition"));

            if (localYPosition != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYPosition));
            } else {
                throw new org.apache.axis2.databinding.ADBException("YPosition cannot be null!!");
            }
        }
        if (localScaleValueTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ScaleValue"));

            if (localScaleValue != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localScaleValue));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ScaleValue cannot be null!!");
            }
        }
        if (localAnchorTabItemTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AnchorTabItem"));

            if (localAnchorTabItem == null) {
                throw new org.apache.axis2.databinding.ADBException("AnchorTabItem cannot be null!!");
            }
            elementList.add(localAnchorTabItem);
        }
        elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Type"));

        if (localType == null) {
            throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");
        }
        elementList.add(localType);
        if (localNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Name"));

            if (localName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
            }
        }
        if (localTabLabelTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabLabel"));

            if (localTabLabel != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTabLabel));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TabLabel cannot be null!!");
            }
        }
        if (localValueTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Value"));

            if (localValue != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValue));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Value cannot be null!!");
            }
        }
        if (localCustomTabTypeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabType"));

            if (localCustomTabType == null) {
                throw new org.apache.axis2.databinding.ADBException("CustomTabType cannot be null!!");
            }
            elementList.add(localCustomTabType);
        }
        if (localCustomTabWidthTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabWidth"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabWidth));
        }
        if (localCustomTabHeightTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabHeight"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabHeight));
        }
        if (localCustomTabRequiredTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabRequired"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabRequired));
        }
        if (localCustomTabLockedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabLocked"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabLocked));
        }
        if (localCustomTabDisableAutoSizeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabDisableAutoSize"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabDisableAutoSize));
        }
        if (localCustomTabListItemsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabListItems"));

            if (localCustomTabListItems != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabListItems));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CustomTabListItems cannot be null!!");
            }
        }
        if (localCustomTabListValuesTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabListValues"));

            if (localCustomTabListValues != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabListValues));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CustomTabListValues cannot be null!!");
            }
        }
        if (localCustomTabListSelectedValueTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabListSelectedValue"));

            if (localCustomTabListSelectedValue != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabListSelectedValue));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CustomTabListSelectedValue cannot be null!!");
            }
        }
        if (localCustomTabRadioGroupNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabRadioGroupName"));

            if (localCustomTabRadioGroupName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabRadioGroupName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CustomTabRadioGroupName cannot be null!!");
            }
        }
        if (localCustomTabValidationPatternTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabValidationPattern"));

            if (localCustomTabValidationPattern != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabValidationPattern));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CustomTabValidationPattern cannot be null!!");
            }
        }
        if (localCustomTabValidationMessageTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabValidationMessage"));

            if (localCustomTabValidationMessage != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomTabValidationMessage));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CustomTabValidationMessage cannot be null!!");
            }
        }
        if (localTemplateLockedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateLocked"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplateLocked));
        }
        if (localTemplateRequiredTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateRequired"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplateRequired));
        }
        if (localConditionalParentLabelTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConditionalParentLabel"));

            if (localConditionalParentLabel != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConditionalParentLabel));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ConditionalParentLabel cannot be null!!");
            }
        }
        if (localConditionalParentValueTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConditionalParentValue"));

            if (localConditionalParentValue != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConditionalParentValue));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ConditionalParentValue cannot be null!!");
            }
        }
        if (localSharedTabTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedTab"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSharedTab));
        }
        if (localRequireInitialOnSharedTabChangeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequireInitialOnSharedTabChange"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequireInitialOnSharedTabChange));
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());

    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {

        /**
         * static method to create the object Precondition: If this object is an
         * element, the current or next start element starts this object and any
         * intervening reader events are ignorable If this object is not an
         * element, it is a complex type and the reader is at the event just
         * after the outer start element Postcondition: If this object is an
         * element, the reader is positioned at its end element If this object
         * is a complex type, the reader is positioned at the end element of its
         * outer element
         */
        public static Tab parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            Tab object = new Tab();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                        if (!"Tab".equals(type)) {
                            // find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (Tab) net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal
                // attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentID").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDocumentID(org.apache.axis2.databinding.utils.ConverterUtil.convertToPositiveInteger(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientID").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setRecipientID(org.apache.axis2.databinding.utils.ConverterUtil.convertToPositiveInteger(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PageNumber").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setPageNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "XPosition").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setXPosition(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "YPosition").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setYPosition(org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ScaleValue").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setScaleValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AnchorTabItem").equals(reader.getName())) {

                    object.setAnchorTabItem(net.docusign.www.api._3_0.AnchorTab.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Type").equals(reader.getName())) {

                    object.setType(net.docusign.www.api._3_0.TabTypeCode.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid
                    // parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Name").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TabLabel").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTabLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Value").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabType").equals(reader.getName())) {

                    object.setCustomTabType(net.docusign.www.api._3_0.CustomTabType.Factory.parse(reader));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabWidth").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCustomTabWidth(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setCustomTabWidth(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabHeight").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCustomTabHeight(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                    object.setCustomTabHeight(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabRequired").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCustomTabRequired(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabLocked").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCustomTabLocked(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabDisableAutoSize").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCustomTabDisableAutoSize(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabListItems").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCustomTabListItems(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabListValues").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCustomTabListValues(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabListSelectedValue").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCustomTabListSelectedValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabRadioGroupName").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCustomTabRadioGroupName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabValidationPattern").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCustomTabValidationPattern(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomTabValidationMessage").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCustomTabValidationMessage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateLocked").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTemplateLocked(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateRequired").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTemplateRequired(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConditionalParentLabel").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setConditionalParentLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConditionalParentValue").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setConditionalParentValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedTab").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSharedTab(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequireInitialOnSharedTabChange").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setRequireInitialOnSharedTabChange(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                } // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement())
                    // A start element we are not expecting indicates a trailing
                    // invalid property
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());

            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }// end of factory class

}
