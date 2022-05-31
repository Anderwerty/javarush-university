package com.javarush.module2.lesson6.example1;

public class Demo1 {
    public static void main(String[] args) {
        Runnable runnable = new ARunnable();
        runnable.run();
        runnable.run(new int[]{1, 2, 3});
    }
}
