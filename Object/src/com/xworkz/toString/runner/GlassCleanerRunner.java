package com.xworkz.toString.runner;
import com.xworkz.toString.internal.GlassCleaner;

public class GlassCleanerRunner {
    public static void main(String[] args) {
        GlassCleaner cleaner = new GlassCleaner("Colin", 500, "Mint");
        System.out.println(cleaner);

        int hash = cleaner.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(cleaner));
    }
}