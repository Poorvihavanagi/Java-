package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Screwdriver;

public class ScrewdriverRunner {
    public static void main(String[] args) {
        Screwdriver tool = new Screwdriver("Flathead", "Rubber", 15.5);
        System.out.println(tool);

        int hash = tool.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(tool));
    }
}
