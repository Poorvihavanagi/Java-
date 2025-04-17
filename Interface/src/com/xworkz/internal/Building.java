package com.xworkz.internal;

public interface Building {
    void construct();
    void demolish();
    void maintain();
    default void clean() {
        System.out.println("Running clean in building interface");
    }

    default void secure() {
        System.out.println("Running secure in building interface");
    }
}
