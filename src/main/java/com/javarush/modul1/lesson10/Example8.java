package com.javarush.modul1.lesson10;

import java.util.Arrays;

public class Example8 {
    public static void main(String[] args) {
        String[] lines = {"Hello", "Java", "Rush", "!"};
        String delimiter = " ";

        String result = "";
        for (String line : lines) {

            result = result + line + delimiter;
        }

//        for (int i = 0; i < lines.length - 1; i++) {
//            result = result + lines[i] + " ";
//
//        }
//        result = result + lines[lines.length - 1];

        System.out.println(result.trim() + "_");

        System.out.println(String.join(delimiter, "Hello", "Java", "Rush", "!") + "_");

        String sentence = "Hello Java Rush !";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
    }
}
