package com.example;

public class App {

    public static void main(String[] args) {

        System.out.println("=== BRIDGE PATTERN ===");

        new OnlinePaymentNotification(
            new EmailChannel(), "Credit Card").notifyPayment(50);

        new OnlinePaymentNotification(
            new SmsChannel(), "PayPal").notifyPayment(30);

        new CashOnDeliveryPayment(
            new EmailChannel()).notifyPayment(20);

        new CashOnDeliveryPayment(
            new SmsChannel()).notifyPayment(25);
    }
}
