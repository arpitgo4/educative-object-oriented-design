package com.lld.mtb.implementations;

import com.lld.mtb.abstractClasses.AbstractCinema;
import com.lld.mtb.abstractClasses.AbstractHall;
import com.lld.mtb.abstractClasses.AbstractShow;
import com.lld.mtb.interfaces.IShowCatalogue;
import com.lld.mtb.models.Movie;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ShowCatalogue implements IShowCatalogue {
    Map<String, List<AbstractCinema>> cinemasByCity;
    Map<String, List<AbstractHall>> hallByCinema;
    Map<String, List<AbstractShow>> showsByHall;
    Map<String, List<Movie>> moviesByCity;

    public ShowCatalogue() {

    }

    @Override
    public List<AbstractCinema> getCinemasByCity(String cityName) {
        return cinemasByCity.get(cityName);
    }

    @Override
    public List<Movie> getMoviesByHall(String hallName) {
        List<Movie> movies = new ArrayList<>();
        for (AbstractShow show : showsByHall.get(hallName))
            movies.add(show.getMovie());

        return movies;
    }

    @Override
    public List<AbstractHall> getHallsByCinema(String cinemaName) {
        return hallByCinema.get(cinemaName);
    }

    @Override
    public List<Movie> getMoviesByCity(String cityName) {
        return moviesByCity.get(cityName);
    }

    @Override
    public List<AbstractShow> getShowsByHall(String hallName) {
        return showsByHall.get(hallName);
    }
}
