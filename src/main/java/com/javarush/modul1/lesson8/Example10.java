package com.javarush.modul1.lesson8;


public class Example10 {
    public static void main(String[] args) {
        Integer intObject = null;
        Object object = null;
        Boolean booleanObj = null;

        object =  intObject;
        intObject =(Integer) object;

    }

    public static void myMethod(){
        System.out.println("hello");
        return;
    }
}
