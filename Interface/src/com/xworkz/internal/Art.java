package com.xworkz.internal;

public interface Art {
    void create();
    void describeStyle();
    void display();

    default void frame() {
        System.out.println("The art is being framed.");
    }

    default void preserve() {
        System.out.println("The art is being preserved.");
    }
}
