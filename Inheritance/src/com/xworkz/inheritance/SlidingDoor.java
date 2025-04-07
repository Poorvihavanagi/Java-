package com.xworkz.inheritance;

public class SlidingDoor extends Door{
    public void polish() {
        System.out.println("Running polish in wooden door");
    }
    public void slideOpen(Door door){
        door.open();
        door.checkMaterial();
        door.close();
        door.lock();
        door.unlock();

        if(door instanceof SlidingDoor){
            System.out.println("Door is an instance of sliding door");
            SlidingDoor slidingDoor=(SlidingDoor) door;
            slidingDoor.polish();
        }
    }
}
