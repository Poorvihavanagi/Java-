package com.xworkz.nonPrimitiveTypes;

public class Camera
{
    void click(Photographer photographer) {
        if (photographer != null) {
            System.out.println("Photographer clicks");
            photographer.capture();
        } else {
            System.out.println("Photographer is null");
        }
    }
}
