package com.javarush.lesson10;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        String password = "Password_new";

        if (password.length() >= 5 && password.length() <= 12) {
            System.out.println("valid password");
        } else {
            System.out.println("invalid password");
        }

        if (password.isEmpty()) { //password.length() == 0
            System.out.println("Password is empty");
        }

//        if(password.isBlank()){
//            System.out.println("Password is blank");
//        }

        char[] chars = password.toCharArray();
        System.out.println(Arrays.toString(chars));

        String src = "01234567";
        System.out.println(getCharByIndex(src, 1));
        System.out.println(src.charAt(1));
    }

    public static char getCharByIndex(String src, int index){
        char[] chars = src.toCharArray();

        return chars[index];
    }

}
