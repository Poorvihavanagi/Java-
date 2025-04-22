package com.xworkz.practice.runner;

import com.xworkz.practice.external.Airline;
import com.xworkz.practice.internal.AviationAuthority;
import com.xworkz.practice.internal.DGCAImpl;

public class AviationAuthorityRunner {
    public static void main(String[] args) {
        AviationAuthority aviationAuthority=new DGCAImpl();
        Airline airline=new Airline(aviationAuthority);
        airline.approveFlightPlan();
    }
}
