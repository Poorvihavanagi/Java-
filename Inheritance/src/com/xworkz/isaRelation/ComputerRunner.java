package com.xworkz.isaRelation;

import com.xworkz.inheritance.Computer;
import com.xworkz.inheritance.Laptop;

public class ComputerRunner {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.process();
        laptop.storeData();
        laptop.connectToInternet();
        laptop.displayOutput();
        laptop.runSoftware();

        System.out.println("------------------------------------------------------");
        Computer computer = new Laptop();
        computer.process();
        computer.storeData();
        computer.connectToInternet();
        computer.displayOutput();
        computer.runSoftware();
    }
}
