/**
 * EspressoDIDBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package https;

public class EspressoDIDBindingStub extends org.apache.axis.client.Stub implements https.EspressoDIDPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[15];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testConnection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpGetReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonReportArray"), https.LnpPonReport[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpPonLastStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pon"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonReport"), https.LnpPonReport.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpPonInfoForTelNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonShortInfoArray"), https.LnpPonShortInfo[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpPonsStatusFromDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonShortInfoArray"), https.LnpPonShortInfo[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpPonsByStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonShortInfoArray"), https.LnpPonShortInfo[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpCreatePons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpCreatePonRequest"), https.LnpCreatePonRequest.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonShortInfoArray"), https.LnpPonShortInfo[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpEditDDD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pon"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desired_due_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "auth_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpCancelPon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pon"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpEditPon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpEditPonRequest"), https.LnpEditPonRequest.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpCheckNpaNxxPortability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "npanxx"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpEditPonRouting");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpEditPonRoutingRequest"), https.LnpEditPonRoutingRequest.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpGetRoutingProfiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpRoutingProfileArray"), https.LnpRoutingProfile[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpGetApplicationErrorDictionary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpApplicationErrorArray"), https.LnpApplicationError[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lnpPonChangeStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pon"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errors"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray"), https.ErrorsField[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

    }

    public EspressoDIDBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EspressoDIDBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EspressoDIDBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorFieldArray");
            cachedSerQNames.add(qName);
            cls = https.ErrorsField[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorsField");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "errorsField");
            cachedSerQNames.add(qName);
            cls = https.ErrorsField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpApplicationError");
            cachedSerQNames.add(qName);
            cls = https.LnpApplicationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpApplicationErrorArray");
            cachedSerQNames.add(qName);
            cls = https.LnpApplicationError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpApplicationError");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpCreatePonRequest");
            cachedSerQNames.add(qName);
            cls = https.LnpCreatePonRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpEditPonRequest");
            cachedSerQNames.add(qName);
            cls = https.LnpEditPonRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpEditPonRoutingRequest");
            cachedSerQNames.add(qName);
            cls = https.LnpEditPonRoutingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonReport");
            cachedSerQNames.add(qName);
            cls = https.LnpPonReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonReportArray");
            cachedSerQNames.add(qName);
            cls = https.LnpPonReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonShortInfo");
            cachedSerQNames.add(qName);
            cls = https.LnpPonShortInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonShortInfoArray");
            cachedSerQNames.add(qName);
            cls = https.LnpPonShortInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonShortInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonStructure");
            cachedSerQNames.add(qName);
            cls = https.LnpPonStructure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpRoutingDetails");
            cachedSerQNames.add(qName);
            cls = https.LnpRoutingDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpRoutingDetailsArray");
            cachedSerQNames.add(qName);
            cls = https.LnpRoutingDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpRoutingDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpRoutingProfile");
            cachedSerQNames.add(qName);
            cls = https.LnpRoutingProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpRoutingProfileArray");
            cachedSerQNames.add(qName);
            cls = https.LnpRoutingProfile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpRoutingProfile");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpRoutingStructure");
            cachedSerQNames.add(qName);
            cls = https.LnpRoutingStructure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpSdStructure");
            cachedSerQNames.add(qName);
            cls = https.LnpSdStructure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpSdStructureArray");
            cachedSerQNames.add(qName);
            cls = https.LnpSdStructure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpSdStructure");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpStatusReason");
            cachedSerQNames.add(qName);
            cls = https.LnpStatusReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpStatusReasonDetail");
            cachedSerQNames.add(qName);
            cls = https.LnpStatusReasonDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpStatusReasonDetailArray");
            cachedSerQNames.add(qName);
            cls = https.LnpStatusReasonDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpStatusReasonDetail");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpStatusStructure");
            cachedSerQNames.add(qName);
            cls = https.LnpStatusStructure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpStatusStructureArray");
            cachedSerQNames.add(qName);
            cls = https.LnpStatusStructure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpStatusStructure");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpVerStructure");
            cachedSerQNames.add(qName);
            cls = https.LnpVerStructure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpVerStructureArray");
            cachedSerQNames.add(qName);
            cls = https.LnpVerStructure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpVerStructure");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpVerStructureHistory");
            cachedSerQNames.add(qName);
            cls = https.LnpVerStructureHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpVerStructureHistoryArray");
            cachedSerQNames.add(qName);
            cls = https.LnpVerStructureHistory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpVerStructureHistory");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "stringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String testConnection(java.lang.String name) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#testConnection");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "testConnection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpGetReport(java.lang.String startDate, java.lang.String endDate, https.holders.LnpPonReportArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpGetReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpGetReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {startDate, endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (https.LnpPonReport[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (https.LnpPonReport[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), https.LnpPonReport[].class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpPonLastStatus(java.lang.String pon, https.holders.LnpPonReportHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpPonLastStatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonLastStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pon});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (https.LnpPonReport) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (https.LnpPonReport) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), https.LnpPonReport.class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpPonInfoForTelNumber(java.lang.String number, https.holders.LnpPonShortInfoArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpPonInfoForTelNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonInfoForTelNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {number});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (https.LnpPonShortInfo[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (https.LnpPonShortInfo[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), https.LnpPonShortInfo[].class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpPonsStatusFromDate(java.lang.String date, https.holders.LnpPonShortInfoArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpPonsStatusFromDate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonsStatusFromDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (https.LnpPonShortInfo[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (https.LnpPonShortInfo[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), https.LnpPonShortInfo[].class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpPonsByStatus(java.lang.String status, https.holders.LnpPonShortInfoArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpPonsByStatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonsByStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {status});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (https.LnpPonShortInfo[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (https.LnpPonShortInfo[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), https.LnpPonShortInfo[].class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpCreatePons(https.LnpCreatePonRequest data, https.holders.LnpPonShortInfoArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpCreatePons");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpCreatePons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {data});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (https.LnpPonShortInfo[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (https.LnpPonShortInfo[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), https.LnpPonShortInfo[].class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpEditDDD(java.lang.String pon, java.lang.String desired_due_date, java.lang.String auth_date, javax.xml.rpc.holders.StringHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpEditDDD");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpEditDDD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pon, desired_due_date, auth_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), java.lang.String.class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpCancelPon(java.lang.String pon, javax.xml.rpc.holders.StringHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpCancelPon");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpCancelPon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pon});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), java.lang.String.class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpEditPon(https.LnpEditPonRequest data, javax.xml.rpc.holders.StringHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpEditPon");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpEditPon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {data});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), java.lang.String.class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpCheckNpaNxxPortability(java.lang.String npanxx, javax.xml.rpc.holders.IntHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpCheckNpaNxxPortability");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpCheckNpaNxxPortability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {npanxx});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "return"))).intValue();
            } catch (java.lang.Exception _exception) {
                _return.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), int.class)).intValue();
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpEditPonRouting(https.LnpEditPonRoutingRequest data, javax.xml.rpc.holders.StringHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpEditPonRouting");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpEditPonRouting"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {data});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), java.lang.String.class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpGetRoutingProfiles(https.holders.LnpRoutingProfileArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpGetRoutingProfiles");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpGetRoutingProfiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (https.LnpRoutingProfile[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (https.LnpRoutingProfile[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), https.LnpRoutingProfile[].class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpGetApplicationErrorDictionary(https.holders.LnpApplicationErrorArrayHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpGetApplicationErrorDictionary");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpGetApplicationErrorDictionary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (https.LnpApplicationError[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (https.LnpApplicationError[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), https.LnpApplicationError[].class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void lnpPonChangeStatus(java.lang.String pon, java.lang.String status, javax.xml.rpc.holders.StringHolder _return, https.holders.ErrorFieldArrayHolder errors) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:https://connect.espressodid.com/cloud/public/v3/test#lnpPonChangeStatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:https://connect.espressodid.com/cloud/public/v3/test", "lnpPonChangeStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pon, status});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), java.lang.String.class);
            }
            try {
                errors.value = (https.ErrorsField[]) _output.get(new javax.xml.namespace.QName("", "errors"));
            } catch (java.lang.Exception _exception) {
                errors.value = (https.ErrorsField[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errors")), https.ErrorsField[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
