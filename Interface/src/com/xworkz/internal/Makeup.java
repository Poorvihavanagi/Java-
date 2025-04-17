package com.xworkz.internal;

public interface Makeup {
    void apply();
    void remove();
    void store();
    default void setExpirationDate() {
        System.out.println("Setting expiration date for the makeup product.");
    }
}
