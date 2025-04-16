package com.xworkz.runner;

import com.xworkz.implement.WoodenSofa;
import com.xworkz.internal.Sofa;

public class SofaRunner {
    public static void main(String[] args) {
        Sofa sofa = new WoodenSofa();
        sofa.sit();
        sofa.fold();
        sofa.move();
    }
}
