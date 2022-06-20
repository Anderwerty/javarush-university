package com.javarush.module2.lesson11;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println("Start");
        Thread.sleep(3000);
        System.out.println("Finish");
    }
}
