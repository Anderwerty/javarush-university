package com.javarush.module3.lesson16.proxy;

public class Example {
    public static void main(String[] args) {

    }
}


interface Service {

    void execute();
}


class OriginalService implements Service {


    @Override
    public void execute() {
        System.out.println("original execution");
    }
}

class ProxyService implements Service {
    private OriginalService service;

    ProxyService(OriginalService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        long start = System.currentTimeMillis();

        service.execute();
        long end = System.currentTimeMillis();

        System.out.println("time to execute: " + (end - start) + " ms");
    }
}