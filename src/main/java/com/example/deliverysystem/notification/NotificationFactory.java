package com.example.deliverysystem.notification;

public class NotificationFactory {
    public static DeliveryNotificationService createNotificationService(String type) {
        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailNotificationService();
            case "SMS":
                return new SMSNotificationService();
            default:
                throw new IllegalArgumentException("Unsupported notification type: " + type);
        }
    }
}
