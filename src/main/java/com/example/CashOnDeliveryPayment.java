package com.example;

public class CashOnDeliveryPayment extends PaymentNotification {

    public CashOnDeliveryPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyPayment(double amount) {
        String message = String.format(
            "Cash on delivery payment of $%.2f is due on arrival.",
            amount);

        channel.send(message);
    }
}
