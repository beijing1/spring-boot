package biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0;

public class SOAPRequestHandlerProxy
        implements biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0.SOAPRequestHandler {
    private String _endpoint = null;
    private biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0.SOAPRequestHandler sOAPRequestHandler = null;

    public SOAPRequestHandlerProxy() {
        _initSOAPRequestHandlerProxy();
    }

    public SOAPRequestHandlerProxy(String endpoint) {
        _endpoint = endpoint;
        _initSOAPRequestHandlerProxy();
    }

    private void _initSOAPRequestHandlerProxy() {
        try {
            sOAPRequestHandler = (new biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0.SOAPRequestHandlerServiceLocator())
                    .getSOAPRequestHandler();
            if (sOAPRequestHandler != null) {
                if (_endpoint != null)
                    ((javax.xml.rpc.Stub) sOAPRequestHandler)._setProperty("javax.xml.rpc.service.endpoint.address",
                            _endpoint);
                else
                    _endpoint = (String) ((javax.xml.rpc.Stub) sOAPRequestHandler)
                            ._getProperty("javax.xml.rpc.service.endpoint.address");
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public void setEndpoint(String endpoint) {
        _endpoint = endpoint;
        if (sOAPRequestHandler != null)
            ((javax.xml.rpc.Stub) sOAPRequestHandler)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

    }

    public biz.neustar.www.clearinghouse.SOAPRequestHandler._1_0.SOAPRequestHandler getSOAPRequestHandler() {
        if (sOAPRequestHandler == null)
            _initSOAPRequestHandlerProxy();
        return sOAPRequestHandler;
    }

    public java.lang.String[] processSync(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException {
        if (sOAPRequestHandler == null)
            _initSOAPRequestHandlerProxy();
        return sOAPRequestHandler.processSync(in0, in1);
    }

    public void processAsync(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException {
        if (sOAPRequestHandler == null)
            _initSOAPRequestHandlerProxy();
        sOAPRequestHandler.processAsync(in0, in1);
    }

}