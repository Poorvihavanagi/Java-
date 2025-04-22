package com.xworkz.practice.external;

import com.xworkz.practice.internal.InputDevice;

public class Keyboard {
    private InputDevice inputDevice;

    public Keyboard(InputDevice inputDevice){
        this.inputDevice=inputDevice;
        System.out.println("keyboard in Input device");
    }
    public void type(){
        if(this.inputDevice!=null){
            System.out.println("Input device is not null");
            this.inputDevice.typeKeys();
        }
        else{
            System.out.println("It is null");
        }
    }
}
