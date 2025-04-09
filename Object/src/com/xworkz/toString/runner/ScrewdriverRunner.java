package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Screwdriver;

public class ScrewdriverRunner {
    public static void main(String[] args) {
        Screwdriver tool = new Screwdriver("Flathead", "Rubber", 15.5);
        System.out.println(tool);
    }
}
