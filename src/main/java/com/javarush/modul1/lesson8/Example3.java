package com.javarush.modul1.lesson8;

public class Example3 {
    public static void main(String[] args) {
        int m = 3;
        //null
        boolean[][] partMassiv = new boolean[2][]; // i & j
        for (int i = 0; i < partMassiv.length; i++) {
            for (int j = 0; j < partMassiv[i].length; j++) {
                System.out.println(partMassiv[i][j]);
            }
            System.out.println();
        }
        int[] arr0 = {31, 28, 31};
        int[] arr1 = {30, 31, 30};
        int[] arr2 = {31, 31, 30};
        int[] arr3 = {31, 30};
//        int [] arr4 = null;
        int[][] months = {arr0, arr1, arr2, arr3, }; // 4 x 3

        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < months[i].length; j++) {
                System.out.println(months[i][j] +" ");
            }
            System.out.println();
        }
    }
}
