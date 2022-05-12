package com.javarush.modul1.lesson8;

public class Example9 {
    public static void main(String[] args) {
        System.out.println("hello"); // O(1)

        int n = 10;
        for (int i = 0; i < 2*n; i++) {  // O(n) ---> n --> infinity
            System.out.println(i);
        }
      int m =100; // n, m ----> O(n*m) = O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println();
                System.out.println();
            }
        }
    }
}
