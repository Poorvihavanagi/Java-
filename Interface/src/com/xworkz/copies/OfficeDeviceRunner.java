package com.xworkz.copies;

import com.xworkz.internal.Printer;
import com.xworkz.internal.Computer;
import com.xworkz.brandNew.OfficeDevice;

public class OfficeDeviceRunner {
    public static void main(String[] args) {
        Printer printer = new OfficeDevice();
        printer.print();
        printer.scan();
        printer.cancelJob();

        System.out.println("------------------------------");

        Computer computer = new OfficeDevice();
        computer.boot();
        computer.shutDown();
        computer.runProgram();
    }
}
