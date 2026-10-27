package com.example;

public class Ketchup extends ToppingDecorator {

    public Ketchup(FoodItem item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + Ketchup";
    }

    @Override
    public double getCost() {
        return item.getCost() + 0.25;
    }
}
