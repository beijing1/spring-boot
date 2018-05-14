/**
 * EspressoDIDPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package https;

public interface EspressoDIDPortType extends java.rmi.Remote {
    public java.lang.String testConnection(java.lang.String name) throws java.rmi.RemoteException;
    public void lnpGetReport(java.lang.String startDate, java.lang.String endDate, https.holders.LnpPonReportArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpPonLastStatus(java.lang.String pon, https.holders.LnpPonReportHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpPonInfoForTelNumber(java.lang.String number, https.holders.LnpPonShortInfoArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpPonsStatusFromDate(java.lang.String date, https.holders.LnpPonShortInfoArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpPonsByStatus(java.lang.String status, https.holders.LnpPonShortInfoArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpCreatePons(https.LnpCreatePonRequest data, https.holders.LnpPonShortInfoArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpEditDDD(java.lang.String pon, java.lang.String desired_due_date, java.lang.String auth_date, javax.xml.rpc.holders.StringHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpCancelPon(java.lang.String pon, javax.xml.rpc.holders.StringHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpEditPon(https.LnpEditPonRequest data, javax.xml.rpc.holders.StringHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpCheckNpaNxxPortability(java.lang.String npanxx, javax.xml.rpc.holders.IntHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpEditPonRouting(https.LnpEditPonRoutingRequest data, javax.xml.rpc.holders.StringHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpGetRoutingProfiles(https.holders.LnpRoutingProfileArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpGetApplicationErrorDictionary(https.holders.LnpApplicationErrorArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
    public void lnpPonChangeStatus(java.lang.String pon, java.lang.String status, javax.xml.rpc.holders.StringHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException;
}
