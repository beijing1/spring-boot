package com.magicjack.neustar.ws.jws;

import javax.xml.bind.annotation.XmlElement;

public class HolderClass1 {

    private String name;
    private int i;
    private HolderClass2 holder2;

    public HolderClass1() {
    }

    public HolderClass1(String s, int a, HolderClass2 h) {
        this.name = s;
        this.i = a;
        holder2 = h;
    }

    @XmlElement(required = true, namespace = "urn:helloworld")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @XmlElement(required = true, name = "hc1hc2", namespace = "urn:whatever")
    public HolderClass2 getHolder2() {
        return holder2;
    }

    public void setHolder2(HolderClass2 holder2) {
        this.holder2 = holder2;
    }
}
