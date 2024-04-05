package com.lld.mtb.implementations;

import com.lld.mtb.abstractClasses.AbstractNotification;

public class EmailNotification extends AbstractNotification {
    @Override
    public void send(String message) {
        System.out.println("Email with message: " + message + " sent!");
    }
}
