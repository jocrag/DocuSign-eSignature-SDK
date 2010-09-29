/**
 * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
 *
 * This source code is intended only as a supplement to DocuSign SDK
 * and/or on-line documentation.
 * This sample is designed to demonstrate DocuSign features and is not intended
 * for production use. Code and policy for a production application must be
 * developed to meet the specific data and security requirements of the
 * application.
 *
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */

/**
 * EnvelopeInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package net.docusign.www.api._3_0;
            

            /**
            *  EnvelopeInformation bean class
            */
        
        public  class EnvelopeInformation
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = EnvelopeInformation
                Namespace URI = http://www.docusign.net/API/3.0
                Namespace Prefix = ns1
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.docusign.net/API/3.0")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for TransactionID
                        */

                        
                                    protected java.lang.String localTransactionID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransactionID(){
                               return localTransactionID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionID
                               */
                               public void setTransactionID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTransactionIDTracker = true;
                                       } else {
                                          localTransactionIDTracker = false;
                                              
                                       }
                                   
                                            this.localTransactionID=param;
                                    

                               }
                            

                        /**
                        * field for Asynchronous
                        */

                        
                                    protected boolean localAsynchronous ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAsynchronousTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAsynchronous(){
                               return localAsynchronous;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Asynchronous
                               */
                               public void setAsynchronous(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localAsynchronousTracker = false;
                                              
                                       } else {
                                          localAsynchronousTracker = true;
                                       }
                                   
                                            this.localAsynchronous=param;
                                    

                               }
                            

                        /**
                        * field for AccountId
                        */

                        
                                    protected java.lang.String localAccountId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccountIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAccountId(){
                               return localAccountId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountId
                               */
                               public void setAccountId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAccountIdTracker = true;
                                       } else {
                                          localAccountIdTracker = false;
                                              
                                       }
                                   
                                            this.localAccountId=param;
                                    

                               }
                            

                        /**
                        * field for EmailBlurb
                        */

                        
                                    protected java.lang.String localEmailBlurb ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmailBlurbTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEmailBlurb(){
                               return localEmailBlurb;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmailBlurb
                               */
                               public void setEmailBlurb(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localEmailBlurbTracker = true;
                                       } else {
                                          localEmailBlurbTracker = false;
                                              
                                       }
                                   
                                            this.localEmailBlurb=param;
                                    

                               }
                            

                        /**
                        * field for Subject
                        */

                        
                                    protected java.lang.String localSubject ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubjectTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSubject(){
                               return localSubject;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Subject
                               */
                               public void setSubject(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSubjectTracker = true;
                                       } else {
                                          localSubjectTracker = false;
                                              
                                       }
                                   
                                            this.localSubject=param;
                                    

                               }
                            

                        /**
                        * field for SigningLocation
                        */

                        
                                    protected net.docusign.www.api._3_0.SigningLocationCode localSigningLocation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSigningLocationTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.SigningLocationCode
                           */
                           public  net.docusign.www.api._3_0.SigningLocationCode getSigningLocation(){
                               return localSigningLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SigningLocation
                               */
                               public void setSigningLocation(net.docusign.www.api._3_0.SigningLocationCode param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSigningLocationTracker = true;
                                       } else {
                                          localSigningLocationTracker = false;
                                              
                                       }
                                   
                                            this.localSigningLocation=param;
                                    

                               }
                            

                        /**
                        * field for CustomFields
                        */

                        
                                    protected net.docusign.www.api._3_0.ArrayOfCustomField localCustomFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomFieldsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.ArrayOfCustomField
                           */
                           public  net.docusign.www.api._3_0.ArrayOfCustomField getCustomFields(){
                               return localCustomFields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomFields
                               */
                               public void setCustomFields(net.docusign.www.api._3_0.ArrayOfCustomField param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCustomFieldsTracker = true;
                                       } else {
                                          localCustomFieldsTracker = false;
                                              
                                       }
                                   
                                            this.localCustomFields=param;
                                    

                               }
                            

                        /**
                        * field for VaultingOptions
                        */

                        
                                    protected net.docusign.www.api._3_0.VaultingOptions localVaultingOptions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVaultingOptionsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.VaultingOptions
                           */
                           public  net.docusign.www.api._3_0.VaultingOptions getVaultingOptions(){
                               return localVaultingOptions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VaultingOptions
                               */
                               public void setVaultingOptions(net.docusign.www.api._3_0.VaultingOptions param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localVaultingOptionsTracker = true;
                                       } else {
                                          localVaultingOptionsTracker = false;
                                              
                                       }
                                   
                                            this.localVaultingOptions=param;
                                    

                               }
                            

                        /**
                        * field for AutoNavigation
                        */

                        
                                    protected boolean localAutoNavigation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAutoNavigationTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAutoNavigation(){
                               return localAutoNavigation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AutoNavigation
                               */
                               public void setAutoNavigation(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localAutoNavigationTracker = false;
                                              
                                       } else {
                                          localAutoNavigationTracker = true;
                                       }
                                   
                                            this.localAutoNavigation=param;
                                    

                               }
                            

                        /**
                        * field for EnvelopeIdStamping
                        */

                        
                                    protected boolean localEnvelopeIdStamping ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEnvelopeIdStampingTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnvelopeIdStamping(){
                               return localEnvelopeIdStamping;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnvelopeIdStamping
                               */
                               public void setEnvelopeIdStamping(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localEnvelopeIdStampingTracker = false;
                                              
                                       } else {
                                          localEnvelopeIdStampingTracker = true;
                                       }
                                   
                                            this.localEnvelopeIdStamping=param;
                                    

                               }
                            

                        /**
                        * field for AuthoritativeCopy
                        */

                        
                                    protected boolean localAuthoritativeCopy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAuthoritativeCopyTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAuthoritativeCopy(){
                               return localAuthoritativeCopy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AuthoritativeCopy
                               */
                               public void setAuthoritativeCopy(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localAuthoritativeCopyTracker = false;
                                              
                                       } else {
                                          localAuthoritativeCopyTracker = true;
                                       }
                                   
                                            this.localAuthoritativeCopy=param;
                                    

                               }
                            

                        /**
                        * field for Notification
                        */

                        
                                    protected net.docusign.www.api._3_0.Notification localNotification ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNotificationTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.Notification
                           */
                           public  net.docusign.www.api._3_0.Notification getNotification(){
                               return localNotification;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Notification
                               */
                               public void setNotification(net.docusign.www.api._3_0.Notification param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNotificationTracker = true;
                                       } else {
                                          localNotificationTracker = false;
                                              
                                       }
                                   
                                            this.localNotification=param;
                                    

                               }
                            

                        /**
                        * field for EnforceSignerVisibility
                        */

                        
                                    protected boolean localEnforceSignerVisibility ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEnforceSignerVisibilityTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnforceSignerVisibility(){
                               return localEnforceSignerVisibility;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnforceSignerVisibility
                               */
                               public void setEnforceSignerVisibility(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localEnforceSignerVisibilityTracker = false;
                                              
                                       } else {
                                          localEnforceSignerVisibilityTracker = true;
                                       }
                                   
                                            this.localEnforceSignerVisibility=param;
                                    

                               }
                            

                        /**
                        * field for EnableWetSign
                        */

                        
                                    protected boolean localEnableWetSign ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEnableWetSignTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnableWetSign(){
                               return localEnableWetSign;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnableWetSign
                               */
                               public void setEnableWetSign(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localEnableWetSignTracker = false;
                                              
                                       } else {
                                          localEnableWetSignTracker = true;
                                       }
                                   
                                            this.localEnableWetSign=param;
                                    

                               }
                            

                        /**
                        * field for AllowRecipientRecursion
                        */

                        
                                    protected boolean localAllowRecipientRecursion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAllowRecipientRecursionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAllowRecipientRecursion(){
                               return localAllowRecipientRecursion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AllowRecipientRecursion
                               */
                               public void setAllowRecipientRecursion(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localAllowRecipientRecursionTracker = false;
                                              
                                       } else {
                                          localAllowRecipientRecursionTracker = true;
                                       }
                                   
                                            this.localAllowRecipientRecursion=param;
                                    

                               }
                            

                        /**
                        * field for AllowMarkup
                        */

                        
                                    protected boolean localAllowMarkup ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAllowMarkupTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAllowMarkup(){
                               return localAllowMarkup;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AllowMarkup
                               */
                               public void setAllowMarkup(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localAllowMarkupTracker = false;
                                              
                                       } else {
                                          localAllowMarkupTracker = true;
                                       }
                                   
                                            this.localAllowMarkup=param;
                                    

                               }
                            

                        /**
                        * field for EventNotification
                        */

                        
                                    protected net.docusign.www.api._3_0.EventNotification localEventNotification ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEventNotificationTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.EventNotification
                           */
                           public  net.docusign.www.api._3_0.EventNotification getEventNotification(){
                               return localEventNotification;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EventNotification
                               */
                               public void setEventNotification(net.docusign.www.api._3_0.EventNotification param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localEventNotificationTracker = true;
                                       } else {
                                          localEventNotificationTracker = false;
                                              
                                       }
                                   
                                            this.localEventNotification=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
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
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       EnvelopeInformation.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


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
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.docusign.net/API/3.0");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":EnvelopeInformation",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "EnvelopeInformation",
                           xmlWriter);
                   }

               
                   }
                if (localTransactionIDTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TransactionID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TransactionID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TransactionID");
                                    }
                                

                                          if (localTransactionID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TransactionID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTransactionID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAsynchronousTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Asynchronous", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Asynchronous");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Asynchronous");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Asynchronous cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAsynchronous));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAccountIdTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AccountId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AccountId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AccountId");
                                    }
                                

                                          if (localAccountId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("AccountId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAccountId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEmailBlurbTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"EmailBlurb", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"EmailBlurb");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("EmailBlurb");
                                    }
                                

                                          if (localEmailBlurb==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("EmailBlurb cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEmailBlurb);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSubjectTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Subject", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Subject");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Subject");
                                    }
                                

                                          if (localSubject==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Subject cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSubject);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSigningLocationTracker){
                                            if (localSigningLocation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SigningLocation cannot be null!!");
                                            }
                                           localSigningLocation.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","SigningLocation"),
                                               factory,xmlWriter);
                                        } if (localCustomFieldsTracker){
                                            if (localCustomFields==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                            }
                                           localCustomFields.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","CustomFields"),
                                               factory,xmlWriter);
                                        } if (localVaultingOptionsTracker){
                                            if (localVaultingOptions==null){
                                                 throw new org.apache.axis2.databinding.ADBException("VaultingOptions cannot be null!!");
                                            }
                                           localVaultingOptions.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","VaultingOptions"),
                                               factory,xmlWriter);
                                        } if (localAutoNavigationTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AutoNavigation", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AutoNavigation");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AutoNavigation");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AutoNavigation cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoNavigation));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEnvelopeIdStampingTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"EnvelopeIdStamping", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"EnvelopeIdStamping");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("EnvelopeIdStamping");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("EnvelopeIdStamping cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnvelopeIdStamping));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAuthoritativeCopyTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AuthoritativeCopy", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AuthoritativeCopy");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AuthoritativeCopy");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AuthoritativeCopy cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthoritativeCopy));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNotificationTracker){
                                            if (localNotification==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Notification cannot be null!!");
                                            }
                                           localNotification.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Notification"),
                                               factory,xmlWriter);
                                        } if (localEnforceSignerVisibilityTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"EnforceSignerVisibility", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"EnforceSignerVisibility");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("EnforceSignerVisibility");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("EnforceSignerVisibility cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnforceSignerVisibility));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEnableWetSignTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"EnableWetSign", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"EnableWetSign");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("EnableWetSign");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("EnableWetSign cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableWetSign));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAllowRecipientRecursionTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AllowRecipientRecursion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AllowRecipientRecursion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AllowRecipientRecursion");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AllowRecipientRecursion cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowRecipientRecursion));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAllowMarkupTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AllowMarkup", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AllowMarkup");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AllowMarkup");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AllowMarkup cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowMarkup));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEventNotificationTracker){
                                            if (localEventNotification==null){
                                                 throw new org.apache.axis2.databinding.ADBException("EventNotification cannot be null!!");
                                            }
                                           localEventNotification.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","EventNotification"),
                                               factory,xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

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
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
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
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
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
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localTransactionIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "TransactionID"));
                                 
                                        if (localTransactionID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TransactionID cannot be null!!");
                                        }
                                    } if (localAsynchronousTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Asynchronous"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAsynchronous));
                            } if (localAccountIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "AccountId"));
                                 
                                        if (localAccountId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccountId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("AccountId cannot be null!!");
                                        }
                                    } if (localEmailBlurbTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "EmailBlurb"));
                                 
                                        if (localEmailBlurb != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailBlurb));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("EmailBlurb cannot be null!!");
                                        }
                                    } if (localSubjectTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Subject"));
                                 
                                        if (localSubject != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubject));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Subject cannot be null!!");
                                        }
                                    } if (localSigningLocationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "SigningLocation"));
                            
                            
                                    if (localSigningLocation==null){
                                         throw new org.apache.axis2.databinding.ADBException("SigningLocation cannot be null!!");
                                    }
                                    elementList.add(localSigningLocation);
                                } if (localCustomFieldsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "CustomFields"));
                            
                            
                                    if (localCustomFields==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                    }
                                    elementList.add(localCustomFields);
                                } if (localVaultingOptionsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "VaultingOptions"));
                            
                            
                                    if (localVaultingOptions==null){
                                         throw new org.apache.axis2.databinding.ADBException("VaultingOptions cannot be null!!");
                                    }
                                    elementList.add(localVaultingOptions);
                                } if (localAutoNavigationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "AutoNavigation"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoNavigation));
                            } if (localEnvelopeIdStampingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "EnvelopeIdStamping"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnvelopeIdStamping));
                            } if (localAuthoritativeCopyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "AuthoritativeCopy"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthoritativeCopy));
                            } if (localNotificationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Notification"));
                            
                            
                                    if (localNotification==null){
                                         throw new org.apache.axis2.databinding.ADBException("Notification cannot be null!!");
                                    }
                                    elementList.add(localNotification);
                                } if (localEnforceSignerVisibilityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "EnforceSignerVisibility"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnforceSignerVisibility));
                            } if (localEnableWetSignTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "EnableWetSign"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableWetSign));
                            } if (localAllowRecipientRecursionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "AllowRecipientRecursion"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowRecipientRecursion));
                            } if (localAllowMarkupTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "AllowMarkup"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowMarkup));
                            } if (localEventNotificationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "EventNotification"));
                            
                            
                                    if (localEventNotification==null){
                                         throw new org.apache.axis2.databinding.ADBException("EventNotification cannot be null!!");
                                    }
                                    elementList.add(localEventNotification);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static EnvelopeInformation parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            EnvelopeInformation object =
                new EnvelopeInformation();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"EnvelopeInformation".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (EnvelopeInformation)net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","TransactionID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransactionID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Asynchronous").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAsynchronous(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","AccountId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAccountId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","EmailBlurb").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEmailBlurb(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Subject").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSubject(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","SigningLocation").equals(reader.getName())){
                                
                                                object.setSigningLocation(net.docusign.www.api._3_0.SigningLocationCode.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","CustomFields").equals(reader.getName())){
                                
                                                object.setCustomFields(net.docusign.www.api._3_0.ArrayOfCustomField.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","VaultingOptions").equals(reader.getName())){
                                
                                                object.setVaultingOptions(net.docusign.www.api._3_0.VaultingOptions.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","AutoNavigation").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAutoNavigation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","EnvelopeIdStamping").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnvelopeIdStamping(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","AuthoritativeCopy").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAuthoritativeCopy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Notification").equals(reader.getName())){
                                
                                                object.setNotification(net.docusign.www.api._3_0.Notification.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","EnforceSignerVisibility").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnforceSignerVisibility(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","EnableWetSign").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnableWetSign(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","AllowRecipientRecursion").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAllowRecipientRecursion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","AllowMarkup").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAllowMarkup(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","EventNotification").equals(reader.getName())){
                                
                                                object.setEventNotification(net.docusign.www.api._3_0.EventNotification.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          