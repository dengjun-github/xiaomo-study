package com.dj.factory.usage;

import com.dj.factory.shape.IShape;

public class FactoryPatternDemo {
 
   public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();
 
      //获取 Circle 的对象，并调用它的 draw 方法
      IShape IShape1 = shapeFactory.getShape("CIRCLE");
 
      //调用 Circle 的 draw 方法
      IShape1.draw();
 
      //获取 Rectangle 的对象，并调用它的 draw 方法
      IShape IShape2 = shapeFactory.getShape("RECTANGLE");
 
      //调用 Rectangle 的 draw 方法
      IShape2.draw();
 
      //获取 Square 的对象，并调用它的 draw 方法
      IShape IShape3 = shapeFactory.getShape("SQUARE");
 
      //调用 Square 的 draw 方法
      IShape3.draw();
   }
}