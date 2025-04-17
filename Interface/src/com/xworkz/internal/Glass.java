package com.xworkz.internal;

public interface Glass {
    void fill();
    void drink();
    void clean();

    default void dispose() {
        System.out.println("Disposing of the glass.");
    }
}
