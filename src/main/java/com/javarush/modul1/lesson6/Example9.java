package com.javarush.modul1.lesson6;

public class Example9 {
    public static void main(String[] args) {
        int counter = 1;
        while (true){
            if (counter % 7 == 0 && counter % 6 == 0 ) {
                System.out.println("Number: " + counter);
                break;
            }
            System.out.println(counter);
            counter++;
        }
    }
}
