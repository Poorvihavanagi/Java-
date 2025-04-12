package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Student;

public class StudentRunner
{
    public static void main(String[] args) {

        Student student=new Student("Poorvi",21,"JAVA");
        System.out.println(student);

        int hash = student.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(student));

        Student student1 = new Student("Poorvi", 21, "JAVA");
        Student student2 = new Student("Poorvi", 21, "JAVA");

        System.out.println("Checking same location: " + (student1 == student2));
        boolean same = student1.equals(student2);
        System.out.println("Student1 is same as Student2: " + same);
    }
}
