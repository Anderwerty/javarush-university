package com.javarush.module2.lesson2.example5.a.Arunner;

import com.javarush.module2.lesson2.example5.A;

public class RunnerA {
    public static void main(String[] args) throws Exception {
        A a = new A();
        a.clone();
        Object ob = a;
//        ob.clone();

    }
}
