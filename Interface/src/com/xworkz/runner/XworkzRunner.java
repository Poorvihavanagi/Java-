package com.xworkz.runner;

import com.xworkz.internal.Xworkz;
import com.xworkz.implement.JavaInstitute;

public class XworkzRunner {
    public static void main(String[] args) {
        Xworkz xworkz = new JavaInstitute();
        xworkz.conductTraining();
        xworkz.providePlacement();
        xworkz.buildCareers();

        xworkz.giveCertificates();
    }
}
