package com.lld.mtb.implementations;

import com.lld.mtb.abstractClasses.AbstractNotification;
import com.lld.mtb.abstractClasses.AbstractTicket;

import java.util.List;

public class Booking {

    private String bookingStatus;
    private AbstractNotification notification;
    private Customer customer;
    private List<AbstractTicket> tickets;
    private String id;
    private Coupon coupon;

    public Booking(String bookingStatus, AbstractNotification notification, Customer customer, List<AbstractTicket> tickets, String id, Coupon coupon) {
        this.bookingStatus = bookingStatus;
        this.notification = notification;
        this.customer = customer;
        this.tickets = tickets;
        this.id = id;
        this.coupon = coupon;
    }

    public void notifyBookingStatus() {
        notification.send(bookingStatus);
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getId() {
        return id;
    }
}
