/**
 * EspressoDIDLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.espressodid.connect.cloud._public.v3.test;

public class EspressoDIDLocator extends org.apache.axis.client.Service
        implements com.espressodid.connect.cloud._public.v3.test.EspressoDID {

    public EspressoDIDLocator() {
    }

    public EspressoDIDLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EspressoDIDLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName)
            throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for espressoDIDPort
    private java.lang.String espressoDIDPort_address = "https://connect.espressodid.com/cloud/public/v3/test";

    public java.lang.String getespressoDIDPortAddress() {
        return espressoDIDPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String espressoDIDPortWSDDServiceName = "espressoDIDPort";

    public java.lang.String getespressoDIDPortWSDDServiceName() {
        return espressoDIDPortWSDDServiceName;
    }

    public void setespressoDIDPortWSDDServiceName(java.lang.String name) {
        espressoDIDPortWSDDServiceName = name;
    }

    public com.espressodid.connect.cloud._public.v3.test.EspressoDIDPortType getespressoDIDPort()
            throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(espressoDIDPort_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getespressoDIDPort(endpoint);
    }

    public com.espressodid.connect.cloud._public.v3.test.EspressoDIDPortType getespressoDIDPort(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.espressodid.connect.cloud._public.v3.test.EspressoDIDBindingStub _stub = new com.espressodid.connect.cloud._public.v3.test.EspressoDIDBindingStub(
                    portAddress, this);
            _stub.setPortName(getespressoDIDPortWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setespressoDIDPortEndpointAddress(java.lang.String address) {
        espressoDIDPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation. If this service has no
     * port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.espressodid.connect.cloud._public.v3.test.EspressoDIDPortType.class
                    .isAssignableFrom(serviceEndpointInterface)) {
                com.espressodid.connect.cloud._public.v3.test.EspressoDIDBindingStub _stub = new com.espressodid.connect.cloud._public.v3.test.EspressoDIDBindingStub(
                        new java.net.URL(espressoDIDPort_address), this);
                _stub.setPortName(getespressoDIDPortWSDDServiceName());
                return _stub;
            }
        } catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  "
                + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation. If this service has no
     * port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface)
            throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("espressoDIDPort".equals(inputPortName)) {
            return getespressoDIDPort();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "espressoDID");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test",
                    "espressoDIDPort"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address)
            throws javax.xml.rpc.ServiceException {

        if ("espressoDIDPort".equals(portName)) {
            setespressoDIDPortEndpointAddress(address);
        } else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address)
            throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
