package com.example;

public class Burger implements FoodItem {

    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public double getCost() {
        return 8.00;
    }
}
