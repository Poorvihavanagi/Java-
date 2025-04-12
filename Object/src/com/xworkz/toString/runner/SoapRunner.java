package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Soap;

public class SoapRunner {
    public static void main(String[] args) {
        Soap soap = new Soap("Lux", "Rose", 125);
        System.out.println(soap);

        int hash = soap.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(soap));

        Soap soap1 = new Soap("Lux", "Rose", 125);
        Soap soap2 = new Soap("Lux", "Rose", 125);
        System.out.println("Checking same location: " + (soap1 == soap2));
        boolean same = soap1.equals(soap2);
        System.out.println("Soap1 is same as Soap2: " + same);
    }
}