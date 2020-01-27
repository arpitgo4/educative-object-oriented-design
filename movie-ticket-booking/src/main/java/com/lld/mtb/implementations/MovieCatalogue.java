package com.lld.mtb.implementations;

import com.lld.mtb.interfaces.IMovieCatalogue;
import com.lld.mtb.models.Movie;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MovieCatalogue implements IMovieCatalogue {
    Map<String, List<Movie>> moviesByTitle;
    Map<String, List<Movie>> moviesByLanguage;
    Map<String, List<Movie>> moviesByGenre;
    Map<String, List<Movie>> moviesByCity;
    Map<String, List<Movie>> moviesByReleaseDate;

    public MovieCatalogue(List<Movie> movies) {
        moviesByTitle = new HashMap<>();
        moviesByLanguage = new HashMap<>();
        moviesByGenre = new HashMap<>();
        moviesByCity = new HashMap<>();
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

            // TODO: implement for city
            /*if (moviesByTitle.get(movie.getTitle()) == null)
                moviesByTitle.put(movie.getTitle(), new ArrayList<Movie>());
            moviesByTitle.get(movie.getTitle()).add(movie);*/

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
        return null;
    }

    @Override
    public List<Movie> searchByReleaseDate(String releaseDate) {
        return moviesByReleaseDate.get(releaseDate);
    }
}