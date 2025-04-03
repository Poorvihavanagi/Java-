package com.xworkz.isaRelation;

import com.xworkz.inheritance.Jail;
import com.xworkz.inheritance.Prison;

public class PrisonRunner {
    public static void main(String[] args) {

        Jail jail = new Jail();
        jail.lockUp();
        jail.release();
        jail.monitor();
        jail.enforceRules();
        jail.conductInspection();

        System.out.println("-----------------------------------------------------");
        Prison prison = new Jail();
        prison.lockUp();
        prison.release();
        prison.monitor();
        prison.enforceRules();
        prison.conductInspection();
    }
}
