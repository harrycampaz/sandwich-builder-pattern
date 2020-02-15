package com.dezzapps.sandwichbuilderpattern.models.ingredient.bread;

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
