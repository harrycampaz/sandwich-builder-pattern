package com.dezzapps.sandwichbuilderpattern.models.ingredient.filling;

public class Cheese extends Filling {
    @Override
    public String description() {
        return "Queso";
    }

    @Override
    public int kcal() {
        return 23;
    }
}
