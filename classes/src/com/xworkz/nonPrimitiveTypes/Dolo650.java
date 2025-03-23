package com.xworkz.nonPrimitiveTypes;

public class Dolo650
{
    void giveTo(Patient patient)
    {
        if (patient != null) {
            System.out.println("Patient is given Dolo50");
            patient.takeMedicine();
        } else {
            System.out.println("Patient is null");
        }
    }
}
