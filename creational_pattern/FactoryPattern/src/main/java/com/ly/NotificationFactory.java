package com.ly;

public class NotificationFactory {

    public Notification createNotification(String channel){
        if (channel==null || channel.isEmpty()){
            return null;
        }

        return switch (channel.toUpperCase()){
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SmsNotification();
            default -> throw new IllegalArgumentException("Invalid channel");
        };
    }
}
