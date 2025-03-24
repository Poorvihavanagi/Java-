package com.demo.accessspecifiers;

public class Tree
{
    public String type;
    String color;
    private int age;

    public void grow(){
        this.age=2;
        System.out.println("Tree is growing ");
    }

    void provideShade(){
        this.absorbSunlight();
        System.out.println("Tree providing shade");
    }

    private void absorbSunlight(){
        System.out.println("Absorbing sunlight for photosynthesis");
    }
}
