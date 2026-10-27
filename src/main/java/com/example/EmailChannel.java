package com.example;

public class EmailChannel implements NotificationChannel {

    @Override
    public void send(String message) {
        System.out.println("EMAIL: " + message);
    }
}
