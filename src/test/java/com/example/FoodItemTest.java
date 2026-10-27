package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FoodItemTest {

    @Test
    void testBurger() {
        FoodItem burger = new Burger();

        assertEquals("Burger", burger.getDescription());
        assertEquals(8.00, burger.getCost(), 0.001);
    }

    @Test
    void testFries() {
        FoodItem fries = new Fries();

        assertEquals("Fries", fries.getDescription());
        assertEquals(3.00, fries.getCost(), 0.001);
    }

    @Test
    void testHotDog() {
        FoodItem hotDog = new HotDog();

        assertEquals("Hot Dog", hotDog.getDescription());
        assertEquals(5.00, hotDog.getCost(), 0.001);
    }
}
