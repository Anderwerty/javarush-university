package com.javarush.modul1.lesson21;

public class Example2 {
    public static void main(String[] args) {
        int result = div(10, 0);
        System.out.println(result);
    }

    public static int div(int division, int divisor){
        try{
            int result = division/divisor; // divisor =0?
            return result;
        } catch (ArithmeticException e){
            return 0;
        }
    }
}
