package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Screwdriver;

public class ScrewdriverRunner {
    public static void main(String[] args) {
        Screwdriver tool = new Screwdriver("Flathead", "Rubber", 15.5);
        System.out.println(tool);

        int hash = tool.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(tool));

        Screwdriver tool1 = new Screwdriver("Phillips", "Wood", 20.0);
        Screwdriver tool2 = new Screwdriver("Flathead", "Rubber", 15.5);

        System.out.println("Checking same location: " + (tool1 == tool2));
        boolean same = tool1.equals(tool2);
        System.out.println("Tool1 is same as Tool2: " + same);


    }
}
