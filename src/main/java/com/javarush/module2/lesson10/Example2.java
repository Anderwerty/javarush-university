package com.javarush.module2.lesson10;

public class Example2 {
    public static void main(String[] args) {
//
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));

        System.out.println("==========================");
        System.out.println(fibonacci2(1));
        System.out.println(fibonacci2(2));
        System.out.println(fibonacci2(3));
        System.out.println(fibonacci2(4));
        System.out.println(fibonacci2(5));
        System.out.println(fibonacci2(6));
        System.out.println(fibonacci2(7));
    }


    public static long fibonacci(int n) {
        int n1 = 1;
        int n2 = 1;
        if (n == 1 || n == 2) {
            return 1;
        }
        int result = 0;

// 1   1   2        3    5    8 ...
//     n1  n2  result
        for (int i = 0; i < n - 2; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }

        return result;
    }

    //fibonacci2(n) = fibonacci2(n-1)+fibonacci2(n-2)
    public static long fibonacci2(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci2(n - 1) + fibonacci2(n - 2);
    }
}
