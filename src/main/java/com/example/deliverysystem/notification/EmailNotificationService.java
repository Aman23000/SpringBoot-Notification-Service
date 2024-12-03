package com.example.deliverysystem.notification;

public class EmailNotificationService implements DeliveryNotificationService {
    @Override
    public void notifyDriver(String message) {
        System.out.println("Email Notification: " + message);
    }
}
