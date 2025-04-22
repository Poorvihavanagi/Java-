package com.xworkz.practice.runner;

import com.xworkz.practice.external.CruiseShip;
import com.xworkz.practice.internal.CarnivalCruiseImpl;
import com.xworkz.practice.internal.VoyageManager;

public class VoyageManagerRunner {
    public static void main(String[] args) {
        VoyageManager voyageManager=new CarnivalCruiseImpl();
        CruiseShip cruiseShip=new CruiseShip(voyageManager);
        cruiseShip.planExcursion();
    }
}
