package com.xworkz.inheritance;

public class Jail extends Prison {

    @Override
    public void lockUp() {
        super.lockUp();
        System.out.println("Running lockUp in jail");
    }

    @Override
    public void release() {
        super.release();
        System.out.println("Running release in jail");
    }

    @Override
    public void monitor() {
        super.monitor();
        System.out.println("Running monitor in jail");
    }

    @Override
    public void enforceRules() {
        super.enforceRules();
        System.out.println("Running enforceRules in jail");
    }

    @Override
    public void conductInspection() {
        super.conductInspection();
        System.out.println("Running conductInspection in jail");
    }
}
