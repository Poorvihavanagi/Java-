package com.xworkz.inheritance;

public class Teacher extends Profession {
    @Override
    public void work() {
        super.work();
        System.out.println("Teaching students in a school or college...");
    }

    public void getSalary() {
        super.getSalary();
        System.out.println("Receiving salary as a teacher...");
    }
    public void followRules() {
        super.followRules();
        System.out.println("Following school rules and education policies...");
    }
    public void gainExperience() {
        super.gainExperience();
        System.out.println("Gaining experience in teaching over the years...");
    }
    public void communicate() {
        super.communicate();
        System.out.println("Communicating with students, parents, and staff...");
    }
}
