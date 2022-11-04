package com.javarush.module3.lesson20;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(new User("Alex", "Ivanov"));
    }
}

class User{
    private final String name;
    private  final String surname;


    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
