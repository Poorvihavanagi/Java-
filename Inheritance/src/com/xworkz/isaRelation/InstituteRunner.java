package com.xworkz.isaRelation;

import com.xworkz.inheritance.Institution;
import com.xworkz.inheritance.School;

public class InstituteRunner
{
    public static void main(String[] args) {

        School school = new School();
        school.enrollStudents();
        school.conductClasses();
        school.organizeEvents();
        school.manageStaff();
        school.maintainDiscipline();

        System.out.println("------------------------------------------------------");
        Institution institution = new School();
        institution.enrollStudents();
        institution.conductClasses();
        institution.organizeEvents();
        institution.manageStaff();
        institution.maintainDiscipline();
    }
}
