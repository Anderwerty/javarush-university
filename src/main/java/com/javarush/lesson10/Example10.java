package com.javarush.lesson10;

public class Example10 {
    public static void main(String[] args) {
        String line ="aabbab";
        System.out.println(line.indexOf("ab"));
        System.out.println(line.lastIndexOf("ab"));
        System.out.println(line.matches("aa(\\w*)"));

        System.out.println(line.substring(2));
        System.out.println(line.substring(2,5));
//        System.out.println(line.repeat(20));
    }
}
