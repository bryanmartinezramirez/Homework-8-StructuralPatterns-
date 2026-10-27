package com.example;

public class Onions extends ToppingDecorator {

    public Onions(FoodItem item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + Onions";
    }

    @Override
    public double getCost() {
        return item.getCost() + 0.50;
    }
}
