/**
 * WsMicroScoreBILocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.passcop.source.request;

public class WsMicroScoreBILocator extends org.apache.axis.client.Service implements WsMicroScoreBI {

    public WsMicroScoreBILocator() {
    }


    public WsMicroScoreBILocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsMicroScoreBILocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for wsMicroScoreBISoap
    private java.lang.String wsMicroScoreBISoap_address = "http://herramientas.dgrv.com.ec:8090/wsMicroscoreBI.asmx";

    public java.lang.String getwsMicroScoreBISoapAddress() {
        return wsMicroScoreBISoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String wsMicroScoreBISoapWSDDServiceName = "wsMicroScoreBISoap";

    public java.lang.String getwsMicroScoreBISoapWSDDServiceName() {
        return wsMicroScoreBISoapWSDDServiceName;
    }

    public void setwsMicroScoreBISoapWSDDServiceName(java.lang.String name) {
        wsMicroScoreBISoapWSDDServiceName = name;
    }

    public WsMicroScoreBISoap getwsMicroScoreBISoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsMicroScoreBISoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsMicroScoreBISoap(endpoint);
    }

    public WsMicroScoreBISoap getwsMicroScoreBISoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            WsMicroScoreBISoapStub _stub = new WsMicroScoreBISoapStub(portAddress, this);
            _stub.setPortName(getwsMicroScoreBISoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwsMicroScoreBISoapEndpointAddress(java.lang.String address) {
        wsMicroScoreBISoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (WsMicroScoreBISoap.class.isAssignableFrom(serviceEndpointInterface)) {
                WsMicroScoreBISoapStub _stub = new WsMicroScoreBISoapStub(new java.net.URL(wsMicroScoreBISoap_address), this);
                _stub.setPortName(getwsMicroScoreBISoapWSDDServiceName());
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
        if ("wsMicroScoreBISoap".equals(inputPortName)) {
            return getwsMicroScoreBISoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "wsMicroScoreBI");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "wsMicroScoreBISoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("wsMicroScoreBISoap".equals(portName)) {
            setwsMicroScoreBISoapEndpointAddress(address);
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
