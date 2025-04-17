package com.xworkz.internal;

public interface Mug {
    void fill();
    void drink();
    void clean();

    default void heat() {
        System.out.println("Heating the liquid in the mug.");
    }

    default void cool() {
        System.out.println("Cooling the liquid in the mug.");
    }
}
