package com.lld.mtb.abstract;

import com.lld.mtb.model.Movie;
import com.lld.mtb.interface.ISearchable;

public abstract class Account {

    @Autowired
    private ISearchable catalogue;

    public List<Movie> searchMovies() {
        catalogue.
    }

    public void register() {

    }
}