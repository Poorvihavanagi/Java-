package com.xworkz.internal;

public interface Hospital {
    void admitPatient();
    void dischargePatient();
    void treatPatient();
    default void provideEmergencyCare() {
        System.out.println("Providing emergency care to the patient.");
    }
}
