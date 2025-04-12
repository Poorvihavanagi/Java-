package com.xworkz.toString.runner;

import com.xworkz.toString.internal.TableLamp;

public class TableLampRunner {
    public static void main(String[] args) {
        TableLamp lamp = new TableLamp("LED", 3, "Warm White");
        System.out.println(lamp);

        int hash = lamp.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(lamp));

        TableLamp lamp1 = new TableLamp("LED", 3, "Warm White");
        TableLamp lamp2 = new TableLamp("LED", 3, "Warm White");

        System.out.println("Checking same location: " + (lamp1 == lamp2));
        boolean same = lamp1.equals(lamp2);
        System.out.println("Lamp1 is same as Lamp2: " + same);
    }
}
