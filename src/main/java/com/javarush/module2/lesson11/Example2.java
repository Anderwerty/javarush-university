package com.javarush.module2.lesson11;

public class Example2 {
    public static void main(String[] args) {
//        MyThread2 myThread2 = new MyThread2(5);
        final int times = 5;
        MyThread myThread = new MyThread();
        myThread.setName("my-thread");
        myThread.start();
//        new Thread(getRunnable(times)).start();

    }

    private static Runnable getRunnable(int times) {
        return () -> {
            for (int i = 0; i < times; i++) {
                System.out.println("Working...");
            }

            System.out.println("Stop");
        };
    }
}

class MyThread extends Thread {

    public MyThread(){
        super();
    }

    @Override
    public void run() {
        System.out.println("Hello. I'm a new thread! My name is " + getName());
    }
}

class MyThread2 implements Runnable {
    private final int times;

    MyThread2(int times) {
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println("Working...");
        }

        System.out.println("Stop");
    }
}
