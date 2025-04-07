package com.xworkz.isaRelation;

import com.xworkz.inheritance.Doctor;
import com.xworkz.inheritance.Person;
import com.xworkz.inheritance.Student;

import javax.print.Doc;

public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student();
        student.eat();
        student.sleep();
        student.walk();
        student.talk();
        student.think();

        System.out.println("---------------------------------------");
        Person person = new Student();
        person.eat();
        person.sleep();
        person.walk();
        person.talk();
        person.think();

        System.out.println("---------------------------------------");
        Doctor doctor=new Doctor();
        doctor.prescribeMedicine(doctor);
    }
}
