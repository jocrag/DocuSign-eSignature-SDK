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
 * RequestRecipientTokenClientURLs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package net.docusign.www.api._3_0;
            

            /**
            *  RequestRecipientTokenClientURLs bean class
            */
        
        public  class RequestRecipientTokenClientURLs
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RequestRecipientTokenClientURLs
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
                        * field for OnSigningComplete
                        */

                        
                                    protected java.lang.String localOnSigningComplete ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnSigningCompleteTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOnSigningComplete(){
                               return localOnSigningComplete;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnSigningComplete
                               */
                               public void setOnSigningComplete(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOnSigningCompleteTracker = true;
                                       } else {
                                          localOnSigningCompleteTracker = false;
                                              
                                       }
                                   
                                            this.localOnSigningComplete=param;
                                    

                               }
                            

                        /**
                        * field for OnViewingComplete
                        */

                        
                                    protected java.lang.String localOnViewingComplete ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnViewingCompleteTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOnViewingComplete(){
                               return localOnViewingComplete;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnViewingComplete
                               */
                               public void setOnViewingComplete(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOnViewingCompleteTracker = true;
                                       } else {
                                          localOnViewingCompleteTracker = false;
                                              
                                       }
                                   
                                            this.localOnViewingComplete=param;
                                    

                               }
                            

                        /**
                        * field for OnCancel
                        */

                        
                                    protected java.lang.String localOnCancel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnCancelTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOnCancel(){
                               return localOnCancel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnCancel
                               */
                               public void setOnCancel(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOnCancelTracker = true;
                                       } else {
                                          localOnCancelTracker = false;
                                              
                                       }
                                   
                                            this.localOnCancel=param;
                                    

                               }
                            

                        /**
                        * field for OnDecline
                        */

                        
                                    protected java.lang.String localOnDecline ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnDeclineTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOnDecline(){
                               return localOnDecline;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnDecline
                               */
                               public void setOnDecline(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOnDeclineTracker = true;
                                       } else {
                                          localOnDeclineTracker = false;
                                              
                                       }
                                   
                                            this.localOnDecline=param;
                                    

                               }
                            

                        /**
                        * field for OnSessionTimeout
                        */

                        
                                    protected java.lang.String localOnSessionTimeout ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnSessionTimeoutTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOnSessionTimeout(){
                               return localOnSessionTimeout;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnSessionTimeout
                               */
                               public void setOnSessionTimeout(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOnSessionTimeoutTracker = true;
                                       } else {
                                          localOnSessionTimeoutTracker = false;
                                              
                                       }
                                   
                                            this.localOnSessionTimeout=param;
                                    

                               }
                            

                        /**
                        * field for OnTTLExpired
                        */

                        
                                    protected java.lang.String localOnTTLExpired ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnTTLExpiredTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOnTTLExpired(){
                               return localOnTTLExpired;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnTTLExpired
                               */
                               public void setOnTTLExpired(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOnTTLExpiredTracker = true;
                                       } else {
                                          localOnTTLExpiredTracker = false;
                                              
                                       }
                                   
                                            this.localOnTTLExpired=param;
                                    

                               }
                            

                        /**
                        * field for OnException
                        */

                        
                                    protected java.lang.String localOnException ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnExceptionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOnException(){
                               return localOnException;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnException
                               */
                               public void setOnException(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOnExceptionTracker = true;
                                       } else {
                                          localOnExceptionTracker = false;
                                              
                                       }
                                   
                                            this.localOnException=param;
                                    

                               }
                            

                        /**
                        * field for OnAccessCodeFailed
                        */

                        
                                    protected java.lang.String localOnAccessCodeFailed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnAccessCodeFailedTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOnAccessCodeFailed(){
                               return localOnAccessCodeFailed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnAccessCodeFailed
                               */
                               public void setOnAccessCodeFailed(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOnAccessCodeFailedTracker = true;
                                       } else {
                                          localOnAccessCodeFailedTracker = false;
                                              
                                       }
                                   
                                            this.localOnAccessCodeFailed=param;
                                    

                               }
                            

                        /**
                        * field for OnIdCheckFailed
                        */

                        
                                    protected java.lang.String localOnIdCheckFailed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnIdCheckFailedTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOnIdCheckFailed(){
                               return localOnIdCheckFailed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnIdCheckFailed
                               */
                               public void setOnIdCheckFailed(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOnIdCheckFailedTracker = true;
                                       } else {
                                          localOnIdCheckFailedTracker = false;
                                              
                                       }
                                   
                                            this.localOnIdCheckFailed=param;
                                    

                               }
                            

                        /**
                        * field for OnFaxPending
                        */

                        
                                    protected java.lang.String localOnFaxPending ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnFaxPendingTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOnFaxPending(){
                               return localOnFaxPending;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnFaxPending
                               */
                               public void setOnFaxPending(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOnFaxPendingTracker = true;
                                       } else {
                                          localOnFaxPendingTracker = false;
                                              
                                       }
                                   
                                            this.localOnFaxPending=param;
                                    

                               }
                            

                        /**
                        * field for GenerateSignedDocumentAsynch
                        */

                        
                                    protected boolean localGenerateSignedDocumentAsynch ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGenerateSignedDocumentAsynchTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getGenerateSignedDocumentAsynch(){
                               return localGenerateSignedDocumentAsynch;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GenerateSignedDocumentAsynch
                               */
                               public void setGenerateSignedDocumentAsynch(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localGenerateSignedDocumentAsynchTracker = false;
                                              
                                       } else {
                                          localGenerateSignedDocumentAsynchTracker = true;
                                       }
                                   
                                            this.localGenerateSignedDocumentAsynch=param;
                                    

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
                       RequestRecipientTokenClientURLs.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":RequestRecipientTokenClientURLs",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RequestRecipientTokenClientURLs",
                           xmlWriter);
                   }

               
                   }
                if (localOnSigningCompleteTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OnSigningComplete", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OnSigningComplete");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OnSigningComplete");
                                    }
                                

                                          if (localOnSigningComplete==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("OnSigningComplete cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOnSigningComplete);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOnViewingCompleteTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OnViewingComplete", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OnViewingComplete");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OnViewingComplete");
                                    }
                                

                                          if (localOnViewingComplete==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("OnViewingComplete cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOnViewingComplete);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOnCancelTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OnCancel", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OnCancel");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OnCancel");
                                    }
                                

                                          if (localOnCancel==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("OnCancel cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOnCancel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOnDeclineTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OnDecline", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OnDecline");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OnDecline");
                                    }
                                

                                          if (localOnDecline==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("OnDecline cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOnDecline);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOnSessionTimeoutTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OnSessionTimeout", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OnSessionTimeout");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OnSessionTimeout");
                                    }
                                

                                          if (localOnSessionTimeout==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("OnSessionTimeout cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOnSessionTimeout);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOnTTLExpiredTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OnTTLExpired", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OnTTLExpired");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OnTTLExpired");
                                    }
                                

                                          if (localOnTTLExpired==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("OnTTLExpired cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOnTTLExpired);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOnExceptionTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OnException", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OnException");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OnException");
                                    }
                                

                                          if (localOnException==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("OnException cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOnException);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOnAccessCodeFailedTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OnAccessCodeFailed", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OnAccessCodeFailed");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OnAccessCodeFailed");
                                    }
                                

                                          if (localOnAccessCodeFailed==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("OnAccessCodeFailed cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOnAccessCodeFailed);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOnIdCheckFailedTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OnIdCheckFailed", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OnIdCheckFailed");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OnIdCheckFailed");
                                    }
                                

                                          if (localOnIdCheckFailed==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("OnIdCheckFailed cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOnIdCheckFailed);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOnFaxPendingTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OnFaxPending", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OnFaxPending");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OnFaxPending");
                                    }
                                

                                          if (localOnFaxPending==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("OnFaxPending cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOnFaxPending);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGenerateSignedDocumentAsynchTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"GenerateSignedDocumentAsynch", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"GenerateSignedDocumentAsynch");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("GenerateSignedDocumentAsynch");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("GenerateSignedDocumentAsynch cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGenerateSignedDocumentAsynch));
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

                 if (localOnSigningCompleteTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "OnSigningComplete"));
                                 
                                        if (localOnSigningComplete != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnSigningComplete));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("OnSigningComplete cannot be null!!");
                                        }
                                    } if (localOnViewingCompleteTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "OnViewingComplete"));
                                 
                                        if (localOnViewingComplete != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnViewingComplete));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("OnViewingComplete cannot be null!!");
                                        }
                                    } if (localOnCancelTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "OnCancel"));
                                 
                                        if (localOnCancel != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnCancel));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("OnCancel cannot be null!!");
                                        }
                                    } if (localOnDeclineTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "OnDecline"));
                                 
                                        if (localOnDecline != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnDecline));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("OnDecline cannot be null!!");
                                        }
                                    } if (localOnSessionTimeoutTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "OnSessionTimeout"));
                                 
                                        if (localOnSessionTimeout != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnSessionTimeout));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("OnSessionTimeout cannot be null!!");
                                        }
                                    } if (localOnTTLExpiredTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "OnTTLExpired"));
                                 
                                        if (localOnTTLExpired != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnTTLExpired));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("OnTTLExpired cannot be null!!");
                                        }
                                    } if (localOnExceptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "OnException"));
                                 
                                        if (localOnException != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnException));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("OnException cannot be null!!");
                                        }
                                    } if (localOnAccessCodeFailedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "OnAccessCodeFailed"));
                                 
                                        if (localOnAccessCodeFailed != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnAccessCodeFailed));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("OnAccessCodeFailed cannot be null!!");
                                        }
                                    } if (localOnIdCheckFailedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "OnIdCheckFailed"));
                                 
                                        if (localOnIdCheckFailed != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnIdCheckFailed));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("OnIdCheckFailed cannot be null!!");
                                        }
                                    } if (localOnFaxPendingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "OnFaxPending"));
                                 
                                        if (localOnFaxPending != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnFaxPending));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("OnFaxPending cannot be null!!");
                                        }
                                    } if (localGenerateSignedDocumentAsynchTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "GenerateSignedDocumentAsynch"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGenerateSignedDocumentAsynch));
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
        public static RequestRecipientTokenClientURLs parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RequestRecipientTokenClientURLs object =
                new RequestRecipientTokenClientURLs();

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
                    
                            if (!"RequestRecipientTokenClientURLs".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RequestRecipientTokenClientURLs)net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","OnSigningComplete").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnSigningComplete(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","OnViewingComplete").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnViewingComplete(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","OnCancel").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnCancel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","OnDecline").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnDecline(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","OnSessionTimeout").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnSessionTimeout(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","OnTTLExpired").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnTTLExpired(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","OnException").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnException(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","OnAccessCodeFailed").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnAccessCodeFailed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","OnIdCheckFailed").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnIdCheckFailed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","OnFaxPending").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOnFaxPending(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","GenerateSignedDocumentAsynch").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGenerateSignedDocumentAsynch(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
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
           
          