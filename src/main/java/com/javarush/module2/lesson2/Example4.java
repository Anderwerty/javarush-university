package com.javarush.module2.lesson2;

public class Example4 {
    public static void main(String[] args) {
        new MyClass().method();
    }
}

interface InterfaceA {
    default void method() {
        System.out.println("A");
    }

    void a();

}

interface InterfaceB {
    default void method() {
        System.out.println("B");
    }

    void b();
}

interface InterfaceC extends InterfaceA, InterfaceB {

    @Override
    default void method() {
        System.out.println("C");
    }

}

class MyClass implements  InterfaceB, InterfaceA {

    @Override
    public void method() {
        InterfaceA.super.method();
    }

    @Override
    public void b() {

    }

    @Override
    public void a() {

    }
}
