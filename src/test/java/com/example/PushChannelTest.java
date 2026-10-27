package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class PushChannelTest {

    @Test
    void testPushChannel() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(output));
            new PushChannel().send("Payment successful");
        } finally {
            System.setOut(original);
        }

        assertTrue(output.toString().contains(
            "PUSH: Payment successful"));
    }
}
