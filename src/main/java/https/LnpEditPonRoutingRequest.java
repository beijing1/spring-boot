/**
 * LnpEditPonRoutingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package https;

public class LnpEditPonRoutingRequest implements java.io.Serializable {
    private java.lang.String pon;

    private https.LnpRoutingStructure routing;

    public LnpEditPonRoutingRequest() {
    }

    public LnpEditPonRoutingRequest(java.lang.String pon, https.LnpRoutingStructure routing) {
        this.pon = pon;
        this.routing = routing;
    }

    /**
     * Gets the pon value for this LnpEditPonRoutingRequest.
     * 
     * @return pon
     */
    public java.lang.String getPon() {
        return pon;
    }

    /**
     * Sets the pon value for this LnpEditPonRoutingRequest.
     * 
     * @param pon
     */
    public void setPon(java.lang.String pon) {
        this.pon = pon;
    }

    /**
     * Gets the routing value for this LnpEditPonRoutingRequest.
     * 
     * @return routing
     */
    public https.LnpRoutingStructure getRouting() {
        return routing;
    }

    /**
     * Sets the routing value for this LnpEditPonRoutingRequest.
     * 
     * @param routing
     */
    public void setRouting(https.LnpRoutingStructure routing) {
        this.routing = routing;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpEditPonRoutingRequest))
            return false;
        LnpEditPonRoutingRequest other = (LnpEditPonRoutingRequest) obj;
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
                && ((this.routing == null && other.getRouting() == null)
                        || (this.routing != null && this.routing.equals(other.getRouting())));
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
        if (getRouting() != null) {
            _hashCode += getRouting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            LnpEditPonRoutingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test",
                "lnpEditPonRoutingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pon"));
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
