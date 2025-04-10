package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Keyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("QWERTY", 104, "English");
        System.out.println(keyboard);

        int hash = keyboard.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(keyboard));
    }
}
