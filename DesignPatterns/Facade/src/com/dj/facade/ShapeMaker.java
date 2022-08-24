package com.dj.facade;

import com.dj.facade.shape.Circle;
import com.dj.facade.shape.Rectangle;
import com.dj.facade.shape.Shape;
import com.dj.facade.shape.Square;

public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
 
   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }
 
   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
}