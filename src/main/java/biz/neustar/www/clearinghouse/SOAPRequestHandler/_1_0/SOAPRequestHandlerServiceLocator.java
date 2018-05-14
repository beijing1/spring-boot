/**
 * SOAPRequestHandlerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0;

public class SOAPRequestHandlerServiceLocator extends org.apache.axis.client.Service
        implements biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0.SOAPRequestHandlerService {

    public SOAPRequestHandlerServiceLocator() {
    }

    public SOAPRequestHandlerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SOAPRequestHandlerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName)
            throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SOAPRequestHandler
    private java.lang.String SOAPRequestHandler_address = "http://localhost:8080/axis/services/SOAPRequestHandler";

    public java.lang.String getSOAPRequestHandlerAddress() {
        return SOAPRequestHandler_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SOAPRequestHandlerWSDDServiceName = "SOAPRequestHandler";

    public java.lang.String getSOAPRequestHandlerWSDDServiceName() {
        return SOAPRequestHandlerWSDDServiceName;
    }

    public void setSOAPRequestHandlerWSDDServiceName(java.lang.String name) {
        SOAPRequestHandlerWSDDServiceName = name;
    }

    public biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0.SOAPRequestHandler getSOAPRequestHandler()
            throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SOAPRequestHandler_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSOAPRequestHandler(endpoint);
    }

    public biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0.SOAPRequestHandler getSOAPRequestHandler(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0.SOAPRequestHandlerSoapBindingStub _stub = new biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0.SOAPRequestHandlerSoapBindingStub(
                    portAddress, this);
            _stub.setPortName(getSOAPRequestHandlerWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSOAPRequestHandlerEndpointAddress(java.lang.String address) {
        SOAPRequestHandler_address = address;
    }

    /**
     * For the given interface, get the stub implementation. If this service has no
     * port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0.SOAPRequestHandler.class
                    .isAssignableFrom(serviceEndpointInterface)) {
                biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0.SOAPRequestHandlerSoapBindingStub _stub = new biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0.SOAPRequestHandlerSoapBindingStub(
                        new java.net.URL(SOAPRequestHandler_address), this);
                _stub.setPortName(getSOAPRequestHandlerWSDDServiceName());
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
        if ("SOAPRequestHandler".equals(inputPortName)) {
            return getSOAPRequestHandler();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.neustar.biz/clearinghouse/SOAPRequestHandler/1.0",
                "SOAPRequestHandlerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.neustar.biz/clearinghouse/SOAPRequestHandler/1.0",
                    "SOAPRequestHandler"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address)
            throws javax.xml.rpc.ServiceException {

        if ("SOAPRequestHandler".equals(portName)) {
            setSOAPRequestHandlerEndpointAddress(address);
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
