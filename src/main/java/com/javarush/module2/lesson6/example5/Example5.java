package com.javarush.module2.lesson6.example5;

public class Example5 {
    public static void main(String[] args) {
        ACreation creation = A::new;
    }
}

class A{}

interface ACreation{
    A get();
}
