package com.xworkz.runner;

import com.xworkz.internal.Door;
import com.xworkz.implement.WoodenDoor;

public class DoorRunner {
    public static void main(String[] args) {
        Door door = new WoodenDoor();
        door.open();
        door.close();
        door.lock();
    }
}
