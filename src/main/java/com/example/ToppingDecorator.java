package com.example;

public abstract class ToppingDecorator implements FoodItem {

    protected FoodItem item;

    public ToppingDecorator(FoodItem item) {
        this.item = item;
    }
}
