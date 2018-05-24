/**
 * LnpPonShortInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package https;

public class LnpPonShortInfo implements java.io.Serializable {
    private java.lang.String pon;

    private java.lang.String last_version;

    private java.lang.String last_processstatus;

    private https.LnpSdStructure[] service_details;

    private java.lang.String date_last_update;

    public LnpPonShortInfo() {
    }

    public LnpPonShortInfo(java.lang.String pon, java.lang.String last_version, java.lang.String last_processstatus,
            https.LnpSdStructure[] service_details, java.lang.String date_last_update) {
        this.pon = pon;
        this.last_version = last_version;
        this.last_processstatus = last_processstatus;
        this.service_details = service_details;
        this.date_last_update = date_last_update;
    }

    /**
     * Gets the pon value for this LnpPonShortInfo.
     * 
     * @return pon
     */
    public java.lang.String getPon() {
        return pon;
    }

    /**
     * Sets the pon value for this LnpPonShortInfo.
     * 
     * @param pon
     */
    public void setPon(java.lang.String pon) {
        this.pon = pon;
    }

    /**
     * Gets the last_version value for this LnpPonShortInfo.
     * 
     * @return last_version
     */
    public java.lang.String getLast_version() {
        return last_version;
    }

    /**
     * Sets the last_version value for this LnpPonShortInfo.
     * 
     * @param last_version
     */
    public void setLast_version(java.lang.String last_version) {
        this.last_version = last_version;
    }

    /**
     * Gets the last_processstatus value for this LnpPonShortInfo.
     * 
     * @return last_processstatus
     */
    public java.lang.String getLast_processstatus() {
        return last_processstatus;
    }

    /**
     * Sets the last_processstatus value for this LnpPonShortInfo.
     * 
     * @param last_processstatus
     */
    public void setLast_processstatus(java.lang.String last_processstatus) {
        this.last_processstatus = last_processstatus;
    }

    /**
     * Gets the service_details value for this LnpPonShortInfo.
     * 
     * @return service_details
     */
    public https.LnpSdStructure[] getService_details() {
        return service_details;
    }

    /**
     * Sets the service_details value for this LnpPonShortInfo.
     * 
     * @param service_details
     */
    public void setService_details(https.LnpSdStructure[] service_details) {
        this.service_details = service_details;
    }

    /**
     * Gets the date_last_update value for this LnpPonShortInfo.
     * 
     * @return date_last_update
     */
    public java.lang.String getDate_last_update() {
        return date_last_update;
    }

    /**
     * Sets the date_last_update value for this LnpPonShortInfo.
     * 
     * @param date_last_update
     */
    public void setDate_last_update(java.lang.String date_last_update) {
        this.date_last_update = date_last_update;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpPonShortInfo))
            return false;
        LnpPonShortInfo other = (LnpPonShortInfo) obj;
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
                && ((this.last_version == null && other.getLast_version() == null)
                        || (this.last_version != null && this.last_version.equals(other.getLast_version())))
                && ((this.last_processstatus == null && other.getLast_processstatus() == null)
                        || (this.last_processstatus != null
                                && this.last_processstatus.equals(other.getLast_processstatus())))
                && ((this.service_details == null && other.getService_details() == null)
                        || (this.service_details != null
                                && java.util.Arrays.equals(this.service_details, other.getService_details())))
                && ((this.date_last_update == null && other.getDate_last_update() == null)
                        || (this.date_last_update != null
                                && this.date_last_update.equals(other.getDate_last_update())));
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
        if (getLast_version() != null) {
            _hashCode += getLast_version().hashCode();
        }
        if (getLast_processstatus() != null) {
            _hashCode += getLast_processstatus().hashCode();
        }
        if (getService_details() != null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getService_details()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService_details(), i);
                if (obj != null && !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDate_last_update() != null) {
            _hashCode += getDate_last_update().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            LnpPonShortInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test",
                "lnpPonShortInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_processstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_processstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_details");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_details"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test",
                "lnpSdStructure"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_last_update");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_last_update"));
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
