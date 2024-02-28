package com.fm.helloboot;

public class SimpleHelloService implements HelloService {
    @Override
    public String seyHello(String name){
        return "Hello " + name;
    }
}
