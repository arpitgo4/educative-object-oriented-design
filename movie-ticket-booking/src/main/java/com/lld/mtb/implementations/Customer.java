package com.lld.mtb.implementations;

import com.lld.mtb.abstractClasses.AbstractTicket;
import com.lld.mtb.abstractClasses.Account;
import com.lld.mtb.interfaces.IPayment;
import org.springframework.beans.factory.annotation.Autowired;

public class Customer extends Account {

    @Autowired
    private IPayment payment;
    private String username;
    private String password;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account login(String username, String password) {
        boolean accessGranted = this.username.equals(username) &&
                                this.password.equals(password);

        if (!accessGranted)
            return null;

        return this;
    }

    public AbstractTicket bookTicket() {
        return null;
    }

    public void pay(int amount) {

    }
}
