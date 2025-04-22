package com.xworkz.practice.runner;

import com.xworkz.practice.external.Government;
import com.xworkz.practice.internal.CitizenConstitutionImpl;
import com.xworkz.practice.internal.Constitution;

public class ConstitutionRunner {
    public static void main(String[] args) {
        Constitution constitution=new CitizenConstitutionImpl();
        Government government=new Government(constitution);
        government.conductElections();
    }
}
