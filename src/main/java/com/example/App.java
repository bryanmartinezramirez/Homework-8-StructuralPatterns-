package com.example;

public class App {

    public static void main(String[] args) {

        System.out.println("=== BRIDGE PATTERN ===");

        // Online
        new OnlinePaymentNotification(
            new EmailChannel(), "Credit Card").notifyPayment(50);

        new OnlinePaymentNotification(
            new SmsChannel(), "PayPal").notifyPayment(30);

        // Cash
        new CashOnDeliveryPayment(
            new EmailChannel()).notifyPayment(20);

        new CashOnDeliveryPayment(
            new SmsChannel()).notifyPayment(25);

        // Bitcoin
        new BitcoinPayment(
            new EmailChannel()).notifyPayment(100);

        new BitcoinPayment(
            new SmsChannel()).notifyPayment(75);
    }
}
