package com.javarush.modul1.lesson21;

public class Example4 {

    public static void main(String[] args) {
        A a = null;
        a.method();
    }
}

class A {
    public static int value = 1;

    public static void method() {
        System.out.println("method");
    }
}
