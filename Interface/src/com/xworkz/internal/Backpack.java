package com.xworkz.internal;

public interface Backpack
{
    void openZip();
    void storeItems();
    void carry();

    default void clean() {
        System.out.println("Cleaning the backpack.");
    }

    default void adjustStraps() {
        System.out.println("Adjusting the straps of the backpack.");
    }
}
