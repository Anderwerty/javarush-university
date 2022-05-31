package com.javarush.module2.lesson5;

public class A {
}

class Fish {

}

class Bone {

}

abstract class Pet<F extends Fish, Bone> {
//    static F file;
    abstract void eat(F foo);
}





