package com.dezzapps.sandwichbuilderpattern.models.ingredient.bread.decorator;

import com.dezzapps.sandwichbuilderpattern.models.ingredient.bread.Bread;

public abstract class BreadDecoration extends Bread {


    public abstract String getDecoration();

    public abstract int getDecorationKcal();

}
