package com.xworkz.isaRelation;

import com.xworkz.inheritance.Bus;
import com.xworkz.inheritance.Metro;
import com.xworkz.inheritance.Transportation;

public class MetroRunner
{
    public static void main(String[] args) {
        Metro metro = new Metro();
        metro.move();
        metro.stop();
        metro.fuel();
        metro.capacity();
        metro.speed();

        System.out.println("----------------------------------------------------------------");
        Transportation transportation = new Metro();
        transportation.move();
        transportation.stop();
        transportation.fuel();
        transportation.capacity();
        transportation.speed();

        System.out.println("----------------------------------------------------------------");
        Bus bus=new Bus();
        bus.boardPassengers(bus);
    }
}
