package com.xworkz.practice.runner;

import com.xworkz.practice.external.Keyboard;
import com.xworkz.practice.internal.InputDevice;
import com.xworkz.practice.internal.LogitechKeyboardImpl;

public class InputDeviceRunner {
    public static void main(String[] args) {
        InputDevice inputDevice=new LogitechKeyboardImpl();
        Keyboard keyboard=new Keyboard(inputDevice);
        keyboard.type();
    }
}
