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
 * FolderItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package net.docusign.www.api._3_0;
            

            /**
            *  FolderItem bean class
            */
        
        public  class FolderItem
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = FolderItem
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
                        * field for EnvelopeId
                        */

                        
                                    protected java.lang.String localEnvelopeId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEnvelopeIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEnvelopeId(){
                               return localEnvelopeId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnvelopeId
                               */
                               public void setEnvelopeId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localEnvelopeIdTracker = true;
                                       } else {
                                          localEnvelopeIdTracker = false;
                                              
                                       }
                                   
                                            this.localEnvelopeId=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        */

                        
                                    protected net.docusign.www.api._3_0.EnvelopeStatusCode localStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.EnvelopeStatusCode
                           */
                           public  net.docusign.www.api._3_0.EnvelopeStatusCode getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(net.docusign.www.api._3_0.EnvelopeStatusCode param){
                            
                                            this.localStatus=param;
                                    

                               }
                            

                        /**
                        * field for Owner
                        */

                        
                                    protected java.lang.String localOwner ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOwnerTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOwner(){
                               return localOwner;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Owner
                               */
                               public void setOwner(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOwnerTracker = true;
                                       } else {
                                          localOwnerTracker = false;
                                              
                                       }
                                   
                                            this.localOwner=param;
                                    

                               }
                            

                        /**
                        * field for SenderName
                        */

                        
                                    protected java.lang.String localSenderName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderName(){
                               return localSenderName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderName
                               */
                               public void setSenderName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderNameTracker = true;
                                       } else {
                                          localSenderNameTracker = false;
                                              
                                       }
                                   
                                            this.localSenderName=param;
                                    

                               }
                            

                        /**
                        * field for SenderEmail
                        */

                        
                                    protected java.lang.String localSenderEmail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderEmailTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderEmail(){
                               return localSenderEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderEmail
                               */
                               public void setSenderEmail(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderEmailTracker = true;
                                       } else {
                                          localSenderEmailTracker = false;
                                              
                                       }
                                   
                                            this.localSenderEmail=param;
                                    

                               }
                            

                        /**
                        * field for SenderCompany
                        */

                        
                                    protected java.lang.String localSenderCompany ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderCompanyTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderCompany(){
                               return localSenderCompany;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderCompany
                               */
                               public void setSenderCompany(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSenderCompanyTracker = true;
                                       } else {
                                          localSenderCompanyTracker = false;
                                              
                                       }
                                   
                                            this.localSenderCompany=param;
                                    

                               }
                            

                        /**
                        * field for RecipientStatuses
                        */

                        
                                    protected net.docusign.www.api._3_0.ArrayOfRecipientStatus localRecipientStatuses ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRecipientStatusesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.ArrayOfRecipientStatus
                           */
                           public  net.docusign.www.api._3_0.ArrayOfRecipientStatus getRecipientStatuses(){
                               return localRecipientStatuses;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RecipientStatuses
                               */
                               public void setRecipientStatuses(net.docusign.www.api._3_0.ArrayOfRecipientStatus param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRecipientStatusesTracker = true;
                                       } else {
                                          localRecipientStatusesTracker = false;
                                              
                                       }
                                   
                                            this.localRecipientStatuses=param;
                                    

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
                        * field for Created
                        */

                        
                                    protected java.util.Calendar localCreated ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreatedTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCreated(){
                               return localCreated;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Created
                               */
                               public void setCreated(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCreatedTracker = true;
                                       } else {
                                          localCreatedTracker = false;
                                              
                                       }
                                   
                                            this.localCreated=param;
                                    

                               }
                            

                        /**
                        * field for Sent
                        */

                        
                                    protected java.util.Calendar localSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSentTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getSent(){
                               return localSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Sent
                               */
                               public void setSent(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSentTracker = true;
                                       } else {
                                          localSentTracker = false;
                                              
                                       }
                                   
                                            this.localSent=param;
                                    

                               }
                            

                        /**
                        * field for Completed
                        */

                        
                                    protected java.util.Calendar localCompleted ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCompletedTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCompleted(){
                               return localCompleted;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Completed
                               */
                               public void setCompleted(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCompletedTracker = true;
                                       } else {
                                          localCompletedTracker = false;
                                              
                                       }
                                   
                                            this.localCompleted=param;
                                    

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
                       FolderItem.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":FolderItem",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "FolderItem",
                           xmlWriter);
                   }

               
                   }
                if (localEnvelopeIdTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"EnvelopeId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"EnvelopeId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("EnvelopeId");
                                    }
                                

                                          if (localEnvelopeId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("EnvelopeId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEnvelopeId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
                                            }
                                           localStatus.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Status"),
                                               factory,xmlWriter);
                                         if (localOwnerTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Owner", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Owner");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Owner");
                                    }
                                

                                          if (localOwner==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOwner);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderNameTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderName");
                                    }
                                

                                          if (localSenderName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderEmailTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderEmail", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderEmail");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderEmail");
                                    }
                                

                                          if (localSenderEmail==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderEmail cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderCompanyTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SenderCompany", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SenderCompany");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SenderCompany");
                                    }
                                

                                          if (localSenderCompany==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderCompany cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderCompany);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRecipientStatusesTracker){
                                            if (localRecipientStatuses==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RecipientStatuses cannot be null!!");
                                            }
                                           localRecipientStatuses.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","RecipientStatuses"),
                                               factory,xmlWriter);
                                        } if (localCustomFieldsTracker){
                                            if (localCustomFields==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                            }
                                           localCustomFields.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","CustomFields"),
                                               factory,xmlWriter);
                                        } if (localCreatedTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Created", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Created");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Created");
                                    }
                                

                                          if (localCreated==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Created cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreated));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSentTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Sent", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Sent");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Sent");
                                    }
                                

                                          if (localSent==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Sent cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSent));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCompletedTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Completed", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Completed");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Completed");
                                    }
                                

                                          if (localCompleted==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Completed cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompleted));
                                            
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

                 if (localEnvelopeIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "EnvelopeId"));
                                 
                                        if (localEnvelopeId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnvelopeId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("EnvelopeId cannot be null!!");
                                        }
                                    }
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Status"));
                            
                            
                                    if (localStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
                                    }
                                    elementList.add(localStatus);
                                 if (localOwnerTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Owner"));
                                 
                                        if (localOwner != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOwner));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");
                                        }
                                    } if (localSenderNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "SenderName"));
                                 
                                        if (localSenderName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderName cannot be null!!");
                                        }
                                    } if (localSenderEmailTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "SenderEmail"));
                                 
                                        if (localSenderEmail != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderEmail));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderEmail cannot be null!!");
                                        }
                                    } if (localSenderCompanyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "SenderCompany"));
                                 
                                        if (localSenderCompany != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderCompany));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderCompany cannot be null!!");
                                        }
                                    } if (localRecipientStatusesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "RecipientStatuses"));
                            
                            
                                    if (localRecipientStatuses==null){
                                         throw new org.apache.axis2.databinding.ADBException("RecipientStatuses cannot be null!!");
                                    }
                                    elementList.add(localRecipientStatuses);
                                } if (localCustomFieldsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "CustomFields"));
                            
                            
                                    if (localCustomFields==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                    }
                                    elementList.add(localCustomFields);
                                } if (localCreatedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Created"));
                                 
                                        if (localCreated != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreated));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Created cannot be null!!");
                                        }
                                    } if (localSentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Sent"));
                                 
                                        if (localSent != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSent));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Sent cannot be null!!");
                                        }
                                    } if (localCompletedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Completed"));
                                 
                                        if (localCompleted != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompleted));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Completed cannot be null!!");
                                        }
                                    } if (localSubjectTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Subject"));
                                 
                                        if (localSubject != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubject));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Subject cannot be null!!");
                                        }
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
        public static FolderItem parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            FolderItem object =
                new FolderItem();

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
                    
                            if (!"FolderItem".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (FolderItem)net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","EnvelopeId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnvelopeId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Status").equals(reader.getName())){
                                
                                                object.setStatus(net.docusign.www.api._3_0.EnvelopeStatusCode.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Owner").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOwner(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","SenderName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","SenderEmail").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderEmail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","SenderCompany").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderCompany(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","RecipientStatuses").equals(reader.getName())){
                                
                                                object.setRecipientStatuses(net.docusign.www.api._3_0.ArrayOfRecipientStatus.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Created").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreated(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Sent").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Completed").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCompleted(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
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
           
          