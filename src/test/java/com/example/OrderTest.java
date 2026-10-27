package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class OrderTest {

    @Test
    void testEmptyOrder() {
        Order order = new Order();

        assertEquals(0.00, order.getTotal(), 0.001);
    }

    @Test
    void testAddItemsAndTotal() {
        Order order = new Order();

        order.addItem(new Cheese(new Burger()));
        order.addItem(new Ketchup(new Fries()));

        assertEquals(12.75, order.getTotal(), 0.001);
    }

    @Test
    void testPrintReceipt() {
        Order order = new Order();
        order.addItem(new Burger());

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(output));
            order.printReceipt();
        } finally {
            System.setOut(original);
        }

        assertTrue(output.toString().contains("Burger: $8.00"));
        assertTrue(output.toString().contains("Subtotal: $8.00"));
    }
}
