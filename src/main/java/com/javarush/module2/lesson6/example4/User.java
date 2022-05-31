package com.javarush.module2.lesson6.example4;

public class User implements Comparable<User> {
    private final int age;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User that) {
        return this.getAge() - that.getAge();
    }
}
