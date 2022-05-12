package com.javarush.modul1.lesson6;

public class Example8 {
    public static void main(String[] args) {
        for (int i = 1; i < 120; i++) {
            if (i % 7 == 0 && i % 6 == 0 ) {
                System.out.println("Number: " + i);
                break;
            }
            System.out.println(i);
        }

        System.out.println("End");
    }
}
