package com.xworkz.implement;

import com.xworkz.internal.Computer;

public class Laptop implements Computer {
    @Override
    public void boot() {
        System.out.println("Laptop is booting.");
    }
    @Override
    public void shutDown() {
        System.out.println("Laptop is shutting down.");
    }
    @Override
    public void runProgram() {
        System.out.println("Running a program on laptop.");
    }
}
