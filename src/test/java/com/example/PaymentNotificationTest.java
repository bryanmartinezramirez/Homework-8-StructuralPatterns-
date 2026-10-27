package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class PaymentNotificationTest {

    private String capture(Runnable action) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(output));
            action.run();
        } finally {
            System.setOut(original);
        }

        return output.toString();
    }

    @Test
    void testCreditCardPayment() {
        String result = capture(() ->
            new OnlinePaymentNotification(
                new EmailChannel(), "Credit Card").notifyPayment(50));

        assertTrue(result.contains(
            "EMAIL: Online payment of $50.00 via Credit Card received."));
    }

    @Test
    void testPayPalPayment() {
        String result = capture(() ->
            new OnlinePaymentNotification(
                new SmsChannel(), "PayPal").notifyPayment(30));

        assertTrue(result.contains(
            "SMS: Online payment of $30.00 via PayPal received."));
    }

    @Test
    void testCashPayment() {
        String result = capture(() ->
            new CashOnDeliveryPayment(
                new EmailChannel()).notifyPayment(20));

        assertTrue(result.contains(
            "EMAIL: Cash on delivery payment of $20.00 is due on arrival."));
    }
}
