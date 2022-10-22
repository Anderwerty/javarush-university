package com.javarush.module3.lesson16.singleton;

public class Example1 {
    public static void main(String[] args) {

    }
}

//* 1) static inner class singleton implementation
//* 2) what if LOCK is null ?
//SOLID
final class Singleton {

    private static final Object LOCK = new Object(); // ? null

    private static Singleton instance;

    private String url;

    // Singleton.getClass()
    //
    public static Singleton getInstance() {
        if (instance == null) { //thread_2
            synchronized (LOCK) { //
                if (instance == null) {
                    Singleton temp = new Singleton();
                    temp.url = "url";//thread_1
                    instance = temp;
                }
            }
        }
        return instance;
    }

    private Singleton(String url) {
        this.url = url;
    }

    private Singleton() {

    }

    public void method() {
        //......
    }
}

enum SingletonEnum {
    FIRST;

    public void method(){

    }
}