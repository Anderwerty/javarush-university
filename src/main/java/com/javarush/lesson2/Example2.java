package com.javarush.lesson2;

public class Example2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int sum = a + b; // 10 + 5 = 15
        int c2 = a - b;  // 10 - 5 =5
        int c3 = a * b;  // 10*5 = 50
        int c4 = a / b;  // 10/5 = 2
        int c5 = a % b;

        System.out.println(sum);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        System.out.println(a % 2 == 1);
    }
}
