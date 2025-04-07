package com.xworkz.inheritance;

public class Engineer extends Profession{
    public void teachSubject() {
        System.out.println("Teaching subject to students");
    }
    public void developSolution(Profession profession) {
        profession.communicate();
        profession.followRules();
        profession.work();
        profession.getSalary();
        profession.gainExperience();

        if(profession instanceof Engineer){
            System.out.println("Profession is instance of engineer");
            Engineer engineer=(Engineer) profession;
            engineer.teachSubject();
        }
    }
}
