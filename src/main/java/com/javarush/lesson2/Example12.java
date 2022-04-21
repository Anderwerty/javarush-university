package com.javarush.lesson2;

public class Example12 {
    public static void main(String[] args) {
        String num1 = "12";
        String num2 = "02";
        String num3 = "-2";
        String num4 = "+4";
        String noNumber = "bla5";

        int int1 = Integer.parseInt(num1);
        System.out.println(int1);

        int int2 = Integer.parseInt(num2);
        System.out.println(int2);

        int int3 = Integer.parseInt(num3);
        System.out.println(int3);

        int int4 = Integer.parseInt(num4);
        System.out.println(int4);

        int int5 = Integer.parseInt(noNumber);
        System.out.println(int5);

    }
}
