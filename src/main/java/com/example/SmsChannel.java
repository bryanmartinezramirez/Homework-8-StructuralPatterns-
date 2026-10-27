package com.example;

public class SmsChannel implements NotificationChannel {

    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
