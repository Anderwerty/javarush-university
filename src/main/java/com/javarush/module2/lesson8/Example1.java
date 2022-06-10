package com.javarush.module2.lesson8;

public class Example1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
new A();

    }
}

class A {
    public static int valueStatic = initSaticValue();


    private static int initSaticValue() {
        System.out.println("static method");
        return 0;
    }

    private  int value;

    {
        valueStatic = 100;
        System.out.println("A - not static block before constructor");
    }

    static {
        valueStatic = 5;
        System.out.println("A - static block before constructor");
    }

    public A() {
//        this("");
        System.out.println("A - constructor without parameter");
    }

    static {
        System.out.println("A - static block after constructor");
    }

    public A(String message) {
//        this();
//        new A("");
//        super();
//        this.value = 100;
        System.out.println(" A - constructor with String parameter");
    }

    {
        System.out.println("A - not static block after constructor");
    }
}

class B extends A {

   static  {
        System.out.println("B - static block before constructor");
    }

    {
        System.out.println("B - not static block before constructor");
    }

    public B() {
        super("");
        System.out.println("Constructor - B with parameter");
    }

    {
        System.out.println("B - not static after before constructor");
    }

    static  {
        System.out.println("B - static block after constructor");
    }
}
