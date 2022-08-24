package com.dj.builder.meal;

import com.dj.builder.kind.ChickenBurger;
import com.dj.builder.kind.Coke;
import com.dj.builder.kind.Pepsi;
import com.dj.builder.kind.VegBurger;

public class MealBuilder {
 
   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   
 
   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}