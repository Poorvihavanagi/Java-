package com.xworkz.toString.runner;
import com.xworkz.toString.internal.VacuumCleaner;

public class VacuumCleanerRunner {
    public static void main(String[] args) {
        VacuumCleaner vacuum = new VacuumCleaner("Dyson", 1400, "Cordless");
        System.out.println(vacuum);

        int hash = vacuum.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(vacuum));

        VacuumCleaner vacuum1 = new VacuumCleaner("Dyson", 1400, "Cordless");
        VacuumCleaner vacuum2 = new VacuumCleaner("Dyson", 1500, "Cordless");

        System.out.println("Checking same location: " + (vacuum1 == vacuum2));
        boolean same = vacuum1.equals(vacuum2);
        System.out.println("Vacuum1 is same as Vacuum2: " + same);

    }
}