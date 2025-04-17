package com.xworkz.copies;

import com.xworkz.internal.River;
import com.xworkz.internal.Mountain;
import com.xworkz.brandNew.NatureZone;

public class NatureZoneRunner {
    public static void main(String[] args) {
        River river = new NatureZone();
        river.flow();
        river.provideWater();
        river.supportEcosystem();

        System.out.println("------------------------------");

        Mountain mountain = new NatureZone();
        mountain.provideScenery();
        mountain.supportWildlife();
        mountain.attractClimbers();
    }
}
