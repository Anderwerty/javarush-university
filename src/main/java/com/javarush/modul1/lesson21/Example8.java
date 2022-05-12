package com.javarush.modul1.lesson21;

public class Example8 {
    public static void main(String[] args) {

    }

    public static void method(int value) throws CustomException {
//        if (value > 0) {
//            throw new CustomException();
//        }
        if(value<0){
            throw new CustomRuntimeException();
        }
    }
}

class CustomException extends Exception {

}

class CustomRuntimeException extends RuntimeException {

}
