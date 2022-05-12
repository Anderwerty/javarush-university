package com.javarush.modul1.lesson6;

public class Example11 {
    public static void main(String[] args) {
        int counter = 1;
        boolean condition = true;
        while (condition) {
            if (counter % 7 == 0 && counter % 6 == 0) {
                System.out.println("Number: " + counter);
                condition = false;
            }
            System.out.println(counter);
            counter++;
        }
    }
}
