package com.xworkz.runner;

import com.xworkz.implement.Rose;
import com.xworkz.internal.Flower;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower = new Rose();
        flower.bloom();
        flower.smell();
        flower.attractBees();
        flower.displayColor();
    }
}
