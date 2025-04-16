package com.xworkz.runner;

import com.xworkz.internal.Airplane;
import com.xworkz.implement.CommercialAirplane;

public class AirplaneRunner {
    public static void main(String[] args) {
        Airplane airplane = new CommercialAirplane();
        airplane.takeOff();
        airplane.fly();
        airplane.land();
    }
}
