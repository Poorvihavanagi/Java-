package com.demo.accessspecifiers;

public class Student
{
    public String name;
    int rollNo;
    private double marks;

    public Student(String name, int rollNo, double marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
        System.out.println("Marks set for student: " + this.marks);
    }

    void attendClass() {
        study();
        System.out.println("Student is attending the class.");
    }

    private void study() {
        System.out.println("Student is studying in private.");
    }
}
