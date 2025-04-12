package com.xworkz.toString.runner;

import com.xworkz.toString.internal.House;

public class HouseRunner {
    public static void main(String[] args) {
        House house = new House("Bangalore", 2, 7500000.0);
        System.out.println(house);

        int hash = house.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(house));

        House house1 = new House("Bangalore", 2, 7500000.0);
        House house2 = new House("Mumbai", 3, 10000000.0);

        System.out.println("Checking same location: " + (house1 == house2));
        boolean same = house1.equals(house2);
        System.out.println("House1 is same as House2: " + same);
    }
}
