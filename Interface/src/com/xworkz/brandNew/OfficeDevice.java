package com.xworkz.brandNew;

import com.xworkz.internal.Printer;
import com.xworkz.internal.Computer;

public class OfficeDevice implements Printer, Computer {

    @Override
    public void print() {
        System.out.println("Printing the document.");
    }

    @Override
    public void scan() {
        System.out.println("Scanning the document.");
    }

    @Override
    public void cancelJob() {
        System.out.println("Cancelling the print job.");
    }

    @Override
    public void boot() {
        System.out.println("Booting up the computer.");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down the computer.");
    }

    @Override
    public void runProgram() {
        System.out.println("Running the program on the computer.");
    }
}
