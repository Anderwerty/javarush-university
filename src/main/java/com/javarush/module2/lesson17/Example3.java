package com.javarush.module2.lesson17;

public class Example3 {
}

class A1{

    public void method(){
        System.out.println("method from A1");
    }
}

class A1Proxy extends A1 {

    public void method( ){
        System.out.println(System.currentTimeMillis());
        super.method();
        System.out.println(System.currentTimeMillis());
    }
}
