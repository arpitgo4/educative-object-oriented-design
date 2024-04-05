package com.lld.mtb.abstractClasses;

import com.lld.mtb.interfaces.IShowCatalogue;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractHall {

    private String name;
    private String id;
    private String number;

    @Autowired
    private IShowCatalogue showCatalogue;

    public AbstractHall(String name, String id, String number) {
        this.name = name;
        this.id = id;
        this.number = number;
    }

    public AbstractShow getCurrentShow() {
        return null;
    }

    public List<AbstractShow> getShows() {
        return showCatalogue.getShowsByHall(this.name);
    }
}
