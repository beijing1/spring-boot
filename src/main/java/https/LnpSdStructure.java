/**
 * LnpSdStructure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package https;

public class LnpSdStructure  implements java.io.Serializable {
    private java.lang.String activity;

    private java.lang.String existing_account_number;

    private java.lang.String start_number;

    private java.lang.String end_number;

    public LnpSdStructure() {
    }

    public LnpSdStructure(
           java.lang.String activity,
           java.lang.String existing_account_number,
           java.lang.String start_number,
           java.lang.String end_number) {
           this.activity = activity;
           this.existing_account_number = existing_account_number;
           this.start_number = start_number;
           this.end_number = end_number;
    }


    /**
     * Gets the activity value for this LnpSdStructure.
     * 
     * @return activity
     */
    public java.lang.String getActivity() {
        return activity;
    }


    /**
     * Sets the activity value for this LnpSdStructure.
     * 
     * @param activity
     */
    public void setActivity(java.lang.String activity) {
        this.activity = activity;
    }


    /**
     * Gets the existing_account_number value for this LnpSdStructure.
     * 
     * @return existing_account_number
     */
    public java.lang.String getExisting_account_number() {
        return existing_account_number;
    }


    /**
     * Sets the existing_account_number value for this LnpSdStructure.
     * 
     * @param existing_account_number
     */
    public void setExisting_account_number(java.lang.String existing_account_number) {
        this.existing_account_number = existing_account_number;
    }


    /**
     * Gets the start_number value for this LnpSdStructure.
     * 
     * @return start_number
     */
    public java.lang.String getStart_number() {
        return start_number;
    }


    /**
     * Sets the start_number value for this LnpSdStructure.
     * 
     * @param start_number
     */
    public void setStart_number(java.lang.String start_number) {
        this.start_number = start_number;
    }


    /**
     * Gets the end_number value for this LnpSdStructure.
     * 
     * @return end_number
     */
    public java.lang.String getEnd_number() {
        return end_number;
    }


    /**
     * Sets the end_number value for this LnpSdStructure.
     * 
     * @param end_number
     */
    public void setEnd_number(java.lang.String end_number) {
        this.end_number = end_number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpSdStructure)) return false;
        LnpSdStructure other = (LnpSdStructure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activity==null && other.getActivity()==null) || 
             (this.activity!=null &&
              this.activity.equals(other.getActivity()))) &&
            ((this.existing_account_number==null && other.getExisting_account_number()==null) || 
             (this.existing_account_number!=null &&
              this.existing_account_number.equals(other.getExisting_account_number()))) &&
            ((this.start_number==null && other.getStart_number()==null) || 
             (this.start_number!=null &&
              this.start_number.equals(other.getStart_number()))) &&
            ((this.end_number==null && other.getEnd_number()==null) || 
             (this.end_number!=null &&
              this.end_number.equals(other.getEnd_number())));
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
        if (getActivity() != null) {
            _hashCode += getActivity().hashCode();
        }
        if (getExisting_account_number() != null) {
            _hashCode += getExisting_account_number().hashCode();
        }
        if (getStart_number() != null) {
            _hashCode += getStart_number().hashCode();
        }
        if (getEnd_number() != null) {
            _hashCode += getEnd_number().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LnpSdStructure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpSdStructure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existing_account_number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "existing_account_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
