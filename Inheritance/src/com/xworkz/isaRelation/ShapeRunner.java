
package com.xworkz.isaRelation;

import com.xworkz.inheritance.Shape;
import com.xworkz.inheritance.Circle;

public class ShapeRunner {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.area();
        circle.perimeter();
        circle.color();
        circle.resize();
        System.out.println("----------------------------------------------------------------");
        Shape shape = new Circle();
        shape.draw();
        shape.area();
        shape.perimeter();
        shape.color();
        shape.resize();
    }
}
