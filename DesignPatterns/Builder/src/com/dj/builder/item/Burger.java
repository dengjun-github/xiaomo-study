package com.dj.builder.item;

import com.dj.builder.packing.Packing;
import com.dj.builder.packing.Wrapper;

public abstract class Burger implements Item {
 
   @Override
   public Packing packing() {
      return new Wrapper();
   }
 
   @Override
   public abstract float price();
}