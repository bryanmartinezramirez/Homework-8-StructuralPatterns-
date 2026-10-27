package com.example;

public class OnlinePaymentNotification extends PaymentNotification {

    private String paymentMethod;

    public OnlinePaymentNotification(
            NotificationChannel channel, String paymentMethod) {
        super(channel);
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void notifyPayment(double amount) {
        String message = String.format(
            "Online payment of $%.2f via %s received.",
            amount, paymentMethod);

        channel.send(message);
    }
}
