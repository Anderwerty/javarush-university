package com.javarush.module2.lesson6.example4;

import java.util.Comparator;

public class Example4 {
    public static void main(String[] args) {
        User[] users = new User[]{new User(12),
                new User(100),
                new User(31),
                new User(40)};

        Integer[] ints = {1, 2, 3, 4, 510};
        Example4 example4 = new Example4();
        sort(users, (o1, o2) -> o1.getAge() - o2.getAge());
        sort(users, Comparator.comparingInt(User::getAge));
        sort(ints, (o1, o2) -> o1 - o2);
        sort(ints, Example4::compare);

        sort(ints, example4::compareNotStatic);
    }

    public static int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }

    public  int compareNotStatic(Integer a, Integer b) {
        return a - b;
    }

    public static void sort(int[] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j] > items[j + 1]) {
                    int temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                }
            }
        }
    }

    public static <E> void sort(E[] elements, Comparator<E> comparator) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (comparator.compare(elements[j], elements[j + 1]) > 0) {
                    E temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;

                }
            }
        }
    }


}

