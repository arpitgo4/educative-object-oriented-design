package com.lld.mtb.interfaces;

import com.lld.mtb.abstractClasses.AbstractCinema;
import com.lld.mtb.abstractClasses.AbstractHall;
import com.lld.mtb.abstractClasses.AbstractShow;
import com.lld.mtb.models.Movie;

import java.util.List;

public interface IShowCatalogue {

    List<AbstractCinema> getCinemasByCity(String cityName);
    List<AbstractHall> getHallsByCinema(String cinemaName);
    List<Movie> getMoviesByHall(String hallName);
    List<Movie> getMoviesByCity(String cityName);
    List<AbstractShow> getShowsByHall(String hallName);
}
