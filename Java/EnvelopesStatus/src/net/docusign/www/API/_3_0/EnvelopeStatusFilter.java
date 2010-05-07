/**
 * EnvelopeStatusFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeStatusFilter  implements java.io.Serializable {
    private net.docusign.www.API._3_0.UserInfo userInfo;

    private java.lang.String accountId;

    private net.docusign.www.API._3_0.EnvelopeStatusFilterBeginDateTime beginDateTime;

    private java.util.Calendar endDateTime;

    private net.docusign.www.API._3_0.EnvelopeStatusCode[] statuses;

    private java.lang.String[] envelopeIds;

    private org.apache.axis.types.NonNegativeInteger startAtIndex;

    private net.docusign.www.API._3_0.EnvelopeACStatusCode ACStatus;

    public EnvelopeStatusFilter() {
    }

    public EnvelopeStatusFilter(
           net.docusign.www.API._3_0.UserInfo userInfo,
           java.lang.String accountId,
           net.docusign.www.API._3_0.EnvelopeStatusFilterBeginDateTime beginDateTime,
           java.util.Calendar endDateTime,
           net.docusign.www.API._3_0.EnvelopeStatusCode[] statuses,
           java.lang.String[] envelopeIds,
           org.apache.axis.types.NonNegativeInteger startAtIndex,
           net.docusign.www.API._3_0.EnvelopeACStatusCode ACStatus) {
           this.userInfo = userInfo;
           this.accountId = accountId;
           this.beginDateTime = beginDateTime;
           this.endDateTime = endDateTime;
           this.statuses = statuses;
           this.envelopeIds = envelopeIds;
           this.startAtIndex = startAtIndex;
           this.ACStatus = ACStatus;
    }


    /**
     * Gets the userInfo value for this EnvelopeStatusFilter.
     * 
     * @return userInfo
     */
    public net.docusign.www.API._3_0.UserInfo getUserInfo() {
        return userInfo;
    }


    /**
     * Sets the userInfo value for this EnvelopeStatusFilter.
     * 
     * @param userInfo
     */
    public void setUserInfo(net.docusign.www.API._3_0.UserInfo userInfo) {
        this.userInfo = userInfo;
    }


    /**
     * Gets the accountId value for this EnvelopeStatusFilter.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this EnvelopeStatusFilter.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the beginDateTime value for this EnvelopeStatusFilter.
     * 
     * @return beginDateTime
     */
    public net.docusign.www.API._3_0.EnvelopeStatusFilterBeginDateTime getBeginDateTime() {
        return beginDateTime;
    }


    /**
     * Sets the beginDateTime value for this EnvelopeStatusFilter.
     * 
     * @param beginDateTime
     */
    public void setBeginDateTime(net.docusign.www.API._3_0.EnvelopeStatusFilterBeginDateTime beginDateTime) {
        this.beginDateTime = beginDateTime;
    }


    /**
     * Gets the endDateTime value for this EnvelopeStatusFilter.
     * 
     * @return endDateTime
     */
    public java.util.Calendar getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this EnvelopeStatusFilter.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.util.Calendar endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the statuses value for this EnvelopeStatusFilter.
     * 
     * @return statuses
     */
    public net.docusign.www.API._3_0.EnvelopeStatusCode[] getStatuses() {
        return statuses;
    }


    /**
     * Sets the statuses value for this EnvelopeStatusFilter.
     * 
     * @param statuses
     */
    public void setStatuses(net.docusign.www.API._3_0.EnvelopeStatusCode[] statuses) {
        this.statuses = statuses;
    }


    /**
     * Gets the envelopeIds value for this EnvelopeStatusFilter.
     * 
     * @return envelopeIds
     */
    public java.lang.String[] getEnvelopeIds() {
        return envelopeIds;
    }


    /**
     * Sets the envelopeIds value for this EnvelopeStatusFilter.
     * 
     * @param envelopeIds
     */
    public void setEnvelopeIds(java.lang.String[] envelopeIds) {
        this.envelopeIds = envelopeIds;
    }


    /**
     * Gets the startAtIndex value for this EnvelopeStatusFilter.
     * 
     * @return startAtIndex
     */
    public org.apache.axis.types.NonNegativeInteger getStartAtIndex() {
        return startAtIndex;
    }


    /**
     * Sets the startAtIndex value for this EnvelopeStatusFilter.
     * 
     * @param startAtIndex
     */
    public void setStartAtIndex(org.apache.axis.types.NonNegativeInteger startAtIndex) {
        this.startAtIndex = startAtIndex;
    }


    /**
     * Gets the ACStatus value for this EnvelopeStatusFilter.
     * 
     * @return ACStatus
     */
    public net.docusign.www.API._3_0.EnvelopeACStatusCode getACStatus() {
        return ACStatus;
    }


    /**
     * Sets the ACStatus value for this EnvelopeStatusFilter.
     * 
     * @param ACStatus
     */
    public void setACStatus(net.docusign.www.API._3_0.EnvelopeACStatusCode ACStatus) {
        this.ACStatus = ACStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeStatusFilter)) return false;
        EnvelopeStatusFilter other = (EnvelopeStatusFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userInfo==null && other.getUserInfo()==null) || 
             (this.userInfo!=null &&
              this.userInfo.equals(other.getUserInfo()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.beginDateTime==null && other.getBeginDateTime()==null) || 
             (this.beginDateTime!=null &&
              this.beginDateTime.equals(other.getBeginDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.statuses==null && other.getStatuses()==null) || 
             (this.statuses!=null &&
              java.util.Arrays.equals(this.statuses, other.getStatuses()))) &&
            ((this.envelopeIds==null && other.getEnvelopeIds()==null) || 
             (this.envelopeIds!=null &&
              java.util.Arrays.equals(this.envelopeIds, other.getEnvelopeIds()))) &&
            ((this.startAtIndex==null && other.getStartAtIndex()==null) || 
             (this.startAtIndex!=null &&
              this.startAtIndex.equals(other.getStartAtIndex()))) &&
            ((this.ACStatus==null && other.getACStatus()==null) || 
             (this.ACStatus!=null &&
              this.ACStatus.equals(other.getACStatus())));
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
        if (getUserInfo() != null) {
            _hashCode += getUserInfo().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getBeginDateTime() != null) {
            _hashCode += getBeginDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnvelopeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvelopeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvelopeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartAtIndex() != null) {
            _hashCode += getStartAtIndex().hashCode();
        }
        if (getACStatus() != null) {
            _hashCode += getACStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeStatusFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BeginDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilterBeginDateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statuses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Statuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startAtIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "StartAtIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ACStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeACStatusCode"));
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
