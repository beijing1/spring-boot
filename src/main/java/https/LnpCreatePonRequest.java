/**
 * LnpCreatePonRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package https;

public class LnpCreatePonRequest  implements java.io.Serializable {
    private https.LnpPonStructure pon_data;

    private https.LnpRoutingStructure routing;

    public LnpCreatePonRequest() {
    }

    public LnpCreatePonRequest(
           https.LnpPonStructure pon_data,
           https.LnpRoutingStructure routing) {
           this.pon_data = pon_data;
           this.routing = routing;
    }


    /**
     * Gets the pon_data value for this LnpCreatePonRequest.
     * 
     * @return pon_data
     */
    public https.LnpPonStructure getPon_data() {
        return pon_data;
    }


    /**
     * Sets the pon_data value for this LnpCreatePonRequest.
     * 
     * @param pon_data
     */
    public void setPon_data(https.LnpPonStructure pon_data) {
        this.pon_data = pon_data;
    }


    /**
     * Gets the routing value for this LnpCreatePonRequest.
     * 
     * @return routing
     */
    public https.LnpRoutingStructure getRouting() {
        return routing;
    }


    /**
     * Sets the routing value for this LnpCreatePonRequest.
     * 
     * @param routing
     */
    public void setRouting(https.LnpRoutingStructure routing) {
        this.routing = routing;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpCreatePonRequest)) return false;
        LnpCreatePonRequest other = (LnpCreatePonRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pon_data==null && other.getPon_data()==null) || 
             (this.pon_data!=null &&
              this.pon_data.equals(other.getPon_data()))) &&
            ((this.routing==null && other.getRouting()==null) || 
             (this.routing!=null &&
              this.routing.equals(other.getRouting())));
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
        if (getPon_data() != null) {
            _hashCode += getPon_data().hashCode();
        }
        if (getRouting() != null) {
            _hashCode += getRouting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LnpCreatePonRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpCreatePonRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pon_data");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "pon_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonStructure"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "routing"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpRoutingStructure"));
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
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
