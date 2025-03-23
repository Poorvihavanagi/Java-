package com.xworkz.classesAsInstanceVariable;

public class Clip
{
    ClipColor color;

    Clip(ClipColor color) {
        this.color = color;
    }
    void hold(){
        System.out.println("Running color in Clip");
    }
}
