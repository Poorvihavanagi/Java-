package com.xworkz.brandNew;

import com.xworkz.internal.Comb;
import com.xworkz.internal.Mirror;

public class GroomingKit implements Comb, Mirror {

    @Override
    public void untangleHair() {
        System.out.println("Using the comb to untangle hair.");
    }

    @Override
    public void cleanComb() {
        System.out.println("Cleaning the comb.");
    }

    @Override
    public void keepInDrawer() {
        System.out.println("Storing the comb in the drawer.");
    }

    @Override
    public void reflect() {
        System.out.println("Mirror is reflecting the image.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the mirror surface.");
    }

    @Override
    public void hangOnWall() {
        System.out.println("Hanging the mirror on the wall.");
    }
}
