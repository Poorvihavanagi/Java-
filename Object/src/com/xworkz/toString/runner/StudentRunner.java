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
    }
}
