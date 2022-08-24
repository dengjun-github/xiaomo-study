package com.dj.builder.item;

import com.dj.builder.packing.Bottle;
import com.dj.builder.packing.Packing;

public abstract class ColdDrink implements Item {
 
    @Override
    public Packing packing() {
       return new Bottle();
    }
 
    @Override
    public abstract float price();
}