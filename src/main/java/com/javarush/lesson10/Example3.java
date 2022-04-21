package com.javarush.lesson10;

public class Example3 {

    public static int count = 0;
    public  int sum = 0; // static final SUM

    public void add(int data) {
        int sum = data * 2;
//        this.count;
        this.sum = this.sum + data;
        count++;
    }

    public static void staticMethod(){
        count++;
//        sum = 3;
    }
}
