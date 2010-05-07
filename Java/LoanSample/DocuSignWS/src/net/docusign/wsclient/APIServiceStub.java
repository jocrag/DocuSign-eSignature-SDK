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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

import net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExport;
import net.docusign.www.api._3_0.AcknowledgeAuthoritativeCopyExportResponse;
import net.docusign.www.api._3_0.CorrectAndResendEnvelope;
import net.docusign.www.api._3_0.CorrectAndResendEnvelopeResponse;
import net.docusign.www.api._3_0.CreateAndSendEnvelope;
import net.docusign.www.api._3_0.CreateAndSendEnvelopeResponse;
import net.docusign.www.api._3_0.CreateEnvelope;
import net.docusign.www.api._3_0.CreateEnvelopeFromTemplates;
import net.docusign.www.api._3_0.CreateEnvelopeFromTemplatesResponse;
import net.docusign.www.api._3_0.CreateEnvelopeResponse;
import net.docusign.www.api._3_0.EnvelopeAuditEvents;
import net.docusign.www.api._3_0.EnvelopeAuditEventsResponse;
import net.docusign.www.api._3_0.ExportAuthoritativeCopy;
import net.docusign.www.api._3_0.ExportAuthoritativeCopyResponse;
import net.docusign.www.api._3_0.GetAccountMembershipFeaturesList;
import net.docusign.www.api._3_0.GetAccountMembershipFeaturesListResponse;
import net.docusign.www.api._3_0.GetAccountSettingsList;
import net.docusign.www.api._3_0.GetAccountSettingsListResponse;
import net.docusign.www.api._3_0.GetAddressBookItems;
import net.docusign.www.api._3_0.GetAddressBookItemsResponse;
import net.docusign.www.api._3_0.GetAuthenticationToken;
import net.docusign.www.api._3_0.GetAuthenticationTokenResponse;
import net.docusign.www.api._3_0.GetRecipientEsignList;
import net.docusign.www.api._3_0.GetRecipientEsignListResponse;
import net.docusign.www.api._3_0.GetRecipientList;
import net.docusign.www.api._3_0.GetRecipientListResponse;
import net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormat;
import net.docusign.www.api._3_0.GetStatusInDocuSignConnectFormatResponse;
import net.docusign.www.api._3_0.Ping;
import net.docusign.www.api._3_0.PingResponse;
import net.docusign.www.api._3_0.PurgeDocuments;
import net.docusign.www.api._3_0.PurgeDocumentsResponse;
import net.docusign.www.api._3_0.RemoveAddressBookItems;
import net.docusign.www.api._3_0.RemoveAddressBookItemsResponse;
import net.docusign.www.api._3_0.RequestDocumentPDFs;
import net.docusign.www.api._3_0.RequestDocumentPDFsEx;
import net.docusign.www.api._3_0.RequestDocumentPDFsExResponse;
import net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsView;
import net.docusign.www.api._3_0.RequestDocumentPDFsRecipientsViewResponse;
import net.docusign.www.api._3_0.RequestDocumentPDFsResponse;
import net.docusign.www.api._3_0.RequestPDF;
import net.docusign.www.api._3_0.RequestPDFResponse;
import net.docusign.www.api._3_0.RequestRecipientToken;
import net.docusign.www.api._3_0.RequestRecipientTokenResponse;
import net.docusign.www.api._3_0.RequestSenderToken;
import net.docusign.www.api._3_0.RequestSenderTokenResponse;
import net.docusign.www.api._3_0.RequestStatus;
import net.docusign.www.api._3_0.RequestStatusEx;
import net.docusign.www.api._3_0.RequestStatusExResponse;
import net.docusign.www.api._3_0.RequestStatusResponse;
import net.docusign.www.api._3_0.RequestStatuses;
import net.docusign.www.api._3_0.RequestStatusesEx;
import net.docusign.www.api._3_0.RequestStatusesExResponse;
import net.docusign.www.api._3_0.RequestStatusesResponse;
import net.docusign.www.api._3_0.RequestTemplate;
import net.docusign.www.api._3_0.RequestTemplateResponse;
import net.docusign.www.api._3_0.RequestTemplates;
import net.docusign.www.api._3_0.RequestTemplatesResponse;
import net.docusign.www.api._3_0.SaveTemplate;
import net.docusign.www.api._3_0.SaveTemplateResponse;
import net.docusign.www.api._3_0.SynchEnvelope;
import net.docusign.www.api._3_0.SynchEnvelopeResponse;
import net.docusign.www.api._3_0.TransferEnvelope;
import net.docusign.www.api._3_0.TransferEnvelopeResponse;
import net.docusign.www.api._3_0.UpdateAddressBookItems;
import net.docusign.www.api._3_0.UpdateAddressBookItemsResponse;
import net.docusign.www.api._3_0.UploadTemplate;
import net.docusign.www.api._3_0.UploadTemplateResponse;
import net.docusign.www.api._3_0.VoidEnvelope;
import net.docusign.www.api._3_0.VoidEnvelopeResponse;

import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.client.Stub;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.axis2.description.AxisOperation;

/*
 *  APIServiceStub java implementation
 */
public class APIServiceStub extends Stub implements APIService {
    private static int counter = 0;
    protected AxisOperation[] _operations;
    private Map<QName, String> faultExceptionClassNameMap = new HashMap<QName, String>();
    private Map<QName, String> faultExceptionNameMap = new HashMap<QName, String>();
    private Map<QName, String> faultMessageMap = new HashMap<QName, String>();
    private javax.xml.namespace.QName[] opNameArray = null;

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

    private static synchronized String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return Long.toString(System.currentTimeMillis()) + "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {

        // creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("APIService" + getUniqueSuffix());
        addAnonymousOperations();

        // creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[35];

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

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestPDF"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAuthenticationToken"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createEnvelopeFromTemplates"));
        _service.addOperation(__operation);

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createEnvelope"));
        _service.addOperation(__operation);

        _operations[7] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "acknowledgeAuthoritativeCopyExport"));
        _service.addOperation(__operation);

        _operations[8] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "uploadTemplate"));
        _service.addOperation(__operation);

        _operations[9] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatusesEx"));
        _service.addOperation(__operation);

        _operations[10] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createAndSendEnvelope"));
        _service.addOperation(__operation);

        _operations[11] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAddressBookItems"));
        _service.addOperation(__operation);

        _operations[12] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatusEx"));
        _service.addOperation(__operation);

        _operations[13] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAccountMembershipFeaturesList"));
        _service.addOperation(__operation);

        _operations[14] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getRecipientList"));
        _service.addOperation(__operation);

        _operations[15] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "synchEnvelope"));
        _service.addOperation(__operation);

        _operations[16] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "updateAddressBookItems"));
        _service.addOperation(__operation);

        _operations[17] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getStatusInDocuSignConnectFormat"));
        _service.addOperation(__operation);

        _operations[18] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAccountSettingsList"));
        _service.addOperation(__operation);

        _operations[19] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFsEx"));
        _service.addOperation(__operation);

        _operations[20] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "removeAddressBookItems"));
        _service.addOperation(__operation);

        _operations[21] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "saveTemplate"));
        _service.addOperation(__operation);

        _operations[22] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ping"));
        _service.addOperation(__operation);

        _operations[23] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getRecipientEsignList"));
        _service.addOperation(__operation);

        _operations[24] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatuses"));
        _service.addOperation(__operation);

        _operations[25] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "correctAndResendEnvelope"));
        _service.addOperation(__operation);

        _operations[26] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFsRecipientsView"));
        _service.addOperation(__operation);

        _operations[27] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "transferEnvelope"));
        _service.addOperation(__operation);

        _operations[28] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestSenderToken"));
        _service.addOperation(__operation);

        _operations[29] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "exportAuthoritativeCopy"));
        _service.addOperation(__operation);

        _operations[30] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "envelopeAuditEvents"));
        _service.addOperation(__operation);

        _operations[31] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "voidEnvelope"));
        _service.addOperation(__operation);

        _operations[32] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "purgeDocuments"));
        _service.addOperation(__operation);

        _operations[33] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatus"));
        _service.addOperation(__operation);

        _operations[34] = __operation;

    }

    /**
     * Auto generated method signature
     *
     * @see net.docusign.wsclient.APIService#requestTemplate
     * @param requestTemplate70
     */

    public RequestTemplateResponse requestTemplate(

    RequestTemplate requestTemplate70)

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

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestTemplate70, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestTemplate")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RequestTemplateResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RequestTemplateResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startrequestTemplate
     * @param requestTemplate70
     */
    public void startrequestTemplate(

    RequestTemplate requestTemplate70,

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

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestTemplate70, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestTemplate")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RequestTemplateResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestTemplate((RequestTemplateResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestTemplate(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorrequestTemplate(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplate(f);
                            }
                        }
                        else {
                            callback.receiveErrorrequestTemplate(f);
                        }
                    }
                    else {
                        callback.receiveErrorrequestTemplate(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
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
     * @param requestTemplates72
     */

    public RequestTemplatesResponse requestTemplates(

    RequestTemplates requestTemplates72)

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

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestTemplates72, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestTemplates")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RequestTemplatesResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RequestTemplatesResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startrequestTemplates
     * @param requestTemplates72
     */
    public void startrequestTemplates(

    RequestTemplates requestTemplates72,

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

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestTemplates72, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestTemplates")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RequestTemplatesResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestTemplates((RequestTemplatesResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestTemplates(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorrequestTemplates(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestTemplates(f);
                            }
                        }
                        else {
                            callback.receiveErrorrequestTemplates(f);
                        }
                    }
                    else {
                        callback.receiveErrorrequestTemplates(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
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
     * @param requestRecipientToken74
     */

    public RequestRecipientTokenResponse requestRecipientToken(

    RequestRecipientToken requestRecipientToken74)

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

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestRecipientToken74, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestRecipientToken")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RequestRecipientTokenResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RequestRecipientTokenResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startrequestRecipientToken
     * @param requestRecipientToken74
     */
    public void startrequestRecipientToken(

    RequestRecipientToken requestRecipientToken74,

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

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestRecipientToken74, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestRecipientToken")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RequestRecipientTokenResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestRecipientToken((RequestRecipientTokenResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestRecipientToken(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorrequestRecipientToken(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestRecipientToken(f);
                            }
                        }
                        else {
                            callback.receiveErrorrequestRecipientToken(f);
                        }
                    }
                    else {
                        callback.receiveErrorrequestRecipientToken(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
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
     * @param requestDocumentPDFs76
     */

    public RequestDocumentPDFsResponse requestDocumentPDFs(

    RequestDocumentPDFs requestDocumentPDFs76)

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

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestDocumentPDFs76, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFs")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RequestDocumentPDFsResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RequestDocumentPDFsResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startrequestDocumentPDFs
     * @param requestDocumentPDFs76
     */
    public void startrequestDocumentPDFs(

    RequestDocumentPDFs requestDocumentPDFs76,

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

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestDocumentPDFs76, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFs")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RequestDocumentPDFsResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestDocumentPDFs((RequestDocumentPDFsResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestDocumentPDFs(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorrequestDocumentPDFs(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFs(f);
                            }
                        }
                        else {
                            callback.receiveErrorrequestDocumentPDFs(f);
                        }
                    }
                    else {
                        callback.receiveErrorrequestDocumentPDFs(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
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
     * @see net.docusign.wsclient.APIService#requestPDF
     * @param requestPDF78
     */

    public RequestPDFResponse requestPDF(

    RequestPDF requestPDF78)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestPDF");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestPDF78, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestPDF")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RequestPDFResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RequestPDFResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startrequestPDF
     * @param requestPDF78
     */
    public void startrequestPDF(

    RequestPDF requestPDF78,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestPDF");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestPDF78, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestPDF")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RequestPDFResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestPDF((RequestPDFResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestPDF(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorrequestPDF(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestPDF(f);
                            }
                        }
                        else {
                            callback.receiveErrorrequestPDF(f);
                        }
                    }
                    else {
                        callback.receiveErrorrequestPDF(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestPDF(axisFault);
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
     * @see net.docusign.wsclient.APIService#getAuthenticationToken
     * @param getAuthenticationToken80
     */

    public GetAuthenticationTokenResponse getAuthenticationToken(

    GetAuthenticationToken getAuthenticationToken80)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAuthenticationToken");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAuthenticationToken80, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAuthenticationToken")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetAuthenticationTokenResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (GetAuthenticationTokenResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startgetAuthenticationToken
     * @param getAuthenticationToken80
     */
    public void startgetAuthenticationToken(

    GetAuthenticationToken getAuthenticationToken80,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAuthenticationToken");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAuthenticationToken80, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAuthenticationToken")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), GetAuthenticationTokenResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAuthenticationToken((GetAuthenticationTokenResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAuthenticationToken(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorgetAuthenticationToken(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAuthenticationToken(f);
                            }
                        }
                        else {
                            callback.receiveErrorgetAuthenticationToken(f);
                        }
                    }
                    else {
                        callback.receiveErrorgetAuthenticationToken(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAuthenticationToken(axisFault);
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
     * @see net.docusign.wsclient.APIService#createEnvelopeFromTemplates
     * @param createEnvelopeFromTemplates82
     */

    public CreateEnvelopeFromTemplatesResponse createEnvelopeFromTemplates(

    CreateEnvelopeFromTemplates createEnvelopeFromTemplates82)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CreateEnvelopeFromTemplates");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createEnvelopeFromTemplates82, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createEnvelopeFromTemplates")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), CreateEnvelopeFromTemplatesResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (CreateEnvelopeFromTemplatesResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startcreateEnvelopeFromTemplates
     * @param createEnvelopeFromTemplates82
     */
    public void startcreateEnvelopeFromTemplates(

    CreateEnvelopeFromTemplates createEnvelopeFromTemplates82,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CreateEnvelopeFromTemplates");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createEnvelopeFromTemplates82, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createEnvelopeFromTemplates")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), CreateEnvelopeFromTemplatesResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultcreateEnvelopeFromTemplates((CreateEnvelopeFromTemplatesResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorcreateEnvelopeFromTemplates(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorcreateEnvelopeFromTemplates(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelopeFromTemplates(f);
                            }
                        }
                        else {
                            callback.receiveErrorcreateEnvelopeFromTemplates(f);
                        }
                    }
                    else {
                        callback.receiveErrorcreateEnvelopeFromTemplates(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorcreateEnvelopeFromTemplates(axisFault);
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
     * @see net.docusign.wsclient.APIService#createEnvelope
     * @param createEnvelope84
     */

    public CreateEnvelopeResponse createEnvelope(

    CreateEnvelope createEnvelope84)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CreateEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createEnvelope84, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createEnvelope")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), CreateEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (CreateEnvelopeResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startcreateEnvelope
     * @param createEnvelope84
     */
    public void startcreateEnvelope(

    CreateEnvelope createEnvelope84,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CreateEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createEnvelope84, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createEnvelope")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), CreateEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultcreateEnvelope((CreateEnvelopeResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorcreateEnvelope(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorcreateEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateEnvelope(f);
                            }
                        }
                        else {
                            callback.receiveErrorcreateEnvelope(f);
                        }
                    }
                    else {
                        callback.receiveErrorcreateEnvelope(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorcreateEnvelope(axisFault);
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
     * @see net.docusign.wsclient.APIService#acknowledgeAuthoritativeCopyExport
     * @param acknowledgeAuthoritativeCopyExport86
     */

    public AcknowledgeAuthoritativeCopyExportResponse acknowledgeAuthoritativeCopyExport(

    AcknowledgeAuthoritativeCopyExport acknowledgeAuthoritativeCopyExport86)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/AcknowledgeAuthoritativeCopyExport");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), acknowledgeAuthoritativeCopyExport86, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "acknowledgeAuthoritativeCopyExport")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), AcknowledgeAuthoritativeCopyExportResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (AcknowledgeAuthoritativeCopyExportResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startacknowledgeAuthoritativeCopyExport
     * @param acknowledgeAuthoritativeCopyExport86
     */
    public void startacknowledgeAuthoritativeCopyExport(

    AcknowledgeAuthoritativeCopyExport acknowledgeAuthoritativeCopyExport86,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/AcknowledgeAuthoritativeCopyExport");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), acknowledgeAuthoritativeCopyExport86, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "acknowledgeAuthoritativeCopyExport")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), AcknowledgeAuthoritativeCopyExportResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultacknowledgeAuthoritativeCopyExport((AcknowledgeAuthoritativeCopyExportResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErroracknowledgeAuthoritativeCopyExport(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErroracknowledgeAuthoritativeCopyExport(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                            }
                        }
                        else {
                            callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                        }
                    }
                    else {
                        callback.receiveErroracknowledgeAuthoritativeCopyExport(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErroracknowledgeAuthoritativeCopyExport(axisFault);
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
     * @see net.docusign.wsclient.APIService#uploadTemplate
     * @param uploadTemplate88
     */

    public UploadTemplateResponse uploadTemplate(

    UploadTemplate uploadTemplate88)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/UploadTemplate");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), uploadTemplate88, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "uploadTemplate")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), UploadTemplateResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (UploadTemplateResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startuploadTemplate
     * @param uploadTemplate88
     */
    public void startuploadTemplate(

    UploadTemplate uploadTemplate88,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/UploadTemplate");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), uploadTemplate88, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "uploadTemplate")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), UploadTemplateResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultuploadTemplate((UploadTemplateResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErroruploadTemplate(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErroruploadTemplate(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErroruploadTemplate(f);
                            }
                        }
                        else {
                            callback.receiveErroruploadTemplate(f);
                        }
                    }
                    else {
                        callback.receiveErroruploadTemplate(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErroruploadTemplate(axisFault);
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
     * @see net.docusign.wsclient.APIService#requestStatusesEx
     * @param requestStatusesEx90
     */

    public RequestStatusesExResponse requestStatusesEx(

    RequestStatusesEx requestStatusesEx90)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatusesEx");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatusesEx90, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatusesEx")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RequestStatusesExResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RequestStatusesExResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startrequestStatusesEx
     * @param requestStatusesEx90
     */
    public void startrequestStatusesEx(

    RequestStatusesEx requestStatusesEx90,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatusesEx");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatusesEx90, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatusesEx")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RequestStatusesExResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestStatusesEx((RequestStatusesExResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestStatusesEx(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorrequestStatusesEx(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusesEx(f);
                            }
                        }
                        else {
                            callback.receiveErrorrequestStatusesEx(f);
                        }
                    }
                    else {
                        callback.receiveErrorrequestStatusesEx(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestStatusesEx(axisFault);
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
     * @see net.docusign.wsclient.APIService#createAndSendEnvelope
     * @param createAndSendEnvelope92
     */

    public CreateAndSendEnvelopeResponse createAndSendEnvelope(

    CreateAndSendEnvelope createAndSendEnvelope92)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CreateAndSendEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createAndSendEnvelope92, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createAndSendEnvelope")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), CreateAndSendEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (CreateAndSendEnvelopeResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startcreateAndSendEnvelope
     * @param createAndSendEnvelope92
     */
    public void startcreateAndSendEnvelope(

    CreateAndSendEnvelope createAndSendEnvelope92,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CreateAndSendEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createAndSendEnvelope92, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "createAndSendEnvelope")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), CreateAndSendEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultcreateAndSendEnvelope((CreateAndSendEnvelopeResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorcreateAndSendEnvelope(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorcreateAndSendEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcreateAndSendEnvelope(f);
                            }
                        }
                        else {
                            callback.receiveErrorcreateAndSendEnvelope(f);
                        }
                    }
                    else {
                        callback.receiveErrorcreateAndSendEnvelope(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorcreateAndSendEnvelope(axisFault);
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
     * @see net.docusign.wsclient.APIService#getAddressBookItems
     * @param getAddressBookItems94
     */

    public GetAddressBookItemsResponse getAddressBookItems(

    GetAddressBookItems getAddressBookItems94)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAddressBookItems");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAddressBookItems94, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAddressBookItems")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetAddressBookItemsResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (GetAddressBookItemsResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startgetAddressBookItems
     * @param getAddressBookItems94
     */
    public void startgetAddressBookItems(

    GetAddressBookItems getAddressBookItems94,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAddressBookItems");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAddressBookItems94, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAddressBookItems")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), GetAddressBookItemsResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAddressBookItems((GetAddressBookItemsResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAddressBookItems(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorgetAddressBookItems(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAddressBookItems(f);
                            }
                        }
                        else {
                            callback.receiveErrorgetAddressBookItems(f);
                        }
                    }
                    else {
                        callback.receiveErrorgetAddressBookItems(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAddressBookItems(axisFault);
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
     * @see net.docusign.wsclient.APIService#requestStatusEx
     * @param requestStatusEx96
     */

    public RequestStatusExResponse requestStatusEx(

    RequestStatusEx requestStatusEx96)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatusEx");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatusEx96, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatusEx")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RequestStatusExResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RequestStatusExResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startrequestStatusEx
     * @param requestStatusEx96
     */
    public void startrequestStatusEx(

    RequestStatusEx requestStatusEx96,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatusEx");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatusEx96, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatusEx")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RequestStatusExResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestStatusEx((RequestStatusExResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestStatusEx(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorrequestStatusEx(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatusEx(f);
                            }
                        }
                        else {
                            callback.receiveErrorrequestStatusEx(f);
                        }
                    }
                    else {
                        callback.receiveErrorrequestStatusEx(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestStatusEx(axisFault);
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
     * @see net.docusign.wsclient.APIService#getAccountMembershipFeaturesList
     * @param getAccountMembershipFeaturesList98
     */

    public GetAccountMembershipFeaturesListResponse getAccountMembershipFeaturesList(

    GetAccountMembershipFeaturesList getAccountMembershipFeaturesList98)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAccountMembershipFeaturesList");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAccountMembershipFeaturesList98, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAccountMembershipFeaturesList")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetAccountMembershipFeaturesListResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (GetAccountMembershipFeaturesListResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startgetAccountMembershipFeaturesList
     * @param getAccountMembershipFeaturesList98
     */
    public void startgetAccountMembershipFeaturesList(

    GetAccountMembershipFeaturesList getAccountMembershipFeaturesList98,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAccountMembershipFeaturesList");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAccountMembershipFeaturesList98, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAccountMembershipFeaturesList")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), GetAccountMembershipFeaturesListResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAccountMembershipFeaturesList((GetAccountMembershipFeaturesListResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAccountMembershipFeaturesList(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorgetAccountMembershipFeaturesList(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountMembershipFeaturesList(f);
                            }
                        }
                        else {
                            callback.receiveErrorgetAccountMembershipFeaturesList(f);
                        }
                    }
                    else {
                        callback.receiveErrorgetAccountMembershipFeaturesList(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAccountMembershipFeaturesList(axisFault);
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
     * @see net.docusign.wsclient.APIService#getRecipientList
     * @param getRecipientList100
     */

    public GetRecipientListResponse getRecipientList(

    GetRecipientList getRecipientList100)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetRecipientList");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getRecipientList100, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getRecipientList")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetRecipientListResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (GetRecipientListResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startgetRecipientList
     * @param getRecipientList100
     */
    public void startgetRecipientList(

    GetRecipientList getRecipientList100,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetRecipientList");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getRecipientList100, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getRecipientList")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), GetRecipientListResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetRecipientList((GetRecipientListResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetRecipientList(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorgetRecipientList(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientList(f);
                            }
                        }
                        else {
                            callback.receiveErrorgetRecipientList(f);
                        }
                    }
                    else {
                        callback.receiveErrorgetRecipientList(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetRecipientList(axisFault);
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
     * @see net.docusign.wsclient.APIService#synchEnvelope
     * @param synchEnvelope102
     */

    public SynchEnvelopeResponse synchEnvelope(

    SynchEnvelope synchEnvelope102)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/SynchEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), synchEnvelope102, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "synchEnvelope")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), SynchEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (SynchEnvelopeResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startsynchEnvelope
     * @param synchEnvelope102
     */
    public void startsynchEnvelope(

    SynchEnvelope synchEnvelope102,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/SynchEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), synchEnvelope102, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "synchEnvelope")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), SynchEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultsynchEnvelope((SynchEnvelopeResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorsynchEnvelope(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorsynchEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsynchEnvelope(f);
                            }
                        }
                        else {
                            callback.receiveErrorsynchEnvelope(f);
                        }
                    }
                    else {
                        callback.receiveErrorsynchEnvelope(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorsynchEnvelope(axisFault);
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
     * @see net.docusign.wsclient.APIService#updateAddressBookItems
     * @param updateAddressBookItems104
     */

    public UpdateAddressBookItemsResponse updateAddressBookItems(

    UpdateAddressBookItems updateAddressBookItems104)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/UpdateAddressBookItems");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), updateAddressBookItems104, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "updateAddressBookItems")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), UpdateAddressBookItemsResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (UpdateAddressBookItemsResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startupdateAddressBookItems
     * @param updateAddressBookItems104
     */
    public void startupdateAddressBookItems(

    UpdateAddressBookItems updateAddressBookItems104,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/UpdateAddressBookItems");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), updateAddressBookItems104, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "updateAddressBookItems")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), UpdateAddressBookItemsResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultupdateAddressBookItems((UpdateAddressBookItemsResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorupdateAddressBookItems(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorupdateAddressBookItems(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorupdateAddressBookItems(f);
                            }
                        }
                        else {
                            callback.receiveErrorupdateAddressBookItems(f);
                        }
                    }
                    else {
                        callback.receiveErrorupdateAddressBookItems(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorupdateAddressBookItems(axisFault);
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
     * @see net.docusign.wsclient.APIService#getStatusInDocuSignConnectFormat
     * @param getStatusInDocuSignConnectFormat106
     */

    public GetStatusInDocuSignConnectFormatResponse getStatusInDocuSignConnectFormat(

    GetStatusInDocuSignConnectFormat getStatusInDocuSignConnectFormat106)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetStatusInDocuSignConnectFormat");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getStatusInDocuSignConnectFormat106, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getStatusInDocuSignConnectFormat")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetStatusInDocuSignConnectFormatResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (GetStatusInDocuSignConnectFormatResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startgetStatusInDocuSignConnectFormat
     * @param getStatusInDocuSignConnectFormat106
     */
    public void startgetStatusInDocuSignConnectFormat(

    GetStatusInDocuSignConnectFormat getStatusInDocuSignConnectFormat106,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetStatusInDocuSignConnectFormat");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getStatusInDocuSignConnectFormat106, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getStatusInDocuSignConnectFormat")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), GetStatusInDocuSignConnectFormatResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetStatusInDocuSignConnectFormat((GetStatusInDocuSignConnectFormatResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetStatusInDocuSignConnectFormat(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorgetStatusInDocuSignConnectFormat(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                            }
                        }
                        else {
                            callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                        }
                    }
                    else {
                        callback.receiveErrorgetStatusInDocuSignConnectFormat(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetStatusInDocuSignConnectFormat(axisFault);
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
     * @see net.docusign.wsclient.APIService#getAccountSettingsList
     * @param getAccountSettingsList108
     */

    public GetAccountSettingsListResponse getAccountSettingsList(

    GetAccountSettingsList getAccountSettingsList108)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAccountSettingsList");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAccountSettingsList108, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAccountSettingsList")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetAccountSettingsListResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (GetAccountSettingsListResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startgetAccountSettingsList
     * @param getAccountSettingsList108
     */
    public void startgetAccountSettingsList(

    GetAccountSettingsList getAccountSettingsList108,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetAccountSettingsList");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAccountSettingsList108, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getAccountSettingsList")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), GetAccountSettingsListResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetAccountSettingsList((GetAccountSettingsListResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetAccountSettingsList(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorgetAccountSettingsList(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetAccountSettingsList(f);
                            }
                        }
                        else {
                            callback.receiveErrorgetAccountSettingsList(f);
                        }
                    }
                    else {
                        callback.receiveErrorgetAccountSettingsList(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetAccountSettingsList(axisFault);
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
     * @see net.docusign.wsclient.APIService#requestDocumentPDFsEx
     * @param requestDocumentPDFsEx110
     */

    public RequestDocumentPDFsExResponse requestDocumentPDFsEx(

    RequestDocumentPDFsEx requestDocumentPDFsEx110)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestDocumentPDFsEx");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestDocumentPDFsEx110, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFsEx")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RequestDocumentPDFsExResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RequestDocumentPDFsExResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startrequestDocumentPDFsEx
     * @param requestDocumentPDFsEx110
     */
    public void startrequestDocumentPDFsEx(

    RequestDocumentPDFsEx requestDocumentPDFsEx110,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestDocumentPDFsEx");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestDocumentPDFsEx110, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFsEx")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RequestDocumentPDFsExResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestDocumentPDFsEx((RequestDocumentPDFsExResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestDocumentPDFsEx(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorrequestDocumentPDFsEx(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsEx(f);
                            }
                        }
                        else {
                            callback.receiveErrorrequestDocumentPDFsEx(f);
                        }
                    }
                    else {
                        callback.receiveErrorrequestDocumentPDFsEx(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestDocumentPDFsEx(axisFault);
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
     * @see net.docusign.wsclient.APIService#removeAddressBookItems
     * @param removeAddressBookItems112
     */

    public RemoveAddressBookItemsResponse removeAddressBookItems(

    RemoveAddressBookItems removeAddressBookItems112)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RemoveAddressBookItems");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), removeAddressBookItems112, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "removeAddressBookItems")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RemoveAddressBookItemsResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RemoveAddressBookItemsResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startremoveAddressBookItems
     * @param removeAddressBookItems112
     */
    public void startremoveAddressBookItems(

    RemoveAddressBookItems removeAddressBookItems112,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RemoveAddressBookItems");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), removeAddressBookItems112, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "removeAddressBookItems")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RemoveAddressBookItemsResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultremoveAddressBookItems((RemoveAddressBookItemsResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorremoveAddressBookItems(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorremoveAddressBookItems(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorremoveAddressBookItems(f);
                            }
                        }
                        else {
                            callback.receiveErrorremoveAddressBookItems(f);
                        }
                    }
                    else {
                        callback.receiveErrorremoveAddressBookItems(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorremoveAddressBookItems(axisFault);
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
     * @see net.docusign.wsclient.APIService#saveTemplate
     * @param saveTemplate114
     */

    public SaveTemplateResponse saveTemplate(

    SaveTemplate saveTemplate114)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/SaveTemplate");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), saveTemplate114, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "saveTemplate")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), SaveTemplateResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (SaveTemplateResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startsaveTemplate
     * @param saveTemplate114
     */
    public void startsaveTemplate(

    SaveTemplate saveTemplate114,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/SaveTemplate");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), saveTemplate114, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "saveTemplate")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), SaveTemplateResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultsaveTemplate((SaveTemplateResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorsaveTemplate(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorsaveTemplate(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorsaveTemplate(f);
                            }
                        }
                        else {
                            callback.receiveErrorsaveTemplate(f);
                        }
                    }
                    else {
                        callback.receiveErrorsaveTemplate(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorsaveTemplate(axisFault);
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
     * @see net.docusign.wsclient.APIService#ping
     * @param ping116
     */

    public PingResponse ping(

    Ping ping116)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/Ping");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), ping116, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ping")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), PingResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (PingResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startping
     * @param ping116
     */
    public void startping(

    Ping ping116,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/Ping");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), ping116, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ping")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), PingResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultping((PingResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorping(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorping(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorping(f);
                            }
                        }
                        else {
                            callback.receiveErrorping(f);
                        }
                    }
                    else {
                        callback.receiveErrorping(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorping(axisFault);
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
     * @see net.docusign.wsclient.APIService#getRecipientEsignList
     * @param getRecipientEsignList118
     */

    public GetRecipientEsignListResponse getRecipientEsignList(

    GetRecipientEsignList getRecipientEsignList118)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetRecipientEsignList");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getRecipientEsignList118, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getRecipientEsignList")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetRecipientEsignListResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (GetRecipientEsignListResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startgetRecipientEsignList
     * @param getRecipientEsignList118
     */
    public void startgetRecipientEsignList(

    GetRecipientEsignList getRecipientEsignList118,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/GetRecipientEsignList");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getRecipientEsignList118, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "getRecipientEsignList")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), GetRecipientEsignListResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultgetRecipientEsignList((GetRecipientEsignListResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetRecipientEsignList(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorgetRecipientEsignList(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorgetRecipientEsignList(f);
                            }
                        }
                        else {
                            callback.receiveErrorgetRecipientEsignList(f);
                        }
                    }
                    else {
                        callback.receiveErrorgetRecipientEsignList(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetRecipientEsignList(axisFault);
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
     * @see net.docusign.wsclient.APIService#requestStatuses
     * @param requestStatuses120
     */

    public RequestStatusesResponse requestStatuses(

    RequestStatuses requestStatuses120)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatuses");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatuses120, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatuses")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RequestStatusesResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RequestStatusesResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startrequestStatuses
     * @param requestStatuses120
     */
    public void startrequestStatuses(

    RequestStatuses requestStatuses120,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatuses");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatuses120, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatuses")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RequestStatusesResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestStatuses((RequestStatusesResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestStatuses(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorrequestStatuses(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatuses(f);
                            }
                        }
                        else {
                            callback.receiveErrorrequestStatuses(f);
                        }
                    }
                    else {
                        callback.receiveErrorrequestStatuses(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestStatuses(axisFault);
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
     * @see net.docusign.wsclient.APIService#correctAndResendEnvelope
     * @param correctAndResendEnvelope122
     */

    public CorrectAndResendEnvelopeResponse correctAndResendEnvelope(

    CorrectAndResendEnvelope correctAndResendEnvelope122)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CorrectAndResendEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), correctAndResendEnvelope122, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "correctAndResendEnvelope")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), CorrectAndResendEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (CorrectAndResendEnvelopeResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startcorrectAndResendEnvelope
     * @param correctAndResendEnvelope122
     */
    public void startcorrectAndResendEnvelope(

    CorrectAndResendEnvelope correctAndResendEnvelope122,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/CorrectAndResendEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), correctAndResendEnvelope122, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "correctAndResendEnvelope")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), CorrectAndResendEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultcorrectAndResendEnvelope((CorrectAndResendEnvelopeResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorcorrectAndResendEnvelope(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorcorrectAndResendEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorcorrectAndResendEnvelope(f);
                            }
                        }
                        else {
                            callback.receiveErrorcorrectAndResendEnvelope(f);
                        }
                    }
                    else {
                        callback.receiveErrorcorrectAndResendEnvelope(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorcorrectAndResendEnvelope(axisFault);
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
     * @see net.docusign.wsclient.APIService#requestDocumentPDFsRecipientsView
     * @param requestDocumentPDFsRecipientsView124
     */

    public RequestDocumentPDFsRecipientsViewResponse requestDocumentPDFsRecipientsView(

    RequestDocumentPDFsRecipientsView requestDocumentPDFsRecipientsView124)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestDocumentPDFsRecipientsView");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestDocumentPDFsRecipientsView124, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFsRecipientsView")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RequestDocumentPDFsRecipientsViewResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RequestDocumentPDFsRecipientsViewResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startrequestDocumentPDFsRecipientsView
     * @param requestDocumentPDFsRecipientsView124
     */
    public void startrequestDocumentPDFsRecipientsView(

    RequestDocumentPDFsRecipientsView requestDocumentPDFsRecipientsView124,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestDocumentPDFsRecipientsView");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestDocumentPDFsRecipientsView124, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestDocumentPDFsRecipientsView")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RequestDocumentPDFsRecipientsViewResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestDocumentPDFsRecipientsView((RequestDocumentPDFsRecipientsViewResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestDocumentPDFsRecipientsView(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorrequestDocumentPDFsRecipientsView(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                            }
                        }
                        else {
                            callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                        }
                    }
                    else {
                        callback.receiveErrorrequestDocumentPDFsRecipientsView(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestDocumentPDFsRecipientsView(axisFault);
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
     * @see net.docusign.wsclient.APIService#transferEnvelope
     * @param transferEnvelope126
     */

    public TransferEnvelopeResponse transferEnvelope(

    TransferEnvelope transferEnvelope126)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/TransferEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), transferEnvelope126, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "transferEnvelope")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), TransferEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (TransferEnvelopeResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#starttransferEnvelope
     * @param transferEnvelope126
     */
    public void starttransferEnvelope(

    TransferEnvelope transferEnvelope126,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/TransferEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), transferEnvelope126, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "transferEnvelope")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), TransferEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResulttransferEnvelope((TransferEnvelopeResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrortransferEnvelope(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrortransferEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrortransferEnvelope(f);
                            }
                        }
                        else {
                            callback.receiveErrortransferEnvelope(f);
                        }
                    }
                    else {
                        callback.receiveErrortransferEnvelope(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrortransferEnvelope(axisFault);
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
     * @see net.docusign.wsclient.APIService#requestSenderToken
     * @param requestSenderToken128
     */

    public RequestSenderTokenResponse requestSenderToken(

    RequestSenderToken requestSenderToken128)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestSenderToken");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestSenderToken128, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestSenderToken")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RequestSenderTokenResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RequestSenderTokenResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startrequestSenderToken
     * @param requestSenderToken128
     */
    public void startrequestSenderToken(

    RequestSenderToken requestSenderToken128,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestSenderToken");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestSenderToken128, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestSenderToken")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RequestSenderTokenResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestSenderToken((RequestSenderTokenResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestSenderToken(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorrequestSenderToken(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestSenderToken(f);
                            }
                        }
                        else {
                            callback.receiveErrorrequestSenderToken(f);
                        }
                    }
                    else {
                        callback.receiveErrorrequestSenderToken(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestSenderToken(axisFault);
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
     * @see net.docusign.wsclient.APIService#exportAuthoritativeCopy
     * @param exportAuthoritativeCopy130
     */

    public ExportAuthoritativeCopyResponse exportAuthoritativeCopy(

    ExportAuthoritativeCopy exportAuthoritativeCopy130)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/ExportAuthoritativeCopy");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), exportAuthoritativeCopy130, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "exportAuthoritativeCopy")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), ExportAuthoritativeCopyResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (ExportAuthoritativeCopyResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startexportAuthoritativeCopy
     * @param exportAuthoritativeCopy130
     */
    public void startexportAuthoritativeCopy(

    ExportAuthoritativeCopy exportAuthoritativeCopy130,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/ExportAuthoritativeCopy");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), exportAuthoritativeCopy130, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "exportAuthoritativeCopy")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), ExportAuthoritativeCopyResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultexportAuthoritativeCopy((ExportAuthoritativeCopyResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorexportAuthoritativeCopy(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorexportAuthoritativeCopy(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorexportAuthoritativeCopy(f);
                            }
                        }
                        else {
                            callback.receiveErrorexportAuthoritativeCopy(f);
                        }
                    }
                    else {
                        callback.receiveErrorexportAuthoritativeCopy(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorexportAuthoritativeCopy(axisFault);
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
     * @see net.docusign.wsclient.APIService#envelopeAuditEvents
     * @param envelopeAuditEvents132
     */

    public EnvelopeAuditEventsResponse envelopeAuditEvents(

    EnvelopeAuditEvents envelopeAuditEvents132)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/EnvelopeAuditEvents");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), envelopeAuditEvents132, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "envelopeAuditEvents")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), EnvelopeAuditEventsResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (EnvelopeAuditEventsResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startenvelopeAuditEvents
     * @param envelopeAuditEvents132
     */
    public void startenvelopeAuditEvents(

    EnvelopeAuditEvents envelopeAuditEvents132,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/EnvelopeAuditEvents");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), envelopeAuditEvents132, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "envelopeAuditEvents")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), EnvelopeAuditEventsResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultenvelopeAuditEvents((EnvelopeAuditEventsResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorenvelopeAuditEvents(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorenvelopeAuditEvents(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorenvelopeAuditEvents(f);
                            }
                        }
                        else {
                            callback.receiveErrorenvelopeAuditEvents(f);
                        }
                    }
                    else {
                        callback.receiveErrorenvelopeAuditEvents(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorenvelopeAuditEvents(axisFault);
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
     * @see net.docusign.wsclient.APIService#voidEnvelope
     * @param voidEnvelope134
     */

    public VoidEnvelopeResponse voidEnvelope(

    VoidEnvelope voidEnvelope134)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/VoidEnvelope");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), voidEnvelope134, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "voidEnvelope")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), VoidEnvelopeResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (VoidEnvelopeResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startvoidEnvelope
     * @param voidEnvelope134
     */
    public void startvoidEnvelope(

    VoidEnvelope voidEnvelope134,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/VoidEnvelope");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), voidEnvelope134, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "voidEnvelope")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), VoidEnvelopeResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultvoidEnvelope((VoidEnvelopeResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorvoidEnvelope(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorvoidEnvelope(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorvoidEnvelope(f);
                            }
                        }
                        else {
                            callback.receiveErrorvoidEnvelope(f);
                        }
                    }
                    else {
                        callback.receiveErrorvoidEnvelope(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorvoidEnvelope(axisFault);
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
     * @see net.docusign.wsclient.APIService#purgeDocuments
     * @param purgeDocuments136
     */

    public PurgeDocumentsResponse purgeDocuments(

    PurgeDocuments purgeDocuments136)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/PurgeDocuments");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), purgeDocuments136, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "purgeDocuments")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), PurgeDocumentsResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (PurgeDocumentsResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startpurgeDocuments
     * @param purgeDocuments136
     */
    public void startpurgeDocuments(

    PurgeDocuments purgeDocuments136,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/PurgeDocuments");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), purgeDocuments136, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "purgeDocuments")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), PurgeDocumentsResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultpurgeDocuments((PurgeDocumentsResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorpurgeDocuments(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorpurgeDocuments(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorpurgeDocuments(f);
                            }
                        }
                        else {
                            callback.receiveErrorpurgeDocuments(f);
                        }
                    }
                    else {
                        callback.receiveErrorpurgeDocuments(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorpurgeDocuments(axisFault);
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
     * @see net.docusign.wsclient.APIService#requestStatus
     * @param requestStatus138
     */

    public RequestStatusResponse requestStatus(

    RequestStatus requestStatus138)

    throws java.rmi.RemoteException

    {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[34].getName());
            _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatus");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatus138, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatus")));

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

            Object object = fromOM(_returnEnv.getBody().getFirstElement(), RequestStatusResponse.class, getEnvelopeNamespaces(_returnEnv));

            return (RequestStatusResponse) object;

        }
        catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception ex = (Exception) exceptionClass.newInstance();
                        // message class
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass, null);
                        Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                        m.invoke(ex, new Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }
                    catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                    catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                }
                else {
                    throw f;
                }
            }
            else {
                throw f;
            }
        }
        finally {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see net.docusign.wsclient.APIService#startrequestStatus
     * @param requestStatus138
     */
    public void startrequestStatus(

    RequestStatus requestStatus138,

    final net.docusign.wsclient.APIServiceCallbackHandler callback)

    throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[34].getName());
        _operationClient.getOptions().setAction("http://www.docusign.net/API/3.0/RequestStatus");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        // Style is Doc.

        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), requestStatus138, optimizeContent(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "requestStatus")));

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

                    Object object = fromOM(resultEnv.getBody().getFirstElement(), RequestStatusResponse.class, getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultrequestStatus((RequestStatusResponse) object);

                }
                catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorrequestStatus(e);
                }
            }

            public void onError(Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                            // make the fault by reflection
                            try {
                                String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                                Class exceptionClass = Class.forName(exceptionClassName);
                                Exception ex = (Exception) exceptionClass.newInstance();
                                // message class
                                String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                                Class messageClass = Class.forName(messageClassName);
                                Object messageObject = fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", new Class[] { messageClass });
                                m.invoke(ex, new Object[] { messageObject });

                                callback.receiveErrorrequestStatus(new java.rmi.RemoteException(ex.getMessage(), ex));
                            }
                            catch (ClassCastException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            }
                            catch (ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            }
                            catch (NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            }
                            catch (InvocationTargetException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            }
                            catch (IllegalAccessException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            }
                            catch (InstantiationException e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            }
                            catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the
                                // original Axis fault
                                callback.receiveErrorrequestStatus(f);
                            }
                        }
                        else {
                            callback.receiveErrorrequestStatus(f);
                        }
                    }
                    else {
                        callback.receiveErrorrequestStatus(f);
                    }
                }
                else {
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
                }
                catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorrequestStatus(axisFault);
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
    private org.apache.axiom.om.OMElement toOM(RequestTemplate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestTemplate.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestTemplateResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestTemplateResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestTemplates param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestTemplates.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestTemplatesResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestTemplatesResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestRecipientToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestRecipientToken.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestRecipientTokenResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestRecipientTokenResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestDocumentPDFs param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestDocumentPDFs.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestDocumentPDFsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestDocumentPDFsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestPDF param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestPDF.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestPDFResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestPDFResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetAuthenticationToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetAuthenticationToken.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetAuthenticationTokenResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetAuthenticationTokenResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(CreateEnvelopeFromTemplates param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(CreateEnvelopeFromTemplates.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(CreateEnvelopeFromTemplatesResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(CreateEnvelopeFromTemplatesResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(CreateEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(CreateEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(CreateEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(CreateEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(AcknowledgeAuthoritativeCopyExport param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(AcknowledgeAuthoritativeCopyExport.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(AcknowledgeAuthoritativeCopyExportResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(AcknowledgeAuthoritativeCopyExportResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(UploadTemplate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(UploadTemplate.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(UploadTemplateResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(UploadTemplateResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestStatusesEx param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestStatusesEx.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestStatusesExResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestStatusesExResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(CreateAndSendEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(CreateAndSendEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(CreateAndSendEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(CreateAndSendEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetAddressBookItems param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetAddressBookItems.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetAddressBookItemsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetAddressBookItemsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestStatusEx param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestStatusEx.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestStatusExResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestStatusExResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetAccountMembershipFeaturesList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetAccountMembershipFeaturesList.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetAccountMembershipFeaturesListResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetAccountMembershipFeaturesListResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetRecipientList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetRecipientList.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetRecipientListResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetRecipientListResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(SynchEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(SynchEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(SynchEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(SynchEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(UpdateAddressBookItems param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(UpdateAddressBookItems.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(UpdateAddressBookItemsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(UpdateAddressBookItemsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetStatusInDocuSignConnectFormat param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetStatusInDocuSignConnectFormat.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetStatusInDocuSignConnectFormatResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetStatusInDocuSignConnectFormatResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetAccountSettingsList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetAccountSettingsList.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetAccountSettingsListResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetAccountSettingsListResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestDocumentPDFsEx param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestDocumentPDFsEx.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestDocumentPDFsExResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestDocumentPDFsExResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RemoveAddressBookItems param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RemoveAddressBookItems.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RemoveAddressBookItemsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RemoveAddressBookItemsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(SaveTemplate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(SaveTemplate.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(SaveTemplateResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(SaveTemplateResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(Ping param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(Ping.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(PingResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(PingResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetRecipientEsignList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetRecipientEsignList.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(GetRecipientEsignListResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(GetRecipientEsignListResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestStatuses param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestStatuses.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestStatusesResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestStatusesResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(CorrectAndResendEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(CorrectAndResendEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(CorrectAndResendEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(CorrectAndResendEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestDocumentPDFsRecipientsView param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestDocumentPDFsRecipientsView.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestDocumentPDFsRecipientsViewResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestDocumentPDFsRecipientsViewResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(TransferEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(TransferEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(TransferEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(TransferEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestSenderToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestSenderToken.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestSenderTokenResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestSenderTokenResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(ExportAuthoritativeCopy param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(ExportAuthoritativeCopy.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(ExportAuthoritativeCopyResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(ExportAuthoritativeCopyResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(EnvelopeAuditEvents param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(EnvelopeAuditEvents.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(EnvelopeAuditEventsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(EnvelopeAuditEventsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(VoidEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(VoidEnvelope.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(VoidEnvelopeResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(VoidEnvelopeResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(PurgeDocuments param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(PurgeDocuments.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(PurgeDocumentsResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(PurgeDocumentsResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestStatus param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestStatus.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.om.OMElement toOM(RequestStatusResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {
            return param.getOMElement(RequestStatusResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RequestTemplate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RequestTemplate.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RequestTemplates param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RequestTemplates.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RequestRecipientToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RequestRecipientToken.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RequestDocumentPDFs param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RequestDocumentPDFs.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RequestPDF param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RequestPDF.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, GetAuthenticationToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(GetAuthenticationToken.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, CreateEnvelopeFromTemplates param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(CreateEnvelopeFromTemplates.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, CreateEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(CreateEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, AcknowledgeAuthoritativeCopyExport param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(AcknowledgeAuthoritativeCopyExport.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, UploadTemplate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(UploadTemplate.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RequestStatusesEx param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RequestStatusesEx.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, CreateAndSendEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(CreateAndSendEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, GetAddressBookItems param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(GetAddressBookItems.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RequestStatusEx param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RequestStatusEx.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, GetAccountMembershipFeaturesList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(GetAccountMembershipFeaturesList.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, GetRecipientList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(GetRecipientList.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, SynchEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(SynchEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, UpdateAddressBookItems param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(UpdateAddressBookItems.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, GetStatusInDocuSignConnectFormat param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(GetStatusInDocuSignConnectFormat.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, GetAccountSettingsList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(GetAccountSettingsList.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RequestDocumentPDFsEx param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RequestDocumentPDFsEx.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RemoveAddressBookItems param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RemoveAddressBookItems.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, SaveTemplate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(SaveTemplate.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, Ping param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(Ping.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, GetRecipientEsignList param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(GetRecipientEsignList.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RequestStatuses param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RequestStatuses.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, CorrectAndResendEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(CorrectAndResendEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RequestDocumentPDFsRecipientsView param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RequestDocumentPDFsRecipientsView.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, TransferEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(TransferEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RequestSenderToken param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RequestSenderToken.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ExportAuthoritativeCopy param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(ExportAuthoritativeCopy.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, EnvelopeAuditEvents param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(EnvelopeAuditEvents.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, VoidEnvelope param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(VoidEnvelope.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, PurgeDocuments param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(PurgeDocuments.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

    }

    /* methods to provide back word compatibility */

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RequestStatus param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(RequestStatus.MY_QNAME, factory));
            return emptyEnvelope;
        }
        catch (org.apache.axis2.databinding.ADBException e) {
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

    private Object fromOM(org.apache.axiom.om.OMElement param, Class type, java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

        try {

            if (RequestTemplate.class.equals(type)) {

                return RequestTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestTemplateResponse.class.equals(type)) {

                return RequestTemplateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestTemplates.class.equals(type)) {

                return RequestTemplates.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestTemplatesResponse.class.equals(type)) {

                return RequestTemplatesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestRecipientToken.class.equals(type)) {

                return RequestRecipientToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestRecipientTokenResponse.class.equals(type)) {

                return RequestRecipientTokenResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestDocumentPDFs.class.equals(type)) {

                return RequestDocumentPDFs.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestDocumentPDFsResponse.class.equals(type)) {

                return RequestDocumentPDFsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestPDF.class.equals(type)) {

                return RequestPDF.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestPDFResponse.class.equals(type)) {

                return RequestPDFResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetAuthenticationToken.class.equals(type)) {

                return GetAuthenticationToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetAuthenticationTokenResponse.class.equals(type)) {

                return GetAuthenticationTokenResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (CreateEnvelopeFromTemplates.class.equals(type)) {

                return CreateEnvelopeFromTemplates.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (CreateEnvelopeFromTemplatesResponse.class.equals(type)) {

                return CreateEnvelopeFromTemplatesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (CreateEnvelope.class.equals(type)) {

                return CreateEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (CreateEnvelopeResponse.class.equals(type)) {

                return CreateEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (AcknowledgeAuthoritativeCopyExport.class.equals(type)) {

                return AcknowledgeAuthoritativeCopyExport.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (AcknowledgeAuthoritativeCopyExportResponse.class.equals(type)) {

                return AcknowledgeAuthoritativeCopyExportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (UploadTemplate.class.equals(type)) {

                return UploadTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (UploadTemplateResponse.class.equals(type)) {

                return UploadTemplateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestStatusesEx.class.equals(type)) {

                return RequestStatusesEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestStatusesExResponse.class.equals(type)) {

                return RequestStatusesExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (CreateAndSendEnvelope.class.equals(type)) {

                return CreateAndSendEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (CreateAndSendEnvelopeResponse.class.equals(type)) {

                return CreateAndSendEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetAddressBookItems.class.equals(type)) {

                return GetAddressBookItems.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetAddressBookItemsResponse.class.equals(type)) {

                return GetAddressBookItemsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestStatusEx.class.equals(type)) {

                return RequestStatusEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestStatusExResponse.class.equals(type)) {

                return RequestStatusExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetAccountMembershipFeaturesList.class.equals(type)) {

                return GetAccountMembershipFeaturesList.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetAccountMembershipFeaturesListResponse.class.equals(type)) {

                return GetAccountMembershipFeaturesListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetRecipientList.class.equals(type)) {

                return GetRecipientList.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetRecipientListResponse.class.equals(type)) {

                return GetRecipientListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (SynchEnvelope.class.equals(type)) {

                return SynchEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (SynchEnvelopeResponse.class.equals(type)) {

                return SynchEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (UpdateAddressBookItems.class.equals(type)) {

                return UpdateAddressBookItems.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (UpdateAddressBookItemsResponse.class.equals(type)) {

                return UpdateAddressBookItemsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetStatusInDocuSignConnectFormat.class.equals(type)) {

                return GetStatusInDocuSignConnectFormat.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetStatusInDocuSignConnectFormatResponse.class.equals(type)) {

                return GetStatusInDocuSignConnectFormatResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetAccountSettingsList.class.equals(type)) {

                return GetAccountSettingsList.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetAccountSettingsListResponse.class.equals(type)) {

                return GetAccountSettingsListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestDocumentPDFsEx.class.equals(type)) {

                return RequestDocumentPDFsEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestDocumentPDFsExResponse.class.equals(type)) {

                return RequestDocumentPDFsExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RemoveAddressBookItems.class.equals(type)) {

                return RemoveAddressBookItems.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RemoveAddressBookItemsResponse.class.equals(type)) {

                return RemoveAddressBookItemsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (SaveTemplate.class.equals(type)) {

                return SaveTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (SaveTemplateResponse.class.equals(type)) {

                return SaveTemplateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (Ping.class.equals(type)) {

                return Ping.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (PingResponse.class.equals(type)) {

                return PingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetRecipientEsignList.class.equals(type)) {

                return GetRecipientEsignList.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (GetRecipientEsignListResponse.class.equals(type)) {

                return GetRecipientEsignListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestStatuses.class.equals(type)) {

                return RequestStatuses.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestStatusesResponse.class.equals(type)) {

                return RequestStatusesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (CorrectAndResendEnvelope.class.equals(type)) {

                return CorrectAndResendEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (CorrectAndResendEnvelopeResponse.class.equals(type)) {

                return CorrectAndResendEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestDocumentPDFsRecipientsView.class.equals(type)) {

                return RequestDocumentPDFsRecipientsView.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestDocumentPDFsRecipientsViewResponse.class.equals(type)) {

                return RequestDocumentPDFsRecipientsViewResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (TransferEnvelope.class.equals(type)) {

                return TransferEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (TransferEnvelopeResponse.class.equals(type)) {

                return TransferEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestSenderToken.class.equals(type)) {

                return RequestSenderToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestSenderTokenResponse.class.equals(type)) {

                return RequestSenderTokenResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (ExportAuthoritativeCopy.class.equals(type)) {

                return ExportAuthoritativeCopy.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (ExportAuthoritativeCopyResponse.class.equals(type)) {

                return ExportAuthoritativeCopyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (EnvelopeAuditEvents.class.equals(type)) {

                return EnvelopeAuditEvents.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (EnvelopeAuditEventsResponse.class.equals(type)) {

                return EnvelopeAuditEventsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (VoidEnvelope.class.equals(type)) {

                return VoidEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (VoidEnvelopeResponse.class.equals(type)) {

                return VoidEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (PurgeDocuments.class.equals(type)) {

                return PurgeDocuments.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (PurgeDocumentsResponse.class.equals(type)) {

                return PurgeDocumentsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestStatus.class.equals(type)) {

                return RequestStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

            if (RequestStatusResponse.class.equals(type)) {

                return RequestStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

            }

        }
        catch (Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }
}
