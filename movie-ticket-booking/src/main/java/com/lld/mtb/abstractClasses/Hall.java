package com.lld.mtb.abstractClasses;

import com.lld.mtb.interfaces.IShowCatalogue;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Hall {

    private String name;
    private String id;
    private String number;

    @Autowired
    private IShowCatalogue showCatalogue;

    public Show getCurrentShow() {
        return null;
    }
}
