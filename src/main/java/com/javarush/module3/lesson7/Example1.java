package com.javarush.module3.lesson7;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        final Object[] objects = {1, 2};
        Object[] arr = {1, 2, 3.14, "Hello", new Object(), objects};
        Map<String, Integer> map = new HashMap<>();

//        map.forEach();


    }

    char[] alphabet = {'a', 'b', 'c', 'd'};

    public char findNewSymbol(int delta, char currentSymbol) {
//        findCurrentPosition returns -1 if current symbol is not present in
//        alphabet
        int currentPosition = findCurrentPosition(currentSymbol);
        if (currentPosition == -1) {
            return currentSymbol;
        }

        int normalizedDelta = delta % alphabet.length;

        int newIndex = (currentPosition + normalizedDelta) % alphabet.length;

        return alphabet[newIndex];
    }

    private int findCurrentPosition(char symbol) {
        for (char c : alphabet) {
            if (c == symbol) {
                return c;
            }
        }

        return -1;
    }


}
