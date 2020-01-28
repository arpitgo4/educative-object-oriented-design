package com.lld.mtb.abstractClasses;

import com.lld.mtb.interfaces.IShowCatalogue;
import com.lld.mtb.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class Show {
    private String entryTime;
    private String exitTime;
    private float price;
    private List<Seat> seats;
    private String name;

    @Autowired
    private IShowCatalogue showCatalogue;
    private Movie movie;

    public List<Seat> getSeats(String hallName) {
        List<Show> shows = showCatalogue.getShowsByHall(hallName);
        for (Show show : shows)
            if (show.getName().equals(this.name))
                return show.seats;

        return null;
    }

    public String getRunningTime() {
        return movie.getRunningTime();
    }

    public Movie getMovie() {
        return movie;
    }

    public String getName() {
        return this.name;
    }

}
