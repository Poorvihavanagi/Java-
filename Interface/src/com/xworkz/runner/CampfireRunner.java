package com.xworkz.runner;

import com.xworkz.internal.Campfire;
import com.xworkz.implement.WoodenCampfire;

public class CampfireRunner {
    public static void main(String[] args) {
        Campfire campfire = new WoodenCampfire();
        campfire.ignite();
        campfire.maintainFire();
        campfire.extinguish();

        campfire.gatherWood();
        campfire.lightTorch();
    }
}
