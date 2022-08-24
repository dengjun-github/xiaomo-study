package com.dj.decorator.decorator;

import com.dj.decorator.shape.Shape;

public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;
 
   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }
 
   @Override
   public void draw(){
      decoratedShape.draw();
   }  
}