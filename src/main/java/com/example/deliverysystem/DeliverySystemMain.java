package com.example.deliverysystem;

import com.example.deliverysystem.notification.DeliveryNotificationService;
import com.example.deliverysystem.notification.NotificationFactory;

public class DeliverySystemMain {
    public static void main(String[] args) {
        DeliveryNotificationService notificationService = NotificationFactory.createNotificationService("EMAIL");
        notificationService.notifyDriver("New delivery request received!");
    }
}
