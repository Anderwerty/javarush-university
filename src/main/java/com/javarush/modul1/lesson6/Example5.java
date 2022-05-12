package com.javarush.modul1.lesson6;

public class Example5 {
    public static void main(String[] args) {
        // while
        int times1 = 0;
        while (times1 > 0) {
            System.out.println(times1--);
        }
        System.out.println("===============================");
        //do-while

        int times2 = 0;
        do {
            System.out.println(times2--);
        } while (times2 > 0);
    }
}
