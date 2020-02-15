package com.dezzapps.sandwichbuilderpattern.models.ingredient.bread;

public class Baguette extends Bread {
    @Override
    public String description() {
        return "Pan";
    }

    @Override
    public int kcal() {
        return 10;
    }
}

