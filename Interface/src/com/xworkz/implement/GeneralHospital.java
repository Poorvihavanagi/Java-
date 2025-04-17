package com.xworkz.implement;

import com.xworkz.internal.Hospital;

public class GeneralHospital implements Hospital {
    public void admitPatient() {
        System.out.println("Admitting patient to the hospital.");
    }

    public void dischargePatient() {
        System.out.println("Discharging patient from the hospital.");
    }

    public void treatPatient() {
        System.out.println("Treating the patient in the hospital.");
    }
    @Override
    public void provideEmergencyCare() {
        System.out.println("Providing emergency care at the City Hospital.");
    }
}
