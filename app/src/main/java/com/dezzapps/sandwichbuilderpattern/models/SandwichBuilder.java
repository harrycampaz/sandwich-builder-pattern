package com.dezzapps.sandwichbuilderpattern.models;

import com.dezzapps.sandwichbuilderpattern.Ingredient;

public class SandwichBuilder {


    public Sandwich build (Sandwich sandwich, Ingredient ingredient){
        sandwich.addIngredient(ingredient);
        return  sandwich;
    }


}
