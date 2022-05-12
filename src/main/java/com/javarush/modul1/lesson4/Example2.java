package com.javarush.modul1.lesson4;

public class Example2 {
    public static void main(String[] args) {
        double m1 = 10.201;
        double m2 = 10.202;
        double delta = 0.01;

        boolean r = (Math.abs(m2 - m1) <delta); //Math.abs

        System.out.println(r);

    }
}
