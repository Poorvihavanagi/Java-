package com.xworkz.internal;

public interface Animal {
    void sound();
    void eat();
    void sleep();

    default void walk() {
        System.out.println("The animal is walking.");
    }

    default void run() {
        System.out.println("The animal is running.");
    }
}
