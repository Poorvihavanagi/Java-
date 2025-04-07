package com.xworkz.inheritance;

public class Doctor extends Person{
    public void attendClass(){
        System.out.println("student attend class");
    }

    public void prescribeMedicine(Person person) {
        person.eat();
        person.sleep();
        person.walk();
        person.talk();
        person.think();
        if(person instanceof Doctor){
            System.out.println("Person is an instance of doctor");
            Doctor doctor=(Doctor) person;
            doctor.attendClass();

        }
    }
}
