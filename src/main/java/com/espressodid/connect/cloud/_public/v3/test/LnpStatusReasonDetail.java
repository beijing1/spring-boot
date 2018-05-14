/**
 * LnpStatusReasonDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.espressodid.connect.cloud._public.v3.test;

public class LnpStatusReasonDetail implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String code_label;

    private java.lang.String numbers;

    private java.lang.String regarding_field;

    private java.lang.String remarks;

    public LnpStatusReasonDetail() {
    }

    public LnpStatusReasonDetail(java.lang.String code, java.lang.String code_label, java.lang.String numbers,
            java.lang.String regarding_field, java.lang.String remarks) {
        this.code = code;
        this.code_label = code_label;
        this.numbers = numbers;
        this.regarding_field = regarding_field;
        this.remarks = remarks;
    }

    /**
     * Gets the code value for this LnpStatusReasonDetail.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }

    /**
     * Sets the code value for this LnpStatusReasonDetail.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }

    /**
     * Gets the code_label value for this LnpStatusReasonDetail.
     * 
     * @return code_label
     */
    public java.lang.String getCode_label() {
        return code_label;
    }

    /**
     * Sets the code_label value for this LnpStatusReasonDetail.
     * 
     * @param code_label
     */
    public void setCode_label(java.lang.String code_label) {
        this.code_label = code_label;
    }

    /**
     * Gets the numbers value for this LnpStatusReasonDetail.
     * 
     * @return numbers
     */
    public java.lang.String getNumbers() {
        return numbers;
    }

    /**
     * Sets the numbers value for this LnpStatusReasonDetail.
     * 
     * @param numbers
     */
    public void setNumbers(java.lang.String numbers) {
        this.numbers = numbers;
    }

    /**
     * Gets the regarding_field value for this LnpStatusReasonDetail.
     * 
     * @return regarding_field
     */
    public java.lang.String getRegarding_field() {
        return regarding_field;
    }

    /**
     * Sets the regarding_field value for this LnpStatusReasonDetail.
     * 
     * @param regarding_field
     */
    public void setRegarding_field(java.lang.String regarding_field) {
        this.regarding_field = regarding_field;
    }

    /**
     * Gets the remarks value for this LnpStatusReasonDetail.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }

    /**
     * Sets the remarks value for this LnpStatusReasonDetail.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpStatusReasonDetail))
            return false;
        LnpStatusReasonDetail other = (LnpStatusReasonDetail) obj;
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
                && ((this.code == null && other.getCode() == null)
                        || (this.code != null && this.code.equals(other.getCode())))
                && ((this.code_label == null && other.getCode_label() == null)
                        || (this.code_label != null && this.code_label.equals(other.getCode_label())))
                && ((this.numbers == null && other.getNumbers() == null)
                        || (this.numbers != null && this.numbers.equals(other.getNumbers())))
                && ((this.regarding_field == null && other.getRegarding_field() == null)
                        || (this.regarding_field != null && this.regarding_field.equals(other.getRegarding_field())))
                && ((this.remarks == null && other.getRemarks() == null)
                        || (this.remarks != null && this.remarks.equals(other.getRemarks())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCode_label() != null) {
            _hashCode += getCode_label().hashCode();
        }
        if (getNumbers() != null) {
            _hashCode += getNumbers().hashCode();
        }
        if (getRegarding_field() != null) {
            _hashCode += getRegarding_field().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            LnpStatusReasonDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test",
                "lnpStatusReasonDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code_label");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "code_label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numbers");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "numbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regarding_field");
        elemField.setXmlName(new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test",
                "regarding_field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(
                new javax.xml.namespace.QName("https://connect.espressodid.com/cloud/public/v3/test", "remarks"));
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
