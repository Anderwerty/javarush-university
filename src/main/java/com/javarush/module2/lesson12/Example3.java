package com.javarush.module2.lesson12;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        Storage storage = new Storage();
        BThread bThread = new BThread(storage);
        bThread.join();
        bThread.start();

        Thread.sleep(2000);
        System.out.println("End main thread");
        System.out.println(storage.value);
    }
}

class Storage {
    public int value;
}

class BThread extends Thread {
    private final Storage storage;

    BThread(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Working " + i);
        }
        System.out.println("My thread finish job!");
    }
}
