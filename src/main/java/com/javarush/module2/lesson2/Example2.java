package com.javarush.module2.lesson2;

public class Example2 {
    public static void main(String[] args) {

    }
}

abstract class AbstractUser {
    private final String email;

    protected AbstractUser(String email) {
        this.email = email;
    }

    abstract String provideInformation();

    public void method() {
        System.out.println("method");
    }
}

interface IAbstractUser {
    public static final String EMAIL = "example@gmail.com";

    abstract String provideInformation();

    default void method() {
        System.out.println("method");
    }
}
