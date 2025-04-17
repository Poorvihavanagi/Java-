package com.xworkz.internal;

public interface Bed {
    void makeBed();
    void sleep();
    void cleanBed();

    default void adjustHeadrest() {
        System.out.println("Adjusting the headrest of the bed.");
    }

    default void setBedsideLamp() {
        System.out.println("Setting the bedside lamp on.");
    }
}
