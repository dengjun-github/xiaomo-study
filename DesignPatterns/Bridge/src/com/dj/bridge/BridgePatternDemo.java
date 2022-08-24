package com.dj.bridge;

import com.dj.bridge.circle.Circle;
import com.dj.bridge.circle.Shape;
import com.dj.bridge.draw.GreenCircle;
import com.dj.bridge.draw.RedCircle;

public class BridgePatternDemo {
   public static void main(String[] args) {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
 
      redCircle.draw();
      greenCircle.draw();
   }
}