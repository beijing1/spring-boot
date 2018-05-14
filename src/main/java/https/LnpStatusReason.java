/**
 * LnpStatusReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package https;

public class LnpStatusReason  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String type_label;

    private https.LnpStatusReasonDetail[] details;

    public LnpStatusReason() {
    }

    public LnpStatusReason(
           java.lang.String type,
           java.lang.String type_label,
           https.LnpStatusReasonDetail[] details) {
           this.type = type;
           this.type_label = type_label;
           this.details = details;
    }


    /**
     * Gets the type value for this LnpStatusReason.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this LnpStatusReason.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the type_label value for this LnpStatusReason.
     * 
     * @return type_label
     */
    public java.lang.String getType_label() {
        return type_label;
    }


    /**
     * Sets the type_label value for this LnpStatusReason.
     * 
     * @param type_label
     */
    public void setType_label(java.lang.String type_label) {
        this.type_label = type_label;
    }


    /**
     * Gets the details value for this LnpStatusReason.
     * 
     * @return details
     */
    public https.LnpStatusReasonDetail[] getDetails() {
        return details;
    }


    /**
     * Sets the details value for this LnpStatusReason.
     * 
     * @param details
     */
    public void setDetails(https.LnpStatusReasonDetail[] details) {
        this.details = details;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpStatusReason)) return false;
        LnpStatusReason other = (LnpStatusReason) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.type_label==null && other.getType_label()==null) || 
             (this.type_label!=null &&
              this.type_label.equals(other.getType_label()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              java.util.Arrays.equals(this.details, other.getDetails())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getType_label() != null) {
            _hashCode += getType_label().hashCode();
        }
        if (getDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetails(), i);
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
        new org.apache.axis.description.TypeDesc(LnpStatusReason.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpStatusReason"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "type_label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpStatusReasonDetail"));
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
