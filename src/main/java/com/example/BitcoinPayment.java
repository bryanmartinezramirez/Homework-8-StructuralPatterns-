package com.example;

public class BitcoinPayment extends PaymentNotification {

    public BitcoinPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyPayment(double amount) {
        String message = String.format(
            "Bitcoin payment of $%.2f received.", amount);

        channel.send(message);
    }
}
