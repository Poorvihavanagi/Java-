package com.xworkz.internal;

public interface Cushion {
    void place();
    void fluff();
    void clean();

    default void refresh() {
        System.out.println("Refreshing the cushion.");
    }

    default void store() {
        System.out.println("Storing the cushion safely.");
    }
}
