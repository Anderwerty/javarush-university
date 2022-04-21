package com.javarush.lesson22;

public class Example4 {
    public static void main(String[] args) {
//        try {
            Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    System.out.println(t.getName());
                    System.out.println("===============");
                    e.printStackTrace();
                }
            });

        System.out.println("main");
        method3();
//        } catch (Exception e){
//            e.printStackTrace(System.out);
//        }
    }

    public static void method1() {
        System.out.println("method1");
        int i = 0;
        if (i == 0) {
            throw new RuntimeException();
        }
    }

    public static void method2() {
        System.out.println("method2");
        method1();
    }

    public static void method3() {
        System.out.println("hello");
        method2();
    }
}
