package com.example.deliverysystem;

import com.example.deliverysystem.notification.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestNotificationService {

    @Test
    void testEmailNotification() {
        DeliveryNotificationService emailService = new EmailNotificationService();
        assertDoesNotThrow(() -> emailService.notifyDriver("Test Email Notification"));
    }

    @Test
    void testSMSNotification() {
        DeliveryNotificationService smsService = new SMSNotificationService();
        assertDoesNotThrow(() -> smsService.notifyDriver("Test SMS Notification"));
    }

    @Test
    void testInvalidNotificationType() {
        assertThrows(IllegalArgumentException.class, () -> NotificationFactory.createNotificationService("INVALID"));
    }
}
