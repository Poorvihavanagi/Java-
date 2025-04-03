package com.xworkz.inheritance;

public class Student extends Person {

    public void eat() {
        super.eat();
        System.out.println("Student is eating in the cafeteria...");
    }

    public void sleep() {
        super.sleep();
        System.out.println("Student is sleeping after studying...");
    }

    public void walk() {
        super.walk();
        System.out.println("Student is walking to class...");
    }

    public void talk() {
        super.talk();
        System.out.println("Student is discussing homework...");
    }

    public void think() {
        super.think();
        System.out.println("Student is thinking about exams...");
    }

}
