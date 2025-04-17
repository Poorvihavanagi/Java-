package com.xworkz.internal;

public interface Keyboard {
    void type();
    void connect();
    void disconnect();
    default void changeLayout() {
        System.out.println("Changing the keyboard layout.");
    }
}
