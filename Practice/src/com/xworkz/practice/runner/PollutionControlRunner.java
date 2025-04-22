package com.xworkz.practice.runner;

import com.xworkz.practice.external.Factory;
import com.xworkz.practice.internal.CentralPollutionControlImpl;
import com.xworkz.practice.internal.PollutionControl;

public class PollutionControlRunner {
    public static void main(String[] args) {
        PollutionControl pollutionControl=new CentralPollutionControlImpl();
        Factory factory=new Factory(pollutionControl);
        factory.reportViolations();
    }
}
