package com.javarush.module2.lesson2;

public class Example3 {
    public static void main(String[] args) {
        A e = new E();
        e.method1();
        e.method2();
    }
}

abstract class A {
    abstract void method1();

    abstract void method2();
}

abstract class B extends A {

    @Override
    void method1() {
        System.out.println("B-method1");
    }

}

class C extends B {

    @Override
    void method2() {
        System.out.println("C-method2");
    }
}

abstract class D extends C {
    abstract void method1();
}

class E extends D {

    @Override
    void method1() {
        super.method2();
    }
}
