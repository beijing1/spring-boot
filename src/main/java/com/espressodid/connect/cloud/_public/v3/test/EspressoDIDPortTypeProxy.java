package com.espressodid.connect.cloud._public.v3.test;

public class EspressoDIDPortTypeProxy implements com.espressodid.connect.cloud._public.v3.test.EspressoDIDPortType {
    private String _endpoint = null;
    private com.espressodid.connect.cloud._public.v3.test.EspressoDIDPortType espressoDIDPortType = null;

    public EspressoDIDPortTypeProxy() {
        _initEspressoDIDPortTypeProxy();
    }

    public EspressoDIDPortTypeProxy(String endpoint) {
        _endpoint = endpoint;
        _initEspressoDIDPortTypeProxy();
    }

    private void _initEspressoDIDPortTypeProxy() {
        try {
            espressoDIDPortType = (new com.espressodid.connect.cloud._public.v3.test.EspressoDIDLocator())
                    .getespressoDIDPort();
            if (espressoDIDPortType != null) {
                if (_endpoint != null)
                    ((javax.xml.rpc.Stub) espressoDIDPortType)._setProperty("javax.xml.rpc.service.endpoint.address",
                            _endpoint);
                else
                    _endpoint = (String) ((javax.xml.rpc.Stub) espressoDIDPortType)
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
        if (espressoDIDPortType != null)
            ((javax.xml.rpc.Stub) espressoDIDPortType)._setProperty("javax.xml.rpc.service.endpoint.address",
                    _endpoint);

    }

    public com.espressodid.connect.cloud._public.v3.test.EspressoDIDPortType getEspressoDIDPortType() {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        return espressoDIDPortType;
    }

    public java.lang.String testConnection(java.lang.String name) throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        return espressoDIDPortType.testConnection(name);
    }

    public void lnpGetReport(java.lang.String startDate, java.lang.String endDate,
            com.espressodid.connect.cloud._public.v3.test.holders.LnpPonReportArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpGetReport(startDate, endDate, _return, errors);
    }

    public void lnpPonLastStatus(java.lang.String pon,
            com.espressodid.connect.cloud._public.v3.test.holders.LnpPonReportHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpPonLastStatus(pon, _return, errors);
    }

    public void lnpPonInfoForTelNumber(java.lang.String number,
            com.espressodid.connect.cloud._public.v3.test.holders.LnpPonShortInfoArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpPonInfoForTelNumber(number, _return, errors);
    }

    public void lnpPonsStatusFromDate(java.lang.String date,
            com.espressodid.connect.cloud._public.v3.test.holders.LnpPonShortInfoArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpPonsStatusFromDate(date, _return, errors);
    }

    public void lnpPonsByStatus(java.lang.String status,
            com.espressodid.connect.cloud._public.v3.test.holders.LnpPonShortInfoArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpPonsByStatus(status, _return, errors);
    }

    public void lnpCreatePons(com.espressodid.connect.cloud._public.v3.test.LnpCreatePonRequest data,
            com.espressodid.connect.cloud._public.v3.test.holders.LnpPonShortInfoArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpCreatePons(data, _return, errors);
    }

    public void lnpEditDDD(java.lang.String pon, java.lang.String desired_due_date, java.lang.String auth_date,
            javax.xml.rpc.holders.StringHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpEditDDD(pon, desired_due_date, auth_date, _return, errors);
    }

    public void lnpCancelPon(java.lang.String pon, javax.xml.rpc.holders.StringHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpCancelPon(pon, _return, errors);
    }

    public void lnpEditPon(com.espressodid.connect.cloud._public.v3.test.LnpEditPonRequest data,
            javax.xml.rpc.holders.StringHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpEditPon(data, _return, errors);
    }

    public void lnpCheckNpaNxxPortability(java.lang.String npanxx, javax.xml.rpc.holders.IntHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpCheckNpaNxxPortability(npanxx, _return, errors);
    }

    public void lnpEditPonRouting(com.espressodid.connect.cloud._public.v3.test.LnpEditPonRoutingRequest data,
            javax.xml.rpc.holders.StringHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpEditPonRouting(data, _return, errors);
    }

    public void lnpGetRoutingProfiles(
            com.espressodid.connect.cloud._public.v3.test.holders.LnpRoutingProfileArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpGetRoutingProfiles(_return, errors);
    }

    public void lnpGetApplicationErrorDictionary(
            com.espressodid.connect.cloud._public.v3.test.holders.LnpApplicationErrorArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpGetApplicationErrorDictionary(_return, errors);
    }

    public void lnpPonChangeStatus(java.lang.String pon, java.lang.String status,
            javax.xml.rpc.holders.StringHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException {
        if (espressoDIDPortType == null)
            _initEspressoDIDPortTypeProxy();
        espressoDIDPortType.lnpPonChangeStatus(pon, status, _return, errors);
    }

}