
package com.xworkz.inheritance;

public class Circle extends Shape {
    public void draw() {
        super.draw();
        System.out.println("running draw circle");
    }

    public void area() {
        super.area();
        System.out.println("Running area in circle");
    }
    public void perimeter() {
        super.perimeter();
        System.out.println("Running perimeter in circle");
    }
    public void color() {
        super.color();
        System.out.println("Running color in circle");
    }
    public void resize() {
        super.resize();
        System.out.println("Running resize in circle");
    }
}
