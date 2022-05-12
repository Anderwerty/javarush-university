package com.javarush.modul1.lesson8;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        // n x m
        int m = 3;
        boolean[][] partMassiv = new boolean[2][m]; // i & j
        for (int i = 0; i < partMassiv.length; i++) {
            for (int j = 0; j < m; j++) {
                if (i < j) {
                    partMassiv[i][j] = true;
                }
            }
            System.out.println();
        }

        // print
        for (int i = 0; i < partMassiv.length; i++) {
//            for (int j = 0; j < partMassiv[i].length; j++) {
//                System.out.print(partMassiv[i][j] + " ");
//            }
            System.out.println(Arrays.toString(partMassiv[i]));
        }

        // print with Arrays.toString()

//        System.out.println(Arrays.toString(partMassiv));
    }
}
