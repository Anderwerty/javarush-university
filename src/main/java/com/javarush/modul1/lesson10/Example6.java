package com.javarush.modul1.lesson10;

public class Example6 {
    public static void main(String[] args) {
        String a = "Hillo";
        String b = "Hillo";
        String c = new String("Hillo");

        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.out.println("======================");
        System.out.println(c.equals(a));
        System.out.println(c == a);

        System.out.println("======================");
        c = c.intern();
        System.out.println(c.equals(a));
        System.out.println(c == a);
    }
}
