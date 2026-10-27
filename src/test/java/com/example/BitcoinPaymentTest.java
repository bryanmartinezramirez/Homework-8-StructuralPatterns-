package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BitcoinPaymentTest {

    @Test
    void testBitcoinEmail() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(output));
            new BitcoinPayment(
                new EmailChannel()).notifyPayment(100);
        } finally {
            System.setOut(original);
        }

        assertTrue(output.toString().contains(
            "EMAIL: Bitcoin payment of $100.00 received."));
    }

    @Test
    void testBitcoinSms() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(output));
            new BitcoinPayment(
                new SmsChannel()).notifyPayment(75);
        } finally {
            System.setOut(original);
        }

        assertTrue(output.toString().contains(
            "SMS: Bitcoin payment of $75.00 received."));
    }
}
