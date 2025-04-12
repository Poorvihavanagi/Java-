package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Blender;

public class BlenderRunner {
    public static void main(String[] args) {
        Blender blender = new Blender("Philips", 750, "Plastic");
        System.out.println(blender);
        int hash = blender.hashCode();
        System.out.println(new Blender("Bajaj", 500, "Steel").hashCode());

        Blender blender1 = new Blender("Philips", 750, "Plastic");
        Blender blender2 = new Blender("Philips", 500, "Steel");

        System.out.println("Checking same location: " + (blender1 == blender2));
        boolean same = blender2.equals(blender1);
        System.out.println("Blender1 is same as Blender2: " + same);

    }
}