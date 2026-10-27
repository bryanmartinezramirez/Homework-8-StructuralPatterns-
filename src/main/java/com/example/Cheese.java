package com.example;

public class Cheese extends ToppingDecorator {

    public Cheese(FoodItem item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + Cheese";
    }

    @Override
    public double getCost() {
        return item.getCost() + 1.50;
    }
}
