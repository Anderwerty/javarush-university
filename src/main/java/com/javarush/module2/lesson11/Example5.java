package com.javarush.module2.lesson11;

public class Example5 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        AThread aThread = new AThread(a);
        aThread.start();

        Thread.sleep(10000);

//        a.isWorking = false;
        aThread.interrupt();

    }
}

class AThread extends Thread {
    private final A a;

    AThread(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
                break;
            }
            System.out.println("Working...");
        }
    }
}

class A {
    public boolean isWorking = true;
}
