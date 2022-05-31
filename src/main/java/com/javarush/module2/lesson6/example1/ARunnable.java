package com.javarush.module2.lesson6.example1;

public class ARunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void run(Object obj) {
        System.out.println("run with parameter");
    }
}
