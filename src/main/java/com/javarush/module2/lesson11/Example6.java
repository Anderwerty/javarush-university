package com.javarush.module2.lesson11;

public class Example6 {
    public static void main(String[] args) {
        new BThread().start();
    }
}

class BThread extends Thread{
    @Override
    public void run() {
        while (true){


            System.out.println("Working ...");
        }
    }
}
