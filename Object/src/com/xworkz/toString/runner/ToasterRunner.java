package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Toaster;

public class ToasterRunner {
    public static void main(String[] args) {
        Toaster toaster = new Toaster("Prestige", 2, "White");
        System.out.println(toaster);

        int hash = toaster.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(toaster));

        Toaster toaster1 = new Toaster("Prestige", 2, "White");
        Toaster toaster2 = new Toaster("Prestige", 2, "White");

        System.out.println("Checking same location: " + (toaster1 == toaster2));
        boolean same = toaster1.equals(toaster2);
        System.out.println("Toaster1 is same as Toaster2: " + same);
    }
}