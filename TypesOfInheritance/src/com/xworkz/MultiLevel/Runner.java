package com.xworkz.MultiLevel;

import com.xworkz.SingleLevel.Home;

public class Runner {
    public static void main(String[] args) {

        Laptop laptop=new Laptop();
        laptop.powerOn();
        laptop.compute();
        laptop.carry();

        System.out.println("----------------------------------------------");

        MangoTree mangoTree=new MangoTree();
        mangoTree.grow();
        mangoTree.shedLeaves();
        mangoTree.bearFruit();

        System.out.println("----------------------------------------------");

        ScienceTextbook scienceTextbook=new ScienceTextbook();
        scienceTextbook.read();
        scienceTextbook.subject();
        scienceTextbook.experiment();

        System.out.println("----------------------------------------------");

        SmartPhone smartPhone=new SmartPhone();
        smartPhone.power();
        smartPhone.call();
        smartPhone.browse();

        System.out.println("----------------------------------------------");
        Cheese cheese=new Cheese();
        cheese.eat();
        cheese.cool();
        cheese.melt();

        System.out.println("----------------------------------------------");
        Bus bus=new Bus();
        bus.travel();
        bus.capacity();
        bus.route();

        System.out.println("----------------------------------------------");
        MobileApp mobileApp=new MobileApp();
        mobileApp.install();
        mobileApp.launch();
        mobileApp.swipe();

        System.out.println("----------------------------------------------");
        EBook eBook=new EBook();
        eBook.open();
        eBook.compress();
        eBook.read();

        System.out.println("----------------------------------------------");
        Scissors scissors=new Scissors();
        scissors.use();
        scissors.sharpen();
        scissors.cut();

        System.out.println("----------------------------------------------");
        Java java=new Java();
        java.communicate();
        java.code();
        java.compile();

        System.out.println("----------------------------------------------");
        HomeLoan homeLoan=new HomeLoan();
        homeLoan.provideService();
        homeLoan.interestRate();
        homeLoan.EMI();
    }
}
