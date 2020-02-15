package com.dezzapps.sandwichbuilderpattern.models.ingredient.bread.decorator;

import com.dezzapps.sandwichbuilderpattern.models.ingredient.bread.Bread;

public class Toasted extends BreadDecoration {

    private Bread bread;

    public Toasted(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDecoration() {
        return null;
    }

    @Override
    public int getDecorationKcal() {
        return 0;
    }

    @Override
    public String description() {
        return "Tostado";
    }

    @Override
    public int kcal() {
        return 0;
    }
}
