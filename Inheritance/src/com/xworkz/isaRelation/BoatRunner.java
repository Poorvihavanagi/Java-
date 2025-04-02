package com.xworkz.isaRelation;

import com.xworkz.inheritance.Boat;
import com.xworkz.inheritance.Floating;

public class BoatRunner
{
    public static void main(String[] args) {

        Floating floating=new Floating();
        floating.sail();
        floating.anchor();
        floating.loadCargo();
        floating.startEngine();
        floating.stopEngine();

       Boat boat=new Floating();
        boat.sail();
        boat.anchor();
        boat.loadCargo();
        boat.startEngine();
        boat.stopEngine();
    }
}
