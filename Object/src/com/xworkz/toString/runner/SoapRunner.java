package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Soap;

public class SoapRunner {
    public static void main(String[] args) {
        Soap soap = new Soap("Lux", "Rose", 125);
        System.out.println(soap);

        int hash = soap.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(soap));
    }
}