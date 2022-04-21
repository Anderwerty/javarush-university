package com.javarush.lesson6;

public class Example7 {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;

        for (int i = a; i < b; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(i);
            }
        }
    }
}
