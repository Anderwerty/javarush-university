package com.javarush.modul1.lesson2;

public class Example10 {
    public static void main(String[] args) {
        String message = "I'm Nick!\n";
        String ageMessage = "My age is ";
        int age = 20;
        String text = message + ageMessage+age;
//        System.out.println(message);
//        System.out.println(ageMessage + age);
        System.out.println(text);
    }
}
