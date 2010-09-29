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
 * TemplateReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package net.docusign.www.api._3_0;
            

            /**
            *  TemplateReference bean class
            */
        
        public  class TemplateReference
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TemplateReference
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
                        * field for TemplateLocation
                        */

                        
                                    protected net.docusign.www.api._3_0.TemplateLocationCode localTemplateLocation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTemplateLocationTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.TemplateLocationCode
                           */
                           public  net.docusign.www.api._3_0.TemplateLocationCode getTemplateLocation(){
                               return localTemplateLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TemplateLocation
                               */
                               public void setTemplateLocation(net.docusign.www.api._3_0.TemplateLocationCode param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTemplateLocationTracker = true;
                                       } else {
                                          localTemplateLocationTracker = false;
                                              
                                       }
                                   
                                            this.localTemplateLocation=param;
                                    

                               }
                            

                        /**
                        * field for Template
                        */

                        
                                    protected java.lang.String localTemplate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTemplateTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTemplate(){
                               return localTemplate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Template
                               */
                               public void setTemplate(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTemplateTracker = true;
                                       } else {
                                          localTemplateTracker = false;
                                              
                                       }
                                   
                                            this.localTemplate=param;
                                    

                               }
                            

                        /**
                        * field for Document
                        */

                        
                                    protected net.docusign.www.api._3_0.Document localDocument ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDocumentTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.Document
                           */
                           public  net.docusign.www.api._3_0.Document getDocument(){
                               return localDocument;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Document
                               */
                               public void setDocument(net.docusign.www.api._3_0.Document param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDocumentTracker = true;
                                       } else {
                                          localDocumentTracker = false;
                                              
                                       }
                                   
                                            this.localDocument=param;
                                    

                               }
                            

                        /**
                        * field for RoleAssignments
                        */

                        
                                    protected net.docusign.www.api._3_0.ArrayOfTemplateReferenceRoleAssignment localRoleAssignments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoleAssignmentsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.ArrayOfTemplateReferenceRoleAssignment
                           */
                           public  net.docusign.www.api._3_0.ArrayOfTemplateReferenceRoleAssignment getRoleAssignments(){
                               return localRoleAssignments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoleAssignments
                               */
                               public void setRoleAssignments(net.docusign.www.api._3_0.ArrayOfTemplateReferenceRoleAssignment param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRoleAssignmentsTracker = true;
                                       } else {
                                          localRoleAssignmentsTracker = false;
                                              
                                       }
                                   
                                            this.localRoleAssignments=param;
                                    

                               }
                            

                        /**
                        * field for FieldData
                        */

                        
                                    protected net.docusign.www.api._3_0.TemplateReferenceFieldData localFieldData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFieldDataTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.TemplateReferenceFieldData
                           */
                           public  net.docusign.www.api._3_0.TemplateReferenceFieldData getFieldData(){
                               return localFieldData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FieldData
                               */
                               public void setFieldData(net.docusign.www.api._3_0.TemplateReferenceFieldData param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localFieldDataTracker = true;
                                       } else {
                                          localFieldDataTracker = false;
                                              
                                       }
                                   
                                            this.localFieldData=param;
                                    

                               }
                            

                        /**
                        * field for AdditionalTabs
                        */

                        
                                    protected net.docusign.www.api._3_0.ArrayOfTab localAdditionalTabs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdditionalTabsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.ArrayOfTab
                           */
                           public  net.docusign.www.api._3_0.ArrayOfTab getAdditionalTabs(){
                               return localAdditionalTabs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdditionalTabs
                               */
                               public void setAdditionalTabs(net.docusign.www.api._3_0.ArrayOfTab param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAdditionalTabsTracker = true;
                                       } else {
                                          localAdditionalTabsTracker = false;
                                              
                                       }
                                   
                                            this.localAdditionalTabs=param;
                                    

                               }
                            

                        /**
                        * field for Sequence
                        */

                        
                                    protected org.apache.axis2.databinding.types.PositiveInteger localSequence ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSequenceTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.PositiveInteger
                           */
                           public  org.apache.axis2.databinding.types.PositiveInteger getSequence(){
                               return localSequence;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Sequence
                               */
                               public void setSequence(org.apache.axis2.databinding.types.PositiveInteger param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSequenceTracker = true;
                                       } else {
                                          localSequenceTracker = false;
                                              
                                       }
                                   
                                            this.localSequence=param;
                                    

                               }
                            

                        /**
                        * field for TemplateAttachments
                        */

                        
                                    protected net.docusign.www.api._3_0.ArrayOfAttachment localTemplateAttachments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTemplateAttachmentsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.ArrayOfAttachment
                           */
                           public  net.docusign.www.api._3_0.ArrayOfAttachment getTemplateAttachments(){
                               return localTemplateAttachments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TemplateAttachments
                               */
                               public void setTemplateAttachments(net.docusign.www.api._3_0.ArrayOfAttachment param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTemplateAttachmentsTracker = true;
                                       } else {
                                          localTemplateAttachmentsTracker = false;
                                              
                                       }
                                   
                                            this.localTemplateAttachments=param;
                                    

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
                       TemplateReference.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":TemplateReference",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TemplateReference",
                           xmlWriter);
                   }

               
                   }
                if (localTemplateLocationTracker){
                                            if (localTemplateLocation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TemplateLocation cannot be null!!");
                                            }
                                           localTemplateLocation.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","TemplateLocation"),
                                               factory,xmlWriter);
                                        } if (localTemplateTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Template", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Template");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Template");
                                    }
                                

                                          if (localTemplate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Template cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTemplate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDocumentTracker){
                                            if (localDocument==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Document cannot be null!!");
                                            }
                                           localDocument.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Document"),
                                               factory,xmlWriter);
                                        } if (localRoleAssignmentsTracker){
                                            if (localRoleAssignments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoleAssignments cannot be null!!");
                                            }
                                           localRoleAssignments.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","RoleAssignments"),
                                               factory,xmlWriter);
                                        } if (localFieldDataTracker){
                                            if (localFieldData==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FieldData cannot be null!!");
                                            }
                                           localFieldData.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","FieldData"),
                                               factory,xmlWriter);
                                        } if (localAdditionalTabsTracker){
                                            if (localAdditionalTabs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AdditionalTabs cannot be null!!");
                                            }
                                           localAdditionalTabs.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","AdditionalTabs"),
                                               factory,xmlWriter);
                                        } if (localSequenceTracker){
                                    namespace = "http://www.docusign.net/API/3.0";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Sequence", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Sequence");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Sequence");
                                    }
                                

                                          if (localSequence==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Sequence cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequence));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTemplateAttachmentsTracker){
                                            if (localTemplateAttachments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TemplateAttachments cannot be null!!");
                                            }
                                           localTemplateAttachments.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","TemplateAttachments"),
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

                 if (localTemplateLocationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "TemplateLocation"));
                            
                            
                                    if (localTemplateLocation==null){
                                         throw new org.apache.axis2.databinding.ADBException("TemplateLocation cannot be null!!");
                                    }
                                    elementList.add(localTemplateLocation);
                                } if (localTemplateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Template"));
                                 
                                        if (localTemplate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Template cannot be null!!");
                                        }
                                    } if (localDocumentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Document"));
                            
                            
                                    if (localDocument==null){
                                         throw new org.apache.axis2.databinding.ADBException("Document cannot be null!!");
                                    }
                                    elementList.add(localDocument);
                                } if (localRoleAssignmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "RoleAssignments"));
                            
                            
                                    if (localRoleAssignments==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoleAssignments cannot be null!!");
                                    }
                                    elementList.add(localRoleAssignments);
                                } if (localFieldDataTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "FieldData"));
                            
                            
                                    if (localFieldData==null){
                                         throw new org.apache.axis2.databinding.ADBException("FieldData cannot be null!!");
                                    }
                                    elementList.add(localFieldData);
                                } if (localAdditionalTabsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "AdditionalTabs"));
                            
                            
                                    if (localAdditionalTabs==null){
                                         throw new org.apache.axis2.databinding.ADBException("AdditionalTabs cannot be null!!");
                                    }
                                    elementList.add(localAdditionalTabs);
                                } if (localSequenceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Sequence"));
                                 
                                        if (localSequence != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequence));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Sequence cannot be null!!");
                                        }
                                    } if (localTemplateAttachmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "TemplateAttachments"));
                            
                            
                                    if (localTemplateAttachments==null){
                                         throw new org.apache.axis2.databinding.ADBException("TemplateAttachments cannot be null!!");
                                    }
                                    elementList.add(localTemplateAttachments);
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
        public static TemplateReference parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TemplateReference object =
                new TemplateReference();

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
                    
                            if (!"TemplateReference".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TemplateReference)net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","TemplateLocation").equals(reader.getName())){
                                
                                                object.setTemplateLocation(net.docusign.www.api._3_0.TemplateLocationCode.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Template").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTemplate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Document").equals(reader.getName())){
                                
                                                object.setDocument(net.docusign.www.api._3_0.Document.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","RoleAssignments").equals(reader.getName())){
                                
                                                object.setRoleAssignments(net.docusign.www.api._3_0.ArrayOfTemplateReferenceRoleAssignment.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","FieldData").equals(reader.getName())){
                                
                                                object.setFieldData(net.docusign.www.api._3_0.TemplateReferenceFieldData.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","AdditionalTabs").equals(reader.getName())){
                                
                                                object.setAdditionalTabs(net.docusign.www.api._3_0.ArrayOfTab.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Sequence").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSequence(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToPositiveInteger(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","TemplateAttachments").equals(reader.getName())){
                                
                                                object.setTemplateAttachments(net.docusign.www.api._3_0.ArrayOfAttachment.Factory.parse(reader));
                                              
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
           
          