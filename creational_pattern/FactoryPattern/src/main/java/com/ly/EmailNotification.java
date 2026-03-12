package com.ly;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("This is the email notification");
    }
}
