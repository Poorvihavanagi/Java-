package com.xworkz.SingleLevel;

public class Runner
{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.bark();

        System.out.println("------------------------------------");

        ReclinerSofa reclinerSofa=new ReclinerSofa();
        reclinerSofa.sit();
        reclinerSofa.recline();

        System.out.println("------------------------------------");

        Student student=new Student();
        student.walk();
        student.study();

        System.out.println("------------------------------------");

        Bike bike=new Bike();
        bike.start();
        bike.ride();

        System.out.println("------------------------------------");

        Manager manager=new Manager();
        manager.work();
        manager.manage();

        System.out.println("------------------------------------");

        WashingMachine washingMachine=new WashingMachine();
        washingMachine.powerOn();
        washingMachine.wash();

        System.out.println("------------------------------------");

        Triangle triangle=new Triangle();
        triangle.display();
        triangle.area();

        System.out.println("------------------------------------");

        Novel novel=new Novel();
        novel.read();
        novel.genre();

        System.out.println("------------------------------------");

        SavingsAccount savingsAccount=new SavingsAccount();
        savingsAccount.open();
        savingsAccount.deposit();

        System.out.println("------------------------------------");

        Cricket cricket=new Cricket();
        cricket.play();
        cricket.bowl();

        System.out.println("------------------------------------");

        Home home=new Home();
        home.construct();
        home.live();
    }
}
