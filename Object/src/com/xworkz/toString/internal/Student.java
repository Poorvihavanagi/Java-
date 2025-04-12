package com.xworkz.toString.internal;

public class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", course='" + course + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 9;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Student) {
                System.out.println("Ref is Student, will compare...");
                Student s1 = this;
                Student s2 = (Student) obj;
                if (s1.name.equals(s2.name) && s1.age == s2.age && s1.course.equals(s2.course)) {
                    System.out.println("Both students are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
