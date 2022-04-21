package com.javarush.lesson4;

public class Example3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean c1 = a & b;
        //  true = true & true
        //  false = false & true
        //  false = false & false
        //  false = true & false


        boolean c2 = a | b;
        //  true = true & true
        //  true = true & false
        //  true = false & true
        //  false = false & false


        boolean c3 = a ^ b;
        //  false = true & true
        //  true = false & true
        //  true = true & false
        //  false = false & false

    }
}
