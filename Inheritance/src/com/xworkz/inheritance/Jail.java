package com.xworkz.inheritance;

// Subclass: Jail extends Prison
public class Jail extends Prison {
    public void lockUp() {
        super.lockUp();
        System.out.println("Jail is locking up short-term prisoners.");
    }
    public void release() {
        super.release();
        System.out.println("Jail is releasing inmates on bail.");
    }
    public void monitor() {
        super.monitor();
        System.out.println("Jail officers are monitoring cell activities.");
    }
    public void enforceRules() {
        super.enforceRules();
        System.out.println("Jail enforces strict rules for discipline.");
    }
    public void conductInspection() {
        super.conductInspection();
        System.out.println("Jail authorities are conducting a security check.");
    }
}
