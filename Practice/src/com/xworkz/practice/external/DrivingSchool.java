package com.xworkz.practice.external;

import com.xworkz.practice.internal.TransportDept;

public class DrivingSchool {
    private TransportDept transportDept;

    public DrivingSchool(TransportDept transportDept){
        this.transportDept=transportDept;
        System.out.println("Parameterized const driving school");
    }
    public void issueLearnerLicense(){
        if(this.transportDept!=null){
            System.out.println("transport dept is not null");
            this.transportDept.testDriver();
        }
        else{
            System.out.println("It is null");
        }
    }
}
