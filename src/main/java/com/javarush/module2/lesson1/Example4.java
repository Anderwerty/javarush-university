package com.javarush.module2.lesson1;

import java.util.Collections;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        MyClass myClass;
        if (choose == 0) {
            myClass = new A();
        } else if (choose == 1) {
            myClass = new B();

        } else {
            myClass = new C();
        }

        myClass.method();

        B b = new B();
        b.value = 1;

        B c = new C();
        c.value = 1;
        c.method();
        C c1 =(C) c;
    }
}

interface MyClass {
    void method();
}

class A implements MyClass {

    @Override
    public void method() {
        System.out.println("method A");
    }
}

class B implements MyClass {
    public int value;

    @Override
    public void method() {
        System.out.println("method B");
    }
}

class C extends B {
    public int value;

    @Override
    public void method() {
        super.method();
        System.out.println("method C");
        System.out.println("c value: " + this.value);
        System.out.println("b value: " + super.value);
    }
}
