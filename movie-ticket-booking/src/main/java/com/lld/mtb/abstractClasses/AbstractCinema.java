package com.lld.mtb.abstractClasses;

import com.lld.mtb.interfaces.IShowCatalogue;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class Cinema {

    private String name;
    private String location;

    @Autowired
    private IShowCatalogue showCatalogue;

    public List<Hall> getHalls(String cinemaName, String cityName) {
        return showCatalogue.getHallsByCinema(cityName);
    }
}
