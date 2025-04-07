package com.xworkz.inheritance;

public class Teacher extends Profession {
    @Override
    public void work() {
        super.work();
        System.out.println("Running work in teacher...");
    }

    @Override
    public void getSalary() {
        super.getSalary();
        System.out.println("Running get Salary in teacher...");
    }

    @Override
    public void followRules() {
        super.followRules();
        System.out.println("Running follow Rules in teacher...");
    }

    @Override
    public void gainExperience() {
        super.gainExperience();
        System.out.println("Running gain Experience in teacher...");
    }

    @Override
    public void communicate() {
        super.communicate();
        System.out.println("Running communicate in teacher...");
    }
    public void teachSubject() {
        System.out.println("Running teach subjects in teacher");
    }
}
