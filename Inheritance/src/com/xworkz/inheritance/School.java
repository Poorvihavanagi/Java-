// Subclass: School
package com.xworkz.inheritance;

public class School extends Institution {

    public void enrollStudents() {
        super.enrollStudents();
        System.out.println("Enrolling students in primary and secondary education...");
    }


    public void conductClasses() {
        super.conductClasses();
        System.out.println("Conducting subjects like Math, Science, and English...");
    }
    public void organizeEvents() {
        super.organizeEvents();
        System.out.println("Organizing school annual day and sports events...");
    }
    public void manageStaff() {
        super.manageStaff();
        System.out.println("Managing school teachers and administration...");
    }
    public void maintainDiscipline() {
        super.maintainDiscipline();
        System.out.println("Ensuring students follow school rules and ethics...");
    }
}
