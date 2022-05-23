package com.javarush.module2.lesson4.example;

@Deprecated
public class Runner {
    private static final String CONSTANT ="A";
    public static void main(String[] args) {
        A runner = new A();

        if(runner instanceof M){
            System.out.println(" inplemented M");
        }
    }
}
