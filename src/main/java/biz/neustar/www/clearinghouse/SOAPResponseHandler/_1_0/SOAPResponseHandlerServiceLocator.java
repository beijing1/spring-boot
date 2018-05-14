/**
 * SOAPResponseHandlerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package biz.neustar.www.clearinghouse.SOAPResponseHandler._1_0;

public class SOAPResponseHandlerServiceLocator extends org.apache.axis.client.Service
        implements biz.neustar.www.clearinghouse.SOAPResponseHandler._1_0.SOAPResponseHandlerService {

    public SOAPResponseHandlerServiceLocator() {
    }

    public SOAPResponseHandlerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SOAPResponseHandlerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName)
            throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SOAPResponseHandler
    private java.lang.String SOAPResponseHandler_address = "http://localhost:8080/axis/services/SOAPResponseHandler";

    public java.lang.String getSOAPResponseHandlerAddress() {
        return SOAPResponseHandler_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SOAPResponseHandlerWSDDServiceName = "SOAPResponseHandler";

    public java.lang.String getSOAPResponseHandlerWSDDServiceName() {
        return SOAPResponseHandlerWSDDServiceName;
    }

    public void setSOAPResponseHandlerWSDDServiceName(java.lang.String name) {
        SOAPResponseHandlerWSDDServiceName = name;
    }

    public biz.neustar.www.clearinghouse.SOAPResponseHandler._1_0.SOAPResponseHandler getSOAPResponseHandler()
            throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SOAPResponseHandler_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSOAPResponseHandler(endpoint);
    }

    public biz.neustar.www.clearinghouse.SOAPResponseHandler._1_0.SOAPResponseHandler getSOAPResponseHandler(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            biz.neustar.www.clearinghouse.SOAPResponseHandler._1_0.SOAPResponseHandlerSoapBindingStub _stub = new biz.neustar.www.clearinghouse.SOAPResponseHandler._1_0.SOAPResponseHandlerSoapBindingStub(
                    portAddress, this);
            _stub.setPortName(getSOAPResponseHandlerWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSOAPResponseHandlerEndpointAddress(java.lang.String address) {
        SOAPResponseHandler_address = address;
    }

    /**
     * For the given interface, get the stub implementation. If this service has no
     * port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (biz.neustar.www.clearinghouse.SOAPResponseHandler._1_0.SOAPResponseHandler.class
                    .isAssignableFrom(serviceEndpointInterface)) {
                biz.neustar.www.clearinghouse.SOAPResponseHandler._1_0.SOAPResponseHandlerSoapBindingStub _stub = new biz.neustar.www.clearinghouse.SOAPResponseHandler._1_0.SOAPResponseHandlerSoapBindingStub(
                        new java.net.URL(SOAPResponseHandler_address), this);
                _stub.setPortName(getSOAPResponseHandlerWSDDServiceName());
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
        if ("SOAPResponseHandler".equals(inputPortName)) {
            return getSOAPResponseHandler();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.neustar.biz/clearinghouse/SOAPResponseHandler/1.0",
                "SOAPResponseHandlerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.neustar.biz/clearinghouse/SOAPResponseHandler/1.0",
                    "SOAPResponseHandler"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address)
            throws javax.xml.rpc.ServiceException {

        if ("SOAPResponseHandler".equals(portName)) {
            setSOAPResponseHandlerEndpointAddress(address);
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
