package com.xworkz.runner;

import com.xworkz.internal.Mountain;
import com.xworkz.implement.Himalaya;

public class MountainRunner {
    public static void main(String[] args) {
        Mountain mountain = new Himalaya();
        mountain.provideScenery();
        mountain.supportWildlife();
        mountain.attractClimbers();
        mountain.provideFreshAir();
        mountain.offerAdventure();
    }
}
