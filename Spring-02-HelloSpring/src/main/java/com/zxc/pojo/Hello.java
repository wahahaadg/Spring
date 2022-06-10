package com.zxc.pojo;


import org.springframework.beans.factory.annotation.Value;

public class Hello {
    private String str;


    public String getStr() {
        return str;
    }
    @Value("Spring")
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
