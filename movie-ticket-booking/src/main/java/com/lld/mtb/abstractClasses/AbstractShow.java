package com.lld.mtb.abstractClasses;

import com.lld.mtb.interfaces.IShowCatalogue;
import com.lld.mtb.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractShow {
    private String entryTime;
    private String exitTime;
    private float price;
    private List<AbstractSeat> seats;
    private String name;
    private Movie movie;

    public AbstractShow(String entryTime, String exitTime, float price, List<AbstractSeat> seats, String name, Movie movie) {
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.price = price;
        this.seats = seats;
        this.name = name;
        this.movie = movie;
    }

    @Autowired
    private IShowCatalogue showCatalogue;

    public List<AbstractSeat> getSeats(String hallName) {
        List<AbstractShow> shows = showCatalogue.getShowsByHall(hallName);
        for (AbstractShow show : shows)
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
