package com.xworkz.runner;

import com.xworkz.implement.Skyscraper;
import com.xworkz.internal.Building;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building=new Skyscraper();
        building.construct();
        building.demolish();
        building.maintain();

        building.clean();
        building.secure();
    }
}
