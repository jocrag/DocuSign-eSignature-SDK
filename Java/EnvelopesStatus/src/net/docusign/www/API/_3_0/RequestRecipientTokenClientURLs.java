/**
 * RequestRecipientTokenClientURLs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestRecipientTokenClientURLs  implements java.io.Serializable {
    private java.lang.String onSigningComplete;

    private java.lang.String onViewingComplete;

    private java.lang.String onCancel;

    private java.lang.String onDecline;

    private java.lang.String onSessionTimeout;

    private java.lang.String onTTLExpired;

    private java.lang.String onException;

    private java.lang.String onAccessCodeFailed;

    private java.lang.String onIdCheckFailed;

    private java.lang.String onFaxPending;

    private java.lang.Boolean generateSignedDocumentAsynch;

    public RequestRecipientTokenClientURLs() {
    }

    public RequestRecipientTokenClientURLs(
           java.lang.String onSigningComplete,
           java.lang.String onViewingComplete,
           java.lang.String onCancel,
           java.lang.String onDecline,
           java.lang.String onSessionTimeout,
           java.lang.String onTTLExpired,
           java.lang.String onException,
           java.lang.String onAccessCodeFailed,
           java.lang.String onIdCheckFailed,
           java.lang.String onFaxPending,
           java.lang.Boolean generateSignedDocumentAsynch) {
           this.onSigningComplete = onSigningComplete;
           this.onViewingComplete = onViewingComplete;
           this.onCancel = onCancel;
           this.onDecline = onDecline;
           this.onSessionTimeout = onSessionTimeout;
           this.onTTLExpired = onTTLExpired;
           this.onException = onException;
           this.onAccessCodeFailed = onAccessCodeFailed;
           this.onIdCheckFailed = onIdCheckFailed;
           this.onFaxPending = onFaxPending;
           this.generateSignedDocumentAsynch = generateSignedDocumentAsynch;
    }


    /**
     * Gets the onSigningComplete value for this RequestRecipientTokenClientURLs.
     * 
     * @return onSigningComplete
     */
    public java.lang.String getOnSigningComplete() {
        return onSigningComplete;
    }


    /**
     * Sets the onSigningComplete value for this RequestRecipientTokenClientURLs.
     * 
     * @param onSigningComplete
     */
    public void setOnSigningComplete(java.lang.String onSigningComplete) {
        this.onSigningComplete = onSigningComplete;
    }


    /**
     * Gets the onViewingComplete value for this RequestRecipientTokenClientURLs.
     * 
     * @return onViewingComplete
     */
    public java.lang.String getOnViewingComplete() {
        return onViewingComplete;
    }


    /**
     * Sets the onViewingComplete value for this RequestRecipientTokenClientURLs.
     * 
     * @param onViewingComplete
     */
    public void setOnViewingComplete(java.lang.String onViewingComplete) {
        this.onViewingComplete = onViewingComplete;
    }


    /**
     * Gets the onCancel value for this RequestRecipientTokenClientURLs.
     * 
     * @return onCancel
     */
    public java.lang.String getOnCancel() {
        return onCancel;
    }


    /**
     * Sets the onCancel value for this RequestRecipientTokenClientURLs.
     * 
     * @param onCancel
     */
    public void setOnCancel(java.lang.String onCancel) {
        this.onCancel = onCancel;
    }


    /**
     * Gets the onDecline value for this RequestRecipientTokenClientURLs.
     * 
     * @return onDecline
     */
    public java.lang.String getOnDecline() {
        return onDecline;
    }


    /**
     * Sets the onDecline value for this RequestRecipientTokenClientURLs.
     * 
     * @param onDecline
     */
    public void setOnDecline(java.lang.String onDecline) {
        this.onDecline = onDecline;
    }


    /**
     * Gets the onSessionTimeout value for this RequestRecipientTokenClientURLs.
     * 
     * @return onSessionTimeout
     */
    public java.lang.String getOnSessionTimeout() {
        return onSessionTimeout;
    }


    /**
     * Sets the onSessionTimeout value for this RequestRecipientTokenClientURLs.
     * 
     * @param onSessionTimeout
     */
    public void setOnSessionTimeout(java.lang.String onSessionTimeout) {
        this.onSessionTimeout = onSessionTimeout;
    }


    /**
     * Gets the onTTLExpired value for this RequestRecipientTokenClientURLs.
     * 
     * @return onTTLExpired
     */
    public java.lang.String getOnTTLExpired() {
        return onTTLExpired;
    }


    /**
     * Sets the onTTLExpired value for this RequestRecipientTokenClientURLs.
     * 
     * @param onTTLExpired
     */
    public void setOnTTLExpired(java.lang.String onTTLExpired) {
        this.onTTLExpired = onTTLExpired;
    }


    /**
     * Gets the onException value for this RequestRecipientTokenClientURLs.
     * 
     * @return onException
     */
    public java.lang.String getOnException() {
        return onException;
    }


    /**
     * Sets the onException value for this RequestRecipientTokenClientURLs.
     * 
     * @param onException
     */
    public void setOnException(java.lang.String onException) {
        this.onException = onException;
    }


    /**
     * Gets the onAccessCodeFailed value for this RequestRecipientTokenClientURLs.
     * 
     * @return onAccessCodeFailed
     */
    public java.lang.String getOnAccessCodeFailed() {
        return onAccessCodeFailed;
    }


    /**
     * Sets the onAccessCodeFailed value for this RequestRecipientTokenClientURLs.
     * 
     * @param onAccessCodeFailed
     */
    public void setOnAccessCodeFailed(java.lang.String onAccessCodeFailed) {
        this.onAccessCodeFailed = onAccessCodeFailed;
    }


    /**
     * Gets the onIdCheckFailed value for this RequestRecipientTokenClientURLs.
     * 
     * @return onIdCheckFailed
     */
    public java.lang.String getOnIdCheckFailed() {
        return onIdCheckFailed;
    }


    /**
     * Sets the onIdCheckFailed value for this RequestRecipientTokenClientURLs.
     * 
     * @param onIdCheckFailed
     */
    public void setOnIdCheckFailed(java.lang.String onIdCheckFailed) {
        this.onIdCheckFailed = onIdCheckFailed;
    }


    /**
     * Gets the onFaxPending value for this RequestRecipientTokenClientURLs.
     * 
     * @return onFaxPending
     */
    public java.lang.String getOnFaxPending() {
        return onFaxPending;
    }


    /**
     * Sets the onFaxPending value for this RequestRecipientTokenClientURLs.
     * 
     * @param onFaxPending
     */
    public void setOnFaxPending(java.lang.String onFaxPending) {
        this.onFaxPending = onFaxPending;
    }


    /**
     * Gets the generateSignedDocumentAsynch value for this RequestRecipientTokenClientURLs.
     * 
     * @return generateSignedDocumentAsynch
     */
    public java.lang.Boolean getGenerateSignedDocumentAsynch() {
        return generateSignedDocumentAsynch;
    }


    /**
     * Sets the generateSignedDocumentAsynch value for this RequestRecipientTokenClientURLs.
     * 
     * @param generateSignedDocumentAsynch
     */
    public void setGenerateSignedDocumentAsynch(java.lang.Boolean generateSignedDocumentAsynch) {
        this.generateSignedDocumentAsynch = generateSignedDocumentAsynch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestRecipientTokenClientURLs)) return false;
        RequestRecipientTokenClientURLs other = (RequestRecipientTokenClientURLs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.onSigningComplete==null && other.getOnSigningComplete()==null) || 
             (this.onSigningComplete!=null &&
              this.onSigningComplete.equals(other.getOnSigningComplete()))) &&
            ((this.onViewingComplete==null && other.getOnViewingComplete()==null) || 
             (this.onViewingComplete!=null &&
              this.onViewingComplete.equals(other.getOnViewingComplete()))) &&
            ((this.onCancel==null && other.getOnCancel()==null) || 
             (this.onCancel!=null &&
              this.onCancel.equals(other.getOnCancel()))) &&
            ((this.onDecline==null && other.getOnDecline()==null) || 
             (this.onDecline!=null &&
              this.onDecline.equals(other.getOnDecline()))) &&
            ((this.onSessionTimeout==null && other.getOnSessionTimeout()==null) || 
             (this.onSessionTimeout!=null &&
              this.onSessionTimeout.equals(other.getOnSessionTimeout()))) &&
            ((this.onTTLExpired==null && other.getOnTTLExpired()==null) || 
             (this.onTTLExpired!=null &&
              this.onTTLExpired.equals(other.getOnTTLExpired()))) &&
            ((this.onException==null && other.getOnException()==null) || 
             (this.onException!=null &&
              this.onException.equals(other.getOnException()))) &&
            ((this.onAccessCodeFailed==null && other.getOnAccessCodeFailed()==null) || 
             (this.onAccessCodeFailed!=null &&
              this.onAccessCodeFailed.equals(other.getOnAccessCodeFailed()))) &&
            ((this.onIdCheckFailed==null && other.getOnIdCheckFailed()==null) || 
             (this.onIdCheckFailed!=null &&
              this.onIdCheckFailed.equals(other.getOnIdCheckFailed()))) &&
            ((this.onFaxPending==null && other.getOnFaxPending()==null) || 
             (this.onFaxPending!=null &&
              this.onFaxPending.equals(other.getOnFaxPending()))) &&
            ((this.generateSignedDocumentAsynch==null && other.getGenerateSignedDocumentAsynch()==null) || 
             (this.generateSignedDocumentAsynch!=null &&
              this.generateSignedDocumentAsynch.equals(other.getGenerateSignedDocumentAsynch())));
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
        if (getOnSigningComplete() != null) {
            _hashCode += getOnSigningComplete().hashCode();
        }
        if (getOnViewingComplete() != null) {
            _hashCode += getOnViewingComplete().hashCode();
        }
        if (getOnCancel() != null) {
            _hashCode += getOnCancel().hashCode();
        }
        if (getOnDecline() != null) {
            _hashCode += getOnDecline().hashCode();
        }
        if (getOnSessionTimeout() != null) {
            _hashCode += getOnSessionTimeout().hashCode();
        }
        if (getOnTTLExpired() != null) {
            _hashCode += getOnTTLExpired().hashCode();
        }
        if (getOnException() != null) {
            _hashCode += getOnException().hashCode();
        }
        if (getOnAccessCodeFailed() != null) {
            _hashCode += getOnAccessCodeFailed().hashCode();
        }
        if (getOnIdCheckFailed() != null) {
            _hashCode += getOnIdCheckFailed().hashCode();
        }
        if (getOnFaxPending() != null) {
            _hashCode += getOnFaxPending().hashCode();
        }
        if (getGenerateSignedDocumentAsynch() != null) {
            _hashCode += getGenerateSignedDocumentAsynch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestRecipientTokenClientURLs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestRecipientTokenClientURLs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onSigningComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OnSigningComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onViewingComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OnViewingComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OnCancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onDecline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OnDecline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onSessionTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OnSessionTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onTTLExpired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OnTTLExpired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onException");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OnException"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onAccessCodeFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OnAccessCodeFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onIdCheckFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OnIdCheckFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onFaxPending");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OnFaxPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateSignedDocumentAsynch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GenerateSignedDocumentAsynch"));
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
