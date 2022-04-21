package com.javarush.lesson4;

public class Example6 {
    public static void main(String[] args) {
        char a = 'r'; // red

        if (a == 'r') {
            System.out.println("Stop!");
        } else {
            System.out.println("Go...");
        }

        //

        if (a == 'r') {
            System.out.println("Stop!");
        }

        if (a == 'g') {
            System.out.println("Go...");
        }

        /////////////////////////////////

        if (a == 'r') {
            System.out.println("Stop!");
        } else if (a == 'y') {
            System.out.println("Wait!");
        }

        if (a == 'r') {
            System.out.println("Stop!");
        } else {
            if (a == 'y') {
                System.out.println("Wait!");
            }
        }
        /////////////////////////////////

        if (a == 'r') {
            System.out.println("Stop!");
        } else if (a == 'y') {
            System.out.println("Wait!");
        } else {
            System.out.println("Go...");
        }

        ///////////////////////////////
        if (a == 'r') {
            System.out.println("Stop!");
        } else if (a == 'y') {
            System.out.println("Wait!");
        } else if (a == 'g') {
            System.out.println("Go...");
        }
    }
}
