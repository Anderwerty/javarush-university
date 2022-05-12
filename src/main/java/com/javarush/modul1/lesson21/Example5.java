package com.javarush.modul1.lesson21;

public class Example5 {
    public static void main(String[] args) {
        throw new PasswordValidationException();
    }
}

class PasswordValidationException extends RuntimeException {
    public PasswordValidationException(){
        super();
    }

    public PasswordValidationException(String message){
        super(message);
    }
}
