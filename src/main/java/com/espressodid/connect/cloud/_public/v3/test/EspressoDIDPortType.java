/**
 * EspressoDIDPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.espressodid.connect.cloud._public.v3.test;

public interface EspressoDIDPortType extends java.rmi.Remote {
    public java.lang.String testConnection(java.lang.String name) throws java.rmi.RemoteException;

    public void lnpGetReport(java.lang.String startDate, java.lang.String endDate,
            com.espressodid.connect.cloud._public.v3.test.holders.LnpPonReportArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpPonLastStatus(java.lang.String pon,
            com.espressodid.connect.cloud._public.v3.test.holders.LnpPonReportHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpPonInfoForTelNumber(java.lang.String number,
            com.espressodid.connect.cloud._public.v3.test.holders.LnpPonShortInfoArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpPonsStatusFromDate(java.lang.String date,
            com.espressodid.connect.cloud._public.v3.test.holders.LnpPonShortInfoArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpPonsByStatus(java.lang.String status,
            com.espressodid.connect.cloud._public.v3.test.holders.LnpPonShortInfoArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpCreatePons(com.espressodid.connect.cloud._public.v3.test.LnpCreatePonRequest data,
            com.espressodid.connect.cloud._public.v3.test.holders.LnpPonShortInfoArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpEditDDD(java.lang.String pon, java.lang.String desired_due_date, java.lang.String auth_date,
            javax.xml.rpc.holders.StringHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpCancelPon(java.lang.String pon, javax.xml.rpc.holders.StringHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpEditPon(com.espressodid.connect.cloud._public.v3.test.LnpEditPonRequest data,
            javax.xml.rpc.holders.StringHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpCheckNpaNxxPortability(java.lang.String npanxx, javax.xml.rpc.holders.IntHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpEditPonRouting(com.espressodid.connect.cloud._public.v3.test.LnpEditPonRoutingRequest data,
            javax.xml.rpc.holders.StringHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpGetRoutingProfiles(
            com.espressodid.connect.cloud._public.v3.test.holders.LnpRoutingProfileArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpGetApplicationErrorDictionary(
            com.espressodid.connect.cloud._public.v3.test.holders.LnpApplicationErrorArrayHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;

    public void lnpPonChangeStatus(java.lang.String pon, java.lang.String status,
            javax.xml.rpc.holders.StringHolder _return,
            com.espressodid.connect.cloud._public.v3.test.holders.ErrorFieldArrayHolder errors)
            throws java.rmi.RemoteException;
}
