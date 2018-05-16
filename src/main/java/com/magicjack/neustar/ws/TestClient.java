package com.magicjack.neustar.ws;

import javax.xml.soap.SOAPElement;

import org.apache.axis.soap.SOAPFactoryImpl;

import https.*;

public class TestClient {
    public static void main(String[] args) {

        String username = "Iristelproduction@magicjack.com";
        username = "michael.sun@ymaxcorp.com";
        
        String password = "uT3#oU1*";
        password = "bE8#yV1@";
        try {
            EspressoDIDLocator service = new EspressoDIDLocator();
            String url = service.getespressoDIDPortAddress();
            EspressoDIDPortType port = service.getespressoDIDPort();
            EspressoDIDBindingStub stub = (EspressoDIDBindingStub) service.getespressoDIDPort();
            stub.setUsername(username);
            stub.setPassword(password);

            //stub.setHeader(url, "UserName", username);
            //stub.setHeader(url, "Password", password);

            SOAPFactoryImpl soapy = new SOAPFactoryImpl();

            SOAPElement creds = soapy.createElement("Credentials");
            SOAPElement $username = soapy.createElement("username");
            $username.addTextNode(username);
            creds.addChildElement($username);

            SOAPElement $password = soapy.createElement("password");
            $password.addTextNode(password);
            creds.addChildElement($password);
            //stub.setHeader(url, "Credentials", creds);
            
            String response = stub.testConnection("hello");
            System.out.println("Sent 'Hello!', got '" + response + "'");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
