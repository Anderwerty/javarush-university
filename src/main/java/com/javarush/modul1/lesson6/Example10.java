package com.javarush.modul1.lesson6;

public class Example10 {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;

        for (int i = a; i < b; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println("Number " + i);
            } else {
                break;
            }
            System.out.println(i);
        }
    }
}
