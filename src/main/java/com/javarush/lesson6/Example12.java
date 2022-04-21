package com.javarush.lesson6;

public class Example12 {
    public static void main(String[] args) {
        int n = 4;
        while (n > 0) {

            int m = 5;

            while (m > 0) {
                System.out.print("*"); //***..*
                m--;
            }
            System.out.println();
            n--;
        }
    }
}
//***..*
//***..*
