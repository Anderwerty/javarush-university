package com.javarush.lesson4;

public class Example9 {
    public static void main(String[] args) {
        int age = 10;

        int credit = 100;

        if (age > 35) {
            System.out.println(credit * 2);
        } else {
            System.out.println(credit + 10);
        }

        ////
        //age > 35 ? System.out.println(credit * 2) : System.out.println(credit + 10); not work

        System.out.println(age > 35 ? credit * 2 : credit + 10);
    }
}
