package com.xworkz.toString.runner;
import com.xworkz.toString.internal.VacuumCleaner;

public class VacuumCleanerRunner {
    public static void main(String[] args) {
        VacuumCleaner vacuum = new VacuumCleaner("Dyson", 1400, "Cordless");
        System.out.println(vacuum);
    }
}