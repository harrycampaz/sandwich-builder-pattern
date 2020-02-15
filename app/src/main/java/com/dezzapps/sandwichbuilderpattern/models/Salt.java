package com.dezzapps.sandwichbuilderpattern.models;

import com.dezzapps.sandwichbuilderpattern.Ingredient;

public class Salt implements Ingredient {
    @Override
    public String description() {
        return "Salt";
    }

    @Override
    public int kcal() {
        return 0;
    }
}
