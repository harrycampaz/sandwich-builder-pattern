package com.dezzapps.sandwichbuilderpattern.models;

import com.dezzapps.sandwichbuilderpattern.Ingredient;

public class Toasted extends Bread {
    @Override
    public String description() {
        return " Tostado";
    }

    @Override
    public int kcal() {
        return 10;
    }
}
