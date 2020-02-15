package com.dezzapps.sandwichbuilderpattern.models;

public class Bagel extends Bread {
    @Override
    public String description() {
        return "Rosquilla";
    }

    @Override
    public int kcal() {
        return 210;
    }
}
