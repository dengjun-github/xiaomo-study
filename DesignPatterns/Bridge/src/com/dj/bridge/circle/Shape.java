package com.dj.bridge.circle;

import com.dj.bridge.draw.DrawAPI;

public abstract class Shape {
   protected DrawAPI drawAPI;
   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();  
}