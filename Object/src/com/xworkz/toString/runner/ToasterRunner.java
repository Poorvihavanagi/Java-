package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Toaster;

public class ToasterRunner {
    public static void main(String[] args) {
        Toaster toaster = new Toaster("Prestige", 2, "White");
        System.out.println(toaster);

        int hash = toaster.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(toaster));
    }
}