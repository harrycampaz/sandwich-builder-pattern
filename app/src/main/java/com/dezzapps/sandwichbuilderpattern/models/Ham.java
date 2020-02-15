package com.dezzapps.sandwichbuilderpattern.models;

public class Ham extends Filling {
    @Override
    public String description() {
        return "Jamon";
    }

    @Override
    public int kcal() {
        return 12;
    }
}

