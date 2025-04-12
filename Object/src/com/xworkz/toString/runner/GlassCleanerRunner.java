package com.xworkz.toString.runner;
import com.xworkz.toString.internal.GlassCleaner;

public class GlassCleanerRunner {
    public static void main(String[] args) {
        GlassCleaner cleaner = new GlassCleaner("Colin", 500, "Mint");
        System.out.println(cleaner);

        int hash = cleaner.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(cleaner));

        GlassCleaner cleaner1 = new GlassCleaner("Colin", 500, "Mint");
        GlassCleaner cleaner2 = new GlassCleaner("Colin", 750, "Lemon");

        System.out.println("Checking same location: " + (cleaner1 == cleaner2));
        boolean same = cleaner1.equals(cleaner2);
        System.out.println("Cleaner1 is same as Cleaner2: " + same);
    }
}