package com.javarush.lesson8;

public class Example4 {
    public static void main(String[] args) {
        int[] arr0 = {31, 28, 31};
        int[] arr1 = {30, 31, 30};
        int[] arr2 = {31, 31, 30};
        int[] arr3 = {31, 30};
//        int [] arr4 = null;
        int[][] months = {arr0, arr1, arr2, arr3};
        int[][] months1 = {
                {31, 28, 31, 30, 25, 23, 12, 23, 12},
                arr1,
                arr2,
                arr3,
        };
        ;
        ;

        System.out.println(months.length);
        System.out.println(months1.length);
    }
}
