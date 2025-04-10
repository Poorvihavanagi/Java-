package com.xworkz.toString.runner;

import com.xworkz.toString.internal.House;

public class HouseRunner {
    public static void main(String[] args) {
        House house = new House("Bangalore", 2, 7500000.0);
        System.out.println(house);

        int hash = house.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(house));
    }
}
