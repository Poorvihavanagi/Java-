package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Projector;

public class ProjectorRunner {
    public static void main(String[] args) {
        Projector projector = new Projector("Epson", 3000, "1080p");
        System.out.println(projector);

        int hash = projector.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(projector));

        Projector projector1 = new Projector("BenQ", 4000, "4K");
        Projector projector2 = new Projector("BenQ", 4000, "4K");

        System.out.println("Checking same location: " + (projector1 == projector2));
        boolean same = projector1.equals(projector2);
        System.out.println("Projector1 is same as Projector2: " + same);
    }
}
