/**
 * CredentialLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API.Credential;

public class CredentialLocator extends org.apache.axis.client.Service implements net.docusign.www.API.Credential.Credential {

    public CredentialLocator() {
    }


    public CredentialLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CredentialLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CredentialSoap
    private java.lang.String CredentialSoap_address = "https://demo.docusign.net/api/3.0/Credential.asmx";

    public java.lang.String getCredentialSoapAddress() {
        return CredentialSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CredentialSoapWSDDServiceName = "CredentialSoap";

    public java.lang.String getCredentialSoapWSDDServiceName() {
        return CredentialSoapWSDDServiceName;
    }

    public void setCredentialSoapWSDDServiceName(java.lang.String name) {
        CredentialSoapWSDDServiceName = name;
    }

    public net.docusign.www.API.Credential.CredentialSoap getCredentialSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CredentialSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCredentialSoap(endpoint);
    }

    public net.docusign.www.API.Credential.CredentialSoap getCredentialSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.docusign.www.API.Credential.CredentialSoapStub _stub = new net.docusign.www.API.Credential.CredentialSoapStub(portAddress, this);
            _stub.setPortName(getCredentialSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCredentialSoapEndpointAddress(java.lang.String address) {
        CredentialSoap_address = address;
    }


    // Use to get a proxy class for CredentialSoap12
    private java.lang.String CredentialSoap12_address = "https://demo.docusign.net/api/3.0/Credential.asmx";

    public java.lang.String getCredentialSoap12Address() {
        return CredentialSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CredentialSoap12WSDDServiceName = "CredentialSoap12";

    public java.lang.String getCredentialSoap12WSDDServiceName() {
        return CredentialSoap12WSDDServiceName;
    }

    public void setCredentialSoap12WSDDServiceName(java.lang.String name) {
        CredentialSoap12WSDDServiceName = name;
    }

    public net.docusign.www.API.Credential.CredentialSoap getCredentialSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CredentialSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCredentialSoap12(endpoint);
    }

    public net.docusign.www.API.Credential.CredentialSoap getCredentialSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.docusign.www.API.Credential.CredentialSoap12Stub _stub = new net.docusign.www.API.Credential.CredentialSoap12Stub(portAddress, this);
            _stub.setPortName(getCredentialSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCredentialSoap12EndpointAddress(java.lang.String address) {
        CredentialSoap12_address = address;
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
            if (net.docusign.www.API.Credential.CredentialSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                net.docusign.www.API.Credential.CredentialSoapStub _stub = new net.docusign.www.API.Credential.CredentialSoapStub(new java.net.URL(CredentialSoap_address), this);
                _stub.setPortName(getCredentialSoapWSDDServiceName());
                return _stub;
            }
            if (net.docusign.www.API.Credential.CredentialSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                net.docusign.www.API.Credential.CredentialSoap12Stub _stub = new net.docusign.www.API.Credential.CredentialSoap12Stub(new java.net.URL(CredentialSoap12_address), this);
                _stub.setPortName(getCredentialSoap12WSDDServiceName());
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
        if ("CredentialSoap".equals(inputPortName)) {
            return getCredentialSoap();
        }
        else if ("CredentialSoap12".equals(inputPortName)) {
            return getCredentialSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.docusign.net/API/Credential", "Credential");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.docusign.net/API/Credential", "CredentialSoap"));
            ports.add(new javax.xml.namespace.QName("http://www.docusign.net/API/Credential", "CredentialSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CredentialSoap".equals(portName)) {
            setCredentialSoapEndpointAddress(address);
        }
        else 
if ("CredentialSoap12".equals(portName)) {
            setCredentialSoap12EndpointAddress(address);
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
