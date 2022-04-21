package com.javarush.lesson21;

public class Example7 {
    public static void main(String[] args) {
        try {
            throw new Error();
        } catch (Error e) {
            System.out.println("caught");
        }
    }
}
