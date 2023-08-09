package com.codecool.notifications.notificationsenders;

public class EmailSender {

    public void sendEmail(String toEmail, String fromEmail, String subject, String body) {
        System.out.println("Sending email to " + toEmail + " from " + fromEmail + " with subject " + subject + ". Message: " + body);
    }

}
