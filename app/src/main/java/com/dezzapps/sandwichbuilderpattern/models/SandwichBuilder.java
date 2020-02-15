package com.dezzapps.sandwichbuilderpattern.models;

import com.dezzapps.sandwichbuilderpattern.models.ingredient.Ingredient;

public class SandwichBuilder {


    public Sandwich build (Sandwich sandwich, Ingredient ingredient){
        sandwich.addIngredient(ingredient);
        return  sandwich;
    }


}
