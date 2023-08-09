package com.codecool.notifications.notificationsenders;

public class SmsSender {

    public void sendSms(String toNumber, String message) {
        System.out.println("Sending SMS to " + toNumber + " with message: " + message);
    }

}
