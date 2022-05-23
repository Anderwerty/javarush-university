package com.javarush.module2.lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LazySortStrategy implements SortStrategy {
    @Override
    public void sort(int[] items) {
        List<Integer> list = new ArrayList<>();
        for (int item : items) {
            list.add(item);
        }
        Collections.sort(list);

        for(int i =0; i<items.length; i++){
            items[i] = list.get(i);
        }
    }
}
