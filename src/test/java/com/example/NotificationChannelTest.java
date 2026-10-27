package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class NotificationChannelTest {

    @Test
    void testEmailChannel() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(output));

            EmailChannel email = new EmailChannel();
            email.send("Payment successful");

        } finally {
            System.setOut(original);
        }

        assertTrue(output.toString().contains(
            "EMAIL: Payment successful"));
    }

    @Test
    void testSmsChannel() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(output));

            SmsChannel sms = new SmsChannel();
            sms.send("Payment successful");

        } finally {
            System.setOut(original);
        }

        assertTrue(output.toString().contains(
            "SMS: Payment successful"));
    }
}
