package com.javarush.lesson6;

public class Example1 {
    public static void main(String[] args) {
        String message = "Hello";
        int times = 2; // 1 - int.max

        if (times == 1) {
            System.out.println(message);
        }
        if (times == 2) {
            System.out.println(message);
            System.out.println(message);
        }
        if (times == 3) {
            System.out.println(message);
            System.out.println(message);
            System.out.println(message);
        }
    }
}
