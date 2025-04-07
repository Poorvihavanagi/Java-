package com.xworkz.isaRelation;

import com.xworkz.inheritance.SlidingDoor;
import com.xworkz.inheritance.WoodenDoor;
import com.xworkz.inheritance.Door;

public class DoorRunner
{
    public static void main(String[] args) {
        WoodenDoor woodenDoor = new WoodenDoor();
        woodenDoor.open();
        woodenDoor.close();
        woodenDoor.lock();
        woodenDoor.unlock();
        woodenDoor.checkMaterial();

        System.out.println("----------------------------------------------------------");
        Door door = new WoodenDoor();
        door.open();
        door.close();
        door.lock();
        door.unlock();
        door.checkMaterial();

        System.out.println("----------------------------------------------------------");
        SlidingDoor slidingDoor=new SlidingDoor();
        slidingDoor.slideOpen(slidingDoor);
    }
}
