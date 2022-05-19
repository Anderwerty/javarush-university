package com.javarush.module2.lesson2.example5;


// public, protected, default (package -private), private
public abstract class Executor {
    abstract A method(A a1);
}

class Executor1 extends Executor {

    @Override
    B method(A a2) {
        return new B();
    }
}

class Executor2 extends Executor1{

    @Override
    C method(A a3) {
        return new C();
    }

    C method (B b){
        return null;
    }
}


