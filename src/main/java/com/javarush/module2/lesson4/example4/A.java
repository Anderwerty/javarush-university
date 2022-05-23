package com.javarush.module2.lesson4.example4;

public interface A {
    default void method(){
        System.out.println("A-interface");
    }

    void method2();
}
