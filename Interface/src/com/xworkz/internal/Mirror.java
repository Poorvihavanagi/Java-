package com.xworkz.internal;

public interface Mirror {
    void reflect();
    void clean();
    void hangOnWall();
    default void polish() {
        System.out.println("Polishing the mirror to enhance reflection.");
    }
}
