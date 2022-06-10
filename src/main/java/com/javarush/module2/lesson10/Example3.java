package com.javarush.module2.lesson10;

public class Example3 {
    public static void main(String[] args) {
        int n = 10;
        a(n--);
        System.out.println("==============");
//        b(11);
    }

    public static void a(int n) {
        if (n == 1) {
            System.out.println("A - finish");
        } else {
            b(n);
            --n;
            System.out.println("n: " + n + " go to b");

        }
    }

    public static void b(int n) {
        if (n == 1) {
            System.out.println("B -finish");
        } else {
            System.out.println("n: " + n + " go to a");
            a(--n);
        }
    }
}
