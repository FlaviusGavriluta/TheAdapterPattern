package com.codecool.notifications;

import com.codecool.notifications.model.User;
import com.codecool.notifications.notificationsenders.EmailSender;
import com.codecool.notifications.notificationsenders.SmsSender;
import com.codecool.notifications.notificationsenders.ToastNotificationSender;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {

    public static void main(String[] args) {

        List<User> users = generateRandomUsers();

        SmsSender smsSender = new SmsSender();
        EmailSender emailSender = new EmailSender();
        ToastNotificationSender toastNotificationSender = new ToastNotificationSender();

        for (User user : users) {
            smsSender.sendSms(user.phoneNumber(), "Hello!");
            emailSender.sendEmail(user.email(), "Codecool", "Notification", "Hello!");
            toastNotificationSender.sendToastNotification(user.userName(), "Hello!");
        }
    }

    private static List<User> generateRandomUsers() {

        Random random = new Random();

        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Heidi", "Ivan", "Judy"};
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "aol.com"};
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            String name = names[random.nextInt(names.length)];
            String domain = domains[random.nextInt(domains.length)];
            String email = name + "@" + domain;
            String phone = "(" + random.nextInt(1000) + ") " + random.nextInt(1000) + "-" + random.nextInt(10000);

            User user = new User(name, email, phone);
            users.add(user);
        }
        return users;
    }
}
