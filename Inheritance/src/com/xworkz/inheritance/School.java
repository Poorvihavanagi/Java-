package com.xworkz.inheritance;

public class School extends Institution {

    @Override
    public void enrollStudents() {
        super.enrollStudents();
        System.out.println("Running enroll students in school");
    }

    @Override
    public void conductClasses() {
        super.conductClasses();
        System.out.println("Running conduct classes in school");
    }

    @Override
    public void organizeEvents() {
        super.organizeEvents();
        System.out.println("Running organize events in school");
    }

    @Override
    public void manageStaff() {
        super.manageStaff();
        System.out.println("Running manage staff in school");
    }

    @Override
    public void maintainDiscipline() {
        super.maintainDiscipline();
        System.out.println("Running maintain discipline in school");
    }
}
