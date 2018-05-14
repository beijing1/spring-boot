/**
 * LnpRoutingDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package https;

public class LnpRoutingDetails  implements java.io.Serializable {
    private java.lang.String start_number;

    private java.lang.String end_number;

    private int routing_profile;

    public LnpRoutingDetails() {
    }

    public LnpRoutingDetails(
           java.lang.String start_number,
           java.lang.String end_number,
           int routing_profile) {
           this.start_number = start_number;
           this.end_number = end_number;
           this.routing_profile = routing_profile;
    }


    /**
     * Gets the start_number value for this LnpRoutingDetails.
     * 
     * @return start_number
     */
    public java.lang.String getStart_number() {
        return start_number;
    }


    /**
     * Sets the start_number value for this LnpRoutingDetails.
     * 
     * @param start_number
     */
    public void setStart_number(java.lang.String start_number) {
        this.start_number = start_number;
    }


    /**
     * Gets the end_number value for this LnpRoutingDetails.
     * 
     * @return end_number
     */
    public java.lang.String getEnd_number() {
        return end_number;
    }


    /**
     * Sets the end_number value for this LnpRoutingDetails.
     * 
     * @param end_number
     */
    public void setEnd_number(java.lang.String end_number) {
        this.end_number = end_number;
    }


    /**
     * Gets the routing_profile value for this LnpRoutingDetails.
     * 
     * @return routing_profile
     */
    public int getRouting_profile() {
        return routing_profile;
    }


    /**
     * Sets the routing_profile value for this LnpRoutingDetails.
     * 
     * @param routing_profile
     */
    public void setRouting_profile(int routing_profile) {
        this.routing_profile = routing_profile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpRoutingDetails)) return false;
        LnpRoutingDetails other = (LnpRoutingDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.start_number==null && other.getStart_number()==null) || 
             (this.start_number!=null &&
              this.start_number.equals(other.getStart_number()))) &&
            ((this.end_number==null && other.getEnd_number()==null) || 
             (this.end_number!=null &&
              this.end_number.equals(other.getEnd_number()))) &&
            this.routing_profile == other.getRouting_profile();
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
        if (getStart_number() != null) {
            _hashCode += getStart_number().hashCode();
        }
        if (getEnd_number() != null) {
            _hashCode += getEnd_number().hashCode();
        }
        _hashCode += getRouting_profile();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LnpRoutingDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpRoutingDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "start_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "end_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routing_profile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "routing_profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
