package com.xworkz.implement;

import com.xworkz.internal.Printer;

public class HPPrinter implements Printer {
    public void print() {
        System.out.println("Printing document.");
    }

    public void scan() {
        System.out.println("Scanning document.");
    }

    public void cancelJob() {
        System.out.println("Print job cancelled.");
    }
}
