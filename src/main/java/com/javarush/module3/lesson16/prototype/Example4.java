package com.javarush.module3.lesson16.prototype;

public class Example4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype(1);
        prototype.clone();
    }
}

class Prototype  extends Object{

    private int value;

    public Prototype(int value) {

        //........................
        this.value = veryHardWordExecution(value);
    }

    public Prototype(Prototype prototype){
        this.value = prototype.value;
    }

    private static int veryHardWordExecution(int value)  {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
