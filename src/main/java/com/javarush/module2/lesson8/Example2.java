package com.javarush.module2.lesson8;

public class Example2 {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat.a +" " + cat.b+" "+ cat.c);
    }
}

class Cat {
    public    int a = getSum();// a = (a+b+c)=0
    public  int b = getSum() - a++;// b = (a+b+c)-a=0
    public  final int c = getSum() - a - b++;// c = (a+b+c)-a-b=0

    public int getSum() {
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println("====================");
        return a + b + c;//a=0;b=0;c=0
    }
}
