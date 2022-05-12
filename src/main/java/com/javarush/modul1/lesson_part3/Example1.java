package com.javarush.modul1.lesson_part3;

public class Example1 {
    public static void main(String[] args) {
        Example1.encode("");
    }

    public static String encode(String input){
        duplicateMessageIntoConsole("hello", 100);

        duplicateMessageIntoConsole("Hi",23);
        return input;
    }

    private static void duplicateMessageIntoConsole(String message, int times) {
        for (int i = 0; i < times; i++) {
            printHi(message);
        }
    }

    //3
    private static void printHi(String hello) {
        System.out.println(hello);


        System.out.println();
    }
}
