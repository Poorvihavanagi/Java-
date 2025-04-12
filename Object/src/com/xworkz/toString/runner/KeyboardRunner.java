package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Keyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("QWERTY", 104, "English");
        System.out.println(keyboard);

        int hash = keyboard.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(keyboard));

        Keyboard keyboard1 = new Keyboard("QWERTY", 104, "English");
        Keyboard keyboard2 = new Keyboard("AZERTY", 108, "French");

        System.out.println("Checking same location: " + (keyboard1 == keyboard2));
        boolean same = keyboard1.equals(keyboard2);
        System.out.println("Keyboard1 is same as Keyboard2: " + same);
    }
}
