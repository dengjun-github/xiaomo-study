package com.dj.builder.item;

import com.dj.builder.packing.Packing;

public interface Item {
   public String name();
   public Packing packing();
   public float price();    
}