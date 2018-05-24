/**
 * LnpPonStructure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package https;

public class LnpPonStructure implements java.io.Serializable {
    private java.lang.String service_type;

    private java.lang.String current_provider_name;

    private java.lang.String desired_due_date;

    private java.lang.String auth_date;

    private java.lang.String end_user_name;

    private java.lang.String house_number;

    private java.lang.String street_directional;

    private java.lang.String street_suffix;

    private java.lang.String street_name;

    private java.lang.String street_type;

    private java.lang.String descriptive_location;

    private java.lang.String floor;

    private java.lang.String room;

    private java.lang.String building;

    private java.lang.String city;

    private java.lang.String province_state;

    private java.lang.String zip_code;

    private java.lang.String comments;

    private java.lang.String losing_carrier_comments;

    private https.LnpSdStructure[] service_details;

    public LnpPonStructure() {
    }

    public LnpPonStructure(java.lang.String service_type, java.lang.String current_provider_name,
            java.lang.String desired_due_date, java.lang.String auth_date, java.lang.String end_user_name,
            java.lang.String house_number, java.lang.String street_directional, java.lang.String street_suffix,
            java.lang.String street_name, java.lang.String street_type, java.lang.String descriptive_location,
            java.lang.String floor, java.lang.String room, java.lang.String building, java.lang.String city,
            java.lang.String province_state, java.lang.String zip_code, java.lang.String comments,
            java.lang.String losing_carrier_comments, https.LnpSdStructure[] service_details) {
        this.service_type = service_type;
        this.current_provider_name = current_provider_name;
        this.desired_due_date = desired_due_date;
        this.auth_date = auth_date;
        this.end_user_name = end_user_name;
        this.house_number = house_number;
        this.street_directional = street_directional;
        this.street_suffix = street_suffix;
        this.street_name = street_name;
        this.street_type = street_type;
        this.descriptive_location = descriptive_location;
        this.floor = floor;
        this.room = room;
        this.building = building;
        this.city = city;
        this.province_state = province_state;
        this.zip_code = zip_code;
        this.comments = comments;
        this.losing_carrier_comments = losing_carrier_comments;
        this.service_details = service_details;
    }

    /**
     * Gets the service_type value for this LnpPonStructure.
     * 
     * @return service_type
     */
    public java.lang.String getService_type() {
        return service_type;
    }

    /**
     * Sets the service_type value for this LnpPonStructure.
     * 
     * @param service_type
     */
    public void setService_type(java.lang.String service_type) {
        this.service_type = service_type;
    }

    /**
     * Gets the current_provider_name value for this LnpPonStructure.
     * 
     * @return current_provider_name
     */
    public java.lang.String getCurrent_provider_name() {
        return current_provider_name;
    }

    /**
     * Sets the current_provider_name value for this LnpPonStructure.
     * 
     * @param current_provider_name
     */
    public void setCurrent_provider_name(java.lang.String current_provider_name) {
        this.current_provider_name = current_provider_name;
    }

    /**
     * Gets the desired_due_date value for this LnpPonStructure.
     * 
     * @return desired_due_date
     */
    public java.lang.String getDesired_due_date() {
        return desired_due_date;
    }

    /**
     * Sets the desired_due_date value for this LnpPonStructure.
     * 
     * @param desired_due_date
     */
    public void setDesired_due_date(java.lang.String desired_due_date) {
        this.desired_due_date = desired_due_date;
    }

    /**
     * Gets the auth_date value for this LnpPonStructure.
     * 
     * @return auth_date
     */
    public java.lang.String getAuth_date() {
        return auth_date;
    }

    /**
     * Sets the auth_date value for this LnpPonStructure.
     * 
     * @param auth_date
     */
    public void setAuth_date(java.lang.String auth_date) {
        this.auth_date = auth_date;
    }

    /**
     * Gets the end_user_name value for this LnpPonStructure.
     * 
     * @return end_user_name
     */
    public java.lang.String getEnd_user_name() {
        return end_user_name;
    }

    /**
     * Sets the end_user_name value for this LnpPonStructure.
     * 
     * @param end_user_name
     */
    public void setEnd_user_name(java.lang.String end_user_name) {
        this.end_user_name = end_user_name;
    }

    /**
     * Gets the house_number value for this LnpPonStructure.
     * 
     * @return house_number
     */
    public java.lang.String getHouse_number() {
        return house_number;
    }

    /**
     * Sets the house_number value for this LnpPonStructure.
     * 
     * @param house_number
     */
    public void setHouse_number(java.lang.String house_number) {
        this.house_number = house_number;
    }

    /**
     * Gets the street_directional value for this LnpPonStructure.
     * 
     * @return street_directional
     */
    public java.lang.String getStreet_directional() {
        return street_directional;
    }

    /**
     * Sets the street_directional value for this LnpPonStructure.
     * 
     * @param street_directional
     */
    public void setStreet_directional(java.lang.String street_directional) {
        this.street_directional = street_directional;
    }

    /**
     * Gets the street_suffix value for this LnpPonStructure.
     * 
     * @return street_suffix
     */
    public java.lang.String getStreet_suffix() {
        return street_suffix;
    }

    /**
     * Sets the street_suffix value for this LnpPonStructure.
     * 
     * @param street_suffix
     */
    public void setStreet_suffix(java.lang.String street_suffix) {
        this.street_suffix = street_suffix;
    }

    /**
     * Gets the street_name value for this LnpPonStructure.
     * 
     * @return street_name
     */
    public java.lang.String getStreet_name() {
        return street_name;
    }

    /**
     * Sets the street_name value for this LnpPonStructure.
     * 
     * @param street_name
     */
    public void setStreet_name(java.lang.String street_name) {
        this.street_name = street_name;
    }

    /**
     * Gets the street_type value for this LnpPonStructure.
     * 
     * @return street_type
     */
    public java.lang.String getStreet_type() {
        return street_type;
    }

    /**
     * Sets the street_type value for this LnpPonStructure.
     * 
     * @param street_type
     */
    public void setStreet_type(java.lang.String street_type) {
        this.street_type = street_type;
    }

    /**
     * Gets the descriptive_location value for this LnpPonStructure.
     * 
     * @return descriptive_location
     */
    public java.lang.String getDescriptive_location() {
        return descriptive_location;
    }

    /**
     * Sets the descriptive_location value for this LnpPonStructure.
     * 
     * @param descriptive_location
     */
    public void setDescriptive_location(java.lang.String descriptive_location) {
        this.descriptive_location = descriptive_location;
    }

    /**
     * Gets the floor value for this LnpPonStructure.
     * 
     * @return floor
     */
    public java.lang.String getFloor() {
        return floor;
    }

    /**
     * Sets the floor value for this LnpPonStructure.
     * 
     * @param floor
     */
    public void setFloor(java.lang.String floor) {
        this.floor = floor;
    }

    /**
     * Gets the room value for this LnpPonStructure.
     * 
     * @return room
     */
    public java.lang.String getRoom() {
        return room;
    }

    /**
     * Sets the room value for this LnpPonStructure.
     * 
     * @param room
     */
    public void setRoom(java.lang.String room) {
        this.room = room;
    }

    /**
     * Gets the building value for this LnpPonStructure.
     * 
     * @return building
     */
    public java.lang.String getBuilding() {
        return building;
    }

    /**
     * Sets the building value for this LnpPonStructure.
     * 
     * @param building
     */
    public void setBuilding(java.lang.String building) {
        this.building = building;
    }

    /**
     * Gets the city value for this LnpPonStructure.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }

    /**
     * Sets the city value for this LnpPonStructure.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }

    /**
     * Gets the province_state value for this LnpPonStructure.
     * 
     * @return province_state
     */
    public java.lang.String getProvince_state() {
        return province_state;
    }

    /**
     * Sets the province_state value for this LnpPonStructure.
     * 
     * @param province_state
     */
    public void setProvince_state(java.lang.String province_state) {
        this.province_state = province_state;
    }

    /**
     * Gets the zip_code value for this LnpPonStructure.
     * 
     * @return zip_code
     */
    public java.lang.String getZip_code() {
        return zip_code;
    }

    /**
     * Sets the zip_code value for this LnpPonStructure.
     * 
     * @param zip_code
     */
    public void setZip_code(java.lang.String zip_code) {
        this.zip_code = zip_code;
    }

    /**
     * Gets the comments value for this LnpPonStructure.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }

    /**
     * Sets the comments value for this LnpPonStructure.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    /**
     * Gets the losing_carrier_comments value for this LnpPonStructure.
     * 
     * @return losing_carrier_comments
     */
    public java.lang.String getLosing_carrier_comments() {
        return losing_carrier_comments;
    }

    /**
     * Sets the losing_carrier_comments value for this LnpPonStructure.
     * 
     * @param losing_carrier_comments
     */
    public void setLosing_carrier_comments(java.lang.String losing_carrier_comments) {
        this.losing_carrier_comments = losing_carrier_comments;
    }

    /**
     * Gets the service_details value for this LnpPonStructure.
     * 
     * @return service_details
     */
    public https.LnpSdStructure[] getService_details() {
        return service_details;
    }

    /**
     * Sets the service_details value for this LnpPonStructure.
     * 
     * @param service_details
     */
    public void setService_details(https.LnpSdStructure[] service_details) {
        this.service_details = service_details;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LnpPonStructure))
            return false;
        LnpPonStructure other = (LnpPonStructure) obj;
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
                && ((this.service_type == null && other.getService_type() == null)
                        || (this.service_type != null && this.service_type.equals(other.getService_type())))
                && ((this.current_provider_name == null && other.getCurrent_provider_name() == null)
                        || (this.current_provider_name != null
                                && this.current_provider_name.equals(other.getCurrent_provider_name())))
                && ((this.desired_due_date == null && other.getDesired_due_date() == null)
                        || (this.desired_due_date != null && this.desired_due_date.equals(other.getDesired_due_date())))
                && ((this.auth_date == null && other.getAuth_date() == null)
                        || (this.auth_date != null && this.auth_date.equals(other.getAuth_date())))
                && ((this.end_user_name == null && other.getEnd_user_name() == null)
                        || (this.end_user_name != null && this.end_user_name.equals(other.getEnd_user_name())))
                && ((this.house_number == null && other.getHouse_number() == null)
                        || (this.house_number != null && this.house_number.equals(other.getHouse_number())))
                && ((this.street_directional == null && other.getStreet_directional() == null)
                        || (this.street_directional != null
                                && this.street_directional.equals(other.getStreet_directional())))
                && ((this.street_suffix == null && other.getStreet_suffix() == null)
                        || (this.street_suffix != null && this.street_suffix.equals(other.getStreet_suffix())))
                && ((this.street_name == null && other.getStreet_name() == null)
                        || (this.street_name != null && this.street_name.equals(other.getStreet_name())))
                && ((this.street_type == null && other.getStreet_type() == null)
                        || (this.street_type != null && this.street_type.equals(other.getStreet_type())))
                && ((this.descriptive_location == null && other.getDescriptive_location() == null)
                        || (this.descriptive_location != null
                                && this.descriptive_location.equals(other.getDescriptive_location())))
                && ((this.floor == null && other.getFloor() == null)
                        || (this.floor != null && this.floor.equals(other.getFloor())))
                && ((this.room == null && other.getRoom() == null)
                        || (this.room != null && this.room.equals(other.getRoom())))
                && ((this.building == null && other.getBuilding() == null)
                        || (this.building != null && this.building.equals(other.getBuilding())))
                && ((this.city == null && other.getCity() == null)
                        || (this.city != null && this.city.equals(other.getCity())))
                && ((this.province_state == null && other.getProvince_state() == null)
                        || (this.province_state != null && this.province_state.equals(other.getProvince_state())))
                && ((this.zip_code == null && other.getZip_code() == null)
                        || (this.zip_code != null && this.zip_code.equals(other.getZip_code())))
                && ((this.comments == null && other.getComments() == null)
                        || (this.comments != null && this.comments.equals(other.getComments())))
                && ((this.losing_carrier_comments == null && other.getLosing_carrier_comments() == null)
                        || (this.losing_carrier_comments != null
                                && this.losing_carrier_comments.equals(other.getLosing_carrier_comments())))
                && ((this.service_details == null && other.getService_details() == null)
                        || (this.service_details != null
                                && java.util.Arrays.equals(this.service_details, other.getService_details())));
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
        if (getService_type() != null) {
            _hashCode += getService_type().hashCode();
        }
        if (getCurrent_provider_name() != null) {
            _hashCode += getCurrent_provider_name().hashCode();
        }
        if (getDesired_due_date() != null) {
            _hashCode += getDesired_due_date().hashCode();
        }
        if (getAuth_date() != null) {
            _hashCode += getAuth_date().hashCode();
        }
        if (getEnd_user_name() != null) {
            _hashCode += getEnd_user_name().hashCode();
        }
        if (getHouse_number() != null) {
            _hashCode += getHouse_number().hashCode();
        }
        if (getStreet_directional() != null) {
            _hashCode += getStreet_directional().hashCode();
        }
        if (getStreet_suffix() != null) {
            _hashCode += getStreet_suffix().hashCode();
        }
        if (getStreet_name() != null) {
            _hashCode += getStreet_name().hashCode();
        }
        if (getStreet_type() != null) {
            _hashCode += getStreet_type().hashCode();
        }
        if (getDescriptive_location() != null) {
            _hashCode += getDescriptive_location().hashCode();
        }
        if (getFloor() != null) {
            _hashCode += getFloor().hashCode();
        }
        if (getRoom() != null) {
            _hashCode += getRoom().hashCode();
        }
        if (getBuilding() != null) {
            _hashCode += getBuilding().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getProvince_state() != null) {
            _hashCode += getProvince_state().hashCode();
        }
        if (getZip_code() != null) {
            _hashCode += getZip_code().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getLosing_carrier_comments() != null) {
            _hashCode += getLosing_carrier_comments().hashCode();
        }
        if (getService_details() != null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getService_details()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService_details(), i);
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
            LnpPonStructure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test",
                "lnpPonStructure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_provider_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current_provider_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desired_due_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desired_due_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auth_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_user_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end_user_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "house_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street_directional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "street_directional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street_suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "street_suffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "street_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "street_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptive_location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descriptive_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "floor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("room");
        elemField.setXmlName(new javax.xml.namespace.QName("", "room"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("building");
        elemField.setXmlName(new javax.xml.namespace.QName("", "building"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "province_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zip_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("losing_carrier_comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "losing_carrier_comments"));
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
