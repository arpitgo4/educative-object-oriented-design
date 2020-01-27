package com.lld.mtb.abstractClasses;

import com.lld.mtb.interfaces.IMovieCatalogue;
import com.lld.mtb.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class Account {

    @Autowired
    IMovieCatalogue movieCatalogue;

    public Account register(String username, String password) {
        return null;
    }

    public List<Movie> filterMoviesByTitle(String title) {
        return movieCatalogue.searchByTitle(title);
    }

    public List<Movie> filterMoviesByLanguage(String language) {
        return movieCatalogue.searchByLanguage(language);
    }

    public List<Movie> filterMoviesByGenre(String genre) {
        return movieCatalogue.searchByGenre(genre);
    }

    public List<Movie> filterMoviesByCity(String city) {
        return movieCatalogue.searchByCity(city);
    }

    public List<Movie> filterMoviesByReleaseDate(String releaseDate) {
        return movieCatalogue.searchByReleaseDate(releaseDate);
    }
}