package com.javarush.lesson4;

public class Example8 {
    public static void main(String[] args) {
        int age = 10;

        int credit = 100;

//        if (age > 35) {
//            credit *= 2;
//        } else {
//            credit += 10;
//        }

        ////////////////////////

        // if (age > 35) credit *= 2; else credit += 10;

        credit = ((age > 35) ? (credit * 2) : (credit + 10));

        System.out.println(credit);
    }
}
