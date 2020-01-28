package com.lld.mtb.interfaces;

import com.lld.mtb.abstractClasses.Cinema;
import com.lld.mtb.abstractClasses.Hall;
import com.lld.mtb.abstractClasses.Seat;
import com.lld.mtb.abstractClasses.Show;
import com.lld.mtb.models.Movie;

import java.util.List;

public interface IShowCatalogue {

    List<Cinema> getCinemasByCity(String cityName);
    List<Hall> getHallsByCinema(String cinemaName);
    List<Movie> getMoviesByHall(String hallName);
    List<Movie> getMoviesByCity(String cityName);
    List<Show> getShowsByHall(String hallName);
}
