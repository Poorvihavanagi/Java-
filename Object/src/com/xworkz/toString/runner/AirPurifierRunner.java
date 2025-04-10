package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Airpurifier;

public class AirPurifierRunner {
    public static void main(String[] args) {
        Airpurifier purifier = new Airpurifier("Philips", "HEPA", 500);
        System.out.println(purifier);

        int code=purifier.hashCode();
        System.out.println("Code: " +code);

        System.out.println(new Airpurifier("Philips", "HEPA", 500).hashCode());
    }
}