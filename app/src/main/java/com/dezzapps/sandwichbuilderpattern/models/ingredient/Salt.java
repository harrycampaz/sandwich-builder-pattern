package com.dezzapps.sandwichbuilderpattern.models.ingredient;

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
