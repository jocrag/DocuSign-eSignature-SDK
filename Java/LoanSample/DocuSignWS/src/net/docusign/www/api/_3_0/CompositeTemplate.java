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
 * CompositeTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package net.docusign.www.api._3_0;
            

            /**
            *  CompositeTemplate bean class
            */
        
        public  class CompositeTemplate
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CompositeTemplate
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
                        * field for ServerTemplates
                        */

                        
                                    protected net.docusign.www.api._3_0.ArrayOfServerTemplate localServerTemplates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerTemplatesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.ArrayOfServerTemplate
                           */
                           public  net.docusign.www.api._3_0.ArrayOfServerTemplate getServerTemplates(){
                               return localServerTemplates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerTemplates
                               */
                               public void setServerTemplates(net.docusign.www.api._3_0.ArrayOfServerTemplate param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localServerTemplatesTracker = true;
                                       } else {
                                          localServerTemplatesTracker = false;
                                              
                                       }
                                   
                                            this.localServerTemplates=param;
                                    

                               }
                            

                        /**
                        * field for InlineTemplates
                        */

                        
                                    protected net.docusign.www.api._3_0.ArrayOfInlineTemplate localInlineTemplates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInlineTemplatesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.ArrayOfInlineTemplate
                           */
                           public  net.docusign.www.api._3_0.ArrayOfInlineTemplate getInlineTemplates(){
                               return localInlineTemplates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InlineTemplates
                               */
                               public void setInlineTemplates(net.docusign.www.api._3_0.ArrayOfInlineTemplate param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localInlineTemplatesTracker = true;
                                       } else {
                                          localInlineTemplatesTracker = false;
                                              
                                       }
                                   
                                            this.localInlineTemplates=param;
                                    

                               }
                            

                        /**
                        * field for PDFMetaDataTemplate
                        */

                        
                                    protected net.docusign.www.api._3_0.PDFMetaDataTemplate localPDFMetaDataTemplate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPDFMetaDataTemplateTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return net.docusign.www.api._3_0.PDFMetaDataTemplate
                           */
                           public  net.docusign.www.api._3_0.PDFMetaDataTemplate getPDFMetaDataTemplate(){
                               return localPDFMetaDataTemplate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PDFMetaDataTemplate
                               */
                               public void setPDFMetaDataTemplate(net.docusign.www.api._3_0.PDFMetaDataTemplate param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPDFMetaDataTemplateTracker = true;
                                       } else {
                                          localPDFMetaDataTemplateTracker = false;
                                              
                                       }
                                   
                                            this.localPDFMetaDataTemplate=param;
                                    

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
                       CompositeTemplate.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":CompositeTemplate",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CompositeTemplate",
                           xmlWriter);
                   }

               
                   }
                if (localServerTemplatesTracker){
                                            if (localServerTemplates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ServerTemplates cannot be null!!");
                                            }
                                           localServerTemplates.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","ServerTemplates"),
                                               factory,xmlWriter);
                                        } if (localInlineTemplatesTracker){
                                            if (localInlineTemplates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("InlineTemplates cannot be null!!");
                                            }
                                           localInlineTemplates.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","InlineTemplates"),
                                               factory,xmlWriter);
                                        } if (localPDFMetaDataTemplateTracker){
                                            if (localPDFMetaDataTemplate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PDFMetaDataTemplate cannot be null!!");
                                            }
                                           localPDFMetaDataTemplate.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","PDFMetaDataTemplate"),
                                               factory,xmlWriter);
                                        } if (localDocumentTracker){
                                            if (localDocument==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Document cannot be null!!");
                                            }
                                           localDocument.serialize(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","Document"),
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

                 if (localServerTemplatesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "ServerTemplates"));
                            
                            
                                    if (localServerTemplates==null){
                                         throw new org.apache.axis2.databinding.ADBException("ServerTemplates cannot be null!!");
                                    }
                                    elementList.add(localServerTemplates);
                                } if (localInlineTemplatesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "InlineTemplates"));
                            
                            
                                    if (localInlineTemplates==null){
                                         throw new org.apache.axis2.databinding.ADBException("InlineTemplates cannot be null!!");
                                    }
                                    elementList.add(localInlineTemplates);
                                } if (localPDFMetaDataTemplateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "PDFMetaDataTemplate"));
                            
                            
                                    if (localPDFMetaDataTemplate==null){
                                         throw new org.apache.axis2.databinding.ADBException("PDFMetaDataTemplate cannot be null!!");
                                    }
                                    elementList.add(localPDFMetaDataTemplate);
                                } if (localDocumentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0",
                                                                      "Document"));
                            
                            
                                    if (localDocument==null){
                                         throw new org.apache.axis2.databinding.ADBException("Document cannot be null!!");
                                    }
                                    elementList.add(localDocument);
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
        public static CompositeTemplate parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CompositeTemplate object =
                new CompositeTemplate();

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
                    
                            if (!"CompositeTemplate".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CompositeTemplate)net.docusign.www.api._3_0.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","ServerTemplates").equals(reader.getName())){
                                
                                                object.setServerTemplates(net.docusign.www.api._3_0.ArrayOfServerTemplate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","InlineTemplates").equals(reader.getName())){
                                
                                                object.setInlineTemplates(net.docusign.www.api._3_0.ArrayOfInlineTemplate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.docusign.net/API/3.0","PDFMetaDataTemplate").equals(reader.getName())){
                                
                                                object.setPDFMetaDataTemplate(net.docusign.www.api._3_0.PDFMetaDataTemplate.Factory.parse(reader));
                                              
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
           
          