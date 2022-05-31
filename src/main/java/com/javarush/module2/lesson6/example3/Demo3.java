package com.javarush.module2.lesson6.example3;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Mapper mapper1 = new Mapper() {
            int value = 0;

            @Override
            public User map() {
                return new User();
            }
        };

        Mapper mapper2 = () -> {
            System.out.println("map");
            return new User();
        };

    }
}
