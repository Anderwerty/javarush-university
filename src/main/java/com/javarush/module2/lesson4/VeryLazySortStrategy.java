package com.javarush.module2.lesson4;

import java.util.Arrays;

public class VeryLazySortStrategy implements SortStrategy{
    @Override
    public void sort(int[] items) {
        Arrays.sort(items);
    }
}
