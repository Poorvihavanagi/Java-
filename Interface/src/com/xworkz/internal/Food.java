package com.xworkz.internal;

public interface Food {
    void prepare();
    void serve();
    void consume();

    default void store() {
        System.out.println("Storing the food properly.");
    }
}
