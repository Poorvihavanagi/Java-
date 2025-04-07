package com.xworkz.inheritance;

public class Student extends Person {

    @Override
    public void eat() {
        super.eat();
        System.out.println("Running eat in student");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Running sleep in student");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Running walk in student");
    }

    @Override
    public void talk() {
        super.talk();
        System.out.println("Running talk in student");
    }

    @Override
    public void think() {
        super.think();
        System.out.println("Running think in student");
    }

    public void attendClass(){
        System.out.println("Running attend class in student");
    }
}
