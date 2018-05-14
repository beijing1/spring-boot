/**
 * LnpRoutingProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.espressodid.connect.cloud._public.v3.test;

public class LnpRoutingProfile implements java.io.Serializable {
    private int id;

    private java.lang.String label;

    private java.lang.String tech_prefix;

    private java.lang.String format;

    private java.lang.String routing_type;

    private java.lang.String[] ips;

    public LnpRoutingProfile() {
    }

    public LnpRoutingProfile(int id, java.lang.String label, java.lang.String tech_prefix, java.lang.String format,
            java.lang.String routing_type, java.lang.String[] ips) {
        this.id = id;
        this.label = label;
        this.tech_prefix = tech_prefix;
        this.format = format;
        this.routing_type = routing_type;
        this.ips = ips;
    }

    /**
     * Gets the id value for this LnpRoutingProfile.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id value for this LnpRoutingProfile.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the label value for this LnpRoutingProfile.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }

    /**
     * Sets the label value for this LnpRoutingProfile.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }

    /**
     * Gets the tech_prefix value for this LnpRoutingProfile.
     * 
     * @return tech_prefix
     */
    public java.lang.String getTech_prefix() {
        return tech_prefix;
    }

    /**
     * Sets the tech_prefix value for this LnpRoutingProfile.
     * 
     * @param tech_prefix
     */
    public void setTech_prefix(java.lang.String tech_prefix) {
        this.tech_prefix = tech_prefix;
    }

    /**
     * Gets the format value for this LnpRoutingProfile.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }

    /**
     * Sets the format value for this LnpRoutingProfile.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }

    /**
     * Gets the routing_type value for this LnpRoutingProfile.
     * 
     * @return routing_type
     */
    public java.lang.String getRouting_type() {
        return routing_type;
    }

    /**
     * Sets the routing_type value for this LnpRoutingProfile.
     * 
     * @param routing_type
     */
    public void setRouting_type(java.lang.String routing_type) {
        this.routing_type = routing_type;
    }

    /**
     * Gets the ips value for this LnpRoutingProfile.
     * 
     * @return ips
     */
    public java.lang.String[] getIps() {
        return ips;
    }

    /**
     * Sets the ips value for this LnpRoutingProfile.
     * 
     * @param ips
     */
    public void setIps(java.lang.String[] ips) {
        this.ips = ips;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpRoutingProfile))
            return false;
        LnpRoutingProfile other = (LnpRoutingProfile) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && this.id == other.getId()
                && ((this.label == null && other.getLabel() == null)
                        || (this.label != null && this.label.equals(other.getLabel())))
                && ((this.tech_prefix == null && other.getTech_prefix() == null)
                        || (this.tech_prefix != null && this.tech_prefix.equals(other.getTech_prefix())))
                && ((this.format == null && other.getFormat() == null)
                        || (this.format != null && this.format.equals(other.getFormat())))
                && ((this.routing_type == null && other.getRouting_type() == null)
                        || (this.routing_type != null && this.routing_type.equals(other.getRouting_type())))
                && ((this.ips == null && other.getIps() == null)
                        || (this.ips != null && java.util.Arrays.equals(this.ips, other.getIps())));
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
        _hashCode += getId();
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getTech_prefix() != null) {
            _hashCode += getTech_prefix().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getRouting_type() != null) {
            _hashCode += getRouting_type().hashCode();
        }
        if (getIps() != null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getIps()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIps(), i);
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
            LnpRoutingProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test",
                "lnpRoutingProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tech_prefix");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "tech_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routing_type");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "routing_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ips");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "ips"));
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
