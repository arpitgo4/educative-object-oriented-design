package com.lld.mtb.abstractClasses;

import com.lld.mtb.interfaces.IShowCatalogue;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractCinema {

    private String name;
    private String location;

    public AbstractCinema(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Autowired
    private IShowCatalogue showCatalogue;

    public List<AbstractHall> getHalls(String cinemaName, String cityName) {
        return showCatalogue.getHallsByCinema(cityName);
    }
}
