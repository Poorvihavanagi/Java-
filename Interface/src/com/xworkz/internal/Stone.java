package com.xworkz.internal;

public interface Stone {
    void breakDown();
    void polish();
    void useInConstruction();

    default void maintain() {
        System.out.println("Maintaining the stone to keep its quality.");
    }

    default void recycle() {
        System.out.println("Recycling the stone for reuse.");
    }
}
