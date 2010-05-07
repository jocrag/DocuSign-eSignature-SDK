/**
 * Recipient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class Recipient  implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger ID;

    private java.lang.String userName;

    private java.lang.String signerName;

    private java.lang.String email;

    private net.docusign.www.API._3_0.RecipientTypeCode type;

    private java.lang.String accessCode;

    private java.lang.Boolean addAccessCodeToEmail;

    private boolean requireIDLookup;

    private java.lang.String IDCheckConfigurationName;

    private net.docusign.www.API._3_0.RecipientSignatureInfo signatureInfo;

    private net.docusign.www.API._3_0.RecipientCaptiveInfo captiveInfo;

    private java.lang.String[] customFields;

    private org.apache.axis.types.UnsignedShort routingOrder;

    private net.docusign.www.API._3_0.IDCheckInformationInput IDCheckInformationInput;

    private java.lang.Boolean autoNavigation;

    private net.docusign.www.API._3_0.Attachment[] recipientAttachment;

    private java.lang.String note;

    private java.lang.String roleName;

    private java.lang.Boolean templateLocked;

    private java.lang.Boolean templateRequired;

    private java.lang.Boolean templateAccessCodeRequired;

    public Recipient() {
    }

    public Recipient(
           org.apache.axis.types.PositiveInteger ID,
           java.lang.String userName,
           java.lang.String signerName,
           java.lang.String email,
           net.docusign.www.API._3_0.RecipientTypeCode type,
           java.lang.String accessCode,
           java.lang.Boolean addAccessCodeToEmail,
           boolean requireIDLookup,
           java.lang.String IDCheckConfigurationName,
           net.docusign.www.API._3_0.RecipientSignatureInfo signatureInfo,
           net.docusign.www.API._3_0.RecipientCaptiveInfo captiveInfo,
           java.lang.String[] customFields,
           org.apache.axis.types.UnsignedShort routingOrder,
           net.docusign.www.API._3_0.IDCheckInformationInput IDCheckInformationInput,
           java.lang.Boolean autoNavigation,
           net.docusign.www.API._3_0.Attachment[] recipientAttachment,
           java.lang.String note,
           java.lang.String roleName,
           java.lang.Boolean templateLocked,
           java.lang.Boolean templateRequired,
           java.lang.Boolean templateAccessCodeRequired) {
           this.ID = ID;
           this.userName = userName;
           this.signerName = signerName;
           this.email = email;
           this.type = type;
           this.accessCode = accessCode;
           this.addAccessCodeToEmail = addAccessCodeToEmail;
           this.requireIDLookup = requireIDLookup;
           this.IDCheckConfigurationName = IDCheckConfigurationName;
           this.signatureInfo = signatureInfo;
           this.captiveInfo = captiveInfo;
           this.customFields = customFields;
           this.routingOrder = routingOrder;
           this.IDCheckInformationInput = IDCheckInformationInput;
           this.autoNavigation = autoNavigation;
           this.recipientAttachment = recipientAttachment;
           this.note = note;
           this.roleName = roleName;
           this.templateLocked = templateLocked;
           this.templateRequired = templateRequired;
           this.templateAccessCodeRequired = templateAccessCodeRequired;
    }


    /**
     * Gets the ID value for this Recipient.
     * 
     * @return ID
     */
    public org.apache.axis.types.PositiveInteger getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Recipient.
     * 
     * @param ID
     */
    public void setID(org.apache.axis.types.PositiveInteger ID) {
        this.ID = ID;
    }


    /**
     * Gets the userName value for this Recipient.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this Recipient.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the signerName value for this Recipient.
     * 
     * @return signerName
     */
    public java.lang.String getSignerName() {
        return signerName;
    }


    /**
     * Sets the signerName value for this Recipient.
     * 
     * @param signerName
     */
    public void setSignerName(java.lang.String signerName) {
        this.signerName = signerName;
    }


    /**
     * Gets the email value for this Recipient.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Recipient.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the type value for this Recipient.
     * 
     * @return type
     */
    public net.docusign.www.API._3_0.RecipientTypeCode getType() {
        return type;
    }


    /**
     * Sets the type value for this Recipient.
     * 
     * @param type
     */
    public void setType(net.docusign.www.API._3_0.RecipientTypeCode type) {
        this.type = type;
    }


    /**
     * Gets the accessCode value for this Recipient.
     * 
     * @return accessCode
     */
    public java.lang.String getAccessCode() {
        return accessCode;
    }


    /**
     * Sets the accessCode value for this Recipient.
     * 
     * @param accessCode
     */
    public void setAccessCode(java.lang.String accessCode) {
        this.accessCode = accessCode;
    }


    /**
     * Gets the addAccessCodeToEmail value for this Recipient.
     * 
     * @return addAccessCodeToEmail
     */
    public java.lang.Boolean getAddAccessCodeToEmail() {
        return addAccessCodeToEmail;
    }


    /**
     * Sets the addAccessCodeToEmail value for this Recipient.
     * 
     * @param addAccessCodeToEmail
     */
    public void setAddAccessCodeToEmail(java.lang.Boolean addAccessCodeToEmail) {
        this.addAccessCodeToEmail = addAccessCodeToEmail;
    }


    /**
     * Gets the requireIDLookup value for this Recipient.
     * 
     * @return requireIDLookup
     */
    public boolean isRequireIDLookup() {
        return requireIDLookup;
    }


    /**
     * Sets the requireIDLookup value for this Recipient.
     * 
     * @param requireIDLookup
     */
    public void setRequireIDLookup(boolean requireIDLookup) {
        this.requireIDLookup = requireIDLookup;
    }


    /**
     * Gets the IDCheckConfigurationName value for this Recipient.
     * 
     * @return IDCheckConfigurationName
     */
    public java.lang.String getIDCheckConfigurationName() {
        return IDCheckConfigurationName;
    }


    /**
     * Sets the IDCheckConfigurationName value for this Recipient.
     * 
     * @param IDCheckConfigurationName
     */
    public void setIDCheckConfigurationName(java.lang.String IDCheckConfigurationName) {
        this.IDCheckConfigurationName = IDCheckConfigurationName;
    }


    /**
     * Gets the signatureInfo value for this Recipient.
     * 
     * @return signatureInfo
     */
    public net.docusign.www.API._3_0.RecipientSignatureInfo getSignatureInfo() {
        return signatureInfo;
    }


    /**
     * Sets the signatureInfo value for this Recipient.
     * 
     * @param signatureInfo
     */
    public void setSignatureInfo(net.docusign.www.API._3_0.RecipientSignatureInfo signatureInfo) {
        this.signatureInfo = signatureInfo;
    }


    /**
     * Gets the captiveInfo value for this Recipient.
     * 
     * @return captiveInfo
     */
    public net.docusign.www.API._3_0.RecipientCaptiveInfo getCaptiveInfo() {
        return captiveInfo;
    }


    /**
     * Sets the captiveInfo value for this Recipient.
     * 
     * @param captiveInfo
     */
    public void setCaptiveInfo(net.docusign.www.API._3_0.RecipientCaptiveInfo captiveInfo) {
        this.captiveInfo = captiveInfo;
    }


    /**
     * Gets the customFields value for this Recipient.
     * 
     * @return customFields
     */
    public java.lang.String[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this Recipient.
     * 
     * @param customFields
     */
    public void setCustomFields(java.lang.String[] customFields) {
        this.customFields = customFields;
    }


    /**
     * Gets the routingOrder value for this Recipient.
     * 
     * @return routingOrder
     */
    public org.apache.axis.types.UnsignedShort getRoutingOrder() {
        return routingOrder;
    }


    /**
     * Sets the routingOrder value for this Recipient.
     * 
     * @param routingOrder
     */
    public void setRoutingOrder(org.apache.axis.types.UnsignedShort routingOrder) {
        this.routingOrder = routingOrder;
    }


    /**
     * Gets the IDCheckInformationInput value for this Recipient.
     * 
     * @return IDCheckInformationInput
     */
    public net.docusign.www.API._3_0.IDCheckInformationInput getIDCheckInformationInput() {
        return IDCheckInformationInput;
    }


    /**
     * Sets the IDCheckInformationInput value for this Recipient.
     * 
     * @param IDCheckInformationInput
     */
    public void setIDCheckInformationInput(net.docusign.www.API._3_0.IDCheckInformationInput IDCheckInformationInput) {
        this.IDCheckInformationInput = IDCheckInformationInput;
    }


    /**
     * Gets the autoNavigation value for this Recipient.
     * 
     * @return autoNavigation
     */
    public java.lang.Boolean getAutoNavigation() {
        return autoNavigation;
    }


    /**
     * Sets the autoNavigation value for this Recipient.
     * 
     * @param autoNavigation
     */
    public void setAutoNavigation(java.lang.Boolean autoNavigation) {
        this.autoNavigation = autoNavigation;
    }


    /**
     * Gets the recipientAttachment value for this Recipient.
     * 
     * @return recipientAttachment
     */
    public net.docusign.www.API._3_0.Attachment[] getRecipientAttachment() {
        return recipientAttachment;
    }


    /**
     * Sets the recipientAttachment value for this Recipient.
     * 
     * @param recipientAttachment
     */
    public void setRecipientAttachment(net.docusign.www.API._3_0.Attachment[] recipientAttachment) {
        this.recipientAttachment = recipientAttachment;
    }


    /**
     * Gets the note value for this Recipient.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this Recipient.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the roleName value for this Recipient.
     * 
     * @return roleName
     */
    public java.lang.String getRoleName() {
        return roleName;
    }


    /**
     * Sets the roleName value for this Recipient.
     * 
     * @param roleName
     */
    public void setRoleName(java.lang.String roleName) {
        this.roleName = roleName;
    }


    /**
     * Gets the templateLocked value for this Recipient.
     * 
     * @return templateLocked
     */
    public java.lang.Boolean getTemplateLocked() {
        return templateLocked;
    }


    /**
     * Sets the templateLocked value for this Recipient.
     * 
     * @param templateLocked
     */
    public void setTemplateLocked(java.lang.Boolean templateLocked) {
        this.templateLocked = templateLocked;
    }


    /**
     * Gets the templateRequired value for this Recipient.
     * 
     * @return templateRequired
     */
    public java.lang.Boolean getTemplateRequired() {
        return templateRequired;
    }


    /**
     * Sets the templateRequired value for this Recipient.
     * 
     * @param templateRequired
     */
    public void setTemplateRequired(java.lang.Boolean templateRequired) {
        this.templateRequired = templateRequired;
    }


    /**
     * Gets the templateAccessCodeRequired value for this Recipient.
     * 
     * @return templateAccessCodeRequired
     */
    public java.lang.Boolean getTemplateAccessCodeRequired() {
        return templateAccessCodeRequired;
    }


    /**
     * Sets the templateAccessCodeRequired value for this Recipient.
     * 
     * @param templateAccessCodeRequired
     */
    public void setTemplateAccessCodeRequired(java.lang.Boolean templateAccessCodeRequired) {
        this.templateAccessCodeRequired = templateAccessCodeRequired;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Recipient)) return false;
        Recipient other = (Recipient) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.signerName==null && other.getSignerName()==null) || 
             (this.signerName!=null &&
              this.signerName.equals(other.getSignerName()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.accessCode==null && other.getAccessCode()==null) || 
             (this.accessCode!=null &&
              this.accessCode.equals(other.getAccessCode()))) &&
            ((this.addAccessCodeToEmail==null && other.getAddAccessCodeToEmail()==null) || 
             (this.addAccessCodeToEmail!=null &&
              this.addAccessCodeToEmail.equals(other.getAddAccessCodeToEmail()))) &&
            this.requireIDLookup == other.isRequireIDLookup() &&
            ((this.IDCheckConfigurationName==null && other.getIDCheckConfigurationName()==null) || 
             (this.IDCheckConfigurationName!=null &&
              this.IDCheckConfigurationName.equals(other.getIDCheckConfigurationName()))) &&
            ((this.signatureInfo==null && other.getSignatureInfo()==null) || 
             (this.signatureInfo!=null &&
              this.signatureInfo.equals(other.getSignatureInfo()))) &&
            ((this.captiveInfo==null && other.getCaptiveInfo()==null) || 
             (this.captiveInfo!=null &&
              this.captiveInfo.equals(other.getCaptiveInfo()))) &&
            ((this.customFields==null && other.getCustomFields()==null) || 
             (this.customFields!=null &&
              java.util.Arrays.equals(this.customFields, other.getCustomFields()))) &&
            ((this.routingOrder==null && other.getRoutingOrder()==null) || 
             (this.routingOrder!=null &&
              this.routingOrder.equals(other.getRoutingOrder()))) &&
            ((this.IDCheckInformationInput==null && other.getIDCheckInformationInput()==null) || 
             (this.IDCheckInformationInput!=null &&
              this.IDCheckInformationInput.equals(other.getIDCheckInformationInput()))) &&
            ((this.autoNavigation==null && other.getAutoNavigation()==null) || 
             (this.autoNavigation!=null &&
              this.autoNavigation.equals(other.getAutoNavigation()))) &&
            ((this.recipientAttachment==null && other.getRecipientAttachment()==null) || 
             (this.recipientAttachment!=null &&
              java.util.Arrays.equals(this.recipientAttachment, other.getRecipientAttachment()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.roleName==null && other.getRoleName()==null) || 
             (this.roleName!=null &&
              this.roleName.equals(other.getRoleName()))) &&
            ((this.templateLocked==null && other.getTemplateLocked()==null) || 
             (this.templateLocked!=null &&
              this.templateLocked.equals(other.getTemplateLocked()))) &&
            ((this.templateRequired==null && other.getTemplateRequired()==null) || 
             (this.templateRequired!=null &&
              this.templateRequired.equals(other.getTemplateRequired()))) &&
            ((this.templateAccessCodeRequired==null && other.getTemplateAccessCodeRequired()==null) || 
             (this.templateAccessCodeRequired!=null &&
              this.templateAccessCodeRequired.equals(other.getTemplateAccessCodeRequired())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getSignerName() != null) {
            _hashCode += getSignerName().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAccessCode() != null) {
            _hashCode += getAccessCode().hashCode();
        }
        if (getAddAccessCodeToEmail() != null) {
            _hashCode += getAddAccessCodeToEmail().hashCode();
        }
        _hashCode += (isRequireIDLookup() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIDCheckConfigurationName() != null) {
            _hashCode += getIDCheckConfigurationName().hashCode();
        }
        if (getSignatureInfo() != null) {
            _hashCode += getSignatureInfo().hashCode();
        }
        if (getCaptiveInfo() != null) {
            _hashCode += getCaptiveInfo().hashCode();
        }
        if (getCustomFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoutingOrder() != null) {
            _hashCode += getRoutingOrder().hashCode();
        }
        if (getIDCheckInformationInput() != null) {
            _hashCode += getIDCheckInformationInput().hashCode();
        }
        if (getAutoNavigation() != null) {
            _hashCode += getAutoNavigation().hashCode();
        }
        if (getRecipientAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipientAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getRoleName() != null) {
            _hashCode += getRoleName().hashCode();
        }
        if (getTemplateLocked() != null) {
            _hashCode += getTemplateLocked().hashCode();
        }
        if (getTemplateRequired() != null) {
            _hashCode += getTemplateRequired().hashCode();
        }
        if (getTemplateAccessCodeRequired() != null) {
            _hashCode += getTemplateAccessCodeRequired().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Recipient.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipient"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientTypeCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addAccessCodeToEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddAccessCodeToEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireIDLookup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequireIDLookup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCheckConfigurationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckConfigurationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignatureInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSignatureInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captiveInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCaptiveInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomField"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoutingOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCheckInformationInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformationInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformationInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoNavigation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AutoNavigation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Note"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateAccessCodeRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateAccessCodeRequired"));
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
