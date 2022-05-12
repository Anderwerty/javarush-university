package com.javarush.modul1.lesson4;

public class Example7 {
    public static void main(String[] args) {
        char a = 'f';

        if (a == 'r') {
            System.out.println("Stop!");
        } else if (a == 'y') {
            System.out.println("Wait!");
        } else if (a == 'g') {
            System.out.println("Go...");
        } else {
            System.out.println("look out!");
        }
    }
}
