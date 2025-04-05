package com.xworkz.inheritance;

public class Circle extends Shape {

    @Override
    public void draw() {
        super.draw();
        System.out.println("Running draw in Circle");
    }

    @Override
    public void area() {
        super.area();
        System.out.println("Running area in Circle");
    }

    @Override
    public void perimeter() {
        super.perimeter();
        System.out.println("Running perimeter in Circle");
    }

    @Override
    public void color() {
        super.color();
        System.out.println("Running color in Circle");
    }

    @Override
    public void resize() {
        super.resize();
        System.out.println("Running resize in Circle");
    }
}
