package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {

    @Test
    void testAppRuns() {
        assertDoesNotThrow(() -> App.main(new String[0]));
    }

    @Test
    void testAppOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(output));
            App.main(new String[0]);
        } finally {
            System.setOut(original);
        }

        String result = output.toString();

        assertTrue(result.contains("BRIDGE"));
        assertTrue(result.contains("DECORATOR"));
        assertTrue(result.contains("Bitcoin payment"));
        assertTrue(result.contains("PUSH:"));
        assertTrue(result.contains("Burger + Cheese + Onions"));
        assertTrue(result.contains("Subtotal: $19.75"));
        assertTrue(result.contains("Gold discount"));
    }
}
