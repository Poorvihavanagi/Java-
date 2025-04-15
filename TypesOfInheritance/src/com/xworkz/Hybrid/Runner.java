package com.xworkz.Hybrid;

public class Runner {
    public static void main(String[] args) {
        Car car=new Car();
        car.vehicleType();
        car.engineType();

        System.out.println("--------------------------------------------");
        Book book=new Book();
        book.displayInfo();
        book.download();

        System.out.println("--------------------------------------------");
        Department department=new Department();
        department.register();
        department.audit();

        System.out.println("--------------------------------------------");
        WindInstrument windInstrument=new WindInstrument();
        windInstrument.play();
        windInstrument.tune();

        System.out.println("--------------------------------------------");
        MotionSensor motionSensor=new MotionSensor();
        motionSensor.detect();
        motionSensor.calibrate();

        System.out.println("--------------------------------------------");
        DigitalCurrency digitalCurrency=new DigitalCurrency();
        digitalCurrency.exchange();
        digitalCurrency.convert();

        System.out.println("--------------------------------------------");
        Painting painting=new Painting();
        painting.display();
        painting.frame();

        System.out.println("--------------------------------------------");
        OnlineCourse onlineCourse=new OnlineCourse();
        onlineCourse.enroll();
        onlineCourse.getCertificate();

        System.out.println("--------------------------------------------");
        Mall mall=new Mall();
        mall.build();
        mall.provideAccess();

        System.out.println("--------------------------------------------");
        Frog frog=new Frog();
        frog.eat();
        frog.swim();

        System.out.println("--------------------------------------------");
        Rectangle rectangle=new Rectangle();
        rectangle.display();
        rectangle.setColor();
    }
}
