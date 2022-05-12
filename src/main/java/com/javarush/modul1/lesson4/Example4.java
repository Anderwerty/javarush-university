package com.javarush.modul1.lesson4;

public class Example4 {
    public static void main(String[] args) {

        // & vs &&
        // | vs ||

        int a = 0;

        boolean r1 = ((a == 0) || (++a == 1));
        System.out.println(r1);
        System.out.println(a);
    }
}
