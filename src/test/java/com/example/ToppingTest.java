package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ToppingTest {

    @Test
    void testCheese() {
        FoodItem item = new Cheese(new Burger());

        assertEquals("Burger + Cheese", item.getDescription());
        assertEquals(9.50, item.getCost(), 0.001);
    }

    @Test
    void testKetchup() {
        FoodItem item = new Ketchup(new Fries());

        assertEquals("Fries + Ketchup", item.getDescription());
        assertEquals(3.25, item.getCost(), 0.001);
    }

    @Test
    void testOnions() {
        FoodItem item = new Onions(new Burger());

        assertEquals("Burger + Onions", item.getDescription());
        assertEquals(8.50, item.getCost(), 0.001);
    }

    @Test
    void testMultipleToppings() {
        FoodItem item = new Onions(new Cheese(new Burger()));

        assertEquals(
            "Burger + Cheese + Onions", item.getDescription());

        assertEquals(10.00, item.getCost(), 0.001);
    }
}
