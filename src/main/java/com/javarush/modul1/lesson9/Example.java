package com.javarush.modul1.lesson9;

import java.util.Scanner;

class Example {
     public static char[][] array;

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int number = Integer.parseInt(sc.nextLine());
         array = new char[number][];

         int massivLength = number;
         for (int i = 0; i < array.length; i++) {
             array[i] = new char[massivLength++];
         }

         int arlg = array.length - 1;
         int forEmpty;
         for (int i = 0; i < array.length; i++) {
             for (forEmpty = 0; forEmpty < arlg; forEmpty++) {
                 array[i][forEmpty] = ' ';
             }
             arlg--;

             for (int j = forEmpty; j < array[i].length; j++) {
                 array[i][j] = '#';
             }
         }
         for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array[i].length; j++) {
                 System.out.print(array[i][j]);
             }
             System.out.println();
         }
     }
}
