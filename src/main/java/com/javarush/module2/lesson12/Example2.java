package com.javarush.module2.lesson12;

public class Example2 {
    public static void main(String[] args) {
        Container container = new Container();
        Consumer consumer = new Consumer(container);
        Producer producer = new Producer(container);

        consumer.start();
        producer.start();

    }
}

class Container {
    private volatile int value;//0
    private final Object lock = new Object();

    //this
    public void take() throws InterruptedException {
        synchronized (lock) {
            if (value == 0) {
                lock.wait();
            }
            value--;
            System.out.println(value + "Take.");
            lock.notifyAll();
        }
    }

    public void put() throws InterruptedException {
        synchronized (lock) {
            if (value == 10) {
                lock.wait();
            }
            value++;
            System.out.println(value + "Put.");
            lock.notifyAll();
        }
    }

    //Container.class
    public static void method() {
        synchronized (Container.class) {

        }
    }
}

class Producer extends Thread {
    private final Container container;

    Producer(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        while (true) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            try {
                container.put();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private final Container container;

    Consumer(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        while (true) {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            try {
                container.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
