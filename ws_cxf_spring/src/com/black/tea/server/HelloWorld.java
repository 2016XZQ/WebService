package com.black.tea.server;

import javax.jws.WebService;

@WebService
public class HelloWorld {
    public String seyHello(String name){
        return "hello,"+name;
    }
}
