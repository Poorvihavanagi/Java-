package com.xworkz.runner;

import com.xworkz.implement.HPPrinter;
import com.xworkz.internal.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer=new HPPrinter();
        printer.print();
        printer.scan();
        printer.cancelJob();
    }
}
