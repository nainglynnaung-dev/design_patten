package com.ly;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("This is the sms notification");
    }
}
