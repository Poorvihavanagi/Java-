package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Blender;

public class BlenderRunner {
    public static void main(String[] args) {
        Blender blender = new Blender("Philips", 750, "Plastic");
        System.out.println(blender);
    }
}