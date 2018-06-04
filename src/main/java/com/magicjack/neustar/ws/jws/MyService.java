package com.magicjack.neustar.ws.jws;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.*;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface MyService {

    @WebMethod()
    HolderClass1 getHolderClass(@WebParam(name = "holder1", partName = "holder1Part") HolderClass1 class1,
            @WebParam(name = "intValue", partName = "intPart") int i);

}
