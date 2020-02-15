package com.dezzapps.sandwichbuilderpattern.models;

import com.dezzapps.sandwichbuilderpattern.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private List<Ingredient> ingredients = new ArrayList<Ingredient>();

    public void addIngredient(Ingredient i) {
        ingredients.add(i);

    }

    public String getSandwich(){
        StringBuilder builder = new StringBuilder();

        for (Ingredient i: ingredients){
            builder.append(i.description()).append(" ");
        }

        return builder.toString();

    }
    public int getKcal(){
        int kcal = 0;

        for (Ingredient i: ingredients){
            kcal += i.kcal();
        }

        return  kcal;
    }


}
