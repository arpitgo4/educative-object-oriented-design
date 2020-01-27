package com.lld.mtb.interfaces;

import com.lld.mtb.models.Movie;

import java.util.List;

public interface IMovieCatalogue {

    public List<Movie> searchByTitle(String title);
    public List<Movie> searchByLanguage(String language);
    public List<Movie> searchByGenre(String genre);
    public List<Movie> searchByCity(String city);
    public List<Movie> searchByReleaseDate(String releaseDate);
}
