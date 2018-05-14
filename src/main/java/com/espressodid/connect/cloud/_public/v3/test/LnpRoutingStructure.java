/**
 * LnpRoutingStructure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.espressodid.connect.cloud._public.v3.test;

public class LnpRoutingStructure implements java.io.Serializable {
    private int default_routing_profile;

    private com.espressodid.connect.cloud._public.v3.test.LnpRoutingDetails[] details;

    public LnpRoutingStructure() {
    }

    public LnpRoutingStructure(int default_routing_profile,
            com.espressodid.connect.cloud._public.v3.test.LnpRoutingDetails[] details) {
        this.default_routing_profile = default_routing_profile;
        this.details = details;
    }

    /**
     * Gets the default_routing_profile value for this LnpRoutingStructure.
     * 
     * @return default_routing_profile
     */
    public int getDefault_routing_profile() {
        return default_routing_profile;
    }

    /**
     * Sets the default_routing_profile value for this LnpRoutingStructure.
     * 
     * @param default_routing_profile
     */
    public void setDefault_routing_profile(int default_routing_profile) {
        this.default_routing_profile = default_routing_profile;
    }

    /**
     * Gets the details value for this LnpRoutingStructure.
     * 
     * @return details
     */
    public com.espressodid.connect.cloud._public.v3.test.LnpRoutingDetails[] getDetails() {
        return details;
    }

    /**
     * Sets the details value for this LnpRoutingStructure.
     * 
     * @param details
     */
    public void setDetails(com.espressodid.connect.cloud._public.v3.test.LnpRoutingDetails[] details) {
        this.details = details;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpRoutingStructure))
            return false;
        LnpRoutingStructure other = (LnpRoutingStructure) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && this.default_routing_profile == other.getDefault_routing_profile()
                && ((this.details == null && other.getDetails() == null)
                        || (this.details != null && java.util.Arrays.equals(this.details, other.getDetails())));
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
        _hashCode += getDefault_routing_profile();
        if (getDetails() != null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getDetails()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetails(), i);
                if (obj != null && !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            LnpRoutingStructure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test",
                "lnpRoutingStructure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_routing_profile");
        elemField.setXmlName(new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test",
                "default_routing_profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test",
                "lnpRoutingDetails"));
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
