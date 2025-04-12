package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Kettle;

public class KettleRunner {
    public static void main(String[] args) {
        Kettle kettle = new Kettle(1.5, "Prestige", "Stainless Steel");
        System.out.println(kettle);

        int hash = kettle.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(kettle));

        Kettle kettle1 = new Kettle(1.5, "Prestige", "Stainless Steel");
        Kettle kettle2 = new Kettle(2.0, "Bajaj", "Plastic");

        System.out.println("Checking same location: " + (kettle1 == kettle2));
        boolean same = kettle1.equals(kettle2);
        System.out.println("Kettle1 is same as Kettle2: " + same);
    }
}
