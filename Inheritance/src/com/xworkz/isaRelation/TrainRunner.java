package com.xworkz.isaRelation;

import com.xworkz.inheritance.Train;
import com.xworkz.inheritance.Vehicle;

public class TrainRunner
{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.accelerate();
        vehicle.honk();
        vehicle.applyBrakes();
        vehicle.stop();

        System.out.println("----------------------------------");
        Train train = new Vehicle();
        train.start();
        train.accelerate();
        train.honk();
        train.applyBrakes();
        train.stop();
    }
}
