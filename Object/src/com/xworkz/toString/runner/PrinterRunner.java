package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer = new Printer("HP", "Laser", 20);
        System.out.println(printer);

        int hash = printer.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(printer));

        Printer printer1 = new Printer("Canon", "Inkjet", 15);
        Printer printer2 = new Printer("Canon", "Inkjet", 15);

        System.out.println("Checking same location: " + (printer1 == printer2));
        boolean same = printer1.equals(printer2);
        System.out.println("Printer1 is same as Printer2: " + same);
    }
}