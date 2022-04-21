package com.javarush.lesson4;

public class Example10 {
    public static void main(String[] args) {
        int age = 10;

        int credit = 100;

        if (age > 35) {
            credit *= 3;
        } else {
            if (age < 35) {
                credit *= 2;
            } else {
                credit += 10;
            }
        }

// step -1
        if (age > 35) {
            credit *= 3;
        } else {

            credit = age < 35 ? credit * 2 : credit + 10;

        }


        // step - 2

        if (age > 35) {
            credit *= 3;
        } else {

            credit = age < 35 ? credit * 2 : credit + 10;

        }

        // step - 3
        credit = age > 35 ? credit * 3 : age < 35 ? credit * 2 : credit + 10;
    }
}
