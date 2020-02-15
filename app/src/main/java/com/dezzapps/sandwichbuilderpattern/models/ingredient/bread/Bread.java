package com.dezzapps.sandwichbuilderpattern.models.ingredient.bread;

import com.dezzapps.sandwichbuilderpattern.models.ingredient.Ingredient;

public abstract class Bread implements Ingredient {

    String decoration;
    int decorationkCal;

    public String getDecoration() {
        return decoration;
    }

    public int getDecorationkCal() {
        return decorationkCal;
    }
}

