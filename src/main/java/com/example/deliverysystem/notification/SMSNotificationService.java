package com.example.deliverysystem.notification;

public class SMSNotificationService implements DeliveryNotificationService {
    @Override
    public void notifyDriver(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
