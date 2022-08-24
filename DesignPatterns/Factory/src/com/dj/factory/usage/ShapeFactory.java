package com.dj.factory.usage;

import com.dj.factory.shape.Circle;
import com.dj.factory.shape.Rectangle;
import com.dj.factory.shape.IShape;
import com.dj.factory.shape.Square;

public class ShapeFactory {
   
   /**
    * 一、一句话概括工厂模式
    *
    *  简单工厂：一个工厂类，一个产品抽象类。
    *  工厂方法：多个工厂类，一个产品抽象类。
    *  抽象工厂：多个工厂类，多个产品抽象类。
    * 二、生活中的工厂模式
    *
    *  简单工厂类：一个麦当劳店，可以生产多种汉堡。
    *  工厂方法类：一个麦当劳店，可以生产多种汉堡。一个肯德基店，也可以生产多种汉堡。
    *  抽象工厂类：百胜餐饮集团下有肯德基和百事公司，肯德基生产汉堡，百事公司生成百事可乐。
    */
    
   //使用 getShape 方法获取形状类型的对象
   public IShape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
}