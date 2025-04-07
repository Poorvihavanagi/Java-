package com.xworkz.inheritance;

public class Rectangle extends Shape{
    public void describe(){
        System.out.println("Describe circle");
    }
    public void drawShape(Shape shape){
        if(shape instanceof Rectangle)
        {
            System.out.println("Shape is instance of rectangle");
            Rectangle rectangle=(Rectangle) shape;
            rectangle.describe();
        }
    }
}
