package com.javarush.module3.lesson16.decorator;

public class Example {
    public static void main(String[] args) {
//        Pizza emptyPizza = new EmptyPizza();
//        Pizza pizzaWithCheese = new PizzaWithCheese(emptyPizza);
//        Pizza pizzaWithCheeseAndMeat = new PizzaWithMeat(pizzaWithCheese);
//        PizzaWithCheese pizzaWithCheeseAndMeatAndCheese = new PizzaWithCheese(pizzaWithCheeseAndMeat);
//        pizzaWithCheeseAndMeatAndCheese.makePizza();

//        ===================================

        new PizzaWithCheese(new PizzaWithMeat(new PizzaWithCheese(new EmptyPizza()))).makePizza();
    }
}

interface Pizza {

    void makePizza();
}

class EmptyPizza implements Pizza {
    @Override
    public void makePizza() {
        System.out.println("empty pizza");
    }
}

class PizzaWithMeat implements Pizza {
    private final Pizza pizza;

    PizzaWithMeat(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void makePizza() {
        pizza.makePizza();
        System.out.println("Add meat");
    }
}

class PizzaWithCheese implements Pizza {

    private final Pizza pizza;

    PizzaWithCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void makePizza() {
        pizza.makePizza();
        System.out.println("Add cheese");
    }
}
