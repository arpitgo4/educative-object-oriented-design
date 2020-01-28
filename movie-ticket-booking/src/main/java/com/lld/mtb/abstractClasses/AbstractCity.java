package com.lld.mtb.abstractClasses;

import com.lld.mtb.interfaces.IShowCatalogue;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class City {

    private String name;
    private String location;

    @Autowired
    private IShowCatalogue showCatalogue;

    public List<Cinema> getCinemasByCity(String cityName) {
        return showCatalogue.getCinemasByCity(cityName);
    }
}
