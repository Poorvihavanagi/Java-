package com.xworkz.implement;

import com.xworkz.internal.Keyboard;

public class MechanicalKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing on keyboard.");
    }

    public void connect() {
        System.out.println("Keyboard connected.");
    }

    public void disconnect() {
        System.out.println("Keyboard disconnected.");
    }
}
