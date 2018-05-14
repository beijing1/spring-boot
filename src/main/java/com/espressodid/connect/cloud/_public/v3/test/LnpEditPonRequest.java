/**
 * LnpEditPonRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.espressodid.connect.cloud._public.v3.test;

public class LnpEditPonRequest implements java.io.Serializable {
    private java.lang.String pon;

    private com.espressodid.connect.cloud._public.v3.test.LnpPonStructure pon_data;

    public LnpEditPonRequest() {
    }

    public LnpEditPonRequest(java.lang.String pon,
            com.espressodid.connect.cloud._public.v3.test.LnpPonStructure pon_data) {
        this.pon = pon;
        this.pon_data = pon_data;
    }

    /**
     * Gets the pon value for this LnpEditPonRequest.
     * 
     * @return pon
     */
    public java.lang.String getPon() {
        return pon;
    }

    /**
     * Sets the pon value for this LnpEditPonRequest.
     * 
     * @param pon
     */
    public void setPon(java.lang.String pon) {
        this.pon = pon;
    }

    /**
     * Gets the pon_data value for this LnpEditPonRequest.
     * 
     * @return pon_data
     */
    public com.espressodid.connect.cloud._public.v3.test.LnpPonStructure getPon_data() {
        return pon_data;
    }

    /**
     * Sets the pon_data value for this LnpEditPonRequest.
     * 
     * @param pon_data
     */
    public void setPon_data(com.espressodid.connect.cloud._public.v3.test.LnpPonStructure pon_data) {
        this.pon_data = pon_data;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpEditPonRequest))
            return false;
        LnpEditPonRequest other = (LnpEditPonRequest) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true
                && ((this.pon == null && other.getPon() == null)
                        || (this.pon != null && this.pon.equals(other.getPon())))
                && ((this.pon_data == null && other.getPon_data() == null)
                        || (this.pon_data != null && this.pon_data.equals(other.getPon_data())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPon() != null) {
            _hashCode += getPon().hashCode();
        }
        if (getPon_data() != null) {
            _hashCode += getPon_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            LnpEditPonRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test",
                "lnpEditPonRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pon");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "pon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pon_data");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "pon_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test",
                "lnpPonStructure"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
            java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
            java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
    }

}
