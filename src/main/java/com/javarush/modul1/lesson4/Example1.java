package com.javarush.modul1.lesson4;

public class Example1 {
    public static void main(String[] args) {
        boolean isOk = true; // false

        int a = 1;
        int b = 2;

        boolean r1 = (a == b);
        boolean r2 = a > b;
        boolean r3 = a < b;
        boolean r4 = a <= b;
        boolean r5 = a >= b;
        boolean r6 = a != b;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    }
}
