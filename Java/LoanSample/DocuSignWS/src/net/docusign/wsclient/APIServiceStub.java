/*
Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended for production use.
Code and policy for a production application must be developed to meet the specific data and
security requirements of the application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED
OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR
FITNESS FOR A PARTICULAR PURPOSE.
 */
package net.docusign.wsclient;

import java.io.File;

import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;

/*
 *  APIServiceStub java implementation
 */

public class APIServiceStub extends org.apache.axis2.client.Stub implements APIService {
    protected org.apache.axis2.description.AxisOperation[] _operations;

    // hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    public void init(File axis2Configuration, String webserviceEndpoint) throws AxisFault {
        populateAxisService();

        ConfigurationContext ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem(getClass().getResource("/").getPath(), axis2Configuration.getAbsolutePath());
        _serviceClient = new ServiceClient(ctx, _service);
        _serviceClient.setTargetEPR(new EndpointReference(webserviceEndpoint));
        _serviceClient.engageModule("addressing");
        _serviceClient.engageModule("rampart");
        _serviceClient.getOptions().setTo(new EndpointReference(webserviceEndpoint));
        _serviceClient.getOptions().setProperty(Constants.Configuration.ENABLE_MTOM, Constants.VALUE_TRUE);
        _serviceClient.getOptions().setUseSeparateListener(false);
    }
    
    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return java.lang.Long.toString(System.currentTimeMillis()) + "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {

        // creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("APIService" + getUniqueSuffix());
        addAnonymousOperations();

        // creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[39];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestTemplate"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestTemplates"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestRecipientToken"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFs"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestPDFWithCert"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestPDF"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAuthenticationToken"));
        _service.addOperation(__operation);

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createEnvelopeFromTemplates"));
        _service.addOperation(__operation);

        _operations[7] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createEnvelope"));
        _service.addOperation(__operation);

        _operations[8] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "acknowledgeAuthoritativeCopyExport"));
        _service.addOperation(__operation);

        _operations[9] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "uploadTemplate"));
        _service.addOperation(__operation);

        _operations[10] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatusesEx"));
        _service.addOperation(__operation);

        _operations[11] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestCorrectToken"));
        _service.addOperation(__operation);

        _operations[12] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createAndSendEnvelope"));
        _service.addOperation(__operation);

        _operations[13] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAddressBookItems"));
        _service.addOperation(__operation);

        _operations[14] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatusEx"));
        _service.addOperation(__operation);

        _operations[15] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAccountMembershipFeaturesList"));
        _service.addOperation(__operation);

        _operations[16] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getRecipientList"));
        _service.addOperation(__operation);

        _operations[17] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "synchEnvelope"));
        _service.addOperation(__operation);

        _operations[18] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "updateAddressBookItems"));
        _service.addOperation(__operation);

        _operations[19] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getStatusInDocuSignConnectFormat"));
        _service.addOperation(__operation);

        _operations[20] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAccountSettingsList"));
        _service.addOperation(__operation);

        _operations[21] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFsEx"));
        _service.addOperation(__operation);

        _operations[22] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "removeAddressBookItems"));
        _service.addOperation(__operation);

        _operations[23] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "saveTemplate"));
        _service.addOperation(__operation);

        _operations[24] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ping"));
        _service.addOperation(__operation);

        _operations[25] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getRecipientEsignList"));
        _service.addOperation(__operation);

        _operations[26] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatuses"));
        _service.addOperation(__operation);

        _operations[27] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "correctAndResendEnvelope"));
        _service.addOperation(__operation);

        _operations[28] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFsRecipientsView"));
        _service.addOperation(__operation);

        _operations[29] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "transferEnvelope"));
        _service.addOperation(__operation);

        _operations[30] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestSenderToken"));
        _service.addOperation(__operation);

        _operations[31] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "envelopeAuditEvents"));
        _service.addOperation(__operation);

        _operations[32] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "exportAuthoritativeCopy"));
        _service.addOperation(__operation);

        _operations[33] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "sendEnvelope"));
        _service.addOperation(__operation);

        _operations[34] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "voidEnvelope"));
        _service.addOperation(__operation);

        _operations[35] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "purgeDocuments"));
        _service.addOperation(__operation);

        _operations[36] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatus"));
        _service.addOperation(__operation);

        _operations[37] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestPDFNoWaterMark"));
        _service.addOperation(__operation);

        _operations[38] = __operation;

    }

    // populates the faults
    private void populateFaults() {

    }

    /**
     * Constructor that takes in a configContext
     */

    public APIServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext, java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext and useseperate listner
     */
    public APIServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext, java.lang.String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault {
        // To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

        // Set the soap version
        _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);

    }

    /**
     * Default Constructor
     */
    public APIServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

        this(configurationContext, "https://demo.docusign.net/api/3.0/api.asmx");

    }

    /**
     * Default Constructor
     */
    public APIServiceStub() throws org.apache.axis2.AxisFault {

        this("https://demo.docusign.net/api/3.0/api.asmx");

    }

    /**
     * Constructor taking the target endpoint
     */
    public APIServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestTemplate
     * @param requestTemplate78
     */

    public net.docusign.www.api._3_0.RequestTemplateResponse requestTemplate(

    net.docusign.www.api._3_0.RequestTemplate requestTemplate78)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestTemplate");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestTemplate78, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestTemplate")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestTemplateResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestTemplateResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestTemplate
     * @param requestTemplate78
     */
    public void startrequestTemplate(

    net.docusign.www.api._3_0.RequestTemplate requestTemplate78,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestTemplate");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestTemplate78, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestTemplate")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestTemplateResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestTemplate((net.docusign.www.api._3_0.RequestTemplateResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestTemplate(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestTemplate(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            }
                        } else {
                            callback.receiveErrorrequestTemplate(f);
                        }
                    } else {
                        callback.receiveErrorrequestTemplate(f);
                    }
                } else {
                    callback.receiveErrorrequestTemplate(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestTemplate(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestTemplates
     * @param requestTemplates80
     */

    public net.docusign.www.api._3_0.RequestTemplatesResponse requestTemplates(

    net.docusign.www.api._3_0.RequestTemplates requestTemplates80)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestTemplates");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestTemplates80, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestTemplates")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestTemplatesResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestTemplatesResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestTemplates
     * @param requestTemplates80
     */
    public void startrequestTemplates(

    net.docusign.www.api._3_0.RequestTemplates requestTemplates80,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestTemplates");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestTemplates80, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestTemplates")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestTemplatesResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestTemplates((net.docusign.www.api._3_0.RequestTemplatesResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestTemplates(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestTemplates(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            }
                        } else {
                            callback.receiveErrorrequestTemplates(f);
                        }
                    } else {
                        callback.receiveErrorrequestTemplates(f);
                    }
                } else {
                    callback.receiveErrorrequestTemplates(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestTemplates(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestRecipientToken
     * @param requestRecipientToken82
     */

    public net.docusign.www.api._3_0.RequestRecipientTokenResponse requestRecipientToken(

    net.docusign.www.api._3_0.RequestRecipientToken requestRecipientToken82)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestRecipientToken");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestRecipientToken82, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestRecipientToken")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestRecipientTokenResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestRecipientTokenResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestRecipientToken
     * @param requestRecipientToken82
     */
    public void startrequestRecipientToken(

    net.docusign.www.api._3_0.RequestRecipientToken requestRecipientToken82,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestRecipientToken");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestRecipientToken82, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestRecipientToken")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestRecipientTokenResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestRecipientToken((net.docusign.www.api._3_0.RequestRecipientTokenResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestRecipientToken(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestRecipientToken(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            }
                        } else {
                            callback.receiveErrorrequestRecipientToken(f);
                        }
                    } else {
                        callback.receiveErrorrequestRecipientToken(f);
                    }
                } else {
                    callback.receiveErrorrequestRecipientToken(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestRecipientToken(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[2].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestDocumentPDFs
     * @param requestDocumentPDFs84
     */

    public net.docusign.www.api._3_0.RequestDocumentPDFsResponse requestDocumentPDFs(

    net.docusign.www.api._3_0.RequestDocumentPDFs requestDocumentPDFs84)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestDocumentPDFs");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestDocumentPDFs84, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFs")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestDocumentPDFsResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestDocumentPDFsResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestDocumentPDFs
     * @param requestDocumentPDFs84
     */
    public void startrequestDocumentPDFs(

    net.docusign.www.api._3_0.RequestDocumentPDFs requestDocumentPDFs84,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestDocumentPDFs");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestDocumentPDFs84, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFs")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestDocumentPDFsResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestDocumentPDFs((net.docusign.www.api._3_0.RequestDocumentPDFsResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestDocumentPDFs(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestDocumentPDFs(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            }
                        } else {
                            callback.receiveErrorrequestDocumentPDFs(f);
                        }
                    } else {
                        callback.receiveErrorrequestDocumentPDFs(f);
                    }
                } else {
                    callback.receiveErrorrequestDocumentPDFs(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestDocumentPDFs(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[3].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[3].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestPDFWithCert
     * @param requestPDFWithCert86
     */

    public net.docusign.www.api._3_0.RequestPDFWithCertResponse requestPDFWithCert(

    net.docusign.www.api._3_0.RequestPDFWithCert requestPDFWithCert86)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestPDFWithCert");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestPDFWithCert86, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestPDFWithCert")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestPDFWithCertResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestPDFWithCertResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestPDFWithCert
     * @param requestPDFWithCert86
     */
    public void startrequestPDFWithCert(

    net.docusign.www.api._3_0.RequestPDFWithCert requestPDFWithCert86,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestPDFWithCert");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestPDFWithCert86, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestPDFWithCert")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestPDFWithCertResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestPDFWithCert((net.docusign.www.api._3_0.RequestPDFWithCertResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestPDFWithCert(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestPDFWithCert(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFWithCert(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFWithCert(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFWithCert(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFWithCert(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFWithCert(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFWithCert(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFWithCert(f);
                            }
                        } else {
                            callback.receiveErrorrequestPDFWithCert(f);
                        }
                    } else {
                        callback.receiveErrorrequestPDFWithCert(f);
                    }
                } else {
                    callback.receiveErrorrequestPDFWithCert(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestPDFWithCert(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[4].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[4].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestPDF
     * @param requestPDF88
     */

    public net.docusign.www.api._3_0.RequestPDFResponse requestPDF(

    net.docusign.www.api._3_0.RequestPDF requestPDF88)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestPDF");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestPDF88, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestPDF")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestPDFResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestPDFResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestPDF
     * @param requestPDF88
     */
    public void startrequestPDF(

    net.docusign.www.api._3_0.RequestPDF requestPDF88,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestPDF");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestPDF88, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestPDF")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestPDFResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestPDF((net.docusign.www.api._3_0.RequestPDFResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestPDF(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestPDF(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            }
                        } else {
                            callback.receiveErrorrequestPDF(f);
                        }
                    } else {
                        callback.receiveErrorrequestPDF(f);
                    }
                } else {
                    callback.receiveErrorrequestPDF(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestPDF(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[5].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[5].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#getAuthenticationToken
     * @param getAuthenticationToken90
     */

    public net.docusign.www.api._3_0.GetAuthenticationTokenResponse getAuthenticationToken(

    net.docusign.www.api._3_0.GetAuthenticationToken getAuthenticationToken90)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAuthenticationToken");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAuthenticationToken90, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAuthenticationToken")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetAuthenticationTokenResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.GetAuthenticationTokenResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startgetAuthenticationToken
     * @param getAuthenticationToken90
     */
    public void startgetAuthenticationToken(

    net.docusign.www.api._3_0.GetAuthenticationToken getAuthenticationToken90,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAuthenticationToken");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAuthenticationToken90, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAuthenticationToken")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetAuthenticationTokenResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAuthenticationToken((net.docusign.www.api._3_0.GetAuthenticationTokenResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAuthenticationToken(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorgetAuthenticationToken(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            }
                        } else {
                            callback.receiveErrorgetAuthenticationToken(f);
                        }
                    } else {
                        callback.receiveErrorgetAuthenticationToken(f);
                    }
                } else {
                    callback.receiveErrorgetAuthenticationToken(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAuthenticationToken(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[6].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[6].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#createEnvelopeFromTemplates
     * @param createEnvelopeFromTemplates92
     */

    public net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse createEnvelopeFromTemplates(

    net.docusign.www.api._3_0.CreateEnvelopeFromTemplates createEnvelopeFromTemplates92)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CreateEnvelopeFromTemplates");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createEnvelopeFromTemplates92, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createEnvelopeFromTemplates")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startcreateEnvelopeFromTemplates
     * @param createEnvelopeFromTemplates92
     */
    public void startcreateEnvelopeFromTemplates(

    net.docusign.www.api._3_0.CreateEnvelopeFromTemplates createEnvelopeFromTemplates92,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CreateEnvelopeFromTemplates");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createEnvelopeFromTemplates92, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createEnvelopeFromTemplates")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultcreateEnvelopeFromTemplates((net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorcreateEnvelopeFromTemplates(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorcreateEnvelopeFromTemplates(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            }
                        } else {
                            callback.receiveErrorcreateEnvelopeFromTemplates(f);
                        }
                    } else {
                        callback.receiveErrorcreateEnvelopeFromTemplates(f);
                    }
                } else {
                    callback.receiveErrorcreateEnvelopeFromTemplates(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorcreateEnvelopeFromTemplates(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[7].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[7].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#createEnvelope
     * @param createEnvelope94
     */

    public net.docusign.www.api._3_0.CreateEnvelopeResponse createEnvelope(

    net.docusign.www.api._3_0.CreateEnvelope createEnvelope94)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CreateEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createEnvelope94, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createEnvelope")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.CreateEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.CreateEnvelopeResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startcreateEnvelope
     * @param createEnvelope94
     */
    public void startcreateEnvelope(

    net.docusign.www.api._3_0.CreateEnvelope createEnvelope94,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CreateEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createEnvelope94, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createEnvelope")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.CreateEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultcreateEnvelope((net.docusign.www.api._3_0.CreateEnvelopeResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorcreateEnvelope(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorcreateEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            }
                        } else {
                            callback.receiveErrorcreateEnvelope(f);
                        }
                    } else {
                        callback.receiveErrorcreateEnvelope(f);
                    }
                } else {
                    callback.receiveErrorcreateEnvelope(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorcreateEnvelope(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[8].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[8].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#acknowledgeAuthoritativeCopyExport
     * @param acknowledgeAuthoritativeCopyExport96
     */

    public net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse acknowledgeAuthoritativeCopyExport(

    net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport acknowledgeAuthoritativeCopyExport96)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/AcknowledgeAuthoritativeCopyExport");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), acknowledgeAuthoritativeCopyExport96, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "acknowledgeAuthoritativeCopyExport")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startacknowledgeAuthoritativeCopyExport
     * @param acknowledgeAuthoritativeCopyExport96
     */
    public void startacknowledgeAuthoritativeCopyExport(

    net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport acknowledgeAuthoritativeCopyExport96,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/AcknowledgeAuthoritativeCopyExport");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), acknowledgeAuthoritativeCopyExport96, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "acknowledgeAuthoritativeCopyExport")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultacknowledgeAuthoritativeCopyExport((net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErroracknowledgeAuthoritativeCopyExport(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErroracknowledgeAuthoritativeCopyExport(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            }
                        } else {
                            callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                        }
                    } else {
                        callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                    }
                } else {
                    callback.receiveErroracknowledgeAuthoritativeCopyExport(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErroracknowledgeAuthoritativeCopyExport(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[9].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[9].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#uploadTemplate
     * @param uploadTemplate98
     */

    public net.docusign.www.api._3_0.UploadTemplateResponse uploadTemplate(

    net.docusign.www.api._3_0.UploadTemplate uploadTemplate98)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/UploadTemplate");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), uploadTemplate98, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "uploadTemplate")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.UploadTemplateResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.UploadTemplateResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startuploadTemplate
     * @param uploadTemplate98
     */
    public void startuploadTemplate(

    net.docusign.www.api._3_0.UploadTemplate uploadTemplate98,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/UploadTemplate");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), uploadTemplate98, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "uploadTemplate")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.UploadTemplateResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultuploadTemplate((net.docusign.www.api._3_0.UploadTemplateResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErroruploadTemplate(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErroruploadTemplate(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            }
                        } else {
                            callback.receiveErroruploadTemplate(f);
                        }
                    } else {
                        callback.receiveErroruploadTemplate(f);
                    }
                } else {
                    callback.receiveErroruploadTemplate(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErroruploadTemplate(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[10].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[10].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestStatusesEx
     * @param requestStatusesEx100
     */

    public net.docusign.www.api._3_0.RequestStatusesExResponse requestStatusesEx(

    net.docusign.www.api._3_0.RequestStatusesEx requestStatusesEx100)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatusesEx");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatusesEx100, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatusesEx")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestStatusesExResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestStatusesExResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestStatusesEx
     * @param requestStatusesEx100
     */
    public void startrequestStatusesEx(

    net.docusign.www.api._3_0.RequestStatusesEx requestStatusesEx100,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatusesEx");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatusesEx100, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatusesEx")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestStatusesExResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestStatusesEx((net.docusign.www.api._3_0.RequestStatusesExResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestStatusesEx(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestStatusesEx(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            }
                        } else {
                            callback.receiveErrorrequestStatusesEx(f);
                        }
                    } else {
                        callback.receiveErrorrequestStatusesEx(f);
                    }
                } else {
                    callback.receiveErrorrequestStatusesEx(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestStatusesEx(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[11].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[11].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestCorrectToken
     * @param requestCorrectToken102
     */

    public net.docusign.www.api._3_0.RequestCorrectTokenResponse requestCorrectToken(

    net.docusign.www.api._3_0.RequestCorrectToken requestCorrectToken102)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestCorrectToken");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestCorrectToken102, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestCorrectToken")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestCorrectTokenResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestCorrectTokenResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestCorrectToken
     * @param requestCorrectToken102
     */
    public void startrequestCorrectToken(

    net.docusign.www.api._3_0.RequestCorrectToken requestCorrectToken102,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestCorrectToken");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestCorrectToken102, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestCorrectToken")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestCorrectTokenResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestCorrectToken((net.docusign.www.api._3_0.RequestCorrectTokenResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestCorrectToken(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestCorrectToken(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestCorrectToken(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestCorrectToken(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestCorrectToken(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestCorrectToken(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestCorrectToken(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestCorrectToken(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestCorrectToken(f);
                            }
                        } else {
                            callback.receiveErrorrequestCorrectToken(f);
                        }
                    } else {
                        callback.receiveErrorrequestCorrectToken(f);
                    }
                } else {
                    callback.receiveErrorrequestCorrectToken(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestCorrectToken(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[12].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[12].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#createAndSendEnvelope
     * @param createAndSendEnvelope104
     */

    public net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse createAndSendEnvelope(

    net.docusign.www.api._3_0.CreateAndSendEnvelope createAndSendEnvelope104)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CreateAndSendEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createAndSendEnvelope104, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createAndSendEnvelope")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startcreateAndSendEnvelope
     * @param createAndSendEnvelope104
     */
    public void startcreateAndSendEnvelope(

    net.docusign.www.api._3_0.CreateAndSendEnvelope createAndSendEnvelope104,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CreateAndSendEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createAndSendEnvelope104, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createAndSendEnvelope")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultcreateAndSendEnvelope((net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorcreateAndSendEnvelope(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorcreateAndSendEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            }
                        } else {
                            callback.receiveErrorcreateAndSendEnvelope(f);
                        }
                    } else {
                        callback.receiveErrorcreateAndSendEnvelope(f);
                    }
                } else {
                    callback.receiveErrorcreateAndSendEnvelope(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorcreateAndSendEnvelope(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[13].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[13].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#getAddressBookItems
     * @param getAddressBookItems106
     */

    public net.docusign.www.api._3_0.GetAddressBookItemsResponse getAddressBookItems(

    net.docusign.www.api._3_0.GetAddressBookItems getAddressBookItems106)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAddressBookItems");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAddressBookItems106, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAddressBookItems")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetAddressBookItemsResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.GetAddressBookItemsResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startgetAddressBookItems
     * @param getAddressBookItems106
     */
    public void startgetAddressBookItems(

    net.docusign.www.api._3_0.GetAddressBookItems getAddressBookItems106,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAddressBookItems");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAddressBookItems106, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAddressBookItems")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetAddressBookItemsResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAddressBookItems((net.docusign.www.api._3_0.GetAddressBookItemsResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAddressBookItems(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorgetAddressBookItems(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            }
                        } else {
                            callback.receiveErrorgetAddressBookItems(f);
                        }
                    } else {
                        callback.receiveErrorgetAddressBookItems(f);
                    }
                } else {
                    callback.receiveErrorgetAddressBookItems(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAddressBookItems(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[14].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[14].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestStatusEx
     * @param requestStatusEx108
     */

    public net.docusign.www.api._3_0.RequestStatusExResponse requestStatusEx(

    net.docusign.www.api._3_0.RequestStatusEx requestStatusEx108)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatusEx");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatusEx108, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatusEx")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestStatusExResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestStatusExResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestStatusEx
     * @param requestStatusEx108
     */
    public void startrequestStatusEx(

    net.docusign.www.api._3_0.RequestStatusEx requestStatusEx108,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatusEx");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatusEx108, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatusEx")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestStatusExResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestStatusEx((net.docusign.www.api._3_0.RequestStatusExResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestStatusEx(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestStatusEx(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            }
                        } else {
                            callback.receiveErrorrequestStatusEx(f);
                        }
                    } else {
                        callback.receiveErrorrequestStatusEx(f);
                    }
                } else {
                    callback.receiveErrorrequestStatusEx(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestStatusEx(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[15].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[15].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#getAccountMembershipFeaturesList
     * @param getAccountMembershipFeaturesList110
     */

    public net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse getAccountMembershipFeaturesList(

    net.docusign.www.api._3_0.GetAccountMembershipFeaturesList getAccountMembershipFeaturesList110)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAccountMembershipFeaturesList");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAccountMembershipFeaturesList110, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAccountMembershipFeaturesList")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startgetAccountMembershipFeaturesList
     * @param getAccountMembershipFeaturesList110
     */
    public void startgetAccountMembershipFeaturesList(

    net.docusign.www.api._3_0.GetAccountMembershipFeaturesList getAccountMembershipFeaturesList110,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAccountMembershipFeaturesList");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAccountMembershipFeaturesList110, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAccountMembershipFeaturesList")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAccountMembershipFeaturesList((net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAccountMembershipFeaturesList(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorgetAccountMembershipFeaturesList(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            }
                        } else {
                            callback.receiveErrorgetAccountMembershipFeaturesList(f);
                        }
                    } else {
                        callback.receiveErrorgetAccountMembershipFeaturesList(f);
                    }
                } else {
                    callback.receiveErrorgetAccountMembershipFeaturesList(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAccountMembershipFeaturesList(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[16].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[16].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#getRecipientList
     * @param getRecipientList112
     */

    public net.docusign.www.api._3_0.GetRecipientListResponse getRecipientList(

    net.docusign.www.api._3_0.GetRecipientList getRecipientList112)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetRecipientList");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getRecipientList112, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getRecipientList")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetRecipientListResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.GetRecipientListResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startgetRecipientList
     * @param getRecipientList112
     */
    public void startgetRecipientList(

    net.docusign.www.api._3_0.GetRecipientList getRecipientList112,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetRecipientList");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getRecipientList112, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getRecipientList")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetRecipientListResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetRecipientList((net.docusign.www.api._3_0.GetRecipientListResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetRecipientList(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorgetRecipientList(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            }
                        } else {
                            callback.receiveErrorgetRecipientList(f);
                        }
                    } else {
                        callback.receiveErrorgetRecipientList(f);
                    }
                } else {
                    callback.receiveErrorgetRecipientList(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetRecipientList(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[17].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[17].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#synchEnvelope
     * @param synchEnvelope114
     */

    public net.docusign.www.api._3_0.SynchEnvelopeResponse synchEnvelope(

    net.docusign.www.api._3_0.SynchEnvelope synchEnvelope114)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/SynchEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), synchEnvelope114, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "synchEnvelope")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.SynchEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.SynchEnvelopeResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startsynchEnvelope
     * @param synchEnvelope114
     */
    public void startsynchEnvelope(

    net.docusign.www.api._3_0.SynchEnvelope synchEnvelope114,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/SynchEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), synchEnvelope114, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "synchEnvelope")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.SynchEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultsynchEnvelope((net.docusign.www.api._3_0.SynchEnvelopeResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorsynchEnvelope(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorsynchEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            }
                        } else {
                            callback.receiveErrorsynchEnvelope(f);
                        }
                    } else {
                        callback.receiveErrorsynchEnvelope(f);
                    }
                } else {
                    callback.receiveErrorsynchEnvelope(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorsynchEnvelope(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[18].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[18].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#updateAddressBookItems
     * @param updateAddressBookItems116
     */

    public net.docusign.www.api._3_0.UpdateAddressBookItemsResponse updateAddressBookItems(

    net.docusign.www.api._3_0.UpdateAddressBookItems updateAddressBookItems116)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/UpdateAddressBookItems");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), updateAddressBookItems116, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "updateAddressBookItems")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.UpdateAddressBookItemsResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.UpdateAddressBookItemsResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startupdateAddressBookItems
     * @param updateAddressBookItems116
     */
    public void startupdateAddressBookItems(

    net.docusign.www.api._3_0.UpdateAddressBookItems updateAddressBookItems116,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/UpdateAddressBookItems");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), updateAddressBookItems116, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "updateAddressBookItems")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.UpdateAddressBookItemsResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultupdateAddressBookItems((net.docusign.www.api._3_0.UpdateAddressBookItemsResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorupdateAddressBookItems(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorupdateAddressBookItems(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            }
                        } else {
                            callback.receiveErrorupdateAddressBookItems(f);
                        }
                    } else {
                        callback.receiveErrorupdateAddressBookItems(f);
                    }
                } else {
                    callback.receiveErrorupdateAddressBookItems(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorupdateAddressBookItems(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[19].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[19].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#getStatusInDocuSignConnectFormat
     * @param getStatusInDocuSignConnectFormat118
     */

    public net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse getStatusInDocuSignConnectFormat(

    net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat getStatusInDocuSignConnectFormat118)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetStatusInDocuSignConnectFormat");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getStatusInDocuSignConnectFormat118, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getStatusInDocuSignConnectFormat")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startgetStatusInDocuSignConnectFormat
     * @param getStatusInDocuSignConnectFormat118
     */
    public void startgetStatusInDocuSignConnectFormat(

    net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat getStatusInDocuSignConnectFormat118,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetStatusInDocuSignConnectFormat");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getStatusInDocuSignConnectFormat118, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getStatusInDocuSignConnectFormat")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetStatusInDocuSignConnectFormat((net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetStatusInDocuSignConnectFormat(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorgetStatusInDocuSignConnectFormat(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            }
                        } else {
                            callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                        }
                    } else {
                        callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                    }
                } else {
                    callback.receiveErrorgetStatusInDocuSignConnectFormat(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetStatusInDocuSignConnectFormat(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[20].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[20].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#getAccountSettingsList
     * @param getAccountSettingsList120
     */

    public net.docusign.www.api._3_0.GetAccountSettingsListResponse getAccountSettingsList(

    net.docusign.www.api._3_0.GetAccountSettingsList getAccountSettingsList120)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAccountSettingsList");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAccountSettingsList120, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAccountSettingsList")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetAccountSettingsListResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.GetAccountSettingsListResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startgetAccountSettingsList
     * @param getAccountSettingsList120
     */
    public void startgetAccountSettingsList(

    net.docusign.www.api._3_0.GetAccountSettingsList getAccountSettingsList120,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAccountSettingsList");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAccountSettingsList120, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAccountSettingsList")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetAccountSettingsListResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAccountSettingsList((net.docusign.www.api._3_0.GetAccountSettingsListResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAccountSettingsList(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorgetAccountSettingsList(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            }
                        } else {
                            callback.receiveErrorgetAccountSettingsList(f);
                        }
                    } else {
                        callback.receiveErrorgetAccountSettingsList(f);
                    }
                } else {
                    callback.receiveErrorgetAccountSettingsList(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAccountSettingsList(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[21].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[21].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestDocumentPDFsEx
     * @param requestDocumentPDFsEx122
     */

    public net.docusign.www.api._3_0.RequestDocumentPDFsExResponse requestDocumentPDFsEx(

    net.docusign.www.api._3_0.RequestDocumentPDFsEx requestDocumentPDFsEx122)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestDocumentPDFsEx");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestDocumentPDFsEx122, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFsEx")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestDocumentPDFsExResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestDocumentPDFsExResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestDocumentPDFsEx
     * @param requestDocumentPDFsEx122
     */
    public void startrequestDocumentPDFsEx(

    net.docusign.www.api._3_0.RequestDocumentPDFsEx requestDocumentPDFsEx122,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestDocumentPDFsEx");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestDocumentPDFsEx122, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFsEx")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestDocumentPDFsExResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestDocumentPDFsEx((net.docusign.www.api._3_0.RequestDocumentPDFsExResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestDocumentPDFsEx(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestDocumentPDFsEx(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            }
                        } else {
                            callback.receiveErrorrequestDocumentPDFsEx(f);
                        }
                    } else {
                        callback.receiveErrorrequestDocumentPDFsEx(f);
                    }
                } else {
                    callback.receiveErrorrequestDocumentPDFsEx(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestDocumentPDFsEx(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[22].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[22].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#removeAddressBookItems
     * @param removeAddressBookItems124
     */

    public net.docusign.www.api._3_0.RemoveAddressBookItemsResponse removeAddressBookItems(

    net.docusign.www.api._3_0.RemoveAddressBookItems removeAddressBookItems124)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RemoveAddressBookItems");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), removeAddressBookItems124, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "removeAddressBookItems")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RemoveAddressBookItemsResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RemoveAddressBookItemsResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startremoveAddressBookItems
     * @param removeAddressBookItems124
     */
    public void startremoveAddressBookItems(

    net.docusign.www.api._3_0.RemoveAddressBookItems removeAddressBookItems124,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RemoveAddressBookItems");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), removeAddressBookItems124, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "removeAddressBookItems")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RemoveAddressBookItemsResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultremoveAddressBookItems((net.docusign.www.api._3_0.RemoveAddressBookItemsResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorremoveAddressBookItems(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorremoveAddressBookItems(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            }
                        } else {
                            callback.receiveErrorremoveAddressBookItems(f);
                        }
                    } else {
                        callback.receiveErrorremoveAddressBookItems(f);
                    }
                } else {
                    callback.receiveErrorremoveAddressBookItems(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorremoveAddressBookItems(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[23].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[23].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#saveTemplate
     * @param saveTemplate126
     */

    public net.docusign.www.api._3_0.SaveTemplateResponse saveTemplate(

    net.docusign.www.api._3_0.SaveTemplate saveTemplate126)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/SaveTemplate");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), saveTemplate126, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "saveTemplate")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.SaveTemplateResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.SaveTemplateResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startsaveTemplate
     * @param saveTemplate126
     */
    public void startsaveTemplate(

    net.docusign.www.api._3_0.SaveTemplate saveTemplate126,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/SaveTemplate");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), saveTemplate126, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "saveTemplate")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.SaveTemplateResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultsaveTemplate((net.docusign.www.api._3_0.SaveTemplateResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorsaveTemplate(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorsaveTemplate(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            }
                        } else {
                            callback.receiveErrorsaveTemplate(f);
                        }
                    } else {
                        callback.receiveErrorsaveTemplate(f);
                    }
                } else {
                    callback.receiveErrorsaveTemplate(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorsaveTemplate(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[24].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[24].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#ping
     * @param ping128
     */

    public net.docusign.www.api._3_0.PingResponse ping(

    net.docusign.www.api._3_0.Ping ping128)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/Ping");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), ping128, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ping")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.PingResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.PingResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startping
     * @param ping128
     */
    public void startping(

    net.docusign.www.api._3_0.Ping ping128,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/Ping");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), ping128, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ping")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.PingResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultping((net.docusign.www.api._3_0.PingResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorping(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorping(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            }
                        } else {
                            callback.receiveErrorping(f);
                        }
                    } else {
                        callback.receiveErrorping(f);
                    }
                } else {
                    callback.receiveErrorping(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorping(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[25].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[25].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#getRecipientEsignList
     * @param getRecipientEsignList130
     */

    public net.docusign.www.api._3_0.GetRecipientEsignListResponse getRecipientEsignList(

    net.docusign.www.api._3_0.GetRecipientEsignList getRecipientEsignList130)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetRecipientEsignList");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getRecipientEsignList130, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getRecipientEsignList")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetRecipientEsignListResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.GetRecipientEsignListResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startgetRecipientEsignList
     * @param getRecipientEsignList130
     */
    public void startgetRecipientEsignList(

    net.docusign.www.api._3_0.GetRecipientEsignList getRecipientEsignList130,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetRecipientEsignList");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getRecipientEsignList130, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getRecipientEsignList")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.GetRecipientEsignListResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetRecipientEsignList((net.docusign.www.api._3_0.GetRecipientEsignListResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetRecipientEsignList(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorgetRecipientEsignList(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            }
                        } else {
                            callback.receiveErrorgetRecipientEsignList(f);
                        }
                    } else {
                        callback.receiveErrorgetRecipientEsignList(f);
                    }
                } else {
                    callback.receiveErrorgetRecipientEsignList(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetRecipientEsignList(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[26].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[26].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestStatuses
     * @param requestStatuses132
     */

    public net.docusign.www.api._3_0.RequestStatusesResponse requestStatuses(

    net.docusign.www.api._3_0.RequestStatuses requestStatuses132)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatuses");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatuses132, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatuses")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestStatusesResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestStatusesResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestStatuses
     * @param requestStatuses132
     */
    public void startrequestStatuses(

    net.docusign.www.api._3_0.RequestStatuses requestStatuses132,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatuses");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatuses132, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatuses")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestStatusesResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestStatuses((net.docusign.www.api._3_0.RequestStatusesResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestStatuses(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestStatuses(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            }
                        } else {
                            callback.receiveErrorrequestStatuses(f);
                        }
                    } else {
                        callback.receiveErrorrequestStatuses(f);
                    }
                } else {
                    callback.receiveErrorrequestStatuses(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestStatuses(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[27].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[27].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#correctAndResendEnvelope
     * @param correctAndResendEnvelope134
     */

    public net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse correctAndResendEnvelope(

    net.docusign.www.api._3_0.CorrectAndResendEnvelope correctAndResendEnvelope134)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CorrectAndResendEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), correctAndResendEnvelope134, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "correctAndResendEnvelope")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startcorrectAndResendEnvelope
     * @param correctAndResendEnvelope134
     */
    public void startcorrectAndResendEnvelope(

    net.docusign.www.api._3_0.CorrectAndResendEnvelope correctAndResendEnvelope134,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CorrectAndResendEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), correctAndResendEnvelope134, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "correctAndResendEnvelope")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultcorrectAndResendEnvelope((net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorcorrectAndResendEnvelope(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorcorrectAndResendEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            }
                        } else {
                            callback.receiveErrorcorrectAndResendEnvelope(f);
                        }
                    } else {
                        callback.receiveErrorcorrectAndResendEnvelope(f);
                    }
                } else {
                    callback.receiveErrorcorrectAndResendEnvelope(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorcorrectAndResendEnvelope(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[28].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[28].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestDocumentPDFsRecipientsView
     * @param requestDocumentPDFsRecipientsView136
     */

    public net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse requestDocumentPDFsRecipientsView(

    net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView requestDocumentPDFsRecipientsView136)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestDocumentPDFsRecipientsView");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestDocumentPDFsRecipientsView136, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFsRecipientsView")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestDocumentPDFsRecipientsView
     * @param requestDocumentPDFsRecipientsView136
     */
    public void startrequestDocumentPDFsRecipientsView(

    net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView requestDocumentPDFsRecipientsView136,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestDocumentPDFsRecipientsView");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestDocumentPDFsRecipientsView136, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFsRecipientsView")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestDocumentPDFsRecipientsView((net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestDocumentPDFsRecipientsView(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestDocumentPDFsRecipientsView(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            }
                        } else {
                            callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                        }
                    } else {
                        callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                    }
                } else {
                    callback.receiveErrorrequestDocumentPDFsRecipientsView(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestDocumentPDFsRecipientsView(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[29].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[29].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#transferEnvelope
     * @param transferEnvelope138
     */

    public net.docusign.www.api._3_0.TransferEnvelopeResponse transferEnvelope(

    net.docusign.www.api._3_0.TransferEnvelope transferEnvelope138)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/TransferEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), transferEnvelope138, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "transferEnvelope")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.TransferEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.TransferEnvelopeResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#starttransferEnvelope
     * @param transferEnvelope138
     */
    public void starttransferEnvelope(

    net.docusign.www.api._3_0.TransferEnvelope transferEnvelope138,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/TransferEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), transferEnvelope138, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "transferEnvelope")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.TransferEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResulttransferEnvelope((net.docusign.www.api._3_0.TransferEnvelopeResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrortransferEnvelope(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrortransferEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            }
                        } else {
                            callback.receiveErrortransferEnvelope(f);
                        }
                    } else {
                        callback.receiveErrortransferEnvelope(f);
                    }
                } else {
                    callback.receiveErrortransferEnvelope(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrortransferEnvelope(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[30].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[30].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestSenderToken
     * @param requestSenderToken140
     */

    public net.docusign.www.api._3_0.RequestSenderTokenResponse requestSenderToken(

    net.docusign.www.api._3_0.RequestSenderToken requestSenderToken140)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestSenderToken");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestSenderToken140, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestSenderToken")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestSenderTokenResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestSenderTokenResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestSenderToken
     * @param requestSenderToken140
     */
    public void startrequestSenderToken(

    net.docusign.www.api._3_0.RequestSenderToken requestSenderToken140,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestSenderToken");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestSenderToken140, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestSenderToken")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestSenderTokenResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestSenderToken((net.docusign.www.api._3_0.RequestSenderTokenResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestSenderToken(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestSenderToken(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            }
                        } else {
                            callback.receiveErrorrequestSenderToken(f);
                        }
                    } else {
                        callback.receiveErrorrequestSenderToken(f);
                    }
                } else {
                    callback.receiveErrorrequestSenderToken(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestSenderToken(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[31].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[31].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#envelopeAuditEvents
     * @param envelopeAuditEvents142
     */

    public net.docusign.www.api._3_0.EnvelopeAuditEventsResponse envelopeAuditEvents(

    net.docusign.www.api._3_0.EnvelopeAuditEvents envelopeAuditEvents142)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/EnvelopeAuditEvents");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), envelopeAuditEvents142, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "envelopeAuditEvents")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.EnvelopeAuditEventsResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.EnvelopeAuditEventsResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startenvelopeAuditEvents
     * @param envelopeAuditEvents142
     */
    public void startenvelopeAuditEvents(

    net.docusign.www.api._3_0.EnvelopeAuditEvents envelopeAuditEvents142,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/EnvelopeAuditEvents");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), envelopeAuditEvents142, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "envelopeAuditEvents")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.EnvelopeAuditEventsResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultenvelopeAuditEvents((net.docusign.www.api._3_0.EnvelopeAuditEventsResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorenvelopeAuditEvents(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorenvelopeAuditEvents(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            }
                        } else {
                            callback.receiveErrorenvelopeAuditEvents(f);
                        }
                    } else {
                        callback.receiveErrorenvelopeAuditEvents(f);
                    }
                } else {
                    callback.receiveErrorenvelopeAuditEvents(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorenvelopeAuditEvents(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[32].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[32].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#exportAuthoritativeCopy
     * @param exportAuthoritativeCopy144
     */

    public net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse exportAuthoritativeCopy(

    net.docusign.www.api._3_0.ExportAuthoritativeCopy exportAuthoritativeCopy144)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/ExportAuthoritativeCopy");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), exportAuthoritativeCopy144, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "exportAuthoritativeCopy")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startexportAuthoritativeCopy
     * @param exportAuthoritativeCopy144
     */
    public void startexportAuthoritativeCopy(

    net.docusign.www.api._3_0.ExportAuthoritativeCopy exportAuthoritativeCopy144,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/ExportAuthoritativeCopy");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), exportAuthoritativeCopy144, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "exportAuthoritativeCopy")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultexportAuthoritativeCopy((net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorexportAuthoritativeCopy(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorexportAuthoritativeCopy(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            }
                        } else {
                            callback.receiveErrorexportAuthoritativeCopy(f);
                        }
                    } else {
                        callback.receiveErrorexportAuthoritativeCopy(f);
                    }
                } else {
                    callback.receiveErrorexportAuthoritativeCopy(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorexportAuthoritativeCopy(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[33].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[33].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#sendEnvelope
     * @param sendEnvelope146
     */

    public net.docusign.www.api._3_0.SendEnvelopeResponse sendEnvelope(

    net.docusign.www.api._3_0.SendEnvelope sendEnvelope146)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[34].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/SendEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), sendEnvelope146, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "sendEnvelope")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.SendEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.SendEnvelopeResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startsendEnvelope
     * @param sendEnvelope146
     */
    public void startsendEnvelope(

    net.docusign.www.api._3_0.SendEnvelope sendEnvelope146,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[34].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/SendEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), sendEnvelope146, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "sendEnvelope")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.SendEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultsendEnvelope((net.docusign.www.api._3_0.SendEnvelopeResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorsendEnvelope(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorsendEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsendEnvelope(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsendEnvelope(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsendEnvelope(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsendEnvelope(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsendEnvelope(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsendEnvelope(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsendEnvelope(f);
                            }
                        } else {
                            callback.receiveErrorsendEnvelope(f);
                        }
                    } else {
                        callback.receiveErrorsendEnvelope(f);
                    }
                } else {
                    callback.receiveErrorsendEnvelope(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorsendEnvelope(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[34].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[34].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#voidEnvelope
     * @param voidEnvelope148
     */

    public net.docusign.www.api._3_0.VoidEnvelopeResponse voidEnvelope(

    net.docusign.www.api._3_0.VoidEnvelope voidEnvelope148)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[35].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/VoidEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), voidEnvelope148, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "voidEnvelope")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.VoidEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.VoidEnvelopeResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startvoidEnvelope
     * @param voidEnvelope148
     */
    public void startvoidEnvelope(

    net.docusign.www.api._3_0.VoidEnvelope voidEnvelope148,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[35].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/VoidEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), voidEnvelope148, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "voidEnvelope")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.VoidEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultvoidEnvelope((net.docusign.www.api._3_0.VoidEnvelopeResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorvoidEnvelope(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorvoidEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            }
                        } else {
                            callback.receiveErrorvoidEnvelope(f);
                        }
                    } else {
                        callback.receiveErrorvoidEnvelope(f);
                    }
                } else {
                    callback.receiveErrorvoidEnvelope(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorvoidEnvelope(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[35].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[35].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#purgeDocuments
     * @param purgeDocuments150
     */

    public net.docusign.www.api._3_0.PurgeDocumentsResponse purgeDocuments(

    net.docusign.www.api._3_0.PurgeDocuments purgeDocuments150)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[36].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/PurgeDocuments");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), purgeDocuments150, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "purgeDocuments")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.PurgeDocumentsResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.PurgeDocumentsResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startpurgeDocuments
     * @param purgeDocuments150
     */
    public void startpurgeDocuments(

    net.docusign.www.api._3_0.PurgeDocuments purgeDocuments150,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[36].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/PurgeDocuments");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), purgeDocuments150, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "purgeDocuments")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.PurgeDocumentsResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultpurgeDocuments((net.docusign.www.api._3_0.PurgeDocumentsResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorpurgeDocuments(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorpurgeDocuments(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            }
                        } else {
                            callback.receiveErrorpurgeDocuments(f);
                        }
                    } else {
                        callback.receiveErrorpurgeDocuments(f);
                    }
                } else {
                    callback.receiveErrorpurgeDocuments(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorpurgeDocuments(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[36].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[36].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestStatus
     * @param requestStatus152
     */

    public net.docusign.www.api._3_0.RequestStatusResponse requestStatus(

    net.docusign.www.api._3_0.RequestStatus requestStatus152)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[37].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatus");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatus152, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatus")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestStatusResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestStatusResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestStatus
     * @param requestStatus152
     */
    public void startrequestStatus(

    net.docusign.www.api._3_0.RequestStatus requestStatus152,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[37].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatus");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatus152, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatus")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestStatusResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestStatus((net.docusign.www.api._3_0.RequestStatusResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestStatus(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestStatus(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            }
                        } else {
                            callback.receiveErrorrequestStatus(f);
                        }
                    } else {
                        callback.receiveErrorrequestStatus(f);
                    }
                } else {
                    callback.receiveErrorrequestStatus(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestStatus(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[37].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[37].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     * 
     * @see net.docusign.wsclient.APIService#requestPDFNoWaterMark
     * @param requestPDFNoWaterMark154
     */

    public net.docusign.www.api._3_0.RequestPDFNoWaterMarkResponse requestPDFNoWaterMark(

    net.docusign.www.api._3_0.RequestPDFNoWaterMark requestPDFNoWaterMark154)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[38].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestPDFNoWaterMark");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestPDFNoWaterMark154, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestPDFNoWaterMark")));

            // adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestPDFNoWaterMarkResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (net.docusign.www.api._3_0.RequestPDFNoWaterMarkResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     * 
     * @see net.docusign.wsclient.APIService#startrequestPDFNoWaterMark
     * @param requestPDFNoWaterMark154
     */
    public void startrequestPDFNoWaterMark(

    net.docusign.www.api._3_0.RequestPDFNoWaterMark requestPDFNoWaterMark154,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[38].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestPDFNoWaterMark");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestPDFNoWaterMark154, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestPDFNoWaterMark")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), net.docusign.www.api._3_0.RequestPDFNoWaterMarkResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestPDFNoWaterMark((net.docusign.www.api._3_0.RequestPDFNoWaterMarkResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestPDFNoWaterMark(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(faultElt.getQName());
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                // message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(faultElt.getQName());
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] { messageClass });
                                m.invoke(ex, new java.lang.Object[] { messageObject });

                                callback.receiveErrorrequestPDFNoWaterMark(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFNoWaterMark(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFNoWaterMark(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFNoWaterMark(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFNoWaterMark(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFNoWaterMark(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFNoWaterMark(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDFNoWaterMark(f);
                            }
                        } else {
                            callback.receiveErrorrequestPDFNoWaterMark(f);
                        }
                    } else {
                        callback.receiveErrorrequestPDFNoWaterMark(f);
                    }
                } else {
                    callback.receiveErrorrequestPDFNoWaterMark(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestPDFNoWaterMark(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[38].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[38].setMessageReceiver(_callbackReceiver);
        }

        // execute the operation client
        _operationClient.execute(false);

    }

    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }

    private javax.xml.namespace.QName[] opNameArray = null;

    private boolean optimizeContent(javax.xml.namespace.QName opName) {

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }
        return false;
    }

    // https://demo.docusign.net/api/3.0/api.asmx
    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestTemplate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestTemplate.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestTemplateResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestTemplateResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestTemplates param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestTemplates.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestTemplatesResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestTemplatesResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestRecipientToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestRecipientToken.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestRecipientTokenResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestRecipientTokenResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestDocumentPDFs param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestDocumentPDFs.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestDocumentPDFsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestDocumentPDFsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestPDFWithCert param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestPDFWithCert.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestPDFWithCertResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestPDFWithCertResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestPDF param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestPDF.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestPDFResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestPDFResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetAuthenticationToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetAuthenticationToken.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetAuthenticationTokenResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetAuthenticationTokenResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.CreateEnvelopeFromTemplates param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.CreateEnvelopeFromTemplates.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.CreateEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.CreateEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.CreateEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.CreateEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.UploadTemplate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.UploadTemplate.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.UploadTemplateResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.UploadTemplateResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestStatusesEx param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestStatusesEx.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestStatusesExResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestStatusesExResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestCorrectToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestCorrectToken.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestCorrectTokenResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestCorrectTokenResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.CreateAndSendEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.CreateAndSendEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetAddressBookItems param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetAddressBookItems.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetAddressBookItemsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetAddressBookItemsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestStatusEx param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestStatusEx.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestStatusExResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestStatusExResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetAccountMembershipFeaturesList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetAccountMembershipFeaturesList.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetRecipientList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetRecipientList.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetRecipientListResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetRecipientListResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.SynchEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.SynchEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.SynchEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.SynchEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.UpdateAddressBookItems param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.UpdateAddressBookItems.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.UpdateAddressBookItemsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.UpdateAddressBookItemsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetAccountSettingsList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetAccountSettingsList.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetAccountSettingsListResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetAccountSettingsListResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestDocumentPDFsEx param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestDocumentPDFsEx.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestDocumentPDFsExResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestDocumentPDFsExResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RemoveAddressBookItems param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RemoveAddressBookItems.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RemoveAddressBookItemsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RemoveAddressBookItemsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.SaveTemplate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.SaveTemplate.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.SaveTemplateResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.SaveTemplateResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.Ping param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.Ping.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.PingResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.PingResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetRecipientEsignList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetRecipientEsignList.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.GetRecipientEsignListResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.GetRecipientEsignListResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestStatuses param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestStatuses.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestStatusesResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestStatusesResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.CorrectAndResendEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.CorrectAndResendEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.TransferEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.TransferEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.TransferEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.TransferEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestSenderToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestSenderToken.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestSenderTokenResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestSenderTokenResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.EnvelopeAuditEvents param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.EnvelopeAuditEvents.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.EnvelopeAuditEventsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.EnvelopeAuditEventsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.ExportAuthoritativeCopy param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.ExportAuthoritativeCopy.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.SendEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.SendEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.SendEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.SendEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.VoidEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.VoidEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.VoidEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.VoidEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.PurgeDocuments param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.PurgeDocuments.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.PurgeDocumentsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.PurgeDocumentsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestStatus param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestStatus.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestStatusResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestStatusResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestPDFNoWaterMark param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestPDFNoWaterMark.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(net.docusign.www.api._3_0.RequestPDFNoWaterMarkResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(net.docusign.www.api._3_0.RequestPDFNoWaterMarkResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestTemplate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestTemplate.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestTemplates param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestTemplates.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestRecipientToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestRecipientToken.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestDocumentPDFs param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestDocumentPDFs.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestPDFWithCert param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestPDFWithCert.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestPDF param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestPDF.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.GetAuthenticationToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.GetAuthenticationToken.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.CreateEnvelopeFromTemplates param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.CreateEnvelopeFromTemplates.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.CreateEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.CreateEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.UploadTemplate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.UploadTemplate.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestStatusesEx param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestStatusesEx.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestCorrectToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestCorrectToken.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.CreateAndSendEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.CreateAndSendEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.GetAddressBookItems param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.GetAddressBookItems.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestStatusEx param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestStatusEx.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.GetAccountMembershipFeaturesList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.GetAccountMembershipFeaturesList.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.GetRecipientList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.GetRecipientList.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.SynchEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.SynchEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.UpdateAddressBookItems param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.UpdateAddressBookItems.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.GetAccountSettingsList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.GetAccountSettingsList.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestDocumentPDFsEx param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestDocumentPDFsEx.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RemoveAddressBookItems param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RemoveAddressBookItems.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.SaveTemplate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.SaveTemplate.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.Ping param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.Ping.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.GetRecipientEsignList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.GetRecipientEsignList.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestStatuses param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestStatuses.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.CorrectAndResendEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.CorrectAndResendEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.TransferEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.TransferEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestSenderToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestSenderToken.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.EnvelopeAuditEvents param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.EnvelopeAuditEvents.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.ExportAuthoritativeCopy param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.ExportAuthoritativeCopy.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.SendEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.SendEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.VoidEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.VoidEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.PurgeDocuments param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.PurgeDocuments.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestStatus param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestStatus.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.docusign.www.api._3_0.RequestPDFNoWaterMark param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(net.docusign.www.api._3_0.RequestPDFNoWaterMark.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type, java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

        try {

            if (net.docusign.www.api._3_0.RequestTemplate.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestTemplateResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestTemplateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestTemplates.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestTemplates.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestTemplatesResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestTemplatesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestRecipientToken.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestRecipientToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestRecipientTokenResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestRecipientTokenResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestDocumentPDFs.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestDocumentPDFs.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestDocumentPDFsResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestDocumentPDFsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestPDFWithCert.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestPDFWithCert.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestPDFWithCertResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestPDFWithCertResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestPDF.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestPDF.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestPDFResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestPDFResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetAuthenticationToken.class.equals(type)) {

                return net.docusign.www.api._3_0.GetAuthenticationToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetAuthenticationTokenResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.GetAuthenticationTokenResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.CreateEnvelopeFromTemplates.class.equals(type)) {

                return net.docusign.www.api._3_0.CreateEnvelopeFromTemplates.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.CreateEnvelope.class.equals(type)) {

                return net.docusign.www.api._3_0.CreateEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.CreateEnvelopeResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.CreateEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport.class.equals(type)) {

                return net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.UploadTemplate.class.equals(type)) {

                return net.docusign.www.api._3_0.UploadTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.UploadTemplateResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.UploadTemplateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestStatusesEx.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestStatusesEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestStatusesExResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestStatusesExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestCorrectToken.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestCorrectToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestCorrectTokenResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestCorrectTokenResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.CreateAndSendEnvelope.class.equals(type)) {

                return net.docusign.www.api._3_0.CreateAndSendEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetAddressBookItems.class.equals(type)) {

                return net.docusign.www.api._3_0.GetAddressBookItems.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetAddressBookItemsResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.GetAddressBookItemsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestStatusEx.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestStatusEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestStatusExResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestStatusExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetAccountMembershipFeaturesList.class.equals(type)) {

                return net.docusign.www.api._3_0.GetAccountMembershipFeaturesList.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetRecipientList.class.equals(type)) {

                return net.docusign.www.api._3_0.GetRecipientList.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetRecipientListResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.GetRecipientListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.SynchEnvelope.class.equals(type)) {

                return net.docusign.www.api._3_0.SynchEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.SynchEnvelopeResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.SynchEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.UpdateAddressBookItems.class.equals(type)) {

                return net.docusign.www.api._3_0.UpdateAddressBookItems.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.UpdateAddressBookItemsResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.UpdateAddressBookItemsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat.class.equals(type)) {

                return net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetAccountSettingsList.class.equals(type)) {

                return net.docusign.www.api._3_0.GetAccountSettingsList.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetAccountSettingsListResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.GetAccountSettingsListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestDocumentPDFsEx.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestDocumentPDFsEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestDocumentPDFsExResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestDocumentPDFsExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RemoveAddressBookItems.class.equals(type)) {

                return net.docusign.www.api._3_0.RemoveAddressBookItems.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RemoveAddressBookItemsResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RemoveAddressBookItemsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.SaveTemplate.class.equals(type)) {

                return net.docusign.www.api._3_0.SaveTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.SaveTemplateResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.SaveTemplateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.Ping.class.equals(type)) {

                return net.docusign.www.api._3_0.Ping.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.PingResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.PingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetRecipientEsignList.class.equals(type)) {

                return net.docusign.www.api._3_0.GetRecipientEsignList.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.GetRecipientEsignListResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.GetRecipientEsignListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestStatuses.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestStatuses.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestStatusesResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestStatusesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.CorrectAndResendEnvelope.class.equals(type)) {

                return net.docusign.www.api._3_0.CorrectAndResendEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.TransferEnvelope.class.equals(type)) {

                return net.docusign.www.api._3_0.TransferEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.TransferEnvelopeResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.TransferEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestSenderToken.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestSenderToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestSenderTokenResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestSenderTokenResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.EnvelopeAuditEvents.class.equals(type)) {

                return net.docusign.www.api._3_0.EnvelopeAuditEvents.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.EnvelopeAuditEventsResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.EnvelopeAuditEventsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.ExportAuthoritativeCopy.class.equals(type)) {

                return net.docusign.www.api._3_0.ExportAuthoritativeCopy.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.SendEnvelope.class.equals(type)) {

                return net.docusign.www.api._3_0.SendEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.SendEnvelopeResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.SendEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.VoidEnvelope.class.equals(type)) {

                return net.docusign.www.api._3_0.VoidEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.VoidEnvelopeResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.VoidEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.PurgeDocuments.class.equals(type)) {

                return net.docusign.www.api._3_0.PurgeDocuments.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.PurgeDocumentsResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.PurgeDocumentsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestStatus.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestStatusResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestPDFNoWaterMark.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestPDFNoWaterMark.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (net.docusign.www.api._3_0.RequestPDFNoWaterMarkResponse.class.equals(type)) {

                return net.docusign.www.api._3_0.RequestPDFNoWaterMarkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }

}
