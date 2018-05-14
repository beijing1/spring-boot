/**
 * SOAPRequestHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0;

public interface SOAPRequestHandler extends java.rmi.Remote {
    public java.lang.String[] processSync(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;

    public void processAsync(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
}
