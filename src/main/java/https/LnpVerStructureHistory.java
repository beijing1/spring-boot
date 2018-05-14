/**
 * LnpVerStructureHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package https;

public class LnpVerStructureHistory  implements java.io.Serializable {
    private java.lang.String date;

    private https.LnpPonStructure pon_data;

    private https.LnpStatusStructure[] status;

    public LnpVerStructureHistory() {
    }

    public LnpVerStructureHistory(
           java.lang.String date,
           https.LnpPonStructure pon_data,
           https.LnpStatusStructure[] status) {
           this.date = date;
           this.pon_data = pon_data;
           this.status = status;
    }


    /**
     * Gets the date value for this LnpVerStructureHistory.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this LnpVerStructureHistory.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the pon_data value for this LnpVerStructureHistory.
     * 
     * @return pon_data
     */
    public https.LnpPonStructure getPon_data() {
        return pon_data;
    }


    /**
     * Sets the pon_data value for this LnpVerStructureHistory.
     * 
     * @param pon_data
     */
    public void setPon_data(https.LnpPonStructure pon_data) {
        this.pon_data = pon_data;
    }


    /**
     * Gets the status value for this LnpVerStructureHistory.
     * 
     * @return status
     */
    public https.LnpStatusStructure[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LnpVerStructureHistory.
     * 
     * @param status
     */
    public void setStatus(https.LnpStatusStructure[] status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpVerStructureHistory)) return false;
        LnpVerStructureHistory other = (LnpVerStructureHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.pon_data==null && other.getPon_data()==null) || 
             (this.pon_data!=null &&
              this.pon_data.equals(other.getPon_data()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus())));
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
        if (getPon_data() != null) {
            _hashCode += getPon_data().hashCode();
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LnpVerStructureHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpVerStructureHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pon_data");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "pon_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonStructure"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpStatusStructure"));
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
