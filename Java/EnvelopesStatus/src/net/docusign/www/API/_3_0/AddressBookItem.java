/**
 * AddressBookItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class AddressBookItem  implements java.io.Serializable {
    private java.lang.String addressBookID;

    private java.lang.String email;

    private java.lang.String userName;

    private java.lang.String accountName;

    private boolean shared;

    private java.util.Calendar created;

    private java.lang.Boolean owner;

    private net.docusign.www.API._3_0.AddressBookPhoneNumber phone1;

    private net.docusign.www.API._3_0.AddressBookPhoneNumber phone2;

    private net.docusign.www.API._3_0.AddressBookPhoneNumber phone3;

    private net.docusign.www.API._3_0.AddressBookPhoneNumber phone4;

    public AddressBookItem() {
    }

    public AddressBookItem(
           java.lang.String addressBookID,
           java.lang.String email,
           java.lang.String userName,
           java.lang.String accountName,
           boolean shared,
           java.util.Calendar created,
           java.lang.Boolean owner,
           net.docusign.www.API._3_0.AddressBookPhoneNumber phone1,
           net.docusign.www.API._3_0.AddressBookPhoneNumber phone2,
           net.docusign.www.API._3_0.AddressBookPhoneNumber phone3,
           net.docusign.www.API._3_0.AddressBookPhoneNumber phone4) {
           this.addressBookID = addressBookID;
           this.email = email;
           this.userName = userName;
           this.accountName = accountName;
           this.shared = shared;
           this.created = created;
           this.owner = owner;
           this.phone1 = phone1;
           this.phone2 = phone2;
           this.phone3 = phone3;
           this.phone4 = phone4;
    }


    /**
     * Gets the addressBookID value for this AddressBookItem.
     * 
     * @return addressBookID
     */
    public java.lang.String getAddressBookID() {
        return addressBookID;
    }


    /**
     * Sets the addressBookID value for this AddressBookItem.
     * 
     * @param addressBookID
     */
    public void setAddressBookID(java.lang.String addressBookID) {
        this.addressBookID = addressBookID;
    }


    /**
     * Gets the email value for this AddressBookItem.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this AddressBookItem.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the userName value for this AddressBookItem.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this AddressBookItem.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the accountName value for this AddressBookItem.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this AddressBookItem.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the shared value for this AddressBookItem.
     * 
     * @return shared
     */
    public boolean isShared() {
        return shared;
    }


    /**
     * Sets the shared value for this AddressBookItem.
     * 
     * @param shared
     */
    public void setShared(boolean shared) {
        this.shared = shared;
    }


    /**
     * Gets the created value for this AddressBookItem.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this AddressBookItem.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the owner value for this AddressBookItem.
     * 
     * @return owner
     */
    public java.lang.Boolean getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this AddressBookItem.
     * 
     * @param owner
     */
    public void setOwner(java.lang.Boolean owner) {
        this.owner = owner;
    }


    /**
     * Gets the phone1 value for this AddressBookItem.
     * 
     * @return phone1
     */
    public net.docusign.www.API._3_0.AddressBookPhoneNumber getPhone1() {
        return phone1;
    }


    /**
     * Sets the phone1 value for this AddressBookItem.
     * 
     * @param phone1
     */
    public void setPhone1(net.docusign.www.API._3_0.AddressBookPhoneNumber phone1) {
        this.phone1 = phone1;
    }


    /**
     * Gets the phone2 value for this AddressBookItem.
     * 
     * @return phone2
     */
    public net.docusign.www.API._3_0.AddressBookPhoneNumber getPhone2() {
        return phone2;
    }


    /**
     * Sets the phone2 value for this AddressBookItem.
     * 
     * @param phone2
     */
    public void setPhone2(net.docusign.www.API._3_0.AddressBookPhoneNumber phone2) {
        this.phone2 = phone2;
    }


    /**
     * Gets the phone3 value for this AddressBookItem.
     * 
     * @return phone3
     */
    public net.docusign.www.API._3_0.AddressBookPhoneNumber getPhone3() {
        return phone3;
    }


    /**
     * Sets the phone3 value for this AddressBookItem.
     * 
     * @param phone3
     */
    public void setPhone3(net.docusign.www.API._3_0.AddressBookPhoneNumber phone3) {
        this.phone3 = phone3;
    }


    /**
     * Gets the phone4 value for this AddressBookItem.
     * 
     * @return phone4
     */
    public net.docusign.www.API._3_0.AddressBookPhoneNumber getPhone4() {
        return phone4;
    }


    /**
     * Sets the phone4 value for this AddressBookItem.
     * 
     * @param phone4
     */
    public void setPhone4(net.docusign.www.API._3_0.AddressBookPhoneNumber phone4) {
        this.phone4 = phone4;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressBookItem)) return false;
        AddressBookItem other = (AddressBookItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressBookID==null && other.getAddressBookID()==null) || 
             (this.addressBookID!=null &&
              this.addressBookID.equals(other.getAddressBookID()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            this.shared == other.isShared() &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.phone1==null && other.getPhone1()==null) || 
             (this.phone1!=null &&
              this.phone1.equals(other.getPhone1()))) &&
            ((this.phone2==null && other.getPhone2()==null) || 
             (this.phone2!=null &&
              this.phone2.equals(other.getPhone2()))) &&
            ((this.phone3==null && other.getPhone3()==null) || 
             (this.phone3!=null &&
              this.phone3.equals(other.getPhone3()))) &&
            ((this.phone4==null && other.getPhone4()==null) || 
             (this.phone4!=null &&
              this.phone4.equals(other.getPhone4())));
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
        if (getAddressBookID() != null) {
            _hashCode += getAddressBookID().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        _hashCode += (isShared() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getPhone1() != null) {
            _hashCode += getPhone1().hashCode();
        }
        if (getPhone2() != null) {
            _hashCode += getPhone2().hashCode();
        }
        if (getPhone3() != null) {
            _hashCode += getPhone3().hashCode();
        }
        if (getPhone4() != null) {
            _hashCode += getPhone4().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressBookItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressBookID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookID"));
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
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shared");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Shared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookPhoneNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookPhoneNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookPhoneNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Phone4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddressBookPhoneNumber"));
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
