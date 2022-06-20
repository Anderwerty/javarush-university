package com.javarush.module2.lesson12;

public class Example {
    public static void main(String[] args) throws InterruptedException {

        AThread aThread = new AThread();
        aThread.setName("A - thread");
        aThread.setDaemon(true);
        aThread.start();
        aThread.interrupt();
        aThread.isInterrupted();
        Thread.interrupted();

        Thread.sleep(2000);
        System.out.println("Main thread stop");
    }
}

class AThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Working... " + i);
        }

        System.out.println("End thread A thread");
    }
}
