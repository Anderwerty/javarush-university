package com.javarush.modul1.lesson21;

public class Example9 {

    public static void main(String[] args) {
        try {
            method(1);
            //DRY
        } catch (ExceptionA|ExceptionB|ExceptionC e) {
            System.err.println(e);
        } catch (Exception e){

        }
    }

    public static void method(int value) throws ExceptionA, ExceptionB, ExceptionC {
        if(value<0) throw new ExceptionA();
        if(value==0) throw new ExceptionB();
        if(value>0) throw  new ExceptionC();
    }
}
class ExceptionA extends Exception{}
class ExceptionB extends Exception{}
class ExceptionC extends Exception{}
