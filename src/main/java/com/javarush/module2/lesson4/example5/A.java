package com.javarush.module2.lesson4.example5;

public interface A {
    public static final int A_CONSTANT = 3;

    public static void method() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        A.method();
    }
}
