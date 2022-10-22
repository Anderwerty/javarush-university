package com.javarush.module3.lesson16.factorymethod;

public class Example2 {
    public static void main(String[] args) {

    }
}


class FactoryMethod {

    public Pet createPet(String type) {
        switch (type) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            default:
                throw new IllegalArgumentException();
        }
    }
}

class Pet {

}

class Cat extends Pet {

}

class Dog extends Pet {

}