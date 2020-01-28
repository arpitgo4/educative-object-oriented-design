package com.lld.mtb.implementations;

import com.lld.mtb.abstractClasses.Notification;

public class SMSNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS with message: " + message + " sent!");
    }
}
