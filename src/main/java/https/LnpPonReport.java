/**
 * LnpPonReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package https;

public class LnpPonReport implements java.io.Serializable {
    private java.lang.String date;

    private java.lang.String pon;

    private java.lang.String last_version;

    private java.lang.String last_processstatus;

    private java.lang.String date_last_update;

    private https.LnpStatusReason status_reason;

    private java.lang.String note;

    private https.LnpRoutingStructure routing;

    private https.LnpVerStructure[] versions;

    public LnpPonReport() {
    }

    public LnpPonReport(java.lang.String date, java.lang.String pon, java.lang.String last_version,
            java.lang.String last_processstatus, java.lang.String date_last_update, https.LnpStatusReason status_reason,
            java.lang.String note, https.LnpRoutingStructure routing, https.LnpVerStructure[] versions) {
        this.date = date;
        this.pon = pon;
        this.last_version = last_version;
        this.last_processstatus = last_processstatus;
        this.date_last_update = date_last_update;
        this.status_reason = status_reason;
        this.note = note;
        this.routing = routing;
        this.versions = versions;
    }

    /**
     * Gets the date value for this LnpPonReport.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }

    /**
     * Sets the date value for this LnpPonReport.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }

    /**
     * Gets the pon value for this LnpPonReport.
     * 
     * @return pon
     */
    public java.lang.String getPon() {
        return pon;
    }

    /**
     * Sets the pon value for this LnpPonReport.
     * 
     * @param pon
     */
    public void setPon(java.lang.String pon) {
        this.pon = pon;
    }

    /**
     * Gets the last_version value for this LnpPonReport.
     * 
     * @return last_version
     */
    public java.lang.String getLast_version() {
        return last_version;
    }

    /**
     * Sets the last_version value for this LnpPonReport.
     * 
     * @param last_version
     */
    public void setLast_version(java.lang.String last_version) {
        this.last_version = last_version;
    }

    /**
     * Gets the last_processstatus value for this LnpPonReport.
     * 
     * @return last_processstatus
     */
    public java.lang.String getLast_processstatus() {
        return last_processstatus;
    }

    /**
     * Sets the last_processstatus value for this LnpPonReport.
     * 
     * @param last_processstatus
     */
    public void setLast_processstatus(java.lang.String last_processstatus) {
        this.last_processstatus = last_processstatus;
    }

    /**
     * Gets the date_last_update value for this LnpPonReport.
     * 
     * @return date_last_update
     */
    public java.lang.String getDate_last_update() {
        return date_last_update;
    }

    /**
     * Sets the date_last_update value for this LnpPonReport.
     * 
     * @param date_last_update
     */
    public void setDate_last_update(java.lang.String date_last_update) {
        this.date_last_update = date_last_update;
    }

    /**
     * Gets the status_reason value for this LnpPonReport.
     * 
     * @return status_reason
     */
    public https.LnpStatusReason getStatus_reason() {
        return status_reason;
    }

    /**
     * Sets the status_reason value for this LnpPonReport.
     * 
     * @param status_reason
     */
    public void setStatus_reason(https.LnpStatusReason status_reason) {
        this.status_reason = status_reason;
    }

    /**
     * Gets the note value for this LnpPonReport.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }

    /**
     * Sets the note value for this LnpPonReport.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }

    /**
     * Gets the routing value for this LnpPonReport.
     * 
     * @return routing
     */
    public https.LnpRoutingStructure getRouting() {
        return routing;
    }

    /**
     * Sets the routing value for this LnpPonReport.
     * 
     * @param routing
     */
    public void setRouting(https.LnpRoutingStructure routing) {
        this.routing = routing;
    }

    /**
     * Gets the versions value for this LnpPonReport.
     * 
     * @return versions
     */
    public https.LnpVerStructure[] getVersions() {
        return versions;
    }

    /**
     * Sets the versions value for this LnpPonReport.
     * 
     * @param versions
     */
    public void setVersions(https.LnpVerStructure[] versions) {
        this.versions = versions;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpPonReport))
            return false;
        LnpPonReport other = (LnpPonReport) obj;
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
                && ((this.date == null && other.getDate() == null)
                        || (this.date != null && this.date.equals(other.getDate())))
                && ((this.pon == null && other.getPon() == null)
                        || (this.pon != null && this.pon.equals(other.getPon())))
                && ((this.last_version == null && other.getLast_version() == null)
                        || (this.last_version != null && this.last_version.equals(other.getLast_version())))
                && ((this.last_processstatus == null && other.getLast_processstatus() == null)
                        || (this.last_processstatus != null
                                && this.last_processstatus.equals(other.getLast_processstatus())))
                && ((this.date_last_update == null && other.getDate_last_update() == null)
                        || (this.date_last_update != null && this.date_last_update.equals(other.getDate_last_update())))
                && ((this.status_reason == null && other.getStatus_reason() == null)
                        || (this.status_reason != null && this.status_reason.equals(other.getStatus_reason())))
                && ((this.note == null && other.getNote() == null)
                        || (this.note != null && this.note.equals(other.getNote())))
                && ((this.routing == null && other.getRouting() == null)
                        || (this.routing != null && this.routing.equals(other.getRouting())))
                && ((this.versions == null && other.getVersions() == null)
                        || (this.versions != null && java.util.Arrays.equals(this.versions, other.getVersions())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getPon() != null) {
            _hashCode += getPon().hashCode();
        }
        if (getLast_version() != null) {
            _hashCode += getLast_version().hashCode();
        }
        if (getLast_processstatus() != null) {
            _hashCode += getLast_processstatus().hashCode();
        }
        if (getDate_last_update() != null) {
            _hashCode += getDate_last_update().hashCode();
        }
        if (getStatus_reason() != null) {
            _hashCode += getStatus_reason().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getRouting() != null) {
            _hashCode += getRouting().hashCode();
        }
        if (getVersions() != null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getVersions()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersions(), i);
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
            LnpPonReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test",
                "lnpPonReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("date_last_update");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_last_update"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status_reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test",
                "lnpStatusReason"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routing"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test",
                "lnpRoutingStructure"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test",
                "lnpVerStructure"));
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
