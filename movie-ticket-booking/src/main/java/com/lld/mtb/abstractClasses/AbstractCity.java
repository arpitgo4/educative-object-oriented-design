package com.lld.mtb.abstractClasses;

import com.lld.mtb.interfaces.IShowCatalogue;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractCity {

    private String name;
    private String location;

    public AbstractCity(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Autowired
    private IShowCatalogue showCatalogue;

    public List<AbstractCinema> getCinemasByCity(String cityName) {
        return showCatalogue.getCinemasByCity(cityName);
    }
}
