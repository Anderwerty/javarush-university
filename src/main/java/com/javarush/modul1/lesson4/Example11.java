package com.javarush.modul1.lesson4;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Text1");

        String text1 = "Text1";
        String text2 = "Text2";
        String text3 = "Text1";

        String text4 = scanner.next(); //Text1
        System.out.println("text4: " + text4);

        System.out.println("==");
        System.out.println(text1 == text2); // false
        System.out.println(text1 == text3); // true
        System.out.println(text1 == text4); // true?

        System.out.println("equals");
        System.out.println(text1.equals(text2)); //
        System.out.println(text1.equals(text3)); //
        System.out.println(text1.equals(text4)); //
    }
}
