package com.xworkz.runner;

import com.xworkz.implement.Laptop;
import com.xworkz.internal.Computer;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer=new Laptop();
        computer.boot();
        computer.runProgram();
        computer.shutDown();
        computer.restart();
        computer.displayInfo();
    }
}
