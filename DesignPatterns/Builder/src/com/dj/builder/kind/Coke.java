package com.dj.builder.kind;

import com.dj.builder.item.ColdDrink;

public class Coke extends ColdDrink {
 
   @Override
   public float price() {
      return 30.0f;
   }
 
   @Override
   public String name() {
      return "Coke";
   }
}