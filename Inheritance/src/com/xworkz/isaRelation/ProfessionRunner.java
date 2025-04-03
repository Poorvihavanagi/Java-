package com.xworkz.isaRelation;

import com.xworkz.inheritance.Profession;
import com.xworkz.inheritance.Teacher;
public class ProfessionRunner
{
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.work();
        teacher.getSalary();
        teacher.followRules();
        teacher.gainExperience();
        teacher.communicate();

        System.out.println("--------------------------------------------");
        Profession profession = new Teacher();
        profession.work();
        profession.getSalary();
        profession.followRules();
        profession.gainExperience();
        profession.communicate();
    }
}
