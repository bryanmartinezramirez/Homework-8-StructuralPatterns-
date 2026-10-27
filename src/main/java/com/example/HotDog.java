package com.example;

public class HotDog implements FoodItem {

    @Override
    public String getDescription() {
        return "Hot Dog";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
