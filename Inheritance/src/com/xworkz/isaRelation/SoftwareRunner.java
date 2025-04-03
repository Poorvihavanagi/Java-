package com.xworkz.isaRelation;

import com.xworkz.inheritance.Software;
import com.xworkz.inheritance.Technology;

public class SoftwareRunner {
    public static void main(String[] args) {

        Software software = new Software();
        software.develop();
        software.upgrade();
        software.implement();
        software.support();
        software.secure();
        System.out.println("-----------------------------------------------------------");
        Technology technology = new Software();
        technology.develop();
        technology.upgrade();
        technology.implement();
        technology.support();
        technology.secure();
    }
}
