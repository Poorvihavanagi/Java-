package com.xworkz.implement;

import com.xworkz.internal.Comb;

public class HairComb implements Comb {
    public void untangleHair() {
        System.out.println("Using the comb to untangle hair.");
    }

    public void cleanComb() {
        System.out.println("Cleaning the comb after use.");
    }

    public void keepInDrawer() {
        System.out.println("Keeping the comb in the drawer.");
    }
    @Override
    public void sanitize() {
        System.out.println("Sanitizing the hair comb with disinfectant.");
    }

    @Override
    public void display() {
        System.out.println("Displaying the comb on the dressing table.");
    }
}
