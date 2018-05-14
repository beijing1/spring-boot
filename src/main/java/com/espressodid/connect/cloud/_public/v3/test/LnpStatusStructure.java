/**
 * LnpStatusStructure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.espressodid.connect.cloud._public.v3.test;

public class LnpStatusStructure implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String date;

    public LnpStatusStructure() {
    }

    public LnpStatusStructure(java.lang.String status, java.lang.String date) {
        this.status = status;
        this.date = date;
    }

    /**
     * Gets the status value for this LnpStatusStructure.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }

    /**
     * Sets the status value for this LnpStatusStructure.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    /**
     * Gets the date value for this LnpStatusStructure.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }

    /**
     * Sets the date value for this LnpStatusStructure.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpStatusStructure))
            return false;
        LnpStatusStructure other = (LnpStatusStructure) obj;
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
                && ((this.status == null && other.getStatus() == null)
                        || (this.status != null && this.status.equals(other.getStatus())))
                && ((this.date == null && other.getDate() == null)
                        || (this.date != null && this.date.equals(other.getDate())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            LnpStatusStructure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test",
                "lnpStatusStructure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
