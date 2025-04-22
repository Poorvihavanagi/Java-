package com.xworkz.practice.runner;

import com.xworkz.practice.external.DrivingSchool;
import com.xworkz.practice.internal.TransportDept;
import com.xworkz.practice.internal.TransportIndiaImpl;

public class TransportDeptRunner {
    public static void main(String[] args) {
        TransportDept transportDept=new TransportIndiaImpl();
        DrivingSchool drivingSchool=new DrivingSchool(transportDept);
        drivingSchool.issueLearnerLicense();
    }
}
