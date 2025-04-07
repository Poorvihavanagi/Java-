package com.xworkz.isaRelation;

import com.xworkz.inheritance.Building;
import com.xworkz.inheritance.Home;
import com.xworkz.inheritance.Pg;

public class BuildingRunner
{
    public static void main(String[] args) {
        Home home=new Home();
        home.construct();
        home.paint();
        home.openDoors();
        home.closeWindows();
        home.provideElectricity();

        System.out.println("----------------------------------------------------------------");
        Building building=new Home();
        building.construct();
        building.paint();
        building.openDoors();
        building.closeWindows();
        building.provideElectricity();

        System.out.println("----------------------------------------------------------------");
        Pg pg=new Pg();
        pg.payRent(pg);
    }
}
