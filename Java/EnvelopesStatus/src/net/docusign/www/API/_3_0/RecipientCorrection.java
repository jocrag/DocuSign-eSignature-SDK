/**
 * RecipientCorrection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientCorrection  implements java.io.Serializable {
    private java.lang.String previousUserName;

    private java.lang.String previousEmail;

    private org.apache.axis.types.UnsignedShort previousRoutingOrder;

    private java.lang.String previousSignerName;

    private java.lang.String correctedUserName;

    private java.lang.String correctedSignerName;

    private java.lang.String correctedEmail;

    private net.docusign.www.API._3_0.RecipientCorrectionCorrectedCaptiveInfo correctedCaptiveInfo;

    private java.lang.String correctedAccessCode;

    private java.lang.Boolean correctedAccessCodeRequired;

    private java.lang.Boolean correctedRequireIDLookup;

    private java.lang.String correctedIDCheckConfigurationName;

    private org.apache.axis.types.UnsignedShort correctedRoutingOrder;

    private java.lang.Boolean correctedAutoNavigation;

    private net.docusign.www.API._3_0.IDCheckInformationInput correctedIDCheckInformationInput;

    private java.lang.Boolean resend;

    public RecipientCorrection() {
    }

    public RecipientCorrection(
           java.lang.String previousUserName,
           java.lang.String previousEmail,
           org.apache.axis.types.UnsignedShort previousRoutingOrder,
           java.lang.String previousSignerName,
           java.lang.String correctedUserName,
           java.lang.String correctedSignerName,
           java.lang.String correctedEmail,
           net.docusign.www.API._3_0.RecipientCorrectionCorrectedCaptiveInfo correctedCaptiveInfo,
           java.lang.String correctedAccessCode,
           java.lang.Boolean correctedAccessCodeRequired,
           java.lang.Boolean correctedRequireIDLookup,
           java.lang.String correctedIDCheckConfigurationName,
           org.apache.axis.types.UnsignedShort correctedRoutingOrder,
           java.lang.Boolean correctedAutoNavigation,
           net.docusign.www.API._3_0.IDCheckInformationInput correctedIDCheckInformationInput,
           java.lang.Boolean resend) {
           this.previousUserName = previousUserName;
           this.previousEmail = previousEmail;
           this.previousRoutingOrder = previousRoutingOrder;
           this.previousSignerName = previousSignerName;
           this.correctedUserName = correctedUserName;
           this.correctedSignerName = correctedSignerName;
           this.correctedEmail = correctedEmail;
           this.correctedCaptiveInfo = correctedCaptiveInfo;
           this.correctedAccessCode = correctedAccessCode;
           this.correctedAccessCodeRequired = correctedAccessCodeRequired;
           this.correctedRequireIDLookup = correctedRequireIDLookup;
           this.correctedIDCheckConfigurationName = correctedIDCheckConfigurationName;
           this.correctedRoutingOrder = correctedRoutingOrder;
           this.correctedAutoNavigation = correctedAutoNavigation;
           this.correctedIDCheckInformationInput = correctedIDCheckInformationInput;
           this.resend = resend;
    }


    /**
     * Gets the previousUserName value for this RecipientCorrection.
     * 
     * @return previousUserName
     */
    public java.lang.String getPreviousUserName() {
        return previousUserName;
    }


    /**
     * Sets the previousUserName value for this RecipientCorrection.
     * 
     * @param previousUserName
     */
    public void setPreviousUserName(java.lang.String previousUserName) {
        this.previousUserName = previousUserName;
    }


    /**
     * Gets the previousEmail value for this RecipientCorrection.
     * 
     * @return previousEmail
     */
    public java.lang.String getPreviousEmail() {
        return previousEmail;
    }


    /**
     * Sets the previousEmail value for this RecipientCorrection.
     * 
     * @param previousEmail
     */
    public void setPreviousEmail(java.lang.String previousEmail) {
        this.previousEmail = previousEmail;
    }


    /**
     * Gets the previousRoutingOrder value for this RecipientCorrection.
     * 
     * @return previousRoutingOrder
     */
    public org.apache.axis.types.UnsignedShort getPreviousRoutingOrder() {
        return previousRoutingOrder;
    }


    /**
     * Sets the previousRoutingOrder value for this RecipientCorrection.
     * 
     * @param previousRoutingOrder
     */
    public void setPreviousRoutingOrder(org.apache.axis.types.UnsignedShort previousRoutingOrder) {
        this.previousRoutingOrder = previousRoutingOrder;
    }


    /**
     * Gets the previousSignerName value for this RecipientCorrection.
     * 
     * @return previousSignerName
     */
    public java.lang.String getPreviousSignerName() {
        return previousSignerName;
    }


    /**
     * Sets the previousSignerName value for this RecipientCorrection.
     * 
     * @param previousSignerName
     */
    public void setPreviousSignerName(java.lang.String previousSignerName) {
        this.previousSignerName = previousSignerName;
    }


    /**
     * Gets the correctedUserName value for this RecipientCorrection.
     * 
     * @return correctedUserName
     */
    public java.lang.String getCorrectedUserName() {
        return correctedUserName;
    }


    /**
     * Sets the correctedUserName value for this RecipientCorrection.
     * 
     * @param correctedUserName
     */
    public void setCorrectedUserName(java.lang.String correctedUserName) {
        this.correctedUserName = correctedUserName;
    }


    /**
     * Gets the correctedSignerName value for this RecipientCorrection.
     * 
     * @return correctedSignerName
     */
    public java.lang.String getCorrectedSignerName() {
        return correctedSignerName;
    }


    /**
     * Sets the correctedSignerName value for this RecipientCorrection.
     * 
     * @param correctedSignerName
     */
    public void setCorrectedSignerName(java.lang.String correctedSignerName) {
        this.correctedSignerName = correctedSignerName;
    }


    /**
     * Gets the correctedEmail value for this RecipientCorrection.
     * 
     * @return correctedEmail
     */
    public java.lang.String getCorrectedEmail() {
        return correctedEmail;
    }


    /**
     * Sets the correctedEmail value for this RecipientCorrection.
     * 
     * @param correctedEmail
     */
    public void setCorrectedEmail(java.lang.String correctedEmail) {
        this.correctedEmail = correctedEmail;
    }


    /**
     * Gets the correctedCaptiveInfo value for this RecipientCorrection.
     * 
     * @return correctedCaptiveInfo
     */
    public net.docusign.www.API._3_0.RecipientCorrectionCorrectedCaptiveInfo getCorrectedCaptiveInfo() {
        return correctedCaptiveInfo;
    }


    /**
     * Sets the correctedCaptiveInfo value for this RecipientCorrection.
     * 
     * @param correctedCaptiveInfo
     */
    public void setCorrectedCaptiveInfo(net.docusign.www.API._3_0.RecipientCorrectionCorrectedCaptiveInfo correctedCaptiveInfo) {
        this.correctedCaptiveInfo = correctedCaptiveInfo;
    }


    /**
     * Gets the correctedAccessCode value for this RecipientCorrection.
     * 
     * @return correctedAccessCode
     */
    public java.lang.String getCorrectedAccessCode() {
        return correctedAccessCode;
    }


    /**
     * Sets the correctedAccessCode value for this RecipientCorrection.
     * 
     * @param correctedAccessCode
     */
    public void setCorrectedAccessCode(java.lang.String correctedAccessCode) {
        this.correctedAccessCode = correctedAccessCode;
    }


    /**
     * Gets the correctedAccessCodeRequired value for this RecipientCorrection.
     * 
     * @return correctedAccessCodeRequired
     */
    public java.lang.Boolean getCorrectedAccessCodeRequired() {
        return correctedAccessCodeRequired;
    }


    /**
     * Sets the correctedAccessCodeRequired value for this RecipientCorrection.
     * 
     * @param correctedAccessCodeRequired
     */
    public void setCorrectedAccessCodeRequired(java.lang.Boolean correctedAccessCodeRequired) {
        this.correctedAccessCodeRequired = correctedAccessCodeRequired;
    }


    /**
     * Gets the correctedRequireIDLookup value for this RecipientCorrection.
     * 
     * @return correctedRequireIDLookup
     */
    public java.lang.Boolean getCorrectedRequireIDLookup() {
        return correctedRequireIDLookup;
    }


    /**
     * Sets the correctedRequireIDLookup value for this RecipientCorrection.
     * 
     * @param correctedRequireIDLookup
     */
    public void setCorrectedRequireIDLookup(java.lang.Boolean correctedRequireIDLookup) {
        this.correctedRequireIDLookup = correctedRequireIDLookup;
    }


    /**
     * Gets the correctedIDCheckConfigurationName value for this RecipientCorrection.
     * 
     * @return correctedIDCheckConfigurationName
     */
    public java.lang.String getCorrectedIDCheckConfigurationName() {
        return correctedIDCheckConfigurationName;
    }


    /**
     * Sets the correctedIDCheckConfigurationName value for this RecipientCorrection.
     * 
     * @param correctedIDCheckConfigurationName
     */
    public void setCorrectedIDCheckConfigurationName(java.lang.String correctedIDCheckConfigurationName) {
        this.correctedIDCheckConfigurationName = correctedIDCheckConfigurationName;
    }


    /**
     * Gets the correctedRoutingOrder value for this RecipientCorrection.
     * 
     * @return correctedRoutingOrder
     */
    public org.apache.axis.types.UnsignedShort getCorrectedRoutingOrder() {
        return correctedRoutingOrder;
    }


    /**
     * Sets the correctedRoutingOrder value for this RecipientCorrection.
     * 
     * @param correctedRoutingOrder
     */
    public void setCorrectedRoutingOrder(org.apache.axis.types.UnsignedShort correctedRoutingOrder) {
        this.correctedRoutingOrder = correctedRoutingOrder;
    }


    /**
     * Gets the correctedAutoNavigation value for this RecipientCorrection.
     * 
     * @return correctedAutoNavigation
     */
    public java.lang.Boolean getCorrectedAutoNavigation() {
        return correctedAutoNavigation;
    }


    /**
     * Sets the correctedAutoNavigation value for this RecipientCorrection.
     * 
     * @param correctedAutoNavigation
     */
    public void setCorrectedAutoNavigation(java.lang.Boolean correctedAutoNavigation) {
        this.correctedAutoNavigation = correctedAutoNavigation;
    }


    /**
     * Gets the correctedIDCheckInformationInput value for this RecipientCorrection.
     * 
     * @return correctedIDCheckInformationInput
     */
    public net.docusign.www.API._3_0.IDCheckInformationInput getCorrectedIDCheckInformationInput() {
        return correctedIDCheckInformationInput;
    }


    /**
     * Sets the correctedIDCheckInformationInput value for this RecipientCorrection.
     * 
     * @param correctedIDCheckInformationInput
     */
    public void setCorrectedIDCheckInformationInput(net.docusign.www.API._3_0.IDCheckInformationInput correctedIDCheckInformationInput) {
        this.correctedIDCheckInformationInput = correctedIDCheckInformationInput;
    }


    /**
     * Gets the resend value for this RecipientCorrection.
     * 
     * @return resend
     */
    public java.lang.Boolean getResend() {
        return resend;
    }


    /**
     * Sets the resend value for this RecipientCorrection.
     * 
     * @param resend
     */
    public void setResend(java.lang.Boolean resend) {
        this.resend = resend;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientCorrection)) return false;
        RecipientCorrection other = (RecipientCorrection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.previousUserName==null && other.getPreviousUserName()==null) || 
             (this.previousUserName!=null &&
              this.previousUserName.equals(other.getPreviousUserName()))) &&
            ((this.previousEmail==null && other.getPreviousEmail()==null) || 
             (this.previousEmail!=null &&
              this.previousEmail.equals(other.getPreviousEmail()))) &&
            ((this.previousRoutingOrder==null && other.getPreviousRoutingOrder()==null) || 
             (this.previousRoutingOrder!=null &&
              this.previousRoutingOrder.equals(other.getPreviousRoutingOrder()))) &&
            ((this.previousSignerName==null && other.getPreviousSignerName()==null) || 
             (this.previousSignerName!=null &&
              this.previousSignerName.equals(other.getPreviousSignerName()))) &&
            ((this.correctedUserName==null && other.getCorrectedUserName()==null) || 
             (this.correctedUserName!=null &&
              this.correctedUserName.equals(other.getCorrectedUserName()))) &&
            ((this.correctedSignerName==null && other.getCorrectedSignerName()==null) || 
             (this.correctedSignerName!=null &&
              this.correctedSignerName.equals(other.getCorrectedSignerName()))) &&
            ((this.correctedEmail==null && other.getCorrectedEmail()==null) || 
             (this.correctedEmail!=null &&
              this.correctedEmail.equals(other.getCorrectedEmail()))) &&
            ((this.correctedCaptiveInfo==null && other.getCorrectedCaptiveInfo()==null) || 
             (this.correctedCaptiveInfo!=null &&
              this.correctedCaptiveInfo.equals(other.getCorrectedCaptiveInfo()))) &&
            ((this.correctedAccessCode==null && other.getCorrectedAccessCode()==null) || 
             (this.correctedAccessCode!=null &&
              this.correctedAccessCode.equals(other.getCorrectedAccessCode()))) &&
            ((this.correctedAccessCodeRequired==null && other.getCorrectedAccessCodeRequired()==null) || 
             (this.correctedAccessCodeRequired!=null &&
              this.correctedAccessCodeRequired.equals(other.getCorrectedAccessCodeRequired()))) &&
            ((this.correctedRequireIDLookup==null && other.getCorrectedRequireIDLookup()==null) || 
             (this.correctedRequireIDLookup!=null &&
              this.correctedRequireIDLookup.equals(other.getCorrectedRequireIDLookup()))) &&
            ((this.correctedIDCheckConfigurationName==null && other.getCorrectedIDCheckConfigurationName()==null) || 
             (this.correctedIDCheckConfigurationName!=null &&
              this.correctedIDCheckConfigurationName.equals(other.getCorrectedIDCheckConfigurationName()))) &&
            ((this.correctedRoutingOrder==null && other.getCorrectedRoutingOrder()==null) || 
             (this.correctedRoutingOrder!=null &&
              this.correctedRoutingOrder.equals(other.getCorrectedRoutingOrder()))) &&
            ((this.correctedAutoNavigation==null && other.getCorrectedAutoNavigation()==null) || 
             (this.correctedAutoNavigation!=null &&
              this.correctedAutoNavigation.equals(other.getCorrectedAutoNavigation()))) &&
            ((this.correctedIDCheckInformationInput==null && other.getCorrectedIDCheckInformationInput()==null) || 
             (this.correctedIDCheckInformationInput!=null &&
              this.correctedIDCheckInformationInput.equals(other.getCorrectedIDCheckInformationInput()))) &&
            ((this.resend==null && other.getResend()==null) || 
             (this.resend!=null &&
              this.resend.equals(other.getResend())));
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
        if (getPreviousUserName() != null) {
            _hashCode += getPreviousUserName().hashCode();
        }
        if (getPreviousEmail() != null) {
            _hashCode += getPreviousEmail().hashCode();
        }
        if (getPreviousRoutingOrder() != null) {
            _hashCode += getPreviousRoutingOrder().hashCode();
        }
        if (getPreviousSignerName() != null) {
            _hashCode += getPreviousSignerName().hashCode();
        }
        if (getCorrectedUserName() != null) {
            _hashCode += getCorrectedUserName().hashCode();
        }
        if (getCorrectedSignerName() != null) {
            _hashCode += getCorrectedSignerName().hashCode();
        }
        if (getCorrectedEmail() != null) {
            _hashCode += getCorrectedEmail().hashCode();
        }
        if (getCorrectedCaptiveInfo() != null) {
            _hashCode += getCorrectedCaptiveInfo().hashCode();
        }
        if (getCorrectedAccessCode() != null) {
            _hashCode += getCorrectedAccessCode().hashCode();
        }
        if (getCorrectedAccessCodeRequired() != null) {
            _hashCode += getCorrectedAccessCodeRequired().hashCode();
        }
        if (getCorrectedRequireIDLookup() != null) {
            _hashCode += getCorrectedRequireIDLookup().hashCode();
        }
        if (getCorrectedIDCheckConfigurationName() != null) {
            _hashCode += getCorrectedIDCheckConfigurationName().hashCode();
        }
        if (getCorrectedRoutingOrder() != null) {
            _hashCode += getCorrectedRoutingOrder().hashCode();
        }
        if (getCorrectedAutoNavigation() != null) {
            _hashCode += getCorrectedAutoNavigation().hashCode();
        }
        if (getCorrectedIDCheckInformationInput() != null) {
            _hashCode += getCorrectedIDCheckInformationInput().hashCode();
        }
        if (getResend() != null) {
            _hashCode += getResend().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecipientCorrection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PreviousUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PreviousEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousRoutingOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PreviousRoutingOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousSignerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PreviousSignerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedSignerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedSignerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedCaptiveInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedCaptiveInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrectionCorrectedCaptiveInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedAccessCodeRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedAccessCodeRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedRequireIDLookup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedRequireIDLookup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedIDCheckConfigurationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedIDCheckConfigurationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedRoutingOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedRoutingOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedAutoNavigation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedAutoNavigation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctedIDCheckInformationInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectedIDCheckInformationInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformationInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resend");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Resend"));
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
