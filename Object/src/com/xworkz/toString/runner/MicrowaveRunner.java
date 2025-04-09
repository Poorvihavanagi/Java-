package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Micorwave;

public class MicrowaveRunner {
    public static void main(String[] args) {
        Micorwave microwave = new Micorwave("Samsung", 28, true);
        System.out.println(microwave);
    }
}