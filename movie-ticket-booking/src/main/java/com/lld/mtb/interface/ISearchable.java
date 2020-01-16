package com.lld.mtb.interface;

import com.lld.mtb.model.Movie;

public interface ISearchable {
    public List<Movie> searchMovieByTitle();
    public List<Movie> searchMovieByLanguage();
    public List<Movie> searchMovieByGenre();
    public List<Movie> searchMovieByReleaseDate();
    public List<Movie> searchMovieByCity();
}