package com.javarush.modul1.lesson_part3;

public class Controller {

    public static void run(){

//        while (true){
//
//        }

        try{
            throw new Exception();
        }catch (Exception e){
            log("error");
        }

    }

    @SuppressWarnings({"java:S106"})
    public static void print(String message){
        System.out.println(message);
    }

    @SuppressWarnings({"java:S106"})
    public static void log(String message){
        System.err.println(message);
    }
}
