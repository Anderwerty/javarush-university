package com.javarush.lesson21;

public class Example6 {
    public static void main(String[] args) {
        try {
            method(1);
        } catch (RuntimeException e) {
            System.out.println("Handle exception");
//            System.exit(1);
        } finally {
            System.out.println("finally");
        }
    }

    public static void method(int value) {
        if (value > 0) {
            throw new RuntimeException();
        }
    }
}
