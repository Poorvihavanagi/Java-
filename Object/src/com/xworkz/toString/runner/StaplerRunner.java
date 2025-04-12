package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Stapler;

public class StaplerRunner {
    public static void main(String[] args) {
        Stapler stapler = new Stapler("Kangaro", "Medium", 100);
        System.out.println(stapler);

        int hash = stapler.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(stapler));

        Stapler stapler1 = new Stapler("Kangaro", "Medium", 100);
        Stapler stapler2 = new Stapler("Kangaro", "Medium", 100);
        System.out.println("Checking same location: " + (stapler1 == stapler2));
        boolean same = stapler1.equals(stapler2);
        System.out.println("Stapler1 is same as Stapler2: " + same);
    }
}