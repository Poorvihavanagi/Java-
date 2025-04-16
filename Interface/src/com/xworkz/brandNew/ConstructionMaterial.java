package com.xworkz.brandNew;

import com.xworkz.internal.Stone;
import com.xworkz.internal.Cement;

public class ConstructionMaterial implements Stone, Cement {

    @Override
    public void breakDown() {
        System.out.println("Breaking down the stone into smaller pieces.");
    }

    @Override
    public void polish() {
        System.out.println("Polishing the stone.");
    }

    @Override
    public void useInConstruction() {
        System.out.println("Using the stone in construction.");
    }

    @Override
    public void mixWithWater() {
        System.out.println("Mixing cement with water.");
    }

    @Override
    public void pour() {
        System.out.println("Pouring the cement mixture.");
    }

    @Override
    public void dry() {
        System.out.println("Allowing the cement to dry.");
    }
}
