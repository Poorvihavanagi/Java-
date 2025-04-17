package com.xworkz.internal;

public interface Airplane {
    void takeOff();
    void fly();
    void land();

    default void startEngines() {
        System.out.println("Running start engine in interface");
    }

    default void shutdownEngines() {
        System.out.println("Running shut down engine in interface");
    }
}
