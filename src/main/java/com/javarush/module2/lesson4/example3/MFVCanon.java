package com.javarush.module2.lesson4.example3;

public class MFVCanon implements MFV {
    @Override
    public void print() {
        System.out.println(" mfv canon is printing");
    }

    @Override
    public void scan() {
        System.out.println("MFV canon is scanning");
    }

    @Override
    public void scan(String source) {

    }
}
