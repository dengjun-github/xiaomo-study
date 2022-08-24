package com.dj.prototype;

import com.dj.prototype.shape.Shape;

public class PrototypePatternDemo {
   public static void main(String[] args) {
      ShapeCache.loadCache();
 
      Shape clonedShape = (Shape) ShapeCache.getShape("1");
      System.out.println("Shape : " + clonedShape.getType());
      System.out.println("clonedShape = " + clonedShape);
   
      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
      System.out.println("Shape : " + clonedShape2.getType());
      System.out.println("clonedShape2 = " + clonedShape2);
 
      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
      System.out.println("Shape : " + clonedShape3.getType());
      System.out.println("clonedShape3 = " + clonedShape3);
   
   }
}