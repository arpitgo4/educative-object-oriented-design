package com.lld.mtb.implementations;

import com.lld.mtb.abstractClasses.AbstractSeat;
import com.lld.mtb.abstractClasses.AbstractShow;
import com.lld.mtb.models.Movie;

import java.util.List;

public class Show extends AbstractShow {
    public Show(String entryTime, String exitTime, float price, List<AbstractSeat> seats, String name, Movie movie) {
        super(entryTime, exitTime, price, seats, name, movie);
    }
}
