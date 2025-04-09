package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Keyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("QWERTY", 104, "English");
        System.out.println(keyboard);
    }
}
