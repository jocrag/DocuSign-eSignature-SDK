/**
 * APIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class APIServiceLocator extends org.apache.axis.client.Service implements net.docusign.www.API._3_0.APIService {

    public APIServiceLocator() {
    }


    public APIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public APIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for APIServiceSoap12
    private java.lang.String APIServiceSoap12_address = "https://demo.docusign.net/api/3.0/api.asmx";

    public java.lang.String getAPIServiceSoap12Address() {
        return APIServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String APIServiceSoap12WSDDServiceName = "APIServiceSoap12";

    public java.lang.String getAPIServiceSoap12WSDDServiceName() {
        return APIServiceSoap12WSDDServiceName;
    }

    public void setAPIServiceSoap12WSDDServiceName(java.lang.String name) {
        APIServiceSoap12WSDDServiceName = name;
    }

    public net.docusign.www.API._3_0.APIServiceSoap getAPIServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(APIServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAPIServiceSoap12(endpoint);
    }

    public net.docusign.www.API._3_0.APIServiceSoap getAPIServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.docusign.www.API._3_0.APIServiceSoap12Stub _stub = new net.docusign.www.API._3_0.APIServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getAPIServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAPIServiceSoap12EndpointAddress(java.lang.String address) {
        APIServiceSoap12_address = address;
    }


    // Use to get a proxy class for APIServiceSoap
    private java.lang.String APIServiceSoap_address = "https://demo.docusign.net/api/3.0/api.asmx";

    public java.lang.String getAPIServiceSoapAddress() {
        return APIServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String APIServiceSoapWSDDServiceName = "APIServiceSoap";

    public java.lang.String getAPIServiceSoapWSDDServiceName() {
        return APIServiceSoapWSDDServiceName;
    }

    public void setAPIServiceSoapWSDDServiceName(java.lang.String name) {
        APIServiceSoapWSDDServiceName = name;
    }

    public net.docusign.www.API._3_0.APIServiceSoap getAPIServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(APIServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAPIServiceSoap(endpoint);
    }

    public net.docusign.www.API._3_0.APIServiceSoap getAPIServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.docusign.www.API._3_0.APIServiceSoapStub _stub = new net.docusign.www.API._3_0.APIServiceSoapStub(portAddress, this);
            _stub.setPortName(getAPIServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAPIServiceSoapEndpointAddress(java.lang.String address) {
        APIServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.docusign.www.API._3_0.APIServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                net.docusign.www.API._3_0.APIServiceSoap12Stub _stub = new net.docusign.www.API._3_0.APIServiceSoap12Stub(new java.net.URL(APIServiceSoap12_address), this);
                _stub.setPortName(getAPIServiceSoap12WSDDServiceName());
                return _stub;
            }
            if (net.docusign.www.API._3_0.APIServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                net.docusign.www.API._3_0.APIServiceSoapStub _stub = new net.docusign.www.API._3_0.APIServiceSoapStub(new java.net.URL(APIServiceSoap_address), this);
                _stub.setPortName(getAPIServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("APIServiceSoap12".equals(inputPortName)) {
            return getAPIServiceSoap12();
        }
        else if ("APIServiceSoap".equals(inputPortName)) {
            return getAPIServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "APIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "APIServiceSoap12"));
            ports.add(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "APIServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("APIServiceSoap12".equals(portName)) {
            setAPIServiceSoap12EndpointAddress(address);
        }
        else 
if ("APIServiceSoap".equals(portName)) {
            setAPIServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
