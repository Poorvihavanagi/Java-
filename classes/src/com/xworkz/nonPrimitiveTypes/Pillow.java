package com.xworkz.nonPrimitiveTypes;

public class Pillow
{
    void support(Sleeper sleeper)
    {
        if (sleeper != null) {
            sleeper.sleep();
        } else {
            System.out.println("Sleeper is null");
        }
    }
}
