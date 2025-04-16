package com.xworkz.runner;

import com.xworkz.implement.MechanicalKeyboard;
import com.xworkz.internal.Keyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard=new MechanicalKeyboard();
        keyboard.type();
        keyboard.connect();
        keyboard.disconnect();
    }
}
