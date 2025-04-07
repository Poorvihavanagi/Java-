package com.xworkz.inheritance;

public class Bus extends Transportation {
    public void openDoors() {
        System.out.println("Metro doors are closing");
    }

    public void boardPassengers(Transportation transportation) {
        transportation.capacity();
        transportation.fuel();
        transportation.move();
        transportation.stop();
        transportation.speed();

        if (transportation instanceof Bus) {
            System.out.println("transportation is an instance of bus");
            Bus bus = (Bus) transportation;
            bus.openDoors();
        }
    }
}
