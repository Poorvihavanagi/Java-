package com.xworkz.runner;

import com.xworkz.internal.Hospital;
import com.xworkz.implement.GeneralHospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new GeneralHospital();
        hospital.admitPatient();
        hospital.dischargePatient();
        hospital.treatPatient();
        hospital.provideEmergencyCare();
    }
}
