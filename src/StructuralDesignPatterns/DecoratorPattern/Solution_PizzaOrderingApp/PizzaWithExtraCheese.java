package StructuralDesignPatterns.DecoratorPattern.Solution_PizzaOrderingApp;

import java.util.ArrayList;

public class PizzaWithExtraCheese implements Pizza {

    Pizza pizza;
    ArrayList toppings;

    public PizzaWithExtraCheese(Pizza pizza) {
        this.pizza = pizza;
        toppings = pizza.getToppings();
        toppings.add("Extra Cheese");

    }
    @Override
    public ArrayList getToppings() {
        return toppings;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }
}
