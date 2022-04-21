package com.javarush.lesson26;

public class Example0 {
    public static void main(String[] args) {
//        Pizza pizza = new EmptyPizza();
//        Pizza pizza1 = new Add1Pizza(pizza);
//        Pizza pizza12 = new Add2Pizza(pizza1);
//        Pizza pizza121 = new Add1Pizza(pizza12);
//        Pizza pizza1211 = new Add1Pizza(pizza121);

        //==============================


        Pizza pizza1211 = new Add1Pizza(new Add1Pizza(new Add2Pizza(new Add1Pizza(new EmptyPizza()))));


        pizza1211.makePizza();
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

class Add1Pizza implements Pizza {
    private Pizza pizza;

    Add1Pizza(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public void makePizza() {
        pizza.makePizza();
        System.out.println("Добавить сыр");
    }
}

class Add2Pizza implements Pizza {
    private Pizza pizza;

    Add2Pizza(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public void makePizza() {
        pizza.makePizza();
        System.out.println("Добавить мясо");
    }
}
