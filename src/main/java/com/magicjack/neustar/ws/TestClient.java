package com.magicjack.neustar.ws;

import javax.xml.soap.SOAPElement;

import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;

import https.EspressoDIDLocator;
import https.EspressoDIDPortType;

public class TestClient {
    public static void main(String[] args) {

        String username = "michael.sun@magicjack.com";
        String password = "xB7%vZ3#";

        try {
            EspressoDIDLocator service = new EspressoDIDLocator();
            String url = service.getespressoDIDPortAddress();
            EspressoDIDPortType port = service.getespressoDIDPort();
            Stub stub = (Stub) service.getespressoDIDPort();
            // stub.setUsername(username);
            // stub.setPassword(password);
            
            // stub.setHeader(url, "UserName", username);
            // stub.setHeader(url, "Password", password);
            
            SOAPHeaderElement header = new SOAPHeaderElement(url, "Credentials");
            SOAPElement uname = header.addChildElement("username");
            uname.addTextNode(username);
            SOAPElement passwd = header.addChildElement("password");
            passwd.addTextNode(password);
            stub.setHeader(header);
            String response = port.testConnection("hello");
            System.out.println("Sent 'Hello!', got '" + response + "'");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
