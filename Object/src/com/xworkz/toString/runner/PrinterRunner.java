package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer = new Printer("HP", "Laser", 20);
        System.out.println(printer);
    }
}