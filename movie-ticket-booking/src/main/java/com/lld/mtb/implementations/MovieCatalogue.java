package com.lld.mtb.implementations;

import com.lld.mtb.interfaces.IMovieCatalogue;
import com.lld.mtb.interfaces.IShowCatalogue;
import com.lld.mtb.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MovieCatalogue implements IMovieCatalogue {
    private Map<String, List<Movie>> moviesByTitle;
    private Map<String, List<Movie>> moviesByLanguage;
    private Map<String, List<Movie>> moviesByGenre;
    private Map<String, List<Movie>> moviesByReleaseDate;

    @Autowired
    private IShowCatalogue showCatalogue;

    public MovieCatalogue(List<Movie> movies) {
        moviesByTitle = new HashMap<>();
        moviesByLanguage = new HashMap<>();
        moviesByGenre = new HashMap<>();
        moviesByReleaseDate = new HashMap<>();

        for (Movie movie : movies) {
            if (moviesByTitle.get(movie.getTitle()) == null)
                moviesByTitle.put(movie.getTitle(), new ArrayList<Movie>());
            moviesByTitle.get(movie.getTitle()).add(movie);

            if (moviesByLanguage.get(movie.getLanguage()) == null)
                moviesByLanguage.put(movie.getLanguage(), new ArrayList<Movie>());
            moviesByLanguage.get(movie.getLanguage()).add(movie);

            if (moviesByGenre.get(movie.getGenre()) == null)
                moviesByGenre.put(movie.getGenre(), new ArrayList<Movie>());
            moviesByGenre.get(movie.getGenre()).add(movie);

            if (moviesByReleaseDate.get(movie.getReleaseDate()) == null)
                moviesByReleaseDate.put(movie.getReleaseDate(), new ArrayList<Movie>());
            moviesByReleaseDate.get(movie.getReleaseDate()).add(movie);
        }
    }

    @Override
    public List<Movie> searchByTitle(String title) {
        return moviesByTitle.get(title);
    }

    @Override
    public List<Movie> searchByLanguage(String language) {
        return moviesByLanguage.get(language);
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        return moviesByGenre.get(genre);
    }

    @Override
    public List<Movie> searchByCity(String city) {
        return showCatalogue.getMoviesByCity(city);
    }

    @Override
    public List<Movie> searchByReleaseDate(String releaseDate) {
        return moviesByReleaseDate.get(releaseDate);
    }
}