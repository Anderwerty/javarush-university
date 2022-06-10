package com.javarush.module2.lesson10;

public class Example1 {
    public static void main(String[] args) {
        int n = -5;

        long result = factorial(n);
        System.out.println(result);
    }

    //n!=1*2*.....*(n-1)*n
    //(n-1)! = 1*2*.....*(n-1)
    //n!=(n-1)!*n
    //0!= 1

    //5!=4!*5=3!*4*5=2!*3*4*5=1!*2*3*4*5=0!*1*2*3*4*5=1*2*3*4*5
    //factorial(5)=factorial(4)*5=factorial(3)*4*5=
    //factorial(2)*3*4*5=factorial(1)*2*3*4*5=
    //factorial(0)*1*2*3*4*5=1*2*3*4*5
    //O(n)
    private static long factorial(int n) {
        return n == 0 ? 1 : factorial(n - 1) * n;
    }

    private static long factorialLoop(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
