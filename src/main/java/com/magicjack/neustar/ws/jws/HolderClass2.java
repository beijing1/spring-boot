package com.magicjack.neustar.ws.jws;

import javax.xml.bind.annotation.XmlElement;

public class HolderClass2 {
    private String name;
    private int i;

    public HolderClass2() {
    }

    public HolderClass2(String s, int a) {
        this.name = s;
        this.i = a;
    }

    @XmlElement(required = true, name = "hc2name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(required = false, name = "hc2i")
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

}
