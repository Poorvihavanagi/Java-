package com.xworkz.internal;

public interface Tissue {
    void use();
    void dispose();
    void store();

    default void pack() {
        System.out.println("Packing the tissue in a wrapper.");
    }

    default void recycle() {
        System.out.println("Recycling the used tissue.");
    }
}
