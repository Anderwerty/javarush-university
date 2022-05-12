package com.javarush.modul1.lesson10;

public class Example9 {
    public static void main(String[] args) {
        String email1 = "Andrii_Shylin@javarush.com";
        String email2 = "andrii_shylin@javarush.com";

        System.out.println(email1.equalsIgnoreCase(email2));


        String line1 ="ab";
        String line2 ="aa";

        System.out.println(line1.compareTo(line2));
        System.out.println(line2.compareTo(line1));

        int [] arr ={};

        if(arr[0]>arr[1]){}

        if(line1.compareTo(line2)>0){}

        String line3 ="https....&security=token";
        System.out.println(line3.startsWith("http"));
        System.out.println(line3.startsWith("https"));
        line3.endsWith("");

        if(line3.startsWith("https")){

        } if(line3.startsWith("http")){

        } else {

        }
    }
}
