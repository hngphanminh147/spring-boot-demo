package com.model;

import java.util.HashMap;
import java.util.Map;

public class Attr {
    String name;
    String addr;
    String lv;

    public Attr(String name, String addr, String lv) {
        this.name = name;
        this.addr = addr;
        this.lv = lv;
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Attr{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
