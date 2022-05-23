package com.javarush.module2.lesson4;

public class Example2 {
    public static void main(String[] args) {
        SortStrategy sortStrategy = new VeryLazySortStrategy();
        Controller controller = new Controller(sortStrategy);
        controller.run(new int[]{1, 3, 4});
    }
}
