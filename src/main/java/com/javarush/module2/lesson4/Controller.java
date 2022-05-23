package com.javarush.module2.lesson4;

public class Controller {
    private final SortStrategy sortStrategy;

    public Controller(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void run(int[] items) {
        sortStrategy.sort(items);
    }

}
