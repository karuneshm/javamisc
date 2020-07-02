package com.karunesh.design.pattern.desingprinciple.builderchallenge;

class Director {
    MealBuilderInterface myBuilder;

    public void construct(MealBuilderInterface builder)
    {
        myBuilder = builder;
        myBuilder.buildBurger();
        myBuilder.buildDrink();
    }
}
