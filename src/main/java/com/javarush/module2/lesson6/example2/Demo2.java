package com.javarush.module2.lesson6.example2;

public class Demo2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            private int times = 0;

            @Override
            public void run() {
                System.out.println("run");
            }

            @Override
            public void run(Object obj) {
                System.out.println("run with parameter");
            }
        };

        Executable executable = new Executable() {
            @Override
            public void execute() {

            }
        };
    }
}
