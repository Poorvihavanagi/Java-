package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Stapler;

public class StaplerRunner {
    public static void main(String[] args) {
        Stapler stapler = new Stapler("Kangaro", "Medium", 100);
        System.out.println(stapler);

        int hash = stapler.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(stapler));
    }
}