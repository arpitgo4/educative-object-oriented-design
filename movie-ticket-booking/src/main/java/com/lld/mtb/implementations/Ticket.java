package com.lld.mtb.implementations;

import com.lld.mtb.abstractClasses.AbstractShow;
import com.lld.mtb.abstractClasses.AbstractTicket;
import com.lld.mtb.interfaces.IShowCatalogue;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Ticket extends AbstractTicket {

    private List<Seat> seats;
    private Show show;
    private float cost;

    @Autowired
    private IShowCatalogue showCatalogue;

    public Ticket(List<Seat> seats, Show show, float cost) {
        this.seats = seats;
        this.show = show;
        this.cost = cost;
    }

    public String getTicketContent() {
        return "";
    }

    public Hall getShowHall() {
        return null;
    }
}
