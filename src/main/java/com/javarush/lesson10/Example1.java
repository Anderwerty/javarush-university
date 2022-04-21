package com.javarush.lesson10;

public class Example1 {
    public static final int SENIOR_AGE = 50;
    public static final int INT_CONSTANT = 10;
/*
    static {
        INT_CONSTANT =10;
    }
    */


    public static void main(String[] args) {
        final int age;
        age = 5;
//        age = 2;

//        SENIOR_AGE = 4;

        byte ab = 10;
        final int ai = 100;
        ab = ai;
        ab = INT_CONSTANT;
    }

    public static void method() {
        System.out.println(INT_CONSTANT);
    }
}
