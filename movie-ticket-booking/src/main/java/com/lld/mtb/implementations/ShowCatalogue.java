package com.lld.mtb.implementations;

import com.lld.mtb.abstractClasses.Cinema;
import com.lld.mtb.abstractClasses.Hall;
import com.lld.mtb.abstractClasses.Seat;
import com.lld.mtb.abstractClasses.Show;
import com.lld.mtb.interfaces.IShowCatalogue;
import com.lld.mtb.models.Movie;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ShowCatalogue implements IShowCatalogue {
    Map<String, List<Cinema>> cinemasByCity;
    Map<String, List<Hall>> hallByCinema;
    Map<String, List<Show>> showsByHall;
    Map<String, List<Movie>> moviesByCity;

    public ShowCatalogue() {

    }

    @Override
    public List<Cinema> getCinemasByCity(String cityName) {
        return cinemasByCity.get(cityName);
    }

    @Override
    public List<Movie> getMoviesByHall(String hallName) {
        List<Movie> movies = new ArrayList<>();
        for (Show show : showsByHall.get(hallName))
            movies.add(show.getMovie());

        return movies;
    }

    @Override
    public List<Hall> getHallsByCinema(String cinemaName) {
        return hallByCinema.get(cinemaName);
    }

    @Override
    public List<Movie> getMoviesByCity(String cityName) {
        return moviesByCity.get(cityName);
    }

    @Override
    public List<Show> getShowsByHall(String hallName) {
        return showsByHall.get(hallName);
    }
}
