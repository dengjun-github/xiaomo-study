package com.dj.factory.shape;

public class Circle implements IShape {
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}