package com.magicjack.neustar.ws.jws;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

public class EndpointPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws", new MyServiceImpl());
    }
}

@WebService(endpointInterface = "com.magicjack.neustar.ws.MyService")
class MyServiceImpl implements MyService {

    @Override
    public HolderClass1 getHolderClass(HolderClass1 c1, int i) {
        HolderClass1 c11 = new HolderClass1("Holder 1", 1, new HolderClass2("Holder 2", 2));
        return c11;
    }
}