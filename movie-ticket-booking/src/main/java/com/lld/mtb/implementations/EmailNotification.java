package com.lld.mtb.implementations;

import com.lld.mtb.abstractClasses.Notification;

public class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Email with message: " + message + " sent!");
    }
}
