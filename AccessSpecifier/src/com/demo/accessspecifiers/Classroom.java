package com.demo.accessspecifiers;

public class Classroom
{
    Student student = new Student("Suraj", 25 , 82.5);
    public void display(){
        student.name="suraj";
        student.rollNo=25;

        student.attendClass();
        student.setMarks(85);
    }
}
