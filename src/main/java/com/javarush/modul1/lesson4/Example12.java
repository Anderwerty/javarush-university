package com.javarush.modul1.lesson4;

public class Example12 {
    public static void main(String[] args) {
        String text1 = "TeXt1";

        String text2 = "teXt1";

        System.out.println(text1.toLowerCase());
        System.out.println(text1.toUpperCase());

        String copyText1 = text1.toLowerCase();
        String copyText2 = text2.toLowerCase();
        System.out.println(copyText1.equals(copyText2));

        System.out.println(text1.equalsIgnoreCase(text2));

    }
}
