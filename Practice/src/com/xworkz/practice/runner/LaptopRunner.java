package com.xworkz.practice.runner;

import com.xworkz.practice.external.OperatingSystem;
import com.xworkz.practice.internal.Laptop;
import com.xworkz.practice.internal.LaptopImpl;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop=new LaptopImpl();
        OperatingSystem operatingSystem=new OperatingSystem(laptop);
        operatingSystem.boot();
    }
}
