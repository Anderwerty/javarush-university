package com.javarush.module2.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Sharik"));
        animals.add(new Cat("Matroskin"));
//        animals.add(new Animal("Matroskin"));

        for (Animal animal : animals) {
            animal.say();
        }

    }
}

abstract class Animal {
    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

     void say(){

     }

}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void say() {
        System.out.println("Gaf");
    }
}

class Cat extends Animal {

    protected Cat(String name) {
        super(name);
    }

    @Override
    void say() {
        System.out.println("May");
    }
}
