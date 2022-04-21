package com.javarush.lesson21;

public class Example3 {
    public static void main(String[] args) {
        try {
            validate(4);
        } catch (RuntimeException e) {
            System.out.println("runtime exception");
        } catch (Exception e) {
            System.out.println("exception");
        } catch (Throwable e) {
            System.out.println("throwable");
        }

        validate2(4);
    }

    public static void validate(int length) throws Throwable {
        if (length == 0) {
            throw new Throwable();
        }
        if (length < 3) {
            throw new Exception();
        }

        if (length >= 3) {
            throw new RuntimeException();
        }
    }

    public static void validate2(int length) {
        try {
            validate(length);
        } catch (Throwable e){
            throw new RuntimeException("some reason",e);
        }
    }
}
