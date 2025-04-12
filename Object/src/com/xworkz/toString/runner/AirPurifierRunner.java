package com.xworkz.toString.runner;
import com.xworkz.toString.internal.AirConditioner;
import com.xworkz.toString.internal.Airpurifier;

public class AirPurifierRunner {
    public static void main(String[] args) {
        Airpurifier purifier = new Airpurifier("Philips", "HEPA", 500);
        System.out.println(purifier);

        int code=purifier.hashCode();
        System.out.println("Code: " +code);

        System.out.println(new Airpurifier("Philips", "HEPA", 500).hashCode());

        Airpurifier airpurifier1=new Airpurifier("Philips", "HEPA", 550);


        Airpurifier airpurifier2=new Airpurifier("Honeywell", "UV", 600);


        System.out.println("Checking same location: " +(airpurifier1==airpurifier2));
        Boolean same=airpurifier2.equals(airpurifier1);
        System.out.println("Air purifier1 is same as Air purifier2: " +same);
    }
}