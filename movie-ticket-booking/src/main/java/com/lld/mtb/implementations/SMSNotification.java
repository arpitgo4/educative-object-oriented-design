package com.lld.mtb.implementations;

import com.lld.mtb.abstractClasses.AbstractNotification;

public class SMSNotification extends AbstractNotification {
    @Override
    public void send(String message) {
        System.out.println("SMS with message: " + message + " sent!");
    }
}
