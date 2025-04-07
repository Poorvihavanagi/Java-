package com.xworkz.isaRelation;

import com.xworkz.inheritance.Boat;
import com.xworkz.inheritance.Floating;
import com.xworkz.inheritance.WaterTransport;

public class BoatRunner
{
    public static void main(String[] args) {

        Floating floating=new Floating();
        floating.sail();
        floating.anchor();
        floating.loadCargo();
        floating.startEngine();
        floating.stopEngine();

        System.out.println("--------------------------------------------");
        Boat boat=new Floating();
        boat.sail();
        boat.anchor();
        boat.loadCargo();
        boat.startEngine();
        boat.stopEngine();

        System.out.println("--------------------------------------------");
        WaterTransport waterTransport=new WaterTransport();
        waterTransport.steer(waterTransport);
    }
}
