package com.javarush.module2.lesson11;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Working...");
                }
            }
        };
        thread.start();


        Thread.sleep(10000);
        thread.stop();
        System.out.println("Stop my thread");
        Thread.sleep(10000);
        thread.suspend();
        System.out.println("Run my thread");


//        System.out.println("Stop");

    }
}
